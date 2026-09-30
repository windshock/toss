package viva.republica.toss.verify;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinPostbackService;
import o.AppLovinStarRatingView;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DefaultSurfaceProcessorExternalSyntheticLambda10;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdPlacerListener;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ReactNativeFeatureFlagsLocalAccessor;
import o.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import o.RealImageLoader;
import o.SetDetectableSize;
import o.TextFieldImplKtCommonDecorationBox3ExternalSyntheticLambda4;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.ZslRingBuffer;
import o.access13600;
import o.access13800;
import o.access14300;
import o.access8100;
import o.addFixedPosition;
import o.bindChildren;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.createCameraCaptureCallback;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdSize;
import o.getAdjustedCount;
import o.getAwbState;
import o.getBacktraceNote;
import o.getHumanReadableName;
import o.getWrite;
import o.immediateFailedFuture;
import o.isAdPosition;
import o.isRepeatingEnabled;
import o.isZslDisabledByByUserCaseConfig;
import o.mExternalSyntheticApiModelOutline1;
import o.mExternalSyntheticLambda5;
import o.mExternalSyntheticLambda7;
import o.mExternalSyntheticLambda8;
import o.maybeUpdateAnimatable;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.setCallToAction;
import o.setNativeAdViewBinder;
import o.setRandomHost;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.updateFillablePositions;
import o.use;
import o.verifySignatureValue_NoAlgorithmInfo;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.session.VerifySessionViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SelectVerificationMethodFragment extends Hilt_SelectVerificationMethodFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onNavigationEvent = -7492261675802865498L;
    private static int onWarmupCompleted = 1;
    private final Lazy onExtraCallbackWithResult = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new IAuthTabCallback(this), new asInterface(null, this), new IAuthTabCallbackDefault(this));

    public static /* synthetic */ Unit IAuthTabCallback(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1495929124, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1495929125, new Object[]{findresandmsg, selectVerificationMethodFragment});
        }
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {findresandmsg, selectVerificationMethodFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent3, 1699826477, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent2, -1699826477, objArr);
        int i5 = onWarmupCompleted + 77;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SelectVerificationMethodFragment selectVerificationMethodFragment, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {selectVerificationMethodFragment, Boolean.valueOf(z), setDetectableSize};
        Unit unit = (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1408897084, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1408897087, objArr);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(SelectVerificationMethodFragment selectVerificationMethodFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        selectVerificationMethodFragment.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SelectVerificationMethodFragment selectVerificationMethodFragment, String str, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 15;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(selectVerificationMethodFragment, str, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(selectVerificationMethodFragment, str, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onWarmupCompleted + 9;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = ~i2;
        int i12 = i9 | (~(i11 | i6));
        int i13 = (~(i4 | i7 | i2)) | (~(i8 | i11 | i7));
        int i14 = i6 + i2 + i5 + ((-619979367) * i) + (68302741 * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * 561304900) + 382271488 + (561304900 * i2) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i5) + (1615200256 * i) + ((-1821507584) * i3) + (428933120 * i15);
        int i17 = ((i6 * (-96142684)) - 56799437) + (i2 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i5 * (-96141863)) + (i * (-1380774991)) + (i3 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        boolean z = true;
        if (i18 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }
        SelectVerificationMethodFragment selectVerificationMethodFragment = (SelectVerificationMethodFragment) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i19 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i20 = IAuthTabCallback + 113;
            int i21 = i20 % 128;
            onWarmupCompleted = i21;
            int i22 = i20 % 2;
            int i23 = i21 + 13;
            IAuthTabCallback = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 2 / 4;
            }
        } else {
            int i25 = onWarmupCompleted + 103;
            IAuthTabCallback = i25 % 128;
            int i26 = i25 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-249456221, iIntValue, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SelectVerificationMethodFragment.kt:69)");
            }
            selectVerificationMethodFragment.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i27 = onWarmupCompleted + 91;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i29 = IAuthTabCallback + 23;
            onWarmupCompleted = i29 % 128;
            int i30 = i29 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(findresandmsg, selectVerificationMethodFragment);
        int i4 = onWarmupCompleted + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(SelectVerificationMethodFragment selectVerificationMethodFragment, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(selectVerificationMethodFragment, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(selectVerificationMethodFragment, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(SelectVerificationMethodFragment selectVerificationMethodFragment, String str, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        selectVerificationMethodFragment.onWarmupCompleted(str, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 19;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(SelectVerificationMethodFragment selectVerificationMethodFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {selectVerificationMethodFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 == 0) {
            return (Unit) onNavigationEvent(iOnNavigationEvent3, -175283130, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent2, 175283132, objArr);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(findresandmsg, selectVerificationMethodFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, selectVerificationMethodFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SelectVerificationMethodFragment selectVerificationMethodFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(selectVerificationMethodFragment, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 71;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(SelectVerificationMethodFragment selectVerificationMethodFragment, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        selectVerificationMethodFragment.onNavigationEvent(z);
        int i4 = IAuthTabCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ VerifySessionViewModel onExtraCallback(SelectVerificationMethodFragment selectVerificationMethodFragment) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return selectVerificationMethodFragment.onExtraCallback();
        }
        selectVerificationMethodFragment.onExtraCallback();
        throw null;
    }

    private final VerifySessionViewModel onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return verifySessionViewModel;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_compose, viewGroup, false);
        ComposeView composeViewFindViewById = viewInflate.findViewById(R.id.compose_view);
        composeViewFindViewById.onNavigationEvent(new ZslRingBuffer.IAuthTabCallback(this));
        composeViewFindViewById.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(2107007995, true, new Function2() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2) {
                return SelectVerificationMethodFragment.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })));
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return viewInflate;
    }

    private static final Unit onExtraCallbackWithResult(final SelectVerificationMethodFragment selectVerificationMethodFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = IAuthTabCallback + 95;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onWarmupCompleted + 71;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107007995, i, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.onCreateView.<anonymous>.<anonymous> (SelectVerificationMethodFragment.kt:68)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-249456221, true, new Function2() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return SelectVerificationMethodFragment.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 13;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 61;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, 6383 - Color.alpha(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i5 = 10 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 58 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 73;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        ConvertByteArrayToFloatArray.onExtraCallback(1505583L, false, (String) null, getScreenParams(), (Function1) null, 22, (Object) null);
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SelectVerificationMethodFragment.this.new onNavigationEvent(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            FragmentActivity fragmentActivityRequireActivity = SelectVerificationMethodFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, BuildConfig.FLAVOR);
            TextFieldImplKtCommonDecorationBox3ExternalSyntheticLambda4.onNavigationEvent(fragmentActivityRequireActivity, R.id.nav_host_fragment).getInterfaceDescriptor();
            VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{SelectVerificationMethodFragment.onExtraCallback(SelectVerificationMethodFragment.this), new ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.extraCallback(true)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
            SelectVerificationMethodFragment.IAuthTabCallback(SelectVerificationMethodFragment.this, false);
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent((findResAndMsg) objArr[0], (CoroutineContext) null, (setRandomHost) null, ((SelectVerificationMethodFragment) objArr[1]).new onNavigationEvent(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        final findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        final SelectVerificationMethodFragment selectVerificationMethodFragment = (SelectVerificationMethodFragment) objArr[1];
        u4 u4Var = (u4) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i3 = onWarmupCompleted + 57;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        int i5 = iIntValue;
        if ((i5 & 19) != 18) {
            int i6 = IAuthTabCallback + 77;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = onWarmupCompleted + 63;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 39;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-145376093, i5, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.Content.<anonymous>.<anonymous> (SelectVerificationMethodFragment.kt:136)");
                    int i11 = 76 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-145376093, i5, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.Content.<anonymous>.<anonymous> (SelectVerificationMethodFragment.kt:136)");
                }
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.select_verification_cta_label_kftcPassword, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(selectVerificationMethodFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(true ^ (zOnExtraCallback | zOnExtraCallback2)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda3
                    public final Object invoke() {
                        return SelectVerificationMethodFragment.IAuthTabCallback(findresandmsg, selectVerificationMethodFragment);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, RealImageLoader.onWarmupCompleted(0L, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i5 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IAuthTabCallback + 107;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i14 = IAuthTabCallback + 63;
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
        return unit;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SelectVerificationMethodFragment.this.new onExtraCallback(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            FragmentActivity fragmentActivityRequireActivity = SelectVerificationMethodFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, BuildConfig.FLAVOR);
            TextFieldImplKtCommonDecorationBox3ExternalSyntheticLambda4.onNavigationEvent(fragmentActivityRequireActivity, R.id.nav_host_fragment).getInterfaceDescriptor();
            VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{SelectVerificationMethodFragment.onExtraCallback(SelectVerificationMethodFragment.this), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.access100.onWarmupCompleted}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
            SelectVerificationMethodFragment.IAuthTabCallback(SelectVerificationMethodFragment.this, true);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, selectVerificationMethodFragment.new onExtraCallback(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(final findResAndMsg findresandmsg, final SelectVerificationMethodFragment selectVerificationMethodFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var))) {
                int i5 = IAuthTabCallback + 123;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = IAuthTabCallback + 27;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1017786655, i2, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.Content.<anonymous>.<anonymous> (SelectVerificationMethodFragment.kt:148)");
                int i8 = IAuthTabCallback + 41;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.select_verification_cta_label_bank_account_otp, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(selectVerificationMethodFragment);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda4
                    public final Object invoke() {
                        return SelectVerificationMethodFragment.onNavigationEvent(findresandmsg, selectVerificationMethodFragment);
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, RealImageLoader.onWarmupCompleted(0L, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ updateFillablePositions $ctaSlideState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(updateFillablePositions updatefillablepositions, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$ctaSlideState = updatefillablepositions;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(this.$ctaSlideState, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            this.$ctaSlideState.IAuthTabCallbackDefault();
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        long jLongValue;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1761015430);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(this)) {
                int i6 = IAuthTabCallback + 81;
                onWarmupCompleted = i6 % 128;
                i4 = i6 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i7 = onWarmupCompleted + 121;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i9 = IAuthTabCallback + 13;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 31;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1761015430, i2, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.Content (SelectVerificationMethodFragment.kt:81)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            updateFillablePositions updatefillablepositionsOnNavigationEvent = MaxAdPlacerListener.onNavigationEvent(isAdPosition.onWarmupCompleted.onExtraCallback, getAdSize.IAuthTabCallback.onWarmupCompleted, getAdjustedCount.onNavigationEvent.onNavigationEvent, true, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3510, 16);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(126.0f), 0.0f, 0.0f, 13, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            findResAndMsg findresandmsg2 = (findResAndMsg) objOnMinimized2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f));
            Object[] objArr = new Object[1];
            a(new char[]{54777, 32752, 33231, 11230, 32182, 34754, 10688, 29485, 34122, 12120, 28962, 39682, 11524, 30435, 39065, 8926, 29870, 40583, 8344, 18992, 40028, 9797, 18544, 37406, 9222, 18920, 37831, 9679, 20408, 37251, 15304, 19833, 38744, 14678, 17208, 38178, 16128, 16565, 60131, 15565, 18104, 59560, 12938, 17528, 61034, 12302, 23101, 60473, 13838, 23546}, TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 43541, objArr);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, false, Integer.MAX_VALUE, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24630, 0, 8172);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.select_verification_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            mExternalSyntheticApiModelOutline1.onTransact.onExtraCallbackWithResult onextracallbackwithresult3 = mExternalSyntheticApiModelOutline1.onTransact.Companion;
            mExternalSyntheticApiModelOutline1.onTransact ontransactIAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            long jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
            int i13 = (i2 << 9) & 7168;
            onWarmupCompleted(strOnExtraCallback, mExternalSyntheticLambda5.onNavigationEvent((String) null, (Object) null, ontransactIAuthTabCallback, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, findresandmsg2, gethumanreadablename, jIsEngagementSignalsApiAvailable, 0L, 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), 0.0f, (bindChildren) null, (use) null, 0L, graphicDeviceInfoOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 24576, 15755), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i13, 4);
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.select_verification_sub_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            mExternalSyntheticApiModelOutline1.onTransact ontransactIAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(591790081);
                i3 = 6;
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
            } else {
                i3 = 6;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(591791041);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i14 = i3;
            onWarmupCompleted(strOnExtraCallback2, mExternalSyntheticLambda5.onNavigationEvent((String) null, (Object) null, ontransactIAuthTabCallback2, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, findresandmsg2, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), jLongValue, 0L, 0L, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), 0.0f, (bindChildren) null, (use) null, 0L, isrepeatingenabled.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 24576, 15755), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), 0.0f, 0.0f, 13, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i13 | 384, 0);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            u1.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(setNativeAdViewBinder.onExtraCallbackWithResult(onextracallback, updatefillablepositionsOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14), 0.0f, 1, (Object) null), (u2) null, ForwardingCameraControl.onExtraCallback(-145376093, true, new getBacktraceNote() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SelectVerificationMethodFragment.onExtraCallback(findresandmsg, this, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-1017786655, true, new getBacktraceNote() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SelectVerificationMethodFragment.onWarmupCompleted(findresandmsg, this, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 24960, 0, 4074);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(updatefillablepositionsOnNavigationEvent);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new onWarmupCompleted(updatefillablepositionsOnNavigationEvent, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, i14);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = IAuthTabCallback + 15;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectVerificationMethodFragment.onNavigationEvent(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
            int i17 = onWarmupCompleted + 29;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    private final void onNavigationEvent(final boolean z) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1505585L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return SelectVerificationMethodFragment.onExtraCallback(this.f$0, z, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallbackDefault extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SelectVerificationMethodFragment selectVerificationMethodFragment = (SelectVerificationMethodFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            setDetectableSize.onExtraCallback(selectVerificationMethodFragment.getScreenParams());
            setDetectableSize.onExtraCallback("1won_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback(selectVerificationMethodFragment.getScreenParams());
        setDetectableSize.onExtraCallback("1won_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(mExternalSyntheticLambda8 mexternalsyntheticlambda8, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$state, this.$text, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onExtraCallbackWithResult(this.$state, this.$text, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), mExternalSyntheticApiModelOutline1.onTransact.Companion.IAuthTabCallback(), verifySignatureValue_NoAlgorithmInfo.REQUEST_AUTH_CS, false, (Long) null, 48, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[PHI: r0
      0x0036: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r0
      0x002b: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final String str, final mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 103;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1196804254);
            if ((i & 62) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1196804254);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8)) {
                int i8 = IAuthTabCallback + 117;
                onWarmupCompleted = i8 % 128;
                i5 = i8 % 2 == 0 ? 4 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i4 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i4 & 147) != 146), i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1196804254, i4, -1, "viva.republica.toss.verify.SelectVerificationMethodFragment.Title (SelectVerificationMethodFragment.kt:180)");
                }
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                int i10 = i4 >> 3;
                Integer numValueOf = Integer.valueOf((i10 & 14) | 384 | (i10 & 112));
                mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, quirksExternalSyntheticBackport04, quirkSettingsLoaderOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf, 0}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                if ((i4 & 112) == 32) {
                    z = true;
                } else {
                    int i11 = IAuthTabCallback + 59;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    z = false;
                }
                boolean z2 = (i4 & 14) == 4;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z | z2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallbackWithResult(mexternalsyntheticlambda8, str, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(str, mexternalsyntheticlambda8, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4 & 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.verify.SelectVerificationMethodFragment$$ExternalSyntheticLambda7
                    public final Object invoke(Object obj, Object obj2) {
                        return SelectVerificationMethodFragment.onExtraCallbackWithResult(this.f$0, str, mexternalsyntheticlambda8, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        int i13 = onWarmupCompleted + 33;
        IAuthTabCallback = i13 % 128;
        i3 = i13 % 2 != 0 ? i3 | 5090 : i3 | 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i4 & 147) != 146), i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeFeatureFlagsLocalAccessor reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult = onExtraCallback().onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{54755, 24473, 49453, 19123, 64599, 25026, 60282, 7448}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35437, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.onActivityLayout());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("service_referrer", reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.onActivityResized());
        Object[] objArr2 = new Object[1];
        a(new char[]{54772, 6496, 19703, 45176, 59348, 11107, 7886, 16960, 45503, 58671}, 52361 - View.resolveSizeAndState(0, 0, 0), objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), reactNativeFeatureFlagsLocalAccessorOnExtraCallbackWithResult.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback("1won_button_first_yn", zzaz.onExtraCallbackWithResult(false))});
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return mapIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {findresandmsg, selectVerificationMethodFragment, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1699826477, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1699826477, objArr);
    }

    private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, SelectVerificationMethodFragment selectVerificationMethodFragment) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1495929124, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1495929125, new Object[]{findresandmsg, selectVerificationMethodFragment});
    }

    private static final Unit onExtraCallback(SelectVerificationMethodFragment selectVerificationMethodFragment, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {selectVerificationMethodFragment, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -175283130, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 175283132, objArr);
    }

    private static final Unit onNavigationEvent(SelectVerificationMethodFragment selectVerificationMethodFragment, boolean z, SetDetectableSize setDetectableSize) {
        Object[] objArr = {selectVerificationMethodFragment, Boolean.valueOf(z), setDetectableSize};
        return (Unit) onNavigationEvent(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1408897084, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 1408897087, objArr);
    }
}
