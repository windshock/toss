package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ExtensionsInfoExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.component8;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.matches;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4;
import o.readFully;
import o.setByteOrder;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[AFf1tSDK2.values().length];
            try {
                iArr[AFf1tSDK2.Jump.ordinal()] = 1;
                int i = onExtraCallback + 85;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFf1tSDK2.Continuous.ordinal()] = 2;
                int i4 = onWarmupCompleted + 59;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    public static /* synthetic */ int IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        int iIntValue = ((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{camera2CameraMetadataExternalSyntheticLambda1}, -1871309205, iOnExtraCallback2, 1871309212, matches.onExtraCallback(), iOnExtraCallback)).intValue();
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | (~(i7 | i2));
        int i9 = (~i6) | i4;
        int i10 = ~(i9 | i2);
        int i11 = (~(i6 | (~i2))) | (~i9);
        int i12 = i4 + i2 + i3 + (243328196 * i) + (549715570 * i5);
        int i13 = i12 * i12;
        int i14 = (i4 * 1467389705) + 421362043 + (i2 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (1467388771 * i3) + ((-1383267380) * i) + (1030937622 * i5) + (i13 * 484507648);
        switch (((-90835549) * i4) + 1264254976 + ((-1099560353) * i2) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i3) + (781713408 * i) + (665583616 * i5) + (1005256704 * i13) + (i14 * i14 * 1164771328)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                Function2 function2 = (Function2) objArr[2];
                final boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                final AFf1vSDK aFf1vSDK = (AFf1vSDK) objArr[4];
                final Function0 function0 = (Function0) objArr[5];
                final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
                final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[7];
                final isExtraPreviewRequired isextrapreviewrequired = (isExtraPreviewRequired) objArr[8];
                VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[9];
                int i15 = 2 % 2;
                int i16 = onExtraCallback + 63;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
                final int iOnExtraCallbackWithResult = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onNavigationEvent(isextrapreviewrequired.onExtraCallback()));
                int iOnExtraCallbackWithResult2 = isextrapreviewrequired.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback()));
                final int iOnExtraCallbackWithResult3 = isextrapreviewrequired.onExtraCallbackWithResult(fFloatValue);
                List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback(AFf1xSDK.Tabs, function2);
                Integer numValueOf = 0;
                List list = listIAuthTabCallback;
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((component7) listIAuthTabCallback.get(i18)).onNavigationEvent(IntCompanionObject.MAX_VALUE)));
                }
                final int iIntValue = numValueOf.intValue();
                long jIAuthTabCallback = VirtualCameraCaptureResult.IAuthTabCallback(virtualCameraCaptureResult.onExtraCallback(), 0, 0, iIntValue, iIntValue, 2, (Object) null);
                final ArrayList arrayList = new ArrayList(listIAuthTabCallback.size());
                int size2 = list.size();
                int i19 = 0;
                while (i19 < size2) {
                    arrayList.add(((component7) listIAuthTabCallback.get(i19)).onExtraCallback(jIAuthTabCallback));
                    i19++;
                    listIAuthTabCallback = listIAuthTabCallback;
                }
                int i20 = 0;
                Integer numValueOf2 = Integer.valueOf(iOnExtraCallbackWithResult2 + iOnExtraCallbackWithResult + (RangesKt___RangesKt.coerceAtLeast(arrayList.size() - 1, 0) * iOnExtraCallbackWithResult3));
                int size3 = arrayList.size();
                while (i20 < size3) {
                    numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((getStreamSharingChildren) arrayList.get(i20)).getInterfaceDescriptor());
                    i20++;
                    int i21 = onNavigationEvent + 109;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 2 / 3;
                    }
                }
                final int iIntValue2 = numValueOf2.intValue();
                return component4.IAuthTabCallback(isextrapreviewrequired, Math.max(iIntValue2, VirtualCameraCaptureResult.onTransact(virtualCameraCaptureResult.onExtraCallback())), iIntValue, (Map) null, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i23 = 2 % 2;
                        int i24 = IAuthTabCallback + 49;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        Unit unitOnExtraCallbackWithResult = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallbackWithResult(iOnExtraCallbackWithResult, arrayList, isextrapreviewrequired, iIntValue2, iIntValue, zBooleanValue, aFf1vSDK, deviceQuirksExternalSyntheticLambda0, function0, iOnExtraCallbackWithResult3, getbacktracenote, getbacktracenote2, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                        int i26 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                        IAuthTabCallback = i26 % 128;
                        int i27 = i26 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, 4, (Object) null);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access000(objArr);
            case 12:
                return getInterfaceDescriptor(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        List list = (List) objArr[1];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(getbacktracenote, list, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallback(getbacktracenote, list, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static final Unit IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z, Function1 function1, getBacktraceNote getbacktracenote, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, quirksExternalSyntheticBackport0, f, z, (Function1<? super Integer, Unit>) function1, (getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 21;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, z, quirksExternalSyntheticBackport0, f, function0, getbacktracenote, getbacktracenote2, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 35;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(matches.onExtraCallback(), new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, 1935012274, matches.onExtraCallback(), -1935012272, matches.onExtraCallback(), matches.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 3;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getInternalId getinternalid, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, Function1 function1, getBacktraceNote getbacktracenote, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 29;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(getinternalid, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, z, function1, getbacktracenote, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getinternalid, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, z, function1, getbacktracenote, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 105;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback3 = matches.onExtraCallback();
        int iOnExtraCallback4 = matches.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(matches.onExtraCallback(), new Object[]{getstreamsharingchildren, onextracallbackwithresult}, -902432247, iOnExtraCallback4, 902432259, matches.onExtraCallback(), iOnExtraCallback3);
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(float f, float f2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(f, f2, sessionProcessorCaptureCallback);
        }
        onWarmupCompleted(f, f2, sessionProcessorCaptureCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ s_ IAuthTabCallback(List list, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(list, cameraPresenceProviderExternalSyntheticLambda6);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        s_ s_VarOnExtraCallbackWithResult = onExtraCallbackWithResult(list, cameraPresenceProviderExternalSyntheticLambda6);
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return s_VarOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            return Integer.valueOf(((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, -1547360809, iOnExtraCallback2, 1547360813, matches.onExtraCallback(), iOnExtraCallback)).intValue());
        }
        int iOnExtraCallback3 = matches.onExtraCallback();
        int iOnExtraCallback4 = matches.onExtraCallback();
        ((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, -1547360809, iOnExtraCallback4, 1547360813, matches.onExtraCallback(), iOnExtraCallback3)).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        deprecated_dns deprecated_dnsVar = (deprecated_dns) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Float.valueOf(onExtraCallbackWithResult(deprecated_dnsVar, fFloatValue));
        }
        onExtraCallbackWithResult(deprecated_dnsVar, fFloatValue);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        List list = (List) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, list, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, list, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(i);
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, boolean z, getBacktraceNote getbacktracenote, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, f, z, getbacktracenote, function2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 79;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z, Function1 function1, getBacktraceNote getbacktracenote, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, quirksExternalSyntheticBackport0, f, z, function1, getbacktracenote, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 5;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(fliphorizontally);
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 onExtraCallback(getInternalId getinternalid, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(getinternalid, list, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = IAuthTabCallback(getinternalid, list, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, List list, isExtraPreviewRequired isextrapreviewrequired, int i2, int i3, boolean z, AFf1vSDK aFf1vSDK, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function0 function0, int i4, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 37;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, list, isextrapreviewrequired, i2, i3, z, aFf1vSDK, deviceQuirksExternalSyntheticLambda0, function0, i4, getbacktracenote, getbacktracenote2, onextracallbackwithresult);
        if (i7 != 0) {
            int i8 = 40 / 0;
        }
        int i9 = onNavigationEvent + 21;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallbackWithResult(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, boolean z, getBacktraceNote getbacktracenote, Function2 function2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(i, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, f, z, (getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 95;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {deviceQuirksExternalSyntheticLambda0, Boolean.valueOf(z), quirksExternalSyntheticBackport0, Float.valueOf(f), function0, getbacktracenote, getbacktracenote2, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            int iOnExtraCallback = matches.onExtraCallback();
            IAuthTabCallback(matches.onExtraCallback(), objArr, 985383210, matches.onExtraCallback(), -985383204, matches.onExtraCallback(), iOnExtraCallback);
        } else {
            Object[] objArr2 = {deviceQuirksExternalSyntheticLambda0, Boolean.valueOf(z), quirksExternalSyntheticBackport0, Float.valueOf(f), function0, getbacktracenote, getbacktracenote2, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            int iOnExtraCallback2 = matches.onExtraCallback();
            IAuthTabCallback(matches.onExtraCallback(), objArr2, 985383210, matches.onExtraCallback(), -985383204, matches.onExtraCallback(), iOnExtraCallback2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ component8 onExtraCallbackWithResult(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, Function2 function2, boolean z, AFf1vSDK aFf1vSDK, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        component8 component8Var;
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            component8Var = (component8) IAuthTabCallback(matches.onExtraCallback(), new Object[]{deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), function2, Boolean.valueOf(z), aFf1vSDK, function0, getbacktracenote, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult}, -462206190, matches.onExtraCallback(), 462206195, matches.onExtraCallback(), matches.onExtraCallback());
            int i3 = 88 / 0;
        } else {
            component8Var = (component8) IAuthTabCallback(matches.onExtraCallback(), new Object[]{deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), function2, Boolean.valueOf(z), aFf1vSDK, function0, getbacktracenote, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult}, -462206190, matches.onExtraCallback(), 462206195, matches.onExtraCallback(), matches.onExtraCallback());
        }
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return component8Var;
    }

    public static /* synthetic */ int onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
        }
        IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onNavigationEvent(getInternalId getinternalid) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(getinternalid);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public static /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, list, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
    }

    public static /* synthetic */ ExtensionsInfoExternalSyntheticLambda0 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return extensionsInfoExternalSyntheticLambda0OnWarmupCompleted;
    }

    public static final /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            IAuthTabCallback(matches.onExtraCallback(), new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, 1935012274, iOnExtraCallback2, -1935012272, matches.onExtraCallback(), iOnExtraCallback);
            throw null;
        }
        int iOnExtraCallback3 = matches.onExtraCallback();
        int iOnExtraCallback4 = matches.onExtraCallback();
        IAuthTabCallback(matches.onExtraCallback(), new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, numValueOf, numValueOf2}, 1935012274, iOnExtraCallback4, -1935012272, matches.onExtraCallback(), iOnExtraCallback3);
        int i6 = onNavigationEvent + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        getInternalId getinternalid = (getInternalId) objArr[3];
        List list = (List) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        s_ s_VarOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, getinternalid, list);
        int i4 = onNavigationEvent + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return s_VarOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, float f2, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(f, f2, setiso);
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(getInternalId getinternalid, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, Function1 function1, getBacktraceNote getbacktracenote, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(getinternalid, quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, z, (Function1<? super Boolean, Unit>) function1, (getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 49;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ AFf1tSDK2 onWarmupCompleted(getInternalId getinternalid) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1tSDK2 aFf1tSDK2IAuthTabCallback = IAuthTabCallback(getinternalid);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = onNavigationEvent + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return aFf1tSDK2IAuthTabCallback;
    }

    public static /* synthetic */ component8 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = matches.onExtraCallback();
            int iOnExtraCallback2 = matches.onExtraCallback();
            return (component8) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, component4Var, component7Var, virtualCameraCaptureResult}, -1053207475, iOnExtraCallback2, 1053207476, matches.onExtraCallback(), iOnExtraCallback);
        }
        int iOnExtraCallback3 = matches.onExtraCallback();
        int iOnExtraCallback4 = matches.onExtraCallback();
        component8 component8Var = (component8) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, component4Var, component7Var, virtualCameraCaptureResult}, -1053207475, iOnExtraCallback4, 1053207476, matches.onExtraCallback(), iOnExtraCallback3);
        int i3 = 65 / 0;
        return component8Var;
    }

    private static final Unit onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(camera2CameraMetadataExternalSyntheticLambda1.asBinder());
        }
        camera2CameraMetadataExternalSyntheticLambda1.asBinder();
        throw null;
    }

    private static final int IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = number.intValue();
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final CameraPresenceProviderExternalSyntheticLambda6 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1840170973);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1840170973, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow.<anonymous> (ScrollableTabRow.kt:95)");
        }
        CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Integer>) cameraPresenceProviderExternalSyntheticLambda6, (List<AFf1wSDKAFa1tSDK>) list, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i3 = onNavigationEvent + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i5 = onExtraCallback + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z, @Nullable Function1<? super Integer, Unit> function1, @Nullable getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        float fIAuthTabCallback;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        Function1<? super Integer, Unit> function12;
        getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        float f2;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z4;
        Function1<? super Integer, Unit> function13;
        Object obj;
        int i11 = 2 % 2;
        int i12 = onNavigationEvent + 47;
        onExtraCallback = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(63326096);
        if ((i & 6) == 0) {
            int i14 = onExtraCallback + 51;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i17 = onNavigationEvent + 61;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    fIAuthTabCallback = f;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fIAuthTabCallback)) {
                        int i19 = onExtraCallback + 119;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 8;
                if (i7 != 0) {
                    int i21 = onNavigationEvent + 119;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            int i23 = onNavigationEvent + 111;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 16;
                    if (i9 != 0) {
                        if ((i & 24576) == 0) {
                            int i25 = onNavigationEvent + 81;
                            onExtraCallback = i25 % 128;
                            int i26 = i25 % 2;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            int i27 = onExtraCallback + 53;
                            onNavigationEvent = i27 % 128;
                            if (i27 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote);
                                throw null;
                            }
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
                        }
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i16 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if (i5 != 0) {
                                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
                            }
                            if (i7 != 0) {
                                int i28 = onNavigationEvent + 113;
                                onExtraCallback = i28 % 128;
                                int i29 = i28 % 2;
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i9 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new ScrollableTabRowKt$.ExternalSyntheticLambda15();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                function13 = (Function1) objOnMinimized;
                            } else {
                                function13 = function1;
                            }
                            getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnWarmupCompleted = i10 != 0 ? AFf1tSDK.IAuthTabCallback.onWarmupCompleted() : getbacktracenote;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(63326096, i3, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow (ScrollableTabRow.kt:74)");
                            }
                            boolean z5 = (i3 & 14) == 4;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z5 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ScrollableTabRowKt$.ExternalSyntheticLambda16(camera2CameraMetadataExternalSyntheticLambda1));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                            boolean z6 = (57344 & i3) == 16384;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z6 | zOnNavigationEvent)) {
                                int i30 = onNavigationEvent + 7;
                                onExtraCallback = i30 % 128;
                                if (i30 % 2 != 0) {
                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    obj = null;
                                    objOnMinimized3 = new onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, function13, (access13800) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                } else {
                                    obj = null;
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(fIAuthTabCallback, 0.0f, 2, obj);
                                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent2 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized4 = new ScrollableTabRowKt$.ExternalSyntheticLambda17(cameraPresenceProviderExternalSyntheticLambda6);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                }
                                ScrollableTabRowKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new ScrollableTabRowKt$.ExternalSyntheticLambda18(cameraPresenceProviderExternalSyntheticLambda6);
                                int i31 = i3 << 3;
                                float f3 = fIAuthTabCallback;
                                Function1<? super Integer, Unit> function14 = function13;
                                IAuthTabCallback(matches.onExtraCallback(), new Object[]{deviceQuirksExternalSyntheticLambda0OnExtraCallback, Boolean.valueOf(z4), quirksExternalSyntheticBackport04, Float.valueOf(0.0f), (Function0) objOnMinimized4, externalSyntheticLambda18, getbacktracenoteOnWarmupCompleted, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i31 & 29360128) | ((i3 >> 6) & 112) | (i31 & 896) | (3670016 & i31)), 8}, 985383210, matches.onExtraCallback(), -985383204, matches.onExtraCallback(), matches.onExtraCallback());
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                f2 = f3;
                                function12 = function14;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                z3 = z4;
                                getbacktracenote2 = getbacktracenoteOnWarmupCompleted;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            function12 = function1;
                            getbacktracenote2 = getbacktracenote;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            f2 = fIAuthTabCallback;
                            z3 = z2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ScrollableTabRowKt$.ExternalSyntheticLambda19(camera2CameraMetadataExternalSyntheticLambda1, quirksExternalSyntheticBackport03, f2, z3, function12, getbacktracenote2, function2, i, i2));
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z2 = z;
                i9 = i2 & 16;
                if (i9 != 0) {
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            fIAuthTabCallback = f;
            i7 = i2 & 8;
            if (i7 != 0) {
            }
            z2 = z;
            i9 = i2 & 16;
            if (i9 != 0) {
            }
            i10 = i2 & 32;
            if (i10 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        fIAuthTabCallback = f;
        i7 = i2 & 8;
        if (i7 != 0) {
        }
        z2 = z;
        i9 = i2 & 16;
        if (i9 != 0) {
        }
        i10 = i2 & 32;
        if (i10 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).intValue();
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(738888863);
            int i4 = 43 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(738888863, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow.<anonymous> (ScrollableTabRow.kt:122)");
            }
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(738888863);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Integer>) cameraPresenceProviderExternalSyntheticLambda6, (List<AFf1wSDKAFa1tSDK>) list, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                int i7 = 41 / 0;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, boolean z, @Nullable getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnNavigationEvent;
        boolean z3;
        final float f2;
        final getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        final boolean z4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1621553612);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    int i13 = onExtraCallback + 115;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 75 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                            int i15 = onExtraCallback + 61;
                            onNavigationEvent = i15 % 128;
                            i7 = i15 % 2 == 0 ? 6401 : 2048;
                        } else {
                            i7 = 1024;
                        }
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    int i16 = onNavigationEvent + 13;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z2 = z;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            int i18 = onNavigationEvent + 33;
                            onExtraCallback = i18 % 128;
                            int i19 = i18 % 2;
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = TTHistoryActivity2.SIZE;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        if ((196608 & i2) == 0) {
                            int i20 = onExtraCallback + 99;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            getbacktracenoteOnNavigationEvent = getbacktracenote;
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnNavigationEvent) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                        }
                        if ((1572864 & i2) == 0) {
                            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
                        }
                        boolean z5 = true;
                        if ((599187 & i4) != 599186) {
                            int i22 = onExtraCallback + 35;
                            onNavigationEvent = i22 % 128;
                            z3 = i22 % 2 != 0;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                            int i23 = onNavigationEvent + 89;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i24 = 8 / 0;
                                quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            } else if (i12 != 0) {
                            }
                            if (i5 != 0) {
                                int i25 = onExtraCallback + 81;
                                onNavigationEvent = i25 % 128;
                                int i26 = i25 % 2;
                                deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null);
                            } else {
                                deviceQuirksExternalSyntheticLambda0OnExtraCallback = deviceQuirksExternalSyntheticLambda02;
                            }
                            float fIAuthTabCallback = i6 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
                            if (i8 != 0) {
                                int i27 = onNavigationEvent + 29;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                            } else {
                                z5 = z2;
                            }
                            if (i10 != 0) {
                                getbacktracenoteOnNavigationEvent = AFf1tSDK.IAuthTabCallback.onNavigationEvent();
                            }
                            getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3 = getbacktracenoteOnNavigationEvent;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i29 = onNavigationEvent + 85;
                                onExtraCallback = i29 % 128;
                                int i30 = i29 % 2;
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1621553612, i4, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow (ScrollableTabRow.kt:112)");
                            }
                            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4 & 14);
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda2
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i31 = 2 % 2;
                                        int i32 = onWarmupCompleted + 97;
                                        onNavigationEvent = i32 % 128;
                                        int i33 = i32 % 2;
                                        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback};
                                        int iOnExtraCallback = matches.onExtraCallback();
                                        Integer numValueOf = Integer.valueOf(((Integer) r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(matches.onExtraCallback(), objArr, 789049524, matches.onExtraCallback(), -789049514, matches.onExtraCallback(), iOnExtraCallback)).intValue());
                                        int i34 = onWarmupCompleted + 57;
                                        onNavigationEvent = i34 % 128;
                                        int i35 = i34 % 2;
                                        return numValueOf;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            getBacktraceNote getbacktracenote4 = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda3
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                @Override // o.getBacktraceNote
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i31 = 2 % 2;
                                    int i32 = onNavigationEvent + 125;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (List) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i34 = onNavigationEvent + 71;
                                    IAuthTabCallback = i34 % 128;
                                    int i35 = i34 % 2;
                                    return cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent;
                                }
                            };
                            int i31 = i4 << 3;
                            int i32 = (i31 & 29360128) | ((i4 >> 6) & 14) | ((i4 >> 9) & 112) | (i31 & 896) | (i4 & 7168) | (3670016 & i31);
                            Boolean boolValueOf = Boolean.valueOf(z5);
                            Float fValueOf = Float.valueOf(fIAuthTabCallback);
                            Integer numValueOf = Integer.valueOf(i32);
                            int iOnExtraCallback = matches.onExtraCallback();
                            int iOnExtraCallback2 = matches.onExtraCallback();
                            IAuthTabCallback(matches.onExtraCallback(), new Object[]{deviceQuirksExternalSyntheticLambda0OnExtraCallback, boolValueOf, quirksExternalSyntheticBackport04, fValueOf, (Function0) objOnMinimized, getbacktracenote4, getbacktracenote3, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf, 0}, 985383210, iOnExtraCallback2, -985383204, matches.onExtraCallback(), iOnExtraCallback);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            z4 = z5;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                            f2 = fIAuthTabCallback;
                            getbacktracenote2 = getbacktracenote3;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            f2 = f;
                            getbacktracenote2 = getbacktracenoteOnNavigationEvent;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                            z4 = z2;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda4
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i33 = 2 % 2;
                                    int i34 = onNavigationEvent + 101;
                                    IAuthTabCallback = i34 % 128;
                                    int i35 = i34 % 2;
                                    Unit unitOnExtraCallback = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallback(i, quirksExternalSyntheticBackport03, deviceQuirksExternalSyntheticLambda03, f2, z4, getbacktracenote2, function2, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i36 = IAuthTabCallback + 85;
                                    onNavigationEvent = i36 % 128;
                                    int i37 = i36 % 2;
                                    return unitOnExtraCallback;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 196608;
                    getbacktracenoteOnNavigationEvent = getbacktracenote;
                    if ((1572864 & i2) == 0) {
                    }
                    boolean z52 = true;
                    if ((599187 & i4) != 599186) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                z2 = z;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                getbacktracenoteOnNavigationEvent = getbacktracenote;
                if ((1572864 & i2) == 0) {
                }
                boolean z522 = true;
                if ((599187 & i4) != 599186) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            z2 = z;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            getbacktracenoteOnNavigationEvent = getbacktracenote;
            if ((1572864 & i2) == 0) {
            }
            boolean z5222 = true;
            if ((599187 & i4) != 599186) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        z2 = z;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        getbacktracenoteOnNavigationEvent = getbacktracenote;
        if ((1572864 & i2) == 0) {
        }
        boolean z52222 = true;
        if ((599187 & i4) != 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return unit;
    }

    private static final int onExtraCallbackWithResult(getInternalId getinternalid) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallbackStub = getinternalid.IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final CameraPresenceProviderExternalSyntheticLambda6 IAuthTabCallback(getInternalId getinternalid, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-23762517);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-23762517, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow.<anonymous> (ScrollableTabRow.kt:155)");
            int i3 = onExtraCallback + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = onExtraCallbackWithResult(getinternalid, (List<AFf1wSDKAFa1tSDK>) list, cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onExtraCallback + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull getInternalId getinternalid, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, @Nullable Function1<? super Boolean, Unit> function1, @Nullable getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        int i4;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        int i5;
        boolean z2;
        int i6;
        Function1<? super Boolean, Unit> function12;
        int i7;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        Function1<? super Boolean, Unit> function13;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteIAuthTabCallback;
        boolean z4;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(getinternalid, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1320074264);
        if ((i & 6) == 0) {
            int i9 = onExtraCallback + 91;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getinternalid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i12 = onNavigationEvent + 59;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 77 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
            }
            i3 |= i4;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda02) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                int i15 = onNavigationEvent + 125;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function12 = function1;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((196608 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
                        }
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                            if (i11 != 0) {
                                int i17 = onExtraCallback + 9;
                                onNavigationEvent = i17 % 128;
                                if (i17 % 2 == 0) {
                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                    throw null;
                                }
                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            }
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = i14 != 0 ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null) : deviceQuirksExternalSyntheticLambda02;
                            boolean z5 = i5 != 0 ? true : z2;
                            if (i6 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = new ScrollableTabRowKt$.ExternalSyntheticLambda22();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                function12 = (Function1) objOnMinimized;
                            }
                            Function1<? super Boolean, Unit> function14 = function12;
                            if (i7 != 0) {
                                int i18 = onNavigationEvent + 97;
                                onExtraCallback = i18 % 128;
                                int i19 = i18 % 2;
                                getbacktracenoteIAuthTabCallback = AFf1tSDK.IAuthTabCallback.IAuthTabCallback();
                            } else {
                                getbacktracenoteIAuthTabCallback = getbacktracenote;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1320074264, i3, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRow (ScrollableTabRow.kt:138)");
                            }
                            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                            Unit unit = Unit.INSTANCE;
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelativeIAuthTabCallback);
                            if ((57344 & i3) == 16384) {
                                int i20 = onNavigationEvent + 31;
                                onExtraCallback = i20 % 128;
                                int i21 = i20 % 2;
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent | z4)) {
                                int i22 = onNavigationEvent + 125;
                                onExtraCallback = i22 % 128;
                                int i23 = i22 % 2;
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new onWarmupCompleted(setcontentinsetsrelativeIAuthTabCallback, function14, (access13800) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                boolean z6 = (i3 & 14) == 4;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!z6) {
                                    Object obj = objOnMinimized3;
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        ScrollableTabRowKt$.ExternalSyntheticLambda23 externalSyntheticLambda23 = new ScrollableTabRowKt$.ExternalSyntheticLambda23(getinternalid);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda23);
                                        obj = externalSyntheticLambda23;
                                    }
                                    Function0 function0 = (Function0) obj;
                                    ScrollableTabRowKt$.ExternalSyntheticLambda24 externalSyntheticLambda24 = new ScrollableTabRowKt$.ExternalSyntheticLambda24(getinternalid);
                                    int i24 = i3 << 3;
                                    int i25 = ((i3 >> 6) & 126) | (i24 & 896) | (3670016 & i24);
                                    Boolean boolValueOf = Boolean.valueOf(z5);
                                    Float fValueOf = Float.valueOf(0.0f);
                                    Integer numValueOf = Integer.valueOf((i24 & 29360128) | i25);
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    IAuthTabCallback(matches.onExtraCallback(), new Object[]{deviceQuirksExternalSyntheticLambda0OnExtraCallback, boolValueOf, quirksExternalSyntheticBackport03, fValueOf, function0, externalSyntheticLambda24, getbacktracenoteIAuthTabCallback, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf, 8}, 985383210, matches.onExtraCallback(), -985383204, matches.onExtraCallback(), matches.onExtraCallback());
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i26 = onNavigationEvent + 39;
                                        onExtraCallback = i26 % 128;
                                        int i27 = i26 % 2;
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    function13 = function14;
                                    deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                                    z3 = z5;
                                    getbacktracenote2 = getbacktracenoteIAuthTabCallback;
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            getbacktracenote2 = getbacktracenote;
                            function13 = function12;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda02;
                            z3 = z2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ScrollableTabRowKt$.ExternalSyntheticLambda25(getinternalid, quirksExternalSyntheticBackport02, deviceQuirksExternalSyntheticLambda03, z3, function13, getbacktracenote2, function2, i, i2));
                            return;
                        }
                        return;
                    }
                    int i28 = onNavigationEvent + 67;
                    onExtraCallback = i28 % 128;
                    if (i28 % 2 != 0) {
                        i3 |= 196608;
                        int i29 = 0 / 0;
                    } else {
                        i3 |= 196608;
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                function12 = function1;
                int i30 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i30 % 128;
                int i31 = i30 % 2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function12 = function1;
            int i302 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i302 % 128;
            int i312 = i302 % 2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function12 = function1;
        int i3022 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i3022 % 128;
        int i3122 = i3022 % 2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1))) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        component4 component4Var = (component4) objArr[1];
        component7 component7Var = (component7) objArr[2];
        VirtualCameraCaptureResult virtualCameraCaptureResult = (VirtualCameraCaptureResult) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.onWarmupCompleted(virtualCameraCaptureResult.onExtraCallback(), VirtualCameraCaptureResult.Companion.onNavigationEvent(component4Var.onExtraCallbackWithResult(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<s_>) cameraPresenceProviderExternalSyntheticLambda6).onNavigationEvent()))));
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor(), getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 45;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) obj;
                if (i4 == 0) {
                    return r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(getstreamsharingchildren, onextracallbackwithresult);
                }
                r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(getstreamsharingchildren, onextracallbackwithresult);
                throw null;
            }
        }, 4, (Object) null);
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return component8VarIAuthTabCallback;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, List list, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onExtraCallback + 23;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallback + 99;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1822729167, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScrollableTabRow.kt:214)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1822729167, i, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScrollableTabRow.kt:214)");
            }
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) getbacktracenote.invoke(list, cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), QuirkSettingsLoader.Companion.onNavigationEvent(), false, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    @Override // o.getBacktraceNote
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 119;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                            throw null;
                        }
                        component8 component8VarOnWarmupCompleted = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                        int i8 = IAuthTabCallback + 87;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 31 / 0;
                        }
                        return component8VarOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (getBacktraceNote) objOnMinimized);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent2) {
                int i6 = onExtraCallback + 57;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 49 / 0;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0OnNavigationEvent;
                                int i8 = 2 % 2;
                                int i9 = IAuthTabCallback + 39;
                                onExtraCallbackWithResult = i9 % 128;
                                if (i9 % 2 != 0) {
                                    extensionsInfoExternalSyntheticLambda0OnNavigationEvent = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                                    int i10 = 87 / 0;
                                } else {
                                    extensionsInfoExternalSyntheticLambda0OnNavigationEvent = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) obj);
                                }
                                int i11 = IAuthTabCallback + 31;
                                onExtraCallbackWithResult = i11 % 128;
                                if (i11 % 2 == 0) {
                                    return extensionsInfoExternalSyntheticLambda0OnNavigationEvent;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    getbacktracenote2.invoke(submit.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CaptureNoResponseQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized2), 0.0f, 1, (Object) null), -1.0f), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i8 = onNavigationEvent + 13;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    getbacktracenote2.invoke(submit.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CaptureNoResponseQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized2), 0.0f, 1, (Object) null), -1.0f), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 51;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(int i, List list, isExtraPreviewRequired isextrapreviewrequired, int i2, int i3, boolean z, AFf1vSDK aFf1vSDK, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function0 function0, int i4, final getBacktraceNote getbacktracenote, final getBacktraceNote getbacktracenote2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int interfaceDescriptor = i;
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = onNavigationEvent + 49;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) list.get(i6);
            if (i6 > 0) {
                int i9 = onNavigationEvent + 103;
                onExtraCallback = i9 % 128;
                interfaceDescriptor = i9 % 2 != 0 ? interfaceDescriptor << i4 : interfaceDescriptor + i4;
            }
            int i10 = interfaceDescriptor;
            arrayList.add(new AFf1wSDKAFa1tSDK(onextracallbackwithresult.c_(i10), onextracallbackwithresult.c_(getstreamsharingchildren.getInterfaceDescriptor()), null));
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, i10, 0, 0.0f, 4, (Object) null);
            interfaceDescriptor = getstreamsharingchildren.getInterfaceDescriptor() + i10;
        }
        component7 component7Var = (component7) CollectionsKt___CollectionsKt.firstOrNull(isextrapreviewrequired.IAuthTabCallback(AFf1xSDK.Indicator, ForwardingCameraControl.onExtraCallbackWithResult(-1822729167, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i11 = 2 % 2;
                int i12 = IAuthTabCallback + 61;
                onExtraCallback = i12 % 128;
                if (i12 % 2 != 0) {
                    return (Unit) r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(matches.onExtraCallback(), new Object[]{getbacktracenote, arrayList, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 819299719, matches.onExtraCallback(), -819299719, matches.onExtraCallback(), matches.onExtraCallback());
                }
                throw null;
            }
        })));
        if (component7Var != null && (getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(i2, i3))) != null) {
            int i11 = onNavigationEvent + 73;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildrenOnExtraCallback, 0, 0, 0.0f, 4, (Object) null);
        }
        if (z) {
            aFf1vSDK.onWarmupCompleted(isextrapreviewrequired, onextracallbackwithresult.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0.onExtraCallbackWithResult(isextrapreviewrequired.onExtraCallback())), arrayList, ((Number) function0.invoke()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[PHI: r23
      0x0101: PHI (r23v8 int) = (r23v0 int), (r23v3 int), (r23v4 int) binds: [B:58:0x00ff, B:65:0x0111, B:64:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Function2 function2;
        int i8;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        final float f;
        final getBacktraceNote getbacktracenote;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        boolean z2;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i9;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        final Function0 function0 = (Function0) objArr[4];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[5];
        getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[6];
        final Function2 function22 = (Function2) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        final int iIntValue2 = ((Number) objArr[10]).intValue();
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1864176541);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        int i11 = i;
        int i12 = iIntValue2 & 4;
        if (i12 == 0) {
            if ((iIntValue & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                    int i13 = onExtraCallback + 115;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    i2 = 256;
                } else {
                    i2 = 128;
                }
                i3 = i2 | i11;
            }
            i4 = iIntValue2 & 8;
            Object obj = null;
            if (i4 != 0) {
                if ((iIntValue & 3072) == 0) {
                    int i15 = onNavigationEvent + 115;
                    onExtraCallback = i15 % 128;
                    if (i15 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue);
                        throw null;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue)) {
                        int i16 = onNavigationEvent + 5;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i6 = i5 | i3;
                }
                if ((iIntValue & 24576) == 0) {
                    int i18 = onExtraCallback + 15;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                }
                if ((196608 & iIntValue) == 0) {
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                }
                i7 = iIntValue2 & 64;
                int i20 = 1572864;
                if (i7 != 0) {
                    i6 |= i20;
                } else if ((iIntValue & 1572864) == 0) {
                    i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 1048576 : 524288;
                    i6 |= i20;
                }
                if ((iIntValue & 12582912) == 0) {
                    int i21 = onExtraCallback + 113;
                    onNavigationEvent = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 38 / 0;
                        i9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 8388608 : 4194304;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                    }
                    i6 |= i9;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
                    if (i12 != 0) {
                        int i23 = onExtraCallback + 113;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                            obj.hashCode();
                            throw null;
                        }
                        onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback2;
                    if (i4 != 0) {
                        fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    }
                    final float f2 = fFloatValue;
                    if (i7 != 0) {
                        getbacktracenote3 = (getBacktraceNote) AFf1tSDK.onWarmupCompleted(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), 1526947607, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{AFf1tSDK.IAuthTabCallback}, -1526947607);
                    }
                    final getBacktraceNote getbacktracenote4 = getbacktracenote3;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1864176541, i6, -1, "im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowImpl (ScrollableTabRow.kt:172)");
                    }
                    setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    final AFf1vSDK aFf1vSDK = (AFf1vSDK) IAuthTabCallback(matches.onExtraCallback(), new Object[]{setcontentinsetsrelativeIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, 1259442799, matches.onExtraCallback(), -1259442791, matches.onExtraCallback(), matches.onExtraCallback());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setContentInsetsAbsolute.onExtraCallbackWithResult(getImplementationType.onNavigationEvent(onextracallback4), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                    if ((i6 & 14) == 4) {
                        int i24 = onNavigationEvent + 11;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i6 & 7168) == 2048) {
                        int i26 = onNavigationEvent + 73;
                        onExtraCallback = i26 % 128;
                        int i27 = i26 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = (29360128 & i6) == 8388608;
                    boolean z5 = (458752 & i6) == 131072;
                    boolean z6 = (3670016 & i6) == 1048576;
                    boolean z7 = (i6 & 112) == 32;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(aFf1vSDK);
                    i8 = iIntValue;
                    if ((i6 & 57344) == 16384) {
                        z3 = true;
                    } else {
                        int i28 = onNavigationEvent + 87;
                        onExtraCallback = i28 % 128;
                        int i29 = i28 % 2;
                        z3 = false;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z5 | z | z2 | z4 | z6 | z7 | zOnExtraCallback | z3)) {
                        int i30 = onNavigationEvent + 63;
                        onExtraCallback = i30 % 128;
                        int i31 = i30 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            function2 = function22;
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
                            objOnMinimized = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda11
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallback;

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i32 = 2 % 2;
                                    int i33 = onExtraCallback + 9;
                                    IAuthTabCallback = i33 % 128;
                                    int i34 = i33 % 2;
                                    component8 component8VarOnExtraCallbackWithResult = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, f2, function22, zBooleanValue, aFf1vSDK, function0, getbacktracenote2, getbacktracenote4, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                                    int i35 = IAuthTabCallback + 49;
                                    onExtraCallback = i35 % 128;
                                    int i36 = i35 % 2;
                                    return component8VarOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            function2 = function22;
                            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
                        }
                        hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport0, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onextracallback = onextracallback4;
                        f = f2;
                        getbacktracenote = getbacktracenote4;
                    }
                } else {
                    function2 = function22;
                    i8 = iIntValue;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    f = fFloatValue;
                    getbacktracenote = getbacktracenote3;
                    onextracallback = onextracallback2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final Function2 function23 = function2;
                    final int i32 = i8;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda12
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i33 = 2 % 2;
                            int i34 = IAuthTabCallback + 9;
                            onExtraCallbackWithResult = i34 % 128;
                            int i35 = i34 % 2;
                            Unit unitIAuthTabCallback = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, zBooleanValue, onextracallback, f, function0, getbacktracenote2, getbacktracenote, function23, i32, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i36 = IAuthTabCallback + 9;
                            onExtraCallbackWithResult = i36 % 128;
                            int i37 = i36 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                }
                return null;
            }
            i3 |= 3072;
            i6 = i3;
            if ((iIntValue & 24576) == 0) {
            }
            if ((196608 & iIntValue) == 0) {
            }
            i7 = iIntValue2 & 64;
            int i202 = 1572864;
            if (i7 != 0) {
            }
            if ((iIntValue & 12582912) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        i11 |= 384;
        i3 = i11;
        i4 = iIntValue2 & 8;
        Object obj2 = null;
        if (i4 != 0) {
        }
        i6 = i3;
        if ((iIntValue & 24576) == 0) {
        }
        if ((196608 & iIntValue) == 0) {
        }
        i7 = iIntValue2 & 64;
        int i2022 = 1572864;
        if (i7 != 0) {
        }
        if ((iIntValue & 12582912) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i6) != 4793490, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        final int iIntValue2 = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-20221230);
        int i6 = iIntValue2 & 1;
        if (i6 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                int i7 = onNavigationEvent + 7;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        Object obj = null;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 3) != 2, i & 1))) {
            if (i6 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-20221230, i, -1, "im.toss.tosssecurities.uikit.compound.tab.SimpleIndicator (ScrollableTabRow.kt:254)");
            }
            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(onextracallback, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f))), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 31;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda10
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallback = r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallback(onextracallback, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = onNavigationEvent + 111;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            });
        }
        return null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[0];
        boolean z = true;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-957771865, iIntValue, -1, "im.toss.tosssecurities.uikit.compound.tab.rememberScrollableTabData (ScrollableTabRow.kt:290)");
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
        if ((((iIntValue & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelative)) && (iIntValue & 6) != 4) {
            z = false;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = new AFf1vSDK(setcontentinsetsrelative, findresandmsg);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        AFf1vSDK aFf1vSDK = (AFf1vSDK) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 107;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                int i8 = 2 / 0;
            }
        }
        int i9 = onNavigationEvent + 105;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return aFf1vSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AFf1tSDK2 IAuthTabCallback(getInternalId getinternalid) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AFf1tSDK2 aFf1tSDK2OnExtraCallbackWithResult = AFf1tSDK2.Companion.onExtraCallbackWithResult(getinternalid);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aFf1tSDK2OnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CameraPresenceProviderExternalSyntheticLambda6<s_> onExtraCallbackWithResult(getInternalId getinternalid, List<AFf1wSDKAFa1tSDK> list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1860189628, i, -1, "im.toss.tosssecurities.uikit.compound.tab.calculateIndicatorLayoutInfo (ScrollableTabRow.kt:351)");
            int i5 = onNavigationEvent + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = (i & 14) ^ 6;
        boolean z3 = (i7 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getinternalid)) || (i & 6) == 4;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z3) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ScrollableTabRowKt$.ExternalSyntheticLambda13(getinternalid));
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                obj = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) obj;
        AFf1wSDKAFa1tSDK aFf1wSDKAFa1tSDK = (AFf1wSDKAFa1tSDK) CollectionsKt___CollectionsKt.getOrNull(list, getinternalid.ICustomTabsCallback_Parcel());
        if (aFf1wSDKAFa1tSDK != null) {
            int i8 = onExtraCallback + 17;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            fIAuthTabCallback = aFf1wSDKAFa1tSDK.IAuthTabCallback();
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2 = isSubmitButtonEnabled.onExtraCallbackWithResult(fIAuthTabCallback, onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0), "indicator offset", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 8);
        if (aFf1wSDKAFa1tSDK != null) {
            int i10 = onExtraCallback + 31;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                aFf1wSDKAFa1tSDK.onExtraCallback();
                throw null;
            }
            fIAuthTabCallback2 = aFf1wSDKAFa1tSDK.onExtraCallback();
        } else {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult3 = isSubmitButtonEnabled.onExtraCallbackWithResult(fIAuthTabCallback2, onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 0), "indicator width", (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 8);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        if (((i & 112) ^ 48) > 32) {
            int i11 = onNavigationEvent + 23;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) {
                z = (i & 48) == 32;
            }
        }
        if (i7 > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getinternalid)) {
            z2 = true;
        } else if ((i & 6) == 4) {
            int i13 = onExtraCallback + 73;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | z | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ScrollableTabRowKt$.ExternalSyntheticLambda14(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2, cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult3, getinternalid, list));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return cameraPresenceProviderExternalSyntheticLambda62;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r5 != 5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r5 != 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5 = r8.IAuthTabCallbackStub() + r8.access100();
        r1 = (int) r5;
        r5 = r5 - r1;
        r8 = java.lang.Math.min(r8.onExtraCallback() - 1, kotlin.collections.CollectionsKt__CollectionsKt.getLastIndex(r9));
        r4 = (o.AFf1wSDKAFa1tSDK) kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r9, kotlin.ranges.RangesKt___RangesKt.coerceAtMost(r1, r8));
        r8 = (o.AFf1wSDKAFa1tSDK) kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r9, kotlin.ranges.RangesKt___RangesKt.coerceAtMost(r1 + 1, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r9 = o.r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent + 69;
        o.r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallback = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if ((r9 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        return new o.s_(o.VirtualCameraControlExternalSyntheticLambda2.IAuthTabCallback(r4.IAuthTabCallback(), r8.IAuthTabCallback(), r5), o.VirtualCameraControlExternalSyntheticLambda2.IAuthTabCallback(r4.onExtraCallback(), r8.onExtraCallback(), r5), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        return new o.s_(((o.VirtualCameraControlExternalSyntheticLambda1) r6.onExtraCallbackWithResult()).IAuthTabCallback(), ((o.VirtualCameraControlExternalSyntheticLambda1) r7.onExtraCallbackWithResult()).IAuthTabCallback(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        return new o.s_(((o.VirtualCameraControlExternalSyntheticLambda1) r6.onExtraCallbackWithResult()).IAuthTabCallback(), ((o.VirtualCameraControlExternalSyntheticLambda1) r7.onExtraCallbackWithResult()).IAuthTabCallback(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r1 = o.r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onNavigationEvent + 91;
        o.r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.onExtraCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final s_ onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, getInternalId getinternalid, List list) {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            i = IAuthTabCallback.onExtraCallbackWithResult[((AFf1tSDK2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).ordinal()];
        } else {
            i = IAuthTabCallback.onExtraCallbackWithResult[((AFf1tSDK2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).ordinal()];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final CameraPresenceProviderExternalSyntheticLambda6<s_> onExtraCallback(final CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda6, final List<AFf1wSDKAFa1tSDK> list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-678545931, i, -1, "im.toss.tosssecurities.uikit.compound.tab.calculateIndicatorLayoutInfo (ScrollableTabRow.kt:404)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        if (((i & 14) ^ 6) > 4) {
            int i5 = onNavigationEvent + 97;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6)) {
                z = true;
            } else if ((i & 6) != 4) {
                int i6 = onNavigationEvent + 113;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
        }
        boolean z2 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list)) || (i & 48) == 32;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z | z2)) {
            int i8 = onExtraCallback + 37;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.tab.ScrollableTabRowKt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 101;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        List list2 = list;
                        if (i12 != 0) {
                            return r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(list2, cameraPresenceProviderExternalSyntheticLambda6);
                        }
                        int i13 = 37 / 0;
                        return r8lambdaRAS8LXgQ2XRbcKjNFHhGmgaB5W4.IAuthTabCallback(list2, cameraPresenceProviderExternalSyntheticLambda6);
                    }
                });
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i10 = onExtraCallback + 81;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 / 5;
                }
            }
        }
        CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i12 = onNavigationEvent + 69;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return cameraPresenceProviderExternalSyntheticLambda62;
    }

    private static final s_ onExtraCallbackWithResult(List list, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        float fIAuthTabCallback;
        float fIAuthTabCallback2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1wSDKAFa1tSDK aFf1wSDKAFa1tSDK = (AFf1wSDKAFa1tSDK) CollectionsKt___CollectionsKt.getOrNull(list, ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).intValue());
        if (aFf1wSDKAFa1tSDK != null) {
            fIAuthTabCallback = aFf1wSDKAFa1tSDK.IAuthTabCallback();
            int i4 = onNavigationEvent + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if (aFf1wSDKAFa1tSDK != null) {
            fIAuthTabCallback2 = aFf1wSDKAFa1tSDK.onExtraCallback();
        } else {
            fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        return new s_(fIAuthTabCallback, fIAuthTabCallback2, null);
    }

    private static final Unit onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.onNavigationEvent(createFromFileString.Companion.onNavigationEvent());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final removeObserverLocked onWarmupCompleted(float f, float f2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new ScrollableTabRowKt$.ExternalSyntheticLambda20(f, f2));
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(float f, float f2, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        if (f > 0.0f) {
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            readFully.onExtraCallback onextracallback = readFully.Companion;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onExtraCallback(onextracallback, CollectionsKt__CollectionsKt.listOf((Object[]) new setByteOrder[]{setByteOrder.onNavigationEvent(onextracallbackwithresult.onNavigationEvent()), setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault())}), 0.0f, setiso.onExtraCallback(f), 0, 8, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, readBoolean.Companion.IAuthTabCallbackDefault(), 62, (Object) null);
        }
        if (f2 > 0.0f) {
            readFully.onExtraCallback onextracallback2 = readFully.Companion;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult2 = setByteOrder.Companion;
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onExtraCallback(onextracallback2, CollectionsKt__CollectionsKt.listOf((Object[]) new setByteOrder[]{setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault()), setByteOrder.onNavigationEvent(onextracallbackwithresult2.onNavigationEvent())}), Float.intBitsToFloat((int) (setiso.onTransact() >> 32)) - setiso.onExtraCallback(f2), Float.intBitsToFloat((int) (setiso.onTransact() >> 32)), 0, 8, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, readBoolean.Companion.IAuthTabCallbackDefault(), 62, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final onItemClicked<VirtualCameraControlExternalSyntheticLambda1> onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 73;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(869395799, i, -1, "im.toss.tosssecurities.uikit.compound.tab.rememberTabsAnimationSpec (ScrollableTabRow.kt:456)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(869395799, i, -1, "im.toss.tosssecurities.uikit.compound.tab.rememberTabsAnimationSpec (ScrollableTabRow.kt:456)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized = new deprecated_dns(1000.0d, 52.0d);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        deprecated_dns deprecated_dnsVar = (deprecated_dns) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized2 = onQueryRefine.onExtraCallbackWithResult(deprecated_dnsVar.IAuthTabCallback(), 0, new ScrollableTabRowKt$.ExternalSyntheticLambda21(deprecated_dnsVar), 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        getThumbPosition getthumbposition = (getThumbPosition) objOnMinimized2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return getthumbposition;
    }

    private static final float onExtraCallbackWithResult(deprecated_dns deprecated_dnsVar, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float interpolation = deprecated_dnsVar.getInterpolation(f);
        int i4 = onExtraCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return interpolation;
    }

    private static final ExtensionsInfoExternalSyntheticLambda0 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        ExtensionsInfoExternalSyntheticLambda0 extensionsInfoExternalSyntheticLambda0IAuthTabCallback = ExtensionsInfoExternalSyntheticLambda0.IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent(getCurrentBacktraceOrBuilderList.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<s_>) cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback())) << 32));
        int i4 = onNavigationEvent + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return extensionsInfoExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    private static final s_ onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<s_> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        s_ s_Var = (s_) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return s_Var;
    }

    public static /* synthetic */ int onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return ((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 789049524, iOnExtraCallback2, -789049514, matches.onExtraCallback(), iOnExtraCallback)).intValue();
    }

    public static /* synthetic */ float onExtraCallback(deprecated_dns deprecated_dnsVar, float f) {
        Object[] objArr = {deprecated_dnsVar, Float.valueOf(f)};
        int iOnExtraCallback = matches.onExtraCallback();
        return ((Float) IAuthTabCallback(matches.onExtraCallback(), objArr, -2084099523, matches.onExtraCallback(), 2084099534, matches.onExtraCallback(), iOnExtraCallback)).floatValue();
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, List list, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, list, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        return (Unit) IAuthTabCallback(matches.onExtraCallback(), objArr, 819299719, matches.onExtraCallback(), -819299719, matches.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ s_ IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, getInternalId getinternalid, List list) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return (s_) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, getinternalid, list}, 1765836693, iOnExtraCallback2, -1765836690, matches.onExtraCallback(), iOnExtraCallback);
    }

    public static /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, list, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        return (CameraPresenceProviderExternalSyntheticLambda6) IAuthTabCallback(matches.onExtraCallback(), objArr, -895220231, matches.onExtraCallback(), 895220240, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final void onExtraCallbackWithResult(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Function0<Integer> function0, getBacktraceNote<? super List<AFf1wSDKAFa1tSDK>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, ? extends CameraPresenceProviderExternalSyntheticLambda6<s_>> getbacktracenote, getBacktraceNote<? super QuirksExternalSyntheticBackport0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {deviceQuirksExternalSyntheticLambda0, Boolean.valueOf(z), quirksExternalSyntheticBackport0, Float.valueOf(f), function0, getbacktracenote, getbacktracenote2, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = matches.onExtraCallback();
        IAuthTabCallback(matches.onExtraCallback(), objArr, 985383210, matches.onExtraCallback(), -985383204, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final component8 onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f, Function2 function2, boolean z, AFf1vSDK aFf1vSDK, Function0 function0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        Object[] objArr = {deviceQuirksExternalSyntheticLambda0, Float.valueOf(f), function2, Boolean.valueOf(z), aFf1vSDK, function0, getbacktracenote, getbacktracenote2, isextrapreviewrequired, virtualCameraCaptureResult};
        int iOnExtraCallback = matches.onExtraCallback();
        return (component8) IAuthTabCallback(matches.onExtraCallback(), objArr, -462206190, matches.onExtraCallback(), 462206195, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final component8 IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return (component8) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, component4Var, component7Var, virtualCameraCaptureResult}, -1053207475, iOnExtraCallback2, 1053207476, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onNavigationEvent(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return (Unit) IAuthTabCallback(matches.onExtraCallback(), new Object[]{getstreamsharingchildren, onextracallbackwithresult}, -902432247, iOnExtraCallback2, 902432259, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final int onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return ((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{camera2CameraMetadataExternalSyntheticLambda1}, -1871309205, iOnExtraCallback2, 1871309212, matches.onExtraCallback(), iOnExtraCallback)).intValue();
    }

    private static final int onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnExtraCallback = matches.onExtraCallback();
        int iOnExtraCallback2 = matches.onExtraCallback();
        return ((Integer) IAuthTabCallback(matches.onExtraCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, -1547360809, iOnExtraCallback2, 1547360813, matches.onExtraCallback(), iOnExtraCallback)).intValue();
    }

    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = matches.onExtraCallback();
        IAuthTabCallback(matches.onExtraCallback(), objArr, 1935012274, matches.onExtraCallback(), -1935012272, matches.onExtraCallback(), iOnExtraCallback);
    }

    private static final AFf1vSDK IAuthTabCallback(setContentInsetsRelative setcontentinsetsrelative, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {setcontentinsetsrelative, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = matches.onExtraCallback();
        return (AFf1vSDK) IAuthTabCallback(matches.onExtraCallback(), objArr, 1259442799, matches.onExtraCallback(), -1259442791, matches.onExtraCallback(), iOnExtraCallback);
    }
}
