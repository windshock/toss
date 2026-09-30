package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.WebViewRenderProcessImplExternalSyntheticLambda1;
import o.getViewTypeCount;
import o.nSetPosition;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewRenderProcessImplExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(function1);
        }
        onWarmupCompleted(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1);
        int i3 = onExtraCallback + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 11;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, 1035901062, -1035901061, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 85;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 29 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i6);
        int i11 = (~i6) | i7;
        int i12 = i10 | (~(i11 | i4));
        int i13 = (~(i6 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i4 + i3 + (783392123 * i2) + ((-786872706) * i);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i5) + 1729888256 + (218870266 * i4) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i2) + ((-471334912) * i) + ((-600899584) * i16);
        int i18 = (i5 * 375823119) + 1642083618 + (i4 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i3 * 375824245) + (i2 * (-117547465)) + (i * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult = (RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(onextracallbackwithresult, zBooleanValue, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(onextracallbackwithresult, zBooleanValue, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(useandconfigureprogramwithtexture);
        }
        IAuthTabCallback(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult = (RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        w5a w5aVar = (w5a) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, zBooleanValue, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 87 / 0;
        }
        int i8 = onExtraCallback + 29;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(num);
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 105;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1);
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 5;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallback + 71;
            IAuthTabCallback = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1458123766, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsImageBannerCard.kt:66)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, ((Long) y2.onWarmupCompleted(PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -320693169, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 320693189, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).longValue(), 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262134);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 3;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 41;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallback + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1561994425, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsImageBannerCard.kt:73)");
                int i5 = onExtraCallback + 115;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(onextracallbackwithresult.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 103;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 73) != 62) {
                int i4 = onExtraCallback + 33;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-637137320, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard.<anonymous>.<anonymous>.<anonymous> (NativeAdsBpsImageBannerCard.kt:76)");
            }
            String strOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            WebViewProviderAdapterExternalSyntheticLambda3.onExtraCallbackWithResult(strOnWarmupCompleted == null ? "" : strOnWarmupCompleted, z, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, final boolean z, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i2 = 4;
            } else {
                int i4 = IAuthTabCallback + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i6 = onExtraCallback + 47;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 89;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1071651299, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard.<anonymous>.<anonymous> (NativeAdsBpsImageBannerCard.kt:59)");
                    int i9 = 95 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1071651299, i, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard.<anonymous>.<anonymous> (NativeAdsBpsImageBannerCard.kt:59)");
                }
            }
            final String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1072217707);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1072282435);
                encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1458123766, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 101;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnNavigationEvent = WebViewRenderProcessImplExternalSyntheticLambda1.onNavigationEvent(strOnExtraCallbackWithResult, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i13 = onExtraCallbackWithResult + 73;
                        onNavigationEvent = i13 % 128;
                        int i14 = i13 % 2;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            w5aVar.onWarmupCompleted(encoderProfilesProxyVideoProfileProxyOnExtraCallback, ForwardingCameraControl.onExtraCallback(1561994425, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 3;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnNavigationEvent = WebViewRenderProcessImplExternalSyntheticLambda1.onNavigationEvent(onextracallbackwithresult, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onExtraCallback + 107;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-637137320, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 85;
                    IAuthTabCallback = i11 % 128;
                    Object obj4 = null;
                    if (i11 % 2 == 0) {
                        RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
                        boolean z3 = z;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {onextracallbackwithresult2, Boolean.valueOf(z3), (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                        throw null;
                    }
                    RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
                    boolean z4 = z;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {onextracallbackwithresult3, Boolean.valueOf(z4), (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                    Unit unit = (Unit) WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult4, -921403834, 921403834, iOnExtraCallbackWithResult3);
                    int i12 = onExtraCallback + 37;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        return unit;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 432);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final Function1 function1;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult = (RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        final boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i5 = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(324193756);
        if ((iIntValue & 6) == 0) {
            int i7 = IAuthTabCallback + 53;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
                    int i9 = onExtraCallback + 109;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    i5 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
            }
            i = i5 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i11 = iIntValue2 & 2;
        if (i11 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 32 : 16;
        }
        int i12 = iIntValue2 & 4;
        if (i12 == 0) {
            if ((iIntValue & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                    i2 = 256;
                } else {
                    int i13 = onExtraCallback + 13;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    i2 = 128;
                }
                i3 = i2 | i;
            }
            i4 = iIntValue2 & 8;
            Object obj2 = null;
            if (i4 == 0) {
                int i15 = IAuthTabCallback + 73;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i3 |= 3072;
            } else if ((iIntValue & 3072) == 0) {
                int i17 = IAuthTabCallback + 41;
                onExtraCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                    obj2.hashCode();
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 2048 : 1024;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                function1 = function12;
                onextracallback = onextracallback2;
            } else {
                if (i11 != 0) {
                    onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
                if (i12 != 0) {
                    int i18 = IAuthTabCallback + 81;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    Object obj3 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Object obj4 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj5) {
                                int i20 = 2 % 2;
                                int i21 = onWarmupCompleted + 81;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                                Unit unitOnNavigationEvent = WebViewRenderProcessImplExternalSyntheticLambda1.onNavigationEvent((Integer) obj5);
                                int i23 = onWarmupCompleted + 45;
                                onExtraCallback = i23 % 128;
                                int i24 = i23 % 2;
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj4);
                        obj3 = obj4;
                    }
                    function12 = (Function1) obj3;
                }
                final Function1 function13 = function12;
                if (i4 != 0) {
                    int i20 = onExtraCallback + 79;
                    IAuthTabCallback = i20 % 128;
                    zBooleanValue = i20 % 2 != 0;
                }
                final boolean z = zBooleanValue;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(324193756, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCard (NativeAdsBpsImageBannerCard.kt:32)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback3, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0.0f, 0.0f, 0.0f, WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onNavigationEvent(), 7, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, (Object) null);
                int i21 = i3 & 896;
                boolean z2 = i21 == 256;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z2) {
                    int i22 = IAuthTabCallback + 45;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    Object obj5 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda4
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i24 = 2 % 2;
                                int i25 = onWarmupCompleted + 47;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                Object[] objArr2 = {function13};
                                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                                Unit unit = (Unit) WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult2, 243389465, -243389462, iOnExtraCallbackWithResult);
                                int i27 = onWarmupCompleted + 47;
                                onNavigationEvent = i27 % 128;
                                int i28 = i27 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                        int i24 = onExtraCallback + 3;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        obj5 = function0;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj5, 15, (Object) null);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj6) {
                                int i26 = 2 % 2;
                                int i27 = onNavigationEvent + 97;
                                onExtraCallbackWithResult = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitOnExtraCallback = WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallback((useAndConfigureProgramWithTexture) obj6);
                                int i29 = onExtraCallbackWithResult + 105;
                                onNavigationEvent = i29 % 128;
                                if (i29 % 2 == 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback3, (Function1) objOnMinimized3);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{onextracallbackwithresult.onNavigationEvent(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663728, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    getViewTypeCount.onNavigationEvent onNavigationEvent = getViewTypeCount.onNavigationEvent.Companion.onNavigationEvent();
                    getViewTypeCount.onTransact ontransactOnWarmupCompleted = getViewTypeCount.onTransact.Companion.onWarmupCompleted();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback4, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null);
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1071651299, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda6
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i26 = 2 % 2;
                            int i27 = IAuthTabCallback + 29;
                            onExtraCallbackWithResult = i27 % 128;
                            if (i27 % 2 == 0) {
                                RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult;
                                boolean z3 = z;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                Object[] objArr2 = {onextracallbackwithresult4, Boolean.valueOf(z3), (w5a) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(iIntValue3)};
                                int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                                throw null;
                            }
                            RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult;
                            boolean z4 = z;
                            int iIntValue4 = ((Integer) obj8).intValue();
                            Object[] objArr3 = {onextracallbackwithresult5, Boolean.valueOf(z4), (w5a) obj6, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(iIntValue4)};
                            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
                            Unit unit = (Unit) WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr3, iOnExtraCallbackWithResult4, -1755717195, 1755717197, iOnExtraCallbackWithResult3);
                            int i28 = onExtraCallbackWithResult + 103;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    if (i21 == 256) {
                        int i26 = IAuthTabCallback + 63;
                        onExtraCallback = i26 % 128;
                        boolean z3 = i26 % 2 == 0;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!z3) {
                            Object obj6 = objOnMinimized4;
                            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                Function0 function02 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda7
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = onNavigationEvent + 61;
                                        onWarmupCompleted = i28 % 128;
                                        int i29 = i28 % 2;
                                        Function1 function14 = function13;
                                        if (i29 != 0) {
                                            return WebViewRenderProcessImplExternalSyntheticLambda1.IAuthTabCallback(function14);
                                        }
                                        WebViewRenderProcessImplExternalSyntheticLambda1.IAuthTabCallback(function14);
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                                obj6 = function02;
                            }
                            w4.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, onNavigationEvent, ontransactOnWarmupCompleted, (String) null, (Function0) obj6, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 432, 108540);
                            String strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback4, 0.0f, 1, (Object) null), WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda1.onExtraCallbackWithResult(), 0.0f, 2, (Object) null);
                            boolean z4 = i21 == 256;
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z4) {
                                Object obj7 = objOnMinimized5;
                                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function03 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda8
                                        private static int onExtraCallback = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke() {
                                            Unit unitOnNavigationEvent;
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallback + 9;
                                            onWarmupCompleted = i28 % 128;
                                            if (i28 % 2 != 0) {
                                                unitOnNavigationEvent = WebViewRenderProcessImplExternalSyntheticLambda1.onNavigationEvent(function13);
                                                int i29 = 14 / 0;
                                            } else {
                                                unitOnNavigationEvent = WebViewRenderProcessImplExternalSyntheticLambda1.onNavigationEvent(function13);
                                            }
                                            int i30 = onWarmupCompleted + 9;
                                            onExtraCallback = i30 % 128;
                                            int i31 = i30 % 2;
                                            return unitOnNavigationEvent;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function03);
                                    obj7 = function03;
                                }
                                obj = null;
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, null, null, null, null, (Function0) obj7, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 956}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                zBooleanValue = z;
                                onextracallback = onextracallback3;
                                function1 = function13;
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsImageBannerCardKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj8, Object obj9) {
                        int i27 = 2 % 2;
                        int i28 = IAuthTabCallback + 29;
                        onNavigationEvent = i28 % 128;
                        if (i28 % 2 == 0) {
                            return WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult, onextracallback, function1, zBooleanValue, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        }
                        WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult, onextracallback, function1, zBooleanValue, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj8, ((Integer) obj9).intValue());
                        throw null;
                    }
                });
            }
            return obj;
        }
        i |= 384;
        i3 = i;
        i4 = iIntValue2 & 8;
        Object obj22 = null;
        if (i4 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    private static final Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{function1}, iOnExtraCallbackWithResult2, 243389465, -243389462, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, boolean z, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, Boolean.valueOf(z), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -1755717195, 1755717197, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onWarmupCompleted(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallbackwithresult, Boolean.valueOf(z), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, -921403834, 921403834, iOnExtraCallbackWithResult);
    }

    public static final void onNavigationEvent(@NotNull RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Integer, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {onextracallbackwithresult, quirksExternalSyntheticBackport0, function1, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult2, 1035901062, -1035901061, iOnExtraCallbackWithResult);
    }
}
