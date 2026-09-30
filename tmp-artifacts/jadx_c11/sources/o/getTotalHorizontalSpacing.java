package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.getDistanceBetweenPoints;
import o.getTotalHorizontalSpacing;
import o.getVideoPercentViewed;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getTotalHorizontalSpacing {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final float onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public /* synthetic */ getTotalHorizontalSpacing(int i, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~i8;
        int i10 = ~i5;
        int i11 = i9 | (~(i10 | i3));
        int i12 = i8 | i10;
        int i13 = (~(i5 | i3)) | (~(i7 | (~i3)));
        int i14 = i3 + i2 + i4 + ((-1311665080) * i6) + (1761575915 * i);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i3) + 412680192 + (1917570655 * i2) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i4) + (175112192 * i6) + ((-649461760) * i) + (1783169024 * i15);
        int i17 = ((i3 * 1226044109) - 1701849991) + (i2 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i4 * 1226043599) + (i6 * (-858626504)) + (i * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        if (i18 != 1) {
            return i18 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
        }
        boolean z = false;
        long jLongValue = ((Number) objArr[0]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[1];
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[2];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[5];
        final float fFloatValue = ((Number) objArr[6]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i19 = 2 % 2;
        if ((iIntValue2 & 3) != 2) {
            z = true;
        } else {
            int i20 = onExtraCallback + 107;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-406885027, iIntValue2, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.OrderedList.<anonymous> (ListPreset.kt:51)");
            }
            maybeFireRemainingCompletionTrackers.onExtraCallbackWithResult(jLongValue, graphicDeviceInfo, ForwardingCameraControl.onExtraCallback(741545414, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = onWarmupCompleted + 31;
                    IAuthTabCallback = i23 % 128;
                    if (i23 % 2 == 0) {
                        return getTotalHorizontalSpacing.onNavigationEvent(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iIntValue, cameraPresenceProviderExternalSyntheticLambda6, fFloatValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    getTotalHorizontalSpacing.onNavigationEvent(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iIntValue, cameraPresenceProviderExternalSyntheticLambda6, fFloatValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i22 = onExtraCallback + 73;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, GraphicDeviceInfo graphicDeviceInfo, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Long.valueOf(j), graphicDeviceInfo, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Integer.valueOf(i), cameraPresenceProviderExternalSyntheticLambda6, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 381386205, -381386204, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), objArr);
        int i6 = onNavigationEvent + 7;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, getbacktracenote, i, f, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 23;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTotalHorizontalSpacing gettotalhorizontalspacing, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 25;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            Object[] objArr = {gettotalhorizontalspacing, quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, deviceQuirksExternalSyntheticLambda0, function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {gettotalhorizontalspacing, quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, deviceQuirksExternalSyntheticLambda0, function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 306238833, -306238833, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent(), objArr2);
        int i7 = onNavigationEvent + 87;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTotalHorizontalSpacing gettotalhorizontalspacing, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, GraphicDeviceInfo graphicDeviceInfo, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 13;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            onExtraCallbackWithResult(gettotalhorizontalspacing, quirksExternalSyntheticBackport0, i, f, j, graphicDeviceInfo, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(gettotalhorizontalspacing, quirksExternalSyntheticBackport0, i, f, j, graphicDeviceInfo, deviceQuirksExternalSyntheticLambda0, getbacktracenote, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onExtraCallback + 83;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ getVideoPercentViewed IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getVideoPercentViewed getvideopercentviewedOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallback + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getvideopercentviewedOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getTotalHorizontalSpacing gettotalhorizontalspacing = (getTotalHorizontalSpacing) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        long jLongValue = ((Number) objArr[4]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
        long jLongValue2 = ((Number) objArr[6]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[7];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[8];
        Function1<? super finishVideo, Unit> function1 = (Function1) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int iIntValue3 = ((Number) objArr[11]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        ((Number) objArr[13]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        gettotalhorizontalspacing.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, iIntValue, fFloatValue, jLongValue, graphicDeviceInfo, jLongValue2, graphicDeviceInfo2, deviceQuirksExternalSyntheticLambda0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue2), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getTotalHorizontalSpacing gettotalhorizontalspacing, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, GraphicDeviceInfo graphicDeviceInfo, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 9;
        onNavigationEvent = i6 % 128;
        gettotalhorizontalspacing.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, i, f, j, graphicDeviceInfo, deviceQuirksExternalSyntheticLambda0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 51;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, i, cameraPresenceProviderExternalSyntheticLambda6, f, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 119;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
        return unitIAuthTabCallback;
    }

    private getTotalHorizontalSpacing(int i, float f) {
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getTotalHorizontalSpacing(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult};
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            f = ((Float) getCombinedPathForAllStarsWithSide.onExtraCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1838186307, iOnExtraCallback2, -1838186306, objArr)).floatValue();
            int i5 = onNavigationEvent + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(i, f, null);
    }

    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 67;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 74 / 0;
        }
        return i5;
    }

    public float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    private static final getVideoPercentViewed onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        getVideoPercentViewed getvideopercentviewed = new getVideoPercentViewed();
        ((Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).invoke(getvideopercentviewed);
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return getvideopercentviewed;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 1;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(741545414, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.OrderedList.<anonymous>.<anonymous> (ListPreset.kt:55)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(741545414, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.OrderedList.<anonymous>.<anonymous> (ListPreset.kt:55)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0).onExtraCallback(quirksExternalSyntheticBackport0);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i7 = onNavigationEvent + 117;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    defaultConstructorMarker.hashCode();
                    throw null;
                }
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
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 63;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        getVideoPercentViewed getvideopercentviewedIAuthTabCallback = getTotalHorizontalSpacing.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
                        if (i10 != 0) {
                            int i11 = 31 / 0;
                        }
                        return getvideopercentviewedIAuthTabCallback;
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-325724619);
            for (setupPaints setuppaints : onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<getVideoPercentViewed>) objOnMinimized).IAuthTabCallback()) {
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setuppaints);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Integer numOnExtraCallback = setuppaints.onExtraCallback();
                    objOnMinimized2 = new handleUnavailableCachedResources(numOnExtraCallback != null ? numOnExtraCallback.intValue() : 1, getDistanceBetweenPoints.onNavigationEvent.onWarmupCompleted(i, 1), f, defaultConstructorMarker);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                setuppaints.onExtraCallbackWithResult().invoke((handleUnavailableCachedResources) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 5;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull final Function1<? super finishVideo, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        boolean z;
        final GraphicDeviceInfo graphicDeviceInfo3;
        long j4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final int i9;
        long jOnTransact;
        float fOnExtraCallbackWithResult;
        final GraphicDeviceInfo graphicDeviceInfo4;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int iOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo5;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallbackStub;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        GraphicDeviceInfo graphicDeviceInfo6;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-473227028);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i2 & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                i5 = i;
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i5) ? 32 : 16;
                i4 |= i13;
            } else {
                i5 = i;
            }
            i4 |= i13;
        } else {
            i5 = i;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                int i14 = onNavigationEvent + 37;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 18 / 0;
                    i10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                }
                i4 |= i10;
            }
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                j3 = j;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        int i17 = onNavigationEvent + 39;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 1048576 : 524288;
                        }
                        if ((12582912 & i2) == 0) {
                            if ((i3 & 128) == 0) {
                                int i19 = onNavigationEvent + 87;
                                onExtraCallback = i19 % 128;
                                if (i19 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                                    throw null;
                                }
                                int i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 8388608 : 4194304;
                                i4 |= i20;
                            }
                        }
                        if ((100663296 & i2) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 67108864 : 33554432;
                        }
                        if ((805306368 & i2) == 0) {
                            int i21 = onExtraCallback + 1;
                            onNavigationEvent = i21 % 128;
                            int i22 = i21 % 2;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i4) != 306783378) {
                            int i23 = onExtraCallback + 37;
                            onNavigationEvent = i23 % 128;
                            int i24 = i23 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                if ((i3 & 2) != 0) {
                                    int i25 = onNavigationEvent + 79;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    iOnNavigationEvent = onNavigationEvent();
                                    i4 &= -113;
                                } else {
                                    iOnNavigationEvent = i5;
                                }
                                if ((i3 & 4) != 0) {
                                    fOnExtraCallbackWithResult = onExtraCallbackWithResult();
                                    i4 &= -897;
                                } else {
                                    fOnExtraCallbackWithResult = f;
                                }
                                if (i16 != 0) {
                                    int i27 = onExtraCallback + 123;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % 2;
                                    jOnTransact = setByteOrder.Companion.onTransact();
                                } else {
                                    jOnTransact = j3;
                                }
                                graphicDeviceInfo5 = i6 != 0 ? null : graphicDeviceInfo;
                                long jOnTransact2 = i7 != 0 ? setByteOrder.Companion.onTransact() : j2;
                                GraphicDeviceInfo graphicDeviceInfo7 = i8 == 0 ? graphicDeviceInfo2 : null;
                                if ((i3 & 128) != 0) {
                                    deviceQuirksExternalSyntheticLambda0IAuthTabCallbackStub = getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(iOnNavigationEvent, getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback()) ? getCombinedPathForAllStarsWithSide.IAuthTabCallbackStub(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                                    i4 = (-29360129) & i4;
                                } else {
                                    deviceQuirksExternalSyntheticLambda0IAuthTabCallbackStub = deviceQuirksExternalSyntheticLambda0;
                                }
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0IAuthTabCallbackStub;
                                graphicDeviceInfo6 = graphicDeviceInfo7;
                                j4 = jOnTransact2;
                            } else {
                                int i29 = onExtraCallback + 5;
                                onNavigationEvent = i29 % 128;
                                if (i29 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i3 & 3) != 0) {
                                        int i30 = onNavigationEvent + 79;
                                        onExtraCallback = i30 % 128;
                                        int i31 = i30 % 2;
                                        i4 &= -113;
                                    }
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    j4 = j2;
                                    graphicDeviceInfo6 = graphicDeviceInfo2;
                                    deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                    iOnNavigationEvent = i5;
                                    jOnTransact = j3;
                                    fOnExtraCallbackWithResult = f;
                                    graphicDeviceInfo5 = graphicDeviceInfo;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((i3 & 2) != 0) {
                                    }
                                    if ((i3 & 4) != 0) {
                                    }
                                    if ((i3 & 128) != 0) {
                                    }
                                    j4 = j2;
                                    graphicDeviceInfo6 = graphicDeviceInfo2;
                                    deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                    iOnNavigationEvent = i5;
                                    jOnTransact = j3;
                                    fOnExtraCallbackWithResult = f;
                                    graphicDeviceInfo5 = graphicDeviceInfo;
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-473227028, i4, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.OrderedList (ListPreset.kt:43)");
                            }
                            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 >> 24) & 14);
                            final long j5 = j4;
                            final GraphicDeviceInfo graphicDeviceInfo8 = graphicDeviceInfo6;
                            final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda03;
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            final int i32 = iOnNavigationEvent;
                            final float f2 = fOnExtraCallbackWithResult;
                            GraphicDeviceInfo graphicDeviceInfo9 = graphicDeviceInfo6;
                            PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onWarmupCompleted(AppLovinVastMediaView.onNavigationEvent(getHumanReadableName.Companion.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), jOnTransact, 0L, graphicDeviceInfo5, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (getChildPreviewOutConfig) null, 0, 0, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 16777210, (Object) null), ForwardingCameraControl.onExtraCallback(-406885027, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda3
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i33 = 2 % 2;
                                    int i34 = onExtraCallbackWithResult + 27;
                                    onWarmupCompleted = i34 % 128;
                                    if (i34 % 2 == 0) {
                                        return getTotalHorizontalSpacing.IAuthTabCallback(j5, graphicDeviceInfo8, deviceQuirksExternalSyntheticLambda04, quirksExternalSyntheticBackport05, i32, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, f2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    }
                                    getTotalHorizontalSpacing.IAuthTabCallback(j5, graphicDeviceInfo8, deviceQuirksExternalSyntheticLambda04, quirksExternalSyntheticBackport05, i32, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, f2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    throw null;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                            i9 = iOnNavigationEvent;
                            graphicDeviceInfo3 = graphicDeviceInfo5;
                            graphicDeviceInfo4 = graphicDeviceInfo9;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            graphicDeviceInfo3 = graphicDeviceInfo;
                            j4 = j2;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            i9 = i5;
                            jOnTransact = j3;
                            fOnExtraCallbackWithResult = f;
                            graphicDeviceInfo4 = graphicDeviceInfo2;
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final float f3 = fOnExtraCallbackWithResult;
                            final long j6 = jOnTransact;
                            final long j7 = j4;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda4
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i33 = 2 % 2;
                                    int i34 = onExtraCallback + 125;
                                    onExtraCallbackWithResult = i34 % 128;
                                    int i35 = i34 % 2;
                                    Unit unitIAuthTabCallback = getTotalHorizontalSpacing.IAuthTabCallback(this.f$0, quirksExternalSyntheticBackport03, i9, f3, j6, graphicDeviceInfo3, j7, graphicDeviceInfo4, deviceQuirksExternalSyntheticLambda02, function1, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i36 = onExtraCallbackWithResult + 115;
                                    onExtraCallback = i36 % 128;
                                    int i37 = i36 % 2;
                                    return unitIAuthTabCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    int i33 = onNavigationEvent + 53;
                    onExtraCallback = i33 % 128;
                    int i34 = i33 % 2;
                    if ((12582912 & i2) == 0) {
                    }
                    if ((100663296 & i2) == 0) {
                    }
                    if ((805306368 & i2) == 0) {
                    }
                    if ((306783379 & i4) != 306783378) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                if ((12582912 & i2) == 0) {
                }
                if ((100663296 & i2) == 0) {
                }
                if ((805306368 & i2) == 0) {
                }
                if ((306783379 & i4) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if ((306783379 & i4) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        j3 = j;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 97;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i7 = i5 + 17;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 21;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1047060145, i2, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.UnorderedList.<anonymous> (ListPreset.kt:101)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0).onExtraCallback(quirksExternalSyntheticBackport0);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
                int i11 = onNavigationEvent + 31;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
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
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new handleMediaError(getDistanceBetweenPoints.onNavigationEvent.onWarmupCompleted(i, 1), f, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i13 = onExtraCallback + 93;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 4;
                }
            }
            getbacktracenote.invoke((handleMediaError) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @NotNull final getBacktraceNote<? super areCachedAdResourcesMissing, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int iOnNavigationEvent;
        float fOnExtraCallbackWithResult;
        long j2;
        int i5;
        int i6;
        GraphicDeviceInfo graphicDeviceInfo2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final float f2;
        GraphicDeviceInfo graphicDeviceInfo3;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnTransact;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-465620896);
        int i8 = i3 & 1;
        Object obj = null;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i9 = onNavigationEvent + 63;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                obj.hashCode();
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i2;
            int i10 = onNavigationEvent + 63;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                iOnNavigationEvent = i;
                int i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnNavigationEvent) ? 32 : 16;
                i4 |= i12;
            } else {
                iOnNavigationEvent = i;
            }
            i4 |= i12;
        } else {
            iOnNavigationEvent = i;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                fOnExtraCallbackWithResult = f;
                int i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnExtraCallbackWithResult) ? 256 : 128;
                i4 |= i13;
            } else {
                fOnExtraCallbackWithResult = f;
            }
            i4 |= i13;
        } else {
            fOnExtraCallbackWithResult = f;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                j2 = j;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                    int i15 = onNavigationEvent + 5;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    int i17 = onExtraCallback + 105;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    graphicDeviceInfo2 = graphicDeviceInfo;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    int i19 = onExtraCallback + 13;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 != 0 ? (i3 & 32) == 0 : (i3 & 97) == 0) {
                        int i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
                        i4 |= i20;
                    }
                    i4 |= i20;
                }
                if ((1572864 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                }
                if ((12582912 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 8388608 : 4194304;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 4793491) != 4793490, i4 & 1)) {
                    int i21 = onExtraCallback + 13;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i2 & 1) != 0) {
                        int i23 = onExtraCallback + 55;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            quirksExternalSyntheticBackport03 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if ((i3 & 2) != 0) {
                                i4 &= -113;
                                iOnNavigationEvent = onNavigationEvent();
                            }
                            if ((i3 & 4) != 0) {
                                fOnExtraCallbackWithResult = onExtraCallbackWithResult();
                                i4 &= -897;
                            }
                            jOnTransact = i14 != 0 ? setByteOrder.Companion.onTransact() : j2;
                            if (i6 != 0) {
                                graphicDeviceInfo2 = null;
                            }
                            if ((i3 & 32) != 0) {
                                deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault = getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(iOnNavigationEvent, getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback()) ? getCombinedPathForAllStarsWithSide.IAuthTabCallbackDefault(getCombinedPathForAllStarsWithSide.onExtraCallbackWithResult, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f));
                                i4 &= -458753;
                            } else {
                                deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault = deviceQuirksExternalSyntheticLambda0;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 2) != 0) {
                                int i25 = onNavigationEvent + 91;
                                onExtraCallback = i25 % 128;
                                i4 = i25 % 2 != 0 ? i4 & 45 : i4 & (-113);
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                int i26 = onNavigationEvent + 109;
                                onExtraCallback = i26 % 128;
                                int i27 = i26 % 2;
                                i4 &= -458753;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault = deviceQuirksExternalSyntheticLambda0;
                            jOnTransact = j2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i28 = onExtraCallback + 69;
                            onNavigationEvent = i28 % 128;
                            if (i28 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-465620896, i4, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.UnorderedList (ListPreset.kt:94)");
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-465620896, i4, -1, "im.toss.tds.compose.component.atom.post.v2.ListPreset.UnorderedList (ListPreset.kt:94)");
                        }
                        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        final int i29 = iOnNavigationEvent;
                        final float f3 = fOnExtraCallbackWithResult;
                        PreviewExternalSyntheticLambda3.IAuthTabCallback(getHumanReadableName.onWarmupCompleted(AppLovinVastMediaView.onExtraCallbackWithResult(getHumanReadableName.Companion.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6), jOnTransact, 0L, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (getChildPreviewOutConfig) null, 0, 0, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (notifySessionStop) null, 16777210, (Object) null), ForwardingCameraControl.onExtraCallback(-1047060145, true, new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i30 = 2 % 2;
                                int i31 = IAuthTabCallback + 77;
                                onExtraCallbackWithResult = i31 % 128;
                                int i32 = i31 % 2;
                                Object obj4 = null;
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda03;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                getBacktraceNote getbacktracenote2 = getbacktracenote;
                                int i33 = i29;
                                float f4 = f3;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (i32 == 0) {
                                    getTotalHorizontalSpacing.IAuthTabCallback(deviceQuirksExternalSyntheticLambda04, quirksExternalSyntheticBackport05, getbacktracenote2, i33, f4, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                                    obj4.hashCode();
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = getTotalHorizontalSpacing.IAuthTabCallback(deviceQuirksExternalSyntheticLambda04, quirksExternalSyntheticBackport05, getbacktracenote2, i33, f4, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                                int i34 = IAuthTabCallback + 121;
                                onExtraCallbackWithResult = i34 % 128;
                                if (i34 % 2 != 0) {
                                    return unitIAuthTabCallback;
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        f2 = fOnExtraCallbackWithResult;
                        graphicDeviceInfo3 = graphicDeviceInfo2;
                        j3 = jOnTransact;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0IAuthTabCallbackDefault;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    f2 = fOnExtraCallbackWithResult;
                    graphicDeviceInfo3 = graphicDeviceInfo2;
                    j3 = j2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final int i30 = iOnNavigationEvent;
                    final GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfo3;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.post.v2.ListPreset$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3) {
                            int i31 = 2 % 2;
                            int i32 = onExtraCallbackWithResult + 81;
                            onExtraCallback = i32 % 128;
                            int i33 = i32 % 2;
                            Unit unitIAuthTabCallback = getTotalHorizontalSpacing.IAuthTabCallback(this.f$0, quirksExternalSyntheticBackport02, i30, f2, j3, graphicDeviceInfo4, deviceQuirksExternalSyntheticLambda04, getbacktracenote, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i34 = onExtraCallbackWithResult + 111;
                            onExtraCallback = i34 % 128;
                            int i35 = i34 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            graphicDeviceInfo2 = graphicDeviceInfo;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        j2 = j;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        graphicDeviceInfo2 = graphicDeviceInfo;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0.onExtraCallback onExtraCallback2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(iIntValue, getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (getDistanceBetweenPoints.onNavigationEvent.onNavigationEvent(iIntValue, getDistanceBetweenPoints.onNavigationEvent.Companion.IAuthTabCallback())) {
            onExtraCallback2 = QuirksExternalSyntheticBackport0.Companion;
            int i3 = onNavigationEvent + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            onExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue * iIntValue), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(onExtraCallback2);
    }

    private static final getVideoPercentViewed onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<getVideoPercentViewed> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getVideoPercentViewed getvideopercentviewed = (getVideoPercentViewed) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = onNavigationEvent + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getvideopercentviewed;
    }

    private static final Unit onNavigationEvent(long j, GraphicDeviceInfo graphicDeviceInfo, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Long.valueOf(j), graphicDeviceInfo, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Integer.valueOf(i), cameraPresenceProviderExternalSyntheticLambda6, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 381386205, -381386204, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), objArr);
    }

    private static final Unit onWarmupCompleted(getTotalHorizontalSpacing gettotalhorizontalspacing, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {gettotalhorizontalspacing, quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, deviceQuirksExternalSyntheticLambda0, function1, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 306238833, -306238833, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), objArr);
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, float f) {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, Integer.valueOf(i), Float.valueOf(f)};
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(RNSScreenManagerDelegate.onNavigationEvent(), 1850937832, -1850937830, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), objArr);
    }
}
