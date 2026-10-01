package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.semantics.Role;
import com.tmoney.a;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.AFf1ySDK;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda4;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.setTaggedAddrCtrl;
import o.setUseCaseAttached;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1ySDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final deprecated_dns onWarmupCompleted = new deprecated_dns(1000.0d, 52.0d);

    private static final Unit IAuthTabCallback(int i, float f, float f2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, Function1 function12, setTaggedAddrCtrl settaggedaddrctrl, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 77;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(i, f, f2, function1, quirksExternalSyntheticBackport0, j, j2, function12, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 69;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 12 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(int i, boolean z, String str, Function0 function0, setTaggedAddrCtrl settaggedaddrctrl, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(i, z, str, function0, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2));
        } else {
            onExtraCallbackWithResult(i, z, str, function0, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, String str, Function0 function0, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, str, function0, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = i8 | i2;
        int i10 = (~(i7 | i8)) | (~(i7 | i2)) | (~i9);
        int i11 = ~i2;
        int i12 = (~(i3 | i11 | i4)) | (~(i7 | i11 | i8)) | (~(i9 | i4));
        int i13 = ~(i8 | i11 | i4);
        int i14 = i2 + i4 + i6 + ((-973178360) * i) + (1542423572 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i2) - 1073741824) + ((-187520530) * i4) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i6) + (1207959552 * i) + ((-1275068416) * i5) + (196542464 * i15);
        int i17 = (i2 * (-490823948)) + 944362368 + (i4 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i6 * (-490822951)) + (i * 2145288392) + (i5 * 779328756) + (i15 * (-1138819072));
        int i18 = i16 + (i17 * i17 * 1440284672);
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? i18 != 5 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }
        float fFloatValue = ((Number) objArr[0]).floatValue();
        long jLongValue = ((Number) objArr[1]).longValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i19 = 2 % 2;
        int i20 = onExtraCallback + 47;
        onNavigationEvent = i20 % 128;
        if (i20 % 2 != 0) {
            onExtraCallback(new Object[]{Float.valueOf(fFloatValue), Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, a.3.onWarmupCompleted(), -1140553284, a.3.onWarmupCompleted(), 1140553285, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
        } else {
            onExtraCallback(new Object[]{Float.valueOf(fFloatValue), Long.valueOf(jLongValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, a.3.onWarmupCompleted(), -1140553284, a.3.onWarmupCompleted(), 1140553285, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{function1, Integer.valueOf(i)}, a.3.onWarmupCompleted(), -546696852, a.3.onWarmupCompleted(), 546696857, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
        int i5 = onNavigationEvent + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ float onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(f);
        }
        onWarmupCompleted(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        List list = (List) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getstreamsharingchildren, cameraPresenceProviderExternalSyntheticLambda6, list, iIntValue, onextracallbackwithresult);
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(float f, long j, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Float fValueOf = Float.valueOf(f);
        Long lValueOf = Long.valueOf(j);
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(new Object[]{fValueOf, lValueOf, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, a.3.onWarmupCompleted(), 452451780, a.3.onWarmupCompleted(), -452451777, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
        int i6 = onNavigationEvent + 37;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, Function1 function1, Function1 function12, setTaggedAddrCtrl settaggedaddrctrl, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, function1, function12, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 91;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ int onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Integer>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onNavigationEvent + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return iOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        Function1 function1 = (Function1) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        long jLongValue = ((Number) objArr[5]).longValue();
        long jLongValue2 = ((Number) objArr[6]).longValue();
        Function1 function12 = (Function1) objArr[7];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int iIntValue3 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue4 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(iIntValue, fFloatValue, fFloatValue2, function1, quirksExternalSyntheticBackport0, jLongValue, jLongValue2, function12, settaggedaddrctrl, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(f, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, boolean z, String str, Function0 function0, setTaggedAddrCtrl settaggedaddrctrl, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, z, str, function0, settaggedaddrctrl, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 35;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ component8 onNavigationEvent(int i, Function1 function1, Function1 function12, setTaggedAddrCtrl settaggedaddrctrl, float f, long j, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallback(i, function1, function12, settaggedaddrctrl, f, j, cameraPresenceProviderExternalSyntheticLambda6, isextrapreviewrequired, virtualCameraCaptureResult);
            obj.hashCode();
            throw null;
        }
        component8 component8VarOnExtraCallback = onExtraCallback(i, function1, function12, settaggedaddrctrl, f, j, cameraPresenceProviderExternalSyntheticLambda6, isextrapreviewrequired, virtualCameraCaptureResult);
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return component8VarOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1IAuthTabCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return function1IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(function0);
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent(function0);
        int i3 = onNavigationEvent + 97;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final deprecated_dns onNavigationEvent() {
        deprecated_dns deprecated_dnsVar;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            deprecated_dnsVar = onWarmupCompleted;
            int i4 = 27 / 0;
        } else {
            deprecated_dnsVar = onWarmupCompleted;
        }
        int i5 = i2 + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_dnsVar;
    }

    public static final class onNavigationEvent implements PointerInputEventHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 IAuthTabCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Integer> onExtraCallbackWithResult;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Function1<Integer, Unit>> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda62) {
            this.IAuthTabCallback = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            this.onNavigationEvent = cameraPresenceProviderExternalSyntheticLambda6;
            this.onExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda62;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setusecaseattached);
            }
            onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setusecaseattached);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.IAuthTabCallback, null);
            final CameraPresenceProviderExternalSyntheticLambda6<Function1<Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6 = this.onNavigationEvent;
            final CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda62 = this.onExtraCallbackWithResult;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, anonymousClass3, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$TossSecTdsToggle$1$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 109;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = AFf1ySDK.onNavigationEvent.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, (setUseCaseAttached) obj);
                    int i5 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, access13800Var, 3, (Object) null);
            if (objOnNavigationEvent != access14100.onExtraCallback()) {
                return Unit.INSTANCE;
            }
            int i2 = onWarmupCompleted + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return objOnNavigationEvent;
        }

        /* renamed from: o.AFf1ySDK$onNavigationEvent$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<Camera2CameraImplExternalSyntheticLambda0, setUseCaseAttached, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            final /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 $interactionSource;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, access13800<? super AnonymousClass3> access13800Var) {
                super(3, access13800Var);
                this.$interactionSource = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            }

            @Override // o.getBacktraceNote
            public /* synthetic */ Object invoke(Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0, setUseCaseAttached setusecaseattached, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onExtraCallback = i2 % 128;
                Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda02 = camera2CameraImplExternalSyntheticLambda0;
                setUseCaseAttached setusecaseattached2 = setusecaseattached;
                if (i2 % 2 == 0) {
                    return onNavigationEvent(camera2CameraImplExternalSyntheticLambda02, setusecaseattached2.onExtraCallback(), access13800Var);
                }
                onNavigationEvent(camera2CameraImplExternalSyntheticLambda02, setusecaseattached2.onExtraCallback(), access13800Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object onNavigationEvent(Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0, long j, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$interactionSource, access13800Var);
                anonymousClass3.L$0 = camera2CameraImplExternalSyntheticLambda0;
                anonymousClass3.J$0 = j;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i2 = onExtraCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
            
                if (r14.onExtraCallbackWithResult(r7, r13) == r5) goto L43;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ea A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted;
                int i;
                int i2;
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    access14100.onExtraCallback();
                    throw null;
                }
                Camera2CameraImplExternalSyntheticLambda0 camera2CameraImplExternalSyntheticLambda0 = (Camera2CameraImplExternalSyntheticLambda0) this.L$0;
                long j = this.J$0;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i5 = this.label;
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted onwarmupcompleted2 = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted(j, (DefaultConstructorMarker) null);
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = this.$interactionSource;
                    this.L$0 = camera2CameraImplExternalSyntheticLambda0;
                    this.L$1 = onwarmupcompleted2;
                    this.J$0 = j;
                    this.label = 1;
                    if (camera2CapturePipelineTorchTaskExternalSyntheticLambda2.onExtraCallbackWithResult(onwarmupcompleted2, this) != objOnExtraCallback) {
                        onwarmupcompleted = onwarmupcompleted2;
                    }
                    i = onExtraCallbackWithResult + 29;
                    onExtraCallback = i % 128;
                    if (i % 2 != 0) {
                    }
                    return objOnExtraCallback;
                }
                int i6 = onExtraCallbackWithResult;
                int i7 = i6 + 123;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0 ? i5 == 1 : i5 == 1) {
                    onwarmupcompleted = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    if (i5 != 2) {
                        int i8 = i6 + 39;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0 ? i5 != 3 : i5 != 5) {
                            if (i5 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        ResultKt.onNavigationEvent(obj);
                        Unit unit = Unit.INSTANCE;
                        i2 = onExtraCallback + 93;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            return unit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    onwarmupcompleted = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onWarmupCompleted) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = this.$interactionSource;
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onNavigationEvent onnavigationevent = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onNavigationEvent(onwarmupcompleted);
                        this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                        this.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
                        this.J$0 = j;
                        this.label = 4;
                    } else {
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = this.$interactionSource;
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback onextracallback = new Camera2CapturePipelineTorchTaskExternalSyntheticLambda4.onExtraCallback(onwarmupcompleted);
                        this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                        this.L$1 = access15400.onNavigationEvent(onwarmupcompleted);
                        this.J$0 = j;
                        this.label = 3;
                        if (camera2CapturePipelineTorchTaskExternalSyntheticLambda23.onExtraCallbackWithResult(onextracallback, this) == objOnExtraCallback) {
                            int i9 = onExtraCallback + 29;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            i = onExtraCallbackWithResult + 29;
                            onExtraCallback = i % 128;
                            if (i % 2 != 0) {
                                int i11 = 57 / 0;
                            }
                            return objOnExtraCallback;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        i2 = onExtraCallback + 93;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    }
                }
                this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda0);
                this.L$1 = onwarmupcompleted;
                this.J$0 = j;
                this.label = 2;
                obj = camera2CameraImplExternalSyntheticLambda0.onNavigationEvent(this);
                if (obj != objOnExtraCallback) {
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                i = onExtraCallbackWithResult + 29;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                }
                return objOnExtraCallback;
            }
        }

        private static final Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setUseCaseAttached setusecaseattached) {
            Function1 function1;
            int iOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                function1 = (Function1) AFf1ySDK.onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, a.3.onWarmupCompleted(), 505189910, a.3.onWarmupCompleted(), -505189906, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
                iOnNavigationEvent = 0 - AFf1ySDK.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
            } else {
                function1 = (Function1) AFf1ySDK.onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, a.3.onWarmupCompleted(), 505189910, a.3.onWarmupCompleted(), -505189906, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
                iOnNavigationEvent = 1 - AFf1ySDK.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
            }
            function1.invoke(Integer.valueOf(iOnNavigationEvent));
            return Unit.INSTANCE;
        }
    }

    private static final float onWarmupCompleted(float f) {
        float interpolation;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            interpolation = onWarmupCompleted.getInterpolation(f);
            int i3 = 50 / 0;
        } else {
            interpolation = onWarmupCompleted.getInterpolation(f);
        }
        int i4 = onNavigationEvent + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return interpolation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke(Integer.valueOf(iIntValue));
        if (i3 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(int i, Function1 function1, final Function1 function12, setTaggedAddrCtrl settaggedaddrctrl, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            int i4 = onNavigationEvent + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(347223044, i2, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggle.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TossSecTdsToggle.kt:109)");
            }
            Iterator<Integer> it = new IntRange(0, 1).iterator();
            while (it.hasNext()) {
                int i6 = onNavigationEvent + 75;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                final int iNextInt = ((IntIterator) it).nextInt();
                boolean z2 = iNextInt == i;
                String str = function1 != null ? (String) function1.invoke(Integer.valueOf(iNextInt)) : null;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iNextInt);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    int i8 = onExtraCallback + 9;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda7
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i10 = 2 % 2;
                                int i11 = IAuthTabCallback + 77;
                                onWarmupCompleted = i11 % 128;
                                if (i11 % 2 != 0) {
                                    AFf1ySDK.onExtraCallback(function12, iNextInt);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                Unit unitOnExtraCallback = AFf1ySDK.onExtraCallback(function12, iNextInt);
                                int i12 = IAuthTabCallback + 123;
                                onWarmupCompleted = i12 % 128;
                                int i13 = i12 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                }
                onExtraCallbackWithResult(iNextInt, z2, str, (Function0) objOnMinimized, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(float f, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallback + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(437501840, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggle.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TossSecTdsToggle.kt:123)");
            }
            onExtraCallback(new Object[]{Float.valueOf(f), Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, 0}, a.3.onWarmupCompleted(), -1140553284, a.3.onWarmupCompleted(), 1140553285, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallback + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final component8 onExtraCallback(final int i, final Function1 function1, final Function1 function12, final setTaggedAddrCtrl settaggedaddrctrl, final float f, final long j, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback("toggle_items", ForwardingCameraControl.onExtraCallbackWithResult(347223044, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = AFf1ySDK.onExtraCallbackWithResult(i, function1, function12, settaggedaddrctrl, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i6 = onNavigationEvent + 85;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }));
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
        Iterator it = listIAuthTabCallback.iterator();
        while (it.hasNext()) {
            arrayList.add(((component7) it.next()).onExtraCallback(virtualCameraCaptureResult.onExtraCallback()));
            int i3 = onNavigationEvent + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        Iterator it2 = arrayList.iterator();
        int i5 = onExtraCallback + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int interfaceDescriptor = 0;
        while (it2.hasNext()) {
            int i7 = onExtraCallback + 83;
            onNavigationEvent = i7 % 128;
            interfaceDescriptor = i7 % 2 != 0 ? interfaceDescriptor << ((getStreamSharingChildren) it2.next()).getInterfaceDescriptor() : interfaceDescriptor + ((getStreamSharingChildren) it2.next()).getInterfaceDescriptor();
        }
        int iT_ = ((getStreamSharingChildren) CollectionsKt___CollectionsKt.first((List) arrayList)).T_();
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = ((component7) CollectionsKt___CollectionsKt.first(isextrapreviewrequired.IAuthTabCallback("selectedBox", ForwardingCameraControl.onExtraCallbackWithResult(437501840, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda9
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 13;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = AFf1ySDK.onNavigationEvent(f, j, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i11 = onExtraCallback + 15;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                return unitOnNavigationEvent;
            }
        })))).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(((getStreamSharingChildren) arrayList.get(i)).getInterfaceDescriptor(), iT_));
        return component4.IAuthTabCallback(isextrapreviewrequired, interfaceDescriptor, iT_, (Map) null, new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 109;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                List list = arrayList;
                Integer numValueOf = Integer.valueOf(i);
                Unit unit = (Unit) AFf1ySDK.onExtraCallback(new Object[]{getstreamsharingchildren, cameraPresenceProviderExternalSyntheticLambda62, list, numValueOf, (getStreamSharingChildren.onExtraCallbackWithResult) obj}, a.3.onWarmupCompleted(), -836974703, a.3.onWarmupCompleted(), 836974703, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
                int i11 = onExtraCallback + 29;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unit;
            }
        }, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[PHI: r1
      0x0054: PHI (r1v8 java.lang.Object) = (r1v7 java.lang.Object), (r1v13 java.lang.Object) binds: [B:11:0x0052, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object next;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, (int) (((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue() * ((getStreamSharingChildren) list.get(1 - i)).getInterfaceDescriptor()), 0, 0.0f, 4, (Object) null);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int i4 = onExtraCallback + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                next = it.next();
                int i5 = 18 / 0;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    int i6 = onExtraCallback + 23;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                next = it.next();
                if (i3 < 0) {
                }
            }
            getStreamSharingChildren getstreamsharingchildren2 = (getStreamSharingChildren) next;
            Iterator it2 = list.subList(0, i3).iterator();
            int i8 = onExtraCallback + 69;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            int interfaceDescriptor = 0;
            while (it2.hasNext()) {
                interfaceDescriptor += ((getStreamSharingChildren) it2.next()).getInterfaceDescriptor();
            }
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren2, interfaceDescriptor, 0, 0.0f, 4, (Object) null);
            i3++;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onExtraCallback + 91;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(final int i, final float f, final float f2, @NotNull final Function1<? super Integer, Unit> function1, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable Function1<? super Integer, String> function12, @NotNull final setTaggedAddrCtrl<? super Integer, ? super Boolean, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        long jLongValue;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j3;
        final Function1<? super Integer, String> function13;
        final long j4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        long jOnActivityLayout;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long j5;
        long j6;
        Function1<? super Integer, String> function14;
        long j7;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        int i7;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        Object objOnMinimized3;
        boolean z;
        long j8;
        long j9;
        boolean z2;
        boolean zOnNavigationEvent3;
        Object objOnMinimized4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        int i8;
        int i9;
        int i10;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1888829066);
        if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                int i12 = onNavigationEvent + 41;
                onExtraCallback = i12 % 128;
                i10 = i12 % 2 == 0 ? 124 : 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i2 & 384) == 0) {
            int i13 = onExtraCallback + 123;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
            }
            if ((i2 & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    int i15 = onNavigationEvent + 97;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                        i9 = Imgproc.FLOODFILL_MASK_ONLY;
                    }
                    i4 |= i9;
                }
                i9 = Imgproc.FLOODFILL_FIXED_RANGE;
                i4 |= i9;
            }
            if ((i2 & 1572864) != 0) {
                int i17 = onNavigationEvent + 53;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                if ((i3 & 64) == 0) {
                    jLongValue = j2;
                    int i19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue) ? 1048576 : 524288;
                    i4 |= i19;
                } else {
                    jLongValue = j2;
                }
                i4 |= i19;
            } else {
                jLongValue = j2;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                if ((12582912 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl) ? 67108864 : 33554432;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 38347923) != 38347922, i4 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport03 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if ((i3 & 32) != 0) {
                            jOnActivityLayout = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout();
                            i4 &= -458753;
                        } else {
                            jOnActivityLayout = j;
                        }
                        if ((i3 & 64) != 0) {
                            int i20 = onExtraCallback + 15;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 == 0 ? !addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) : !addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1606444257);
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1606443293);
                                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            i4 &= -3670017;
                        }
                        if (i5 != 0) {
                            i6 = i4;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            j5 = jLongValue;
                            j6 = jOnActivityLayout;
                            function14 = null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            j7 = j5;
                        } else {
                            j7 = j5;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1888829066, i6, -1, "im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggle (TossSecTdsToggle.kt:61)");
                        }
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                        i7 = i6 & 14;
                        cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                        cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 >> 9) & 14);
                        long j10 = j6;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getPopupTheme.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, j6, RoundedCornerShapeKt.onNavigationEvent(f)), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (MediationAdapterRouter) addAdapter.onWarmupCompleted(1972255785, -1972255784, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{null, null, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted()));
                        Unit unit = Unit.INSTANCE;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = getImplementationType.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, unit, (PointerInputEventHandler) objOnMinimized2), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
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
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        float f3 = i;
                        int iIAuthTabCallback = onWarmupCompleted.IAuthTabCallback();
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new setOnQueryTextListener() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final float transform(float f4) {
                                    int i21 = 2 % 2;
                                    int i22 = onExtraCallback + 95;
                                    onWarmupCompleted = i22 % 128;
                                    int i23 = i22 % 2;
                                    float fOnExtraCallbackWithResult = AFf1ySDK.onExtraCallbackWithResult(f4);
                                    int i24 = onWarmupCompleted + 109;
                                    onExtraCallback = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        return fOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        Object obj = null;
                        long j11 = j7;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3 = isSubmitButtonEnabled.IAuthTabCallback(f3, onQueryRefine.onExtraCallbackWithResult(iIAuthTabCallback, 0, (setOnQueryTextListener) objOnMinimized3, 2, (Object) null), 0.0f, _UrlKt.FRAGMENT_ENCODE_SET, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            int i21 = onNavigationEvent + 51;
                            onExtraCallback = i21 % 128;
                            if (i21 % 2 == 0) {
                                getAwbState.onExtraCallback();
                                obj.hashCode();
                                throw null;
                            }
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                        if (i7 != 4) {
                            int i22 = onExtraCallback + 79;
                            onNavigationEvent = i22 % 128;
                            boolean z3 = i22 % 2 == 0;
                            boolean z4 = (29360128 & i6) == 8388608;
                            boolean z5 = (i6 & 7168) == 2048;
                            if ((234881024 & i6) == 67108864) {
                                int i23 = onNavigationEvent + 125;
                                onExtraCallback = i23 % 128;
                                int i24 = i23 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z6 = (i6 & 896) == 256;
                            if (((3670016 & i6) ^ 1572864) > 1048576) {
                                j8 = j11;
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j8)) {
                                    j9 = j8;
                                }
                                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if ((!(z2 | z4 | z3 | z5 | z | z6) && !zOnNavigationEvent3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    final Function1<? super Integer, String> function15 = function14;
                                    j4 = j9;
                                    quirksExternalSyntheticBackport05 = null;
                                    i8 = 0;
                                    Function2 function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda1
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            component8 component8VarOnNavigationEvent;
                                            int i25 = 2 % 2;
                                            int i26 = IAuthTabCallback + 35;
                                            onWarmupCompleted = i26 % 128;
                                            if (i26 % 2 == 0) {
                                                component8VarOnNavigationEvent = AFf1ySDK.onNavigationEvent(i, function15, function1, settaggedaddrctrl, f2, j4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                                                int i27 = 26 / 0;
                                            } else {
                                                component8VarOnNavigationEvent = AFf1ySDK.onNavigationEvent(i, function15, function1, settaggedaddrctrl, f2, j4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                                            }
                                            int i28 = IAuthTabCallback + 37;
                                            onWarmupCompleted = i28 % 128;
                                            if (i28 % 2 != 0) {
                                                return component8VarOnNavigationEvent;
                                            }
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function2);
                                    objOnMinimized4 = function2;
                                } else {
                                    j4 = j9;
                                    quirksExternalSyntheticBackport05 = null;
                                    i8 = 0;
                                }
                                hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport05, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, i8, 1);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    int i25 = onNavigationEvent + 93;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                function13 = function14;
                                j3 = j10;
                            } else {
                                j8 = j11;
                            }
                            j9 = j8;
                            z2 = (i6 & 1572864) == 1048576;
                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3);
                            objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (!(z2 | z4 | z3 | z5 | z | z6 | zOnNavigationEvent3)) {
                                final Function1 function152 = function14;
                                j4 = j9;
                                quirksExternalSyntheticBackport05 = null;
                                i8 = 0;
                                Function2 function22 = new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda1
                                    private static int IAuthTabCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        component8 component8VarOnNavigationEvent;
                                        int i252 = 2 % 2;
                                        int i262 = IAuthTabCallback + 35;
                                        onWarmupCompleted = i262 % 128;
                                        if (i262 % 2 == 0) {
                                            component8VarOnNavigationEvent = AFf1ySDK.onNavigationEvent(i, function152, function1, settaggedaddrctrl, f2, j4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                                            int i27 = 26 / 0;
                                        } else {
                                            component8VarOnNavigationEvent = AFf1ySDK.onNavigationEvent(i, function152, function1, settaggedaddrctrl, f2, j4, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback3, (isExtraPreviewRequired) obj2, (VirtualCameraCaptureResult) obj3);
                                        }
                                        int i28 = IAuthTabCallback + 37;
                                        onWarmupCompleted = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            return component8VarOnNavigationEvent;
                                        }
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function22);
                                objOnMinimized4 = function22;
                                hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport05, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, i8, 1);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                function13 = function14;
                                j3 = j10;
                            }
                        }
                    } else {
                        int i27 = onNavigationEvent + 7;
                        onExtraCallback = i27 % 128;
                        int i28 = i27 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        jOnActivityLayout = j;
                    }
                    i6 = i4;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    j5 = jLongValue;
                    j6 = jOnActivityLayout;
                    function14 = function12;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                    i7 = i6 & 14;
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 >> 9) & 14);
                    long j102 = j6;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = getPopupTheme.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport04, j6, RoundedCornerShapeKt.onNavigationEvent(f)), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (MediationAdapterRouter) addAdapter.onWarmupCompleted(1972255785, -1972255784, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{null, null, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted()));
                    Unit unit2 = Unit.INSTANCE;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                        objOnMinimized2 = new onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = getImplementationType.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, unit2, (PointerInputEventHandler) objOnMinimized2), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)));
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.onExtraCallback(), false);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        float f32 = i;
                        int iIAuthTabCallback2 = onWarmupCompleted.IAuthTabCallback();
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        }
                        Object obj2 = null;
                        long j112 = j7;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback32 = isSubmitButtonEnabled.IAuthTabCallback(f32, onQueryRefine.onExtraCallbackWithResult(iIAuthTabCallback2, 0, (setOnQueryTextListener) objOnMinimized3, 2, (Object) null), 0.0f, _UrlKt.FRAGMENT_ENCODE_SET, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 20);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                        component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult3.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                        int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, onextracallback2);
                        Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnExtraCallback2, onextracallbackwithresult22.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                        if (i7 != 4) {
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    j3 = j;
                    function13 = function12;
                    j4 = jLongValue;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final long j12 = j4;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallback + 89;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            int i32 = i;
                            float f4 = f;
                            float f5 = f2;
                            Function1 function16 = function1;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport02;
                            long j13 = j3;
                            long j14 = j12;
                            Function1 function17 = function13;
                            setTaggedAddrCtrl settaggedaddrctrl2 = settaggedaddrctrl;
                            int i33 = i2;
                            int i34 = i3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Unit unit3 = (Unit) AFf1ySDK.onExtraCallback(new Object[]{Integer.valueOf(i32), Float.valueOf(f4), Float.valueOf(f5), function16, quirksExternalSyntheticBackport06, Long.valueOf(j13), Long.valueOf(j14), function17, settaggedaddrctrl2, Integer.valueOf(i33), Integer.valueOf(i34), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)}, a.3.onWarmupCompleted(), -1380683378, a.3.onWarmupCompleted(), 1380683380, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
                            int i35 = IAuthTabCallback + 3;
                            onExtraCallback = i35 % 128;
                            int i36 = i35 % 2;
                            return unit3;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 12582912;
            if ((i2 & 100663296) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 38347923) != 38347922, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        i5 = i3 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 38347923) != 38347922, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final boolean onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        return true;
    }

    private static final Unit onExtraCallback(boolean z, String str, final Function0 function0, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.IAuthTabCallbackStub());
        unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture, z);
        if (str != null) {
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        unregisterOutputSurface.asInterface(useandconfigureprogramwithtexture, (String) null, new Function0() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Boolean boolValueOf;
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 5;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    boolValueOf = Boolean.valueOf(AFf1ySDK.onWarmupCompleted(function0));
                    int i8 = 42 / 0;
                } else {
                    boolValueOf = Boolean.valueOf(AFf1ySDK.onWarmupCompleted(function0));
                }
                int i9 = onExtraCallback + 37;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 7 / 0;
                }
                return boolValueOf;
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final int i, final boolean z, final String str, final Function0<Unit> function0, final setTaggedAddrCtrl<? super Integer, ? super Boolean, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        boolean z2;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(389678016);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = onNavigationEvent + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(389678016, i3, -1, "im.toss.tosssecurities.uikit.compound.toggle.ToggleItem (TossSecTdsToggle.kt:158)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 896) == 256) {
                int i7 = onNavigationEvent + 87;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = (i3 & 7168) == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z3 | z2 | z4)) {
                int i9 = onNavigationEvent + 59;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i11 = 2 % 2;
                            int i12 = onExtraCallbackWithResult + 25;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitIAuthTabCallback = AFf1ySDK.IAuthTabCallback(z, str, function0, (useAndConfigureProgramWithTexture) obj);
                            int i14 = onExtraCallbackWithResult + 37;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(onextracallback, true, (Function1) objOnMinimized);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i11 = onExtraCallback + 9;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                settaggedaddrctrl.invoke(Integer.valueOf(i), Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 6) & 896) | (i3 & 126)));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 43;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnNavigationEvent = AFf1ySDK.onNavigationEvent(i, z, str, function0, settaggedaddrctrl, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i16 = onExtraCallback + 41;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        boolean z;
        int i2;
        final float fFloatValue = ((Number) objArr[0]).floatValue();
        final long jLongValue = ((Number) objArr[1]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1327996285);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 4 : 2) | iIntValue;
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        } else {
            int i6 = onExtraCallback + 101;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = iIntValue;
        }
        Object obj = null;
        if ((iIntValue & 48) == 0) {
            int i8 = onNavigationEvent + 23;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                int i9 = onNavigationEvent + 17;
                onExtraCallback = i9 % 128;
                i2 = i9 % 2 == 0 ? 114 : 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i10 = onExtraCallback + 51;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1327996285, i, -1, "im.toss.tosssecurities.uikit.compound.toggle.Handle (TossSecTdsToggle.kt:180)");
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, jLongValue, RoundedCornerShapeKt.onNavigationEvent(fFloatValue)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.toggle.TossSecTdsToggleKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i12 = 2 % 2;
                    int i13 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Unit unitOnExtraCallbackWithResult = AFf1ySDK.onExtraCallbackWithResult(fFloatValue, jLongValue, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = onExtraCallback + 85;
                    onExtraCallbackWithResult = i15 % 128;
                    if (i15 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            });
        }
        return null;
    }

    private static final int onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Integer> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).intValue();
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final Function1<Integer, Unit> IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends Function1<? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function1<Integer, Unit> function1 = (Function1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallback + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return function1;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, float f, float f2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, Function1 function12, setTaggedAddrCtrl settaggedaddrctrl, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onExtraCallback(new Object[]{Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), function1, quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), function12, settaggedaddrctrl, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, a.3.onWarmupCompleted(), -1380683378, a.3.onWarmupCompleted(), 1380683380, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, List list, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        return (Unit) onExtraCallback(new Object[]{getstreamsharingchildren, cameraPresenceProviderExternalSyntheticLambda6, list, Integer.valueOf(i), onextracallbackwithresult}, a.3.onWarmupCompleted(), -836974703, a.3.onWarmupCompleted(), 836974703, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }

    private static final void onWarmupCompleted(float f, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onExtraCallback(new Object[]{Float.valueOf(f), Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, a.3.onWarmupCompleted(), -1140553284, a.3.onWarmupCompleted(), 1140553285, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(float f, long j, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(new Object[]{Float.valueOf(f), Long.valueOf(j), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, a.3.onWarmupCompleted(), 452451780, a.3.onWarmupCompleted(), -452451777, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(Function1 function1, int i) {
        return (Unit) onExtraCallback(new Object[]{function1, Integer.valueOf(i)}, a.3.onWarmupCompleted(), -546696852, a.3.onWarmupCompleted(), 546696857, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }

    public static final /* synthetic */ Function1 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        return (Function1) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, a.3.onWarmupCompleted(), 505189910, a.3.onWarmupCompleted(), -505189906, a.3.onWarmupCompleted(), a.3.onWarmupCompleted());
    }
}
