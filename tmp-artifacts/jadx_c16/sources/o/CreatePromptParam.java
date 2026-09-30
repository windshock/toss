package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreenKt$;
import im.toss.features.credit.data.response.TossbankJoinBridgeResponse;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getDistanceBetweenPoints;
import o.getPreRenderJob;
import o.getViewTypeCount;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreatePromptParam {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossbankJoinBridgeResponse.ListRowItem listRowItem = (TossbankJoinBridgeResponse.ListRowItem) objArr[0];
        w5a w5aVar = (w5a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(listRowItem, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(listRowItem, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossbankJoinBridgeResponse.ListRowItem listRowItem, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(listRowItem, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(tossbankJoinBridgeResponse, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(tossbankJoinBridgeResponse, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallback + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | i2)) | i8;
        int i10 = ~i3;
        int i11 = ~(i10 | i5);
        int i12 = i8 | i11 | (~(i10 | i2));
        int i13 = (~((~i2) | i10)) | i8 | i11;
        int i14 = i5 + i3 + i4 + ((-369695973) * i) + (1794320298 * i6);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i5) + 1478230016 + (776760710 * i3) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i4) + (217841664 * i) + ((-410517504) * i6) + ((-175177728) * i15);
        int i17 = ((i5 * 1872133577) - 2052485254) + (i3 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i4 * 1872134975) + (i * (-1328892763)) + (i6 * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossbankJoinBridgeResponse, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = IAuthTabCallback + 113;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossbankJoinBridgeResponse tossbankJoinBridgeResponse = (TossbankJoinBridgeResponse) objArr[0];
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tossbankJoinBridgeResponse, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossbankJoinBridgeResponse.ListRowItem listRowItem, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(listRowItem, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {tossbankJoinBridgeResponse, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2144750407, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 2144750408, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
        int i5 = onNavigationEvent + 13;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(tossbankJoinBridgeResponse, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(tossbankJoinBridgeResponse, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossbankJoinBridgeResponse, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(tossbankJoinBridgeResponse, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(tossbankJoinBridgeResponse, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossbankJoinBridgeResponse.ListRowItem listRowItem, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(listRowItem, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(listRowItem, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {tossbankJoinBridgeResponse, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1218518829, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1218518832, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
        int i5 = IAuthTabCallback + 3;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 4) != 123) {
                int i4 = onNavigationEvent + 33;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1742582504, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:48)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{tossbankJoinBridgeResponse.onTransact().IAuthTabCallback(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 91;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 70) != 118) {
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i & 17) != 16) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = IAuthTabCallback + 121;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(359196087, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:53)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
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
            AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(tossbankJoinBridgeResponse.onTransact().onExtraCallback(), (QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small, AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue, AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak, cameraCaptureResultEmptyCameraCaptureResult, 28032, 2);
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 27;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(TossbankJoinBridgeResponse.ListRowItem listRowItem, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallback + 95;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1540625255, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:70)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{listRowItem.IAuthTabCallback(), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = IAuthTabCallback + 53;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 61;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(TossbankJoinBridgeResponse.ListRowItem listRowItem, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(843815386, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:75)");
                int i5 = IAuthTabCallback + 25;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            String strOnWarmupCompleted = listRowItem.onWarmupCompleted();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i7 = IAuthTabCallback + 47;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-842227039);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-842226079);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnWarmupCompleted, null, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 21;
                onNavigationEvent = i9 % 128;
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

    private static final Unit onExtraCallback(TossbankJoinBridgeResponse.ListRowItem listRowItem, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onNavigationEvent + 117;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = onNavigationEvent + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 69;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(46565679, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:68)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(46565679, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:68)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, ForwardingCameraControl.onExtraCallback(-1540625255, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda1(listRowItem), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(843815386, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda2(listRowItem), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 11;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(TossbankJoinBridgeResponse.ListRowItem listRowItem, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        boolean z = true;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 47) == 0) {
                i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ^ true) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallback + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onNavigationEvent + 33;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = onNavigationEvent + 59;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1504194531, i2, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:83)");
            }
            w3bVar.onExtraCallbackWithResult(listRowItem.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                i3 = 4;
            } else {
                int i7 = onNavigationEvent + 63;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onNavigationEvent + 9;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1050594408, i2, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:115)");
            }
            u4Var.onNavigationEvent(tossbankJoinBridgeResponse.onExtraCallback().onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 79;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossbankJoinBridgeResponse tossbankJoinBridgeResponse = (TossbankJoinBridgeResponse) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-543151350, iIntValue, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:125)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{tossbankJoinBridgeResponse.onWarmupCompleted(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, 0L, 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 130812}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onNavigationEvent + 55;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{tossbankJoinBridgeResponse.onWarmupCompleted(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, 0L, 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 130812}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z = false;
        TossbankJoinBridgeResponse tossbankJoinBridgeResponse = (TossbankJoinBridgeResponse) objArr[0];
        u3 u3Var = (u3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((iIntValue & 17) != 16) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 79;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = onNavigationEvent + 59;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1225310654, iIntValue, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:122)");
            }
            getStarPath.onExtraCallbackWithResult(-514183958, 514183960, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), new Object[]{ForwardingCameraControl.onExtraCallback(-543151350, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda3(tossbankJoinBridgeResponse), cameraCaptureResultEmptyCameraCaptureResult, 54), getDistanceBetweenPoints.onWarmupCompleted.Companion.IAuthTabCallbackDefault(), null, Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResult, 54, 12}, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = onNavigationEvent + 79;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i5 = IAuthTabCallback + 33;
                onNavigationEvent = i5 % 128;
                i2 = i5 % 2 != 0 ? 3 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i6 = IAuthTabCallback + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(668091934, i, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen.<anonymous>.<anonymous>.<anonymous> (JoinTossbankBridgeScreen.kt:121)");
            }
            u3Var.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1225310654, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda0(tossbankJoinBridgeResponse), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = IAuthTabCallback + 91;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onNavigationEvent + 89;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallback + 57;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull TossbankJoinBridgeResponse tossbankJoinBridgeResponse, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jLongValue;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(tossbankJoinBridgeResponse, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(813106072);
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(tossbankJoinBridgeResponse)) {
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2 != 0 ? 2 : 4;
            i2 = i6 | i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onNavigationEvent + 101;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(813106072, i2, -1, "im.toss.feature.credit.ui.scoreraise.tossbank.JoinTossbankBridgeScreen (JoinTossbankBridgeScreen.kt:35)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), 7, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1742582504, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda4(tossbankJoinBridgeResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, ForwardingCameraControl.onExtraCallback(359196087, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda5(tossbankJoinBridgeResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 16374);
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-956903702);
            for (TossbankJoinBridgeResponse.ListRowItem listRowItem : (List) TossbankJoinBridgeResponse.onNavigationEvent(new Object[]{tossbankJoinBridgeResponse}, -1415856106, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1415856107, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted())) {
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult3;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(46565679, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda6(listRowItem), cameraCaptureResultEmptyCameraCaptureResult3, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1504194531, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda7(listRowItem), cameraCaptureResultEmptyCameraCaptureResult3, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult4, 390, 0, 131066);
                int i9 = IAuthTabCallback + 13;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult3;
            cameraCaptureResultEmptyCameraCaptureResult5.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult5.asInterface();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(verifyDrawable.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, onextracallbackwithresult3.onWarmupCompleted()), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult3, 6).onExtraCallbackWithResult(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallback(), onextracallbackwithresult3.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 6);
            int i11 = 0;
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult4 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult4.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult4.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult4.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult4.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult4.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult4.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult3, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1098422283);
            Iterator<T> it = tossbankJoinBridgeResponse.IAuthTabCallbackStub().iterator();
            while (it.hasNext()) {
                ImageLoaderBuilderExternalSyntheticLambda0.onExtraCallbackWithResult((String) it.next(), true, 0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), false, (setByteOrder) null, cameraCaptureResultEmptyCameraCaptureResult3, 3120, 52);
                i11 = i11;
            }
            int i12 = i11;
            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            onPageLoadError.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, i12);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult onExtraCallbackWithResult = AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult3, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i13 = onNavigationEvent + 5;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1098409870);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).onRelationshipValidationResult();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1098408910);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(onExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback2, jLongValue, cameraCaptureResultEmptyCameraCaptureResult3, 54, 0);
            onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(i12)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
            u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(-1050594408, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda8(tossbankJoinBridgeResponse, function0), cameraCaptureResultEmptyCameraCaptureResult3, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(668091934, true, new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda9(tossbankJoinBridgeResponse), cameraCaptureResultEmptyCameraCaptureResult3, 54), (getBacktraceNote) null, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult3, 6).onExtraCallbackWithResult(), false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 806879616, 0, 3259);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new JoinTossbankBridgeScreenKt$.ExternalSyntheticLambda10(tossbankJoinBridgeResponse, function0, i));
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(TossbankJoinBridgeResponse.ListRowItem listRowItem, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {listRowItem, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 534438248, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -534438246, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {tossbankJoinBridgeResponse, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1996482616, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1996482616, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }

    private static final Unit IAuthTabCallback(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {tossbankJoinBridgeResponse, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -1218518829, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 1218518832, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }

    private static final Unit IAuthTabCallback(TossbankJoinBridgeResponse tossbankJoinBridgeResponse, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {tossbankJoinBridgeResponse, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2144750407, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), 2144750408, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), objArr);
    }
}
