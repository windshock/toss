package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.R;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.InterfaceC0083handshake;
import o.QuirksExternalSyntheticBackport0;
import o.areAllItemsEnabled;
import o.hasProvider;
import o.initSDK;
import o.useAndConfigureProgramWithTexture;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class areAllItemsEnabled {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final wa.IAuthTabCallback onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(areAllItemsEnabled areallitemsenabled, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(areallitemsenabled, hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, graphicDeviceInfo, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, areAllItemsEnabled areallitemsenabled, Function0 function0, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, hasProvider hasprovider, long j3, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, areallitemsenabled, function0, gethumanreadablename, j, j2, graphicDeviceInfo, hasprovider, j3, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(areAllItemsEnabled areallitemsenabled, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            areallitemsenabled.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, graphicDeviceInfo, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            areallitemsenabled.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, graphicDeviceInfo, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i2) | i7);
        int i9 = ~i3;
        int i10 = ~(i9 | i6);
        int i11 = ~(i7 | i3);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i2);
        int i14 = (~(i2 | i7)) | i10 | i11;
        int i15 = i3 + i6 + i4 + (2052055731 * i) + (1687666023 * i5);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1966771951)) + 1000013824 + ((-1966771951) * i6) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i4) + (632946688 * i) + ((-741212160) * i5) + (2121465856 * i16);
        int i18 = (i3 * 1533266457) + 1248777597 + (i6 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i4 * 1533266057) + (i * 706030027) + (i5 * 1023530015) + (i16 * (-2088042496));
        return i17 + ((i18 * i18) * 1434255360) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(initsdk, function0);
        }
        IAuthTabCallback(initsdk, function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public areAllItemsEnabled(@NotNull wa.IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = iAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        long jOnTransact;
        hasProvider hasprovider = (hasProvider) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        long jLongValue2 = ((Number) objArr[5]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((iIntValue2 & 3) != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            if ((iIntValue2 & 2) != 0) {
            }
        }
        getHumanReadableName gethumanreadablename2 = (iIntValue2 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((iIntValue2 & 8) != 0) {
            int i3 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = jLongValue;
        }
        long jOnNavigationEvent = (iIntValue2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : jLongValue2;
        GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue2 & 32) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(388534359, iIntValue, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Paragraph (TitlePreset.kt:47)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.listheader.v3.TitlePreset$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 85;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
                    Unit unit = (Unit) areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, -1940360804, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{(useAndConfigureProgramWithTexture) obj}, 1940360805);
                    int i10 = onNavigationEvent + 17;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized, 1, (Object) null), gethumanreadablename2, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 65422, (iIntValue << 3) & 3670016, 196576);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                throw null;
            }
        }
        return null;
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = 27 / 0;
            } else {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        getHumanReadableName gethumanreadablename2 = (i2 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((i2 & 8) != 0) {
            jOnTransact = setByteOrder.Companion.onTransact();
            int i6 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            jOnTransact = j;
        }
        if ((i2 & 16) != 0) {
            int i8 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i9 = 6 / 0;
            } else {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            }
        } else {
            jOnNavigationEvent = j2;
        }
        Object obj = null;
        if ((i2 & 32) != 0) {
            int i10 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(955490175, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Paragraph (TitlePreset.kt:67)");
        }
        onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, gethumanreadablename2, Long.valueOf(jOnTransact), Long.valueOf(jOnNavigationEvent), graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(4194288 & i), 0}, -1975818925);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        int i11 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i11 % 128;
        int i12 = i11 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    private static final Unit IAuthTabCallback(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 5, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        }
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, areAllItemsEnabled areallitemsenabled, final Function0 function0, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, hasProvider hasprovider, long j3, final initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i5 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i7 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i9 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 51 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2050744236, i2, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Selector.<anonymous> (TitlePreset.kt:90)");
                }
                Function0 function02 = null;
                hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                iAuthTabCallback.onExtraCallbackWithResult(hasprovider);
                AppLovinCmpErrorCode.onExtraCallback(821297770, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -821297768, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback, Integer.valueOf(R.drawable.icon_arrow_down_mono), Long.valueOf(j3), null, 0L, 12, null});
                hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                InterfaceC0083handshake.onNavigationEvent onnavigationeventOnWarmupCompleted = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(areallitemsenabled.onNavigationEvent.access100().getSize());
                int iOnWarmupCompleted = Role.Companion.onWarmupCompleted();
                if (function0 != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2105855780);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2105855779);
                    boolean z2 = (i2 & 14) == 4;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!(z2 | zOnNavigationEvent)) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.listheader.v3.TitlePreset$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i11 = 2 % 2;
                                int i12 = IAuthTabCallback + 45;
                                onWarmupCompleted = i12 % 128;
                                int i13 = i12 % 2;
                                Unit unitOnWarmupCompleted = areAllItemsEnabled.onWarmupCompleted(initsdk, function0);
                                int i14 = IAuthTabCallback + 13;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    function02 = (Function0) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) w2.IAuthTabCallback(1123787723, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, Float.valueOf(fIAuthTabCallback), null, true, true, false, Role.IAuthTabCallback(iOnWarmupCompleted), function02, cameraCaptureResultEmptyCameraCaptureResult, 27648, 18}, -1123787717, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()), gethumanreadablename, j, j2, 0L, onnavigationeventOnWarmupCompleted, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 196512);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Function0 function022 = null;
                hasProvider.IAuthTabCallback iAuthTabCallback2 = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                iAuthTabCallback2.onExtraCallbackWithResult(hasprovider);
                AppLovinCmpErrorCode.onExtraCallback(821297770, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -821297768, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{iAuthTabCallback2, Integer.valueOf(R.drawable.icon_arrow_down_mono), Long.valueOf(j3), null, 0L, 12, null});
                hasProvider hasproviderOnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult();
                InterfaceC0083handshake.onNavigationEvent onnavigationeventOnWarmupCompleted2 = ConnectionPool.onWarmupCompleted.onWarmupCompleted();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0);
                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(areallitemsenabled.onNavigationEvent.access100().getSize());
                int iOnWarmupCompleted2 = Role.Companion.onWarmupCompleted();
                if (function0 != null) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult2, (QuirksExternalSyntheticBackport0) w2.IAuthTabCallback(1123787723, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback2, Float.valueOf(fIAuthTabCallback2), null, true, true, false, Role.IAuthTabCallback(iOnWarmupCompleted2), function022, cameraCaptureResultEmptyCameraCaptureResult, 27648, 18}, -1123787717, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()), gethumanreadablename, j, j2, 0L, onnavigationeventOnWarmupCompleted2, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 196512);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        long j4;
        int i5;
        long jOnTransact;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        int i9;
        int i10;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getHumanReadableName gethumanreadablename2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final long j5;
        final long j6;
        final Function0<Unit> function03;
        final long j7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact2;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo3;
        GraphicDeviceInfo graphicDeviceInfo4;
        getHumanReadableName gethumanreadablename4;
        long j8;
        long j9;
        Function0<Unit> function04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long j10;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(266744319);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            int i14 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i14 % 128;
            i3 = i14 % 2 != 0 ? i3 | 56 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    int i15 = IAuthTabCallback + 11;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename) ? 256 : 128;
                    i3 |= i17;
                }
                i3 |= i17;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    j4 = j;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    if ((i2 & 32) == 0) {
                        jOnTransact = j3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact)) {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    } else {
                        jOnTransact = j3;
                    }
                    i11 = 65536;
                    i3 |= i11;
                } else {
                    jOnTransact = j3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    int i18 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    i7 = 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo)) {
                            int i20 = onExtraCallbackWithResult + 15;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        function02 = function0;
                        if ((i & 12582912) == 0) {
                            i9 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 8388608 : 4194304);
                        }
                        if ((100663296 & i) == 0) {
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                        }
                        i10 = i9;
                        if ((i10 & 38347923) != 38347922) {
                            int i22 = IAuthTabCallback + 3;
                            onExtraCallbackWithResult = i22 % 128;
                            int i23 = i22 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                            int i24 = onExtraCallbackWithResult + 53;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            Object obj = null;
                            if ((i & 1) != 0) {
                                int i26 = IAuthTabCallback + 83;
                                onExtraCallbackWithResult = i26 % 128;
                                if (i26 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage();
                                    throw null;
                                }
                                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                                    quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    if ((i2 & 4) != 0) {
                                        gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                        i10 &= -897;
                                    } else {
                                        gethumanreadablename3 = gethumanreadablename;
                                    }
                                    if (i4 != 0) {
                                        int i27 = IAuthTabCallback + 59;
                                        onExtraCallbackWithResult = i27 % 128;
                                        if (i27 % 2 == 0) {
                                            setByteOrder.Companion.onTransact();
                                            obj.hashCode();
                                            throw null;
                                        }
                                        jOnTransact2 = setByteOrder.Companion.onTransact();
                                    } else {
                                        jOnTransact2 = j4;
                                    }
                                    jOnNavigationEvent = i5 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                    if ((i2 & 32) != 0) {
                                        jOnTransact = w0b.IAuthTabCallback.onTransact(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        i10 &= -458753;
                                    }
                                    graphicDeviceInfo3 = i6 != 0 ? null : graphicDeviceInfo;
                                    if (i8 != 0) {
                                        graphicDeviceInfo4 = graphicDeviceInfo3;
                                        gethumanreadablename4 = gethumanreadablename3;
                                        j8 = jOnNavigationEvent;
                                        j9 = jOnTransact;
                                        function04 = null;
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                        j10 = jOnTransact2;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(266744319, i10, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Selector (TitlePreset.kt:88)");
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    final Function0<Unit> function05 = function04;
                                    final getHumanReadableName gethumanreadablename5 = gethumanreadablename4;
                                    final long j11 = j10;
                                    final long j12 = j8;
                                    final GraphicDeviceInfo graphicDeviceInfo5 = graphicDeviceInfo4;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    final long j13 = j9;
                                    setThreadList.IAuthTabCallback(new onJavaCrashFilter("selector"), (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-2050744236, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.listheader.v3.TitlePreset$$ExternalSyntheticLambda0
                                        private static int IAuthTabCallback = 0;
                                        private static int onNavigationEvent = 1;

                                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                            int i28 = 2 % 2;
                                            int i29 = IAuthTabCallback + 57;
                                            onNavigationEvent = i29 % 128;
                                            int i30 = i29 % 2;
                                            Unit unitOnExtraCallback = areAllItemsEnabled.onExtraCallback(quirksExternalSyntheticBackport05, this, function05, gethumanreadablename5, j11, j12, graphicDeviceInfo5, hasprovider, j13, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                            int i31 = onNavigationEvent + 125;
                                            IAuthTabCallback = i31 % 128;
                                            if (i31 % 2 != 0) {
                                                int i32 = 26 / 0;
                                            }
                                            return unitOnExtraCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 30);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                    gethumanreadablename2 = gethumanreadablename4;
                                    j5 = j10;
                                    j6 = j8;
                                    j7 = j9;
                                    graphicDeviceInfo2 = graphicDeviceInfo4;
                                    function03 = function04;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i2 & 4) != 0) {
                                        i10 &= -897;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i10 &= -458753;
                                    }
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                    gethumanreadablename3 = gethumanreadablename;
                                    graphicDeviceInfo3 = graphicDeviceInfo;
                                    jOnTransact2 = j4;
                                    jOnNavigationEvent = j2;
                                }
                                graphicDeviceInfo4 = graphicDeviceInfo3;
                                gethumanreadablename4 = gethumanreadablename3;
                                j10 = jOnTransact2;
                                j8 = jOnNavigationEvent;
                                function04 = function02;
                                j9 = jOnTransact;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport04;
                                final Function0 function052 = function04;
                                final getHumanReadableName gethumanreadablename52 = gethumanreadablename4;
                                final long j112 = j10;
                                final long j122 = j8;
                                final GraphicDeviceInfo graphicDeviceInfo52 = graphicDeviceInfo4;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                final long j132 = j9;
                                setThreadList.IAuthTabCallback(new onJavaCrashFilter("selector"), (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(-2050744236, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.listheader.v3.TitlePreset$$ExternalSyntheticLambda0
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                        int i28 = 2 % 2;
                                        int i29 = IAuthTabCallback + 57;
                                        onNavigationEvent = i29 % 128;
                                        int i30 = i29 % 2;
                                        Unit unitOnExtraCallback = areAllItemsEnabled.onExtraCallback(quirksExternalSyntheticBackport052, this, function052, gethumanreadablename52, j112, j122, graphicDeviceInfo52, hasprovider, j132, (initSDK) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        int i31 = onNavigationEvent + 125;
                                        IAuthTabCallback = i31 % 128;
                                        if (i31 % 2 != 0) {
                                            int i32 = 26 / 0;
                                        }
                                        return unitOnExtraCallback;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196608, 30);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport062;
                                gethumanreadablename2 = gethumanreadablename4;
                                j5 = j10;
                                j6 = j8;
                                j7 = j9;
                                graphicDeviceInfo2 = graphicDeviceInfo4;
                                function03 = function04;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            gethumanreadablename2 = gethumanreadablename;
                            graphicDeviceInfo2 = graphicDeviceInfo;
                            j5 = j4;
                            j6 = j2;
                            long j14 = jOnTransact;
                            function03 = function02;
                            j7 = j14;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.v3.TitlePreset$$ExternalSyntheticLambda1
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                    int i28 = 2 % 2;
                                    int i29 = onNavigationEvent + 37;
                                    onWarmupCompleted = i29 % 128;
                                    int i30 = i29 % 2;
                                    Unit unitIAuthTabCallback = areAllItemsEnabled.IAuthTabCallback(this.f$0, hasprovider, quirksExternalSyntheticBackport02, gethumanreadablename2, j5, j6, j7, graphicDeviceInfo2, function03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i31 = onWarmupCompleted + 85;
                                    onNavigationEvent = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        int i32 = 55 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    function02 = function0;
                    i9 = i3;
                    int i28 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i28 % 128;
                    int i29 = i28 % 2;
                    if ((100663296 & i) == 0) {
                    }
                    i10 = i9;
                    if ((i10 & 38347923) != 38347922) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i3 |= i7;
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i3;
                int i282 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i282 % 128;
                int i292 = i282 % 2;
                if ((100663296 & i) == 0) {
                }
                i10 = i9;
                if ((i10 & 38347923) != 38347922) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            j4 = j;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i & 196608) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i3 |= i7;
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i3;
            int i2822 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2822 % 128;
            int i2922 = i2822 % 2;
            if ((100663296 & i) == 0) {
            }
            i10 = i9;
            if ((i10 & 38347923) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j4 = j;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i & 196608) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i3 |= i7;
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i3;
        int i28222 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i28222 % 128;
        int i29222 = i28222 % 2;
        if ((100663296 & i) == 0) {
        }
        i10 = i9;
        if ((i10 & 38347923) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        getHumanReadableName gethumanreadablename2;
        GraphicDeviceInfo graphicDeviceInfo2;
        Function0<Unit> function02;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i2 & 32) != 0) {
            int i5 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i2 & 64) != 0) {
            int i7 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 5;
            }
            function02 = null;
        } else {
            function02 = function0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1270830616, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Selector (TitlePreset.kt:131)");
                int i10 = 39 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1270830616, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.TitlePreset.Selector (TitlePreset.kt:131)");
            }
        }
        int i11 = i << 3;
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, gethumanreadablename2, jOnTransact, jOnNavigationEvent, 0L, graphicDeviceInfo2, function02, cameraCaptureResultEmptyCameraCaptureResult, (i & 65520) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 32);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(!(obj instanceof areAllItemsEnabled))) {
                return Intrinsics.areEqual(this.onNavigationEvent, ((areAllItemsEnabled) obj).onNavigationEvent);
            }
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return iHashCode;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted, -1940360804, iOnWarmupCompleted2, GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{useandconfigureprogramwithtexture}, 1940360805);
    }

    public final void onExtraCallbackWithResult(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), objArr, -1975818925);
    }
}
