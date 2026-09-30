package im.toss.feature.kyc.teens.residentregister.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitDestination;
import im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraphKt$;
import im.toss.feature.kyc.teens.residentregister.presentation.ConfirmLegalRepresentativesViewModel;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.ForwardingCameraControl;
import o.FragmentResumePoint;
import o.LongPressTextDragObserverKtExternalSyntheticLambda3;
import o.PagePushInterceptPoint;
import o.PageResumePoint;
import o.PlayerErrorCode;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RippleAnimationfadeOut21;
import o.RippleContainer;
import o.RippleHostViewExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TwoLineExternalSyntheticLambda0;
import o.TypographyKtExternalSyntheticLambda0;
import o.access13800;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.hideLoading;
import o.nSetPosition;
import o.onPagePause;
import o.onPageResume;
import o.setAdVideoPlaybackListener;
import o.setDividerDrawable;
import o.setParentLayoutDirection;
import o.setPositionProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResidentRegisterSubmitNavGraphKt {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(String str, Function1 function1, Function1 function12, Function2 function2, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, function1, function12, function2, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, setParentLayoutDirection setparentlayoutdirection, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(str, setparentlayoutdirection, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(str, setparentlayoutdirection, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(-426925464, zzgc.onExtraCallbackWithResult(), new Object[]{setparentlayoutdirection, residentRegisterSubmitDestination}, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 426925464, iOnExtraCallbackWithResult2);
            int i3 = 55 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = zzgc.onExtraCallbackWithResult();
            unit = (Unit) onNavigationEvent(-426925464, zzgc.onExtraCallbackWithResult(), new Object[]{setparentlayoutdirection, residentRegisterSubmitDestination}, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 426925464, iOnExtraCallbackWithResult4);
        }
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[4];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(195382925, zzgc.onExtraCallbackWithResult(), new Object[]{str, setparentlayoutdirection, function1, function12, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -195382923, zzgc.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function1 function12, Function2 function2, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setparentlayoutdirection, function1, function12, function2, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(setparentlayoutdirection, residentRegisterSubmitDestination);
        }
        onExtraCallbackWithResult(setparentlayoutdirection, residentRegisterSubmitDestination);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setParentLayoutDirection setparentlayoutdirection, FragmentResumePoint fragmentResumePoint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(setparentlayoutdirection, fragmentResumePoint);
        }
        onWarmupCompleted(setparentlayoutdirection, fragmentResumePoint);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, function1, function12, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, setParentLayoutDirection setparentlayoutdirection, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, setparentlayoutdirection, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i4) | i7);
        int i9 = (~i) | (~(i7 | i4));
        int i10 = i4 | i | i7;
        int i11 = i + i5 + i6 + (1635157569 * i2) + ((-1141649966) * i3);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i) - 711983104) + (488484398 * i5) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i6) + (1462763520 * i2) + (1566572544 * i3) + (1631846400 * i12);
        int i14 = (i * 1521345644) + 2088555610 + (i5 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i6 * 1521345871) + (i2 * (-1382509809)) + (i3 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(setparentlayoutdirection, residentRegisterSubmitDestination);
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, Function1 function12, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Unit unit;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            unit = (Unit) onNavigationEvent(-1565909703, zzgc.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, str, function1, function12, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1565909704, zzgc.onExtraCallbackWithResult());
            int i6 = 73 / 0;
        } else {
            unit = (Unit) onNavigationEvent(-1565909703, zzgc.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, str, function1, function12, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1565909704, zzgc.onExtraCallbackWithResult());
        }
        int i7 = onExtraCallback + 37;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, residentRegisterSubmitDestination.onWarmupCompleted(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 91;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        String str = (String) objArr[0];
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[4];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1603506043, iIntValue, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:38)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1603506043, iIntValue, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:38)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i3 = onNavigationEvent + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda5(setparentlayoutdirection);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                int i5 = onNavigationEvent + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                obj = externalSyntheticLambda5;
            }
        }
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        PagePushInterceptPoint.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -134626828, new Object[]{str, (Function1) obj, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, 0}, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 134626830);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strOnWarmupCompleted;
        setPositionProvider setpositionprovider;
        PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback;
        int i;
        setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) objArr[0];
        ResidentRegisterSubmitDestination residentRegisterSubmitDestination = (ResidentRegisterSubmitDestination) objArr[1];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
            strOnWarmupCompleted = residentRegisterSubmitDestination.onWarmupCompleted();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 59;
        } else {
            Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
            strOnWarmupCompleted = residentRegisterSubmitDestination.onWarmupCompleted();
            setpositionprovider = null;
            iAuthTabCallback = null;
            i = 6;
        }
        TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, strOnWarmupCompleted, setpositionprovider, iAuthTabCallback, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, residentRegisterSubmitDestination.onWarmupCompleted(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 94, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
            TypographyKtExternalSyntheticLambda0.onNavigationEvent(setparentlayoutdirection, residentRegisterSubmitDestination.onWarmupCompleted(), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(setParentLayoutDirection setparentlayoutdirection, FragmentResumePoint fragmentResumePoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fragmentResumePoint, "");
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = setparentlayoutdirection.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null) {
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
            if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted("extra_legal_representative", fragmentResumePoint);
            }
        }
        setparentlayoutdirection.getInterfaceDescriptor();
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, setParentLayoutDirection setparentlayoutdirection, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1575878909, i, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:67)");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            int i5 = onExtraCallback + 53;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda9(setparentlayoutdirection);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        Function1 function1 = (Function1) objOnMinimized;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            int i6 = onNavigationEvent + 73;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda10(setparentlayoutdirection);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
        }
        hideLoading.onExtraCallback(str, function1, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(String str, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String strOnPostMessage;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2142790942, i, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:82)");
        }
        Bundle bundleOnNavigationEvent = twoLineExternalSyntheticLambda0.onNavigationEvent();
        if (bundleOnNavigationEvent == null || (strOnPostMessage = bundleOnNavigationEvent.getString("legalRepresentativeName")) == null) {
            strOnPostMessage = PlayerErrorCode.onPostMessage();
        }
        onPagePause.onWarmupCompleted(str, strOnPostMessage, cameraCaptureResultEmptyCameraCaptureResult, 0);
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, Function1 function1, Function1 function12, Function2 function2, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1585264321, i, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:90)");
        }
        PageResumePoint.onExtraCallback(str, function1, function12, function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onNavigationEvent + 31;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onNavigationEvent + 93;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallback + 63;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function1 function12, Function2 function2, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ResidentRegisterSubmitDestination.CheckHasResidentRegister.onExtraCallback.onWarmupCompleted(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(1603506043, true, new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda0(str, setparentlayoutdirection, function1, function12)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ResidentRegisterSubmitDestination.ConfirmLegalRepresentatives.IAuthTabCallback.onWarmupCompleted(), (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1008966876, true, new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda1(str, setparentlayoutdirection)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ResidentRegisterSubmitDestination.InputResidentRegister.Companion.onNavigationEvent() + "?inputResidentRegisterScreenType={inputResidentRegisterScreenType}", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1575878909, true, new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda2(str, setparentlayoutdirection)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ResidentRegisterSubmitDestination.CompletedResidentRegisterRequest.Companion.IAuthTabCallback() + "?legalRepresentativeName={legalRepresentativeName}", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-2142790942, true, new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda3(str)), 254, (Object) null);
        RippleContainer.onNavigationEvent(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, ResidentRegisterSubmitDestination.ConfirmResidentRegister.Companion.onExtraCallback() + "?imageUri={imageUri}", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(1585264321, true, new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda4(str, function1, function12, function2)), 254, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @NotNull Function1<? super access13800<? super Uri>, ? extends Object> function1, @NotNull Function1<? super access13800<? super Uri>, ? extends Object> function12, @NotNull Function2<? super Uri, ? super access13800<? super Intent>, ? extends Object> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        setParentLayoutDirection setparentlayoutdirection;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        int i5;
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 79;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1605636862);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i10 = onNavigationEvent + 37;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i12 = onNavigationEvent + 77;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 97 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
        }
        int i14 = i3;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 9363) != 9362, i14 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (i9 != 0) {
                int i15 = onExtraCallback + 91;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 == 0) {
                    quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    int i16 = 72 / 0;
                } else {
                    quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1605636862, i14, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph (ResidentRegisterSubmitNavGraph.kt:29)");
            }
            setParentLayoutDirection setparentlayoutdirectionOnWarmupCompleted = RippleAnimationfadeOut21.onWarmupCompleted(new PullRefreshIndicatorKtExternalSyntheticLambda3[0], cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            setAdVideoPlaybackListener.onExtraCallbackWithResult(setparentlayoutdirectionOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String strOnWarmupCompleted = ResidentRegisterSubmitDestination.CheckHasResidentRegister.onExtraCallback.onWarmupCompleted();
            boolean z = (i14 & 112) == 32;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setparentlayoutdirectionOnWarmupCompleted);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((zOnExtraCallback | z | zOnExtraCallback2 | zOnExtraCallback3) || zOnExtraCallback4) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                setparentlayoutdirection = setparentlayoutdirectionOnWarmupCompleted;
                ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda6(str, setparentlayoutdirectionOnWarmupCompleted, function1, function12, function2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda6);
                objOnMinimized = externalSyntheticLambda6;
            } else {
                setparentlayoutdirection = setparentlayoutdirectionOnWarmupCompleted;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            RippleHostViewExternalSyntheticLambda0.onWarmupCompleted(setparentlayoutdirection, strOnWarmupCompleted, quirksExternalSyntheticBackport03, (QuirkSettingsLoader) null, (String) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i14 << 6) & 896, 0, 1016);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda7(quirksExternalSyntheticBackport04, str, function1, function12, function2, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, setParentLayoutDirection setparentlayoutdirection, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1008966876, i, -1, "im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitNavGraph.<anonymous>.<anonymous>.<anonymous> (ResidentRegisterSubmitNavGraph.kt:49)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(1890788296);
        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onWarmupCompleted);
        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelProvider.onWarmupCompleted onwarmupcompletedIAuthTabCallback = LongPressTextDragObserverKtExternalSyntheticLambda3.IAuthTabCallback(textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 0);
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(1729797275);
        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
            int i3 = onExtraCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
            int i5 = onExtraCallback + 29;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        ConfirmLegalRepresentativesViewModel confirmLegalRepresentativesViewModelIAuthTabCallback = DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.IAuthTabCallback(ConfirmLegalRepresentativesViewModel.class, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, onwarmupcompletedIAuthTabCallback, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResult, 36936, 0);
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        ConfirmLegalRepresentativesViewModel confirmLegalRepresentativesViewModel = confirmLegalRepresentativesViewModelIAuthTabCallback;
        FragmentResumePoint fragmentResumePoint = (FragmentResumePoint) twoLineExternalSyntheticLambda0.onTransact().onExtraCallback("extra_legal_representative");
        if (fragmentResumePoint != null) {
            int i7 = onNavigationEvent + 27;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                confirmLegalRepresentativesViewModel.onNavigationEvent(fragmentResumePoint);
                twoLineExternalSyntheticLambda0.onTransact().IAuthTabCallback("extra_legal_representative");
                throw null;
            }
            confirmLegalRepresentativesViewModel.onNavigationEvent(fragmentResumePoint);
            twoLineExternalSyntheticLambda0.onTransact().IAuthTabCallback("extra_legal_representative");
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(setparentlayoutdirection);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnExtraCallback) {
            objOnMinimized = new ResidentRegisterSubmitNavGraphKt$.ExternalSyntheticLambda8(setparentlayoutdirection);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        } else {
            int i8 = onExtraCallback + 71;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onPageResume.IAuthTabCallback(iOnExtraCallback, 725904538, new Object[]{str, confirmLegalRepresentativesViewModel, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback2, -725904534);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function1 function12, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(-94640524, zzgc.onExtraCallbackWithResult(), new Object[]{str, setparentlayoutdirection, function1, function12, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 94640527, zzgc.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(String str, setParentLayoutDirection setparentlayoutdirection, Function1 function1, Function1 function12, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onNavigationEvent(195382925, zzgc.onExtraCallbackWithResult(), new Object[]{str, setparentlayoutdirection, function1, function12, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -195382923, zzgc.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(setParentLayoutDirection setparentlayoutdirection, ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(-426925464, zzgc.onExtraCallbackWithResult(), new Object[]{setparentlayoutdirection, residentRegisterSubmitDestination}, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 426925464, iOnExtraCallbackWithResult2);
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function1 function1, Function1 function12, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onNavigationEvent(-1565909703, zzgc.onExtraCallbackWithResult(), new Object[]{quirksExternalSyntheticBackport0, str, function1, function12, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1565909704, zzgc.onExtraCallbackWithResult());
    }
}
