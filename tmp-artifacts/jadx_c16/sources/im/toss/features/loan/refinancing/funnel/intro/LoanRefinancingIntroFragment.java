package im.toss.features.loan.refinancing.funnel.intro;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.Html;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.internal.ads.zziea;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelBaseFragment;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingViewModel;
import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment$;
import im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment$openLoanRefinancingTerms$1$;
import im.toss.features.loan.ui.R;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinBroadcastManager;
import o.AppLovinNativeAdImplExternalSyntheticLambda10;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinNativeAdImplc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda4;
import o.ConvertByteArrayToFloatArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERSet;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExifSpeedConverter;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.IdGeneratorExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageCapturePixelHDRPlusQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PageRenderReadyListener;
import o.PixelCopyCompatPixelCopyStubExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ReadonlySnapshot;
import o.RequestOptionConfigBuilderExternalSyntheticLambda0;
import o.RippleNode;
import o.SnapshotKtExternalSyntheticLambda0;
import o.SnapshotStateListExternalSyntheticLambda0;
import o.SnapshotStateObserverExternalSyntheticLambda0;
import o.SurfaceProcessorNode;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda7;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextLinkScopeExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access13600;
import o.access13800;
import o.access14300;
import o.accessgetCameraFactoryp;
import o.addAllCommandLine;
import o.addCameraErrorListener;
import o.addFixedPosition;
import o.areAllItemsEnabled;
import o.attachTimestamp;
import o.bindChildren;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.clearValueCallback;
import o.clearWrite;
import o.component5;
import o.createCameraCaptureCallback;
import o.delete;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCheckSumOctalBytes;
import o.getCompoundPaddingRight;
import o.getDevBrand;
import o.getHighestSurfacePriority;
import o.getHostnameVerifierokhttp;
import o.getHumanReadableName;
import o.getPackageType;
import o.getParentMetadataCallback;
import o.getSubtitle;
import o.getSupportedHighSpeedResolutions;
import o.getSurfaceSize;
import o.getViewTypeCount;
import o.handshake;
import o.hasMoreElements;
import o.hasProvider;
import o.immediateFailedFuture;
import o.isZslDisabledByByUserCaseConfig;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.onQueryRefine;
import o.preFillDefault;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI;
import o.requestClose;
import o.requestPostMessageChannel;
import o.resolveQuirkNames;
import o.searchRecordResource;
import o.seek;
import o.setAdVideoPlaybackListener;
import o.setApTextSize;
import o.setCallToAction;
import o.setContentInsetsAbsolute;
import o.setRandomHost;
import o.setRubIn;
import o.showAndRender;
import o.t7ExternalSyntheticLambda0;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u3;
import o.u4;
import o.use;
import o.w2;
import o.w3b;
import o.w4;
import o.w5a;
import o.wa;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanCompany;
import viva.republica.toss.network.model.loan.LoanPartnerCategory;
import viva.republica.toss.network.model.loan.LoanRefinancingAvailableStatus;
import viva.republica.toss.network.model.loan.LoanRefinancingIntro;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanRefinancingIntroFragment extends Hilt_LoanRefinancingIntroFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static boolean access000 = false;
    private static int access100 = 0;
    private static char[] asBinder = null;
    private static int extraCallback = 1;
    private static boolean getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent;
    public static final int onWarmupCompleted;
    private Function0<Unit> onExtraCallback;
    private final Lazy onTransact;
    private int IAuthTabCallback = R.layout.fragment_loan_refinancing_intro;
    private final PageRenderReadyListener onExtraCallbackWithResult = preFillDefault.IAuthTabCallback(this, IAuthTabCallback.onNavigationEvent);

    static final /* synthetic */ class onExtraCallback implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ Function1 IAuthTabCallback;

        onExtraCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof TextLinkScopeExternalSyntheticLambda0)) {
                return false;
            }
            int i2 = onNavigationEvent + 53;
            onExtraCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof FunctionAdapter;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return zAreEqual;
            }
            throw null;
        }

        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.IAuthTabCallback;
            int i5 = i3 + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
            return iHashCode;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        onExtraCallback();
        onNavigationEvent = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanRefinancingIntroFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingIntroBinding;", 0)};
        onWarmupCompleted = 8;
        int i = IAuthTabCallback_Parcel + 45;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(loanRefinancingIntroFragment);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitAsBinder;
    }

    private static final Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, String str, String str2, String str3, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 81;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        loanRefinancingIntroFragment.onWarmupCompleted(str, str2, str3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, String str, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingIntroFragment, str, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 111;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access100 + 89;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 9;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, iOnExtraCallback3, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback4, 1670321898, -1670321893);
        int i5 = access100 + 51;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        String str = (String) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 288467700, -288467688);
            int i3 = 52 / 0;
        } else {
            unit = (Unit) onExtraCallbackWithResult(new Object[]{str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 288467700, -288467688);
        }
        int i4 = access100 + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 21;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = access100 + 81;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        String str = (String) objArr[0];
        y1a y1aVar = (y1a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = access100 + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        u4 u4Var = (u4) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {loanRefinancingIntroFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(objArr2, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -534823530, 534823533);
        int i4 = access100 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(loanRefinancingIntroFragment);
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 73;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -1893372685, 1893372689);
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int i5 = 96 / 0;
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback3, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback4, -1893372685, 1893372689);
    }

    private static final Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 111;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -847695580, 847695580);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStubProxy + 109;
        access100 = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 109;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, str2, str3, str4, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = access100 + 27;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, setRubIn setrubin, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 93;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanRefinancingIntroFragment, setrubin, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access100 + 49;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(loanRefinancingIntroFragment, loanRefinancingAvailableStatus);
        }
        IAuthTabCallback(loanRefinancingIntroFragment, loanRefinancingAvailableStatus);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 975328972, -975328962);
        int i5 = access100 + 39;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        asInterface(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        int i7;
        int i8 = ~i6;
        int i9 = ~(i8 | i5);
        int i10 = ~i;
        int i11 = ~(i10 | i5);
        int i12 = i9 | i11;
        int i13 = ~i5;
        int i14 = ~(i13 | i6);
        int i15 = (~(i | i8)) | i14 | i11;
        int i16 = (~(i10 | i6)) | (~(i13 | i10)) | i14;
        int i17 = i5 + i6 + i4 + ((-954185507) * i3) + (2055044340 * i2);
        int i18 = i17 * i17;
        int i19 = (i5 * 1290134917) + 267690129 + (i6 * 1290136780) + (i12 * (-1242)) + (i15 * 621) + (i16 * 621) + (1290136159 * i4) + (826674179 * i3) + (1594648204 * i2) + (i18 * 572063744);
        switch (((1110557339 * i5) - 760807424) + ((-878567756) * i6) + ((-1537228134) * i12) + (i15 * 768614067) + (768614067 * i16) + ((-1647181824) * i4) + (1313472512 * i3) + (606601216 * i2) + ((-1232666624) * i18) + (i19 * i19 * 607715328)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
                u4 u4Var = (u4) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i20 = 2 % 2;
                int i21 = access100 + 53;
                IAuthTabCallbackStubProxy = i21 % 128;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(u4Var, "");
                    if ((iIntValue & 98) == 0) {
                        iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(u4Var, "");
                    if ((iIntValue & 6) == 0) {
                    }
                }
                if ((iIntValue & 19) != 18) {
                    int i22 = IAuthTabCallbackStubProxy + 113;
                    access100 = i22 % 128;
                    int i23 = i22 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i24 = IAuthTabCallbackStubProxy + 21;
                        access100 = i24 % 128;
                        int i25 = i24 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(797585309, iIntValue, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen.<anonymous>.<anonymous>.<anonymous> (LoanRefinancingIntroFragment.kt:162)");
                        int i26 = IAuthTabCallbackStubProxy + 125;
                        access100 = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_cta, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanRefinancingIntroFragment);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnExtraCallback) {
                        Object obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            LoanRefinancingIntroFragment$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new LoanRefinancingIntroFragment$.ExternalSyntheticLambda14(loanRefinancingIntroFragment);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                            obj = externalSyntheticLambda14;
                        }
                        u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, iIntValue & 14, 1014);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i28 = access100 + 103;
                            IAuthTabCallbackStubProxy = i28 % 128;
                            int i29 = i28 % 2;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                int i30 = 2 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent((QuirksExternalSyntheticBackport0) objArr[1], (Function1) null, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda13(), 1, (Object) null);
                int i31 = IAuthTabCallbackStubProxy + 119;
                access100 = i31 % 128;
                int i32 = i31 % 2;
                return quirksExternalSyntheticBackport0OnNavigationEvent;
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return onTransact(objArr);
            case 11:
                LoanRefinancingIntroFragment loanRefinancingIntroFragment2 = (LoanRefinancingIntroFragment) objArr[0];
                int i33 = 2 % 2;
                int i34 = access100 + 87;
                IAuthTabCallbackStubProxy = i34 % 128;
                int i35 = i34 % 2;
                loanRefinancingIntroFragment2.onExtraCallbackWithResult();
                Unit unit = Unit.INSTANCE;
                int i36 = access100 + 89;
                IAuthTabCallbackStubProxy = i36 % 128;
                int i37 = i36 % 2;
                return unit;
            case 12:
                String str = (String) objArr[0];
                w5a w5aVar = (w5a) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i38 = 2 % 2;
                int i39 = IAuthTabCallbackStubProxy + 71;
                access100 = i39 % 128;
                if (i39 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(w5aVar, "");
                    if ((iIntValue2 & 30) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(w5aVar)) {
                            int i40 = access100 + 33;
                            int i41 = i40 % 128;
                            IAuthTabCallbackStubProxy = i41;
                            i7 = i40 % 2 == 0 ? 3 : 4;
                            int i42 = i41 + 105;
                            access100 = i42 % 128;
                            int i43 = i42 % 2;
                        } else {
                            i7 = 2;
                        }
                        iIntValue2 |= i7;
                        int i44 = IAuthTabCallbackStubProxy + 31;
                        access100 = i44 % 128;
                        int i45 = i44 % 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(w5aVar, "");
                    if ((iIntValue2 & 6) == 0) {
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(!((iIntValue2 & 19) == 18), iIntValue2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-320146862, iIntValue2, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row1BRightBadgeListRow.<anonymous> (LoanRefinancingIntroFragment.kt:507)");
                    }
                    w5aVar.onExtraCallback(ForwardingCameraControl.onExtraCallback(1044208282, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda20(str), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, ((iIntValue2 << 3) & 112) | 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    int i46 = access100 + 45;
                    IAuthTabCallbackStubProxy = i46 % 128;
                    if (i46 % 2 == 0) {
                        int i47 = 3 / 2;
                    }
                }
                return Unit.INSTANCE;
            case 13:
                return asInterface(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanRefinancingIntroFragment};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        if (i3 != 0) {
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, -866910391, 866910402);
        int i4 = access100 + 47;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 81;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, th}, iOnExtraCallback3, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback4, -135406773, 135406786);
        int i3 = access100 + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return unit;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 97;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access100 + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(loanRefinancingIntroFragment, bool);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingIntroFragment, bool);
        int i3 = access100 + 61;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1081444246, -1081444237);
        }
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, String str, String str2, String str3, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = access100 + 109;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanRefinancingIntroFragment, str, str2, str3, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = access100 + 5;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(loanRefinancingIntroFragment, th);
        }
        onExtraCallback(loanRefinancingIntroFragment, th);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 87;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return onWarmupCompleted(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 43;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        loanRefinancingIntroFragment.onWarmupCompleted(quirksExternalSyntheticBackport0, str, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStubProxy + 125;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, setRubIn setrubin, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 123;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        loanRefinancingIntroFragment.IAuthTabCallback((setRubIn<getDevBrand>) setrubin, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 35;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(loanRefinancingIntroFragment);
        int i4 = access100 + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 9;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            asBinder(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAsBinder = asBinder(loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access100 + 53;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = access100 + 59;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 54 / 0;
        }
        int i8 = IAuthTabCallbackStubProxy + 119;
        access100 = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = access100 + 53;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            loanRefinancingIntroFragment.IAuthTabCallback(quirksExternalSyntheticBackport0, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            loanRefinancingIntroFragment.IAuthTabCallback(quirksExternalSyntheticBackport0, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 75;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(loanRefinancingIntroFragment, quirksExternalSyntheticBackport0, str, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 13;
        access100 = i5 % 128;
        loanRefinancingIntroFragment.onNavigationEvent(quirksExternalSyntheticBackport0, str, str2, str3, str4, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStubProxy + 27;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, setRubIn setrubin, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 5;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(loanRefinancingIntroFragment, setrubin, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanRefinancingIntroFragment, setrubin, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 119;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access100 + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 81;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(str, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(str, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 91;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public LoanRefinancingIntroFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asInterface(new onNavigationEvent(this)));
        this.onTransact = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(LoanRefinancingIntroViewModel.class), new onTransact(lazyOnNavigationEvent), new IAuthTabCallbackDefault(null, lazyOnNavigationEvent), new IAuthTabCallbackStub(this, lazyOnNavigationEvent));
    }

    public static final /* synthetic */ void onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroFragment.onWarmupCompleted(r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 111;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutions, f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, long j, Function1 function1) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroFragment.onExtraCallback(j, function1);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = access100 + 115;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 3;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.IAuthTabCallback;
        int i5 = i3 + 57;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, searchRecordResource> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 27;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        IAuthTabCallback() {
            super(1, searchRecordResource.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/FragmentLoanRefinancingIntroBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            searchRecordResource searchrecordresourceOnNavigationEvent = onNavigationEvent((View) obj);
            int i4 = onExtraCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return searchrecordresourceOnNavigationEvent;
        }

        public final searchRecordResource onNavigationEvent(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            searchRecordResource searchrecordresourceOnWarmupCompleted = searchRecordResource.onWarmupCompleted(view);
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return searchrecordresourceOnWarmupCompleted;
            }
            throw null;
        }
    }

    private final searchRecordResource asInterface() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        } else {
            pageRenderReadyListener = this.onExtraCallbackWithResult;
            addallcommandline = onNavigationEvent[0];
        }
        return pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
    }

    private final LoanRefinancingIntroViewModel asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingIntroViewModel loanRefinancingIntroViewModel = (LoanRefinancingIntroViewModel) this.onTransact.getValue();
        int i4 = IAuthTabCallbackStubProxy + 73;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return loanRefinancingIntroViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.base.BaseFragment*/.onCreate(bundle);
            asBinder().IAuthTabCallbackDefault();
        } else {
            super/*im.toss.base.BaseFragment*/.onCreate(bundle);
            asBinder().IAuthTabCallbackDefault();
            throw null;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function0<Fragment> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Fragment onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Fragment fragment = this.$this_viewModels;
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return fragment;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted();
            int i4 = IAuthTabCallback + 41;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda0OnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 androidTextContextMenuToolbarProviderExternalSyntheticLambda0 = (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
            int i3 = IAuthTabCallback + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda0;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6;
            int i = 2 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = IAuthTabCallback + 3;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            if (!(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6)) {
                textFieldKeyInputExternalSyntheticLambda6 = null;
            } else {
                int i6 = IAuthTabCallback + 5;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            }
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = null;
            if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                int i4 = onWarmupCompleted + 81;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    textFieldKeyInputExternalSyntheticLambda6.hashCode();
                    throw null;
                }
                textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent;
            }
            if (textFieldKeyInputExternalSyntheticLambda6 != null && (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            int i5 = onWarmupCompleted + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return defaultViewModelProviderFactory2;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult();
            }
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
            int i3 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return viewModelStore;
            }
            throw null;
        }
    }

    private static final Unit asInterface(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access100 + 7;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = access100 + 27;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1884767945, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (LoanRefinancingIntroFragment.kt:109)");
            }
            loanRefinancingIntroFragment.IAuthTabCallback((setRubIn<getDevBrand>) LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1735973128, new Object[]{loanRefinancingIntroFragment.asBinder()}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1735973129, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i3 = access100 + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = access100 + 121;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(998513631, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.onViewCreated.<anonymous>.<anonymous> (LoanRefinancingIntroFragment.kt:108)");
                int i6 = access100 + 109;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1884767945, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda3(loanRefinancingIntroFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = access100 + 65;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2003881189, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.onViewCreated.<anonymous> (LoanRefinancingIntroFragment.kt:107)");
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], ForwardingCameraControl.onExtraCallback(998513631, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda30(loanRefinancingIntroFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallbackStubProxy + 69;
                access100 = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = IAuthTabCallbackStubProxy + 65;
                access100 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ComposeView composeView;
        ComposeView composeView2;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            IAuthTabCallbackStub();
            asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStub();
        searchRecordResource searchrecordresourceAsInterface = asInterface();
        if (searchrecordresourceAsInterface != null && (composeView2 = searchrecordresourceAsInterface.onWarmupCompleted) != null) {
            int i3 = IAuthTabCallbackStubProxy + 69;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            composeView2.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
        }
        searchRecordResource searchrecordresourceAsInterface2 = asInterface();
        if (searchrecordresourceAsInterface2 != null && (composeView = searchrecordresourceAsInterface2.onWarmupCompleted) != null) {
            composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(2003881189, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda4(this))));
            int i5 = access100 + 101;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        asBinder().IAuthTabCallbackStub();
        int i7 = IAuthTabCallbackStubProxy + 63;
        access100 = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1763391627);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1763391627);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1763391627, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.alphaTranslateModifier.<anonymous> (LoanRefinancingIntroFragment.kt:117)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized2;
        getCompoundPaddingRight getcompoundpaddingrightOnExtraCallback = onQueryRefine.onExtraCallback(0.5f, 400.0f, (Object) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getcompoundpaddingrightOnExtraCallback);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!(zOnExtraCallback | zOnNavigationEvent)) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized3 = new onWarmupCompleted(findresandmsg, getcompoundpaddingrightOnExtraCallback, getsupportedhighspeedresolutions, (access13800) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, IAuthTabCallback(getsupportedhighspeedresolutions), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, false, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 524283, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallbackStubProxy + 75;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static final Unit asBinder(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 67;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access100 + 93;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackStubProxy + 89;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(47306373, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen.<anonymous> (LoanRefinancingIntroFragment.kt:141)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(loanRefinancingIntroFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i7 = IAuthTabCallbackStubProxy + 103;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    LoanRefinancingIntroFragment$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new LoanRefinancingIntroFragment$.ExternalSyntheticLambda21(loanRefinancingIntroFragment);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                    obj = externalSyntheticLambda21;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = IAuthTabCallbackStubProxy + 57;
                    access100 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, String str, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 17) != 16) {
            int i3 = access100 + 17;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1773609081, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen.<anonymous>.<anonymous>.<anonymous> (LoanRefinancingIntroFragment.kt:153)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 7, (Object) null);
            String string = loanRefinancingIntroFragment.getString(R.string.loan_application_remain_this_much, new Object[]{str});
            Intrinsics.checkNotNullExpressionValue(string, "");
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{string, quirksExternalSyntheticBackport0OnExtraCallback, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 131068}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = access100 + 1;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = access100 + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{loanRefinancingIntroFragment.asBinder(), true}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        } else {
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{loanRefinancingIntroFragment.asBinder(), true}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        loanRefinancingIntroFragment.access100().onNavigationEvent();
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 76, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 77 - View.MeasureSpec.getSize(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 75, 16037 - ((Process.getThreadPriority(0) + 20) >> 6), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (getInterfaceDescriptor) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), AndroidCharacter.getMirror('0') + 15, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $10 + 111;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!access000) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 27;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted % 0;
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 55;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 63 - TextUtils.getOffsetAfter("", 0), 12214 - Drawable.resolveOpacity(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 63 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionGroup(0L) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote;
        boolean z = false;
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = IAuthTabCallbackStubProxy + 61;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i7 = access100 + 87;
            IAuthTabCallbackStubProxy = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(950226951, iIntValue, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen.<anonymous> (LoanRefinancingIntroFragment.kt:148)");
            }
            String strOnTransact = loanRefinancingIntroFragment.onTransact();
            if (strOnTransact != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2050035118);
                getBacktraceNote getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(1773609081, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda5(loanRefinancingIntroFragment, strOnTransact), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote = getbacktracenoteOnExtraCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2049689034);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenote = null;
            }
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(797585309, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda6(loanRefinancingIntroFragment), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, getbacktracenote, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4027);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment, setRubIn setrubin, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        Throwable th;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        String strOnExtraCallbackWithResult;
        String str;
        String strIAuthTabCallback;
        int i5 = 2 % 2;
        int i6 = access100 + 23;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            z = (i & 49) != 36;
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(243356856, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen.<anonymous> (LoanRefinancingIntroFragment.kt:175)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback((QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1979871561, -1979871555), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = IAuthTabCallbackStubProxy + 29;
                access100 = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_title_benefit, cameraCaptureResultEmptyCameraCaptureResult, 0), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResult, 384, 1}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -847695580, 847695580);
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-113, -117, -124, -111, -118, -126, -113, -109, -119, -108, -109, -125, -112, -120, -113, -121, -112, -125, -116, -110, -111, -112, -113, -120, -117, -119, -122, -114, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted = RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(((String) objArr[0]).intern())), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 62).onWarmupCompleted();
            ReadonlySnapshot.IAuthTabCallback(composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted, setAdVideoPlaybackListener.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(263.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(263.0f)), "LottieAnimation", (Object) null, showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2OnWarmupCompleted)), false, false, (SnapshotKtExternalSyntheticLambda0) null, 0.0f, Integer.MAX_VALUE, false, false, false, false, (RenderMode) null, false, false, (SnapshotStateObserverExternalSyntheticLambda0) null, (QuirkSettingsLoader) null, immediateFailedFuture.Companion.asBinder(), false, false, (Map) null, false, (ComposableLambdaImplExternalSyntheticLambda4) null, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 1572864, 0, 4128700);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_inquiry_at_once, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strIAuthTabCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.loan_compare_numbers_of_partners, new Object[]{Integer.valueOf(DERSet.onExtraCallback.MediaDescriptionCompat())}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -103, -113, -121, -104, -112, -113, -117, -119, -120, -122, -105, -106, -122, -107, -113, -125, -122, -124, -113, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, KeyEvent.getDeadChar(0, 0) + 127, objArr2);
            loanRefinancingIntroFragment.onWarmupCompleted(((String) objArr2[0]).intern(), strOnExtraCallback, strIAuthTabCallback2, cameraCaptureResultEmptyCameraCaptureResult, 6);
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_guide_credit_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_guide_credit_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object[] objArr3 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -103, -119, -109, -127, -119, -112, -109, -114, -121, -108, -107, -112, -126, -120, -114, -109, -108, -119, -112, -113, -117, -119, -120, -122, -105, -106, -122, -107, -113, -125, -122, -124, -113, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, objArr3);
            loanRefinancingIntroFragment.onWarmupCompleted(((String) objArr3[0]).intern(), strOnExtraCallback2, strOnExtraCallback3, cameraCaptureResultEmptyCameraCaptureResult, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(47.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_guide_header_title, cameraCaptureResultEmptyCameraCaptureResult, 0), Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 0, 5}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -847695580, 847695580);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(135.0f));
            Object[] objArr4 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -107, -113, -125, -121, -112, -98, -99, -100, -101, -102, -110, -122, -124, -120, -111, -117, -116, -109, -112, -114, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr4);
            AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr4[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 508);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            String strOnExtraCallback4 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_without_complicated_documents, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strOnExtraCallback5 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_just_input_simple_data, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object[] objArr5 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -109, -110, -97, -104, -112, -124, -109, -113, -120, -97, -112, -103, -119, -109, -127, -119, -112, -126, -113, -109, -116, -110, -119, -117, -114, -112, -113, -117, -119, -120, -122, -105, -106, -122, -107, -113, -125, -122, -124, -113, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
            loanRefinancingIntroFragment.onWarmupCompleted(((String) objArr5[0]).intern(), strOnExtraCallback4, strOnExtraCallback5, cameraCaptureResultEmptyCameraCaptureResult, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            String strOnExtraCallback6 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_without_offline_visit, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strOnExtraCallback7 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_online_application_possible, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object[] objArr6 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -109, -97, -120, -104, -117, -116, -112, -109, -113, -117, -127, -125, -112, -113, -117, -119, -120, -122, -105, -106, -122, -107, -113, -125, -122, -124, -113, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - Color.red(0), objArr6);
            loanRefinancingIntroFragment.onWarmupCompleted(((String) objArr6[0]).intern(), strOnExtraCallback6, strOnExtraCallback7, cameraCaptureResultEmptyCameraCaptureResult, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            String strOnExtraCallback8 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_guide_interest_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strOnExtraCallback9 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_intro_guide_interest_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object[] objArr7 = new Object[1];
            a(null, null, new byte[]{-107, -113, -125, -118, -113, -109, -109, -108, -107, -112, -127, -119, -108, -121, -109, -124, -112, -107, -121, -104, -112, -96, -109, -113, -117, -116, -112, -113, -117, -119, -120, -122, -105, -106, -122, -107, -113, -125, -122, -124, -113, -117, -119, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
            loanRefinancingIntroFragment.onWarmupCompleted(((String) objArr7[0]).intern(), strOnExtraCallback8, strOnExtraCallback9, cameraCaptureResultEmptyCameraCaptureResult, 6);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(63.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-279952022);
            String strOnTransact = loanRefinancingIntroFragment.onTransact();
            if (strOnTransact != null) {
                onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, null, DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.loan_refinancing_remain_time, new Object[]{strOnTransact}, cameraCaptureResultEmptyCameraCaptureResult, 0), Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 0, 5}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -847695580, 847695580);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(135.0f));
                Object[] objArr8 = new Object[1];
                a(null, null, new byte[]{-107, -113, -125, -118, -97, -97, -120, -126, -124, -112, -121, -109, -108, -121, -112, -113, -117, -95, -112, -103, -119, -117, -97, -119, -122, -114, -115, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr8);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr8[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault2, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 54, 508);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 8, (Object) null), onextracallbackwithresult.onTransact());
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-279927108);
                hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                iAuthTabCallback.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_is, cameraCaptureResultEmptyCameraCaptureResult, 0));
                iAuthTabCallback.IAuthTabCallback(" ");
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-279921744);
                int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(0L, 0L, GraphicDeviceInfo.Companion.IAuthTabCallback(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65531, (DefaultConstructorMarker) null));
                try {
                    iAuthTabCallback.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.loan_possible_time_from_to, new Object[]{9, 16}, cameraCaptureResultEmptyCameraCaptureResult, 0));
                    Unit unit = Unit.INSTANCE;
                    iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    iAuthTabCallback.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_can_use_this_sentence_end, cameraCaptureResultEmptyCameraCaptureResult, 0));
                    hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i4 = 1;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback, (getHumanReadableName) null, 0L, jOnExtraCallback, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, fIAuthTabCallback, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 805330944, 0, 261612);
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    i3 = 6;
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(72.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                } catch (Throwable th2) {
                    iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                    throw th2;
                }
            } else {
                i3 = 6;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i4 = 1;
            }
            Unit unit2 = Unit.INSTANCE;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_refinancing_available_loan_types, cameraCaptureResultEmptyCameraCaptureResult2, 0), Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 0, 5}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -847695580, 847695580);
            String strOnExtraCallback10 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_credit_loan, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int i9 = R.string.loan_possible;
            loanRefinancingIntroFragment.onWarmupCompleted(null, strOnExtraCallback10, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i9, cameraCaptureResultEmptyCameraCaptureResult2, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            loanRefinancingIntroFragment.onWarmupCompleted(null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_overdraft_account, cameraCaptureResultEmptyCameraCaptureResult2, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i9, cameraCaptureResultEmptyCameraCaptureResult2, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            loanRefinancingIntroFragment.onWarmupCompleted(null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_card_loan, cameraCaptureResultEmptyCameraCaptureResult2, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i9, cameraCaptureResultEmptyCameraCaptureResult2, 0), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-279880776);
            getDevBrand getdevbrand = (getDevBrand) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(setrubin, (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 7).onExtraCallbackWithResult();
            if (getdevbrand.onExtraCallback() == null || getdevbrand.onExtraCallbackWithResult() == null) {
                th = null;
                i2 = 2;
            } else {
                int i10 = access100 + 13;
                IAuthTabCallbackStubProxy = i10 % 128;
                i2 = 2;
                int i11 = i10 % 2;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f)), cameraCaptureResultEmptyCameraCaptureResult2, i3);
                onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_partners_label, cameraCaptureResultEmptyCameraCaptureResult2, 0), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), cameraCaptureResultEmptyCameraCaptureResult, 384, Integer.valueOf(i4)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -847695580, 847695580);
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-279866358);
                for (LoanPartnerCategory loanPartnerCategory : getdevbrand.onExtraCallback().onNavigationEvent()) {
                    loanRefinancingIntroFragment.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, loanPartnerCategory.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), cameraCaptureResultEmptyCameraCaptureResult2, i3);
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-279855375);
                    boolean z2 = i4;
                    for (List list : CollectionsKt.windowed(loanPartnerCategory.onNavigationEvent(), 2, 2, z2)) {
                        LoanCompany loanCompany = (LoanCompany) CollectionsKt.first(list);
                        LoanCompany loanCompany2 = (LoanCompany) CollectionsKt.lastOrNull(list);
                        if (Intrinsics.areEqual(loanCompany.IAuthTabCallback(), loanCompany2 != null ? loanCompany2.IAuthTabCallback() : null) && Intrinsics.areEqual(loanCompany.onExtraCallbackWithResult(), loanCompany2.onExtraCallbackWithResult())) {
                            loanCompany2 = null;
                        }
                        String strOnExtraCallbackWithResult2 = loanCompany.onExtraCallbackWithResult();
                        String strIAuthTabCallback3 = loanCompany.IAuthTabCallback();
                        if (loanCompany2 != null) {
                            strOnExtraCallbackWithResult = loanCompany2.onExtraCallbackWithResult();
                        } else {
                            int i12 = IAuthTabCallbackStubProxy + 5;
                            access100 = i12 % 128;
                            int i13 = i12 % 2;
                            strOnExtraCallbackWithResult = null;
                        }
                        if (loanCompany2 != null) {
                            int i14 = access100 + 119;
                            IAuthTabCallbackStubProxy = i14 % 128;
                            if (i14 % 2 == 0) {
                                strIAuthTabCallback = loanCompany2.IAuthTabCallback();
                                int i15 = 66 / 0;
                            } else {
                                strIAuthTabCallback = loanCompany2.IAuthTabCallback();
                            }
                            str = strIAuthTabCallback;
                        } else {
                            str = null;
                        }
                        loanRefinancingIntroFragment.onNavigationEvent((QuirksExternalSyntheticBackport0) null, strOnExtraCallbackWithResult2, strIAuthTabCallback3, strOnExtraCallbackWithResult, str, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i4 = z2 ? 1 : 0;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f)), cameraCaptureResultEmptyCameraCaptureResult2, i3);
                th = null;
                getCheckSumOctalBytes.onExtraCallback.onWarmupCompleted(PixelCopyCompatPixelCopyStubExternalSyntheticLambda0.onExtraCallback(getdevbrand.onExtraCallbackWithResult().onNavigationEvent(), 0, (Html.ImageGetter) null, (Html.TagHandler) null), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(108.0f)), cameraCaptureResultEmptyCameraCaptureResult2, i3);
            }
            Unit unit3 = Unit.INSTANCE;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            th = null;
            i2 = 2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit4 = Unit.INSTANCE;
        int i16 = IAuthTabCallbackStubProxy + 109;
        access100 = i16 % 128;
        if (i16 % i2 == 0) {
            return unit4;
        }
        throw th;
    }

    public final void IAuthTabCallback(@NotNull setRubIn<getDevBrand> setrubin, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStubProxy + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(setrubin, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-947649231);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setrubin) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access100 + 3;
                IAuthTabCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-947649231, i2, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.LoanRefinancingIntroScreen (LoanRefinancingIntroFragment.kt:134)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new LoanRefinancingIntroFragment$.ExternalSyntheticLambda15(this);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                int i8 = access100 + 27;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
            }
            requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(47306373, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda16(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, ForwardingCameraControl.onExtraCallback(950226951, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda17(this), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(243356856, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda18(this, setrubin), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 24960, 48, 2027}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda19(this, setrubin, i));
        }
    }

    private final String onTransact() {
        Date date;
        Date date2;
        int i = 2 % 2;
        getDevBrand getdevbrand = (getDevBrand) ((setRubIn) LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1735973128, new Object[]{asBinder()}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1735973129, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent())).IAuthTabCallback();
        LoanRefinancingIntro loanRefinancingIntroOnExtraCallback = getdevbrand.onExtraCallback();
        String strOnExtraCallback = loanRefinancingIntroOnExtraCallback != null ? loanRefinancingIntroOnExtraCallback.onExtraCallback() : null;
        LoanRefinancingIntro loanRefinancingIntroOnExtraCallback2 = getdevbrand.onExtraCallback();
        String strOnWarmupCompleted = loanRefinancingIntroOnExtraCallback2 != null ? loanRefinancingIntroOnExtraCallback2.onWarmupCompleted() : null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(onPostMessage().IAuthTabCallbackDefault());
        if (strOnExtraCallback != null && !StringsKt.isBlank(strOnExtraCallback)) {
            int i2 = access100;
            int i3 = i2 + 71;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (strOnWarmupCompleted != null) {
                int i5 = i2 + 5;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                if (!StringsKt.isBlank(strOnWarmupCompleted)) {
                    try {
                        Locale locale = Locale.KOREAN;
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        date = new IdGeneratorExternalSyntheticLambda1("HH:mm:ss", locale).parse(strOnExtraCallback);
                    } catch (Exception unused) {
                        date = null;
                    }
                    try {
                        Locale locale2 = Locale.KOREAN;
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        date2 = new IdGeneratorExternalSyntheticLambda1("HH:mm:ss", locale2).parse(strOnWarmupCompleted);
                    } catch (Exception unused2) {
                        date2 = null;
                    }
                    if (date != null && date2 != null) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date);
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(date2);
                        int i7 = calendar2.get(11);
                        int i8 = calendar3.get(11);
                        int i9 = calendar.get(11);
                        int i10 = calendar.get(12);
                        if (i9 >= i7 && i8 > i9) {
                            int i11 = access100 + 51;
                            IAuthTabCallbackStubProxy = i11 % 128;
                            if (i11 % 2 == 0) {
                                throw null;
                            }
                            int i12 = i10 == 0 ? 0 : 60 - i10;
                            int i13 = i8 - i9;
                            if (i10 != 0) {
                                i13--;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (i13 > 0) {
                                sb.append(getString(R.string.loan_hour_value, new Object[]{Integer.valueOf(i13)}));
                                if (i12 > 0) {
                                    sb.append(" ");
                                }
                            }
                            if (i12 > 0) {
                                sb.append(getString(R.string.loan_minute_value, new Object[]{Integer.valueOf(i12)}));
                            }
                            return sb.toString();
                        }
                        getPackageType getpackagetypeOnTransact = asBinder().onTransact();
                        if (getpackagetypeOnTransact != null) {
                            int i14 = access100 + 13;
                            IAuthTabCallbackStubProxy = i14 % 128;
                            int i15 = i14 % 2;
                            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeOnTransact, (CancellationException) null, 1, (Object) null);
                        }
                    }
                    int i16 = IAuthTabCallbackStubProxy + 119;
                    access100 = i16 % 128;
                    int i17 = i16 % 2;
                    return null;
                }
            }
        }
        if (getdevbrand.onExtraCallback() != null) {
            int i18 = access100 + 55;
            IAuthTabCallbackStubProxy = i18 % 128;
            int i19 = i18 % 2;
            getPackageType getpackagetypeOnTransact2 = asBinder().onTransact();
            if (getpackagetypeOnTransact2 != null) {
                int i20 = IAuthTabCallbackStubProxy + 63;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeOnTransact2, (CancellationException) null, 1, (Object) null);
                int i22 = IAuthTabCallbackStubProxy + 49;
                access100 = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            z = (i & 107) != 123;
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = access100 + 97;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStubProxy + 5;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(975031458, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.TopTitleItem.<anonymous> (LoanRefinancingIntroFragment.kt:386)");
                    int i7 = 35 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(975031458, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.TopTitleItem.<anonymous> (LoanRefinancingIntroFragment.kt:386)");
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{mergeParams.asBinder(str), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(25.0f)), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 805330944, 196608, 97766}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        Object obj;
        int i4;
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
        String str = (String) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStubProxy + 3;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1269374750);
        int i8 = iIntValue2 & 1;
        if (i8 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                int i9 = IAuthTabCallbackStubProxy + 45;
                access100 = i9 % 128;
                i2 = i9 % 2 != 0 ? 5 : 4;
            } else {
                int i10 = access100 + 53;
                IAuthTabCallbackStubProxy = i10 % 128;
                int i11 = i10 % 2;
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i12 = IAuthTabCallbackStubProxy;
                int i13 = i12 + 59;
                access100 = i13 % 128;
                i4 = i13 % 2 != 0 ? 2 : 32;
                int i14 = i12 + 19;
                access100 = i14 % 128;
                int i15 = i14 % 2;
            } else {
                i4 = 16;
            }
            i |= i4;
        }
        int i16 = iIntValue2 & 4;
        if (i16 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue)) {
                int i17 = access100 + 35;
                IAuthTabCallbackStubProxy = i17 % 128;
                int i18 = i17 % 2;
                i3 = 256;
            } else {
                i3 = 128;
            }
            i |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) != 146, i & 1)) {
            if (i8 != 0) {
                int i19 = access100 + 1;
                IAuthTabCallbackStubProxy = i19 % 128;
                if (i19 % 2 == 0) {
                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    int i20 = 20 / 0;
                } else {
                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                }
            }
            if (i16 != 0) {
                fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1269374750, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.TopTitleItem (LoanRefinancingIntroFragment.kt:380)");
            }
            obj = null;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(975031458, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda7(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, fFloatValue, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, i & 896, 12284);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i21 = access100 + 73;
                IAuthTabCallbackStubProxy = i21 % 128;
                int i22 = i21 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = onextracallback;
        float f = fFloatValue;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda8(loanRefinancingIntroFragment, onextracallback2, str, f, iIntValue, iIntValue2));
        }
        return obj;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        String str = (String) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((iIntValue & 17) != 16) {
            int i2 = access100 + 55;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = access100 + 5;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(213575803, iIntValue, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.ListHeaderItem.<anonymous> (LoanRefinancingIntroFragment.kt:409)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{mergeParams.asBinder(str), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f)), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 805330944, 0, 130534}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = access100 + 53;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 89 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-818823854);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = access100 + 25;
            IAuthTabCallbackStubProxy = i8 % 128;
            i3 = i8 % 2 == 0 ? i | 9 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i9 = access100 + 51;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i | i4;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i11 = access100 + 43;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            int i13 = access100 + 109;
            IAuthTabCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1))) {
            Object obj = null;
            if (i7 != 0) {
                int i15 = access100 + 73;
                IAuthTabCallbackStubProxy = i15 % 128;
                if (i15 % 2 == 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    throw null;
                }
                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-818823854, i3, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.ListHeaderItem (LoanRefinancingIntroFragment.kt:402)");
                int i16 = access100 + 67;
                IAuthTabCallbackStubProxy = i16 % 128;
                int i17 = i16 % 2;
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(213575803, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda9(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 4084);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = access100 + 23;
                IAuthTabCallbackStubProxy = i18 % 128;
                if (i18 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda10(this, quirksExternalSyntheticBackport03, str, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        String str5;
        int i4;
        int i5;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        String str6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str7;
        int i6;
        String str8 = str4;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1743683099);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ^ true ? 2 : 4) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i9 = access100 + 29;
                IAuthTabCallbackStubProxy = i9 % 128;
                i6 = i9 % 2 == 0 ? 85 : 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                int i11 = IAuthTabCallbackStubProxy + 5;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                str5 = str3;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            Object obj = null;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    int i13 = access100 + 33;
                    IAuthTabCallbackStubProxy = i13 % 128;
                    if (i13 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str8);
                        obj.hashCode();
                        throw null;
                    }
                    i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str8) ? 16384 : 8192) | i3;
                }
                if ((i5 & 9363) != 9362) {
                    int i14 = access100 + 101;
                    IAuthTabCallbackStubProxy = i14 % 128;
                    z = i14 % 2 != 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
                    int i15 = IAuthTabCallbackStubProxy + 67;
                    access100 = i15 % 128;
                    int i16 = i15 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    if (i10 != 0) {
                        int i17 = IAuthTabCallbackStubProxy + 21;
                        access100 = i17 % 128;
                        int i18 = i17 % 2;
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i19 = IAuthTabCallbackStubProxy + 17;
                        access100 = i19 % 128;
                        if (i19 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1743683099, i5, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.PartnersItem (LoanRefinancingIntroFragment.kt:426)");
                            int i20 = 12 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1743683099, i5, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.PartnersItem (LoanRefinancingIntroFragment.kt:426)");
                        }
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 5, (Object) null);
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface = focusMeteringControlExternalSyntheticLambda12.asInterface();
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventAsInterface, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i21 = IAuthTabCallbackStubProxy + 69;
                        access100 = i21 % 128;
                        int i22 = i21 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 0.5f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), 0.0f, 10, (Object) null);
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(str, rowScopeInstance.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onextracallbackwithresult.IAuthTabCallbackDefault()), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 3) & 14, 508);
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, rowScopeInstance.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), onextracallbackwithresult.IAuthTabCallbackDefault()), null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i5 >> 6) & 14) | 805330944), 0, 130540}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (str7 != null) {
                        int i23 = IAuthTabCallbackStubProxy + 11;
                        access100 = i23 % 128;
                        int i24 = i23 % 2;
                        if (str8 != null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1225311935);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 0.5f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 10, (Object) null);
                            component5 component5VarOnExtraCallback3 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback3);
                            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                                int i25 = access100 + 79;
                                IAuthTabCallbackStubProxy = i25 % 128;
                                int i26 = i25 % 2;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback3, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                            AppLovinNativeAdImplc.onExtraCallbackWithResult(str7, rowScopeInstance.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), onextracallbackwithresult.IAuthTabCallbackDefault()), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 9) & 14, 508);
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str8, rowScopeInstance.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), onextracallbackwithresult.IAuthTabCallbackDefault()), null, 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i5 >> 12) & 14) | 805330944), 0, 130540}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1226146083);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        str6 = str7;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    str6 = str5;
                }
                String str9 = str8;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda12(this, quirksExternalSyntheticBackport03, str, str2, str6, str9, i, i2));
                    return;
                }
                return;
            }
            i3 |= 24576;
            i5 = i3;
            if ((i5 & 9363) != 9362) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
            }
            String str92 = str8;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        str5 = str3;
        i4 = i2 & 16;
        Object obj2 = null;
        if (i4 != 0) {
        }
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
        }
        String str922 = str8;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = access100 + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1043766339, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row1BRightBadgeListRow.<anonymous> (LoanRefinancingIntroFragment.kt:499)");
            }
            AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(str, (QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Green, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak, cameraCaptureResultEmptyCameraCaptureResult, 28032, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        boolean z = true;
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 105) != 56) {
                int i3 = access100 + 13;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1044208282, iIntValue, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row1BRightBadgeListRow.<anonymous>.<anonymous> (LoanRefinancingIntroFragment.kt:509)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStubProxy + 121;
                access100 = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 96 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallbackStubProxy + 19;
            access100 = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r0 r2
      0x0030: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r2v12 int) = (r2v4 int), (r2v13 int) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r0 r2
      0x002a: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r2v5 int) = (r2v4 int), (r2v13 int) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackStubProxy + 85;
        access100 = i8 % 128;
        if (i8 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(769137455);
            i3 = i2 & 1;
            if (i3 != 0) {
                i4 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else if ((i & 6) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(769137455);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i9 = access100 + 37;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i11 = IAuthTabCallbackStubProxy + 21;
                access100 = i11 % 128;
                int i12 = i11 % 2;
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 147) != 146, i4 & 1)) {
            quirksExternalSyntheticBackport03 = i3 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(769137455, i4, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row1BRightBadgeListRow (LoanRefinancingIntroFragment.kt:489)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-320146862, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda26(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), quirksExternalSyntheticBackport03, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(1043766339, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda27(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 << 6) & 896) | 1572870, 0, 65464);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallbackStubProxy + 51;
                access100 = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda28(this, quirksExternalSyntheticBackport03, str, str2, i, i2));
        }
    }

    private static final Unit onExtraCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = access100 + 61;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = access100 + 79;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1621404059, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row2DListRow.<anonymous> (LoanRefinancingIntroFragment.kt:533)");
            }
            AppLovinNativeAdImplc.onExtraCallbackWithResult(str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStubProxy + 25;
                access100 = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = access100 + 43;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            z = (i & 118) != 63;
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(862304486, i, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row2DListRow.<anonymous> (LoanRefinancingIntroFragment.kt:540)");
            }
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i4 = access100 + 79;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-93103977);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 106).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-93103977);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-93103017);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = IAuthTabCallbackStubProxy + 59;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(jLongValue), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(fIAuthTabCallback), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 805330992, 0, 130532}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 805330992, 196608, 97764}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(String str, String str2, String str3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1257536189);
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = access100 + 25;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i6 = IAuthTabCallbackStubProxy + 57;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 3;
                }
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IAuthTabCallbackStubProxy + 107;
            access100 = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i2 & 147) == 146), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = access100 + 103;
                IAuthTabCallbackStubProxy = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1257536189, i2, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row2DListRow (LoanRefinancingIntroFragment.kt:524)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1257536189, i2, -1, "im.toss.features.loan.refinancing.funnel.intro.LoanRefinancingIntroFragment.Row2DListRow (LoanRefinancingIntroFragment.kt:524)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(862304486, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda0(str2, str3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1621404059, true, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda1(str), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 3078, 0, 65524);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackStubProxy + 69;
                access100 = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 99 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda2(this, str, str2, str3, i));
        }
    }

    private static final Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(loanRefinancingAvailableStatus);
            loanRefinancingIntroFragment.onWarmupCompleted(loanRefinancingAvailableStatus);
            unit = Unit.INSTANCE;
            int i3 = 46 / 0;
        } else {
            Intrinsics.checkNotNull(loanRefinancingAvailableStatus);
            loanRefinancingIntroFragment.onWarmupCompleted(loanRefinancingAvailableStatus);
            unit = Unit.INSTANCE;
        }
        int i4 = access100 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{loanRefinancingIntroFragment.asBinder(), false}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        loanRefinancingIntroFragment.onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{loanRefinancingIntroFragment.asBinder(), true}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        } else {
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{loanRefinancingIntroFragment.asBinder(), false}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }
        loanRefinancingIntroFragment.onExtraCallbackWithResult();
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        access100().ICustomTabsCallbackDefault().observe(getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda22(this)));
        access100().onPostMessage().observe(getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda23(this)));
        asBinder().onExtraCallback().observe(getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda24(this)));
        TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(asBinder().asInterface(), (CoroutineContext) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new onExtraCallback(new LoanRefinancingIntroFragment$.ExternalSyntheticLambda25(this)));
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Boolean bool) {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        searchRecordResource searchrecordresourceAsInterface = loanRefinancingIntroFragment.asInterface();
        if (searchrecordresourceAsInterface != null && (constraintLayout = searchrecordresourceAsInterface.IAuthTabCallback) != null) {
            int i2 = access100 + 29;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (bool.booleanValue()) {
                int i4 = IAuthTabCallbackStubProxy + 37;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(constraintLayout, 100L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 110, (Object) null);
            } else {
                enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(constraintLayout, 100L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 110, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(LoanRefinancingAvailableStatus loanRefinancingAvailableStatus) {
        int i = 2 % 2;
        IAuthTabCallback(loanRefinancingAvailableStatus, new LoanRefinancingIntroFragment$.ExternalSyntheticLambda11(this));
        int i2 = access100 + 79;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        LoanRefinancingIntroFragment loanRefinancingIntroFragment = (LoanRefinancingIntroFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroFragment.isEngagementSignalsApiAvailable();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) asBinder().asInterface().IAuthTabCallback()).booleanValue();
            throw null;
        }
        if (((Boolean) asBinder().asInterface().IAuthTabCallback()).booleanValue()) {
            return;
        }
        LoanRefinancingFunnelBaseFragment.onExtraCallbackWithResult(this, false, (Intent) null, 3, (Object) null);
        int i3 = IAuthTabCallbackStubProxy + 123;
        access100 = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{asBinder(), true}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 23;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted(loanRefinancingIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(loanRefinancingIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            int i3 = onNavigationEvent + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = LoanRefinancingIntroFragment.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingIntroFragment.onExtraCallback(loanRefinancingIntroFragment, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 10 / 0;
            }
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 17;
                    int i4 = i3 % 128;
                    IAuthTabCallback = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 51;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = IAuthTabCallback + 17;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            getHostnameVerifierokhttp.onNavigationEvent(LoanRefinancingIntroFragment.this, (String) null, 1, (Object) null);
            LoanRefinancingIntroFragment loanRefinancingIntroFragment = LoanRefinancingIntroFragment.this;
            LoanRefinancingIntroFragment.onNavigationEvent(loanRefinancingIntroFragment, 176L, (Function1) new LoanRefinancingIntroFragment$openLoanRefinancingTerms$1$.ExternalSyntheticLambda0(loanRefinancingIntroFragment));
            return Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {access100(), false};
        LoanRefinancingViewModel.onExtraCallback(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 1612331882, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1612331871, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr);
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            int i4 = access100 + 51;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            ConvertByteArrayToFloatArray.onExtraCallback(1003760L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            extraCallback().onExtraCallback(Long.valueOf(onPostMessage().IAuthTabCallbackDefault()));
            if (!(!getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED))) {
                int i6 = IAuthTabCallbackStubProxy + 25;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                dismissLoadingIndicator();
                access100().access200();
                RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.loanRefinancingGuideFragment);
                return;
            }
            this.onExtraCallback = new LoanRefinancingIntroFragment$.ExternalSyntheticLambda29(this);
        }
    }

    private static final Unit asInterface(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        loanRefinancingIntroFragment.access100().access200();
        RippleNode.onNavigationEvent(loanRefinancingIntroFragment).onNavigationEvent(R.id.loanRefinancingGuideFragment);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0070 A[PHI: r1
      0x0070: PHI (r1v6 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r1v5 kotlin.jvm.functions.Function0<kotlin.Unit>), (r1v8 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:8:0x006e, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        Function0<Unit> function0;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onResume();
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{asBinder(), true}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
            dismissLoadingIndicator();
            function0 = this.onExtraCallback;
            if (function0 != null) {
                int i3 = IAuthTabCallbackStubProxy + 27;
                access100 = i3 % 128;
                if (i3 % 2 == 0) {
                    function0.invoke();
                } else {
                    function0.invoke();
                    throw null;
                }
            }
        } else {
            super.onResume();
            LoanRefinancingIntroViewModel.IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), 1589375855, new Object[]{asBinder(), false}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1589375855, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent());
            dismissLoadingIndicator();
            function0 = this.onExtraCallback;
            if (function0 != null) {
            }
        }
        this.onExtraCallback = null;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return getsupportedhighspeedresolutions.onNavigationEvent();
        }
        getsupportedhighspeedresolutions.onNavigationEvent();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -206958935, 206958950);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1230387712, -1230387711);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 2011414563, -2011414555);
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoanRefinancingIntroFragment loanRefinancingIntroFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanRefinancingIntroFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1477878322, -1477878315);
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -914703681, 914703695);
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Boolean bool) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, bool}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 457516089, -457516087);
    }

    private static final Unit onExtraCallback(String str, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1670321898, -1670321893);
    }

    private static final Unit IAuthTabCallbackDefault(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -866910391, 866910402);
    }

    private static final Unit onTransact(LoanRefinancingIntroFragment loanRefinancingIntroFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanRefinancingIntroFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -1893372685, 1893372689);
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {loanRefinancingIntroFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -534823530, 534823533);
    }

    private static final Unit onWarmupCompleted(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 288467700, -288467688);
    }

    private static final Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 975328972, -975328962);
    }

    private final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, str, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onExtraCallbackWithResult(objArr, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -847695580, 847695580);
    }

    private final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(new Object[]{this, quirksExternalSyntheticBackport0}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1979871561, -1979871555);
    }

    private static final Unit onWarmupCompleted(LoanRefinancingIntroFragment loanRefinancingIntroFragment, Throwable th) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment, th}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, -135406773, 135406786);
    }

    private static final Unit onTransact(LoanRefinancingIntroFragment loanRefinancingIntroFragment) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{loanRefinancingIntroFragment}, iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, 1081444246, -1081444237);
    }

    static void onExtraCallback() {
        asBinder = new char[]{32458, 32454, 32450, 32455, 32440, 32387, 32465, 32457, 32471, 32396, 32451, 32461, 32391, 32470, 32460, 32397, 32456, 32453, 32469, 32448, 32459, 32390, 32506, 32464, 32463, 32385, 32436, 32388, 32442, 32386, 32462, 32505, 32507};
        IAuthTabCallbackDefault = -1184333966;
        access000 = true;
        getInterfaceDescriptor = true;
    }
}
