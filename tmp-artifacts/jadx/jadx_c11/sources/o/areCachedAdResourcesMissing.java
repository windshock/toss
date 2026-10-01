package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.tmoney.a;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.areCachedAdResourcesMissing;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class areCachedAdResourcesMissing extends getTotalHorizontalSpacing {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final Integer onExtraCallback;

    public /* synthetic */ areCachedAdResourcesMissing(int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f);
    }

    public static /* synthetic */ Unit IAuthTabCallback(areCachedAdResourcesMissing arecachedadresourcesmissing, int i, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Integer num, InterfaceC0083handshake interfaceC0083handshake, hasProvider hasprovider, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(arecachedadresourcesmissing, i, f, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 41 / 0;
        }
        int i7 = onNavigationEvent + 43;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(useandconfigureprogramwithtexture);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(areCachedAdResourcesMissing arecachedadresourcesmissing, hasProvider hasprovider, long j, GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake interfaceC0083handshake, long j2, GraphicDeviceInfo graphicDeviceInfo2, getHumanReadableName gethumanreadablename, Integer num, int i, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 1;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return onWarmupCompleted(arecachedadresourcesmissing, hasprovider, j, graphicDeviceInfo, interfaceC0083handshake, j2, graphicDeviceInfo2, gethumanreadablename, num, i, f, quirksExternalSyntheticBackport0, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        }
        onWarmupCompleted(arecachedadresourcesmissing, hasprovider, j, graphicDeviceInfo, interfaceC0083handshake, j2, graphicDeviceInfo2, gethumanreadablename, num, i, f, quirksExternalSyntheticBackport0, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i6;
        int i9 = ~i6;
        int i10 = ~(i7 | i9);
        int i11 = ~i;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i | i9)) | (~(i7 | i11));
        int i14 = i2 + i6 + i3 + (417615942 * i5) + (566850886 * i4);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i2) + 147849216 + ((-2147356519) * i6) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i3) + ((-354418688) * i5) + ((-85983232) * i4) + ((-608960512) * i15);
        int i17 = (i2 * (-1357469509)) + 140661806 + (i6 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i3 * (-1357469401)) + (i5 * 1137340586) + (i4 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[1];
        areCachedAdResourcesMissing arecachedadresourcesmissing = (areCachedAdResourcesMissing) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
        Integer num = (Integer) objArr[6];
        InterfaceC0083handshake interfaceC0083handshake = (InterfaceC0083handshake) objArr[7];
        hasProvider hasprovider = (hasProvider) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(jLongValue, graphicDeviceInfo, arecachedadresourcesmissing, iIntValue, fFloatValue, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(areCachedAdResourcesMissing arecachedadresourcesmissing, hasProvider hasprovider, long j, GraphicDeviceInfo graphicDeviceInfo, InterfaceC0083handshake interfaceC0083handshake, long j2, GraphicDeviceInfo graphicDeviceInfo2, getHumanReadableName gethumanreadablename, Integer num, int i, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int iOnExtraCallbackWithResult;
        int iOnExtraCallbackWithResult2;
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 39;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(i3);
        } else {
            iOnExtraCallbackWithResult = RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1);
            iOnExtraCallbackWithResult2 = RecomposeScopeImplKt.onExtraCallbackWithResult(i3);
        }
        arecachedadresourcesmissing.onExtraCallbackWithResult(hasprovider, j, graphicDeviceInfo, interfaceC0083handshake, j2, graphicDeviceInfo2, gethumanreadablename, num, i, f, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, i4);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 35;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 75 / 0;
        }
        return unit;
    }

    private areCachedAdResourcesMissing(int i, float f) {
        super(i, f, null);
    }

    protected Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i2 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallbackWithResult implements Function1<useAndConfigureProgramWithTexture, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        onExtraCallbackWithResult() {
        }

        public final void onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((useAndConfigureProgramWithTexture) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(areCachedAdResourcesMissing arecachedadresourcesmissing, int i, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Integer num, InterfaceC0083handshake interfaceC0083handshake, hasProvider hasprovider, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        getHumanReadableName gethumanreadablenameOnWarmupCompleted;
        String str;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        int i4 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(543700980, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.Content.<anonymous>.<anonymous> (ListItemPreset.kt:64)");
            }
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = QuirkSettingsLoader.Companion.access000();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) getTotalHorizontalSpacing.IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 1850937832, -1850937830, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{arecachedadresourcesmissing, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 7, (Object) null), Integer.valueOf(i), Float.valueOf(f)});
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.post.v2.ListItemPreset$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 31;
                        onExtraCallbackWithResult = i6 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i6 % 2 == 0) {
                            return areCachedAdResourcesMissing.onExtraCallback(useandconfigureprogramwithtexture);
                        }
                        areCachedAdResourcesMissing.onExtraCallback(useandconfigureprogramwithtexture);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport03, true, (Function1) objOnMinimized).onExtraCallback(quirksExternalSyntheticBackport0);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedAccess000, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (num != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1163647648);
                gethumanreadablenameOnWarmupCompleted = ((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).onWarmupCompleted((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(maybeFireRemainingCompletionTrackers.onExtraCallbackWithResult()));
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1163757636);
                gethumanreadablenameOnWarmupCompleted = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            getHumanReadableName gethumanreadablename = gethumanreadablenameOnWarmupCompleted;
            if (((Boolean) getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), -124307517, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{Integer.valueOf(i)}, 124307524)).booleanValue()) {
                int i5 = IAuthTabCallback + 55;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1163918557);
                    int i6 = 22 / 0;
                    if (num != null) {
                        str = num + ".";
                    } else {
                        str = "∙";
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1163918557);
                    if (num != null) {
                    }
                }
                InterfaceC0083handshake interfaceC0083handshakeOnNavigationEvent = protocol.onNavigationEvent(interfaceC0083handshake) ^ true ? getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult.onNavigationEvent() : interfaceC0083handshake;
                if (num != null) {
                    int i7 = IAuthTabCallback + 3;
                    onNavigationEvent = i7 % 128;
                    i3 = i7 % 2 == 0 ? 93 : 24;
                } else {
                    i3 = 16;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i3), 0.0f, 2, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 11, (Object) null);
                if (num == null) {
                    int i8 = IAuthTabCallback;
                    int i9 = i8 + 5;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 1;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback3.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, onExtraCallbackWithResult.onNavigationEvent));
                        int i12 = 16 / 0;
                    } else {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback3.onExtraCallback(getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, onExtraCallbackWithResult.onNavigationEvent));
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnExtraCallback;
                } else {
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnExtraCallback3;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport02, gethumanreadablename, 0L, 0L, 0L, interfaceC0083handshakeOnNavigationEvent, null, createCameraCaptureCallback.onExtraCallback(num != null ? createCameraCaptureCallback.Companion.onExtraCallback() : createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 130744}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1164629418);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, null, null, 0L, 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallback + 119;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(long j, GraphicDeviceInfo graphicDeviceInfo, final areCachedAdResourcesMissing arecachedadresourcesmissing, final int i, final float f, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Integer num, final InterfaceC0083handshake interfaceC0083handshake, final hasProvider hasprovider, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1520237195, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.Content.<anonymous> (ListItemPreset.kt:60)");
                }
                maybeFireRemainingCompletionTrackers.onExtraCallbackWithResult(j, graphicDeviceInfo, ForwardingCameraControl.onExtraCallback(543700980, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListItemPreset$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallback + 39;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            areCachedAdResourcesMissing.IAuthTabCallback(this.f$0, i, f, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = areCachedAdResourcesMissing.IAuthTabCallback(this.f$0, i, f, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i8 = IAuthTabCallback + 65;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 83 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onNavigationEvent + 91;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                maybeFireRemainingCompletionTrackers.onExtraCallbackWithResult(j, graphicDeviceInfo, ForwardingCameraControl.onExtraCallback(543700980, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListItemPreset$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i62 = 2 % 2;
                        int i72 = onExtraCallback + 39;
                        IAuthTabCallback = i72 % 128;
                        if (i72 % 2 != 0) {
                            areCachedAdResourcesMissing.IAuthTabCallback(this.f$0, i, f, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = areCachedAdResourcesMissing.IAuthTabCallback(this.f$0, i, f, quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i8 = IAuthTabCallback + 65;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 83 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 5;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final hasProvider hasprovider, final long j, final GraphicDeviceInfo graphicDeviceInfo, final InterfaceC0083handshake interfaceC0083handshake, final long j2, final GraphicDeviceInfo graphicDeviceInfo2, final getHumanReadableName gethumanreadablename, final Integer num, final int i, final float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1115336986);
        if ((i2 & 6) == 0) {
            int i12 = IAuthTabCallback + 23;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 22 / 0;
                i10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider)) {
            }
            i5 = i10 | i2;
        } else {
            i5 = i2;
        }
        Object obj = null;
        if ((i2 & 48) == 0) {
            int i14 = onNavigationEvent + 75;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                int i15 = onNavigationEvent + 21;
                IAuthTabCallback = i15 % 128;
                i9 = i15 % 2 != 0 ? 28 : 32;
            } else {
                i9 = 16;
            }
            i5 |= i9;
        }
        if ((i2 & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceC0083handshake)) {
                int i16 = IAuthTabCallback + 79;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i5 |= i8;
        }
        if ((i2 & 24576) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            int i18 = IAuthTabCallback + 95;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ^ true) ? 536870912 : 268435456;
        }
        int i19 = i4 & 1024;
        if (i19 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            int i20 = IAuthTabCallback + 7;
            onNavigationEvent = i20 % 128;
            if (i20 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i6 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                int i21 = IAuthTabCallback + 9;
                onNavigationEvent = i21 % 128;
                i7 = i21 % 2 == 0 ? 65 : 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        int i22 = i6;
        if ((i5 & 306783379) == 306783378) {
            int i23 = onNavigationEvent + 59;
            IAuthTabCallback = i23 % 128;
            z = i23 % 2 == 0 ? (i22 & 19) != 18 : (i22 & 110) != 11;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1115336986, i5, i22, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.Content (ListItemPreset.kt:53)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onWarmupCompleted(gethumanreadablename.onWarmupCompleted((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())), j, 0L, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (getChildPreviewOutConfig) null, 0, 0, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 16777210, (Object) null), ForwardingCameraControl.onExtraCallback(1520237195, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListItemPreset$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onExtraCallbackWithResult + 95;
                    IAuthTabCallback = i25 % 128;
                    int i26 = i25 % 2;
                    long j3 = j2;
                    GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo2;
                    areCachedAdResourcesMissing arecachedadresourcesmissing = this;
                    int i27 = i;
                    float f2 = f;
                    int iIntValue = ((Integer) obj4).intValue();
                    Object[] objArr = {Long.valueOf(j3), graphicDeviceInfo3, arecachedadresourcesmissing, Integer.valueOf(i27), Float.valueOf(f2), quirksExternalSyntheticBackport04, num, interfaceC0083handshake, hasprovider, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) areCachedAdResourcesMissing.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1607196691, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1607196691);
                    int i28 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                    return unit;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListItemPreset$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onNavigationEvent + 55;
                    IAuthTabCallback = i25 % 128;
                    int i26 = i25 % 2;
                    Unit unitOnExtraCallbackWithResult = areCachedAdResourcesMissing.onExtraCallbackWithResult(this.f$0, hasprovider, j, graphicDeviceInfo, interfaceC0083handshake, j2, graphicDeviceInfo2, gethumanreadablename, num, i, f, quirksExternalSyntheticBackport02, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i27 = IAuthTabCallback + 125;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        GraphicDeviceInfo graphicDeviceInfo3;
        GraphicDeviceInfo graphicDeviceInfo4;
        Integer num2;
        int iOnNavigationEvent;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i4 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        Object obj = null;
        if ((i4 & 8) != 0) {
            int i6 = onNavigationEvent + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo;
        }
        long jOnTransact2 = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j2;
        if ((i4 & 32) != 0) {
            int i7 = onNavigationEvent + 115;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            graphicDeviceInfo4 = null;
        } else {
            graphicDeviceInfo4 = graphicDeviceInfo2;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        if ((i4 & 128) != 0) {
            Integer numOnExtraCallback = onExtraCallback();
            int i9 = IAuthTabCallback + 101;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            num2 = numOnExtraCallback;
        } else {
            num2 = num;
        }
        if ((i4 & 256) != 0) {
            int i11 = onNavigationEvent + 101;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            iOnNavigationEvent = onNavigationEvent();
        } else {
            iOnNavigationEvent = i;
        }
        float fOnExtraCallbackWithResult = (i4 & 512) != 0 ? onExtraCallbackWithResult() : f;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1176328802, i2, i3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItem (ListItemPreset.kt:111)");
        }
        int i12 = i2 >> 3;
        onExtraCallbackWithResult(hasprovider, jOnTransact, graphicDeviceInfo3, interfaceC0083handshakeIAuthTabCallback, jOnTransact2, graphicDeviceInfo4, AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor(), num2, iOnNavigationEvent, fOnExtraCallbackWithResult, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | 1572864 | (i12 & 112) | (i12 & 896) | ((i2 >> 9) & 7168) | (57344 & i2) | (458752 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192), (i12 & 14) | ((i3 << 3) & 112), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = IAuthTabCallback + 71;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        GraphicDeviceInfo graphicDeviceInfo3;
        int iOnNavigationEvent;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i4 & 2) != 0) {
            int i6 = IAuthTabCallback + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i4 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        Object obj = null;
        if ((i4 & 8) != 0) {
            int i8 = onNavigationEvent + 111;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo;
        }
        long jOnTransact2 = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j2;
        GraphicDeviceInfo graphicDeviceInfo4 = (i4 & 32) != 0 ? null : graphicDeviceInfo2;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        Integer numOnExtraCallback = (i4 & 128) != 0 ? onExtraCallback() : num;
        if ((i4 & 256) != 0) {
            int i9 = IAuthTabCallback + 25;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            iOnNavigationEvent = onNavigationEvent();
        } else {
            iOnNavigationEvent = i;
        }
        float fOnExtraCallbackWithResult = (i4 & 512) != 0 ? onExtraCallbackWithResult() : f;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-349195684, i2, i3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItem (ListItemPreset.kt:140)");
        }
        onWarmupCompleted(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, jOnTransact, graphicDeviceInfo3, jOnTransact2, graphicDeviceInfo4, interfaceC0083handshakeIAuthTabCallback, numOnExtraCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, i2 & 2147483632, i3 & 14, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jOnTransact;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        GraphicDeviceInfo graphicDeviceInfo;
        Integer numOnExtraCallback;
        int iOnNavigationEvent;
        areCachedAdResourcesMissing arecachedadresourcesmissing = (areCachedAdResourcesMissing) objArr[0];
        hasProvider hasprovider = (hasProvider) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[4];
        long jLongValue2 = ((Number) objArr[5]).longValue();
        GraphicDeviceInfo graphicDeviceInfo3 = (GraphicDeviceInfo) objArr[6];
        InterfaceC0083handshake interfaceC0083handshake = (InterfaceC0083handshake) objArr[7];
        Integer num = (Integer) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        float fFloatValue = ((Number) objArr[10]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int iIntValue3 = ((Number) objArr[13]).intValue();
        int iIntValue4 = ((Number) objArr[14]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((iIntValue4 & 2) != 0) {
            int i2 = IAuthTabCallback + 115;
            jOnTransact = jLongValue;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
                int i3 = 59 / 0;
            } else {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
        } else {
            jOnTransact = jLongValue;
            onextracallback = onextracallback2;
        }
        if ((iIntValue4 & 4) != 0) {
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue4 & 8) != 0) {
            int i6 = onNavigationEvent + 53;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            graphicDeviceInfo = null;
        } else {
            graphicDeviceInfo = graphicDeviceInfo2;
        }
        long jOnTransact2 = (iIntValue4 & 16) != 0 ? setByteOrder.Companion.onTransact() : jLongValue2;
        GraphicDeviceInfo graphicDeviceInfo4 = (iIntValue4 & 32) != 0 ? null : graphicDeviceInfo3;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (iIntValue4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        if ((iIntValue4 & 128) != 0) {
            int i8 = onNavigationEvent + 99;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            numOnExtraCallback = arecachedadresourcesmissing.onExtraCallback();
        } else {
            numOnExtraCallback = num;
        }
        if ((iIntValue4 & 256) != 0) {
            int i10 = IAuthTabCallback + 89;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            iOnNavigationEvent = arecachedadresourcesmissing.onNavigationEvent();
        } else {
            iOnNavigationEvent = iIntValue;
        }
        float fOnExtraCallbackWithResult = (iIntValue4 & 512) != 0 ? arecachedadresourcesmissing.onExtraCallbackWithResult() : fFloatValue;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(430069803, iIntValue2, iIntValue3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItemSmall (ListItemPreset.kt:168)");
        }
        int i12 = iIntValue2 >> 3;
        arecachedadresourcesmissing.onExtraCallbackWithResult(hasprovider, jOnTransact, graphicDeviceInfo, interfaceC0083handshakeIAuthTabCallback, jOnTransact2, graphicDeviceInfo4, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), numOnExtraCallback, iOnNavigationEvent, fOnExtraCallbackWithResult, onextracallback, cameraCaptureResultEmptyCameraCaptureResult, (i12 & 896) | (iIntValue2 & 14) | 1572864 | (i12 & 112) | ((iIntValue2 >> 9) & 7168) | (57344 & iIntValue2) | (458752 & iIntValue2) | (29360128 & iIntValue2) | (234881024 & iIntValue2) | (iIntValue2 & 1879048192), (i12 & 14) | ((iIntValue3 << 3) & 112), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        long jOnTransact;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 9;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i4 & 4) != 0) {
            int i8 = onNavigationEvent + 43;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        GraphicDeviceInfo graphicDeviceInfo3 = (i4 & 8) != 0 ? null : graphicDeviceInfo;
        long jOnTransact2 = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j2;
        GraphicDeviceInfo graphicDeviceInfo4 = (i4 & 32) != 0 ? null : graphicDeviceInfo2;
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        Integer numOnExtraCallback = (i4 & 128) != 0 ? onExtraCallback() : num;
        int iOnNavigationEvent = (i4 & 256) != 0 ? onNavigationEvent() : i;
        float fOnExtraCallbackWithResult = (i4 & 512) != 0 ? onExtraCallbackWithResult() : f;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 33;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1645912461, i2, i3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItemSmall (ListItemPreset.kt:197)");
        }
        Object obj = null;
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1980208549, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, Long.valueOf(jOnTransact), graphicDeviceInfo3, Long.valueOf(jOnTransact2), graphicDeviceInfo4, interfaceC0083handshakeIAuthTabCallback, numOnExtraCallback, Integer.valueOf(iOnNavigationEvent), Float.valueOf(fOnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(2147483632 & i2), Integer.valueOf(i3 & 14), 0}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1980208547);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        int i12 = onNavigationEvent + 45;
        IAuthTabCallback = i12 % 128;
        int i13 = i12 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        if (i13 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo3;
        long jOnTransact2;
        GraphicDeviceInfo graphicDeviceInfo4;
        int i5;
        float fOnExtraCallbackWithResult;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i4 & 2) != 0) {
            int i7 = onNavigationEvent + 31;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i4 & 4) != 0) {
            int i9 = IAuthTabCallback + 17;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i4 & 8) != 0) {
            int i11 = onNavigationEvent + 91;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo;
        }
        if ((i4 & 16) != 0) {
            int i13 = onNavigationEvent + 55;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            jOnTransact2 = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact2 = j2;
        }
        if ((i4 & 32) != 0) {
            int i15 = IAuthTabCallback + 69;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            graphicDeviceInfo4 = null;
        } else {
            graphicDeviceInfo4 = graphicDeviceInfo2;
        }
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (i4 & 64) != 0 ? InterfaceC0083handshake.Companion.IAuthTabCallback() : interfaceC0083handshake;
        Integer numOnExtraCallback = (i4 & 128) != 0 ? onExtraCallback() : num;
        if ((i4 & 256) != 0) {
            int i17 = onNavigationEvent + 11;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            int iOnNavigationEvent = onNavigationEvent();
            int i19 = onNavigationEvent + 107;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            i5 = iOnNavigationEvent;
        } else {
            i5 = i;
        }
        if ((i4 & 512) != 0) {
            int i21 = onNavigationEvent + 33;
            IAuthTabCallback = i21 % 128;
            if (i21 % 2 != 0) {
                onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fOnExtraCallbackWithResult = onExtraCallbackWithResult();
        } else {
            fOnExtraCallbackWithResult = f;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1645589041, i2, i3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItemXSmall (ListItemPreset.kt:225)");
        }
        int i22 = i2 >> 3;
        onExtraCallbackWithResult(hasprovider, jOnTransact, graphicDeviceInfo3, interfaceC0083handshakeIAuthTabCallback, jOnTransact2, graphicDeviceInfo4, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), numOnExtraCallback, i5, fOnExtraCallbackWithResult, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | ((i2 >> 9) & 7168) | (57344 & i2) | (458752 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192), (i22 & 14) | ((i3 << 3) & 112), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        areCachedAdResourcesMissing arecachedadresourcesmissing = (areCachedAdResourcesMissing) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        long jLongValue2 = ((Number) objArr[5]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[6];
        InterfaceC0083handshake interfaceC0083handshakeIAuthTabCallback = (InterfaceC0083handshake) objArr[7];
        Integer numOnExtraCallback = (Integer) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        float fFloatValue = ((Number) objArr[10]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int iIntValue3 = ((Number) objArr[13]).intValue();
        int iIntValue4 = ((Number) objArr[14]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        long jOnTransact = jLongValue;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue4 & 2) != 0) {
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            int i5 = IAuthTabCallback + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
        }
        if ((iIntValue4 & 4) != 0) {
            int i7 = onNavigationEvent + 119;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        GraphicDeviceInfo graphicDeviceInfo3 = (iIntValue4 & 8) != 0 ? null : graphicDeviceInfo;
        if ((iIntValue4 & 16) != 0) {
            int i9 = onNavigationEvent + 105;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            jLongValue2 = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue4 & 32) != 0) {
            int i10 = onNavigationEvent + 43;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 47 / 0;
            }
            graphicDeviceInfo2 = null;
        }
        if ((iIntValue4 & 64) != 0) {
            interfaceC0083handshakeIAuthTabCallback = InterfaceC0083handshake.Companion.IAuthTabCallback();
        }
        if ((iIntValue4 & 128) != 0) {
            int i12 = onNavigationEvent + 5;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 != 0) {
                arecachedadresourcesmissing.onExtraCallback();
                throw null;
            }
            numOnExtraCallback = arecachedadresourcesmissing.onExtraCallback();
        }
        if ((iIntValue4 & 256) != 0) {
            iIntValue = arecachedadresourcesmissing.onNavigationEvent();
        }
        if ((iIntValue4 & 512) != 0) {
            int i13 = IAuthTabCallback + 69;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            fFloatValue = arecachedadresourcesmissing.onExtraCallbackWithResult();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1204913581, iIntValue2, iIntValue3, "im.toss.tds.compose.component.atom.post.v2.ListItemPreset.ListItemXSmall (ListItemPreset.kt:254)");
        }
        arecachedadresourcesmissing.onExtraCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport0, jOnTransact, graphicDeviceInfo3, jLongValue2, graphicDeviceInfo2, interfaceC0083handshakeIAuthTabCallback, numOnExtraCallback, iIntValue, fFloatValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2 & 2147483632, iIntValue3 & 14, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = IAuthTabCallback + 65;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i16 = 12 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, GraphicDeviceInfo graphicDeviceInfo, areCachedAdResourcesMissing arecachedadresourcesmissing, int i, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Integer num, InterfaceC0083handshake interfaceC0083handshake, hasProvider hasprovider, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Long.valueOf(j), graphicDeviceInfo, arecachedadresourcesmissing, Integer.valueOf(i), Float.valueOf(f), quirksExternalSyntheticBackport0, num, interfaceC0083handshake, hasprovider, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1607196691, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1607196691);
    }

    public final void onExtraCallbackWithResult(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        Object[] objArr = {this, hasprovider, quirksExternalSyntheticBackport0, Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, interfaceC0083handshake, num, Integer.valueOf(i), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1980208549, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1980208547);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable InterfaceC0083handshake interfaceC0083handshake, @Nullable Integer num, int i, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, interfaceC0083handshake, num, Integer.valueOf(i), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 625404761, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -625404760);
    }
}
