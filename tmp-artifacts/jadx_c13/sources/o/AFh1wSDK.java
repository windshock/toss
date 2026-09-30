package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFh1wSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SurfaceProcessorNodeOut;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.createCameraCaptureCallback;
import o.getStreamSharingChildren;
import o.getSupportedHighSpeedResolutionsFor;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1wSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i3);
        int i11 = i9 | i10 | (~(i4 | i6));
        int i12 = i8 | i4;
        int i13 = (~((~i6) | i4)) | i10;
        int i14 = i4 + i3 + i5 + (111814883 * i2) + (1975835455 * i);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i3) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i5) + ((-648806400) * i2) + (1432616960 * i) + (442957824 * i15);
        int i17 = ((i4 * 961080817) - 60187382) + (i3 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i5 * 961079685) + (i2 * 1618335983) + (i * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        if (i18 == 1) {
            SurfaceProcessorNodeOut surfaceProcessorNodeOut = (SurfaceProcessorNodeOut) objArr[0];
            int i19 = 2 % 2;
            int i20 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            Unit unit = Unit.INSTANCE;
            int i22 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            return unit;
        }
        if (i18 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 3) {
            return onWarmupCompleted(objArr);
        }
        SurfaceProcessorNodeOut surfaceProcessorNodeOut2 = (SurfaceProcessorNodeOut) objArr[0];
        int i24 = 2 % 2;
        int i25 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i25 % 128;
        int i26 = i25 % 2;
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit2 = (Unit) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1389521780, -1389521779, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{surfaceProcessorNodeOut2});
        int i27 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i27 % 128;
        int i28 = i27 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, handshake handshakeVar, Integer num, createCameraCaptureCallback createcameracapturecallback, float f, bindChildren bindchildren, use useVar, long j4, int i, boolean z, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, handshakeVar, num, createcameracapturecallback, f, bindchildren, useVar, j4, i, z, graphicDeviceInfo, function1, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, handshakeVar, num, createcameracapturecallback, f, bindchildren, useVar, j4, i, z, graphicDeviceInfo, function1, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        int i8 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, handshake handshakeVar, Integer num, createCameraCaptureCallback createcameracapturecallback, float f, bindChildren bindchildren, use useVar, long j4, int i, boolean z, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            Object[] objArr = {str, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), handshakeVar, num, createcameracapturecallback, Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), Integer.valueOf(i), Boolean.valueOf(z), graphicDeviceInfo, function1, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr2 = {str, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), handshakeVar, num, createcameracapturecallback, Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), Integer.valueOf(i), Boolean.valueOf(z), graphicDeviceInfo, function1, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1093623132, 1093623134, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2);
        int i8 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 50 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(createCameraCaptureCallback createcameracapturecallback, getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(createcameracapturecallback, getstreamsharingchildren, i, onextracallbackwithresult);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(createcameracapturecallback, getstreamsharingchildren, i, onextracallbackwithresult);
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ component8 onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, createCameraCaptureCallback createcameracapturecallback, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, createcameracapturecallback, component4Var, component7Var, virtualCameraCaptureResult);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, createcameracapturecallback, component4Var, component7Var, virtualCameraCaptureResult);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        long jLongValue3 = ((Number) objArr[5]).longValue();
        handshake handshakeVar = (handshake) objArr[6];
        Integer num = (Integer) objArr[7];
        createCameraCaptureCallback createcameracapturecallback = (createCameraCaptureCallback) objArr[8];
        float fFloatValue = ((Number) objArr[9]).floatValue();
        bindChildren bindchildren = (bindChildren) objArr[10];
        use useVar = (use) objArr[11];
        long jLongValue4 = ((Number) objArr[12]).longValue();
        int iIntValue = ((Number) objArr[13]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[14]).booleanValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[15];
        Function1 function1 = (Function1) objArr[16];
        int iIntValue2 = ((Number) objArr[17]).intValue();
        int iIntValue3 = ((Number) objArr[18]).intValue();
        int iIntValue4 = ((Number) objArr[19]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[20];
        ((Number) objArr[21]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, gethumanreadablename, jLongValue, jLongValue2, jLongValue3, handshakeVar, num, createcameracapturecallback, fFloatValue, bindchildren, useVar, jLongValue4, iIntValue, zBooleanValue, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue3), iIntValue4);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, handshake handshakeVar, Integer num, createCameraCaptureCallback createcameracapturecallback, float f, bindChildren bindchildren, use useVar, long j4, int i, boolean z, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, gethumanreadablename, j, j2, j3, handshakeVar, num, createcameracapturecallback, f, bindchildren, useVar, j4, i, z, graphicDeviceInfo, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(surfaceProcessorNodeOut);
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static final int onExtraCallbackWithResult(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        Float fValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Iterator<Integer> it = RangesKt___RangesKt.until(0, surfaceProcessorNodeOut.IAuthTabCallbackDefault()).iterator();
        if (it.hasNext()) {
            IntIterator intIterator = (IntIterator) it;
            float fOnExtraCallback = onExtraCallback(surfaceProcessorNodeOut, intIterator.nextInt());
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 5;
            }
            while (it.hasNext()) {
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                fOnExtraCallback = Math.max(fOnExtraCallback, onExtraCallback(surfaceProcessorNodeOut, intIterator.nextInt()));
            }
            fValueOf = Float.valueOf(fOnExtraCallback);
            int i6 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return (int) fValueOf.floatValue();
        }
        return 0;
    }

    public static final float onExtraCallback(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        float fAbs = Math.abs(surfaceProcessorNodeOut.onTransact(i) - surfaceProcessorNodeOut.asInterface(i));
        int i5 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return fAbs;
        }
        throw null;
    }

    private static final Unit onExtraCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable handshake handshakeVar, @Nullable Integer num, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, int i, boolean z, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        int i21;
        int i22;
        int i23;
        int i24;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final long j7;
        final handshake handshakeVar2;
        final Integer num2;
        final createCameraCaptureCallback createcameracapturecallback2;
        final float f2;
        final bindChildren bindchildren2;
        use useVar2;
        final long j8;
        final int i25;
        final boolean z3;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        handshake handshakeVarIAuthTabCallback;
        Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        int i26;
        createCameraCaptureCallback createcameracapturecallback3;
        bindChildren bindchildren3;
        float f3;
        int i27;
        GraphicDeviceInfo graphicDeviceInfo3;
        boolean z4;
        long j9;
        long j10;
        long j11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Integer num3;
        long j12;
        int i28;
        int i29 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1743363971);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i30 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                i28 = 4;
            } else {
                i28 = 2;
            }
            i5 = i28 | i2;
        } else {
            i5 = i2;
        }
        int i32 = i4 & 2;
        if (i32 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i5 |= ((i4 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 256 : 128;
            }
            i6 = i4 & 8;
            int i33 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i34 = Http2.INITIAL_MAX_FRAME_SIZE;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        i9 = i32;
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? Imgproc.FLOODFILL_MASK_ONLY : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i5 |= ((i4 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(handshakeVar)) ? 1048576 : 524288;
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        int i35 = IAuthTabCallback + 125;
                        onExtraCallbackWithResult = i35 % 128;
                        if (i35 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num);
                            throw null;
                        }
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(num) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(createcameracapturecallback)) {
                            i12 = 33554432;
                        } else {
                            int i36 = onExtraCallbackWithResult + 39;
                            IAuthTabCallback = i36 % 128;
                            if (i36 % 2 != 0) {
                                throw null;
                            }
                            i12 = 67108864;
                        }
                        i5 |= i12;
                    }
                    i13 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                    if (i13 == 0) {
                        i5 |= 805306368;
                    } else {
                        if ((i2 & 805306368) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                                int i37 = IAuthTabCallback + 69;
                                onExtraCallbackWithResult = i37 % 128;
                                if (i37 % 2 == 0) {
                                    throw null;
                                }
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i15 = i14 | i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            int i38 = onExtraCallbackWithResult + 49;
                            IAuthTabCallback = i38 % 128;
                            int i39 = i38 % 2;
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 4 : 2) | i3;
                        } else {
                            i17 = i3;
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                            int i40 = IAuthTabCallback + 43;
                            onExtraCallbackWithResult = i40 % 128;
                            i17 = i40 % 2 == 0 ? i17 | 98 : i17 | 48;
                        } else {
                            if ((i3 & 48) == 0) {
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 32 : 16;
                            }
                            i19 = i4 & 4096;
                            if (i19 == 0) {
                                i17 |= 384;
                            } else if ((i3 & 384) == 0) {
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 256 : 128;
                            }
                            i20 = i4 & TTHistoryActivity2.SIZE;
                            if (i20 == 0) {
                                int i41 = onExtraCallbackWithResult + 67;
                                IAuthTabCallback = i41 % 128;
                                int i42 = i41 % 2;
                                i17 |= 3072;
                            } else {
                                if ((i3 & 3072) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                                        z2 = true;
                                        int i43 = onExtraCallbackWithResult + 1;
                                        IAuthTabCallback = i43 % 128;
                                        if (i43 % 2 != 0) {
                                            i33 = 26662;
                                        }
                                    } else {
                                        z2 = true;
                                        i33 = 1024;
                                    }
                                    i17 |= i33;
                                }
                                i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                                if (i21 == 0) {
                                    if ((i3 & 24576) == 0) {
                                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                                            i34 = 8192;
                                        }
                                        i17 |= i34;
                                    }
                                    i22 = i4 & 32768;
                                    if (i22 == 0) {
                                        i17 |= 196608;
                                    } else if ((i3 & 196608) == 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo)) {
                                            int i44 = IAuthTabCallback + 33;
                                            onExtraCallbackWithResult = i44 % 128;
                                            int i45 = i44 % 2;
                                            i23 = Imgproc.FLOODFILL_MASK_ONLY;
                                        } else {
                                            i23 = 65536;
                                        }
                                        i17 |= i23;
                                    }
                                    i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                                    if (i24 == 0) {
                                        i17 |= 1572864;
                                    } else if ((i3 & 1572864) == 0) {
                                        i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        gethumanreadablename2 = gethumanreadablename;
                                        j5 = j;
                                        j6 = j2;
                                        j7 = j3;
                                        handshakeVar2 = handshakeVar;
                                        num2 = num;
                                        createcameracapturecallback2 = createcameracapturecallback;
                                        f2 = f;
                                        bindchildren2 = bindchildren;
                                        useVar2 = useVar;
                                        j8 = j4;
                                        i25 = i;
                                        z3 = z;
                                        graphicDeviceInfo2 = graphicDeviceInfo;
                                        function12 = function1;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                        if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            if ((i4 & 4) != 0) {
                                                gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                i15 &= -897;
                                            } else {
                                                gethumanreadablename3 = gethumanreadablename;
                                            }
                                            long jOnTransact = i6 != 0 ? setByteOrder.Companion.onTransact() : j;
                                            long jOnNavigationEvent = i7 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                            long jOnNavigationEvent2 = i8 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                            if ((i4 & 64) != 0) {
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                int i46 = IAuthTabCallback + 15;
                                                onExtraCallbackWithResult = i46 % 128;
                                                int i47 = i46 % 2;
                                                handshakeVarIAuthTabCallback = handshake.Companion.IAuthTabCallback();
                                                i15 &= -3670017;
                                            } else {
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                handshakeVarIAuthTabCallback = handshakeVar;
                                            }
                                            Integer num4 = i10 != 0 ? null : num;
                                            createCameraCaptureCallback createcameracapturecallback4 = i11 != 0 ? null : createcameracapturecallback;
                                            float fOnExtraCallback = i13 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                            bindChildren bindchildren4 = i16 != 0 ? null : bindchildren;
                                            use useVar3 = i18 != 0 ? null : useVar;
                                            long jOnNavigationEvent3 = i19 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                            int iOnWarmupCompleted = i20 != 0 ? AppLovinVastMediaViewf.Companion.onWarmupCompleted() : i;
                                            if (i21 == 0) {
                                                z2 = z;
                                            }
                                            GraphicDeviceInfo graphicDeviceInfo4 = i22 != 0 ? null : graphicDeviceInfo;
                                            if (i24 != 0) {
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda5
                                                        private static int onExtraCallback = 0;
                                                        private static int onExtraCallbackWithResult = 1;

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i48 = 2 % 2;
                                                            int i49 = onExtraCallback + 93;
                                                            onExtraCallbackWithResult = i49 % 128;
                                                            int i50 = i49 % 2;
                                                            Unit unitOnNavigationEvent = AFh1wSDK.onNavigationEvent((SurfaceProcessorNodeOut) obj);
                                                            int i51 = onExtraCallback + 35;
                                                            onExtraCallbackWithResult = i51 % 128;
                                                            int i52 = i51 % 2;
                                                            return unitOnNavigationEvent;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                i26 = i15;
                                                bindchildren3 = bindchildren4;
                                                useVar2 = useVar3;
                                                f3 = fOnExtraCallback;
                                                i27 = iOnWarmupCompleted;
                                                graphicDeviceInfo3 = graphicDeviceInfo4;
                                                function13 = (Function1) objOnMinimized;
                                                z4 = z2;
                                                j9 = jOnNavigationEvent;
                                                j10 = jOnNavigationEvent2;
                                                j11 = jOnNavigationEvent3;
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                num3 = num4;
                                                createcameracapturecallback3 = createcameracapturecallback4;
                                            } else {
                                                function13 = function1;
                                                i26 = i15;
                                                createcameracapturecallback3 = createcameracapturecallback4;
                                                bindchildren3 = bindchildren4;
                                                useVar2 = useVar3;
                                                f3 = fOnExtraCallback;
                                                i27 = iOnWarmupCompleted;
                                                graphicDeviceInfo3 = graphicDeviceInfo4;
                                                z4 = z2;
                                                j9 = jOnNavigationEvent;
                                                j10 = jOnNavigationEvent2;
                                                j11 = jOnNavigationEvent3;
                                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                num3 = num4;
                                            }
                                            j12 = jOnTransact;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i4 & 4) != 0) {
                                                i15 &= -897;
                                            }
                                            if ((i4 & 64) != 0) {
                                                i15 &= -3670017;
                                            }
                                            gethumanreadablename3 = gethumanreadablename;
                                            j12 = j;
                                            j9 = j2;
                                            j10 = j3;
                                            handshakeVarIAuthTabCallback = handshakeVar;
                                            num3 = num;
                                            createcameracapturecallback3 = createcameracapturecallback;
                                            f3 = f;
                                            bindchildren3 = bindchildren;
                                            useVar2 = useVar;
                                            j11 = j4;
                                            i27 = i;
                                            z4 = z;
                                            graphicDeviceInfo3 = graphicDeviceInfo;
                                            function13 = function1;
                                            i26 = i15;
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1743363971, i26, i17, "im.toss.tosssecurities.utils.string.WrapWidthTextV2 (TextLayoutResult.kt:54)");
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        }
                                        createCameraCaptureCallback createcameracapturecallback5 = createcameracapturecallback3;
                                        float f4 = f3;
                                        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport04, gethumanreadablename3, j12, j9, j10, handshakeVarIAuthTabCallback, num3, createcameracapturecallback5, f4, bindchildren3, useVar2, j11, i27, z4, graphicDeviceInfo3, function13, cameraCaptureResultEmptyCameraCaptureResult2, i26 & 2147483632, i17 & 4194302, 0);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        createcameracapturecallback2 = createcameracapturecallback5;
                                        j7 = j10;
                                        num2 = num3;
                                        handshakeVar2 = handshakeVarIAuthTabCallback;
                                        j8 = j11;
                                        i25 = i27;
                                        z3 = z4;
                                        graphicDeviceInfo2 = graphicDeviceInfo3;
                                        function12 = function13;
                                        f2 = f4;
                                        j6 = j9;
                                        j5 = j12;
                                        gethumanreadablename2 = gethumanreadablename3;
                                        bindchildren2 = bindchildren3;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        final use useVar4 = useVar2;
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda6
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                int i48 = 2 % 2;
                                                int i49 = onExtraCallbackWithResult + 113;
                                                onExtraCallback = i49 % 128;
                                                int i50 = i49 % 2;
                                                Unit unitOnExtraCallback = AFh1wSDK.onExtraCallback(str, quirksExternalSyntheticBackport02, gethumanreadablename2, j5, j6, j7, handshakeVar2, num2, createcameracapturecallback2, f2, bindchildren2, useVar4, j8, i25, z3, graphicDeviceInfo2, function12, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                                int i51 = onExtraCallbackWithResult + 85;
                                                onExtraCallback = i51 % 128;
                                                int i52 = i51 % 2;
                                                return unitOnExtraCallback;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i17 |= 24576;
                                i22 = i4 & 32768;
                                if (i22 == 0) {
                                }
                                i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                                if (i24 == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            z2 = true;
                            i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                            if (i21 == 0) {
                            }
                            i22 = i4 & 32768;
                            if (i22 == 0) {
                            }
                            i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                            if (i24 == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i19 = i4 & 4096;
                        if (i19 == 0) {
                        }
                        i20 = i4 & TTHistoryActivity2.SIZE;
                        if (i20 == 0) {
                        }
                        z2 = true;
                        i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                        if (i21 == 0) {
                        }
                        i22 = i4 & 32768;
                        if (i22 == 0) {
                        }
                        i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                        if (i24 == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i15 = i5;
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i4 & 4096;
                    if (i19 == 0) {
                    }
                    i20 = i4 & TTHistoryActivity2.SIZE;
                    if (i20 == 0) {
                    }
                    z2 = true;
                    i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i21 == 0) {
                    }
                    i22 = i4 & 32768;
                    if (i22 == 0) {
                    }
                    i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                    if (i24 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i9 = i32;
                if ((i2 & 1572864) == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i13 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                if (i13 == 0) {
                }
                i15 = i5;
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                i19 = i4 & 4096;
                if (i19 == 0) {
                }
                i20 = i4 & TTHistoryActivity2.SIZE;
                if (i20 == 0) {
                }
                z2 = true;
                i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i21 == 0) {
                }
                i22 = i4 & 32768;
                if (i22 == 0) {
                }
                i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                if (i24 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i4 & 16;
            int i342 = Http2.INITIAL_MAX_FRAME_SIZE;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i32;
            if ((i2 & 1572864) == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i13 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
            if (i13 == 0) {
            }
            i15 = i5;
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            i19 = i4 & 4096;
            if (i19 == 0) {
            }
            i20 = i4 & TTHistoryActivity2.SIZE;
            if (i20 == 0) {
            }
            z2 = true;
            i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i21 == 0) {
            }
            i22 = i4 & 32768;
            if (i22 == 0) {
            }
            i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
            if (i24 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        i6 = i4 & 8;
        int i332 = 2048;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i3422 = Http2.INITIAL_MAX_FRAME_SIZE;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i32;
        if ((i2 & 1572864) == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i13 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
        if (i13 == 0) {
        }
        i15 = i5;
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        i19 = i4 & 4096;
        if (i19 == 0) {
        }
        i20 = i4 & TTHistoryActivity2.SIZE;
        if (i20 == 0) {
        }
        z2 = true;
        i21 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i21 == 0) {
        }
        i22 = i4 & 32768;
        if (i22 == 0) {
        }
        i24 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
        if (i24 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i15 & 306783379) == 306783378 || (599187 & i17) != 599186) ? z2 : false, i15 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final component8 onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final createCameraCaptureCallback createcameracapturecallback, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int interfaceDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        Integer num = (Integer) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1913087455, 1913087455, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor});
        if (num != null) {
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                num.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            interfaceDescriptor = num.intValue();
        } else {
            interfaceDescriptor = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
        }
        final int i5 = interfaceDescriptor;
        return component4.IAuthTabCallback(component4Var, i5, getstreamsharingchildrenOnExtraCallback.T_(), (Map) null, new Function1() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                createCameraCaptureCallback createcameracapturecallback2 = createcameracapturecallback;
                if (i8 != 0) {
                    return AFh1wSDK.onExtraCallback(createcameracapturecallback2, getstreamsharingchildrenOnExtraCallback, i5, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                }
                Unit unitOnExtraCallback = AFh1wSDK.onExtraCallback(createcameracapturecallback2, getstreamsharingchildrenOnExtraCallback, i5, (getStreamSharingChildren.onExtraCallbackWithResult) obj2);
                int i9 = 0 / 0;
                return unitOnExtraCallback;
            }
        }, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(createCameraCaptureCallback createcameracapturecallback, getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
        int iOnExtraCallback = iAuthTabCallback.onExtraCallback();
        if (createcameracapturecallback == null) {
            int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            if (createcameracapturecallback == null) {
                int i5 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else if (createCameraCaptureCallback.onExtraCallbackWithResult(createcameracapturecallback.asInterface(), iOnNavigationEvent)) {
                i2 = -(getstreamsharingchildren.getInterfaceDescriptor() - i);
                i3 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
            }
            int i7 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            if (createcameracapturecallback != null && createCameraCaptureCallback.onExtraCallbackWithResult(createcameracapturecallback.asInterface(), iIAuthTabCallback)) {
                int i9 = IAuthTabCallback + 55;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                i2 = (-(getstreamsharingchildren.getInterfaceDescriptor() - i)) / 2;
            } else {
                i2 = 0;
            }
            i3 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i3 % 128;
        } else {
            boolean zOnExtraCallbackWithResult = createCameraCaptureCallback.onExtraCallbackWithResult(createcameracapturecallback.asInterface(), iOnExtraCallback);
            int i11 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            if (!zOnExtraCallbackWithResult) {
            }
        }
        int i13 = i3 % 2;
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, i2, 0, 0.0f, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, Integer.valueOf(onExtraCallbackWithResult(surfaceProcessorNodeOut)));
        function1.invoke(surfaceProcessorNodeOut);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r2
      0x0044: PHI (r2v24 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v25 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r2
      0x0038: PHI (r2v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r2v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r2v25 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable handshake handshakeVar, @Nullable Integer num, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, int i, boolean z, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function1<? super SurfaceProcessorNodeOut, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final long j7;
        final handshake handshakeVar2;
        final Integer num2;
        final createCameraCaptureCallback createcameracapturecallback2;
        final float f2;
        final bindChildren bindchildren2;
        final use useVar2;
        final long j8;
        final int i23;
        final boolean z2;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function12;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        handshake handshakeVarIAuthTabCallback;
        bindChildren bindchildren3;
        boolean z3;
        Integer num3;
        float f3;
        use useVar3;
        bindChildren bindchildren4;
        int i24;
        GraphicDeviceInfo graphicDeviceInfo3;
        long j9;
        long j10;
        long j11;
        long j12;
        final Function1<? super SurfaceProcessorNodeOut, Unit> function13;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getHumanReadableName gethumanreadablename4;
        handshake handshakeVar3;
        final createCameraCaptureCallback createcameracapturecallback3;
        int i25 = 2 % 2;
        int i26 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i26 % 128;
        if (i26 % 2 == 0) {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-76551667);
            if ((i2 & 84) == 0) {
                i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i5 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(hasprovider, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-76551667);
            if ((i2 & 6) == 0) {
            }
        }
        int i27 = i4 & 2;
        if (i27 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            int i28 = 256;
            if ((i2 & 384) == 0) {
                i5 |= ((i4 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(gethumanreadablename)) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j) ? 2048 : 1024;
            }
            i7 = i4 & 16;
            int i29 = Http2.INITIAL_MAX_FRAME_SIZE;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    int i30 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i30 % 128;
                    if (i30 % 2 != 0) {
                        throw null;
                    }
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j3) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                    }
                    if ((i2 & 1572864) == 0) {
                        i5 |= ((i4 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(handshakeVar)) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(num) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(createcameracapturecallback) ? 67108864 : 33554432;
                    }
                    i11 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else {
                        if ((i2 & 805306368) == 0) {
                            int i31 = onExtraCallbackWithResult + 19;
                            IAuthTabCallback = i31 % 128;
                            int i32 = i31 % 2;
                            i5 |= cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f) ? 536870912 : 268435456;
                        }
                        i12 = i4 & 1024;
                        if (i12 != 0) {
                            i13 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i13 = i3 | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(bindchildren) ? 4 : 2);
                        } else {
                            i13 = i3;
                        }
                        i14 = i4 & 2048;
                        if (i14 != 0) {
                            i13 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i13 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(useVar) ? 32 : 16;
                        }
                        i15 = i13;
                        i16 = i4 & 4096;
                        if (i16 != 0) {
                            i15 |= 384;
                        } else {
                            if ((i3 & 384) == 0) {
                                int i33 = onExtraCallbackWithResult + 85;
                                i17 = i16;
                                IAuthTabCallback = i33 % 128;
                                int i34 = i33 % 2;
                                boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j4);
                                if (i34 != 0) {
                                    int i35 = 15 / 0;
                                    if (!zOnWarmupCompleted) {
                                        i28 = 128;
                                    }
                                    i15 |= i28;
                                } else {
                                    if (!zOnWarmupCompleted) {
                                    }
                                    i15 |= i28;
                                }
                            }
                            i18 = i4 & TTHistoryActivity2.SIZE;
                            if (i18 == 0) {
                                i15 |= 3072;
                            } else {
                                if ((i3 & 3072) == 0) {
                                    i15 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(i) ? 2048 : 1024;
                                }
                                i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                                if (i19 != 0) {
                                    i15 |= 24576;
                                } else {
                                    if ((i3 & 24576) == 0) {
                                        int i36 = onExtraCallbackWithResult + 41;
                                        IAuthTabCallback = i36 % 128;
                                        int i37 = i36 % 2;
                                        if (!cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z)) {
                                            i29 = 8192;
                                        }
                                        i15 |= i29;
                                    }
                                    i20 = 32768 & i4;
                                    if (i20 == 0) {
                                        i15 |= 196608;
                                    } else if ((i3 & 196608) == 0) {
                                        i15 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(graphicDeviceInfo) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                                    }
                                    i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                                    if (i21 != 0) {
                                        i22 = i20;
                                        if ((1572864 & i3) == 0) {
                                            i15 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function1) ? 1048576 : 524288;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStub();
                                            if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResult2.onPostMessage()) {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i27 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                if ((i4 & 4) != 0) {
                                                    int i38 = IAuthTabCallback + 29;
                                                    onExtraCallbackWithResult = i38 % 128;
                                                    int i39 = i38 % 2;
                                                    gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                    i5 &= -897;
                                                } else {
                                                    gethumanreadablename3 = gethumanreadablename;
                                                }
                                                if (i6 != 0) {
                                                    int i40 = onExtraCallbackWithResult + 49;
                                                    IAuthTabCallback = i40 % 128;
                                                    if (i40 % 2 != 0) {
                                                        setByteOrder.Companion.onTransact();
                                                        throw null;
                                                    }
                                                    jOnTransact = setByteOrder.Companion.onTransact();
                                                } else {
                                                    jOnTransact = j;
                                                }
                                                long jOnNavigationEvent = i7 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                long jOnNavigationEvent2 = i8 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                if ((i4 & 64) != 0) {
                                                    handshakeVarIAuthTabCallback = handshake.Companion.IAuthTabCallback();
                                                    i5 &= -3670017;
                                                } else {
                                                    handshakeVarIAuthTabCallback = handshakeVar;
                                                }
                                                Integer num4 = i9 != 0 ? null : num;
                                                createCameraCaptureCallback createcameracapturecallback4 = i10 != 0 ? null : createcameracapturecallback;
                                                float fOnExtraCallback = i11 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                if (i12 != 0) {
                                                    int i41 = onExtraCallbackWithResult + 93;
                                                    IAuthTabCallback = i41 % 128;
                                                    int i42 = i41 % 2;
                                                    bindchildren3 = null;
                                                } else {
                                                    bindchildren3 = bindchildren;
                                                }
                                                use useVar4 = i14 != 0 ? null : useVar;
                                                long jOnNavigationEvent3 = i17 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                int iOnWarmupCompleted = i18 != 0 ? AppLovinVastMediaViewf.Companion.onWarmupCompleted() : i;
                                                boolean z4 = i19 != 0 ? true : z;
                                                GraphicDeviceInfo graphicDeviceInfo4 = i22 != 0 ? null : graphicDeviceInfo;
                                                if (i21 != 0) {
                                                    boolean z5 = z4;
                                                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda1
                                                            private static int onExtraCallback = 0;
                                                            private static int onNavigationEvent = 1;

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                int i43 = 2 % 2;
                                                                int i44 = onExtraCallback + 101;
                                                                onNavigationEvent = i44 % 128;
                                                                int i45 = i44 % 2;
                                                                int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                                                                int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                                                                int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
                                                                Unit unit = (Unit) AFh1wSDK.IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1216068996, 1216068999, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{(SurfaceProcessorNodeOut) obj});
                                                                int i46 = onExtraCallback + 65;
                                                                onNavigationEvent = i46 % 128;
                                                                if (i46 % 2 == 0) {
                                                                    int i47 = 8 / 0;
                                                                }
                                                                return unit;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                                                    }
                                                    z3 = z5;
                                                    num3 = num4;
                                                    f3 = fOnExtraCallback;
                                                    useVar3 = useVar4;
                                                    bindchildren4 = bindchildren3;
                                                    i24 = iOnWarmupCompleted;
                                                    graphicDeviceInfo3 = graphicDeviceInfo4;
                                                    j9 = jOnTransact;
                                                    j10 = jOnNavigationEvent;
                                                    j11 = jOnNavigationEvent2;
                                                    j12 = jOnNavigationEvent3;
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                                    function13 = (Function1) objOnMinimized;
                                                } else {
                                                    z3 = z4;
                                                    num3 = num4;
                                                    f3 = fOnExtraCallback;
                                                    useVar3 = useVar4;
                                                    bindchildren4 = bindchildren3;
                                                    i24 = iOnWarmupCompleted;
                                                    graphicDeviceInfo3 = graphicDeviceInfo4;
                                                    j9 = jOnTransact;
                                                    j10 = jOnNavigationEvent;
                                                    j11 = jOnNavigationEvent2;
                                                    j12 = jOnNavigationEvent3;
                                                    function13 = function1;
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                }
                                                gethumanreadablename4 = gethumanreadablename3;
                                                handshakeVar3 = handshakeVarIAuthTabCallback;
                                                createcameracapturecallback3 = createcameracapturecallback4;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                                if ((i4 & 4) != 0) {
                                                    i5 &= -897;
                                                }
                                                if ((i4 & 64) != 0) {
                                                    i5 &= -3670017;
                                                }
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                gethumanreadablename4 = gethumanreadablename;
                                                j9 = j;
                                                j10 = j2;
                                                j11 = j3;
                                                handshakeVar3 = handshakeVar;
                                                num3 = num;
                                                createcameracapturecallback3 = createcameracapturecallback;
                                                f3 = f;
                                                bindchildren4 = bindchildren;
                                                useVar3 = useVar;
                                                j12 = j4;
                                                i24 = i;
                                                z3 = z;
                                                graphicDeviceInfo3 = graphicDeviceInfo;
                                                function13 = function1;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-76551667, i5, i15, "im.toss.tosssecurities.utils.string.WrapWidthTextV2 (TextLayoutResult.kt:98)");
                                            }
                                            boolean z6 = (i5 & 14) == 4;
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                            if (z6 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                                                objOnMinimized2 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                                            }
                                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                            boolean z7 = (234881024 & i5) == 67108864;
                                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                            if ((zOnNavigationEvent | z7) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized3 = new getBacktraceNote() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda2
                                                    private static int onExtraCallbackWithResult = 0;
                                                    private static int onWarmupCompleted = 1;

                                                    @Override // o.getBacktraceNote
                                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                        int i43 = 2 % 2;
                                                        int i44 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                                                        onWarmupCompleted = i44 % 128;
                                                        int i45 = i44 % 2;
                                                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                                                        if (i45 != 0) {
                                                            return AFh1wSDK.onExtraCallback(getsupportedhighspeedresolutionsfor2, createcameracapturecallback3, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                                                        }
                                                        AFh1wSDK.onExtraCallback(getsupportedhighspeedresolutionsfor2, createcameracapturecallback3, (component4) obj, (component7) obj2, (VirtualCameraCaptureResult) obj3);
                                                        throw null;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                                            }
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport03, (getBacktraceNote) objOnMinimized3);
                                            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                                            boolean z8 = (3670016 & i15) == 1048576;
                                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                            if (!(zOnNavigationEvent2 | z8)) {
                                                int i43 = IAuthTabCallback + 77;
                                                onExtraCallbackWithResult = i43 % 128;
                                                if (i43 % 2 == 0) {
                                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                    throw null;
                                                }
                                                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized4 = new Function1() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda3
                                                        private static int onExtraCallbackWithResult = 0;
                                                        private static int onNavigationEvent = 1;

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            int i44 = 2 % 2;
                                                            int i45 = onExtraCallbackWithResult + 113;
                                                            onNavigationEvent = i45 % 128;
                                                            if (i45 % 2 == 0) {
                                                                AFh1wSDK.onExtraCallbackWithResult(function13, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj);
                                                                throw null;
                                                            }
                                                            Unit unitOnExtraCallbackWithResult = AFh1wSDK.onExtraCallbackWithResult(function13, getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj);
                                                            int i46 = onExtraCallbackWithResult + 57;
                                                            onNavigationEvent = i46 % 128;
                                                            if (i46 % 2 != 0) {
                                                                return unitOnExtraCallbackWithResult;
                                                            }
                                                            throw null;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                                }
                                                Function1<? super SurfaceProcessorNodeOut, Unit> function14 = function13;
                                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                                createCameraCaptureCallback createcameracapturecallback5 = createcameracapturecallback3;
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                                                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0OnWarmupCompleted, gethumanreadablename4, j9, j10, j11, handshakeVar3, num3, createcameracapturecallback3, f3, (Map) null, bindchildren4, useVar3, j12, i24, z3, graphicDeviceInfo3, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult3, i5 & 2147483534, (i15 << 3) & 4194288, 1024);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                gethumanreadablename2 = gethumanreadablename4;
                                                handshakeVar2 = handshakeVar3;
                                                function12 = function14;
                                                num2 = num3;
                                                createcameracapturecallback2 = createcameracapturecallback5;
                                                j5 = j9;
                                                j6 = j10;
                                                j7 = j11;
                                                f2 = f3;
                                                bindchildren2 = bindchildren4;
                                                useVar2 = useVar3;
                                                j8 = j12;
                                                i23 = i24;
                                                z2 = z3;
                                                graphicDeviceInfo2 = graphicDeviceInfo3;
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            gethumanreadablename2 = gethumanreadablename;
                                            j5 = j;
                                            j6 = j2;
                                            j7 = j3;
                                            handshakeVar2 = handshakeVar;
                                            num2 = num;
                                            createcameracapturecallback2 = createcameracapturecallback;
                                            f2 = f;
                                            bindchildren2 = bindchildren;
                                            useVar2 = useVar;
                                            j8 = j4;
                                            i23 = i;
                                            z2 = z;
                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                            function12 = function1;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.utils.string.TextLayoutResultKt$$ExternalSyntheticLambda4
                                                private static int onExtraCallback = 0;
                                                private static int onWarmupCompleted = 1;

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    int i44 = 2 % 2;
                                                    int i45 = onExtraCallback + 77;
                                                    onWarmupCompleted = i45 % 128;
                                                    int i46 = i45 % 2;
                                                    Unit unitIAuthTabCallback = AFh1wSDK.IAuthTabCallback(hasprovider, quirksExternalSyntheticBackport02, gethumanreadablename2, j5, j6, j7, handshakeVar2, num2, createcameracapturecallback2, f2, bindchildren2, useVar2, j8, i23, z2, graphicDeviceInfo2, function12, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                                    int i47 = onExtraCallback + 103;
                                                    onWarmupCompleted = i47 % 128;
                                                    if (i47 % 2 != 0) {
                                                        return unitIAuthTabCallback;
                                                    }
                                                    Object obj3 = null;
                                                    obj3.hashCode();
                                                    throw null;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    int i44 = onExtraCallbackWithResult + 3;
                                    i22 = i20;
                                    IAuthTabCallback = i44 % 128;
                                    if (i44 % 2 != 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i15 |= 1572864;
                                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i20 = 32768 & i4;
                                if (i20 == 0) {
                                }
                                i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                                if (i21 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                            if (i19 != 0) {
                            }
                            i20 = 32768 & i4;
                            if (i20 == 0) {
                            }
                            i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                            if (i21 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i17 = i16;
                        i18 = i4 & TTHistoryActivity2.SIZE;
                        if (i18 == 0) {
                        }
                        i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                        if (i19 != 0) {
                        }
                        i20 = 32768 & i4;
                        if (i20 == 0) {
                        }
                        i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                        if (i21 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i12 = i4 & 1024;
                    if (i12 != 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 != 0) {
                    }
                    i15 = i13;
                    i16 = i4 & 4096;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i4 & TTHistoryActivity2.SIZE;
                    if (i18 == 0) {
                    }
                    i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i19 != 0) {
                    }
                    i20 = 32768 & i4;
                    if (i20 == 0) {
                    }
                    i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                    if (i21 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                if ((i2 & 1572864) == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                if (i11 == 0) {
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                }
                i15 = i13;
                i16 = i4 & 4096;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i4 & TTHistoryActivity2.SIZE;
                if (i18 == 0) {
                }
                i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i19 != 0) {
                }
                i20 = 32768 & i4;
                if (i20 == 0) {
                }
                i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
                if (i21 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
            if (i11 == 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            i15 = i13;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i4 & TTHistoryActivity2.SIZE;
            if (i18 == 0) {
            }
            i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i19 != 0) {
            }
            i20 = 32768 & i4;
            if (i20 == 0) {
            }
            i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
            if (i21 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        int i282 = 256;
        if ((i2 & 384) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i292 = Http2.INITIAL_MAX_FRAME_SIZE;
        if (i7 == 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i11 = i4 & Imgcodecs.IMWRITE_AVIF_QUALITY;
        if (i11 == 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        i15 = i13;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i4 & TTHistoryActivity2.SIZE;
        if (i18 == 0) {
        }
        i19 = i4 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i19 != 0) {
        }
        i20 = 32768 & i4;
        if (i20 == 0) {
        }
        i21 = i4 & Imgproc.FLOODFILL_FIXED_RANGE;
        if (i21 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i15) == 599186) ? false : true, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer num = (Integer) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(num);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1216068996, 1216068999, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{surfaceProcessorNodeOut});
    }

    private static final Unit onExtraCallbackWithResult(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getHumanReadableName gethumanreadablename, long j, long j2, long j3, handshake handshakeVar, Integer num, createCameraCaptureCallback createcameracapturecallback, float f, bindChildren bindchildren, use useVar, long j4, int i, boolean z, GraphicDeviceInfo graphicDeviceInfo, Function1 function1, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {str, quirksExternalSyntheticBackport0, gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), handshakeVar, num, createcameracapturecallback, Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), Integer.valueOf(i), Boolean.valueOf(z), graphicDeviceInfo, function1, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1093623132, 1093623134, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr);
    }

    private static final Unit onWarmupCompleted(SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1389521780, -1389521779, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{surfaceProcessorNodeOut});
    }

    private static final Integer onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
        return (Integer) IAuthTabCallback(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -1913087455, 1913087455, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutionsfor});
    }
}
