package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.semantics.Role;
import im.toss.tds.compose.component.compound.toast.v1.RightPreset;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppLovinAdClickListener;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.ExtensionsInfoExternalSyntheticLambda0;
import o.ExtensionsManager1;
import o.Futures3;
import o.LifecycleCameraProviderImplExternalSyntheticLambda2;
import o.MlKitAnalyzerExternalSyntheticLambda0;
import o.QualityRatioToResolutionsTableExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.RecorderExternalSyntheticLambda14;
import o.StateObservableErrorWrapper;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.flipHorizontally;
import o.getStreamSharingChildren;
import o.getSwitchMinWidth;
import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import o.r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA;
import o.r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4;
import o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaIItvJ65H1kry9itpoQE60dxnTI {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallbackWithResult(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(isqueryrefinementenabled, fliphorizontally);
        int i4 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        int i6 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, extensionsManager1}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1770084914, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1770084908);
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(str, r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(str, r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote2, getbacktracenote3, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, StateObservableErrorWrapper stateObservableErrorWrapper) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(isqueryrefinementenabled, mappingRedirectableLiveDataExternalSyntheticLambda1, stateObservableErrorWrapper);
        int i4 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1652828015, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1652828013);
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | (~i) | i6)) | (~(i6 | i2 | i));
        int i10 = ~i6;
        int i11 = (~(i | i2)) | (~(i10 | i)) | (~(i10 | i2));
        int i12 = i6 + i2 + i4 + (1698977638 * i5) + (1466394737 * i3);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-1787956080)) - 1478154965) + (i2 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + ((-1787955639) * i4) + (552005654 * i5) + ((-2013897159) * i3) + (i13 * (-429457408));
        switch ((((-1250291696) * i6) - 490274816) + ((-1116082190) * i2) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i4) + (1553727488 * i5) + (1859780608 * i3) + (925827072 * i13) + (i14 * i14 * (-402587648))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
                r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[1];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
                isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[3];
                r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w = (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) objArr[4];
                Function0 function0 = (Function0) objArr[5];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[6];
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[7];
                setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[8];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
                int iIntValue = ((Number) objArr[10]).intValue();
                int i15 = 2 % 2;
                int i16 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, cameraPresenceProviderExternalSyntheticLambda6, isqueryrefinementenabled, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, function0, getbacktracenote2, getbacktracenote3, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i18 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                return unitOnExtraCallback;
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -951639860, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 951639863);
        int i7 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(new Object[]{getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1652828015, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1652828013);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, getbacktracenote2, getbacktracenote3, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            int i6 = 76 / 0;
        }
        int i7 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getstreamsharingchildren, iIntValue, iIntValue2, onextracallbackwithresult);
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(str, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote, getbacktracenote2, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, futures3};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, iOnExtraCallback, -950002144, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 950002148);
        int i4 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return extensionsInfoExternalSyntheticLambda0OnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function0 function0, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(str, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote, getbacktracenote2, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote, getbacktracenote2, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            i |= 1;
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote2, getbacktracenote3, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2040912696, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2040912689);
        } else {
            onExtraCallbackWithResult(new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote2, getbacktracenote3, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2040912696, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2040912689);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ AppLovinAdClickListener onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
        }
        onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ component8 onWarmupCompleted(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarOnNavigationEvent = onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, component4Var, component7Var, virtualCameraCaptureResult);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return component8VarOnNavigationEvent;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $state;
        final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w $transitionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$transitionState = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
            this.$state = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
        }

        public static /* synthetic */ boolean onNavigationEvent(r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = IAuthTabCallback(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w);
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            int i5 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return zIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$transitionState, this.$state, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public static final class onNavigationEvent implements IAnimation<Boolean> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ IAnimation onExtraCallback;
            final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 onNavigationEvent;
            final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w onWarmupCompleted;

            /* renamed from: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI$onExtraCallback$onNavigationEvent$4, reason: invalid class name */
            public static final class AnonymousClass4<T> implements setRipple {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w IAuthTabCallback;
                final /* synthetic */ setRipple onExtraCallback;
                final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 onExtraCallbackWithResult;

                /* renamed from: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI$onExtraCallback$onNavigationEvent$4$5, reason: invalid class name */
                public static final class AnonymousClass5 extends ContinuationImpl {
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass5(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 3;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass4.this.emit(null, this);
                        int i4 = onWarmupCompleted + 115;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                public AnonymousClass4(setRipple setripple, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
                    this.onExtraCallback = setripple;
                    this.IAuthTabCallback = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
                    this.onExtraCallbackWithResult = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    AnonymousClass5 anonymousClass5;
                    boolean z;
                    int i = 2 % 2;
                    if (access13800Var instanceof AnonymousClass5) {
                        anonymousClass5 = (AnonymousClass5) access13800Var;
                        int i2 = anonymousClass5.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass5.label = i2 - 2147483648;
                        } else {
                            anonymousClass5 = new AnonymousClass5(access13800Var);
                        }
                    }
                    Object obj2 = anonymousClass5.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i3 = anonymousClass5.label;
                    if (i3 != 0) {
                        int i4 = onNavigationEvent + 119;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    } else {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onExtraCallback;
                        long jOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
                        float fIAuthTabCallbackStub = ((int) this.onExtraCallbackWithResult.IAuthTabCallbackStub()) * 0.4f;
                        if ((!Intrinsics.areEqual(this.onExtraCallbackWithResult.asBinder(), r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback)) ? Float.intBitsToFloat((int) jOnNavigationEvent) <= fIAuthTabCallbackStub : Float.intBitsToFloat((int) jOnNavigationEvent) >= (-fIAuthTabCallbackStub)) {
                            int i5 = onNavigationEvent + 55;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            z = false;
                        } else {
                            z = true;
                        }
                        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
                        anonymousClass5.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$1 = access15400.onNavigationEvent(anonymousClass5);
                        anonymousClass5.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass5.I$0 = 0;
                        anonymousClass5.label = 1;
                        if (setripple.emit(boolOnNavigationEvent, anonymousClass5) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            public onNavigationEvent(IAnimation iAnimation, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
                this.onExtraCallback = iAnimation;
                this.onWarmupCompleted = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
                this.onNavigationEvent = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onExtraCallback.collect(new AnonymousClass4(setripple, this.onWarmupCompleted, this.onNavigationEvent), access13800Var);
                if (objCollect != access14300.onWarmupCompleted()) {
                    return Unit.INSTANCE;
                }
                int i2 = IAuthTabCallback;
                int i3 = i2 + 43;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objCollect;
            }
        }

        public static final class onWarmupCompleted implements IAnimation<Boolean> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 onExtraCallbackWithResult;
            final /* synthetic */ IAnimation onWarmupCompleted;

            /* renamed from: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI$onExtraCallback$onWarmupCompleted$1, reason: invalid class name */
            public static final class AnonymousClass1<T> implements setRipple {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 IAuthTabCallback;
                final /* synthetic */ setRipple onWarmupCompleted;

                /* renamed from: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI$onExtraCallback$onWarmupCompleted$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00551 extends ContinuationImpl {
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public C00551(access13800 access13800Var) {
                        super(access13800Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 95;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass1.this.emit(null, this);
                        if (i3 == 0) {
                            int i4 = 86 / 0;
                        }
                        return objEmit;
                    }
                }

                public AnonymousClass1(setRipple setripple, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
                    this.onWarmupCompleted = setripple;
                    this.IAuthTabCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, access13800 access13800Var) {
                    C00551 c00551;
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        boolean z = access13800Var instanceof C00551;
                        throw null;
                    }
                    if (access13800Var instanceof C00551) {
                        c00551 = (C00551) access13800Var;
                        int i3 = c00551.label;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            c00551.label = i3 - 2147483648;
                        } else {
                            c00551 = new C00551(access13800Var);
                        }
                    }
                    Object obj2 = c00551.result;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i4 = c00551.label;
                    if (i4 == 0) {
                        ResultKt.onNavigationEvent(obj2);
                        setRipple setripple = this.onWarmupCompleted;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (this.IAuthTabCallback.access000()) {
                            int i5 = onExtraCallbackWithResult + 119;
                            int i6 = i5 % 128;
                            onNavigationEvent = i6;
                            int i7 = i5 % 2;
                            if (!zBooleanValue) {
                                int i8 = i6 + 3;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                c00551.L$0 = access15400.onNavigationEvent(obj);
                                c00551.L$1 = access15400.onNavigationEvent(c00551);
                                c00551.L$2 = access15400.onNavigationEvent(obj);
                                c00551.L$3 = access15400.onNavigationEvent(setripple);
                                c00551.I$0 = 0;
                                c00551.label = 1;
                                if (setripple.emit(obj, c00551) == objOnWarmupCompleted) {
                                    return objOnWarmupCompleted;
                                }
                            }
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public onWarmupCompleted(IAnimation iAnimation, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
                this.onWarmupCompleted = iAnimation;
                this.onExtraCallbackWithResult = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            }

            public Object collect(setRipple setripple, access13800 access13800Var) {
                int i = 2 % 2;
                Object objCollect = this.onWarmupCompleted.collect(new AnonymousClass1(setripple, this.onExtraCallbackWithResult), access13800Var);
                if (objCollect != access14300.onWarmupCompleted()) {
                    return Unit.INSTANCE;
                }
                int i2 = onNavigationEvent + 103;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 3;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objCollect;
            }
        }

        private static final boolean IAuthTabCallback(r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w.onWarmupCompleted();
            }
            r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w.onWarmupCompleted();
            throw null;
        }

        /* renamed from: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI$onExtraCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $state;
            final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w $transitionState;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$state = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
                this.$transitionState = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, this.$transitionState, access13800Var);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                int i2 = onNavigationEvent + 7;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(((Boolean) obj).booleanValue(), (access13800) obj2);
                if (i3 == 0) {
                    int i4 = 42 / 0;
                }
                int i5 = onNavigationEvent + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(Boolean.valueOf(z), access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                boolean z = this.Z$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 87;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    if (z) {
                        Object obj2 = null;
                        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4.IAuthTabCallback(this.$state, false, false, 3, null);
                        this.Z$0 = z;
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(600L, this) == objOnWarmupCompleted) {
                            int i4 = onNavigationEvent;
                            int i5 = i4 + 3;
                            IAuthTabCallback = i5 % 128;
                            if (i5 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            int i6 = i4 + 25;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                }
                this.$transitionState.onWarmupCompleted(setUseCaseAttached.Companion.IAuthTabCallback());
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w = this.$transitionState;
                onNavigationEvent onnavigationevent = new onNavigationEvent(new onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$TdsToastV1$6$1$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = IAuthTabCallback + 123;
                        onNavigationEvent = i4 % 128;
                        Object obj2 = null;
                        if (i4 % 2 == 0) {
                            Boolean.valueOf(r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w));
                            throw null;
                        }
                        Boolean boolValueOf = Boolean.valueOf(r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w));
                        int i5 = onNavigationEvent + 45;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            return boolValueOf;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }), this.$state), this.$transitionState, this.$state);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, this.$transitionState, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(onnavigationevent, anonymousClass1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 4;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(String str, r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, "");
        if ((i & 6) == 0) {
            int i3 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i5 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1054105857, i, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous> (TdsToastV1.kt:82)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1054105857, i, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous> (TdsToastV1.kt:82)");
            }
            r8lambda7_hp2bu5ehuy2xymzq0osvrlhta.IAuthTabCallback(str, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class asBinder extends Lambda implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Recorder $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Recorder recorder) {
            super(1);
            this.$measurer = recorder;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(@NotNull useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                RecorderExternalSyntheticLambda13.IAuthTabCallback(useandconfigureprogramwithtexture, this.$measurer);
                int i3 = 9 / 0;
            } else {
                Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
                RecorderExternalSyntheticLambda13.IAuthTabCallback(useandconfigureprogramwithtexture, this.$measurer);
            }
            int i4 = onExtraCallback + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $$changed;
        final /* synthetic */ getBacktraceNote $center$inlined;
        final /* synthetic */ getBacktraceNote $left$inlined;
        final /* synthetic */ Function0 $onHelpersChanged;
        final /* synthetic */ getBacktraceNote $right$inlined;
        final /* synthetic */ LifecycleCameraProviderImplExternalSyntheticLambda2 $scope;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $state$inlined;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2, int i, Function0 function0, getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3) {
            super(2);
            this.$scope = lifecycleCameraProviderImplExternalSyntheticLambda2;
            this.$onHelpersChanged = function0;
            this.$left$inlined = getbacktracenote;
            this.$state$inlined = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.$center$inlined = getbacktracenote2;
            this.$right$inlined = getbacktracenote3;
            this.$$changed = i;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            if (r22.onMessageChannelReady() != true) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            r22.ICustomTabsCallbackStubProxy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if ((!r22.onMessageChannelReady()) != true) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
            int i2 = 2 % 2;
            if (((i & 11) ^ 2) == 0) {
                int i3 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 19 / 0;
                }
            }
            int iOnExtraCallback = this.$scope.onExtraCallback();
            this.$scope.IAuthTabCallback();
            LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = this.$scope;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(452254821);
            LifecycleCameraProviderImplExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallbackWithResult();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted = iAuthTabCallbackOnExtraCallbackWithResult.onWarmupCompleted();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback();
            StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback = iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallback();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.$left$inlined);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new onTransact(this.$left$inlined);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, (Function1) objOnMinimized), this.$left$inlined, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.$state$inlined);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new asInterface(stillCaptureProcessorOnCaptureResultCallbackOnWarmupCompleted, this.$state$inlined, stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(new Object[]{this.$center$inlined, this.$state$inlined, lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackIAuthTabCallback, (Function1) objOnMinimized2), cameraCaptureResultEmptyCameraCaptureResult, 0, 0}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1930569279, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1930569280);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.$right$inlined);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent5 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new IAuthTabCallbackDefault(this.$right$inlined);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                int i5 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 4;
                }
            }
            r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(lifecycleCameraProviderImplExternalSyntheticLambda2.onExtraCallback(onextracallback, stillCaptureProcessorOnCaptureResultCallbackOnExtraCallback, (Function1) objOnMinimized3), this.$right$inlined, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (this.$scope.onExtraCallback() != iOnExtraCallback) {
                this.$onHelpersChanged.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, @Nullable getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable Function0<Unit> function0, @Nullable r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
        getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        int i4;
        Function0<Unit> function02;
        int i5;
        r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2;
        getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        final Function0<Unit> function03;
        r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
        boolean z;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
        Function0<Unit> function04;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(582124655);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i8 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                function0.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                int i9 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
                int i11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback) ? 256 : 128;
                i3 |= i11;
            } else {
                r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            }
            i3 |= i11;
        } else {
            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
            getbacktracenote3 = getbacktracenote;
        } else {
            getbacktracenote3 = getbacktracenote;
            if ((i & 3072) == 0) {
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 1024 : 2048;
            }
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
            getbacktracenote4 = getbacktracenote2;
        } else {
            getbacktracenote4 = getbacktracenote2;
            if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4)) {
                    int i14 = onWarmupCompleted + 41;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
            function02 = function0;
        } else {
            function02 = function0;
            if ((196608 & i) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                    int i17 = onExtraCallbackWithResult + 89;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
        }
        if ((1572864 & i) == 0) {
            int i18 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i18 % 128;
            int i19 = i18 % 2;
            r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
            i3 |= ((i2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2)) ? 1048576 : 524288;
            int i20 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i20 % 128;
            int i21 = i20 % 2;
        } else {
            r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i7 != 0) {
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    int i22 = onWarmupCompleted + 101;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                }
                if ((i2 & 4) != 0) {
                    z = true;
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback(null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 15);
                    i3 &= -897;
                } else {
                    z = true;
                }
                getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = i12 != 0 ? null : getbacktracenote;
                if (i13 != 0) {
                    int i24 = onExtraCallbackWithResult + 27;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 != 0) {
                        function0.hashCode();
                        throw null;
                    }
                    getbacktracenote7 = null;
                } else {
                    getbacktracenote7 = getbacktracenote2;
                }
                function0 = i16 == 0 ? function0 : null;
                if ((i2 & 64) != 0) {
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = y1ExternalSyntheticLambda1.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14, 2);
                    i3 &= -3670017;
                } else {
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
                }
                function04 = function0;
                getbacktracenote5 = getbacktracenote9;
                getbacktracenote8 = getbacktracenote7;
                r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
            } else {
                int i25 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i25 % 128;
                if (i25 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 5) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2;
                    function04 = function02;
                    getbacktracenote8 = getbacktracenote4;
                    getbacktracenote5 = getbacktracenote3;
                    z = true;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2;
                    function04 = function02;
                    getbacktracenote8 = getbacktracenote4;
                    getbacktracenote5 = getbacktracenote3;
                    z = true;
                }
            }
            r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
            int i26 = i3;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(582124655, i26, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1 (TdsToastV1.kt:79)");
            }
            onExtraCallbackWithResult(new Object[]{ForwardingCameraControl.onExtraCallback(1054105857, z, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda11
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i27 = 2 % 2;
                    int i28 = onNavigationEvent + 33;
                    IAuthTabCallback = i28 % 128;
                    if (i28 % 2 != 0) {
                        r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(str, (r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(str, (r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i29 = onNavigationEvent + 57;
                    IAuthTabCallback = i29 % 128;
                    int i30 = i29 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport03, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43, getbacktracenote5, getbacktracenote8, function04, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i26 & 3670016) | (i26 & 112) | 6 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26)), 0}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2040912696, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2040912689);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i27 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i27 % 128;
                int i28 = i27 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43;
            getbacktracenote6 = getbacktracenote8;
            function03 = function04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            getbacktracenote5 = getbacktracenote;
            getbacktracenote6 = getbacktracenote2;
            function03 = function0;
            r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = getbacktracenote5;
            final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w4 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i29 = 2 % 2;
                    int i30 = onNavigationEvent + 99;
                    IAuthTabCallback = i30 % 128;
                    int i31 = i30 % 2;
                    Unit unitOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(str, quirksExternalSyntheticBackport02, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, getbacktracenote10, getbacktracenote6, function03, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i32 = onNavigationEvent + 69;
                    IAuthTabCallback = i32 % 128;
                    int i33 = i32 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final component8 onNavigationEvent(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        final int iAsInterface = (int) ((VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) - getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor()) / 2.0f);
        final int iIAuthTabCallbackDefault = Intrinsics.areEqual(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.asBinder(), r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback) ? 0 : VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()) - getstreamsharingchildrenOnExtraCallback.T_();
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()), (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallback + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                int i7 = iAsInterface;
                int i8 = iIAuthTabCallbackDefault;
                Integer numValueOf = Integer.valueOf(i7);
                Integer numValueOf2 = Integer.valueOf(i8);
                Unit unit = (Unit) r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(new Object[]{getstreamsharingchildren, numValueOf, numValueOf2, (getStreamSharingChildren.onExtraCallbackWithResult) obj}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 802893411, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -802893411);
                int i9 = onWarmupCompleted + 57;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        }, 4, (Object) null);
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return component8VarIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, int i, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onextracallbackwithresult.onWarmupCompleted(getstreamsharingchildren, i, i2, Float.MAX_VALUE);
            unit = Unit.INSTANCE;
            int i5 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onextracallbackwithresult.onWarmupCompleted(getstreamsharingchildren, i, i2, Float.MAX_VALUE);
            unit = Unit.INSTANCE;
        }
        int i6 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(412716203);
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(412716203, i, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous>.<anonymous> (TdsToastV1.kt:128)");
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i7 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w = (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) objArr[0];
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[1];
        Futures3 futures3 = (Futures3) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w.IAuthTabCallback(FuturesCallbackListener.IAuthTabCallback(futures3), r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onWarmupCompleted(extensionsManager1.onExtraCallbackWithResult());
            int i3 = 78 / 0;
            return Unit.INSTANCE;
        }
        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onWarmupCompleted(extensionsManager1.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(isQueryRefinementEnabled isqueryrefinementenabled, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1, StateObservableErrorWrapper stateObservableErrorWrapper) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(stateObservableErrorWrapper, "");
        stateObservableErrorWrapper.onTransact(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        stateObservableErrorWrapper.IAuthTabCallbackStub(stateObservableErrorWrapper.onExtraCallback(mappingRedirectableLiveDataExternalSyntheticLambda1.asBinder()));
        stateObservableErrorWrapper.onExtraCallback(mappingRedirectableLiveDataExternalSyntheticLambda1.onExtraCallback());
        stateObservableErrorWrapper.IAuthTabCallbackStub(setIconUri.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) stateObservableErrorWrapper, mappingRedirectableLiveDataExternalSyntheticLambda1.IAuthTabCallbackDefault()));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult implements PointerInputEventHandler {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w IAuthTabCallback;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 onExtraCallback;

        onExtraCallbackWithResult(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w) {
            this.onExtraCallback = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.IAuthTabCallback = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = this.onExtraCallback;
            final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w = this.IAuthTabCallback;
            Function1<setUseCaseAttached, Unit> function1 = new Function1<setUseCaseAttached, Unit>() { // from class: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult.3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public /* synthetic */ Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    onWarmupCompleted(((setUseCaseAttached) obj).onExtraCallback());
                    Unit unit = Unit.INSTANCE;
                    int i5 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }

                public final void onWarmupCompleted(long j) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onExtraCallback(true);
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w.onWarmupCompleted(true);
                    int i5 = IAuthTabCallback + 79;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            };
            final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42 = this.onExtraCallback;
            final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2 = this.IAuthTabCallback;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult.5
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public /* synthetic */ Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 91;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    onExtraCallback();
                    Unit unit = Unit.INSTANCE;
                    int i5 = onNavigationEvent + 109;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }

                public final void onExtraCallback() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 65;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.onExtraCallback(false);
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2.onWarmupCompleted(false);
                    int i5 = onExtraCallback + 7;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            };
            final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43 = this.onExtraCallback;
            final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = this.IAuthTabCallback;
            Function0<Unit> function02 = new Function0<Unit>() { // from class: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult.1
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public /* synthetic */ Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 125;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    onNavigationEvent();
                    Unit unit = Unit.INSTANCE;
                    int i5 = IAuthTabCallback + 75;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return unit;
                }

                public final void onNavigationEvent() {
                    r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn44;
                    boolean z;
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 11;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn44 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43;
                        z = true;
                    } else {
                        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn44 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43;
                        z = false;
                    }
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn44.onExtraCallback(z);
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3.onWarmupCompleted(z);
                }
            };
            final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w4 = this.IAuthTabCallback;
            Object objOnExtraCallback = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallback(highPriorityExecutor, function1, function0, function02, new Function2<HandlerScheduledExecutorService2, setUseCaseAttached, Unit>() { // from class: o.r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult.4
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 27;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    IAuthTabCallback((HandlerScheduledExecutorService2) obj, ((setUseCaseAttached) obj2).onExtraCallback());
                    Unit unit = Unit.INSTANCE;
                    int i5 = onNavigationEvent + 121;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final void IAuthTabCallback(HandlerScheduledExecutorService2 handlerScheduledExecutorService2, long j) {
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 29;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
                    handlerScheduledExecutorService2.onExtraCallback();
                    r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w4.IAuthTabCallback(j);
                    int i5 = onWarmupCompleted + 85;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 81 / 0;
                    }
                }
            }, access13800Var);
            if (objOnExtraCallback != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = onNavigationEvent + 123;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 63 / 0;
            }
            return objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final isQueryRefinementEnabled isqueryrefinementenabled, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, Function0 function0, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-436101432, i, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous>.<anonymous> (TdsToastV1.kt:150)");
        }
        final MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1OnWarmupCompleted = AppLovinAdService.onWarmupCompleted(accessgetINSTANCEScp.WeakDown, cameraCaptureResultEmptyCameraCaptureResult, 6);
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        Object obj = null;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onExtraCallbackWithResult(), 0.0f, 2, (Object) null);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda13
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unit = (Unit) r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(new Object[]{r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, (ExtensionsManager1) obj2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 205929030, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -205929022);
                    int i8 = onNavigationEvent + 29;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    return unit;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!zOnNavigationEvent2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda14
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj2;
                    if (i7 == 0) {
                        return r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                    }
                    ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnNavigationEvent = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                    int i8 = 1 / 0;
                    return extensionsInfoExternalSyntheticLambda0OnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            int i5 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = CaptureNoResponseQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, (Function1) objOnMinimized2);
        toMetersPerSecond tometerspersecondOnExtraCallback = RectangleShapeKt.onExtraCallback();
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(mappingRedirectableLiveDataExternalSyntheticLambda1OnWarmupCompleted);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback | zOnNavigationEvent3)) {
            int i7 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj2) {
                        int i8 = 2 % 2;
                        int i9 = IAuthTabCallback + 119;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(isqueryrefinementenabled, mappingRedirectableLiveDataExternalSyntheticLambda1OnWarmupCompleted, (StateObservableErrorWrapper) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(isqueryrefinementenabled, mappingRedirectableLiveDataExternalSyntheticLambda1OnWarmupCompleted, (StateObservableErrorWrapper) obj2);
                        int i10 = IAuthTabCallback + 123;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = StreamSpec.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, tometerspersecondOnExtraCallback, (Function1) objOnMinimized3);
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled);
        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnExtraCallback2 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda16
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 123;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(isqueryrefinementenabled, (flipHorizontally) obj2);
                        throw null;
                    }
                    Unit unitIAuthTabCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(isqueryrefinementenabled, (flipHorizontally) obj2);
                    int i10 = onNavigationEvent + 101;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return unitIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            int i8 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized4);
        if (r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w.onExtraCallback()) {
            quirksExternalSyntheticBackport0IAuthTabCallback3 = quirksExternalSyntheticBackport0IAuthTabCallback3.onExtraCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(onextracallback, Unit.INSTANCE, new onExtraCallbackWithResult(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w)));
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0IAuthTabCallback3;
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized5 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
        }
        onExtraCallbackWithResult(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, setTitleTextColor.onWarmupCompleted(quirksExternalSyntheticBackport0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized5, (MediationAdapterRouter) addAdapter.onWarmupCompleted(1972255785, -1972255784, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{null, null, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted()), (setTitleMarginStart) null, false, (String) null, (Role) null, function0, 60, (Object) null), getbacktracenote2, Intrinsics.areEqual(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.asBinder(), r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback) ? null : getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $alpha;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $state;
        final /* synthetic */ r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w $transitionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$alpha = isqueryrefinementenabled;
            this.$state = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.$transitionState = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$alpha, this.$state, this.$transitionState, access13800Var);
            int i2 = IAuthTabCallback + 11;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r1
          0x0042: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
          0x0025: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 21 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$alpha;
                    Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$state.access000() ? 1.0f : 0.0f);
                    getThumbPosition getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(this.$transitionState.IAuthTabCallback(), 0, 2, (Object) null);
                    this.label = 1;
                    if (isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null) == objOnWarmupCompleted) {
                        int i5 = onWarmupCompleted + 113;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = IAuthTabCallback + 119;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc A[PHI: r17
      0x00dc: PHI (r17v5 int) = (r17v4 int), (r17v25 int), (r17v26 int) binds: [B:54:0x00ca, B:61:0x00da, B:60:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        boolean z;
        getBacktraceNote getbacktracenote;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i7;
        int i8;
        final getBacktraceNote getbacktracenote2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
        int i9;
        getBacktraceNote getbacktracenote3;
        getBacktraceNote getbacktracenote4;
        Function0 function0;
        getSwitchMinWidth getswitchminwidthOnWarmupCompleted;
        Object objIAuthTabCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        isQueryRefinementEnabled isqueryrefinementenabled;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        boolean zIAuthTabCallback;
        Object objOnMinimized3;
        float fIAuthTabCallback;
        float f;
        Object obj;
        SearchView searchViewOnExtraCallback;
        SearchView searchViewOnWarmupCompleted;
        r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback iAuthTabCallback;
        boolean z2;
        boolean z3;
        Object objOnMinimized4;
        isQueryRefinementEnabled isqueryrefinementenabled2;
        boolean z4;
        boolean zOnExtraCallback;
        boolean z5;
        boolean z6;
        Object objOnMinimized5;
        boolean z7;
        final getBacktraceNote getbacktracenote5 = (getBacktraceNote) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = (QuirksExternalSyntheticBackport0) objArr[1];
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[2];
        getBacktraceNote getbacktracenote6 = (getBacktraceNote) objArr[3];
        final getBacktraceNote getbacktracenote7 = (getBacktraceNote) objArr[4];
        final Function0 function02 = (Function0) objArr[5];
        final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote5, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(656285802);
        if ((iIntValue & 6) == 0) {
            i = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        int i11 = iIntValue2 & 2;
        if (i11 == 0) {
            if ((iIntValue & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport05)) {
                    int i12 = onWarmupCompleted + 41;
                    onExtraCallbackWithResult = i12 % 128;
                    i2 = i12 % 2 == 0 ? 76 : 32;
                } else {
                    i2 = 16;
                }
                i3 = i2 | i;
            }
            if ((iIntValue & 384) == 0) {
                i3 |= ((iIntValue2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback)) ? 256 : 128;
            }
            i4 = iIntValue2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((iIntValue & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote6) ? 2048 : 1024;
            }
            i5 = iIntValue2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((iIntValue & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote7) ? 16384 : 8192;
            }
            i6 = iIntValue2 & 32;
            int i13 = 196608;
            if (i6 != 0) {
                i3 |= i13;
            } else if ((iIntValue & 196608) == 0) {
                i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 131072 : 65536;
                i3 |= i13;
            }
            if ((iIntValue & 1572864) != 0) {
                i3 |= ((iIntValue2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent)) ? 1048576 : 524288;
                int i14 = onWarmupCompleted + 37;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
            }
            if ((599187 & i3) == 599186) {
                int i16 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i16 % 128;
                z = i16 % 2 == 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                getbacktracenote = getbacktracenote5;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i7 = iIntValue;
                i8 = iIntValue2;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                getbacktracenote2 = getbacktracenote6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i11 != 0) {
                        int i17 = onWarmupCompleted + 67;
                        onExtraCallbackWithResult = i17 % 128;
                        if (i17 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    }
                    if ((iIntValue2 & 4) != 0) {
                        int i18 = onWarmupCompleted + 71;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback(null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 15);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        getbacktracenote6 = null;
                    }
                    if (i5 != 0) {
                        getbacktracenote7 = null;
                    }
                    if (i6 != 0) {
                        function02 = null;
                    }
                    if ((iIntValue2 & 64) != 0) {
                        r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = y1ExternalSyntheticLambda1.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 14, 2);
                        i3 = (-3670017) & i3;
                    }
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
                    i9 = i3;
                    getbacktracenote3 = getbacktracenote6;
                    getbacktracenote4 = getbacktracenote7;
                    function0 = function02;
                } else {
                    int i20 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((iIntValue2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    int i22 = onWarmupCompleted + 59;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
                    i9 = i3;
                    getbacktracenote3 = getbacktracenote6;
                    getbacktracenote4 = getbacktracenote7;
                    function0 = function02;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(656285802, i9, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1 (TdsToastV1.kt:104)");
                }
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                isQueryRefinementEnabled isqueryrefinementenabled3 = (isQueryRefinementEnabled) objOnMinimized6;
                int i24 = (i9 & 896) ^ 384;
                boolean z8 = (i24 > 256 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42)) || (i9 & 384) == 256;
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z8) {
                    int i25 = onWarmupCompleted + 3;
                    onExtraCallbackWithResult = i25 % 128;
                    if (i25 % 2 == 0) {
                        int i26 = 66 / 0;
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda0
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int i27 = 2 % 2;
                                    int i28 = onWarmupCompleted + 17;
                                    onExtraCallbackWithResult = i28 % 128;
                                    int i29 = i28 % 2;
                                    r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
                                    component4 component4Var = (component4) obj3;
                                    component7 component7Var = (component7) obj4;
                                    VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) obj5;
                                    if (i29 != 0) {
                                        return r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43, component4Var, component7Var, virtualCameraCaptureResult);
                                    }
                                    r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43, component4Var, component7Var, virtualCameraCaptureResult);
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport04, (getBacktraceNote) objOnMinimized7);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent.onNavigationEvent()), "offsetTransition", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                        getBacktraceNote getbacktracenote8 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                updateFocusedState updatefocusedstateOnWarmupCompleted;
                                int i27 = 2 % 2;
                                int i28 = IAuthTabCallback + 15;
                                onExtraCallbackWithResult = i28 % 128;
                                getSwitchMinWidth.onExtraCallback onextracallback2 = (getSwitchMinWidth.onExtraCallback) obj3;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj4;
                                if (i28 % 2 == 0) {
                                    updatefocusedstateOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(onextracallback2, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj5).intValue());
                                    int i29 = 92 / 0;
                                } else {
                                    updatefocusedstateOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(onextracallback2, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj5).intValue());
                                }
                                int i30 = onExtraCallbackWithResult + 51;
                                IAuthTabCallback = i30 % 128;
                                int i31 = i30 % 2;
                                return updatefocusedstateOnWarmupCompleted;
                            }
                        };
                        getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(setUseCaseAttached.Companion);
                        if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                            objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent3 || objIAuthTabCallback == onwarmupcompleted.onExtraCallback()) {
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback2.IAuthTabCallback();
                                Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                                r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                                i8 = iIntValue2;
                                try {
                                    Object objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                                    iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback2);
                                    objIAuthTabCallback = objIAuthTabCallback2;
                                } catch (Throwable th) {
                                    iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                                    throw th;
                                }
                            } else {
                                i8 = iIntValue2;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            i8 = iIntValue2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                        }
                        long jOnExtraCallback = ((setUseCaseAttached) objIAuthTabCallback).onExtraCallback();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1395719714);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            i7 = iIntValue;
                        } else {
                            i7 = iIntValue;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1395719714, 0, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous>.<anonymous> (TdsToastV1.kt:130)");
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setUseCaseAttached setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(jOnExtraCallback);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidthOnWarmupCompleted));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        long jOnExtraCallback2 = ((setUseCaseAttached) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).onExtraCallback();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1395719714);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            isqueryrefinementenabled = isqueryrefinementenabled3;
                        } else {
                            isqueryrefinementenabled = isqueryrefinementenabled3;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1395719714, 0, -1, "im.toss.tds.compose.component.compound.toast.v1.TdsToastV1.<anonymous>.<anonymous> (TdsToastV1.kt:130)");
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setUseCaseAttached setusecaseattachedOnNavigationEvent2 = setUseCaseAttached.onNavigationEvent(jOnExtraCallback2);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setusecaseattachedOnNavigationEvent, setusecaseattachedOnNavigationEvent2, (updateFocusedState) getbacktracenote8.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistIAuthTabCallback, "offsetAnim", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                        zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.onExtraCallback());
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zIAuthTabCallback || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.onExtraCallback()));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback();
                        boolean zAccess000 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.access000();
                        ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooksIAuthTabCallback = !processDeepLink.onExtraCallback() ? ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback((updateFocusedState) null, 0.0f, 3, (Object) null) : r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.IAuthTabCallbackDefault());
                        if (processDeepLink.onExtraCallback()) {
                            f = 0.0f;
                            obj = null;
                            searchViewOnExtraCallback = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent.onExtraCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.IAuthTabCallbackDefault());
                        } else {
                            int i27 = onExtraCallbackWithResult + 59;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 != 0) {
                                obj = null;
                                searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 2.0f, 3, (Object) null);
                                f = 0.0f;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompletedAsBinder = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder();
                                iAuthTabCallback = r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback;
                                float fIAuthTabCallback2 = Intrinsics.areEqual(onwarmupcompletedAsBinder, iAuthTabCallback) ? fIAuthTabCallback : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f);
                                if (Intrinsics.areEqual(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder(), iAuthTabCallback)) {
                                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, 0.0f, fIAuthTabCallback2, 0.0f, fIAuthTabCallback, 5, (Object) null);
                                int i28 = (3670016 & i9) ^ 1572864;
                                z2 = (i28 > 1048576 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent)) || (i9 & 1572864) == 1048576;
                                z3 = (i24 > 256 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42)) || (i9 & 384) == 256;
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if ((z2 | z3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda2
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj3) {
                                            int i29 = 2 % 2;
                                            int i30 = IAuthTabCallback + 17;
                                            onWarmupCompleted = i30 % 128;
                                            int i31 = i30 % 2;
                                            Unit unitOnNavigationEvent = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, (Futures3) obj3);
                                            int i32 = IAuthTabCallback + 77;
                                            onWarmupCompleted = i32 % 128;
                                            if (i32 % 2 != 0) {
                                                return unitOnNavigationEvent;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized4);
                                final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
                                final isQueryRefinementEnabled isqueryrefinementenabled4 = isqueryrefinementenabled;
                                final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
                                isqueryrefinementenabled2 = isqueryrefinementenabled;
                                final Function0 function03 = function0;
                                getbacktracenote = getbacktracenote5;
                                r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
                                final getBacktraceNote getbacktracenote9 = getbacktracenote3;
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                final getBacktraceNote getbacktracenote10 = getbacktracenote4;
                                getBacktraceNote getbacktracenote11 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda3
                                    private static int onExtraCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i29 = 2 % 2;
                                        int i30 = onExtraCallback + 93;
                                        onWarmupCompleted = i30 % 128;
                                        int i31 = i30 % 2;
                                        Unit unit = (Unit) r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(new Object[]{getbacktracenote5, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn43, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, isqueryrefinementenabled4, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, function03, getbacktracenote9, getbacktracenote10, (setHorizontalGravity) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1177266895, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1177266890);
                                        int i32 = onWarmupCompleted + 37;
                                        onExtraCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        return unit;
                                    }
                                };
                                z4 = true;
                                setVerticalGravity.onWarmupCompleted(zAccess000, quirksExternalSyntheticBackport0OnNavigationEvent, resourceManagerInternalResourceManagerHooksIAuthTabCallback, searchViewOnWarmupCompleted, (String) null, ForwardingCameraControl.onExtraCallback(-436101432, true, getbacktracenote11, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196608, 16);
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                boolean zAccess0002 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.access000();
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
                                z5 = (i24 <= 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42)) || (i9 & 384) == 256;
                                r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w2;
                                z6 = (i28 > 1048576 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent)) || (i9 & 1572864) == 1048576;
                                objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if ((zOnExtraCallback | z5 | z6) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new onWarmupCompleted(isqueryrefinementenabled2, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, null);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zAccess0002), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                z7 = (i28 <= 1048576 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent)) || (i9 & 1572864) == 1048576;
                                if ((i24 <= 256 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42)) && (i9 & 384) != 256) {
                                    z4 = false;
                                }
                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z7 | z4)) {
                                    int i29 = onExtraCallbackWithResult + 101;
                                    onWarmupCompleted = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        int i30 = 38 / 0;
                                        if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized8 = new onExtraCallback(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, null);
                                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                                        }
                                        isZslDisabledByByUserCaseConfig.onExtraCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, ((i9 >> 15) & 112) | ((i9 >> 6) & 14));
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
                                        getbacktracenote2 = getbacktracenote3;
                                        getbacktracenote7 = getbacktracenote4;
                                        function02 = function0;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                    } else {
                                        if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                        }
                                        isZslDisabledByByUserCaseConfig.onExtraCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult, ((i9 >> 15) & 112) | ((i9 >> 6) & 14));
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
                                        getbacktracenote2 = getbacktracenote3;
                                        getbacktracenote7 = getbacktracenote4;
                                        function02 = function0;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                    }
                                }
                            } else {
                                f = 0.0f;
                                obj = null;
                                searchViewOnExtraCallback = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted((updateFocusedState) null, 0.0f, 3, (Object) null);
                            }
                        }
                        searchViewOnWarmupCompleted = searchViewOnExtraCallback;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback22 = QuirksExternalSyntheticBackport0.Companion;
                        r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompletedAsBinder2 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder();
                        iAuthTabCallback = r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback;
                        if (Intrinsics.areEqual(onwarmupcompletedAsBinder2, iAuthTabCallback)) {
                        }
                        if (Intrinsics.areEqual(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder(), iAuthTabCallback)) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback22, 0.0f, fIAuthTabCallback2, 0.0f, fIAuthTabCallback, 5, (Object) null);
                        int i282 = (3670016 & i9) ^ 1572864;
                        if (i282 > 1048576) {
                            if (i24 > 256) {
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z2 | z3) {
                                    objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda2
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj3) {
                                            int i292 = 2 % 2;
                                            int i302 = IAuthTabCallback + 17;
                                            onWarmupCompleted = i302 % 128;
                                            int i31 = i302 % 2;
                                            Unit unitOnNavigationEvent = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, (Futures3) obj3);
                                            int i32 = IAuthTabCallback + 77;
                                            onWarmupCompleted = i32 % 128;
                                            if (i32 % 2 != 0) {
                                                return unitOnNavigationEvent;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized4);
                                    final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn432 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42;
                                    final isQueryRefinementEnabled isqueryrefinementenabled42 = isqueryrefinementenabled;
                                    final r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
                                    isqueryrefinementenabled2 = isqueryrefinementenabled;
                                    final Function0 function032 = function0;
                                    getbacktracenote = getbacktracenote5;
                                    r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w22 = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent;
                                    final getBacktraceNote getbacktracenote92 = getbacktracenote3;
                                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    final getBacktraceNote getbacktracenote102 = getbacktracenote4;
                                    getBacktraceNote getbacktracenote112 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda3
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            int i292 = 2 % 2;
                                            int i302 = onExtraCallback + 93;
                                            onWarmupCompleted = i302 % 128;
                                            int i31 = i302 % 2;
                                            Unit unit = (Unit) r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(new Object[]{getbacktracenote5, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn432, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback, isqueryrefinementenabled42, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w3, function032, getbacktracenote92, getbacktracenote102, (setHorizontalGravity) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1177266895, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1177266890);
                                            int i32 = onWarmupCompleted + 37;
                                            onExtraCallback = i32 % 128;
                                            int i33 = i32 % 2;
                                            return unit;
                                        }
                                    };
                                    z4 = true;
                                    setVerticalGravity.onWarmupCompleted(zAccess000, quirksExternalSyntheticBackport0OnNavigationEvent2, resourceManagerInternalResourceManagerHooksIAuthTabCallback, searchViewOnWarmupCompleted, (String) null, ForwardingCameraControl.onExtraCallback(-436101432, true, getbacktracenote112, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196608, 16);
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    boolean zAccess00022 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.access000();
                                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(isqueryrefinementenabled2);
                                    if (i24 <= 256) {
                                        r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w22;
                                        if (i282 > 1048576) {
                                            objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (zOnExtraCallback | z5 | z6) {
                                                objOnMinimized5 = new onWarmupCompleted(isqueryrefinementenabled2, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, null);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zAccess00022), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, 0);
                                                if (i282 <= 1048576) {
                                                    if (i24 <= 256) {
                                                        z4 = false;
                                                        Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!(z7 | z4)) {
                                                        }
                                                    } else {
                                                        z4 = false;
                                                        Object objOnMinimized822 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (!(z7 | z4)) {
                                                        }
                                                    }
                                                } else {
                                                    if (i24 <= 256) {
                                                    }
                                                }
                                            }
                                        } else {
                                            objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (zOnExtraCallback | z5 | z6) {
                                            }
                                        }
                                    } else {
                                        r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent = r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w22;
                                        if (i282 > 1048576) {
                                        }
                                    }
                                }
                            } else {
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z2 | z3) {
                                }
                            }
                        } else {
                            if (i24 > 256) {
                            }
                        }
                    } else {
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport04, (getBacktraceNote) objOnMinimized7);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted3);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent.onNavigationEvent()), "offsetTransition", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                        getBacktraceNote getbacktracenote82 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                updateFocusedState updatefocusedstateOnWarmupCompleted;
                                int i272 = 2 % 2;
                                int i283 = IAuthTabCallback + 15;
                                onExtraCallbackWithResult = i283 % 128;
                                getSwitchMinWidth.onExtraCallback onextracallback23 = (getSwitchMinWidth.onExtraCallback) obj3;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj4;
                                if (i283 % 2 == 0) {
                                    updatefocusedstateOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(onextracallback23, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj5).intValue());
                                    int i292 = 92 / 0;
                                } else {
                                    updatefocusedstateOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(onextracallback23, cameraCaptureResultEmptyCameraCaptureResult3, ((Integer) obj5).intValue());
                                }
                                int i302 = onExtraCallbackWithResult + 51;
                                IAuthTabCallback = i302 % 128;
                                int i31 = i302 % 2;
                                return updatefocusedstateOnWarmupCompleted;
                            }
                        };
                        getThumbTintList getthumbtintlistIAuthTabCallback2 = getThumbTextPadding.IAuthTabCallback(setUseCaseAttached.Companion);
                        if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                        }
                        long jOnExtraCallback3 = ((setUseCaseAttached) objIAuthTabCallback).onExtraCallback();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1395719714);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setUseCaseAttached setusecaseattachedOnNavigationEvent3 = setUseCaseAttached.onNavigationEvent(jOnExtraCallback3);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidthOnWarmupCompleted));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            long jOnExtraCallback22 = ((setUseCaseAttached) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).onExtraCallback();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1395719714);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            setUseCaseAttached setusecaseattachedOnNavigationEvent22 = setUseCaseAttached.onNavigationEvent(jOnExtraCallback22);
                            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnNavigationEvent2) {
                                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setusecaseattachedOnNavigationEvent3, setusecaseattachedOnNavigationEvent22, (updateFocusedState) getbacktracenote82.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistIAuthTabCallback2, "offsetAnim", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                                zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.onExtraCallback());
                                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zIAuthTabCallback) {
                                    objOnMinimized3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.onExtraCallback()));
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                    fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized3).IAuthTabCallback();
                                    boolean zAccess0003 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.access000();
                                    if (!processDeepLink.onExtraCallback()) {
                                    }
                                    if (processDeepLink.onExtraCallback()) {
                                    }
                                    searchViewOnWarmupCompleted = searchViewOnExtraCallback;
                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback222 = QuirksExternalSyntheticBackport0.Companion;
                                    r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted onwarmupcompletedAsBinder22 = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder();
                                    iAuthTabCallback = r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted.IAuthTabCallback.onExtraCallback;
                                    if (Intrinsics.areEqual(onwarmupcompletedAsBinder22, iAuthTabCallback)) {
                                    }
                                    if (Intrinsics.areEqual(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn42.asBinder(), iAuthTabCallback)) {
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback222, 0.0f, fIAuthTabCallback2, 0.0f, fIAuthTabCallback, 5, (Object) null);
                                    int i2822 = (3670016 & i9) ^ 1572864;
                                    if (i2822 > 1048576) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final getBacktraceNote getbacktracenote12 = getbacktracenote;
            final int i31 = i7;
            final int i32 = i8;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i33 = 2 % 2;
                    int i34 = IAuthTabCallback + 99;
                    onExtraCallback = i34 % 128;
                    int i35 = i34 % 2;
                    Unit unitOnExtraCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(getbacktracenote12, quirksExternalSyntheticBackport02, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote2, getbacktracenote7, function02, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7wOnNavigationEvent, i31, i32, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i36 = IAuthTabCallback + 45;
                    onExtraCallback = i36 % 128;
                    int i37 = i36 % 2;
                    return unitOnExtraCallback;
                }
            });
            return null;
        }
        i |= 48;
        i3 = i;
        if ((iIntValue & 384) == 0) {
        }
        i4 = iIntValue2 & 8;
        if (i4 == 0) {
        }
        i5 = iIntValue2 & 16;
        if (i5 == 0) {
        }
        i6 = iIntValue2 & 32;
        int i132 = 196608;
        if (i6 != 0) {
        }
        if ((iIntValue & 1572864) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r5
      0x0032: PHI (r5v6 float) = (r5v1 float), (r5v7 float) binds: [B:8:0x002c, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r5
      0x002e: PHI (r5v2 float) = (r5v1 float), (r5v7 float) binds: [B:8:0x002c, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final AppLovinAdClickListener onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) {
        float fC_;
        float f;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.IAuthTabCallbackStub());
            if (r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onNavigationEvent() > 1) {
                f = 0.2f;
            } else {
                int i3 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                f = 1.0f;
            }
        } else {
            fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.IAuthTabCallbackStub());
            if (r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onNavigationEvent() > 1) {
            }
        }
        return new AppLovinAdClickListener(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fC_ * f), null);
    }

    static final class onTransact implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;

        /* JADX WARN: Multi-variable type inference failed */
        onTransact(getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
            this.IAuthTabCallback = getbacktracenote;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            RecorderExternalSyntheticLambda11 recorderExternalSyntheticLambda11OnExtraCallback;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().IAuthTabCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 4, (Object) null);
            if (this.IAuthTabCallback == null) {
                int i2 = onNavigationEvent + 11;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    RecorderExternalSyntheticLambda11.Companion.IAuthTabCallback();
                    throw null;
                }
                recorderExternalSyntheticLambda11OnExtraCallback = RecorderExternalSyntheticLambda11.Companion.IAuthTabCallback();
            } else {
                recorderExternalSyntheticLambda11OnExtraCallback = RecorderExternalSyntheticLambda11.Companion.onExtraCallback();
            }
            stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(recorderExternalSyntheticLambda11OnExtraCallback);
            int i3 = onNavigationEvent + 11;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    static final class asInterface implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallback;
        final /* synthetic */ StillCaptureProcessorOnCaptureResultCallback onExtraCallbackWithResult;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 onNavigationEvent;

        asInterface(StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, StillCaptureProcessorOnCaptureResultCallback stillCaptureProcessorOnCaptureResultCallback2) {
            this.onExtraCallback = stillCaptureProcessorOnCaptureResultCallback;
            this.onNavigationEvent = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.onExtraCallbackWithResult = stillCaptureProcessorOnCaptureResultCallback2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 35 / 0;
            }
            return unit;
        }

        public final void IAuthTabCallback(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
            stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback().onExtraCallback(this.onExtraCallback.onWarmupCompleted(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), y1ExternalSyntheticLambda8.onExtraCallback(this.onNavigationEvent.IAuthTabCallback()));
            stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent().onExtraCallback(this.onExtraCallbackWithResult.IAuthTabCallback(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), y1ExternalSyntheticLambda8.onNavigationEvent(this.onNavigationEvent.IAuthTabCallback()));
            MlKitAnalyzerExternalSyntheticLambda0.onExtraCallback onextracallback = MlKitAnalyzerExternalSyntheticLambda0.Companion;
            stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(onextracallback.IAuthTabCallback());
            stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(onextracallback.onExtraCallback());
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static final class IAuthTabCallbackDefault implements Function1<StillCaptureProcessorExternalSyntheticLambda0, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackDefault(getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote) {
            this.onNavigationEvent = getbacktracenote;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult((StillCaptureProcessorExternalSyntheticLambda0) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 97;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallbackWithResult(StillCaptureProcessorExternalSyntheticLambda0 stillCaptureProcessorExternalSyntheticLambda0) {
            RecorderExternalSyntheticLambda11 recorderExternalSyntheticLambda11OnExtraCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(stillCaptureProcessorExternalSyntheticLambda0, "");
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.asInterface(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallback(), 0.0f, 0.0f, 6, (Object) null);
            QualityRatioToResolutionsTableExternalSyntheticLambda0.onExtraCallbackWithResult.onExtraCallbackWithResult(stillCaptureProcessorExternalSyntheticLambda0.onWarmupCompleted(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onExtraCallbackWithResult(), 0.0f, 0.0f, 6, (Object) null);
            RecorderExternalSyntheticLambda14.onExtraCallbackWithResult.IAuthTabCallback(stillCaptureProcessorExternalSyntheticLambda0.onNavigationEvent(), stillCaptureProcessorExternalSyntheticLambda0.onExtraCallback().onWarmupCompleted(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 4, (Object) null);
            if (this.onNavigationEvent == null) {
                int i4 = onWarmupCompleted + 27;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                recorderExternalSyntheticLambda11OnExtraCallback = RecorderExternalSyntheticLambda11.Companion.IAuthTabCallback();
            } else {
                recorderExternalSyntheticLambda11OnExtraCallback = RecorderExternalSyntheticLambda11.Companion.onExtraCallback();
            }
            stillCaptureProcessorExternalSyntheticLambda0.IAuthTabCallback(recorderExternalSyntheticLambda11OnExtraCallback);
            int i6 = onExtraCallback + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final getBacktraceNote<? super r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        int i5;
        int i6;
        getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        int i7;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(565883182);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) ? 32 : 16;
            int i9 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    getbacktracenote4 = getbacktracenote2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote4)) {
                        int i12 = onWarmupCompleted + 115;
                        int i13 = i12 % 128;
                        onExtraCallbackWithResult = i13;
                        int i14 = i12 % 2;
                        int i15 = i13 + 63;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 2048;
                    } else {
                        int i17 = onWarmupCompleted + 83;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        getbacktracenote5 = getbacktracenote3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote5)) {
                            int i19 = onExtraCallbackWithResult + 121;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        getbacktracenote6 = getbacktracenote4;
                        getbacktracenote7 = getbacktracenote5;
                    } else {
                        int i21 = onExtraCallbackWithResult + 57;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = i4 != 0 ? null : getbacktracenote4;
                        if (i6 != 0) {
                            int i23 = onWarmupCompleted + 123;
                            onExtraCallbackWithResult = i23 % 128;
                            if (i23 % 2 == 0) {
                                throw null;
                            }
                            getbacktracenote5 = null;
                        }
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(565883182, i3, -1, "im.toss.tds.compose.component.compound.toast.v1.ToastContent (TdsToastV1.kt:244)");
                        }
                        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        int iOnNavigationEvent = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onNavigationEvent();
                        long jIAuthTabCallbackStub = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.IAuthTabCallbackStub();
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnNavigationEvent);
                        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jIAuthTabCallbackStub);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback | zOnWarmupCompleted) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda9
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i24 = 2 % 2;
                                    int i25 = onNavigationEvent + 45;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    AppLovinAdClickListener appLovinAdClickListenerOnWarmupCompleted = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
                                    int i27 = onExtraCallback + 105;
                                    onNavigationEvent = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        return appLovinAdClickListenerOnWarmupCompleted;
                                    }
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                            });
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.onWarmupCompleted(), IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<AppLovinAdClickListener>) objOnMinimized)), 0.0f, y1ExternalSyntheticLambda8.onExtraCallbackWithResult(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.IAuthTabCallback()), 0.0f, y1ExternalSyntheticLambda8.onWarmupCompleted(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4.IAuthTabCallback()), 5, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-270267499);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new Recorder();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        Recorder recorder = (Recorder) objOnMinimized2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new LifecycleCameraProviderImplExternalSyntheticLambda2();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        LifecycleCameraProviderImplExternalSyntheticLambda2 lifecycleCameraProviderImplExternalSyntheticLambda2 = (LifecycleCameraProviderImplExternalSyntheticLambda2) objOnMinimized3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-3687241);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        Pair pairOnNavigationEvent = onProcessCompleted.onNavigationEvent(257, lifecycleCameraProviderImplExternalSyntheticLambda2, (getSupportedHighSpeedResolutionsFor) objOnMinimized4, recorder, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 4544);
                        callAllGets.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, new asBinder(recorder), 1, (Object) null), ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, -819893854, true, new IAuthTabCallbackStub(lifecycleCameraProviderImplExternalSyntheticLambda2, 0, (Function0) pairOnNavigationEvent.IAuthTabCallback(), getbacktracenote8, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote, getbacktracenote5)), (component5) pairOnNavigationEvent.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        getbacktracenote7 = getbacktracenote5;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        getbacktracenote6 = getbacktracenote8;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda10
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = onWarmupCompleted + 113;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnExtraCallbackWithResult = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport03, getbacktracenote6, getbacktracenote7, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i27 = onNavigationEvent + 81;
                                onWarmupCompleted = i27 % 128;
                                if (i27 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                getbacktracenote5 = getbacktracenote3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            getbacktracenote4 = getbacktracenote2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            getbacktracenote5 = getbacktracenote3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        getbacktracenote4 = getbacktracenote2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        getbacktracenote5 = getbacktracenote3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1158170907);
            i3 = i2 & 1;
            if (i3 != 0) {
                i4 = i | 6;
            }
            if ((i & 48) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 19) == 18, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                int i8 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
            } else {
                if (i3 != 0) {
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1158170907, i4, -1, "im.toss.tds.compose.component.compound.toast.v1.ToastLeftContent (TdsToastV1.kt:318)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new y0a();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                y0a y0aVar = (y0a) objOnMinimized;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                if (getbacktracenote == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1751530639);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1857616306);
                    getbacktracenote.invoke(y0aVar, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 & 112) | 6));
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda8
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 75;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnExtraCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallback(quirksExternalSyntheticBackport0, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i13 = onNavigationEvent + 97;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1158170907);
        i3 = 0;
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                i5 = 4;
            } else {
                int i10 = onExtraCallbackWithResult + 119;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 19) == 18, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        boolean z = true;
        final r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4 = (r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4) objArr[1];
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i3 = 4;
        final int iIntValue = ((Number) objArr[4]).intValue();
        final int iIntValue2 = ((Number) objArr[5]).intValue();
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1663696355);
        if ((iIntValue & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                i3 = 2;
            } else {
                int i5 = onWarmupCompleted + 85;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4) ? 32 : 16;
        }
        int i7 = iIntValue2 & 4;
        if (i7 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                i2 = 256;
            } else {
                int i8 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 3;
                }
                i2 = 128;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) != 146, i & 1)) {
            if (i7 != 0) {
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1663696355, i, -1, "im.toss.tds.compose.component.compound.toast.v1.ToastCenterContent (TdsToastV1.kt:333)");
            }
            if ((i & 112) != 32) {
                int i10 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    z = false;
                }
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                int i11 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA r8lambda7_hp2bu5ehuy2xymzq0osvrlhta = (r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA) objOnMinimized;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i13 = onWarmupCompleted + 17;
                    onextracallback = onextracallback2;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    onextracallback = onextracallback2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                getbacktracenote.invoke(r8lambda7_hp2bu5ehuy2xymzq0osvrlhta, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i << 3) & 112));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onExtraCallbackWithResult + 115;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                onextracallback2 = onextracallback;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i16 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            return null;
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i18 = 2 % 2;
                int i19 = IAuthTabCallback + 87;
                onExtraCallback = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallback = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, onextracallback2, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i21 = onExtraCallback + 89;
                IAuthTabCallback = i21 % 128;
                if (i21 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        });
        return null;
    }

    private static final void onExtraCallback(final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-631249762);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 2 : 4) | i;
        } else {
            int i8 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-631249762, i3, -1, "im.toss.tds.compose.component.compound.toast.v1.ToastRightContent (TdsToastV1.kt:347)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new RightPreset();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            RightPreset rightPreset = (RightPreset) objOnMinimized;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (getbacktracenote == null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1706275594);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-886325141);
                getbacktracenote.invoke(rightPreset, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 & 112) | 6));
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i10 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.toast.v1.TdsToastV1Kt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambdaIItvJ65H1kry9itpoQE60dxnTI.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i15 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent((((int) Float.intBitsToFloat((int) (onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached>) cameraPresenceProviderExternalSyntheticLambda6) >> 32))) << 32) | (((int) Float.intBitsToFloat((int) onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached>) cameraPresenceProviderExternalSyntheticLambda6))) & 4294967295L)));
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    private static final long onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setUseCaseAttached setusecaseattached = (setUseCaseAttached) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return setusecaseattached.onExtraCallback();
        }
        setusecaseattached.onExtraCallback();
        throw null;
    }

    private static final AppLovinAdClickListener IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<AppLovinAdClickListener> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return appLovinAdClickListener;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, int i, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onExtraCallbackWithResult(new Object[]{getstreamsharingchildren, Integer.valueOf(i), Integer.valueOf(i2), onextracallbackwithresult}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 802893411, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -802893411);
    }

    public static /* synthetic */ Unit onNavigationEvent(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, ExtensionsManager1 extensionsManager1) {
        return (Unit) onExtraCallbackWithResult(new Object[]{r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, extensionsManager1}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 205929030, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -205929022);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, isQueryRefinementEnabled isqueryrefinementenabled, r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, Function0 function0, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(new Object[]{getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, cameraPresenceProviderExternalSyntheticLambda6, isqueryrefinementenabled, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, function0, getbacktracenote2, getbacktracenote3, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1177266895, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1177266890);
    }

    public static final void onExtraCallback(@NotNull getBacktraceNote<? super r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, @Nullable getBacktraceNote<? super y0a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable Function0<Unit> function0, @Nullable r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult(new Object[]{getbacktracenote, quirksExternalSyntheticBackport0, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, getbacktracenote2, getbacktracenote3, function0, r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2040912696, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2040912689);
    }

    private static final Unit onExtraCallbackWithResult(r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, Futures3 futures3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{r8lambdadhtemgjzgpjmlxafoa2eiwlxu7w, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, futures3}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -950002144, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 950002148);
    }

    private static final Unit onWarmupCompleted(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, ExtensionsManager1 extensionsManager1) {
        return (Unit) onExtraCallbackWithResult(new Object[]{r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, extensionsManager1}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1770084914, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1770084908);
    }

    private static final void onExtraCallback(getBacktraceNote<? super r8lambda7_Hp2Bu5eHUy2xyMZq0oSvRlHtA, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallbackWithResult(new Object[]{getbacktracenote, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1652828015, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1652828013);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallbackWithResult(new Object[]{quirksExternalSyntheticBackport0, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -951639860, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 951639863);
    }

    public static final class IAuthTabCallback implements Function0<setUseCaseAttached> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public IAuthTabCallback(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.setUseCaseAttached] */
        public final setUseCaseAttached invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.access000();
                throw null;
            }
            ?? Access000 = this.onExtraCallbackWithResult.access000();
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
            }
            return Access000;
        }
    }

    public static final class onNavigationEvent implements Function0<getSwitchMinWidth.onExtraCallback<setUseCaseAttached>> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<setUseCaseAttached> onExtraCallback = onExtraCallback();
            int i3 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onExtraCallback;
        }

        public final getSwitchMinWidth.onExtraCallback<setUseCaseAttached> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<setUseCaseAttached> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }
}
