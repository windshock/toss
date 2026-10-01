package im.toss.features.loan.comparison.funnel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.TossApplication;
import im.toss.base.BaseFragment;
import im.toss.features.credit.data.response.CreditLoanNeedsResponse;
import im.toss.features.loan.comparison.LoanComparisonCreditActivity;
import im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment$;
import im.toss.features.loan.ui.R;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AppLovinAdImpl;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.MaxRecyclerAdaptera;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RippleNode;
import o.SessionTrackera;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TraceDebugManagerIdeCommand;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access5300;
import o.access8100;
import o.addAllCommandLine;
import o.addFixedPosition;
import o.component5;
import o.findResAndMsg;
import o.getAwbState;
import o.getDummyAd;
import o.getErrCode;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getRawFullResponse;
import o.getResultEnumByWsMsg;
import o.getSurfaceEdge;
import o.getWrite;
import o.hasVideoUrl;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.needCorrectJpegMetadata;
import o.onCenterChanged;
import o.onRenderReady;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setHasShown;
import o.setRandomHost;
import o.toPreviewOnlyRange;
import o.y2;
import o.y4;
import o.y6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanComparisonFunnelIntroFragment extends Hilt_LoanComparisonFunnelIntroFragment {
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int onTransact;
    private Function0<Unit> IAuthTabCallbackDefault;
    private boolean asBinder;

    @Inject
    public getDummyAd termsIntent;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new PropertyReference1Impl<>(LoanComparisonFunnelIntroFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelIntroBinding;", 0)};
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    public static final int onWarmupCompleted = 8;
    private int asInterface = R.layout.fragment_loan_comparison_funnel_intro;
    private final PageRenderReadyListener onExtraCallback = preFillDefault.IAuthTabCallback(this, onNavigationEvent.onExtraCallbackWithResult);
    private final SessionTrackera IAuthTabCallbackStub = AppLovinAdImpl.IAuthTabCallback(this, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda3(this));
    private final CoroutineExceptionHandler onExtraCallbackWithResult = new onTransact(CoroutineExceptionHandler.extraCallbackWithResult, this);

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = LoanComparisonFunnelIntroFragment.onWarmupCompleted(LoanComparisonFunnelIntroFragment.this, null, this);
            int i4 = onExtraCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    static {
        Object obj = null;
        int i = access100 + 79;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        Integer numOnExtraCallbackWithResult;
        CreditLoanNeedsResponse.FindLoanInfo findLoanInfoOnExtraCallback;
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | i5;
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = ~i5;
        int i13 = (~(i12 | i3)) | (~(i12 | i6)) | i10;
        int i14 = (~(i7 | i3)) | (~(i8 | i6));
        int i15 = i6 + i3 + i + (1040777104 * i4) + ((-1861505373) * i2);
        int i16 = i15 * i15;
        int i17 = (i6 * (-1036928585)) + 527892480 + ((-1036928585) * i3) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i) + (1608515584 * i4) + ((-1123418112) * i2) + ((-2114519040) * i16);
        int i18 = (i6 * 1703033811) + 1712528133 + (i3 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i * 1703034565) + (i4 * (-2114876976)) + (i2 * 1880022383) + (i16 * (-720175104));
        switch (i17 + (i18 * i18 * (-739180544))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
                int i19 = 2 % 2;
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.loan_comparison_unavailable_message));
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda7(loanComparisonFunnelIntroFragment))}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i20 = onTransact + 85;
                IAuthTabCallback_Parcel = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            default:
                CreditLoanNeedsResponse creditLoanNeedsResponse = (CreditLoanNeedsResponse) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i22 = 2 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-143247646, iIntValue, -1, "im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.showIntroBridgeContainer.<anonymous>.<anonymous> (LoanComparisonFunnelIntroFragment.kt:184)");
                    }
                    Integer numValueOf = null;
                    if (creditLoanNeedsResponse != null) {
                        int i23 = onTransact + 77;
                        IAuthTabCallback_Parcel = i23 % 128;
                        int i24 = i23 % 2;
                        CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummaryOnWarmupCompleted = creditLoanNeedsResponse.onWarmupCompleted();
                        String strOnExtraCallbackWithResult = estimatedLoanSummaryOnWarmupCompleted != null ? estimatedLoanSummaryOnWarmupCompleted.onExtraCallbackWithResult() : null;
                        if (creditLoanNeedsResponse != null) {
                            int i25 = IAuthTabCallback_Parcel + 63;
                            onTransact = i25 % 128;
                            int i26 = i25 % 2;
                            CreditLoanNeedsResponse.EstimatedLoanSummary estimatedLoanSummaryOnWarmupCompleted2 = creditLoanNeedsResponse.onWarmupCompleted();
                            Float fValueOf = estimatedLoanSummaryOnWarmupCompleted2 != null ? Float.valueOf(estimatedLoanSummaryOnWarmupCompleted2.IAuthTabCallback()) : null;
                            if (creditLoanNeedsResponse != null) {
                                int i27 = onTransact + 113;
                                IAuthTabCallback_Parcel = i27 % 128;
                                int i28 = i27 % 2;
                                numOnExtraCallbackWithResult = creditLoanNeedsResponse.onExtraCallbackWithResult();
                            } else {
                                numOnExtraCallbackWithResult = null;
                            }
                            if (creditLoanNeedsResponse != null && (findLoanInfoOnExtraCallback = creditLoanNeedsResponse.onExtraCallback()) != null) {
                                numValueOf = Integer.valueOf(findLoanInfoOnExtraCallback.onNavigationEvent());
                            }
                            getErrCode.onExtraCallbackWithResult(strOnExtraCallbackWithResult, fValueOf, numOnExtraCallbackWithResult, numValueOf, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i29 = IAuthTabCallback_Parcel + 63;
                                onTransact = i29 % 128;
                                int i30 = i29 % 2;
                            }
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, Map map, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanComparisonFunnelIntroFragment, map, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 63;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanComparisonFunnelIntroFragment, commonModule_setLeftEdgeTouchEnabled};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback2, objArr, iOnExtraCallback4, 571399897, iOnExtraCallback3, iOnExtraCallback, -571399890);
        int i4 = onTransact + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 1;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 29;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditLoanNeedsResponse creditLoanNeedsResponse, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {creditLoanNeedsResponse, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), -1519024427, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1519024427);
        int i5 = onTransact + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanComparisonFunnelIntroFragment, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, Map map, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 67;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(loanComparisonFunnelIntroFragment, map, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanComparisonFunnelIntroFragment, map, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback_Parcel + 13;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanComparisonFunnelIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, Boolean.valueOf(z)}, TossApplication.onSessionEnded.onExtraCallback(), -1114954976, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), 1114954982);
        int i3 = IAuthTabCallback_Parcel + 23;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return 1019597L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onTransact extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ LoanComparisonFunnelIntroFragment onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = loanComparisonFunnelIntroFragment;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            getParamImp.onWarmupCompleted(th, this.onWarmupCompleted.requireContext(), false, (initMiniApp) null, (Function0) null, this.onWarmupCompleted.new onExtraCallback(), 14, (Object) null);
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.ICustomTabsCallbackStub();
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = loanComparisonFunnelIntroFragment.onExtraCallback(access13800Var);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return objOnExtraCallback;
    }

    public static final /* synthetic */ void onExtraCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.ICustomTabsCallbackStubProxy();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.onMinimized();
        int i4 = IAuthTabCallback_Parcel + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.onNavigationEvent(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, String str, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            loanComparisonFunnelIntroFragment.onNavigationEvent(str, (access13800<? super Unit>) access13800Var);
            throw null;
        }
        Object objOnNavigationEvent = loanComparisonFunnelIntroFragment.onNavigationEvent(str, (access13800<? super Unit>) access13800Var);
        int i3 = IAuthTabCallback_Parcel + 21;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), -1680449357, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1680449360);
        int i4 = IAuthTabCallback_Parcel + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonFunnelIntroFragment.onMessageChannelReady();
        int i4 = onTransact + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return "loan_comparison_product_funnel_navigator";
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 71;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.asInterface;
        int i6 = i2 + 89;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, TraceDebugManagerIdeCommand> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 1;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        onNavigationEvent() {
            super(1, TraceDebugManagerIdeCommand.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanComparisonFunnelIntroBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            View view = (View) obj;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(view);
            }
            onWarmupCompleted(view);
            throw null;
        }

        public final TraceDebugManagerIdeCommand onWarmupCompleted(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                TraceDebugManagerIdeCommand.IAuthTabCallback(view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            TraceDebugManagerIdeCommand traceDebugManagerIdeCommandIAuthTabCallback = TraceDebugManagerIdeCommand.IAuthTabCallback(view);
            int i3 = onWarmupCompleted + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return traceDebugManagerIdeCommandIAuthTabCallback;
        }
    }

    private final TraceDebugManagerIdeCommand asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugManagerIdeCommand traceDebugManagerIdeCommandOnNavigationEvent = this.onExtraCallback.onNavigationEvent(this, onNavigationEvent[0]);
        int i4 = onTransact + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return traceDebugManagerIdeCommandOnNavigationEvent;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 47;
        im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.IAuthTabCallback_Parcel = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getDummyAd IAuthTabCallbackDefault() {
        getDummyAd getdummyad;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 19;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            getdummyad = this.termsIntent;
            int i4 = 80 / 0;
        } else {
            getdummyad = this.termsIntent;
        }
    }

    private static final Unit onExtraCallbackWithResult(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), -1680449357, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1680449360);
            unit = Unit.INSTANCE;
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), -1680449357, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 1680449360);
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallback implements Function1<DialogInterface, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((DialogInterface) obj);
            if (i3 == 0) {
                unit = Unit.INSTANCE;
                int i4 = 3 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = IAuthTabCallback + 119;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFunnelIntroFragment.this.extraCallback();
            int i4 = onExtraCallback + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        postponeEnterTransition();
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStub();
        onPostMessage();
        onTransact().ICustomTabsCallbackStubProxy();
        int i4 = onTransact + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            Function0<Unit> function0 = this.IAuthTabCallbackDefault;
            if (function0 != null) {
                int i3 = IAuthTabCallback_Parcel + 75;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    function0.invoke();
                } else {
                    function0.invoke();
                    throw null;
                }
            }
            this.IAuthTabCallbackDefault = null;
            return;
        }
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        throw null;
    }

    public void extraCallback() {
        int i = 2 % 2;
        if (getChildFragmentManager().extraCallbackWithResult() > 0) {
            int i2 = onTransact + 101;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            getChildFragmentManager().extraCommand();
            return;
        }
        LoanComparisonFunnelBaseFragment.IAuthTabCallback(this, false, (Intent) null, 3, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 53;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void IAuthTabCallbackStub() {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 99;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            if (!this.asBinder) {
                int i4 = i2 + 121;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    onTransact().onExtraCallback();
                    z = false;
                } else {
                    onTransact().onExtraCallback();
                    z = true;
                }
                this.asBinder = z;
            }
            int i5 = onTransact + 81;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    private final void onPostMessage() {
        int i = 2 % 2;
        onTransact().onExtraCallbackWithResult().observe(getViewLifecycleOwner(), new BaseFragment.IAuthTabCallbackDefault(new IAuthTabCallback()));
        onTransact().access100().observe(getViewLifecycleOwner(), new BaseFragment.IAuthTabCallbackDefault(new asBinder()));
        onRenderReady.onNavigationEvent(this, "KEY_FUNNEL_BACK", false, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda0(this), 2, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 65;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 101;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (zBooleanValue) {
            loanComparisonFunnelIntroFragment.extraCallback();
            int i3 = onTransact + 117;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        asInterface(Object obj) {
            super(0, obj, LoanComparisonFunnelIntroFragment.class, "navigateToJobInput", "navigateToJobInput()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonFunnelIntroFragment.onExtraCallbackWithResult((LoanComparisonFunnelIntroFragment) ((CallableReference) this).receiver);
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (!r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            loanComparisonFunnelIntroFragment.extraCallback();
            return null;
        }
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1003760L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        loanComparisonFunnelIntroFragment.asInterface().onExtraCallback(Long.valueOf(loanComparisonFunnelIntroFragment.onTransact().IAuthTabCallback()));
        loanComparisonFunnelIntroFragment.onTransact().ICustomTabsCallbackStub();
        if (loanComparisonFunnelIntroFragment.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            loanComparisonFunnelIntroFragment.onMinimized();
            return null;
        }
        loanComparisonFunnelIntroFragment.IAuthTabCallbackDefault = new asInterface(loanComparisonFunnelIntroFragment);
        int i4 = onTransact + 45;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            startPostponedEnterTransition();
            onActivityLayout();
            int i3 = onTransact + 71;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        startPostponedEnterTransition();
        onActivityLayout();
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), this.onExtraCallbackWithResult, (setRandomHost) null, new onWarmupCompleted(z, this, null), 2, (Object) null);
        int i2 = onTransact + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $canStart;
        int label;
        final /* synthetic */ LoanComparisonFunnelIntroFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(boolean z, LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$canStart = z;
            this.this$0 = loanComparisonFunnelIntroFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$canStart, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!this.$canStart) {
                    LoanComparisonFunnelIntroFragment.IAuthTabCallback(this.this$0);
                    return Unit.INSTANCE;
                }
                if (((Boolean) LoanFunnelNavigatorViewModel.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1268470641, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this.this$0.onTransact()}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1268470640)).booleanValue()) {
                    LoanComparisonFunnelIntroFragment.onExtraCallback(this.this$0);
                    return Unit.INSTANCE;
                }
                onCenterChanged oncenterchanged = onCenterChanged.IAuthTabCallback;
                oncenterchanged.onTransact("");
                oncenterchanged.readTypedObject();
                LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = this.this$0;
                this.label = 1;
                int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
                if (LoanComparisonFunnelIntroFragment.IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, this}, TossApplication.onSessionEnded.onExtraCallback(), 2026270764, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -2026270763) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 115;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onNavigationEvent + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                int i7 = IAuthTabCallback + 87;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private final void ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        startPostponedEnterTransition();
        asInterface().onExtraCallback(Long.valueOf(onTransact().IAuthTabCallback()));
        onTransact().ICustomTabsCallbackStub();
        onMinimized();
        int i4 = onTransact + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final Object onExtraCallback(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            startPostponedEnterTransition();
            Object objOnNavigationEvent = onNavigationEvent(access13800Var);
            if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
                int i3 = onTransact + 31;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }
            Unit unit = Unit.INSTANCE;
            int i5 = IAuthTabCallback_Parcel + 23;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
        startPostponedEnterTransition();
        onNavigationEvent(access13800Var);
        access14300.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Object onNavigationEvent(access13800<Object> access13800Var) {
        int i = 2 % 2;
        TraceDebugManagerIdeCommand traceDebugManagerIdeCommandAsBinder = asBinder();
        if (traceDebugManagerIdeCommandAsBinder != null) {
            int i2 = onTransact + 45;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            LinearLayout linearLayout = traceDebugManagerIdeCommandAsBinder.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            boolean z = false;
            linearLayout.setVisibility(0);
            LottieAnimationView lottieAnimationView = traceDebugManagerIdeCommandAsBinder.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(8);
            TdsImageView tdsImageView = traceDebugManagerIdeCommandAsBinder.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            tdsImageView.setVisibility(8);
            CreditLoanNeedsResponse creditLoanNeedsResponse = (CreditLoanNeedsResponse) onTransact().onNavigationEvent().getValue();
            String string = getString(R.string.loan_consent_title, new Object[]{PlayerErrorCode.onPostMessage()});
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = getString(R.string.loan_comparison_funnel_intro_bridge_subtitle_v2);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if ((creditLoanNeedsResponse != null ? creditLoanNeedsResponse.onWarmupCompleted() : null) != null) {
                int i4 = onTransact + 29;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
            ComposeView composeViewOnNavigationEvent = onNavigationEvent(access8100.onNavigationEvent(getWrite.IAuthTabCallback("LOAN_COMPARISON_ABTEST", "predict_model")));
            if (composeViewOnNavigationEvent != null) {
                int i6 = onTransact + 3;
                int i7 = i6 % 128;
                IAuthTabCallback_Parcel = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 45;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                return composeViewOnNavigationEvent;
            }
        }
        Object objOnNavigationEvent = onNavigationEvent("STD_FIND_MY_LOAN_ACTIVATION", (access13800<? super Unit>) access13800Var);
        if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i11 = onTransact + 77;
        IAuthTabCallback_Parcel = i11 % 128;
        if (i11 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        TraceDebugManagerIdeCommand traceDebugManagerIdeCommandAsBinder = loanComparisonFunnelIntroFragment.asBinder();
        if (traceDebugManagerIdeCommandAsBinder == null) {
            return null;
        }
        ComposeView composeView = traceDebugManagerIdeCommandAsBinder.IAuthTabCallback;
        Intrinsics.checkNotNull(composeView);
        composeView.setVisibility(0);
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1427747865, true, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda6(function2))));
        int i4 = onTransact + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return composeView;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback_Parcel + 77;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback_Parcel + 111;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1427747865, i, -1, "im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.showIntroComposeContent.<anonymous>.<anonymous>.<anonymous> (LoanComparisonFunnelIntroFragment.kt:201)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallback_Parcel + 121;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c2, code lost:
    
        r0 = im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.onTransact + 61;
        im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.IAuthTabCallback_Parcel = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cc, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r3.onNavigationEvent.setUpperGap(14);
        r3.onNavigationEvent.setTitleFont(o.response.Bold);
        r3.onNavigationEvent.setTitleSize(im.toss.tds.view.component.anim.top.AnimateTop.IAuthTabCallback.Size22);
        r0 = r3.onNavigationEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1.getResources().getDisplayMetrics(), "");
        r0.setMaxTitleSize(o.varyMatches.onNavigationEvent(25, r2));
        r3.onNavigationEvent.setSubtitleFont(o.response.Regular);
        r3.onNavigationEvent.setSubtitleSize(im.toss.tds.view.component.anim.top.AnimateTop.onExtraCallback.Size15);
        r0 = r3.onNavigationEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1.getResources().getDisplayMetrics(), "");
        r0.setMaxSubtitleSize(o.varyMatches.onNavigationEvent(17, r1));
        r0 = r3.onNavigationEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r5 = o.readTimeout.asInterface.onNavigationEvent.onWarmupCompleted;
        r1 = im.toss.tds.view.component.anim.text.AnimateText.onNavigationEvent.TOP_LEFT;
        im.toss.tds.view.component.anim.top.AnimateTop.onExtraCallback(r0, (o.getWriteTimeoutokhttp) null, new o.getWriteTimeoutokhttp.onWarmupCompleted(r4, r5, 0, r1, false, false, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, 500, (kotlin.jvm.internal.DefaultConstructorMarker) null), new o.getWriteTimeoutokhttp.onWarmupCompleted(r15, o.readTimeout.asInterface.onExtraCallback.onExtraCallbackWithResult, 300, r1, false, false, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, 496, (kotlin.jvm.internal.DefaultConstructorMarker) null), false, false, 25, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TraceDebugManagerIdeCommand traceDebugManagerIdeCommandAsBinder;
        LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = (LoanComparisonFunnelIntroFragment) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            traceDebugManagerIdeCommandAsBinder = loanComparisonFunnelIntroFragment.asBinder();
            int i3 = 71 / 0;
        } else {
            traceDebugManagerIdeCommandAsBinder = loanComparisonFunnelIntroFragment.asBinder();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(String str, access13800<? super Unit> access13800Var) {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i2 = iAuthTabCallbackDefault.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackDefault.label = i2 - 2147483648;
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackDefault.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallbackDefault.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            dismissLoadingIndicator();
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1012641L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            getDummyAd getdummyadIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            getResultEnumByWsMsg getresultenumbywsmsg = new getResultEnumByWsMsg(1289429L);
            String strICustomTabsCallback = onTransact().ICustomTabsCallback();
            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallbackDefault.label = 1;
            Object objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadIAuthTabCallbackDefault, contextRequireContext, str, strICustomTabsCallback, "loan_comparison", 69L, (Map) null, getresultenumbywsmsg, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, iAuthTabCallbackDefault, 8388512, (Object) null);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                int i4 = IAuthTabCallback_Parcel + 9;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 7 / 0;
                }
                return objOnWarmupCompleted;
            }
            obj = objOnExtraCallback;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = IAuthTabCallback_Parcel + 7;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        this.IAuthTabCallbackStub.onNavigationEvent((Intent) obj);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback_Parcel + 121;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private final ComposeView onNavigationEvent(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder();
            throw null;
        }
        TraceDebugManagerIdeCommand traceDebugManagerIdeCommandAsBinder = asBinder();
        if (traceDebugManagerIdeCommandAsBinder == null) {
            int i3 = IAuthTabCallback_Parcel + 83;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        ComposeView composeView = traceDebugManagerIdeCommandAsBinder.asInterface;
        composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1360815189, true, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda5(this, map))));
        return composeView;
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function1<r8lambda6V0YVgpvgCQzEji1GNetQSIYsE, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        IAuthTabCallbackStub(Object obj) {
            super(1, obj, LoanComparisonFunnelIntroFragment.class, "onTermsAgreementResult", "onTermsAgreementResult(Lim/toss/standardtermsv2/param/StandardTermsV2Result;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
            Object[] objArr = {(LoanComparisonFunnelIntroFragment) ((CallableReference) this).receiver, r8lambda6v0yvgpvgcqzeji1gnetqsiyse};
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            LoanComparisonFunnelIntroFragment.IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), 1550290155, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -1550290153);
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, Map map, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1677465182, i, -1, "im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.showLoanComparisonTermsOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoanComparisonFunnelIntroFragment.kt:249)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1431305500);
            float fC_ = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_((int) ((getSurfaceEdge) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.extraCallbackWithResult())).onWarmupCompleted());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.6f * fC_), 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanComparisonFunnelIntroFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i3 = onTransact + 95;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new IAuthTabCallbackStub(loanComparisonFunnelIntroFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    int i5 = onTransact + 49;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                }
                hasVideoUrl.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fC_ * 0.5f), 1, (Object) null), "STD_129_LOAN_RESULT_EXAMPLE_MOCKUP_CTA_SHORTEN", loanComparisonFunnelIntroFragment.onTransact().ICustomTabsCallback(), "loan_comparison", 69L, map, (setHasShown) null, (StandardTermsV2CustomVariable[]) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, (access5300) objOnMinimized, Float.valueOf(0.1f), (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, (StandardTermsV2YouthRegisterParam) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getRawFullResponse) null, cameraCaptureResultEmptyCameraCaptureResult, 27696, 384, 1042368);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, Map map, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel;
        int i4 = i3 + 21;
        onTransact = i4 % 128;
        boolean z = false;
        if (i4 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 5) {
            int i5 = i3 + 1;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onTransact + 59;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1360815189, i, -1, "im.toss.features.loan.comparison.funnel.LoanComparisonFunnelIntroFragment.showLoanComparisonTermsOverlay.<anonymous>.<anonymous>.<anonymous> (LoanComparisonFunnelIntroFragment.kt:248)");
            }
            y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, ForwardingCameraControl.onExtraCallback(1677465182, true, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda2(loanComparisonFunnelIntroFragment, map), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        startPostponedEnterTransition();
        LoanComparisonCreditActivity.onExtraCallbackWithResult onextracallbackwithresult = LoanComparisonCreditActivity.Companion;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        startActivity(LoanComparisonCreditActivity.onExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult, contextRequireContext, (String) null, false, false, (String) null, false, onTransact().ICustomTabsCallback(), onTransact().extraCallbackWithResult(), (String) null, false, 830, (Object) null));
        extraCallback();
        int i4 = onTransact + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onActivityLayout() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onNavigationEvent(this, new LoanComparisonFunnelIntroFragment$.ExternalSyntheticLambda4(this));
        int i2 = onTransact + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            loanComparisonFunnelIntroFragment.extraCallback();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        loanComparisonFunnelIntroFragment.extraCallback();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            dismissLoadingIndicator();
            RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanComparisonFunnelJobInputFragment);
            int i3 = IAuthTabCallback_Parcel + 93;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        dismissLoadingIndicator();
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanComparisonFunnelJobInputFragment);
        throw null;
    }

    public static final class IAuthTabCallback implements Function1<Boolean, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public IAuthTabCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(Boolean bool) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool2 = bool;
            LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment = LoanComparisonFunnelIntroFragment.this;
            Intrinsics.checkNotNull(bool2);
            LoanComparisonFunnelIntroFragment.onNavigationEvent(loanComparisonFunnelIntroFragment, bool2.booleanValue());
            int i4 = onExtraCallback + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class asBinder implements Function1<Boolean, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public asBinder() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallbackWithResult(Boolean bool) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                LoanComparisonFunnelIntroFragment.onWarmupCompleted(LoanComparisonFunnelIntroFragment.this);
            } else {
                LoanComparisonFunnelIntroFragment.onWarmupCompleted(LoanComparisonFunnelIntroFragment.this);
                throw null;
            }
        }
    }

    public static final /* synthetic */ Object onWarmupCompleted(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, access13800 access13800Var) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, access13800Var}, TossApplication.onSessionEnded.onExtraCallback(), 2026270764, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -2026270763);
    }

    public static final /* synthetic */ void onNavigationEvent(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), 1550290155, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -1550290153);
    }

    private static final Unit IAuthTabCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, boolean z) {
        Object[] objArr = {loanComparisonFunnelIntroFragment, Boolean.valueOf(z)};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), -1114954976, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1114954982);
    }

    private final void onWarmupCompleted(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossApplication.onSessionEnded.onExtraCallback(), -1680449357, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1680449360);
    }

    private final Unit onExtraCallbackWithResult(String str, String str2) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this, str, str2}, TossApplication.onSessionEnded.onExtraCallback(), 231744936, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -231744931);
    }

    private static final Unit onExtraCallbackWithResult(CreditLoanNeedsResponse creditLoanNeedsResponse, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {creditLoanNeedsResponse, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), objArr, TossApplication.onSessionEnded.onExtraCallback(), -1519024427, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, 1519024427);
    }

    private final ComposeView IAuthTabCallback(Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (ComposeView) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{this, function2}, TossApplication.onSessionEnded.onExtraCallback(), 706685269, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -706685265);
    }

    private static final Unit onExtraCallback(LoanComparisonFunnelIntroFragment loanComparisonFunnelIntroFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) IAuthTabCallback(TossApplication.onSessionEnded.onExtraCallback(), new Object[]{loanComparisonFunnelIntroFragment, commonModule_setLeftEdgeTouchEnabled}, TossApplication.onSessionEnded.onExtraCallback(), 571399897, TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback, -571399890);
    }
}
