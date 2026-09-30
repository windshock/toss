package o;

import com.google.common.collect.Synchronized;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxNativeAdView;
import o.QuirksExternalSyntheticBackport0;
import o.addInterstitialAdapter;
import o.createUShort;
import o.flipHorizontally;
import o.getMediaContentAspectRatio;
import o.getSwitchMinWidth;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.setOrientationDegrees;
import o.updateFocusedState;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMediaContentAspectRatio<S> implements isContainerClickable<S> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final getSwitchMinWidth<S> IAuthTabCallback;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i3 | i4;
        int i8 = ~((~i4) | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i5 | i4));
        int i11 = i5 | (~(i4 | i9));
        int i12 = i3 + i5 + i6 + (2127773517 * i) + (1026174006 * i2);
        int i13 = i12 * i12;
        int i14 = (i3 * 21308160) + 1622758390 + (21308160 * i5) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (21309107 * i6) + (1708896471 * i) + (664464834 * i2) + (i13 * 287244288);
        int i15 = (i3 * (-484454144)) + 743702528 + ((-484454144) * i5) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i6) + (367263744 * i) + ((-1434976256) * i2) + (1105526784 * i13) + (i14 * i14 * 966983680);
        if (i15 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i15 == 2) {
            return onExtraCallback(objArr);
        }
        if (i15 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 == 4) {
            Map map = (Map) objArr[0];
            getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i16 = 2 % 2;
            int i17 = onExtraCallbackWithResult + 59;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1132787408);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onExtraCallbackWithResult + 31;
                onExtraCallback = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1132787408, iIntValue, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:347)");
            }
            updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i21 = onExtraCallback + 57;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return updatefocusedstate;
        }
        if (i15 != 5) {
            return IAuthTabCallback(objArr);
        }
        Map map2 = (Map) objArr[0];
        getSwitchMinWidth.onExtraCallback onextracallback2 = (getSwitchMinWidth.onExtraCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1969052403);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i24 = onExtraCallback + 67;
            onExtraCallbackWithResult = i24 % 128;
            int i25 = i24 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1969052403, iIntValue2, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:258)");
            int i26 = onExtraCallback + 21;
            onExtraCallbackWithResult = i26 % 128;
            int i27 = i26 % 2;
        }
        updateFocusedState updatefocusedstate2 = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map2, onextracallback2.onExtraCallback(), MaxNativeAdView.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i28 = onExtraCallbackWithResult + 119;
            onExtraCallback = i28 % 128;
            int i29 = i28 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
        return updatefocusedstate2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Map map = (Map) objArr[0];
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        updateFocusedState updatefocusedstateICustomTabsCallbackStub = ICustomTabsCallbackStub(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return updatefocusedstateICustomTabsCallbackStub;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallback(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        updateFocusedState updatefocusedstate = (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -389526348, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 389526349, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstate;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallbackDefault(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        updateFocusedState updatefocusedstate = (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -557116105, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 557116109, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return updatefocusedstate;
        }
        throw null;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallbackStub(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateOnMessageChannelReady = onMessageChannelReady(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstateOnMessageChannelReady;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallbackStubProxy(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        updateFocusedState updatefocusedstate;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            updatefocusedstate = (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 60421359, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -60421356, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
            int i4 = 31 / 0;
        } else {
            updatefocusedstate = (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 60421359, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -60421356, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        }
        int i5 = onExtraCallbackWithResult + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstate;
    }

    public static /* synthetic */ updateFocusedState IAuthTabCallback_Parcel(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateExtraCallbackWithResult = extraCallbackWithResult(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return updatefocusedstateExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState access000(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateICustomTabsCallbackDefault = ICustomTabsCallbackDefault(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = onExtraCallbackWithResult + 43;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return updatefocusedstateICustomTabsCallbackDefault;
    }

    public static /* synthetic */ updateFocusedState asBinder(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateAccess100 = access100(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return updatefocusedstateAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ updateFocusedState asInterface(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateICustomTabsCallback = ICustomTabsCallback(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return updatefocusedstateICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ updateFocusedState getInterfaceDescriptor(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateWriteTypedObject = writeTypedObject(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstateWriteTypedObject;
    }

    public static /* synthetic */ updateFocusedState onExtraCallbackWithResult(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateOnMinimized = onMinimized(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return updatefocusedstateOnMinimized;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, setorientationdegrees);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ updateFocusedState onNavigationEvent(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateExtraCallback = extraCallback(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return updatefocusedstateExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ updateFocusedState onTransact(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        updateFocusedState updatefocusedstate = (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 822628246, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -822628241, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return updatefocusedstate;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda68, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda69, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda610, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda611, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda612, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda613, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1165626590, iOnExtraCallbackWithResult, new Object[]{cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, cameraPresenceProviderExternalSyntheticLambda66, cameraPresenceProviderExternalSyntheticLambda67, cameraPresenceProviderExternalSyntheticLambda68, cameraPresenceProviderExternalSyntheticLambda69, cameraPresenceProviderExternalSyntheticLambda610, cameraPresenceProviderExternalSyntheticLambda611, cameraPresenceProviderExternalSyntheticLambda612, cameraPresenceProviderExternalSyntheticLambda613, fliphorizontally}, -1165626588, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(Function1 function1, getSwitchMinWidth getswitchminwidth, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onNavigationEvent(function1, getswitchminwidth, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateOnActivityLayout = onActivityLayout(map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        return updatefocusedstateOnActivityLayout;
    }

    public getMediaContentAspectRatio(@NotNull getSwitchMinWidth<S> getswitchminwidth) {
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        this.IAuthTabCallback = getswitchminwidth;
    }

    @Override // o.isContainerClickable
    public getSwitchMinWidth<S> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getSwitchMinWidth<S> getswitchminwidth = this.IAuthTabCallback;
        int i4 = i2 + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return getswitchminwidth;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.isContainerClickable
    public <T> QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final getSwitchMinWidth<T> getswitchminwidth, @NotNull final Function1<? super MaxAppOpenAd<T>, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda16
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    quirksExternalSyntheticBackport0OnWarmupCompleted = getMediaContentAspectRatio.onWarmupCompleted(function1, getswitchminwidth, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i4 = 46 / 0;
                } else {
                    quirksExternalSyntheticBackport0OnWarmupCompleted = getMediaContentAspectRatio.onWarmupCompleted(function1, getswitchminwidth, (QuirksExternalSyntheticBackport0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i5 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return quirksExternalSyntheticBackport0OnWarmupCompleted;
            }
        }, 1, (Object) null);
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    private static final updateFocusedState access100(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-329689506);
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-329689506);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-329689506, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:215)");
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState onMinimized(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1782800741);
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1782800741);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1782800741, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:229)");
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 != 0) {
                throw null;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onExtraCallbackWithResult + 1;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return updatefocusedstate;
    }

    private static final updateFocusedState ICustomTabsCallbackStub(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-619219556);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-619219556, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:243)");
            int i5 = onExtraCallback + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState ICustomTabsCallbackDefault(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1162333708);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1162333708, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:273)");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.access100(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallback + 87;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onExtraCallback + 65;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final updateFocusedState writeTypedObject(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2068409742);
            int i4 = 9 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2068409742, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:287)");
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2068409742);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            }
        }
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(1486455195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1486455194, new Object[]{MaxNativeAdView.Companion}), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState ICustomTabsCallback(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-904828557);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallbackWithResult + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-904828557, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:302)");
            if (i6 == 0) {
                int i7 = 71 / 0;
            }
        }
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onExtraCallbackWithResult + 47;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState extraCallback(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(835017518);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(835017518, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:317)");
            if (i6 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = onExtraCallbackWithResult + 3;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallbackWithResult + 89;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i10 == 0) {
                int i11 = 96 / 0;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState extraCallbackWithResult(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1998598703);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1998598703, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:332)");
            if (i6 != 0) {
                int i7 = 84 / 0;
            }
        }
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Map map = (Map) objArr[0];
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(744573363);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(744573363, iIntValue, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:362)");
        }
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.asInterface(), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i6 = onExtraCallbackWithResult + 57;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return updatefocusedstate;
        }
        throw null;
    }

    private static final updateFocusedState onActivityLayout(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1908154548);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1908154548, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:377)");
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallbackWithResult + 65;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                throw null;
            }
            int i7 = onExtraCallback + 99;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static final updateFocusedState onMessageChannelReady(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1901958956);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 93;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1901958956, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:392)");
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        Object[] objArr = {map, onextracallback.onExtraCallback(), MaxNativeAdView.Companion.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 384};
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Map map = (Map) objArr[0];
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1251111277);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1251111277, iIntValue, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:407)");
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        updateFocusedState updatefocusedstate = (updateFocusedState) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{map, onextracallback.onExtraCallback(), (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, new Object[]{MaxNativeAdView.Companion}), cameraCaptureResultEmptyCameraCaptureResult, 384}, -739353432, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 739353433);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 != 0) {
                throw null;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return updatefocusedstate;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[5];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda68 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[6];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda69 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[7];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda610 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[8];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda611 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[9];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda612 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[10];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda613 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[11];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda614 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[12];
        flipHorizontally fliphorizontally = (flipHorizontally) objArr[13];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int i3 = 24 / 0;
            if (cameraPresenceProviderExternalSyntheticLambda62 == null) {
                int i4 = onExtraCallbackWithResult + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (cameraPresenceProviderExternalSyntheticLambda63 != null) {
                    cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda64;
                    fliphorizontally.asInterface(createUShort.onExtraCallback(fliphorizontally.onTransact(), cameraPresenceProviderExternalSyntheticLambda62 != null ? ((Number) cameraPresenceProviderExternalSyntheticLambda62.onExtraCallbackWithResult()).floatValue() : createUShort.onNavigationEvent(createUShort.Companion.onExtraCallbackWithResult()), cameraPresenceProviderExternalSyntheticLambda63 != null ? ((Number) cameraPresenceProviderExternalSyntheticLambda63.onExtraCallbackWithResult()).floatValue() : createUShort.onExtraCallbackWithResult(createUShort.Companion.onExtraCallbackWithResult())));
                } else {
                    cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda64;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            if (cameraPresenceProviderExternalSyntheticLambda62 == null) {
            }
        }
        if (cameraPresenceProviderExternalSyntheticLambda6 != null) {
            fliphorizontally.IAuthTabCallbackStub(RangesKt.coerceIn(((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue(), 0.0f, 1.0f));
        }
        if (cameraPresenceProviderExternalSyntheticLambda65 != null) {
            fliphorizontally.IAuthTabCallbackStubProxy(((Number) cameraPresenceProviderExternalSyntheticLambda65.onExtraCallbackWithResult()).floatValue());
        }
        if (cameraPresenceProviderExternalSyntheticLambda66 != null) {
            fliphorizontally.getInterfaceDescriptor(((Number) cameraPresenceProviderExternalSyntheticLambda66.onExtraCallbackWithResult()).floatValue());
        }
        if (cameraPresenceProviderExternalSyntheticLambda67 != null) {
            fliphorizontally.IAuthTabCallback_Parcel(fliphorizontally.onExtraCallback(((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda67.onExtraCallbackWithResult()).IAuthTabCallback()));
        }
        if (cameraPresenceProviderExternalSyntheticLambda68 != null) {
            fliphorizontally.access000(fliphorizontally.onExtraCallback(((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda68.onExtraCallbackWithResult()).IAuthTabCallback()));
        }
        if (cameraPresenceProviderExternalSyntheticLambda69 != null) {
            fliphorizontally.IAuthTabCallback_Parcel(((Number) cameraPresenceProviderExternalSyntheticLambda69.onExtraCallbackWithResult()).floatValue() * Float.intBitsToFloat((int) (fliphorizontally.IAuthTabCallbackDefault() >> 32)));
        }
        if (cameraPresenceProviderExternalSyntheticLambda610 != null) {
            int i5 = onExtraCallbackWithResult + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            fliphorizontally.access000(((Number) cameraPresenceProviderExternalSyntheticLambda610.onExtraCallbackWithResult()).floatValue() * Float.intBitsToFloat((int) fliphorizontally.IAuthTabCallbackDefault()));
        }
        if (cameraPresenceProviderExternalSyntheticLambda611 != null) {
            int i7 = onExtraCallback + 19;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                fliphorizontally.asInterface(((Number) cameraPresenceProviderExternalSyntheticLambda611.onExtraCallbackWithResult()).floatValue());
                obj.hashCode();
                throw null;
            }
            fliphorizontally.asInterface(((Number) cameraPresenceProviderExternalSyntheticLambda611.onExtraCallbackWithResult()).floatValue());
        }
        if (cameraPresenceProviderExternalSyntheticLambda612 != null) {
            fliphorizontally.asBinder(((Number) cameraPresenceProviderExternalSyntheticLambda612.onExtraCallbackWithResult()).floatValue());
        }
        if (cameraPresenceProviderExternalSyntheticLambda613 != null) {
            fliphorizontally.IAuthTabCallbackDefault(((Number) cameraPresenceProviderExternalSyntheticLambda613.onExtraCallbackWithResult()).floatValue());
        }
        if (cameraPresenceProviderExternalSyntheticLambda614 != null) {
            fliphorizontally.onTransact(Float.intBitsToFloat((int) (fliphorizontally.IAuthTabCallbackDefault() >> 32)) * ((Number) cameraPresenceProviderExternalSyntheticLambda614.onExtraCallbackWithResult()).floatValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, setOrientationDegrees setorientationdegrees) {
        long jAccess100;
        long j;
        long j2;
        float f;
        hasMoreElements hasmoreelements;
        seek seekVar;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            int i5 = 57 / 0;
            if (cameraPresenceProviderExternalSyntheticLambda6 != null) {
                int i6 = onExtraCallbackWithResult + 63;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
                    j = 0;
                    j2 = 0;
                    f = 2.0f;
                    hasmoreelements = null;
                    seekVar = null;
                    i = 0;
                    i2 = 8;
                } else {
                    jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
                    j = 0;
                    j2 = 0;
                    f = 0.0f;
                    hasmoreelements = null;
                    seekVar = null;
                    i = 0;
                    i2 = 126;
                }
                setOrientationDegrees.onWarmupCompleted(setorientationdegrees, jAccess100, j, j2, f, hasmoreelements, seekVar, i, i2, (Object) null);
            }
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            if (cameraPresenceProviderExternalSyntheticLambda6 != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1172  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x118d  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x1197  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x11b9  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x11d1  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x146b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(Function1 function1, getSwitchMinWidth getswitchminwidth, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        final Map map;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62;
        int i4;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67;
        r8lambdawISNmAGv0vJBBl_rQ3C6417OY r8lambdawisnmagv0vjbbl_rq3c6417oy;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda68;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda69;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda610;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda611;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda612;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda613;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda614;
        r8lambdawISNmAGv0vJBBl_rQ3C6417OY r8lambdawisnmagv0vjbbl_rq3c6417oy2;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda615;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda616;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda617;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda618;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda619;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda620;
        r8lambdawISNmAGv0vJBBl_rQ3C6417OY r8lambdawisnmagv0vjbbl_rq3c6417oy3;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda621;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda622;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda623;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda624;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda625;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda626;
        r8lambdawISNmAGv0vJBBl_rQ3C6417OY r8lambdawisnmagv0vjbbl_rq3c6417oy4;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda627;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objIAuthTabCallback;
        Object objIAuthTabCallback2;
        Object objIAuthTabCallback3;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        Object objIAuthTabCallback4;
        Object objIAuthTabCallback5;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda628;
        Object objIAuthTabCallback6;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda629;
        Object objIAuthTabCallback7;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda630;
        Object objIAuthTabCallback8;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda631;
        Object objIAuthTabCallback9;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda632;
        Object objIAuthTabCallback10;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda633;
        Object objIAuthTabCallback11;
        Object objIAuthTabCallback12;
        Object objIAuthTabCallback13;
        int i5;
        Object objIAuthTabCallback14;
        int i6 = 2 % 2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1382490174);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1382490174, i, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous> (FiniteRally.kt:206)");
        }
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd();
            function1.invoke(maxAppOpenAd);
            objOnMinimized2 = maxAppOpenAd.onWarmupCompleted();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        final Map map2 = (Map) objOnMinimized2;
        Map map3 = (Map) map2.get(getswitchminwidth.access000());
        if ((map3 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map3.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallback())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1323641899);
            getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 111;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Map map4 = map2;
                    getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i11 == 0) {
                        return getMediaContentAspectRatio.asBinder(map4, onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                    }
                    getMediaContentAspectRatio.asBinder(map4, onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback14 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3 || objIAuthTabCallback14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                    try {
                        Object objIAuthTabCallback15 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback15);
                        objIAuthTabCallback14 = objIAuthTabCallback15;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(331356303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(331356303, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:219)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent = MaxNativeAdView.Companion;
            float fFloatValue = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map2, objIAuthTabCallback14, onnavigationevent.IAuthTabCallback(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent4 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onNavigationEvent(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            Object objOnExtraCallbackWithResult = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(331356303);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(331356303, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:219)");
            }
            float fFloatValue2 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map2, objOnExtraCallbackWithResult, onnavigationevent.IAuthTabCallback(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent5 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onWarmupCompleted(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            i2 = 1666827533;
            i3 = 1666573488;
            map = map2;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback, "Opacity", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent6 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5;
        } else {
            i2 = 1666827533;
            i3 = 1666573488;
            map = map2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1324072520);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda6 = null;
        }
        Map map4 = (Map) map.get(getswitchminwidth.access000());
        if ((map4 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map4.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallbackStub())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1324209261);
            getBacktraceNote getbacktracenote2 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    updateFocusedState updatefocusedstateOnExtraCallbackWithResult = getMediaContentAspectRatio.onExtraCallbackWithResult(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return updatefocusedstateOnExtraCallbackWithResult;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback2 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(i2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback13 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(i3);
                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent7 || objIAuthTabCallback13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback2.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                    try {
                        Object objIAuthTabCallback16 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub2);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback16);
                        objIAuthTabCallback13 = objIAuthTabCallback16;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1068740022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                i5 = -1;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1068740022, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:233)");
            } else {
                i5 = -1;
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent2 = MaxNativeAdView.Companion;
            float fFloatValue3 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback13, onnavigationevent2.IAuthTabCallbackStub(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent8 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asBinder(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
            }
            Object objOnExtraCallbackWithResult2 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized6).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1068740022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1068740022, 0, i5, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:233)");
            }
            float fFloatValue4 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult2, onnavigationevent2.IAuthTabCallbackStub(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent9 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new writeTypedObject(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
            i4 = i5;
            cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4), (updateFocusedState) getbacktracenote2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized7).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback2, "ScaleX", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2;
        } else {
            cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
            i4 = -1;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1324637960);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda63 = null;
        }
        Map map5 = (Map) map.get(getswitchminwidth.access000());
        if ((map5 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map5.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.asBinder())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1324774701);
            getBacktraceNote getbacktracenote3 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    updateFocusedState updatefocusedstate;
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 31;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        Object[] objArr = {map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        updatefocusedstate = (updateFocusedState) getMediaContentAspectRatio.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                        int i11 = 79 / 0;
                    } else {
                        Object[] objArr2 = {map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                        updatefocusedstate = (updateFocusedState) getMediaContentAspectRatio.IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr2, 1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
                    }
                    int i12 = onNavigationEvent + 71;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return updatefocusedstate;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback3 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback12 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent10 || objIAuthTabCallback12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback3 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 = iAuthTabCallback3.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub3 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3 = iAuthTabCallback3.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3);
                    try {
                        Object objIAuthTabCallback17 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback3.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3, function1IAuthTabCallbackStub3);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback17);
                        objIAuthTabCallback12 = objIAuthTabCallback17;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(94841163);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94841163, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:247)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent3 = MaxNativeAdView.Companion;
            float fFloatValue5 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback12, onnavigationevent3.asBinder(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent11 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new readTypedObject(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
            }
            Object objOnExtraCallbackWithResult3 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized8).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(94841163);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(94841163, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:247)");
            }
            float fFloatValue6 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult3, onnavigationevent3.asBinder(), fValueOf)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent12) {
                int i9 = onExtraCallback + 115;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized9 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new extraCallback(getswitchminwidth));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3 = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(fFloatValue5), Float.valueOf(fFloatValue6), (updateFocusedState) getbacktracenote3.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized9).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback3, "ScaleY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1325203400);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda64 = null;
        }
        Map map6 = (Map) map.get(getswitchminwidth.access000());
        if ((map6 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map6.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.access000())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1325361779);
            getBacktraceNote getbacktracenote4 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Map map7 = map;
                    getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
                    if (i12 != 0) {
                        return getMediaContentAspectRatio.onTransact(map7, onextracallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    getMediaContentAspectRatio.onTransact(map7, onextracallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistOnExtraCallbackWithResult = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback11 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent13 || objIAuthTabCallback11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback4 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4 = iAuthTabCallback4.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub4 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult4 = iAuthTabCallback4.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4);
                    try {
                        Object objIAuthTabCallback18 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback4.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback4, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult4, function1IAuthTabCallbackStub4);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback18);
                        objIAuthTabCallback11 = objIAuthTabCallback18;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1361670668);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1361670668, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:262)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent4 = MaxNativeAdView.Companion;
            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback11, onnavigationevent4.access000(), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)))).IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
            boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent14 || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized10 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
            }
            Object objOnExtraCallbackWithResult4 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized10).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1361670668);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1361670668, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:262)");
            }
            float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult4, onnavigationevent4.access000(), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)))).IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback2);
            boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent15 || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized11 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback4 = getSwitchPadding.onExtraCallback(getswitchminwidth, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2, (updateFocusedState) getbacktracenote4.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized11).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult, "TranslateX", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1325846464);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda65 = null;
        }
        Map map7 = (Map) map.get(getswitchminwidth.access000());
        if ((map7 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map7.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.access100())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1326010981);
            getBacktraceNote getbacktracenote5 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda10
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    updateFocusedState updatefocusedstateAccess000 = getMediaContentAspectRatio.access000(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        return updatefocusedstateAccess000;
                    }
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistOnExtraCallbackWithResult2 = getThumbTextPadding.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.Companion);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback10 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent16) {
                    int i10 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 56 / 0;
                        if (objIAuthTabCallback10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback5 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5 = iAuthTabCallback5.IAuthTabCallback();
                            Function1 function1IAuthTabCallbackStub5 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5.IAuthTabCallbackStub() : null;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult5 = iAuthTabCallback5.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5);
                            try {
                                Object objIAuthTabCallback19 = getswitchminwidth.IAuthTabCallback();
                                iAuthTabCallback5.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback5, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult5, function1IAuthTabCallbackStub5);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback19);
                                objIAuthTabCallback10 = objIAuthTabCallback19;
                            } finally {
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        if (objIAuthTabCallback10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-198089483);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-198089483, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:277)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent5 = MaxNativeAdView.Companion;
            float fIAuthTabCallback3 = ((VirtualCameraControlExternalSyntheticLambda1) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback10, onnavigationevent5.access100(), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)))).IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent3 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback3);
            boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent17 || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized12 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallback(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
            }
            Object objOnExtraCallbackWithResult5 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized12).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-198089483);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 75;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                cameraPresenceProviderExternalSyntheticLambda633 = cameraPresenceProviderExternalSyntheticLambda65;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-198089483, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:277)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda633 = cameraPresenceProviderExternalSyntheticLambda65;
            }
            float fIAuthTabCallback4 = ((VirtualCameraControlExternalSyntheticLambda1) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult5, onnavigationevent5.access100(), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)))).IAuthTabCallback();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent4 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback4);
            boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent18 || objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized13 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
            }
            cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda633;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback5 = getSwitchPadding.onExtraCallback(getswitchminwidth, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent3, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent4, (updateFocusedState) getbacktracenote5.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized13).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistOnExtraCallbackWithResult2, "TranslateY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda67 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback5;
        } else {
            cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda65;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1326447616);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda67 = null;
        }
        Map map8 = (Map) map.get(getswitchminwidth.access000());
        if (map8 != null) {
            r8lambdawisnmagv0vjbbl_rq3c6417oy = (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map8.get(MaxNativeAdView.onExtraCallback((String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(1486455195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1486455194, new Object[]{MaxNativeAdView.Companion})));
        } else {
            r8lambdawisnmagv0vjbbl_rq3c6417oy = null;
        }
        if (r8lambdawisnmagv0vjbbl_rq3c6417oy != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1326628222);
            getBacktraceNote getbacktracenote6 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda11
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i14 = 2 % 2;
                    int i15 = onExtraCallback + 33;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    updateFocusedState interfaceDescriptor = getMediaContentAspectRatio.getInterfaceDescriptor(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = onWarmupCompleted + 15;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    return interfaceDescriptor;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback4 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback9 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent19 || objIAuthTabCallback9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback6 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback6 = iAuthTabCallback6.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub6 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback6 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback6.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult6 = iAuthTabCallback6.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback6);
                    try {
                        Object objIAuthTabCallback20 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback6.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback6, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult6, function1IAuthTabCallbackStub6);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback20);
                        objIAuthTabCallback9 = objIAuthTabCallback20;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-203879581);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onExtraCallbackWithResult + 9;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-203879581, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:291)");
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-203879581, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:291)");
                }
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent6 = MaxNativeAdView.Companion;
            float fFloatValue7 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback9, (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(1486455195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1486455194, new Object[]{onnavigationevent6}), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf3 = Float.valueOf(fFloatValue7);
            boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent20 || objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized14 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new extraCallbackWithResult(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
            }
            Object objOnExtraCallbackWithResult6 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized14).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-203879581);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda632 = cameraPresenceProviderExternalSyntheticLambda67;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-203879581, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:291)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda632 = cameraPresenceProviderExternalSyntheticLambda67;
            }
            float fFloatValue8 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult6, (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(1486455195, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1486455194, new Object[]{onnavigationevent6}), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent21 || objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized15 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onPostMessage(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized15);
            }
            cameraPresenceProviderExternalSyntheticLambda68 = cameraPresenceProviderExternalSyntheticLambda632;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback6 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf3, Float.valueOf(fFloatValue8), (updateFocusedState) getbacktracenote6.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized15).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback4, "TranslatePercentX", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda69 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback6;
        } else {
            cameraPresenceProviderExternalSyntheticLambda68 = cameraPresenceProviderExternalSyntheticLambda67;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1327133088);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda69 = null;
        }
        Map map9 = (Map) map.get(getswitchminwidth.access000());
        if ((map9 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map9.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallbackStubProxy())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1327313694);
            getBacktraceNote getbacktracenote7 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda12
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 81;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    updateFocusedState updatefocusedstateAsInterface = getMediaContentAspectRatio.asInterface(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallback + 121;
                    onWarmupCompleted = i18 % 128;
                    if (i18 % 2 != 0) {
                        return updatefocusedstateAsInterface;
                    }
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback5 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback8 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent22 || objIAuthTabCallback8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback7 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback7 = iAuthTabCallback7.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub7 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback7 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback7.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult7 = iAuthTabCallback7.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback7);
                    try {
                        Object objIAuthTabCallback21 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback7.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback7, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult7, function1IAuthTabCallbackStub7);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback21);
                        objIAuthTabCallback8 = objIAuthTabCallback21;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(959701604);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(959701604, 0, i4, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:306)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent7 = MaxNativeAdView.Companion;
            float fFloatValue9 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback8, onnavigationevent7.IAuthTabCallbackStubProxy(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf4 = Float.valueOf(fFloatValue9);
            boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent23) || objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized16 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onMessageChannelReady(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized16);
            }
            Object objOnExtraCallbackWithResult7 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized16).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(959701604);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda631 = cameraPresenceProviderExternalSyntheticLambda69;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(959701604, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:306)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda631 = cameraPresenceProviderExternalSyntheticLambda69;
            }
            float fFloatValue10 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult7, onnavigationevent7.IAuthTabCallbackStubProxy(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent24 || objOnMinimized17 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized17 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onMinimized(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized17);
            }
            cameraPresenceProviderExternalSyntheticLambda610 = cameraPresenceProviderExternalSyntheticLambda631;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback7 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf4, Float.valueOf(fFloatValue10), (updateFocusedState) getbacktracenote7.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized17).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback5, "TranslatePercentY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda611 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback7;
        } else {
            cameraPresenceProviderExternalSyntheticLambda610 = cameraPresenceProviderExternalSyntheticLambda69;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1327818560);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda611 = null;
        }
        Map map10 = (Map) map.get(getswitchminwidth.access000());
        if ((map10 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map10.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onWarmupCompleted())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1327978272);
            getBacktraceNote getbacktracenote8 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda13
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    updateFocusedState updatefocusedstateOnNavigationEvent;
                    int i15 = 2 % 2;
                    int i16 = onNavigationEvent + 125;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        updatefocusedstateOnNavigationEvent = getMediaContentAspectRatio.onNavigationEvent(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i17 = 76 / 0;
                    } else {
                        updatefocusedstateOnNavigationEvent = getMediaContentAspectRatio.onNavigationEvent(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i18 = onExtraCallback + 123;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    return updatefocusedstateOnNavigationEvent;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback6 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback7 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent25 || objIAuthTabCallback7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback8 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback8 = iAuthTabCallback8.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub8 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback8 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback8.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult8 = iAuthTabCallback8.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback8);
                    try {
                        Object objIAuthTabCallback22 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback8.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback8, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult8, function1IAuthTabCallbackStub8);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback22);
                        objIAuthTabCallback7 = objIAuthTabCallback22;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1496063327);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1496063327, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:321)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent8 = MaxNativeAdView.Companion;
            float fFloatValue11 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback7, onnavigationevent8.onWarmupCompleted(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf5 = Float.valueOf(fFloatValue11);
            boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent26 || objOnMinimized18 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized18 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onActivityLayout(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized18);
            }
            Object objOnExtraCallbackWithResult8 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized18).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1496063327);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda630 = cameraPresenceProviderExternalSyntheticLambda611;
                cameraPresenceProviderExternalSyntheticLambda612 = cameraPresenceProviderExternalSyntheticLambda610;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1496063327, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:321)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda630 = cameraPresenceProviderExternalSyntheticLambda611;
                cameraPresenceProviderExternalSyntheticLambda612 = cameraPresenceProviderExternalSyntheticLambda610;
            }
            float fFloatValue12 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult8, onnavigationevent8.onWarmupCompleted(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent27 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent27 || objOnMinimized19 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized19 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackDefault(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized19);
            }
            cameraPresenceProviderExternalSyntheticLambda613 = cameraPresenceProviderExternalSyntheticLambda630;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback8 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf5, Float.valueOf(fFloatValue12), (updateFocusedState) getbacktracenote8.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized19).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback6, "RotateX", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda614 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback8;
        } else {
            cameraPresenceProviderExternalSyntheticLambda612 = cameraPresenceProviderExternalSyntheticLambda610;
            cameraPresenceProviderExternalSyntheticLambda613 = cameraPresenceProviderExternalSyntheticLambda611;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1328450464);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda614 = null;
        }
        Map map11 = (Map) map.get(getswitchminwidth.access000());
        if (map11 != null) {
            int i15 = onExtraCallback + 37;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            r8lambdawisnmagv0vjbbl_rq3c6417oy2 = (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map11.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onExtraCallbackWithResult()));
        } else {
            r8lambdawisnmagv0vjbbl_rq3c6417oy2 = null;
        }
        if (r8lambdawisnmagv0vjbbl_rq3c6417oy2 != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1328610176);
            getBacktraceNote getbacktracenote9 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda14
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 3;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    Map map12 = map;
                    getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (i19 != 0) {
                        return getMediaContentAspectRatio.IAuthTabCallback_Parcel(map12, onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                    }
                    getMediaContentAspectRatio.IAuthTabCallback_Parcel(map12, onextracallback, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue);
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback7 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback6 = getswitchminwidth.IAuthTabCallback();
            } else {
                int i17 = onExtraCallbackWithResult + 21;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent28 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent28 || objIAuthTabCallback6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback9 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback9 = iAuthTabCallback9.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub9 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback9 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback9.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult9 = iAuthTabCallback9.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback9);
                    try {
                        Object objIAuthTabCallback23 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback9.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback9, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult9, function1IAuthTabCallbackStub9);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback23);
                        objIAuthTabCallback6 = objIAuthTabCallback23;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1635322784);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1635322784, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:336)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent9 = MaxNativeAdView.Companion;
            float fFloatValue13 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback6, onnavigationevent9.onExtraCallbackWithResult(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf6 = Float.valueOf(fFloatValue13);
            boolean zOnNavigationEvent29 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent29 || objOnMinimized20 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized20 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new asInterface(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized20);
            }
            Object objOnExtraCallbackWithResult9 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized20).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1635322784);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda629 = cameraPresenceProviderExternalSyntheticLambda614;
                cameraPresenceProviderExternalSyntheticLambda615 = cameraPresenceProviderExternalSyntheticLambda613;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1635322784, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:336)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda629 = cameraPresenceProviderExternalSyntheticLambda614;
                cameraPresenceProviderExternalSyntheticLambda615 = cameraPresenceProviderExternalSyntheticLambda613;
            }
            float fFloatValue14 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult9, onnavigationevent9.onExtraCallbackWithResult(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent30 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent30 || objOnMinimized21 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized21 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onTransact(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized21);
            }
            cameraPresenceProviderExternalSyntheticLambda616 = cameraPresenceProviderExternalSyntheticLambda629;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback9 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf6, Float.valueOf(fFloatValue14), (updateFocusedState) getbacktracenote9.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized21).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback7, "RotateY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda617 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback9;
        } else {
            cameraPresenceProviderExternalSyntheticLambda615 = cameraPresenceProviderExternalSyntheticLambda613;
            cameraPresenceProviderExternalSyntheticLambda616 = cameraPresenceProviderExternalSyntheticLambda614;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1329082368);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda617 = null;
        }
        Map map12 = (Map) map.get(getswitchminwidth.access000());
        if ((map12 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map12.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.IAuthTabCallbackDefault())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1329242080);
            getBacktraceNote getbacktracenote10 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i20 % 128;
                    Object obj4 = null;
                    if (i20 % 2 != 0) {
                        getMediaContentAspectRatio.IAuthTabCallbackDefault(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    updateFocusedState updatefocusedstateIAuthTabCallbackDefault = getMediaContentAspectRatio.IAuthTabCallbackDefault(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i21 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        return updatefocusedstateIAuthTabCallbackDefault;
                    }
                    throw null;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback8 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback5 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent31 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent31 || objIAuthTabCallback5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback10 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback10 = iAuthTabCallback10.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub10 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback10 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback10.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult10 = iAuthTabCallback10.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback10);
                    try {
                        Object objIAuthTabCallback24 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback10.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback10, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult10, function1IAuthTabCallbackStub10);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback24);
                        objIAuthTabCallback5 = objIAuthTabCallback24;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-471741599);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-471741599, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:351)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent10 = MaxNativeAdView.Companion;
            float fFloatValue15 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback5, onnavigationevent10.IAuthTabCallbackDefault(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf7 = Float.valueOf(fFloatValue15);
            boolean zOnNavigationEvent32 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent32 || objOnMinimized22 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized22 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new access100(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized22);
            }
            Object objOnExtraCallbackWithResult10 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized22).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-471741599);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda628 = cameraPresenceProviderExternalSyntheticLambda617;
                cameraPresenceProviderExternalSyntheticLambda618 = cameraPresenceProviderExternalSyntheticLambda616;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-471741599, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:351)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda628 = cameraPresenceProviderExternalSyntheticLambda617;
                cameraPresenceProviderExternalSyntheticLambda618 = cameraPresenceProviderExternalSyntheticLambda616;
            }
            float fFloatValue16 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult10, onnavigationevent10.IAuthTabCallbackDefault(), fValueOf2)).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent33 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent33 || objOnMinimized23 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized23 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new getInterfaceDescriptor(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized23);
            }
            cameraPresenceProviderExternalSyntheticLambda619 = cameraPresenceProviderExternalSyntheticLambda628;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback10 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf7, Float.valueOf(fFloatValue16), (updateFocusedState) getbacktracenote10.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized23).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback8, "RotateZ", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda620 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback10;
        } else {
            cameraPresenceProviderExternalSyntheticLambda618 = cameraPresenceProviderExternalSyntheticLambda616;
            cameraPresenceProviderExternalSyntheticLambda619 = cameraPresenceProviderExternalSyntheticLambda617;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1329714272);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda620 = null;
        }
        Map map13 = (Map) map.get(getswitchminwidth.access000());
        if (map13 != null) {
            int i19 = onExtraCallback + 57;
            onExtraCallbackWithResult = i19 % 128;
            int i20 = i19 % 2;
            r8lambdawisnmagv0vjbbl_rq3c6417oy3 = (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map13.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.asInterface()));
        } else {
            r8lambdawisnmagv0vjbbl_rq3c6417oy3 = null;
        }
        if (r8lambdawisnmagv0vjbbl_rq3c6417oy3 != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1329893359);
            getBacktraceNote getbacktracenote11 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 11;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    updateFocusedState updatefocusedstateIAuthTabCallbackStubProxy = getMediaContentAspectRatio.IAuthTabCallbackStubProxy(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i24 = onNavigationEvent + 85;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    return updatefocusedstateIAuthTabCallbackStubProxy;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback9 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback4 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent34 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent34 || objIAuthTabCallback4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback11 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback11 = iAuthTabCallback11.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub11 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback11 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback11.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult11 = iAuthTabCallback11.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback11);
                    try {
                        Object objIAuthTabCallback25 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback11.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback11, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult11, function1IAuthTabCallbackStub11);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback25);
                        objIAuthTabCallback4 = objIAuthTabCallback25;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1636003490);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1636003490, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:366)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent11 = MaxNativeAdView.Companion;
            String strAsInterface = onnavigationevent11.asInterface();
            createUShort.onNavigationEvent onnavigationevent12 = createUShort.Companion;
            float fFloatValue17 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback4, strAsInterface, Float.valueOf(createUShort.onNavigationEvent(onnavigationevent12.onExtraCallbackWithResult())))).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = onExtraCallbackWithResult + 63;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf8 = Float.valueOf(fFloatValue17);
            boolean zOnNavigationEvent35 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent35 || objOnMinimized24 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized24 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new access000(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized24);
            }
            Object objOnExtraCallbackWithResult11 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized24).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1636003490);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                cameraPresenceProviderExternalSyntheticLambda621 = cameraPresenceProviderExternalSyntheticLambda619;
                cameraPresenceProviderExternalSyntheticLambda622 = cameraPresenceProviderExternalSyntheticLambda620;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1636003490, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:366)");
            } else {
                cameraPresenceProviderExternalSyntheticLambda621 = cameraPresenceProviderExternalSyntheticLambda619;
                cameraPresenceProviderExternalSyntheticLambda622 = cameraPresenceProviderExternalSyntheticLambda620;
            }
            float fFloatValue18 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult11, onnavigationevent11.asInterface(), Float.valueOf(createUShort.onNavigationEvent(onnavigationevent12.onExtraCallbackWithResult())))).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent36 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent36 || objOnMinimized25 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized25 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback_Parcel(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized25);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback11 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf8, Float.valueOf(fFloatValue18), (updateFocusedState) getbacktracenote11.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized25).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback9, "TransformOriginX", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda623 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback11;
        } else {
            cameraPresenceProviderExternalSyntheticLambda621 = cameraPresenceProviderExternalSyntheticLambda619;
            cameraPresenceProviderExternalSyntheticLambda622 = cameraPresenceProviderExternalSyntheticLambda620;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1330412640);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda623 = null;
        }
        Map map14 = (Map) map.get(getswitchminwidth.access000());
        if ((map14 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map14.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onTransact())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1330591727);
            getBacktraceNote getbacktracenote12 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i23 = 2 % 2;
                    int i24 = onWarmupCompleted + 1;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    Map map15 = map;
                    getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) obj;
                    if (i25 == 0) {
                        return getMediaContentAspectRatio.onWarmupCompleted(map15, onextracallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    updateFocusedState updatefocusedstateOnWarmupCompleted = getMediaContentAspectRatio.onWarmupCompleted(map15, onextracallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i26 = 13 / 0;
                    return updatefocusedstateOnWarmupCompleted;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback10 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback3 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent37 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent37 || objIAuthTabCallback3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback12 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback12 = iAuthTabCallback12.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub12 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback12 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback12.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult12 = iAuthTabCallback12.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback12);
                    try {
                        Object objIAuthTabCallback26 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback12.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback12, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult12, function1IAuthTabCallbackStub12);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback26);
                        objIAuthTabCallback3 = objIAuthTabCallback26;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1495382621);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1495382621, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:381)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent13 = MaxNativeAdView.Companion;
            String strOnTransact = onnavigationevent13.onTransact();
            createUShort.onNavigationEvent onnavigationevent14 = createUShort.Companion;
            float fFloatValue19 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback3, strOnTransact, Float.valueOf(createUShort.onExtraCallbackWithResult(onnavigationevent14.onExtraCallbackWithResult())))).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf9 = Float.valueOf(fFloatValue19);
            boolean zOnNavigationEvent38 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent38) {
                int i23 = onExtraCallback + 19;
                onExtraCallbackWithResult = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 73 / 0;
                    if (objOnMinimized26 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized26 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStubProxy(getswitchminwidth));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized26);
                    }
                    Object objOnExtraCallbackWithResult12 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized26).onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1495382621);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        cameraPresenceProviderExternalSyntheticLambda624 = cameraPresenceProviderExternalSyntheticLambda64;
                    } else {
                        cameraPresenceProviderExternalSyntheticLambda624 = cameraPresenceProviderExternalSyntheticLambda64;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1495382621, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:381)");
                    }
                    float fFloatValue20 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult12, onnavigationevent13.onTransact(), Float.valueOf(createUShort.onExtraCallbackWithResult(onnavigationevent14.onExtraCallbackWithResult())))).floatValue();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ICustomTabsCallback(getswitchminwidth));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback12 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf9, Float.valueOf(fFloatValue20), (updateFocusedState) getbacktracenote12.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback10, "TransformOriginY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    cameraPresenceProviderExternalSyntheticLambda625 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback12;
                } else {
                    if (objOnMinimized26 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    Object objOnExtraCallbackWithResult122 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized26).onExtraCallbackWithResult();
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1495382621);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    float fFloatValue202 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult122, onnavigationevent13.onTransact(), Float.valueOf(createUShort.onExtraCallbackWithResult(onnavigationevent14.onExtraCallbackWithResult())))).floatValue();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ICustomTabsCallback(getswitchminwidth));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback122 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf9, Float.valueOf(fFloatValue202), (updateFocusedState) getbacktracenote12.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback10, "TransformOriginY", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        cameraPresenceProviderExternalSyntheticLambda625 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback122;
                    }
                }
            }
        } else {
            cameraPresenceProviderExternalSyntheticLambda624 = cameraPresenceProviderExternalSyntheticLambda64;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1331111008);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda625 = null;
        }
        Map map15 = (Map) map.get(getswitchminwidth.access000());
        if ((map15 != null ? (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map15.get(MaxNativeAdView.onExtraCallback(MaxNativeAdView.Companion.onNavigationEvent())) : null) != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1331279462);
            getBacktraceNote getbacktracenote13 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallbackWithResult + 41;
                    IAuthTabCallback = i26 % 128;
                    int i27 = i26 % 2;
                    updateFocusedState updatefocusedstateIAuthTabCallbackStub = getMediaContentAspectRatio.IAuthTabCallbackStub(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i28 = IAuthTabCallback + 109;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    return updatefocusedstateIAuthTabCallbackStub;
                }
            };
            getThumbTintList getthumbtintlistIAuthTabCallback11 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
            if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                objIAuthTabCallback2 = getswitchminwidth.IAuthTabCallback();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                boolean zOnNavigationEvent39 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent39 || objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback13 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback13 = iAuthTabCallback13.IAuthTabCallback();
                    Function1 function1IAuthTabCallbackStub13 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback13 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback13.IAuthTabCallbackStub() : null;
                    r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult13 = iAuthTabCallback13.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback13);
                    try {
                        Object objIAuthTabCallback27 = getswitchminwidth.IAuthTabCallback();
                        iAuthTabCallback13.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback13, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult13, function1IAuthTabCallbackStub13);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback27);
                        objIAuthTabCallback2 = objIAuthTabCallback27;
                    } finally {
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1089836667);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1089836667, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:396)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent15 = MaxNativeAdView.Companion;
            float fFloatValue21 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback2, onnavigationevent15.onNavigationEvent(), Float.valueOf(8.0f))).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            Float fValueOf10 = Float.valueOf(fFloatValue21);
            boolean zOnNavigationEvent40 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent40 || objOnMinimized27 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized27 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onExtraCallbackWithResult(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized27);
            }
            Object objOnExtraCallbackWithResult13 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized27).onExtraCallbackWithResult();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1089836667);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1089836667, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:396)");
            }
            float fFloatValue22 = ((Number) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult13, onnavigationevent15.onNavigationEvent(), Float.valueOf(8.0f))).floatValue();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent41 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
            Object objOnMinimized28 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent41 || objOnMinimized28 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized28 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.asInterface(getswitchminwidth));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized28);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback13 = getSwitchPadding.onExtraCallback(getswitchminwidth, fValueOf10, Float.valueOf(fFloatValue22), (updateFocusedState) getbacktracenote13.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized28).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlistIAuthTabCallback11, "Perspective", cameraCaptureResultEmptyCameraCaptureResult, 196608);
            boolean zOnNavigationEvent42 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback13);
            Object objOnMinimized29 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent42) || objOnMinimized29 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized29 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onTransact(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback13));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized29);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda626 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized29;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1331776640);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraPresenceProviderExternalSyntheticLambda626 = null;
        }
        Map map16 = (Map) map.get(getswitchminwidth.access000());
        if (map16 != null) {
            r8lambdawisnmagv0vjbbl_rq3c6417oy4 = (r8lambdawISNmAGv0vJBBl_rQ3C6417OY) map16.get(MaxNativeAdView.onExtraCallback((String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, new Object[]{MaxNativeAdView.Companion})));
        } else {
            r8lambdawisnmagv0vjbbl_rq3c6417oy4 = null;
        }
        if (r8lambdawisnmagv0vjbbl_rq3c6417oy4 != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1331953216);
            getBacktraceNote getbacktracenote14 = new getBacktraceNote() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallback + 115;
                    onExtraCallbackWithResult = i26 % 128;
                    int i27 = i26 % 2;
                    updateFocusedState updatefocusedstateIAuthTabCallback = getMediaContentAspectRatio.IAuthTabCallback(map, (getSwitchMinWidth.onExtraCallback) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i28 = onExtraCallback + 107;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    return updatefocusedstateIAuthTabCallback;
                }
            };
            Object objAccess000 = getswitchminwidth.access000();
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1791085211);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1791085211, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:411)");
            }
            MaxNativeAdView.onNavigationEvent onnavigationevent16 = MaxNativeAdView.Companion;
            long jAccess100 = ((setByteOrder) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objAccess000, (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, new Object[]{onnavigationevent16}), cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback((accessisMonitoringp) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[0], -682698112, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 682698115)))).access100();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jAccess100);
            boolean zOnNavigationEvent43 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getattributeOnExtraCallbackWithResult);
            Object objOnMinimized30 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent43) {
                Object obj = objOnMinimized30;
                if (objOnMinimized30 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getThumbTintList getthumbtintlist = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(getthumbtintlist);
                    obj = getthumbtintlist;
                }
                getThumbTintList getthumbtintlist2 = (getThumbTintList) obj;
                if (getswitchminwidth.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    objIAuthTabCallback = getswitchminwidth.IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent44 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                    objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent44 || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback14 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14 = iAuthTabCallback14.IAuthTabCallback();
                        Function1 function1IAuthTabCallbackStub14 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14.IAuthTabCallbackStub() : null;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult14 = iAuthTabCallback14.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14);
                        try {
                            Object objIAuthTabCallback28 = getswitchminwidth.IAuthTabCallback();
                            iAuthTabCallback14.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult14, function1IAuthTabCallbackStub14);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objIAuthTabCallback28);
                            objIAuthTabCallback = objIAuthTabCallback28;
                        } catch (Throwable th) {
                            iAuthTabCallback14.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback14, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult14, function1IAuthTabCallbackStub14);
                            throw th;
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1791085211);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1791085211, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:411)");
                }
                long jAccess1002 = ((setByteOrder) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objIAuthTabCallback, (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, new Object[]{onnavigationevent16}), cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback((accessisMonitoringp) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[0], -682698112, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 682698115)))).access100();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jAccess1002);
                boolean zOnNavigationEvent45 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                Object objOnMinimized31 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent45 || objOnMinimized31 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized31 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onWarmupCompleted(getswitchminwidth));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized31);
                }
                Object objOnExtraCallbackWithResult14 = ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized31).onExtraCallbackWithResult();
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1791085211);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    cameraPresenceProviderExternalSyntheticLambda627 = cameraPresenceProviderExternalSyntheticLambda626;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1791085211, 0, -1, "im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl.variants.<anonymous>.<anonymous> (FiniteRally.kt:411)");
                } else {
                    cameraPresenceProviderExternalSyntheticLambda627 = cameraPresenceProviderExternalSyntheticLambda626;
                }
                long jAccess1003 = ((setByteOrder) MaxNativeAdBuilder.onExtraCallbackWithResult(map, objOnExtraCallbackWithResult14, (String) MaxNativeAdView.onNavigationEvent.IAuthTabCallback(-594286327, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 594286327, new Object[]{onnavigationevent16}), cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback((accessisMonitoringp) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[0], -682698112, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 682698115)))).access100();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jAccess1003);
                boolean zOnNavigationEvent46 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth);
                Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent46 || objOnMinimized32 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized32 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidth));
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized32);
                }
                function1OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidth, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote14.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized32).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 0), getthumbtintlist2, "BackgroundColor", cameraCaptureResultEmptyCameraCaptureResult, 196608);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        } else {
            cameraPresenceProviderExternalSyntheticLambda627 = cameraPresenceProviderExternalSyntheticLambda626;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1332456160);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        final Function1 function12 = function1OnExtraCallback;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        boolean zOnNavigationEvent47 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda623);
        boolean zOnNavigationEvent48 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda625);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda634 = cameraPresenceProviderExternalSyntheticLambda62;
        boolean zOnNavigationEvent49 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda634);
        boolean zOnNavigationEvent50 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda63);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda635 = cameraPresenceProviderExternalSyntheticLambda624;
        boolean zOnNavigationEvent51 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda635);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda636 = cameraPresenceProviderExternalSyntheticLambda66;
        boolean zOnNavigationEvent52 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda636);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda637 = cameraPresenceProviderExternalSyntheticLambda68;
        boolean zOnNavigationEvent53 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda637);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda638 = cameraPresenceProviderExternalSyntheticLambda612;
        boolean zOnNavigationEvent54 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda638);
        boolean zOnNavigationEvent55 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda615);
        boolean zOnNavigationEvent56 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda618);
        boolean zOnNavigationEvent57 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda621);
        boolean zOnNavigationEvent58 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda622);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda639 = cameraPresenceProviderExternalSyntheticLambda627;
        boolean zOnNavigationEvent59 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda639);
        Object objOnMinimized33 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (((zOnNavigationEvent47 | zOnNavigationEvent48 | zOnNavigationEvent49 | zOnNavigationEvent50 | zOnNavigationEvent51 | zOnNavigationEvent52 | zOnNavigationEvent53 | zOnNavigationEvent54 | zOnNavigationEvent55 | zOnNavigationEvent56 | zOnNavigationEvent57 | zOnNavigationEvent58) || zOnNavigationEvent59) || objOnMinimized33 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda640 = cameraPresenceProviderExternalSyntheticLambda623;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda641 = cameraPresenceProviderExternalSyntheticLambda625;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda642 = cameraPresenceProviderExternalSyntheticLambda63;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda643 = cameraPresenceProviderExternalSyntheticLambda621;
            objOnMinimized33 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda5
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    Unit unitOnWarmupCompleted = getMediaContentAspectRatio.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda640, cameraPresenceProviderExternalSyntheticLambda641, cameraPresenceProviderExternalSyntheticLambda634, cameraPresenceProviderExternalSyntheticLambda642, cameraPresenceProviderExternalSyntheticLambda635, cameraPresenceProviderExternalSyntheticLambda636, cameraPresenceProviderExternalSyntheticLambda637, cameraPresenceProviderExternalSyntheticLambda638, cameraPresenceProviderExternalSyntheticLambda615, cameraPresenceProviderExternalSyntheticLambda618, cameraPresenceProviderExternalSyntheticLambda643, cameraPresenceProviderExternalSyntheticLambda622, cameraPresenceProviderExternalSyntheticLambda639, (flipHorizontally) obj2);
                    int i28 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i28 % 128;
                    int i29 = i28 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized33);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized33);
        boolean zOnNavigationEvent60 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function12);
        Object objOnMinimized34 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent60 || objOnMinimized34 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized34 = new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.FiniteRallyScopeImpl$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    Unit unitOnNavigationEvent;
                    int i25 = 2 % 2;
                    int i26 = onExtraCallback + 23;
                    onWarmupCompleted = i26 % 128;
                    if (i26 % 2 != 0) {
                        unitOnNavigationEvent = getMediaContentAspectRatio.onNavigationEvent(function12, (setOrientationDegrees) obj2);
                        int i27 = 88 / 0;
                    } else {
                        unitOnNavigationEvent = getMediaContentAspectRatio.onNavigationEvent(function12, (setOrientationDegrees) obj2);
                    }
                    int i28 = onWarmupCompleted + 83;
                    onExtraCallback = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 93 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized34);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = SessionProcessorSurface.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, (Function1) objOnMinimized34);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallbackStubProxy<T> implements Function0<T> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public IAuthTabCallbackStubProxy(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.access000();
                throw null;
            }
            T t = (T) this.IAuthTabCallback.access000();
            int i3 = onExtraCallbackWithResult + 13;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return t;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class access000<T> implements Function0<T> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public access000(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.access000();
                throw null;
            }
            T t = (T) this.IAuthTabCallback.access000();
            int i3 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class access100<T> implements Function0<T> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public access100(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            T t = (T) this.IAuthTabCallback.access000();
            int i4 = onNavigationEvent + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return t;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asBinder<T> implements Function0<T> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public asBinder(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            T t = (T) this.IAuthTabCallback.access000();
            int i4 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 61 / 0;
            }
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asInterface<T> implements Function0<T> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public asInterface(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public final T invoke() {
            T t;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                t = (T) this.onExtraCallback.access000();
                int i3 = 12 / 0;
            } else {
                t = (T) this.onExtraCallback.access000();
            }
            int i4 = IAuthTabCallback + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class extraCallbackWithResult<T> implements Function0<T> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public extraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.IAuthTabCallback;
            if (i3 != 0) {
                return (T) getswitchminwidth.access000();
            }
            getswitchminwidth.access000();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onActivityLayout<T> implements Function0<T> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public onActivityLayout(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            T t = (T) this.onExtraCallback.access000();
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return t;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallback<T> implements Function0<T> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            T t = (T) this.onWarmupCompleted.access000();
            int i4 = IAuthTabCallback + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements Function0<T> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T t = (T) this.onWarmupCompleted.access000();
            int i3 = IAuthTabCallback + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onMessageChannelReady<T> implements Function0<T> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onMessageChannelReady(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public final T invoke() {
            T t;
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                t = (T) this.onNavigationEvent.access000();
                int i3 = 97 / 0;
            } else {
                t = (T) this.onNavigationEvent.access000();
            }
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return t;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements Function0<T> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public onWarmupCompleted(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T t = (T) this.IAuthTabCallback.access000();
            int i3 = onNavigationEvent + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class readTypedObject<T> implements Function0<T> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public readTypedObject(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public final T invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.onNavigationEvent.access000();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T t = (T) this.onNavigationEvent.access000();
            int i3 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 58 / 0;
            }
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public IAuthTabCallback(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnNavigationEvent;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallbackDefault<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public IAuthTabCallbackDefault(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallbackStub<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public IAuthTabCallbackStub(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallback + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onNavigationEvent;
            if (i3 == 0) {
                return getswitchminwidth.IAuthTabCallbackDefault();
            }
            getswitchminwidth.IAuthTabCallbackDefault();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback_Parcel<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public IAuthTabCallback_Parcel(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnNavigationEvent = onNavigationEvent();
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            return onextracallbackOnNavigationEvent;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
                int i3 = 76 / 0;
            } else {
                onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            }
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class ICustomTabsCallback<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public ICustomTabsCallback(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.IAuthTabCallbackDefault();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i3 = onNavigationEvent + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class extraCallback<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public extraCallback(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 73;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class getInterfaceDescriptor<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public getInterfaceDescriptor(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackOnWarmupCompleted;
            }
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onMinimized<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onNavigationEvent;

        public onMinimized(getSwitchMinWidth getswitchminwidth) {
            this.onNavigationEvent = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onExtraCallback2 = onExtraCallback();
            int i4 = onExtraCallback + 13;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
            return onExtraCallback2;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.IAuthTabCallbackDefault();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onNavigationEvent.IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnWarmupCompleted;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.IAuthTabCallbackDefault();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            int i3 = onExtraCallback + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onPostMessage<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public onPostMessage(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public final getSwitchMinWidth.onExtraCallback<T> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallback = IAuthTabCallback();
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackIAuthTabCallback;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onTransact<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onTransact(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnNavigationEvent = onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnNavigationEvent;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onWarmupCompleted;
            if (i3 != 0) {
                return getswitchminwidth.IAuthTabCallbackDefault();
            }
            getswitchminwidth.IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class writeTypedObject<T> implements Function0<getSwitchMinWidth.onExtraCallback<T>> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSwitchMinWidth IAuthTabCallback;

        public writeTypedObject(getSwitchMinWidth getswitchminwidth) {
            this.IAuthTabCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackOnNavigationEvent = onNavigationEvent();
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            return onextracallbackOnNavigationEvent;
        }

        public final getSwitchMinWidth.onExtraCallback<T> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<T> onextracallbackIAuthTabCallbackDefault = this.IAuthTabCallback.IAuthTabCallbackDefault();
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            return onextracallbackIAuthTabCallbackDefault;
        }
    }

    public static /* synthetic */ updateFocusedState onExtraCallback(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 1988869082, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final updateFocusedState readTypedObject(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -557116105, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 557116109, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final updateFocusedState onActivityResized(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 60421359, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -60421356, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final updateFocusedState onPostMessage(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -389526348, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, 389526349, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda68, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda69, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda610, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda611, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda612, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda613, flipHorizontally fliphorizontally) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, cameraPresenceProviderExternalSyntheticLambda66, cameraPresenceProviderExternalSyntheticLambda67, cameraPresenceProviderExternalSyntheticLambda68, cameraPresenceProviderExternalSyntheticLambda69, cameraPresenceProviderExternalSyntheticLambda610, cameraPresenceProviderExternalSyntheticLambda611, cameraPresenceProviderExternalSyntheticLambda612, cameraPresenceProviderExternalSyntheticLambda613, fliphorizontally};
        return (Unit) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1165626590, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -1165626588, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }

    private static final updateFocusedState ICustomTabsCallbackStubProxy(Map map, getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {map, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) IAuthTabCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 822628246, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, -822628241, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult());
    }
}
