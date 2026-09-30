package im.toss.feature.credit.ui.kcbsurvey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.tmoney.LiveCheckConstants;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.base.BaseActivity;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity;
import im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$;
import im.toss.feature.credit.ui.kcbsurvey.notification.KcbSurveyNotificationTermActivity;
import im.toss.features.credit.data.response.kcbsurvey.KcbSurveySchedule;
import im.toss.features.credit.data.response.kcbsurvey.KcbSurveyScheduleResponse;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AOMPFileConstant;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_closeView;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallbackStub;
import o.IEngagementSignalsCallback_Parcel;
import o.L_;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15300;
import o.access15400;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.commonTestFlag;
import o.component5;
import o.deprecated_eventListenerFactory;
import o.findResAndMsg;
import o.getAdService;
import o.getAwbState;
import o.getBacktraceNote;
import o.getDevicePerformance;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getSubtitle;
import o.getSwitchMinWidth;
import o.getUrlokhttp;
import o.getUserData;
import o.h5ScreenShotObserverOnChangeOpt;
import o.handleNativeAdClick;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onCaptureSessionStart;
import o.onPageExit;
import o.putChannelInfo;
import o.r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE;
import o.readIntokhttp;
import o.resolveQuirkNames;
import o.rvInitOpt;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.setRubIn;
import o.stackUploadThresholdMax;
import o.toPreviewOnlyRange;
import o.transparentBackground;
import o.x2ExternalSyntheticLambda8;
import o.x3;
import o.x3a;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class KcbSurveyHistoryActivity extends Hilt_KcbSurveyHistoryActivity implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static char access000 = 0;
    private static int access100 = 0;
    public static final int asBinder;
    private static int extraCallbackWithResult = 1;
    private static char getInterfaceDescriptor = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    @Inject
    public r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE agreedToAllRequiredTermsUseCase;

    @Inject
    public getDevicePerformance kcbSurveyApi;

    @Inject
    public zzag tossClock;
    private final Lazy IAuthTabCallbackDefault = isStopUpload.onNavigationEvent(this, 1471383, (Function1) null, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda6
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.f$0, (initMiniApp.onWarmupCompleted) obj};
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object[] objArr2 = {this.f$0, (initMiniApp.onWarmupCompleted) obj};
            Unit unit = (Unit) KcbSurveyHistoryActivity.IAuthTabCallback(1992094020, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1992094015, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
    }, 2, (Object) null);
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback_Parcel(this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda7
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String strOnExtraCallbackWithResult = KcbSurveyHistoryActivity.onExtraCallbackWithResult(this.f$0);
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strOnExtraCallbackWithResult;
            }
            throw null;
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface = onPageExit.onNavigationEvent((IEngagementSignalsCallbackStub) this, (Function1<? super IEngagementSignalsCallbackDefault, Unit>) new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda8
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
                unit = (Unit) KcbSurveyHistoryActivity.IAuthTabCallback(-1225852902, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1225852906, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
                int i3 = 51 / 0;
            } else {
                Object[] objArr2 = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
                unit = (Unit) KcbSurveyHistoryActivity.IAuthTabCallback(-1225852902, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1225852906, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            }
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 68 / 0;
            }
            return unit;
        }
    });

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = KcbSurveyHistoryActivity.onExtraCallbackWithResult(KcbSurveyHistoryActivity.this, (AOMPFileConstant) null, (Integer) null, (List) null, (access13800) this);
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[AOMPFileConstant.values().length];
            try {
                iArr[AOMPFileConstant.PARTICIPABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AOMPFileConstant.NOT_PERIOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AOMPFileConstant.NOT_YET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AOMPFileConstant.ALREADY_COMPLETED.ordinal()] = 4;
                int i = onNavigationEvent + 91;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AOMPFileConstant.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AOMPFileConstant.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AOMPFileConstant.DROP_OUT.ordinal()] = 7;
                int i4 = onWarmupCompleted + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AOMPFileConstant.DENIED.ordinal()] = 8;
                int i7 = onWarmupCompleted + 63;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AOMPFileConstant.ETC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr2[onExtraCallbackWithResult.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[onExtraCallbackWithResult.CURRENT.ordinal()] = 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[onExtraCallbackWithResult.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[onExtraCallbackWithResult.NEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[onExtraCallbackWithResult.WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            IAuthTabCallback = iArr2;
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = KcbSurveyHistoryActivity.onExtraCallback(KcbSurveyHistoryActivity.this, (access13800) this);
            int i4 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        IEngagementSignalsCallbackStub();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = writeTypedObject + 61;
        readTypedObject = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.Context, im.toss.base.BaseActivity, im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        final int iIntValue;
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i5 | i2));
        int i11 = ~(i7 | i9);
        int i12 = (~i2) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i5);
        int i15 = i5 + i + i3 + ((-1261570137) * i6) + (2040842291 * i4);
        int i16 = i15 * i15;
        int i17 = ((i5 * 1408203179) - 1033136887) + (i * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (1408202841 * i3) + ((-1046847217) * i6) + ((-121732677) * i4) + (i16 * 1741225984);
        switch (((i5 * (-750812765)) - 1471086592) + ((-750812765) * i) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i3) + ((-1928462336) * i6) + (1629880320 * i4) + (2096168960 * i16) + (i17 * i17 * 838795264)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                final ?? r1 = (KcbSurveyHistoryActivity) objArr[0];
                AOMPFileConstant aOMPFileConstant = (AOMPFileConstant) objArr[1];
                Integer num = (Integer) objArr[2];
                List list = (List) objArr[3];
                IAuthTabCallbackStub iAuthTabCallbackStub2 = (access13800) objArr[4];
                int i18 = 2 % 2;
                if (iAuthTabCallbackStub2 instanceof IAuthTabCallbackStub) {
                    iAuthTabCallbackStub = iAuthTabCallbackStub2;
                    int i19 = iAuthTabCallbackStub.label;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        iAuthTabCallbackStub.label = i19 - 2147483648;
                    } else {
                        iAuthTabCallbackStub = new IAuthTabCallbackStub(iAuthTabCallbackStub2);
                    }
                }
                Object objIAuthTabCallback = iAuthTabCallbackStub.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i20 = iAuthTabCallbackStub.label;
                if (i20 == 0) {
                    ResultKt.onNavigationEvent(objIAuthTabCallback);
                    iIntValue = (num != null ? num.intValue() : 0) + 1;
                    KcbSurveySchedule kcbSurveySchedule = null;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((KcbSurveySchedule) next).onExtraCallback() == iIntValue) {
                                    kcbSurveySchedule = next;
                                }
                            }
                        }
                        kcbSurveySchedule = kcbSurveySchedule;
                    }
                    switch (onNavigationEvent.onExtraCallbackWithResult[aOMPFileConstant.ordinal()]) {
                        case 1:
                            TdsTopV2View tdsTopV2View = r1.onVerticalScrollEvent().onTransact;
                            String string = r1.getString(R.string.credit_kcb_survey_history_participable_title, access14000.onNavigationEvent(iIntValue));
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            tdsTopV2View.setTitleText(string);
                            if (kcbSurveySchedule != null) {
                                BaseTextView baseTextViewExtraCallbackWithResult = r1.onVerticalScrollEvent().IAuthTabCallback.extraCallbackWithResult();
                                if (baseTextViewExtraCallbackWithResult != null) {
                                    Configuration configuration = r1.getResources().getConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                                    baseTextViewExtraCallbackWithResult.setTextColor(new getUrlokhttp(new asInterface(configuration)).asBinder());
                                }
                                TdsBottomCtaV1View tdsBottomCtaV1View = r1.onVerticalScrollEvent().IAuthTabCallback;
                                long jLongValue = ((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{r1, kcbSurveySchedule.onNavigationEvent()}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue();
                                String string2 = jLongValue == 0 ? r1.getString(R.string.credit_kcb_survey_history_participable_until_today_cta) : jLongValue == 1 ? r1.getString(R.string.credit_kcb_survey_history_participable_until_tomorrow_cta) : r1.getString(R.string.credit_kcb_survey_history_participable_in_days_cta, access14000.onExtraCallback(jLongValue));
                                Intrinsics.checkNotNull(string2);
                                tdsBottomCtaV1View.setTopDescription(string2);
                            }
                            TdsBottomCtaV1View tdsBottomCtaV1View2 = r1.onVerticalScrollEvent().IAuthTabCallback;
                            Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View2, "");
                            String string3 = r1.getString(R.string.credit_kcb_survey_start_for_week, access14000.onNavigationEvent(iIntValue));
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View2, string3, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda10
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj) {
                                    int i21 = 2 % 2;
                                    int i22 = onWarmupCompleted + 81;
                                    onNavigationEvent = i22 % 128;
                                    if (i22 % 2 == 0) {
                                        KcbSurveyHistoryActivity.IAuthTabCallback(this.f$0, iIntValue, (View) obj);
                                        throw null;
                                    }
                                    Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.IAuthTabCallback(this.f$0, iIntValue, (View) obj);
                                    int i23 = onWarmupCompleted + 83;
                                    onNavigationEvent = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    throw null;
                                }
                            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                            transparentBackground.onWarmupCompleted((View) r1.onVerticalScrollEvent().IAuthTabCallback.asInterface());
                            int i21 = extraCallbackWithResult + 3;
                            access100 = i21 % 128;
                            int i22 = i21 % 2;
                            return Unit.INSTANCE;
                        case 2:
                            if (kcbSurveySchedule != null) {
                                long jLongValue2 = ((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{r1, kcbSurveySchedule.IAuthTabCallback()}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue();
                                TdsTopV2View tdsTopV2View2 = r1.onVerticalScrollEvent().onTransact;
                                String string4 = r1.getString(R.string.credit_kcb_survey_history_title, access14000.onExtraCallback(jLongValue2));
                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                tdsTopV2View2.setTitleText(string4);
                                BaseTextView baseTextViewExtraCallbackWithResult2 = r1.onVerticalScrollEvent().IAuthTabCallback.extraCallbackWithResult();
                                if (baseTextViewExtraCallbackWithResult2 != null) {
                                    Configuration configuration2 = r1.getResources().getConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                                    baseTextViewExtraCallbackWithResult2.setTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).onPostMessage());
                                }
                                TdsBottomCtaV1View tdsBottomCtaV1View3 = r1.onVerticalScrollEvent().IAuthTabCallback;
                                String string5 = r1.getString(R.string.credit_kcb_survey_history_unlocked_in_days, access14000.onExtraCallback(jLongValue2));
                                Intrinsics.checkNotNullExpressionValue(string5, "");
                                tdsBottomCtaV1View3.setTopDescription(string5);
                                iAuthTabCallbackStub.L$0 = access15400.onNavigationEvent(aOMPFileConstant);
                                iAuthTabCallbackStub.L$1 = access15400.onNavigationEvent(num);
                                iAuthTabCallbackStub.L$2 = access15400.onNavigationEvent(list);
                                iAuthTabCallbackStub.L$3 = access15400.onNavigationEvent(kcbSurveySchedule);
                                iAuthTabCallbackStub.I$0 = iIntValue;
                                iAuthTabCallbackStub.J$0 = jLongValue2;
                                iAuthTabCallbackStub.label = 1;
                                objIAuthTabCallback = r1.IAuthTabCallback(iAuthTabCallbackStub);
                                if (objIAuthTabCallback == objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            }
                            return Unit.INSTANCE;
                        case 3:
                            r1.onWarmupCompleted(1);
                            r1.finish();
                            return Unit.INSTANCE;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                            r1.finish();
                            return Unit.INSTANCE;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                int i23 = extraCallbackWithResult + 55;
                access100 = i23 % 128;
                if (i23 % 2 == 0 ? i20 != 1 : i20 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = iAuthTabCallbackStub.I$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                if (((Boolean) objIAuthTabCallback).booleanValue()) {
                    TdsBottomCtaV1View tdsBottomCtaV1View4 = r1.onVerticalScrollEvent().IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View4, "");
                    String string6 = r1.getString(R.string.credit_kcb_survey_start_for_week, access14000.onNavigationEvent(iIntValue));
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View4, string6, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda11
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i24 = 2 % 2;
                            int i25 = IAuthTabCallback + 97;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.IAuthTabCallback((View) obj);
                            int i27 = IAuthTabCallback + 73;
                            onNavigationEvent = i27 % 128;
                            int i28 = i27 % 2;
                            return unitIAuthTabCallback;
                        }
                    }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                    transparentBackground.onExtraCallback((View) r1.onVerticalScrollEvent().IAuthTabCallback.asInterface());
                } else {
                    TdsBottomCtaV1View tdsBottomCtaV1View5 = r1.onVerticalScrollEvent().IAuthTabCallback;
                    Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View5, "");
                    String string7 = r1.getString(R.string.credit_kcb_survey_notification_for_week, access14000.onNavigationEvent(iIntValue));
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View5, string7, new Function1() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda12
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i24 = 2 % 2;
                            int i25 = onNavigationEvent + 21;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnExtraCallbackWithResult = KcbSurveyHistoryActivity.onExtraCallbackWithResult(this.f$0, (View) obj);
                            int i27 = onExtraCallbackWithResult + 83;
                            onNavigationEvent = i27 % 128;
                            if (i27 % 2 != 0) {
                                int i28 = 7 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                    transparentBackground.onWarmupCompleted((View) r1.onVerticalScrollEvent().IAuthTabCallback.asInterface());
                }
                return Unit.INSTANCE;
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(view);
        if (i3 != 0) {
            int i4 = 5 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = access100 + 107;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyHistoryActivity, i, view);
        if (i4 == 0) {
            int i5 = 24 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 35;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, x3aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 49;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 111;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = extraCallbackWithResult + 3;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 65;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(view);
        }
        onExtraCallbackWithResult(view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        initMiniApp.onWarmupCompleted onwarmupcompleted = (initMiniApp.onWarmupCompleted) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyHistoryActivity, onwarmupcompleted);
        int i4 = access100 + 69;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, int i, AOMPFileConstant aOMPFileConstant, List list, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = access100 + 17;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(kcbSurveyHistoryActivity, i, aOMPFileConstant, list, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 11 / 0;
        }
        int i8 = extraCallbackWithResult + 19;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) IAuthTabCallback(-970191126, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 970191129, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = extraCallbackWithResult + 79;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kcbSurveyHistoryActivity, view);
        int i4 = access100 + 83;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, onExtraCallbackWithResult onextracallbackwithresult, KcbSurveySchedule kcbSurveySchedule, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1);
        Boolean boolValueOf = Boolean.valueOf(z);
        Integer numValueOf = Integer.valueOf(iOnExtraCallbackWithResult);
        if (i5 != 0) {
            Object[] objArr = {kcbSurveyHistoryActivity, onextracallbackwithresult, kcbSurveySchedule, boolValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf};
            IAuthTabCallback(-390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        } else {
            Object[] objArr2 = {kcbSurveyHistoryActivity, onextracallbackwithresult, kcbSurveySchedule, boolValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf};
            IAuthTabCallback(-390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 109;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(kcbSurveyHistoryActivity, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(kcbSurveyHistoryActivity, iEngagementSignalsCallbackDefault);
        int i3 = extraCallbackWithResult + 109;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, KcbSurveyHistoryActivity kcbSurveyHistoryActivity, KcbSurveySchedule kcbSurveySchedule, x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 37;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(onextracallbackwithresult, kcbSurveyHistoryActivity, kcbSurveySchedule, x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(onextracallbackwithresult, kcbSurveyHistoryActivity, kcbSurveySchedule, x2externalsyntheticlambda8, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit onNavigationEvent(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, int i, AOMPFileConstant aOMPFileConstant, List list, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = extraCallbackWithResult + 85;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            kcbSurveyHistoryActivity.onWarmupCompleted(i, aOMPFileConstant, list, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2));
        } else {
            kcbSurveyHistoryActivity.onWarmupCompleted(i, aOMPFileConstant, list, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = extraCallbackWithResult + 107;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, onExtraCallbackWithResult onextracallbackwithresult, KcbSurveySchedule kcbSurveySchedule, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = extraCallbackWithResult + 103;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyHistoryActivity, onextracallbackwithresult, kcbSurveySchedule, z, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access100 + 51;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 57;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        int i6 = access100 + 7;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final class IAuthTabCallback_Parcel implements Function0<stackUploadThresholdMax> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallback_Parcel(Activity activity) {
            this.onExtraCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult();
                throw null;
            }
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
            }
            obj.hashCode();
            throw null;
        }

        public final stackUploadThresholdMax onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                return stackUploadThresholdMax.onNavigationEvent(layoutInflater);
            }
            LayoutInflater layoutInflater2 = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            stackUploadThresholdMax.onNavigationEvent(layoutInflater2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ Object onExtraCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = kcbSurveyHistoryActivity.IAuthTabCallback((access13800<? super Boolean>) access13800Var);
        int i4 = extraCallbackWithResult + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, AOMPFileConstant aOMPFileConstant, Integer num, List list, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(-321961632, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, aOMPFileConstant, num, list, access13800Var}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 321961638, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = access100 + 41;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        AOMPFileConstant aOMPFileConstant = (AOMPFileConstant) objArr[2];
        List<KcbSurveySchedule> list = (List) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        kcbSurveyHistoryActivity.onWarmupCompleted(iIntValue, aOMPFileConstant, list, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        if (i3 == 0) {
            return null;
        }
        int i4 = 55 / 0;
        return null;
    }

    public static final /* synthetic */ stackUploadThresholdMax onWarmupCompleted(KcbSurveyHistoryActivity kcbSurveyHistoryActivity) {
        int i = 2 % 2;
        int i2 = access100 + 43;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        stackUploadThresholdMax stackuploadthresholdmaxOnVerticalScrollEvent = kcbSurveyHistoryActivity.onVerticalScrollEvent();
        int i4 = extraCallbackWithResult + 31;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return stackuploadthresholdmaxOnVerticalScrollEvent;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i4 = access100 + 105;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        int i4 = extraCallbackWithResult + 15;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        int i4 = access100 + 69;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ long access200() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        long jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        int i4 = extraCallbackWithResult + 45;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = access100 + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = access100 + 13;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = extraCallbackWithResult + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.as_();
        }
        super/*o.openJavaCrashMonitor*/.as_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ long getScreenId() {
        long screenId;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            screenId = super.getScreenId();
            int i3 = 39 / 0;
        } else {
            screenId = super.getScreenId();
        }
        int i4 = extraCallbackWithResult + 121;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return screenId;
    }

    @Override // o.SetDetectingInterval
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100 + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = access100 + 83;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return screenParams;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 103;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = access100 + 89;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        int i4 = extraCallbackWithResult + 27;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = ICustomTabsServiceDefault();
        int i4 = access100 + 125;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return onwarmupcompletedICustomTabsServiceDefault;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        int i = 2 % 2;
        int i2 = access100 + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrashIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault();
        int i4 = access100 + 27;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashIEngagementSignalsCallbackDefault;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 29;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.openJavaCrashMonitor*/.validateRelationship();
        }
        super/*o.openJavaCrashMonitor*/.validateRelationship();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = access100 + 45;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public hasCrashWhenJavaCrash IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.IAuthTabCallbackDefault.getValue();
        int i4 = access100 + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return hascrashwhenjavacrash;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr = new Object[1];
            a(new char[]{59825, 13771, 23954, 23924, 39292, 55311, 39667, 63972}, 34 >> (Process.myTid() >> 60), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{59825, 13771, 23954, 23924, 39292, 55311, 39667, 63972}, 8 - (Process.myTid() >> 22), objArr2);
            obj = objArr2[0];
        }
        onwarmupcompleted.onExtraCallback(((String) obj).intern(), kcbSurveyHistoryActivity.IEngagementSignalsCallbackStubProxy());
        onwarmupcompleted.onNavigationEvent("previous_round");
        return Unit.INSTANCE;
    }

    private final stackUploadThresholdMax onVerticalScrollEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.IAuthTabCallbackStub.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (stackUploadThresholdMax) value;
        }
        Object value2 = this.IAuthTabCallbackStub.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        throw null;
    }

    public final getDevicePerformance ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 95;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getDevicePerformance getdeviceperformance = this.kcbSurveyApi;
        if (getdeviceperformance != null) {
            int i5 = i2 + 57;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return getdeviceperformance;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = extraCallbackWithResult + 99;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final zzag onSessionEnded() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 27;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            int i4 = i2 + 87;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                return zzagVar;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = access100 + 71;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE ICustomTabsServiceStub() {
        int i = 2 % 2;
        r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcwe = this.agreedToAllRequiredTermsUseCase;
        Object obj = null;
        if (r8lambdackpzfvkcnb19lbykxqj6b3xvcwe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = extraCallbackWithResult + 103;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = access100;
        int i5 = i4 + 103;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 3;
        extraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return r8lambdackpzfvkcnb19lbykxqj6b3xvcwe;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        L_ l_ = (KcbSurveyHistoryActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(l_.getIntent());
        int i4 = access100 + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    private final String IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = access100 + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onTransact.getValue();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = extraCallbackWithResult + 43;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            kcbSurveyHistoryActivity.setResult(-1);
            kcbSurveyHistoryActivity.finish();
            int i6 = access100 + 15;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = 9 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onNavigationEvent + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                int i6 = 49 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = onNavigationEvent + 117;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 41;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView((View) onVerticalScrollEvent().onWarmupCompleted());
        IPostMessageService();
        IAuthTabCallback(-1269048404, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1269048412, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        int i4 = access100 + 59;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(kcbSurveyHistoryActivity), (CoroutineContext) null, (setRandomHost) null, kcbSurveyHistoryActivity.new asBinder(null), 3, (Object) null);
        int i2 = access100 + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit IAuthTabCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, KcbSurveyScheduleResponse kcbSurveyScheduleResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kcbSurveyHistoryActivity, kcbSurveyScheduleResponse, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = KcbSurveyHistoryActivity.this.new asBinder(access13800Var);
            int i2 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return asbinder;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            int i5 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, KcbSurveyScheduleResponse kcbSurveyScheduleResponse, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            boolean z;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                int i3 = onExtraCallbackWithResult;
                int i4 = i3 + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 29;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1810378452, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.loadSchedule.<anonymous>.<anonymous>.<anonymous> (KcbSurveyHistoryActivity.kt:90)");
                }
                Integer numOnNavigationEvent = kcbSurveyScheduleResponse.onNavigationEvent();
                if (numOnNavigationEvent == null) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i8 = onExtraCallbackWithResult + 73;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    return Unit.INSTANCE;
                }
                int i10 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                KcbSurveyHistoryActivity.IAuthTabCallback(991639113, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, Integer.valueOf(numOnNavigationEvent.intValue()), kcbSurveyScheduleResponse.onTransact(), kcbSurveyScheduleResponse.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -991639112, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            if (r10 != r1) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            final KcbSurveyHistoryActivity kcbSurveyHistoryActivity;
            Object obj3;
            final KcbSurveyScheduleResponse kcbSurveyScheduleResponse;
            Throwable th;
            boolean z;
            initMiniApp initminiapp;
            Function0 function0;
            Function1 function1;
            int i;
            int i2 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                BaseActivity.IAuthTabCallback((BaseActivity) KcbSurveyHistoryActivity.this, (String) null, false, 3, (Object) null);
                KcbSurveyHistoryActivity kcbSurveyHistoryActivity2 = KcbSurveyHistoryActivity.this;
                Result.Companion companion3 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(null, kcbSurveyHistoryActivity2);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallbackwithresult, this);
            } else {
                if (i3 != 1) {
                    int i4 = onExtraCallbackWithResult + 35;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kcbSurveyScheduleResponse = (KcbSurveyScheduleResponse) this.L$2;
                    kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) this.L$1;
                    obj3 = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    KcbSurveyHistoryActivity.onWarmupCompleted(kcbSurveyHistoryActivity).onExtraCallbackWithResult.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1810378452, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$loadSchedule$1$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4, Object obj5) throws Throwable {
                            int i6 = 2 % 2;
                            int i7 = onNavigationEvent + 37;
                            onExtraCallbackWithResult = i7 % 128;
                            Object obj6 = null;
                            if (i7 % 2 != 0) {
                                KcbSurveyHistoryActivity.asBinder.IAuthTabCallback(kcbSurveyHistoryActivity, kcbSurveyScheduleResponse, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                obj6.hashCode();
                                throw null;
                            }
                            Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.asBinder.IAuthTabCallback(kcbSurveyHistoryActivity, kcbSurveyScheduleResponse, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i8 = onNavigationEvent + 9;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            obj6.hashCode();
                            throw null;
                        }
                    })));
                    obj2 = obj3;
                    L_ l_ = KcbSurveyHistoryActivity.this;
                    th = Result.exceptionOrNull-impl(obj2);
                    if (th != null) {
                        int i6 = onWarmupCompleted + 41;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            z = false;
                            initminiapp = null;
                            function0 = null;
                            function1 = null;
                            i = 3;
                        } else {
                            z = false;
                            initminiapp = null;
                            function0 = null;
                            function1 = null;
                            i = 30;
                        }
                        getParamImp.onWarmupCompleted(th, l_, z, initminiapp, function0, function1, i, null);
                    }
                    KcbSurveyHistoryActivity.this.bo_();
                    Unit unit = Unit.INSTANCE;
                    int i7 = onWarmupCompleted + 37;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return unit;
                }
                ResultKt.onNavigationEvent(obj);
            }
            obj2 = Result.constructor-impl(obj);
            kcbSurveyHistoryActivity = KcbSurveyHistoryActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                KcbSurveyScheduleResponse kcbSurveyScheduleResponse2 = (KcbSurveyScheduleResponse) obj2;
                kcbSurveyHistoryActivity.ICustomTabsServiceDefault().onExtraCallbackWithResult("previous_round", kcbSurveyScheduleResponse2.onNavigationEvent());
                AOMPFileConstant aOMPFileConstantOnTransact = kcbSurveyScheduleResponse2.onTransact();
                Integer numOnNavigationEvent = kcbSurveyScheduleResponse2.onNavigationEvent();
                List listOnExtraCallback = kcbSurveyScheduleResponse2.onExtraCallback();
                this.L$0 = obj2;
                this.L$1 = kcbSurveyHistoryActivity;
                this.L$2 = kcbSurveyScheduleResponse2;
                this.I$0 = 0;
                this.label = 2;
                if (KcbSurveyHistoryActivity.onExtraCallbackWithResult(kcbSurveyHistoryActivity, aOMPFileConstantOnTransact, numOnNavigationEvent, listOnExtraCallback, (access13800) this) != objOnWarmupCompleted) {
                    int i9 = onWarmupCompleted + 109;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    obj3 = obj2;
                    kcbSurveyScheduleResponse = kcbSurveyScheduleResponse2;
                    KcbSurveyHistoryActivity.onWarmupCompleted(kcbSurveyHistoryActivity).onExtraCallbackWithResult.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1810378452, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$loadSchedule$1$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4, Object obj5) throws Throwable {
                            int i62 = 2 % 2;
                            int i72 = onNavigationEvent + 37;
                            onExtraCallbackWithResult = i72 % 128;
                            Object obj6 = null;
                            if (i72 % 2 != 0) {
                                KcbSurveyHistoryActivity.asBinder.IAuthTabCallback(kcbSurveyHistoryActivity, kcbSurveyScheduleResponse, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                obj6.hashCode();
                                throw null;
                            }
                            Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.asBinder.IAuthTabCallback(kcbSurveyHistoryActivity, kcbSurveyScheduleResponse, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i82 = onNavigationEvent + 9;
                            onExtraCallbackWithResult = i82 % 128;
                            if (i82 % 2 == 0) {
                                return unitIAuthTabCallback;
                            }
                            obj6.hashCode();
                            throw null;
                        }
                    })));
                    obj2 = obj3;
                }
                return objOnWarmupCompleted;
            }
            L_ l_2 = KcbSurveyHistoryActivity.this;
            th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
            }
            KcbSurveyHistoryActivity.this.bo_();
            Unit unit2 = Unit.INSTANCE;
            int i72 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i72 % 128;
            int i82 = i72 % 2;
            return unit2;
        }

        public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super KcbSurveyScheduleResponse>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ KcbSurveyHistoryActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(access13800 access13800Var, KcbSurveyHistoryActivity kcbSurveyHistoryActivity) {
                super(2, access13800Var);
                this.this$0 = kcbSurveyHistoryActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0);
                int i2 = onExtraCallback + 39;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super KcbSurveyScheduleResponse> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super KcbSurveyScheduleResponse> access13800Var) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 119;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getDevicePerformance getdeviceperformanceICustomTabsService_Parcel = this.this$0.ICustomTabsService_Parcel();
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getdeviceperformanceICustomTabsService_Parcel.onExtraCallback(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                    if (objOnTransact == null) {
                        throw new NullPointerException("null cannot be cast to non-null type im.toss.features.credit.data.response.kcbsurvey.KcbSurveyScheduleResponse");
                    }
                    KcbSurveyScheduleResponse kcbSurveyScheduleResponse = (KcbSurveyScheduleResponse) objOnTransact;
                    int i4 = onExtraCallback + 57;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return kcbSurveyScheduleResponse;
                } catch (NullPointerException e) {
                    if (!Intrinsics.areEqual(KcbSurveyScheduleResponse.class, Object.class) && !Intrinsics.areEqual(KcbSurveyScheduleResponse.class, Unit.class)) {
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                    KcbSurveyScheduleResponse kcbSurveyScheduleResponse2 = Unit.INSTANCE;
                    int i6 = onExtraCallback + 121;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return kcbSurveyScheduleResponse2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestart() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            super/*android.app.Activity*/.onRestart();
            IAuthTabCallback(-1269048404, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1269048412, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
            int i3 = 77 / 0;
        } else {
            super/*android.app.Activity*/.onRestart();
            IAuthTabCallback(-1269048404, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1269048412, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
        }
        int i4 = extraCallbackWithResult + 113;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % 1];
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i8 = i5;
            while (i8 < 16) {
                int i9 = $10 + 113;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStubProxy);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int gidForName = Process.getGidForName("") + 11;
                        int i13 = 12435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, gidForName, i13, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (access000 ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 9 - ExpandableListView.getPackedPositionChild(0L), 12434 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i2 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 16014), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, 19902 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        int i3 = 52 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageService() throws Throwable {
        int i = 2 % 2;
        TdsTopV2View tdsTopV2View = onVerticalScrollEvent().onTransact;
        tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
        Intrinsics.checkNotNull(tdsTopV2View);
        Context context = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV2View.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onUnminimized());
        tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
        tdsTopV2View.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        String string = getString(R.string.credit_kcb_survey_history_subtitle);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2View.setSubtitle2Text(string);
        tdsTopV2View.setSubtitle2TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
        Context context2 = tdsTopV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsTopV2View.setSubtitle2TextColor(new getUrlokhttp(new onExtraCallback(configuration2)).ICustomTabsCallbackStubProxy());
        TdsImageView tdsImageView = onVerticalScrollEvent().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr = new Object[1];
        a(new char[]{38161, 7746, 25802, 3760, 63427, 32410, 14034, 51068, 30985, 10160, 11608, 8187, 22564, 20445, 62128, 20136, 50125, 38998, 16338, 61740, 64080, 13893, 48702, 14655, 50217, 30610, 3737, 14405, 55779, 46374, 21182, 6865, 5387, 34673, 57208, 49394, 25615, 44886, 44849, 42123, 21182, 6865, 18076, 51783, 39640, 64133, 59682, 55559, 39640, 64133, 11481, 1280}, 51 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        onVerticalScrollEvent().IAuthTabCallback.setTopDescription("");
        TdsBottomCtaV1View tdsBottomCtaV1View = onVerticalScrollEvent().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, "", new KcbSurveyHistoryActivity$.ExternalSyntheticLambda0(), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        transparentBackground.onExtraCallback((View) onVerticalScrollEvent().IAuthTabCallback.asInterface());
        int i2 = access100 + 43;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, int i, View view) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 105;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyHistoryActivity.onWarmupCompleted(i);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyHistoryActivity.onWarmupCompleted(i);
        Unit unit2 = Unit.INSTANCE;
        int i4 = access100 + 97;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit asBinder(View view) {
        int i = 2 % 2;
        int i2 = access100 + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 91;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 3;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            kcbSurveyHistoryActivity.IPostMessageServiceDefault();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        kcbSurveyHistoryActivity.IPostMessageServiceDefault();
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 99;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 67;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        rvInitOpt.onExtraCallbackWithResult.onWarmupCompleted(i);
        this.asInterface.onNavigationEvent(KcbSurveyIntroActivity.Companion.IAuthTabCallback(this, IEngagementSignalsCallbackStubProxy(), i));
        int i5 = extraCallbackWithResult + 69;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        startActivity(KcbSurveyNotificationTermActivity.onExtraCallback.onWarmupCompleted(KcbSurveyNotificationTermActivity.Companion, this, IEngagementSignalsCallbackStubProxy(), "completed", false, 8, null));
        int i4 = access100 + 37;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public static final class IAuthTabCallback {
        private static short[] onExtraCallback;
        private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
        private static final int $$b = 223;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static int onNavigationEvent = 784211723;
        private static int onExtraCallbackWithResult = -1538795489;
        private static int IAuthTabCallback = 1062978838;
        private static byte[] onWarmupCompleted = {-7, 5, -5, 8, 5, -9, 9, -5};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, short s2) {
            int i;
            int i2 = s2 * 2;
            int i3 = 4 - (b * 3);
            byte[] bArr = $$a;
            int i4 = (s * 3) + 115;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i4 += i3;
                i3 = i6;
                i = i7;
                int i8 = i3 + 1;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                    return new String(bArr2, 0);
                }
                int i9 = i + 1;
                i6 = i8;
                i3 = bArr[i8];
                i7 = i9;
                i4 += i3;
                i3 = i6;
                i = i7;
                int i82 = i3 + 1;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            } else {
                i = 0;
                int i822 = i3 + 1;
                bArr2[i] = (byte) i4;
                if (i == i5) {
                }
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            boolean z;
            int i4;
            int length;
            byte[] bArr;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43424), View.getDefaultSize(0, 0) + 42, TextUtils.getOffsetBefore("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    int i6 = $10 + 75;
                    int i7 = i6 % 128;
                    $11 = i7;
                    int i8 = i6 % 2;
                    byte[] bArr2 = onWarmupCompleted;
                    if (bArr2 != null) {
                        int i9 = i7 + 47;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        for (int i10 = 0; i10 < length; i10++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char cResolveSize = (char) (12843 - View.resolveSize(0, 0));
                                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 55;
                                    int jumpTapTimeout = 2167 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    byte b2 = $$a[0];
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, iIndexOf, jumpTapTimeout, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        int i11 = $10 + 15;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            byte[] bArr3 = onWarmupCompleted;
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43425), 42 - Gravity.getAbsoluteGravity(0, 0), 22438 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] % (-4629411779493505016L))) % ((int) (onExtraCallbackWithResult * (-4629411779493505016L)));
                        } else {
                            byte[] bArr4 = onWarmupCompleted;
                            try {
                                Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 42 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTouchSlop() >> 8) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        iIntValue = (byte) i4;
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j)) + (!(z2 ^ true) ? 1 : 0);
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 86 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.MeasureSpec.getSize(0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = onWarmupCompleted;
                    if (bArr5 != null) {
                        int i12 = $10 + 45;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr6[i14] = (byte) (bArr5[i14] ^ (-4629411779493505016L));
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        int i15 = $11 + 5;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z) {
                            byte[] bArr7 = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        private IAuthTabCallback() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) KcbSurveyHistoryActivity.class);
            Object[] objArr = new Object[1];
            a((short) KeyEvent.getDeadChar(0, 0), (byte) View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) + 1980119293, TextUtils.indexOf("", "", 0) + 1692656468, (-24) - (Process.myTid() >> 22), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = asInterface + 79;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, KcbSurveyHistoryActivity kcbSurveyHistoryActivity, KcbSurveySchedule kcbSurveySchedule, x2ExternalSyntheticLambda8 x2externalsyntheticlambda8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        String strIntern;
        int i3 = 2 % 2;
        int i4 = access100 + 123;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(x2externalsyntheticlambda8, "");
            if ((i & 16) != 0) {
                i2 = i;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda8)) {
                int i5 = access100 + 23;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2 == 0 ? 2 : 4;
                i2 = i | i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(x2externalsyntheticlambda8, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            int i7 = access100 + 89;
            extraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = access100 + 19;
                extraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(226810040, i2, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.StepperRow.<anonymous> (KcbSurveyHistoryActivity.kt:291)");
            }
            int i11 = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
            if (i11 != 1) {
                int i12 = extraCallbackWithResult + 59;
                access100 = i12 % 128;
                int i13 = i12 % 2;
                if (i11 == 2) {
                    Object[] objArr = new Object[1];
                    a(new char[]{38161, 7746, 25802, 3760, 63427, 32410, 14034, 51068, 30985, 10160, 11608, 8187, 22564, 20445, 62128, 20136, 50125, 38998, 16338, 61740, 64080, 13893, 54589, 960, 35251, 5155, 47961, 53507, 45297, 24723, 35477, 31218, 54477, 39183, 27056, 9515, 41391, 62666, 53546, 6717, 21220, 25173, 24256, 18844, 34629, 48012, 39708, 19281, 48424, 51415, 57357, 20300}, (ViewConfiguration.getTouchSlop() >> 8) + 51, objArr);
                    strIntern = ((String) objArr[0]).intern();
                } else if (i11 == 3) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{38161, 7746, 25802, 3760, 63427, 32410, 14034, 51068, 30985, 10160, 11608, 8187, 22564, 20445, 62128, 20136, 50125, 38998, 16338, 61740, 64080, 13893, 61694, 39574, 46824, 7055, 52374, 18637, 58706, 63195, 21182, 6865, 50331, 11212, 48073, 10806, 22564, 20445, 41648, 39704, 4064, 2781, 9126, 36826, 14932, 2177, 45297, 24723, 51913, 1327, 29829, 31340, 47249, 10185, 5387, 34673, 32551, 19711, 21182, 6865}, (ViewConfiguration.getEdgeSlop() >> 16) + 60, objArr2);
                    strIntern = ((String) objArr2[0]).intern();
                } else {
                    if (i11 != 4 && i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long jLongValue = ((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, kcbSurveySchedule.IAuthTabCallback()}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    a(new char[]{38161, 7746, 25802, 3760, 63427, 32410, 14034, 51068, 30985, 10160, 11608, 8187, 22564, 20445, 62128, 20136, 50125, 38998, 16338, 61740, 64080, 13893, 61694, 39574, 34629, 48012, 49572, 20467, 65214, 60909, 61694, 39574, 46824, 7055, 58696, 34884, 1998, 42481, 6992, 61188}, TextUtils.getCapsMode("", 0, 0) + 40, objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    sb.append(jLongValue);
                    sb.append("-grey.png");
                    strIntern = sb.toString();
                }
            } else {
                Object[] objArr4 = new Object[1];
                a(new char[]{38161, 7746, 25802, 3760, 63427, 32410, 14034, 51068, 30985, 10160, 11608, 8187, 22564, 20445, 62128, 20136, 50125, 38998, 16338, 61740, 64080, 13893, 61694, 39574, 34629, 48012, 49572, 20467, 65214, 60909, 35477, 31218, 54477, 39183, 27056, 9515, 41199, 56251, 10542, 15238, 4244, 29340, 51042, 46889, 35251, 5155, 33125, 22724, 36314, 50344, 28026, 30165, 39640, 64133, 11481, 1280}, 56 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
                strIntern = ((String) objArr4[0]).intern();
            }
            x2externalsyntheticlambda8.onWarmupCompleted(strIntern, deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, 0L, 0, 0.0f, (handleNativeAdClick.onExtraCallback) null, false, (getSwitchMinWidth) null, (getSwitchMinWidth) null, (getBacktraceNote) null, 0L, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 48, (i2 << 12) & 57344, 16380);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = extraCallbackWithResult + 15;
                access100 = i14 % 128;
                if (i14 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i15 = access100 + 35;
            extraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = extraCallbackWithResult + 21;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1769212847, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.StepperRow.<anonymous>.<anonymous> (KcbSurveyHistoryActivity.kt:303)");
                int i5 = access100 + 23;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = access100 + 15;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 2) == 2) {
            z = false;
        } else {
            int i5 = i4 + 65;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = extraCallbackWithResult + 19;
            access100 = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1557793520, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.StepperRow.<anonymous>.<anonymous> (KcbSurveyHistoryActivity.kt:304)");
                int i8 = access100 + 35;
                extraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = extraCallbackWithResult + 5;
                access100 = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i11 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final String str, final String str2, x3a x3aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(x3aVar, "");
        if ((i & 6) == 0) {
            int i4 = extraCallbackWithResult + 45;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x3aVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = extraCallbackWithResult + 7;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(412169543, i2, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.StepperRow.<anonymous> (KcbSurveyHistoryActivity.kt:302)");
            }
            x3a.onWarmupCompleted(AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), -616660016, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback(), 616660018, new Object[]{x3aVar, ForwardingCameraControl.onExtraCallback(-1769212847, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 95;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        KcbSurveyHistoryActivity.onWarmupCompleted(str, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = KcbSurveyHistoryActivity.onWarmupCompleted(str, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1557793520, true, new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 119;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.IAuthTabCallback(str2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = onExtraCallbackWithResult + 85;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unitIAuthTabCallback;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 9) & 7168) | 54), 4});
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access100 + 121;
                extraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        final String strIAuthTabCallback;
        final String strOnExtraCallback;
        float f;
        int i3;
        final KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        final onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        final KcbSurveySchedule kcbSurveySchedule = (KcbSurveySchedule) objArr[2];
        final boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i4 = 2 % 2;
        int i5 = access100 + 109;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-2000521984);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult.ordinal())) {
                int i7 = extraCallbackWithResult + 67;
                access100 = i7 % 128;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i8 = extraCallbackWithResult + 85;
            access100 = i8 % 128;
            int i9 = i8 % 2;
            i |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(kcbSurveySchedule) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(kcbSurveyHistoryActivity) ? 2048 : 1024;
        }
        if ((i & 1171) != 1170) {
            int i10 = access100 + 41;
            extraCallbackWithResult = i10 % 128;
            z = i10 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2000521984, i, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.StepperRow (KcbSurveyHistoryActivity.kt:239)");
            }
            int[] iArr = onNavigationEvent.IAuthTabCallback;
            int i11 = iArr[onextracallbackwithresult.ordinal()];
            if (i11 != 1) {
                int i12 = extraCallbackWithResult + 99;
                access100 = i12 % 128;
                if (i12 % 2 == 0 ? i11 == 2 : i11 == 5) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583982541);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_kcb_survey_history_week_complete, new Object[]{Integer.valueOf(kcbSurveySchedule.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (i11 != 3 && i11 != 4 && i11 != 5) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1643727162);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583700658);
                    strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_kcb_survey_history_week_pending, new Object[]{Integer.valueOf(kcbSurveySchedule.onExtraCallback())}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                int i13 = iArr[onextracallbackwithresult.ordinal()];
                if (i13 == 1 || i13 == 2) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583457804);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_history_all_questions_answered, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else if (i13 == 3) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583265604);
                    long jLongValue = ((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, kcbSurveySchedule.onNavigationEvent()}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue();
                    if (jLongValue == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583206425);
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_history_participable_until_today, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else if (jLongValue == 1) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583057532);
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_kcb_survey_history_participable_until_tomorrow, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i14 = extraCallbackWithResult + 97;
                        access100 = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-582900982);
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_kcb_survey_history_participable_in_days, new Object[]{Long.valueOf(jLongValue)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (i13 != 4 && i13 != 5) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1643744825);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-582579388);
                    strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.credit_kcb_survey_history_unlocked_in_days, new Object[]{Long.valueOf(((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, kcbSurveySchedule.IAuthTabCallback()}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue())}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (iArr[onextracallbackwithresult.ordinal()] == 5) {
                    int i16 = extraCallbackWithResult + 115;
                    access100 = i16 % 128;
                    int i17 = i16 % 2;
                    f = 0.4f;
                } else {
                    f = 1.0f;
                }
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = iIntValue;
                x3.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(226810040, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                        int i18 = 2 % 2;
                        int i19 = onNavigationEvent + 95;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnNavigationEvent = KcbSurveyHistoryActivity.onNavigationEvent(onextracallbackwithresult, kcbSurveyHistoryActivity, kcbSurveySchedule, (x2ExternalSyntheticLambda8) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i21 = IAuthTabCallback + 85;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(412169543, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 87;
                        onNavigationEvent = i19 % 128;
                        if (i19 % 2 == 0) {
                            KcbSurveyHistoryActivity.IAuthTabCallback(strIAuthTabCallback, strOnExtraCallback, (x3a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit unitIAuthTabCallback = KcbSurveyHistoryActivity.IAuthTabCallback(strIAuthTabCallback, strOnExtraCallback, (x3a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i20 = IAuthTabCallback + 69;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), onCaptureSessionStart.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f), (getBacktraceNote) null, zBooleanValue, (getSwitchMinWidth) null, (getSwitchMinWidth) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 57344) | 54, 1000);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = extraCallbackWithResult + 9;
                    access100 = i18 % 128;
                    if (i18 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final int i19 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i20 = 2 % 2;
                    int i21 = IAuthTabCallback + 59;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    Unit unitOnNavigationEvent = KcbSurveyHistoryActivity.onNavigationEvent(this.f$0, onextracallbackwithresult, kcbSurveySchedule, zBooleanValue, i19, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i23 = IAuthTabCallback + 71;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[PHI: r6
      0x0154: PHI (r6v28 java.lang.Object) = (r6v27 java.lang.Object), (r6v59 java.lang.Object) binds: [B:66:0x0152, B:63:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final int i, final AOMPFileConstant aOMPFileConstant, final List<KcbSurveySchedule> list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) throws Throwable {
        int i3;
        Object next;
        onExtraCallbackWithResult onextracallbackwithresult;
        onExtraCallbackWithResult onextracallbackwithresult2;
        int i4;
        int i5 = 2 % 2;
        int i6 = access100 + 49;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1538460975);
        int i8 = 4;
        if ((i2 & 6) == 0) {
            int i9 = extraCallbackWithResult + 29;
            access100 = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(aOMPFileConstant.ordinal())) {
                int i10 = access100 + 25;
                extraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    i8 = 32;
                }
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i11 = access100 + 57;
                extraCallbackWithResult = i11 % 128;
                i4 = i11 % 2 == 0 ? 28125 : 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i12 = i3;
        int i13 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i12 & 1171) != 1170, i12 & 1)) {
            int i14 = access100 + 71;
            extraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1538460975, i12, -1, "im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity.Content (KcbSurveyHistoryActivity.kt:316)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-209730524);
            Iterator<T> it = list.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                int i17 = extraCallbackWithResult + 5;
                access100 = i17 % 128;
                if (i17 % 2 != 0) {
                    next = it.next();
                    int i18 = 35 / i13;
                    if (i16 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                } else {
                    next = it.next();
                    if (i16 < 0) {
                    }
                }
                KcbSurveySchedule kcbSurveySchedule = (KcbSurveySchedule) next;
                if (kcbSurveySchedule.onExtraCallback() < i) {
                    int i19 = extraCallbackWithResult + 37;
                    access100 = i19 % 128;
                    if (i19 % 2 != 0) {
                        onExtraCallbackWithResult onextracallbackwithresult4 = onExtraCallbackWithResult.COMPLETE;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    onextracallbackwithresult2 = onExtraCallbackWithResult.COMPLETE;
                } else {
                    if (kcbSurveySchedule.onExtraCallback() == i) {
                        if (Intrinsics.areEqual(IEngagementSignalsCallbackStubProxy(), "kcb_survey_web")) {
                            int i20 = access100 + 17;
                            extraCallbackWithResult = i20 % 128;
                            if (i20 % 2 == 0) {
                                onextracallbackwithresult = onExtraCallbackWithResult.CURRENT;
                                int i21 = 44 / i13;
                            } else {
                                onextracallbackwithresult = onExtraCallbackWithResult.CURRENT;
                            }
                        } else {
                            onextracallbackwithresult = onExtraCallbackWithResult.COMPLETE;
                        }
                    } else if (kcbSurveySchedule.onExtraCallback() == i + 1) {
                        int i22 = extraCallbackWithResult + 119;
                        access100 = i22 % 128;
                        int i23 = i22 % 2;
                        onextracallbackwithresult = aOMPFileConstant == AOMPFileConstant.PARTICIPABLE ? onExtraCallbackWithResult.AVAILABLE : onExtraCallbackWithResult.NEXT;
                    } else {
                        onextracallbackwithresult = onExtraCallbackWithResult.WAITING;
                    }
                    onextracallbackwithresult2 = onextracallbackwithresult;
                }
                IAuthTabCallback(-390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this, onextracallbackwithresult2, kcbSurveySchedule, Boolean.valueOf(i16 != CollectionsKt.getLastIndex(list) ? 1 : i13), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i12 & 7168)}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
                i16++;
                i13 = i13;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = access100 + 65;
                extraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i26 = 2 % 2;
                    int i27 = onExtraCallback + 59;
                    IAuthTabCallback = i27 % 128;
                    int i28 = i27 % 2;
                    Unit unitOnExtraCallback = KcbSurveyHistoryActivity.onExtraCallback(this.f$0, i, aOMPFileConstant, list, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i29 = IAuthTabCallback + 29;
                    onExtraCallback = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 35 / 0;
                    }
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Object obj;
        Date dateOnExtraCallback;
        KcbSurveyHistoryActivity kcbSurveyHistoryActivity = (KcbSurveyHistoryActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Date dateOnExtraCallback2 = kcbSurveyHistoryActivity.onExtraCallback(kcbSurveyHistoryActivity.onSessionEnded().asBinder());
        try {
            Result.Companion companion = Result.Companion;
            Date date = CommonModule_closeView.onWarmupCompleted.onWarmupCompleted().parse(str);
            if (date != null) {
                int i2 = extraCallbackWithResult + 69;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    kcbSurveyHistoryActivity.onExtraCallback(date);
                    obj.hashCode();
                    throw null;
                }
                dateOnExtraCallback = kcbSurveyHistoryActivity.onExtraCallback(date);
            } else {
                dateOnExtraCallback = null;
            }
            obj = Result.constructor-impl(dateOnExtraCallback);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Date date2 = (Date) (Result.onExtraCallback(obj) ? null : obj);
        if (date2 != null) {
            return Long.valueOf(commonTestFlag.onExtraCallback.onWarmupCompleted(dateOnExtraCallback2, date2, TimeUnit.DAYS));
        }
        int i3 = extraCallbackWithResult + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return -1L;
        }
        int i4 = 67 / 0;
        return -1L;
    }

    private final Date onExtraCallback(Date date) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        int i4 = extraCallbackWithResult + 31;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return time;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1 r4
      0x002a: PHI (r1v12 im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$onTransact) = 
      (r1v11 im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$onTransact)
      (r1v14 im.toss.feature.credit.ui.kcbsurvey.KcbSurveyHistoryActivity$onTransact)
     binds: [B:10:0x0028, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r4v3 int) = (r4v2 int), (r4v5 int) binds: [B:10:0x0028, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Boolean> access13800Var) {
        onTransact ontransact;
        Object objOnNavigationEvent;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof onTransact) {
            int i3 = access100 + 41;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                ontransact = (onTransact) access13800Var;
                i = ontransact.label;
                int i4 = 3 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ontransact.label = i - 2147483648;
                } else {
                    ontransact = new onTransact(access13800Var);
                }
            } else {
                ontransact = (onTransact) access13800Var;
                i = ontransact.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        onTransact ontransact2 = ontransact;
        Object obj = ontransact2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = ontransact2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE r8lambdackpzfvkcnb19lbykxqj6b3xvcweICustomTabsServiceStub = ICustomTabsServiceStub();
            ontransact2.label = 1;
            objOnNavigationEvent = r8lambdackpZfvKcnb19lbYKXqJ6B3XVCwE.onNavigationEvent(r8lambdackpzfvkcnb19lbykxqj6b3xvcweICustomTabsServiceStub, "STD_9365_CREDIT_SURVEY_NOTIFICATION_CHECK_AGREED", false, ontransact2, 2, (Object) null);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = ((Result) obj).onNavigationEvent();
        }
        if (Result.onExtraCallback(objOnNavigationEvent)) {
            int i6 = extraCallbackWithResult + 15;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 5;
            }
            objOnNavigationEvent = null;
        }
        Boolean bool = (Boolean) objOnNavigationEvent;
        return access14000.onNavigationEvent(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult COMPLETE = new onExtraCallbackWithResult("COMPLETE", 0);
        public static final onExtraCallbackWithResult CURRENT = new onExtraCallbackWithResult("CURRENT", 1);
        public static final onExtraCallbackWithResult NEXT = new onExtraCallbackWithResult("NEXT", 2);
        public static final onExtraCallbackWithResult AVAILABLE = new onExtraCallbackWithResult("AVAILABLE", 3);
        public static final onExtraCallbackWithResult WAITING = new onExtraCallbackWithResult("WAITING", 4);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {COMPLETE, CURRENT, NEXT, AVAILABLE, WAITING};
            int i5 = i2 + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 121;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(View view) {
        return (Unit) IAuthTabCallback(-1956770006, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{view}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1956770013, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onExtraCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, initMiniApp.onWarmupCompleted onwarmupcompleted) {
        return (Unit) IAuthTabCallback(1992094020, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, onwarmupcompleted}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1992094015, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onWarmupCompleted(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        return (Unit) IAuthTabCallback(-1225852902, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity, iEngagementSignalsCallbackDefault}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1225852906, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private final void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, KcbSurveySchedule kcbSurveySchedule, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Object[] objArr = {this, onextracallbackwithresult, kcbSurveySchedule, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        IAuthTabCallback(-390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 390136415, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(KcbSurveyHistoryActivity kcbSurveyHistoryActivity, int i, AOMPFileConstant aOMPFileConstant, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        Object[] objArr = {kcbSurveyHistoryActivity, Integer.valueOf(i), aOMPFileConstant, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        IAuthTabCallback(991639113, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -991639112, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private final long onNavigationEvent(String str) {
        return ((Long) IAuthTabCallback(1093406872, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this, str}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1093406870, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult())).longValue();
    }

    private final void IPostMessageServiceStub() throws Throwable {
        IAuthTabCallback(-1269048404, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1269048412, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private static final String onExtraCallback(KcbSurveyHistoryActivity kcbSurveyHistoryActivity) {
        return (String) IAuthTabCallback(-970191126, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{kcbSurveyHistoryActivity}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 970191129, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    private final Object onWarmupCompleted(AOMPFileConstant aOMPFileConstant, Integer num, List<KcbSurveySchedule> list, access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(-321961632, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this, aOMPFileConstant, num, list, access13800Var}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 321961638, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult());
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access100 + 15;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallbackWithResult + 37;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 111;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.kcbsurvey.Hilt_KcbSurveyHistoryActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access100 + 51;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IEngagementSignalsCallbackStub() {
        access000 = (char) 43745;
        getInterfaceDescriptor = (char) 64274;
        IAuthTabCallback_Parcel = (char) 39819;
        IAuthTabCallbackStubProxy = (char) 61483;
    }
}
