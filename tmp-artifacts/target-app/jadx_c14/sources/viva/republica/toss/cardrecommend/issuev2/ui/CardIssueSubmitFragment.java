package viva.republica.toss.cardrecommend.issuev2.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.DefaultMediaViewVideoRenderer;
import o.EncryptedContentInfoParser;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.IAnimation;
import o.IPostMessageServiceStubProxy;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1;
import o.RippleNode;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.access15300;
import o.access15400;
import o.bindChildren;
import o.component5;
import o.failAtMillis;
import o.findResAndMsg;
import o.getAuthenticatedAttributes;
import o.getAwbState;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getHumanReadableName;
import o.getRC2ParameterVersion;
import o.getSupportedHighSpeedResolutionsFor;
import o.mExternalSyntheticApiModelOutline1;
import o.maybeUpdateAnimatable;
import o.mc;
import o.putChannelInfo;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.setRipple;
import o.toPreviewOnlyRange;
import o.u4;
import o.use;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueSubmitFragment extends Hilt_CardIssueSubmitFragment<getRC2ParameterVersion> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static boolean asInterface = false;
    private static char[] onExtraCallback = null;
    public static final int onNavigationEvent;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    @Inject
    public DefaultMediaViewVideoRenderer cardIssueApi;
    private final getSupportedHighSpeedResolutionsFor<IAuthTabCallback> onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(IAuthTabCallback.Loading, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    @Inject
    public SessionTrackerb tossRouter;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[IAuthTabCallback.values().length];
            try {
                iArr[IAuthTabCallback.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAuthTabCallback.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        IAuthTabCallback();
        Companion = new onExtraCallback(null);
        onNavigationEvent = 8;
        int i = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
        mc mcVar = (mc) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueSubmitFragment, mcVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cardIssueSubmitFragment, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(iOnWarmupCompleted, -185649379, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 185649385, objArr, iOnWarmupCompleted2);
        int i6 = onTransact + 87;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueSubmitFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueSubmitFragment, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueSubmitFragment cardIssueSubmitFragment, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueSubmitFragment, mcVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 117;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSubmitFragment cardIssueSubmitFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            throw null;
        }
        int iOnWarmupCompleted4 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(iOnWarmupCompleted4, -321195687, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted6, 321195687, new Object[]{cardIssueSubmitFragment, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, iOnWarmupCompleted5);
        int i6 = asBinder + 109;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSubmitFragment cardIssueSubmitFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 125;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueSubmitFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 13;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSubmitFragment.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueSubmitFragment cardIssueSubmitFragment, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(cardIssueSubmitFragment, str);
        }
        onExtraCallbackWithResult(cardIssueSubmitFragment, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i5);
        int i11 = i9 | i10 | (~(i2 | i));
        int i12 = i8 | i2;
        int i13 = (~((~i) | i2)) | i10;
        int i14 = i2 + i5 + i6 + (111814883 * i4) + (1975835455 * i3);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i2) - 1583611904) + (47848387 * i5) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i4) + (1432616960 * i3) + (442957824 * i15);
        int i17 = ((i2 * 961080817) - 60187382) + (i5 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i4 * 1618335983) + (i3 * 193609403) + (i15 * 1988296704);
        switch (i16 + (i17 * i17 * 176226304)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onWarmupCompleted(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                ((Number) objArr[3]).intValue();
                int i18 = 2 % 2;
                int i19 = asBinder + 97;
                onTransact = i19 % 128;
                int i20 = i19 % 2;
                cardIssueSubmitFragment.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
                Unit unit = Unit.INSTANCE;
                int i21 = onTransact + 115;
                asBinder = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            case 7:
                final CardIssueSubmitFragment cardIssueSubmitFragment2 = (CardIssueSubmitFragment) objArr[0];
                int i23 = 2 % 2;
                Context contextRequireContext = cardIssueSubmitFragment2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
                composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1764064523, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj, Object obj2) {
                        Object[] objArr2 = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
                        return (Unit) CardIssueSubmitFragment.onWarmupCompleted(iOnWarmupCompleted, 1357287186, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1357287182, objArr2, iOnWarmupCompleted2);
                    }
                })));
                int i24 = asBinder + 15;
                onTransact = i24 % 128;
                int i25 = i24 % 2;
                return composeView;
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueSubmitFragment, str);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = onTransact + 45;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueSubmitFragment cardIssueSubmitFragment, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueSubmitFragment, str, setDetectableSize);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = asBinder + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueSubmitFragment cardIssueSubmitFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueSubmitFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 89 / 0;
        }
        int i6 = asBinder + 63;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Integer.valueOf(i)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, 546961966, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -546961963, objArr, iOnWarmupCompleted2);
        int i5 = onTransact + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSubmitFragment.onTransact();
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, getAuthenticatedAttributes getauthenticatedattributes) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSubmitFragment.onExtraCallback(getauthenticatedattributes);
        int i4 = asBinder + 17;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(CardIssueSubmitFragment cardIssueSubmitFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cardIssueSubmitFragment.IAuthTabCallbackDefault();
        int i4 = onTransact + 97;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
        }
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 43;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.DefaultMediaViewVideoRenderer onExtraCallbackWithResult() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onTransact
            int r2 = r1 + 51
            int r3 = r2 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.asBinder = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            o.DefaultMediaViewVideoRenderer r2 = r4.cardIssueApi
            r3 = 87
            int r3 = r3 / 0
            if (r2 == 0) goto L23
            goto L1b
        L17:
            o.DefaultMediaViewVideoRenderer r2 = r4.cardIssueApi
            if (r2 == 0) goto L23
        L1b:
            int r1 = r1 + 43
            int r3 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.asBinder = r3
            int r1 = r1 % r0
            return r2
        L23:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallbackWithResult():o.DefaultMediaViewVideoRenderer");
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        View view = (View) onWarmupCompleted(iOnWarmupCompleted, -1370433534, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1370433541, new Object[]{this}, iOnWarmupCompleted2);
        int i4 = asBinder + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ui.CardIssueBaseFragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IPostMessageServiceStubProxy supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = onTransact + 35;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        asBinder();
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, -1552825310, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1552825315, new Object[]{this}, iOnWarmupCompleted2);
        int i4 = onTransact + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueSubmitFragment.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment$onExtraCallbackWithResult$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ CardIssueSubmitFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CardIssueSubmitFragment cardIssueSubmitFragment, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = cardIssueSubmitFragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass5(this.this$0, access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    IAnimation<getAuthenticatedAttributes> iAnimationNewSessionWithExtras = this.this$0.extraCallback().newSessionWithExtras();
                    final CardIssueSubmitFragment cardIssueSubmitFragment = this.this$0;
                    setRipple setripple = new setRipple() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallbackWithResult.5.3
                        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                        public final Object emit(getAuthenticatedAttributes getauthenticatedattributes, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
                            CardIssueSubmitFragment.IAuthTabCallback(cardIssueSubmitFragment, getauthenticatedattributes);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (iAnimationNewSessionWithExtras.collect(setripple, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = CardIssueSubmitFragment.this.getViewLifecycleOwner().getLifecycle();
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(CardIssueSubmitFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onWarmupCompleted(lifecycle, onextracallback, anonymousClass5, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        CardIssueSubmitFragment cardIssueSubmitFragment = (CardIssueSubmitFragment) objArr[0];
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = cardIssueSubmitFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, cardIssueSubmitFragment.new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = asBinder + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallback(getAuthenticatedAttributes getauthenticatedattributes) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            if (!(!(getauthenticatedattributes instanceof getAuthenticatedAttributes.onNavigationEvent))) {
                int i4 = i2 + 35;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    asBinder();
                    return;
                } else {
                    asBinder();
                    int i5 = 36 / 0;
                    return;
                }
            }
            if (getauthenticatedattributes instanceof getAuthenticatedAttributes.onWarmupCompleted) {
                getDigestAlgorithms.onExtraCallbackWithResult(writeTypedObject(), RippleNode.onNavigationEvent(this), ((getAuthenticatedAttributes.onWarmupCompleted) getauthenticatedattributes).onNavigationEvent(), extraCallback(), (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
                int i6 = asBinder + 33;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            if (getauthenticatedattributes instanceof getAuthenticatedAttributes.onExtraCallbackWithResult) {
                int i8 = i2 + 95;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                onTransact();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z = getauthenticatedattributes instanceof getAuthenticatedAttributes.onNavigationEvent;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback.Loading);
            IAuthTabCallback_Parcel();
        } else {
            this.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback.Loading);
            IAuthTabCallback_Parcel();
            throw null;
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback.RETRY);
            throw null;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(IAuthTabCallback.RETRY);
        int i3 = asBinder + 37;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final int onExtraCallback(double d) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onTransact = i2 % 128;
        return (int) (i2 % 2 == 0 ? Math.tanh(d + 9.0d) + 99.0d : Math.tanh(d / 9.0d) * 99.0d);
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueSubmitFragment.this.new IAuthTabCallbackStub(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ CardIssueSubmitFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(access13800 access13800Var, CardIssueSubmitFragment cardIssueSubmitFragment) {
                super(2, access13800Var);
                this.this$0 = cardIssueSubmitFragment;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new IAuthTabCallback(access13800Var, this.this$0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    DefaultMediaViewVideoRenderer defaultMediaViewVideoRendererOnExtraCallbackWithResult = this.this$0.onExtraCallbackWithResult();
                    String interfaceDescriptor = this.this$0.extraCallback().getInterfaceDescriptor();
                    failAtMillis failatmillis = new failAtMillis(this.this$0.writeTypedObject().onNavigationEvent(), this.this$0.extraCallback().access000(), this.this$0.extraCallback().onExtraCallback(), this.this$0.extraCallback().onTransact(), this.this$0.extraCallback().ICustomTabsCallbackStubProxy(), false, this.this$0.extraCallback().onActivityResized());
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = defaultMediaViewVideoRendererOnExtraCallbackWithResult.onExtraCallback(interfaceDescriptor, failatmillis, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return (Boolean) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Boolean.class, Object.class) || Intrinsics.areEqual(Boolean.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CardIssueSubmitFragment cardIssueSubmitFragment = CardIssueSubmitFragment.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(null, cardIssueSubmitFragment);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, iAuthTabCallback, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            CardIssueSubmitFragment cardIssueSubmitFragment2 = CardIssueSubmitFragment.this;
            if (Result.onNavigationEvent(obj2)) {
                CardIssueSubmitFragment.onExtraCallback(cardIssueSubmitFragment2);
            }
            CardIssueSubmitFragment cardIssueSubmitFragment3 = CardIssueSubmitFragment.this;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                CardIssueSubmitFragment.IAuthTabCallback(cardIssueSubmitFragment3);
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
        int i2 = asBinder + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        extraCallback().onNavigationEvent(((getRC2ParameterVersion) readTypedObject()).asInterface(), writeTypedObject().onNavigationEvent());
        int i4 = asBinder + 111;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(CardIssueSubmitFragment cardIssueSubmitFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        onTransact = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i4 = onTransact + 35;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1512803149, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.createView.<anonymous>.<anonymous>.<anonymous> (CardIssueSubmitFragment.kt:150)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            int i5 = onNavigationEvent.IAuthTabCallback[((IAuthTabCallback) cardIssueSubmitFragment.onExtraCallbackWithResult.onExtraCallbackWithResult()).ordinal()];
            if (i5 != 1) {
                int i6 = onTransact + 19;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                if (i5 != 2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1790950528);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1790945780);
                cardIssueSubmitFragment.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1790948025);
                cardIssueSubmitFragment.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final CardIssueSubmitFragment cardIssueSubmitFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 95;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1764064523, i, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.createView.<anonymous>.<anonymous> (CardIssueSubmitFragment.kt:149)");
                int i8 = asBinder + 95;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1512803149, true, new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return CardIssueSubmitFragment.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = asBinder + 111;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Integer> $timeElapsed$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$timeElapsed$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$timeElapsed$delegate, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.onNavigationEvent(r6)
                goto L2f
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.onNavigationEvent(r6)
            L1a:
                o.getSupportedHighSpeedResolutionsFor<java.lang.Integer> r6 = r5.$timeElapsed$delegate
                int r6 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallbackWithResult(r6)
                r1 = 30
                if (r6 >= r1) goto L3a
                r5.label = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = o.formatMsgs.onWarmupCompleted(r3, r5)
                if (r6 != r0) goto L2f
                return r0
            L2f:
                o.getSupportedHighSpeedResolutionsFor<java.lang.Integer> r6 = r5.$timeElapsed$delegate
                int r1 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallbackWithResult(r6)
                int r1 = r1 + r2
                viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.IAuthTabCallback(r6, r1)
                goto L1a
            L3a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int i3 = $11 + 21;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 77, 20952 - KeyEvent.getDeadChar(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 75 - Color.green(0), 16037 - TextUtils.getTrimmedLength(""), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (asInterface) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12214 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i6 = 1052772399;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $10 + 117;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CardIssueSubmitFragment cardIssueSubmitFragment, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i4 = asBinder + 87;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = asBinder + 49;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1086536617, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.SubmitScreen.<anonymous>.<anonymous> (CardIssueSubmitFragment.kt:175)");
            }
            mcVar.IAuthTabCallback(((getRC2ParameterVersion) cardIssueSubmitFragment.readTypedObject()).onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, Integer.MAX_VALUE, 0, 1500, false, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 224256, ((i2 << 24) & 234881024) | 1572864, 196548);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(mcVar, "");
        if ((i & 6) == 0) {
            int i5 = onTransact + 65;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mcVar)) {
                int i7 = onTransact + 57;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            int i9 = asBinder + 105;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i11 = onTransact + 105;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1052993860, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.SubmitScreen.<anonymous>.<anonymous> (CardIssueSubmitFragment.kt:185)");
            }
            String strOnWarmupCompleted = ((getRC2ParameterVersion) cardIssueSubmitFragment.readTypedObject()).onWarmupCompleted();
            mcVar.onExtraCallbackWithResult(strOnWarmupCompleted == null ? "" : strOnWarmupCompleted, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, 600, (getHumanReadableName) null, 0L, 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, (GraphicDeviceInfo) null, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (Object) null, cameraCaptureResultEmptyCameraCaptureResult, 3072, ((i2 << 15) & 458752) | 3072, 24564);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i13 = asBinder + 21;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r40, final int r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallbackWithResult(o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("card_id", cardIssueSubmitFragment.extraCallback().IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("funnel_id", cardIssueSubmitFragment.extraCallback().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("session_id", cardIssueSubmitFragment.extraCallback().ICustomTabsCallbackStubProxy());
        setDetectableSize.onExtraCallback("screen_type", ((getRC2ParameterVersion) cardIssueSubmitFragment.readTypedObject()).onExtraCallback());
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final CardIssueSubmitFragment cardIssueSubmitFragment, final String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1385604L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return CardIssueSubmitFragment.onWarmupCompleted(this.f$0, str, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        cardIssueSubmitFragment.asBinder();
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment r20, o.u4 r21, o.CameraCaptureResultEmptyCameraCaptureResult r22, int r23) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.onExtraCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getDigestAlgorithms.IAuthTabCallback(660327130, new Object[]{cardIssueSubmitFragment.writeTypedObject(), cardIssueSubmitFragment.extraCallback(), null, str, null, ((getRC2ParameterVersion) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{cardIssueSubmitFragment.writeTypedObject()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).getInterfaceDescriptor(), 8, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -660327125, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        cardIssueSubmitFragment.requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 117;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(final viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment r18, o.u4 r19, o.CameraCaptureResultEmptyCameraCaptureResult r20, int r21) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.IAuthTabCallback(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r1
      0x0033: PHI (r1v8 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IAuthTabCallback(@org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r27, final int r28) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment.IAuthTabCallback(o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback Loading = new IAuthTabCallback("Loading", 0);
        public static final IAuthTabCallback RETRY = new IAuthTabCallback("RETRY", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            return new IAuthTabCallback[]{Loading, RETRY};
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            return $ENTRIES;
        }

        public static IAuthTabCallback valueOf(String str) {
            return (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
        }

        public static IAuthTabCallback[] values() {
            return (IAuthTabCallback[]) $VALUES.clone();
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static final int IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).intValue();
        int i4 = asBinder + 97;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(iIntValue));
        int i4 = asBinder + 15;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueSubmitFragment cardIssueSubmitFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cardIssueSubmitFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, 1357287186, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -1357287182, objArr, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueSubmitFragment cardIssueSubmitFragment, String str) {
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, -1167369162, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1167369163, new Object[]{cardIssueSubmitFragment, str}, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueSubmitFragment cardIssueSubmitFragment, mc mcVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cardIssueSubmitFragment, mcVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, 651744545, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -651744543, objArr, iOnWarmupCompleted2);
    }

    private static final Unit onWarmupCompleted(CardIssueSubmitFragment cardIssueSubmitFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {cardIssueSubmitFragment, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, -321195687, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 321195687, objArr, iOnWarmupCompleted2);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) throws Throwable {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Integer.valueOf(i)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, 546961966, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -546961963, objArr, iOnWarmupCompleted2);
    }

    private static final Unit onExtraCallback(CardIssueSubmitFragment cardIssueSubmitFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {cardIssueSubmitFragment, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onWarmupCompleted(iOnWarmupCompleted, -185649379, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 185649385, objArr, iOnWarmupCompleted2);
    }

    private final View IAuthTabCallbackStub() {
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        return (View) onWarmupCompleted(iOnWarmupCompleted, -1370433534, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1370433541, new Object[]{this}, iOnWarmupCompleted2);
    }

    private final void asInterface() throws Throwable {
        int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
        onWarmupCompleted(iOnWarmupCompleted, -1552825310, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1552825315, new Object[]{this}, iOnWarmupCompleted2);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{32623, 32626, 32631, 32638, 32627, 32619, 32616, 32545, 32564, 32634, 32632, 32565, 32628, 32630, 32639, 32629, 32636, 32566, 32617, 32625};
        onWarmupCompleted = -1184334053;
        IAuthTabCallback = true;
        asInterface = true;
    }
}
