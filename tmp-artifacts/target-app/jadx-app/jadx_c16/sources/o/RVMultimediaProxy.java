package o;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.home.feature.asset_home.activity.home.AssetInvestmentHomeActivity$IAuthTabCallback;
import im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBarKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.readFully;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda19;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVMultimediaProxy {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final x2ExternalSyntheticLambda19.IAuthTabCallback onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(int i, Function1 function1, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i, function1, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, Function1 function1, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setTaggedAddrCtrl settaggedaddrctrl, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(function0, function1, i, quirksExternalSyntheticBackport0, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 91;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(function1, i);
        }
        onNavigationEvent(function1, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onExtraCallbackWithResult(i, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, list, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, Function1 function1, int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setTaggedAddrCtrl settaggedaddrctrl, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(function0, function1, i, quirksExternalSyntheticBackport0, settaggedaddrctrl, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, function1, i, quirksExternalSyntheticBackport0, settaggedaddrctrl, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 35;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    static {
        RoundedCornerShape roundedCornerShapeOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
        x2ExternalSyntheticLambda19.onExtraCallback onextracallback = x2ExternalSyntheticLambda19.onExtraCallback.Uniform;
        RoundedCornerShape roundedCornerShapeOnWarmupCompleted2 = RoundedCornerShapeKt.onWarmupCompleted();
        Object obj = null;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 2, (Object) null);
        Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
        onWarmupCompleted = new x2ExternalSyntheticLambda19.IAuthTabCallback(roundedCornerShapeOnWarmupCompleted, deviceQuirksExternalSyntheticLambda0OnExtraCallback, false, onextracallback, roundedCornerShapeOnWarmupCompleted2, deviceQuirksExternalSyntheticLambda0OnExtraCallback2, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()));
        int i = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(int i, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        List listListOf;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if ((i2 & 6) == 0) {
            int i6 = onNavigationEvent + 113;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 99 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 83;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1869963547, i3, -1, "im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBar.<anonymous>.<anonymous> (AssetInvestmentHomeTopBar.kt:64)");
                    int i9 = 33 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1869963547, i3, -1, "im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBar.<anonymous>.<anonymous> (AssetInvestmentHomeTopBar.kt:64)");
                }
            }
            x2ExternalSyntheticLambda2 x2externalsyntheticlambda2 = (x2ExternalSyntheticLambda2) CollectionsKt.getOrNull(list, i);
            if (x2externalsyntheticlambda2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1936936536);
                x2ExternalSyntheticLambda17 x2externalsyntheticlambda17 = x2ExternalSyntheticLambda17.IAuthTabCallback;
                x2ExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback = onWarmupCompleted;
                toMetersPerSecond tometerspersecondOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = x2externalsyntheticlambda17.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, x2externalsyntheticlambda2);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
                readFully.onExtraCallback onextracallback = readFully.Companion;
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1937368645);
                    listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), 0.05f)), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())});
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1937524854);
                    listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel()), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())});
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                x2externalsyntheticlambda17.onWarmupCompleted(tometerspersecondOnExtraCallbackWithResult, ensureNavButtonView.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, fIAuthTabCallback, readFully.onExtraCallback.onWarmupCompleted(onextracallback, listListOf, 0.0f, 0.0f, 0, 14, (Object) null), iAuthTabCallback.onExtraCallbackWithResult()), 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 4);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1937833149);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onNavigationEvent + 59;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
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

    private static final Unit onNavigationEvent(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            function1.invoke(Integer.valueOf(i));
            return Unit.INSTANCE;
        }
        function1.invoke(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBarKt$$ExternalSyntheticLambda0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(int i, Function1 function1, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        long jOnUnminimized;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = onExtraCallback + 31;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(x2externalsyntheticlambda21)) {
                int i9 = onExtraCallback + 59;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                int i11 = onExtraCallback + 89;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                i4 = 2;
            }
            i3 = i2 | i4;
        } else {
            i3 = i2;
        }
        int i13 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-908443642, i3, -1, "im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBar.<anonymous>.<anonymous> (AssetInvestmentHomeTopBar.kt:85)");
            }
            Iterator it = AssetInvestmentHomeActivity$IAuthTabCallback.getEntries().iterator();
            int i14 = 0;
            for (int i15 = 1; it.hasNext() == i15; i15 = i15) {
                int i16 = onNavigationEvent + 113;
                onExtraCallback = i16 % 128;
                int i17 = i16 % i5;
                Object next = it.next();
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(((AssetInvestmentHomeActivity$IAuthTabCallback) next).getTabNameStringRes(), cameraCaptureResultEmptyCameraCaptureResult2, i13);
                ?? r3 = (i14 == i ? i13 : i15) ^ 1;
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
                if (((((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue() ? 1 : 0) ^ i15) != i15) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-419048997);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-419048037);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onUnminimized();
                }
                long j = jOnUnminimized;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i18 = onNavigationEvent + 15;
                onExtraCallback = i18 % 128;
                int i19 = i18 % i5;
                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f), 0.0f, i5, (Object) null);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i14);
                Function0 function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    int i20 = onExtraCallback + 87;
                    onNavigationEvent = i20 % 128;
                    if (i20 % i5 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        function0OnMinimized = new AssetInvestmentHomeTopBarKt$.ExternalSyntheticLambda0(function1, i14);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((Object) function0OnMinimized);
                    }
                }
                x2externalsyntheticlambda21.IAuthTabCallback(strOnExtraCallback, (boolean) r3, function0OnMinimized, quirksExternalSyntheticBackport0OnExtraCallback, false, jLongValue, graphicDeviceInfoOnExtraCallbackWithResult, j, graphicDeviceInfoIAuthTabCallbackStub, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult, 102239232, (i3 << 3) & 112, 1552);
                i14++;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                i13 = i13;
                i3 = i3;
                i5 = i5;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i21 = onExtraCallback + 55;
                onNavigationEvent = i21 % 128;
                int i22 = i21 % i5;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull Function0<Unit> function0, @NotNull Function1<? super Integer, Unit> function1, int i, @NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super switchUserLoginRpc, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-861786912);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = onExtraCallback + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1))) {
                int i9 = onExtraCallback + 89;
                onNavigationEvent = i9 % 128;
                i5 = i9 % 2 != 0 ? 8 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        Object obj = null;
        if ((i2 & 384) == 0) {
            int i10 = onExtraCallback + 7;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            int i11 = onNavigationEvent + 85;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl)) {
                int i12 = onExtraCallback + 87;
                onNavigationEvent = i12 % 128;
                i4 = i12 % 2 != 0 ? 32098 : 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i13 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 9363) != 9362, i13 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onNavigationEvent + 61;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-861786912, i13, -1, "im.toss.features.home.feature.asset_home.compose.home.AssetInvestmentHomeTopBar (AssetInvestmentHomeTopBar.kt:51)");
            }
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
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
            MaxAdViewAdapterListener.onWarmupCompleted(function0, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i13 & 14, 254);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            int i16 = i13 >> 6;
            x2ExternalSyntheticLambda22.onNavigationEvent(i, highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, onextracallbackwithresult.onExtraCallback()), onWarmupCompleted, ForwardingCameraControl.onExtraCallback(-1869963547, true, new AssetInvestmentHomeTopBarKt$.ExternalSyntheticLambda1(i), cameraCaptureResultEmptyCameraCaptureResult2, 54), (DeviceQuirksExternalSyntheticLambda0) null, (x2ExternalSyntheticLambda19.onWarmupCompleted) null, ForwardingCameraControl.onExtraCallback(-908443642, true, new AssetInvestmentHomeTopBarKt$.ExternalSyntheticLambda2(i, function1), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, (i16 & 14) | 1576320, 48);
            settaggedaddrctrl.invoke(highSpeedResolverExternalSyntheticLambda1, switchUserLoginRpc.onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((switchUserLoginRpc.IAuthTabCallback << 3) | 6 | (i16 & 896)));
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetInvestmentHomeTopBarKt$.ExternalSyntheticLambda3(function0, function1, i, quirksExternalSyntheticBackport0, settaggedaddrctrl, i2));
        }
    }
}
