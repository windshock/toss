package o;

import android.content.Context;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.tds.compose.component.atom.asset.v2.ContentPreset$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getHumanReadableName;
import o.handleNativeAdClick;
import o.hasProvider;
import o.setAutoCaptured;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda0 implements HighSpeedResolverExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final HighSpeedResolverExternalSyntheticLambda2 onNavigationEvent;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[deprecated_eventListenerFactory.values().length];
            try {
                iArr[deprecated_eventListenerFactory.IconFill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[deprecated_eventListenerFactory.LogoFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[deprecated_eventListenerFactory.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[deprecated_eventListenerFactory.Lottie.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[deprecated_eventListenerFactory.Unresolved.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[handleNativeAdClick.onWarmupCompleted.values().length];
            try {
                iArr2[handleNativeAdClick.onWarmupCompleted.Fill.ordinal()] = 1;
                int i = onExtraCallback + 61;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 3 / 2;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[handleNativeAdClick.onWarmupCompleted.Auto.ordinal()] = 2;
                int i4 = IAuthTabCallback + 11;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            onWarmupCompleted = iArr2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[0];
        Object obj = objArr[1];
        deprecated_eventListenerFactory deprecated_eventlistenerfactory = (deprecated_eventListenerFactory) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        long jLongValue = ((Number) objArr[4]).longValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        float fFloatValue = ((Number) objArr[6]).floatValue();
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted = (handleNativeAdClick.onWarmupCompleted) objArr[7];
        String str = (String) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, jLongValue, iIntValue, fFloatValue, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue2), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, deprecated_followRedirects deprecated_followredirects, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 39;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda0, deprecated_followredirects, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallback + 109;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 3 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, Object obj, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 115;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        appLovinNativeAdImplExternalSyntheticLambda0.IAuthTabCallback(obj, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 55;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, String str, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 89;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(str, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 15;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~((~i5) | i4 | i);
        int i8 = ~((~i4) | i5);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i5));
        int i11 = ~(i9 | i4);
        int i12 = i5 + i4 + i6 + ((-1568348280) * i3) + (1617068012 * i2);
        int i13 = i12 * i12;
        int i14 = (i5 * (-973781596)) + 539565670 + (i4 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + ((-973780651) * i6) + (424585256 * i3) + (537576796 * i2) + (i13 * 1078394880);
        int i15 = (((-430874860) * i5) - 739508224) + (1544986862 * i4) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i6) + ((-1885339648) * i3) + (1743781888 * i2) + (858456064 * i13) + (i14 * i14 * 192741376);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = (AppLovinNativeAdImplExternalSyntheticLambda0) objArr[0];
            Object obj = objArr[1];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
            long jLongValue = ((Number) objArr[3]).longValue();
            int iIntValue = ((Number) objArr[4]).intValue();
            float fFloatValue = ((Number) objArr[5]).floatValue();
            handleNativeAdClick.onWarmupCompleted onwarmupcompleted = (handleNativeAdClick.onWarmupCompleted) objArr[6];
            String str = (String) objArr[7];
            int iIntValue2 = ((Number) objArr[8]).intValue();
            int iIntValue3 = ((Number) objArr[9]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
            int iIntValue4 = ((Number) objArr[11]).intValue();
            int i16 = 2 % 2;
            int i17 = IAuthTabCallback + 105;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            Unit unitOnExtraCallback = onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda0, obj, quirksExternalSyntheticBackport0, jLongValue, iIntValue, fFloatValue, onwarmupcompleted, str, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
            int i19 = onWarmupCompleted + 87;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            return unitOnExtraCallback;
        }
        if (i15 != 3) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
            hasProvider hasprovider = (hasProvider) objArr[1];
            getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
            long jLongValue2 = ((Number) objArr[3]).longValue();
            long jLongValue3 = ((Number) objArr[4]).longValue();
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
            int iIntValue5 = ((Number) objArr[7]).intValue();
            int i21 = 2 % 2;
            int i22 = onWarmupCompleted + 15;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            Unit unit = (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1311683681, new Object[]{quirksExternalSyntheticBackport02, hasprovider, gethumanreadablename, Long.valueOf(jLongValue2), Long.valueOf(jLongValue3), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(iIntValue5)}, 1311683684, setAutoCaptured.onExtraCallbackWithResult());
            int i24 = IAuthTabCallback + 35;
            onWarmupCompleted = i24 % 128;
            int i25 = i24 % 2;
            return unit;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) objArr[0];
        hasProvider hasprovider2 = (hasProvider) objArr[1];
        getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[2];
        long jLongValue4 = ((Number) objArr[3]).longValue();
        long jLongValue5 = ((Number) objArr[4]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue6 = ((Number) objArr[7]).intValue();
        int i26 = 2 % 2;
        if (!(!cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue6 & 3) != 2, iIntValue6 & 1))) {
            int i27 = IAuthTabCallback + 9;
            onWarmupCompleted = i27 % 128;
            int i28 = i27 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i29 = IAuthTabCallback + 25;
                onWarmupCompleted = i29 % 128;
                int i30 = i29 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1544424416, iIntValue6, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Text.<anonymous> (ContentPreset.kt:228)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, (QuirkSettingsLoader.onNavigationEvent) null, true, 1, (Object) null), gethumanreadablename2, jLongValue4, jLongValue5, 0L, null, 1, null, 0.0f, null, null, null, 0L, AppLovinVastMediaViewf.Companion.onExtraCallbackWithResult(), false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult3, 12582912, 24576, 180064);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
            int i31 = onWarmupCompleted + 21;
            IAuthTabCallback = i31 % 128;
            int i32 = i31 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, int i, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i2, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 71;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda0, i, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i2, f, onwarmupcompleted, str, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        }
        onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda0, i, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i2, f, onwarmupcompleted, str, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, Object obj, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 23;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda0, obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), onwarmupcompleted, str, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
            return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -821894766, objArr, 821894767, setAutoCaptured.onExtraCallbackWithResult());
        }
        Object[] objArr2 = {appLovinNativeAdImplExternalSyntheticLambda0, obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), onwarmupcompleted, str, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int i7 = 7 / 0;
        return (Unit) onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -821894766, objArr2, 821894767, setAutoCaptured.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, String str, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 49;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallback = onExtraCallback(appLovinNativeAdImplExternalSyntheticLambda0, str, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onWarmupCompleted + 91;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, int i, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i2, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 87;
        IAuthTabCallback = i7 % 128;
        appLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(i, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i2, f, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, i7 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), i4);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 23;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, deprecated_followRedirects deprecated_followredirects, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 1;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallback(deprecated_followredirects, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            appLovinNativeAdImplExternalSyntheticLambda0.onExtraCallback(deprecated_followredirects, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, j, i, f, onwarmupcompleted, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, gethumanreadablename, j, j2, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, str, gethumanreadablename, j, j2, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (i3 != 0) {
            this.onNavigationEvent.onExtraCallbackWithResult(quirksExternalSyntheticBackport0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(quirksExternalSyntheticBackport0);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader quirkSettingsLoader) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(quirkSettingsLoader, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted(quirksExternalSyntheticBackport0, quirkSettingsLoader);
        int i4 = IAuthTabCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnWarmupCompleted;
        }
        throw null;
    }

    public AppLovinNativeAdImplExternalSyntheticLambda0(@NotNull HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        this.onNavigationEvent = highSpeedResolverExternalSyntheticLambda2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        long j2;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        String str2;
        boolean z;
        final float f3;
        final long j3;
        final int i10;
        final handleNativeAdClick.onWarmupCompleted onwarmupcompleted2;
        final String str3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float f4;
        String str4;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1889777413);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i14 = onWarmupCompleted + 9;
            IAuthTabCallback = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                j2 = j;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                int i16 = IAuthTabCallback + 83;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                    int i17 = IAuthTabCallback + 103;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                int i19 = onWarmupCompleted + 55;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    f2 = f;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    int i21 = IAuthTabCallback + 79;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 131072 : 65536;
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                    if ((1572864 & i2) == 0) {
                        str2 = str;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        int i23 = onWarmupCompleted + 97;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                            int i25 = onWarmupCompleted + 1;
                            IAuthTabCallback = i25 % 128;
                            int i26 = i25 % 2;
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    if ((4793491 & i4) == 4793490) {
                        int i27 = onWarmupCompleted + 81;
                        IAuthTabCallback = i27 % 128;
                        z = i27 % 2 != 0;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        f3 = f2;
                        j3 = j2;
                        i10 = i;
                        onwarmupcompleted2 = onwarmupcompleted;
                        str3 = str2;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        long jOnTransact = i15 != 0 ? setByteOrder.Companion.onTransact() : j2;
                        int i28 = i5 == 0 ? i : 1;
                        if (i7 != 0) {
                            int i29 = onWarmupCompleted + 109;
                            IAuthTabCallback = i29 % 128;
                            f4 = i29 % 2 == 0 ? 2.0f : 1.0f;
                        } else {
                            f4 = f2;
                        }
                        handleNativeAdClick.onWarmupCompleted onwarmupcompleted3 = i8 != 0 ? handleNativeAdClick.onWarmupCompleted.Auto : onwarmupcompleted;
                        if (i9 != 0) {
                            int i30 = IAuthTabCallback + 49;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1889777413, i4, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Resource (ContentPreset.kt:58)");
                        }
                        int i32 = i4 << 3;
                        onNavigationEvent(obj, deprecated_eventListenerFactory.Unresolved, quirksExternalSyntheticBackport03, jOnTransact, i28, f4, onwarmupcompleted3, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | 48 | (i32 & 896) | (i32 & 7168) | (57344 & i32) | (458752 & i32) | (3670016 & i32) | (29360128 & i32) | (i32 & 234881024), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        i10 = i28;
                        str3 = str4;
                        j3 = jOnTransact;
                        f3 = f4;
                        onwarmupcompleted2 = onwarmupcompleted3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i33 = 2 % 2;
                                int i34 = onNavigationEvent + 31;
                                IAuthTabCallback = i34 % 128;
                                int i35 = i34 % 2;
                                AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0 = this.f$0;
                                Object obj4 = obj;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                long j4 = j3;
                                int i36 = i10;
                                float f5 = f3;
                                handleNativeAdClick.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
                                String str5 = str3;
                                int i37 = i2;
                                int i38 = i3;
                                int iIntValue = ((Integer) obj3).intValue();
                                Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda0, obj4, quirksExternalSyntheticBackport04, Long.valueOf(j4), Integer.valueOf(i36), Float.valueOf(f5), onwarmupcompleted4, str5, Integer.valueOf(i37), Integer.valueOf(i38), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
                                Unit unit = (Unit) AppLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1691012618, objArr, -1691012616, iOnExtraCallbackWithResult2);
                                int i39 = onNavigationEvent + 43;
                                IAuthTabCallback = i39 % 128;
                                int i40 = i39 % 2;
                                return unit;
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                str2 = str;
                if ((i2 & 12582912) == 0) {
                }
                if ((4793491 & i4) == 4793490) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            f2 = f;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            str2 = str;
            if ((i2 & 12582912) == 0) {
            }
            if ((4793491 & i4) == 4793490) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        j2 = j;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        f2 = f;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        str2 = str;
        if ((i2 & 12582912) == 0) {
        }
        if ((4793491 & i4) == 4793490) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a A[PHI: r7
      0x011a: PHI (r7v3 int) = (r7v2 int), (r7v30 int), (r7v31 int) binds: [B:76:0x00fd, B:85:0x0118, B:84:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(final int i, @NotNull final deprecated_eventListenerFactory deprecated_eventlistenerfactory, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i2, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final String str2;
        final int i13;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j2;
        final float f2;
        final handleNativeAdClick.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i14;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(123694212);
        if ((i3 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i16 = IAuthTabCallback + 45;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deprecated_eventlistenerfactory.ordinal()) ? 32 : 16;
        }
        int i18 = i4 & 4;
        if (i18 != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    int i19 = onWarmupCompleted + 105;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    i5 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 != 0) {
                        if ((i3 & 196608) == 0) {
                            int i21 = IAuthTabCallback + 111;
                            onWarmupCompleted = i21 % 128;
                            int i22 = i21 % 2;
                            i9 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 131072 : 65536) | i5;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            int i23 = onWarmupCompleted + 123;
                            IAuthTabCallback = i23 % 128;
                            int i24 = i23 % 2;
                            i9 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        int i25 = 12582912;
                        if (i11 != 0) {
                            i9 |= i25;
                        } else if ((12582912 & i3) == 0) {
                            int i26 = onWarmupCompleted + 89;
                            IAuthTabCallback = i26 % 128;
                            if (i26 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            i25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 8388608 : 4194304;
                            i9 |= i25;
                        }
                        if ((100663296 & i3) == 0) {
                            int i27 = onWarmupCompleted + 25;
                            IAuthTabCallback = i27 % 128;
                            if (i27 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this);
                                throw null;
                            }
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                        }
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) != 38347922, i9 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            j2 = j;
                            i13 = i2;
                            f2 = f;
                            onwarmupcompleted2 = onwarmupcompleted;
                            str2 = str;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        } else {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            long jOnTransact = i6 != 0 ? setByteOrder.Companion.onTransact() : j;
                            if (i7 == 0) {
                                int i28 = onWarmupCompleted + 67;
                                IAuthTabCallback = i28 % 128;
                                int i29 = i28 % 2;
                                i12 = i2;
                            } else {
                                i12 = 1;
                            }
                            float f3 = i8 != 0 ? 1.0f : f;
                            handleNativeAdClick.onWarmupCompleted onwarmupcompleted3 = i10 != 0 ? handleNativeAdClick.onWarmupCompleted.Auto : onwarmupcompleted;
                            String str3 = i11 != 0 ? null : str;
                            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(123694212, i9, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Resource (ContentPreset.kt:81)");
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            onNavigationEvent(deprecated_followSslRedirects.onWarmupCompleted(i), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport03, jOnTransact, i12, f3, onwarmupcompleted3, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9 & 268435440, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            str2 = str3;
                            i13 = i12;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            j2 = jOnTransact;
                            f2 = f3;
                            onwarmupcompleted2 = onwarmupcompleted3;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda6
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i30 = 2 % 2;
                                    int i31 = IAuthTabCallback + 107;
                                    onExtraCallback = i31 % 128;
                                    int i32 = i31 % 2;
                                    Unit unitOnExtraCallbackWithResult = AppLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0, i, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport02, j2, i13, f2, onwarmupcompleted2, str2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i33 = IAuthTabCallback + 67;
                                    onExtraCallback = i33 % 128;
                                    if (i33 % 2 == 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    i9 = i5;
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    int i252 = 12582912;
                    if (i11 != 0) {
                    }
                    if ((100663296 & i3) == 0) {
                    }
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) != 38347922, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                }
                i9 = i5;
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                int i2522 = 12582912;
                if (i11 != 0) {
                }
                if ((100663296 & i3) == 0) {
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) != 38347922, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i5;
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            int i25222 = 12582912;
            if (i11 != 0) {
            }
            if ((100663296 & i3) == 0) {
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) != 38347922, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i5;
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        int i252222 = 12582912;
        if (i11 != 0) {
        }
        if ((100663296 & i3) == 0) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) != 38347922, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @NotNull deprecated_eventListenerFactory deprecated_eventlistenerfactory, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        long jOnTransact;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str3;
        float f3;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str4;
        int i17;
        int i18;
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1448226038);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i20 = IAuthTabCallback + 31;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                i18 = 4;
            } else {
                i18 = 2;
            }
            i4 = i18 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deprecated_eventlistenerfactory.ordinal()) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 128 : 256;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
                jOnTransact = j;
            } else {
                jOnTransact = j;
                if ((i2 & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnTransact) ? 2048 : 1024;
                }
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                int i23 = onWarmupCompleted + 43;
                IAuthTabCallback = i23 % 128;
                i4 = i23 % 2 == 0 ? i4 | 21361 : i4 | 24576;
            } else if ((i2 & 24576) == 0) {
                int i24 = onWarmupCompleted + 15;
                IAuthTabCallback = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 91 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                        int i26 = onWarmupCompleted + 71;
                        IAuthTabCallback = i26 % 128;
                        i7 = i26 % 2 == 0 ? 7320 : 16384;
                    } else {
                        i7 = 8192;
                    }
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 == 0) {
                i4 |= 196608;
                int i27 = onWarmupCompleted + 89;
                IAuthTabCallback = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 3 % 4;
                }
            } else {
                if ((i2 & 196608) == 0) {
                    f2 = f;
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                        i9 = 65536;
                    } else {
                        int i29 = IAuthTabCallback + 65;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 != 0) {
                            throw null;
                        }
                        i9 = 131072;
                    }
                    i10 = i9 | i4;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    i10 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 1048576 : 524288;
                }
                i12 = i3 & 128;
                if (i12 == 0) {
                    if ((i2 & 12582912) == 0) {
                        int i30 = onWarmupCompleted + 43;
                        IAuthTabCallback = i30 % 128;
                        if (i30 % 2 == 0) {
                            int i31 = 47 / 0;
                            i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 8388608 : 4194304;
                        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                        }
                        i14 = i13 | i10;
                    }
                    if ((100663296 & i2) != 0) {
                        i15 = 1;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                            i17 = 33554432;
                        } else {
                            int i32 = onWarmupCompleted + 13;
                            IAuthTabCallback = i32 % 128;
                            if (i32 % 2 == 0) {
                                int i33 = 72 / 0;
                            }
                            i17 = 67108864;
                        }
                        i14 |= i17;
                    } else {
                        i15 = 1;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i14) == 38347922 ? i15 : 0, i14 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        i16 = i;
                        str3 = str2;
                        f3 = f2;
                        j2 = jOnTransact;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        onwarmupcompleted2 = onwarmupcompleted;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i22 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i5 != 0) {
                            jOnTransact = setByteOrder.Companion.onTransact();
                        }
                        int i34 = i6 == 0 ? i : i15;
                        if (i8 != 0) {
                            f2 = 1.0f;
                        }
                        handleNativeAdClick.onWarmupCompleted onwarmupcompleted3 = i11 != 0 ? handleNativeAdClick.onWarmupCompleted.Auto : onwarmupcompleted;
                        if (i12 != 0) {
                            int i35 = onWarmupCompleted + 65;
                            IAuthTabCallback = i35 % 128;
                            if (i35 % 2 == 0) {
                                throw null;
                            }
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1448226038, i14, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Resource (ContentPreset.kt:104)");
                        }
                        onNavigationEvent(deprecated_followSslRedirects.onExtraCallback(str), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport04, jOnTransact, i34, f2, onwarmupcompleted3, str4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14 & 268435440, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onwarmupcompleted2 = onwarmupcompleted3;
                        f3 = f2;
                        str3 = str4;
                        i16 = i34;
                        j2 = jOnTransact;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ContentPreset$.ExternalSyntheticLambda5(this, str, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport03, j2, i16, f3, onwarmupcompleted2, str3, i2, i3));
                        return;
                    }
                    return;
                }
                i10 |= 12582912;
                i14 = i10;
                if ((100663296 & i2) != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i14) == 38347922 ? i15 : 0, i14 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            f2 = f;
            i10 = i4;
            i11 = i3 & 64;
            if (i11 != 0) {
            }
            i12 = i3 & 128;
            if (i12 == 0) {
            }
            i14 = i10;
            if ((100663296 & i2) != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i14) == 38347922 ? i15 : 0, i14 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        f2 = f;
        i10 = i4;
        i11 = i3 & 64;
        if (i11 != 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i14 = i10;
        if ((100663296 & i2) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i14) == 38347922 ? i15 : 0, i14 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final deprecated_followRedirects deprecated_followredirects, @NotNull final deprecated_eventListenerFactory deprecated_eventlistenerfactory, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i12;
        final float f2;
        final long j3;
        final handleNativeAdClick.onWarmupCompleted onwarmupcompleted2;
        final String str2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i13;
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted3;
        int i14;
        int i15;
        int i16 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1050978677);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects)) {
                int i17 = onWarmupCompleted + 41;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                i15 = 4;
            } else {
                i15 = 2;
            }
            i4 = i15 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deprecated_eventlistenerfactory.ordinal()) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
            int i20 = IAuthTabCallback + 125;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
        } else {
            if ((i2 & 384) == 0) {
                i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    j2 = j;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                        int i22 = IAuthTabCallback + 5;
                        onWarmupCompleted = i22 % 128;
                        int i23 = i22 % 2;
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i7 = i6 | i4;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i7 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    int i24 = onWarmupCompleted + 75;
                    IAuthTabCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i7 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 8192 : 16384;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 131072 : 65536;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        int i25 = IAuthTabCallback + 93;
                        onWarmupCompleted = i25 % 128;
                        int i26 = i25 % 2;
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 1048576 : 524288;
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        if ((12582912 & i2) == 0) {
                            int i27 = onWarmupCompleted + 75;
                            IAuthTabCallback = i27 % 128;
                            if (i27 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                                throw null;
                            }
                            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true ? 4194304 : 8388608) | i7;
                        }
                        if ((i2 & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                                int i28 = onWarmupCompleted + 125;
                                IAuthTabCallback = i28 % 128;
                                int i29 = i28 % 2;
                                i14 = 67108864;
                            } else {
                                i14 = 33554432;
                            }
                            i7 |= i14;
                        }
                        if ((38347923 & i7) != 38347922) {
                            int i30 = IAuthTabCallback + 7;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i19 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            long jOnTransact = i5 != 0 ? setByteOrder.Companion.onTransact() : j2;
                            if (i8 != 0) {
                                int i32 = onWarmupCompleted + 73;
                                IAuthTabCallback = i32 % 128;
                                int i33 = i32 % 2;
                                i13 = 1;
                            } else {
                                i13 = i;
                            }
                            float f3 = i9 != 0 ? 1.0f : f;
                            if (i10 != 0) {
                                int i34 = onWarmupCompleted + 41;
                                IAuthTabCallback = i34 % 128;
                                int i35 = i34 % 2;
                                onwarmupcompleted3 = handleNativeAdClick.onWarmupCompleted.Auto;
                            } else {
                                onwarmupcompleted3 = onwarmupcompleted;
                            }
                            String str3 = i11 != 0 ? null : str;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1050978677, i7, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Resource (ContentPreset.kt:127)");
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            onNavigationEvent(deprecated_followredirects, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport03, jOnTransact, i13, f3, onwarmupcompleted3, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7 & 268435454, 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            i12 = i13;
                            onwarmupcompleted2 = onwarmupcompleted3;
                            str2 = str3;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            j3 = jOnTransact;
                            f2 = f3;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            i12 = i;
                            f2 = f;
                            j3 = j2;
                            onwarmupcompleted2 = onwarmupcompleted;
                            str2 = str;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda3
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i36 = 2 % 2;
                                    int i37 = IAuthTabCallback + 43;
                                    onExtraCallback = i37 % 128;
                                    int i38 = i37 % 2;
                                    Unit unitIAuthTabCallback = AppLovinNativeAdImplExternalSyntheticLambda0.IAuthTabCallback(this.f$0, deprecated_followredirects, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport02, j3, i12, f2, onwarmupcompleted2, str2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i39 = onExtraCallback + 83;
                                    IAuthTabCallback = i39 % 128;
                                    if (i39 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 12582912;
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((38347923 & i7) != 38347922) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((38347923 & i7) != 38347922) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            j2 = j;
            i7 = i4;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((38347923 & i7) != 38347922) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        j2 = j;
        i7 = i4;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((38347923 & i7) != 38347922) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final Object obj, @NotNull final deprecated_eventListenerFactory deprecated_eventlistenerfactory, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, @Nullable handleNativeAdClick.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        int i9;
        int iOrdinal;
        int i10;
        final int i11;
        final float f2;
        handleNativeAdClick.onWarmupCompleted onwarmupcompleted2;
        String str2;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        String str3;
        deprecated_eventListenerFactory deprecated_eventlistenerfactory2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback2;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-142127577);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deprecated_eventlistenerfactory.ordinal()) ^ true) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i14 = IAuthTabCallback + 79;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    j2 = j;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    int i16 = IAuthTabCallback + 71;
                    onWarmupCompleted = i16 % 128;
                    i4 = i16 % 2 != 0 ? i4 | 4277 : i4 | 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (onwarmupcompleted == null) {
                            int i17 = IAuthTabCallback + 85;
                            onWarmupCompleted = i17 % 128;
                            if (i17 % 2 != 0) {
                                int i18 = 13 / 0;
                            }
                            iOrdinal = -1;
                        } else {
                            iOrdinal = onwarmupcompleted.ordinal();
                        }
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                        if ((12582912 & i2) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            int i19 = onWarmupCompleted + 53;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                            if (i13 != 0) {
                                int i21 = onWarmupCompleted + 11;
                                IAuthTabCallback = i21 % 128;
                                if (i21 % 2 == 0) {
                                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                    int i22 = 14 / 0;
                                } else {
                                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                }
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            }
                            long jOnTransact = i6 != 0 ? setByteOrder.Companion.onTransact() : j2;
                            int i23 = i7 != 0 ? 1 : i;
                            float f3 = i8 != 0 ? 1.0f : f;
                            onwarmupcompleted2 = i9 != 0 ? handleNativeAdClick.onWarmupCompleted.Auto : onwarmupcompleted;
                            if (i10 != 0) {
                                int i24 = IAuthTabCallback + 17;
                                onWarmupCompleted = i24 % 128;
                                int i25 = i24 % 2;
                                str3 = null;
                            } else {
                                str3 = str;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-142127577, i4, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Resource (ContentPreset.kt:162)");
                            }
                            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                            if (deprecated_eventlistenerfactory == deprecated_eventListenerFactory.Unresolved) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(715578031);
                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(context);
                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(obj);
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                                    int i26 = onWarmupCompleted + 13;
                                    IAuthTabCallback = i26 % 128;
                                    int i27 = i26 % 2;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized = deprecated_dispatcher.onWarmupCompleted(deprecated_eventListenerFactory.Companion, context, obj);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                    }
                                    deprecated_eventlistenerfactory2 = (deprecated_eventListenerFactory) objOnMinimized;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854371691);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                deprecated_eventlistenerfactory2 = deprecated_eventlistenerfactory;
                            }
                            int[] iArr = onExtraCallback.onNavigationEvent;
                            int i28 = iArr[deprecated_eventlistenerfactory2.ordinal()];
                            if (i28 != 4) {
                                if (i28 != 5) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(716861586);
                                    int i29 = onExtraCallback.onWarmupCompleted[onwarmupcompleted2.ordinal()];
                                    if (i29 == 1) {
                                        z = true;
                                    } else {
                                        if (i29 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i30 = iArr[deprecated_eventlistenerfactory2.ordinal()];
                                        z = true;
                                        if (i30 != 1 && i30 != 2 && i30 != 3) {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854425302);
                                        quirksExternalSyntheticBackport0IAuthTabCallback2 = onExtraCallbackWithResult(quirksExternalSyntheticBackport03, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 6) & 14) | ((i4 >> 18) & 896), 1);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854426261);
                                        quirksExternalSyntheticBackport0IAuthTabCallback2 = IAuthTabCallback(quirksExternalSyntheticBackport03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 6) & 14) | ((i4 >> 21) & 112));
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport0IAuthTabCallback2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    int i31 = onWarmupCompleted + 81;
                                    IAuthTabCallback = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (z) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854430547);
                                        immediatefailedfutureIAuthTabCallback2 = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854431530);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        immediatefailedfutureIAuthTabCallback2 = immediateFailedFuture.Companion.IAuthTabCallback();
                                    }
                                    AppLovinNativeAdImplc.onExtraCallback(obj, jOnTransact, quirksExternalSyntheticBackport05, str3, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | ((i4 >> 6) & 112) | ((i4 >> 12) & 7168), 752);
                                    int i32 = IAuthTabCallback + 45;
                                    onWarmupCompleted = i32 % 128;
                                    int i33 = i32 % 2;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854406891);
                                }
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            } else {
                                String strOnExtraCallback = null;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(715825101);
                                if (obj instanceof String) {
                                    strOnExtraCallback = (String) obj;
                                } else if (obj instanceof verifyClientState) {
                                    strOnExtraCallback = ((verifyClientState) obj).onExtraCallback();
                                }
                                String str4 = strOnExtraCallback;
                                if (str4 != null) {
                                    int i34 = onWarmupCompleted + 35;
                                    IAuthTabCallback = i34 % 128;
                                    int i35 = i34 % 2;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(716027438);
                                    handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(handleNativeAdClick.onExtraCallback.onExtraCallback());
                                    boolean z2 = onwarmupcompleted2 == handleNativeAdClick.onWarmupCompleted.Fill;
                                    if (z2) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854389782);
                                        quirksExternalSyntheticBackport0IAuthTabCallback = onExtraCallbackWithResult(quirksExternalSyntheticBackport03, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 18) & 896) | ((i4 >> 6) & 14), 1);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854390741);
                                        quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 6) & 14) | ((i4 >> 21) & 112));
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport0IAuthTabCallback;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    float fOnExtraCallbackWithResult = VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted());
                                    float fOnWarmupCompleted = VirtualCameraInfo.onWarmupCompleted(onextracallback.onWarmupCompleted());
                                    if (z2) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854400403);
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                        immediatefailedfutureIAuthTabCallback = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else {
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(854401386);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
                                    }
                                    AppLovinStarRatingView.IAuthTabCallback(str4, quirksExternalSyntheticBackport06, false, false, i23, f3, false, fOnExtraCallbackWithResult, fOnWarmupCompleted, null, immediatefailedfutureIAuthTabCallback, false, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4 & 516096, (i4 >> 15) & 896, 2636);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(716747227);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            str2 = str3;
                            int i36 = i23;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                            f2 = f3;
                            j3 = jOnTransact;
                            i11 = i36;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            i11 = i;
                            f2 = f;
                            onwarmupcompleted2 = onwarmupcompleted;
                            str2 = str;
                            j3 = j2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport02;
                            final handleNativeAdClick.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted2;
                            final String str5 = str2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj3, Object obj4) {
                                    int i37 = 2 % 2;
                                    int i38 = onExtraCallbackWithResult + 59;
                                    onExtraCallback = i38 % 128;
                                    int i39 = i38 % 2;
                                    Unit unitOnNavigationEvent = AppLovinNativeAdImplExternalSyntheticLambda0.onNavigationEvent(this.f$0, obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport07, j3, i11, f2, onwarmupcompleted3, str5, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                    int i40 = onExtraCallback + 31;
                                    onExtraCallbackWithResult = i40 % 128;
                                    if (i40 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i2 & 100663296) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            j2 = j;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        j2 = j;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i4) != 38347922, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public final void onWarmupCompleted(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final getHumanReadableName gethumanreadablename2;
        getHumanReadableName gethumanreadablename3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                int i5 = 2 / 0;
            } else {
                gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            }
            gethumanreadablename2 = gethumanreadablename3;
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        final long jOnTransact = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        final long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        final GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 32) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-234668548, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Text (ContentPreset.kt:226)");
        }
        lExternalSyntheticLambda4.onExtraCallback(1.0f, ForwardingCameraControl.onExtraCallback(-1544424416, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                hasProvider hasprovider2 = hasprovider;
                getHumanReadableName gethumanreadablename4 = gethumanreadablename2;
                long j3 = jOnTransact;
                long j4 = jOnNavigationEvent;
                int iIntValue = ((Integer) obj2).intValue();
                Object[] objArr = {quirksExternalSyntheticBackport03, hasprovider2, gethumanreadablename4, Long.valueOf(j3), Long.valueOf(j4), graphicDeviceInfo2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
                Unit unit = (Unit) AppLovinNativeAdImplExternalSyntheticLambda0.onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 618562535, objArr, -618562535, iOnExtraCallbackWithResult2);
                int i9 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = onWarmupCompleted + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getHumanReadableName gethumanreadablename2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 3;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                int i6 = 73 / 0;
            } else {
                gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
            }
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        final long jOnTransact = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        final long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        Object obj = null;
        if ((i2 & 32) != 0) {
            int i7 = IAuthTabCallback + 77;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 49;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2117055422, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Text (ContentPreset.kt:250)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2117055422, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Text (ContentPreset.kt:250)");
        }
        lExternalSyntheticLambda4.onExtraCallback(1.0f, ForwardingCameraControl.onExtraCallback(591971610, true, new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.ContentPreset$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 51;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnWarmupCompleted = AppLovinNativeAdImplExternalSyntheticLambda0.onWarmupCompleted(quirksExternalSyntheticBackport02, str, gethumanreadablename2, jOnTransact, jOnNavigationEvent, graphicDeviceInfo2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i13 = onNavigationEvent + 121;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return unitOnWarmupCompleted;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        int i10 = IAuthTabCallback + 41;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 5;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 15;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 47 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(591971610, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.Text.<anonymous> (ContentPreset.kt:252)");
                    int i7 = onWarmupCompleted + 3;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader.onNavigationEvent) null, true, 1, (Object) null), gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onExtraCallbackWithResult()), false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 3072, 89952}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader.onNavigationEvent) null, true, 1, (Object) null), gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onExtraCallbackWithResult()), false, graphicDeviceInfo, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 3072, 89952}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        float f;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-307218715, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.autoIconSize (ContentPreset.kt:266)");
        }
        handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(handleNativeAdClick.onExtraCallback.onExtraCallback());
        if (onextracallback instanceof handleNativeAdClick.onExtraCallback.onNavigationEvent) {
            if (((handleNativeAdClick.onExtraCallback.onNavigationEvent) onextracallback) instanceof handleNativeAdClick.onExtraCallback.IAuthTabCallback) {
                int i3 = onWarmupCompleted + 101;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                f = 0.7f;
            } else {
                f = 0.66f;
            }
            quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0, f);
        } else {
            if (!(onextracallback instanceof handleNativeAdClick.onExtraCallback.onWarmupCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            quirksExternalSyntheticBackport0OnWarmupCompleted = setMainImageUri.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallback);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onWarmupCompleted + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable handleNativeAdClick.onExtraCallback onextracallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((i2 & 1) != 0) {
            onextracallback = (handleNativeAdClick.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(handleNativeAdClick.onExtraCallback.onExtraCallback());
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1464163198, i, -1, "im.toss.tds.compose.component.atom.asset.v2.ContentPreset.autoImageSize (ContentPreset.kt:285)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = setMainImageUri.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallback);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 99;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof AppLovinNativeAdImplExternalSyntheticLambda0) || this.onNavigationEvent != ((AppLovinNativeAdImplExternalSyntheticLambda0) obj).onNavigationEvent) {
            return false;
        }
        int i6 = i2 + 107;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIdentityHashCode = System.identityHashCode(this.onNavigationEvent);
        int i4 = onWarmupCompleted + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iIdentityHashCode;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, Object obj, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda0, obj, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), onwarmupcompleted, str, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1691012618, objArr, -1691012616, iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, hasprovider, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 618562535, objArr, -618562535, iOnExtraCallbackWithResult2);
    }

    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda0 appLovinNativeAdImplExternalSyntheticLambda0, Object obj, deprecated_eventListenerFactory deprecated_eventlistenerfactory, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, handleNativeAdClick.onWarmupCompleted onwarmupcompleted, String str, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {appLovinNativeAdImplExternalSyntheticLambda0, obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Float.valueOf(f), onwarmupcompleted, str, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -821894766, objArr, 821894767, iOnExtraCallbackWithResult2);
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, hasProvider hasprovider, getHumanReadableName gethumanreadablename, long j, long j2, GraphicDeviceInfo graphicDeviceInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, hasprovider, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), -1311683681, objArr, 1311683684, iOnExtraCallbackWithResult2);
    }
}
