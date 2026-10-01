package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.uikit.chart.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AFf1dSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.HandlerScheduledExecutorService2;
import o.getSurfaceSize;
import o.setIso;
import o.setOrientationDegrees;
import o.setUseCaseAttached;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1dSDK {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {null, 0L, this};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            Object objOnExtraCallbackWithResult = i3 != 0 ? AFf1dSDK.onExtraCallbackWithResult(800957222, objArr, -800957222, iOnExtraCallback4, iOnExtraCallback, iOnExtraCallback3, iOnExtraCallback2) : AFf1dSDK.onExtraCallbackWithResult(800957222, objArr, -800957222, iOnExtraCallback4, iOnExtraCallback, iOnExtraCallback3, iOnExtraCallback2);
            int i4 = onExtraCallback + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AFf1bSDK aFf1bSDK, Function2 function2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, SurfaceProcessorNodeOut surfaceProcessorNodeOut, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, String str, long j, long j2, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(aFf1bSDK, function2, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, cameraPresenceProviderExternalSyntheticLambda64, surfaceProcessorNodeOut, cameraPresenceProviderExternalSyntheticLambda65, str, j, j2, setorientationdegrees);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        AFf1bSDK aFf1bSDK = (AFf1bSDK) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[6];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, (CameraPresenceProviderExternalSyntheticLambda6<Double>) cameraPresenceProviderExternalSyntheticLambda62, (CameraPresenceProviderExternalSyntheticLambda6<Double>) cameraPresenceProviderExternalSyntheticLambda63, zBooleanValue, cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i);
        int i5 = onExtraCallbackWithResult + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AFf1bSDK aFf1bSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, Function2 function2, Function1 function1, float f, float f2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 35;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(z), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, function1, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(-1282901421, objArr, 1282901425, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i8 = onExtraCallback + 87;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AFf1bSDK onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFf1bSDK<Object> aFf1bSDKIAuthTabCallback = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends AFf1bSDK<Object>>) cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFf1bSDKIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i | (~(i7 | i4));
        int i9 = i | i4 | i7;
        int i10 = i + i2 + i6 + (1159740906 * i5) + ((-617157175) * i3);
        int i11 = i10 * i10;
        int i12 = (i * (-824977050)) + 1921657099 + (i2 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + ((-824977973) * i6) + ((-135083378) * i5) + (1125239651 * i3) + (i11 * 298844160);
        int i13 = ((i * 934236018) - 2089811968) + (934236018 * i2) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i6) + (1488977920 * i5) + (2111832064 * i3) + (2070937600 * i11) + (i12 * i12 * 2098200576);
        if (i13 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i13 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i13 == 3) {
            return onExtraCallback(objArr);
        }
        if (i13 != 4) {
            return onNavigationEvent(objArr);
        }
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        AFf1bSDK aFf1bSDK = (AFf1bSDK) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[6];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        Function1 function1 = (Function1) objArr[9];
        float fFloatValue = ((Number) objArr[10]).floatValue();
        float fFloatValue2 = ((Number) objArr[11]).floatValue();
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        ((Number) objArr[16]).intValue();
        int i14 = 2 % 2;
        int i15 = onExtraCallback + 107;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        onExtraCallbackWithResult(1916608670, new Object[]{cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(zBooleanValue), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, function1, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2)), Integer.valueOf(iIntValue3)}, -1916608669, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i17 = onExtraCallbackWithResult + 5;
        onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(-409370631, new Object[0], 409370633, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AFf1bSDK aFf1bSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(z), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(2109191756, objArr, -2109191753, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
        int i7 = onExtraCallbackWithResult + 53;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(setusecaseattached);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setusecaseattached);
        int i3 = onExtraCallback + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, AFf1bSDK aFf1bSDK, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(z, aFf1bSDK, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setiso);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, aFf1bSDK, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setiso);
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(newHandlerExecutor newhandlerexecutor, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(newhandlerexecutor, j);
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(newhandlerexecutor, j);
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (cameraPresenceProviderExternalSyntheticLambda6 == null) {
            return 0.0f;
        }
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        int i3 = onExtraCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return fFloatValue;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, AFf1bSDK aFf1bSDK, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            int i3 = 57 / 0;
            if (z) {
                aFf1bSDK.onExtraCallbackWithResult(setiso, (AFf1jSDK) CollectionsKt___CollectionsKt.lastOrNull((List) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()), new Function0() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onExtraCallbackWithResult + 77;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            Float.valueOf(AFf1dSDK.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda62));
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Float fValueOf = Float.valueOf(AFf1dSDK.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda62));
                        int i6 = onNavigationEvent + 55;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        return fValueOf;
                    }
                });
                int i4 = onExtraCallbackWithResult + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setiso, "");
            setiso.onWarmupCompleted();
            if (z) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(AFf1bSDK aFf1bSDK, Function2 function2, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, SurfaceProcessorNodeOut surfaceProcessorNodeOut, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, String str, long j, long j2, setOrientationDegrees setorientationdegrees) {
        Double dOnWarmupCompleted;
        Double dOnWarmupCompleted2;
        AFf1gSDK aFf1gSDK;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        aFf1bSDK.onExtraCallback(setorientationdegrees, (List) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult(), cameraPresenceProviderExternalSyntheticLambda62 != null ? (Double) cameraPresenceProviderExternalSyntheticLambda62.onExtraCallbackWithResult() : null);
        if (cameraPresenceProviderExternalSyntheticLambda63 != null) {
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            AFf1gSDK aFf1gSDK2 = (AFf1gSDK) cameraPresenceProviderExternalSyntheticLambda63.onExtraCallbackWithResult();
            dOnWarmupCompleted = aFf1gSDK2 != null ? aFf1gSDK2.onWarmupCompleted() : null;
        }
        if (cameraPresenceProviderExternalSyntheticLambda64 != null) {
            int i3 = onExtraCallbackWithResult + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            AFf1gSDK aFf1gSDK3 = (AFf1gSDK) cameraPresenceProviderExternalSyntheticLambda64.onExtraCallbackWithResult();
            dOnWarmupCompleted2 = aFf1gSDK3 != null ? aFf1gSDK3.onWarmupCompleted() : null;
        }
        if (!Intrinsics.areEqual(dOnWarmupCompleted, dOnWarmupCompleted2)) {
            int i5 = onExtraCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
                aFf1gSDK = cameraPresenceProviderExternalSyntheticLambda63 != null ? (AFf1gSDK) cameraPresenceProviderExternalSyntheticLambda63.onExtraCallbackWithResult() : null;
            } else if (cameraPresenceProviderExternalSyntheticLambda63 != null) {
            }
            aFf1bSDK.IAuthTabCallback(setorientationdegrees, aFf1gSDK);
            aFf1bSDK.onExtraCallbackWithResult(setorientationdegrees, cameraPresenceProviderExternalSyntheticLambda64 != null ? (AFf1gSDK) cameraPresenceProviderExternalSyntheticLambda64.onExtraCallbackWithResult() : null);
        }
        if (surfaceProcessorNodeOut != null) {
            aFf1bSDK.onExtraCallbackWithResult(setorientationdegrees, surfaceProcessorNodeOut, cameraPresenceProviderExternalSyntheticLambda65 != null ? (Double) cameraPresenceProviderExternalSyntheticLambda65.onExtraCallbackWithResult() : null, str, j, j2);
        }
        if (function2 != null) {
            function2.invoke(setorientationdegrees, aFf1bSDK);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[PHI: r1
      0x0048: PHI (r1v43 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v44 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r1
      0x003c: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v44 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends AFf1jSDK> void onExtraCallback(@NotNull final CameraPresenceProviderExternalSyntheticLambda6<? extends List<? extends T>> cameraPresenceProviderExternalSyntheticLambda6, @NotNull final AFf1bSDK<T> aFf1bSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda62, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda63, boolean z, @Nullable CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda64, @Nullable CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda65, @Nullable Function2<? super setOrientationDegrees, ? super AFf1bSDK<T>, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda66;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda67;
        final boolean z2;
        final CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda68;
        final CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda69;
        final Function2<? super setOrientationDegrees, ? super AFf1bSDK<T>, Unit> function22;
        final CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda610;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda611;
        long jLongValue;
        long j;
        boolean z3;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
        int i12;
        boolean z4;
        SurfaceProcessorNodeOut surfaceProcessorNodeOut;
        boolean z5;
        boolean z6;
        boolean z7;
        int i13;
        int i14 = 2 % 2;
        int i15 = onExtraCallback + 21;
        onExtraCallbackWithResult = i15 % 128;
        if (i15 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(aFf1bSDK, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(624605000);
            if ((i & 107) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(aFf1bSDK, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(624605000);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(aFf1bSDK)) {
                int i16 = onExtraCallbackWithResult + 57;
                onExtraCallback = i16 % 128;
                i13 = i16 % 2 != 0 ? 31 : 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda62;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda66) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        int i18 = onExtraCallbackWithResult + 125;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda63) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        int i20 = onExtraCallback + 81;
                        onExtraCallbackWithResult = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 55 / 0;
                            i7 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                        } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z)) {
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda64)) {
                                int i22 = onExtraCallback + 47;
                                onExtraCallbackWithResult = i22 % 128;
                                if (i22 % 2 == 0) {
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 == 0) {
                            if ((12582912 & i) == 0) {
                                int i23 = onExtraCallbackWithResult + 71;
                                onExtraCallback = i23 % 128;
                                int i24 = i23 % 2;
                                i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda65) ? 8388608 : 4194304;
                            }
                            i11 = i2 & 256;
                            if (i11 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2) ? 67108864 : 33554432;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                cameraPresenceProviderExternalSyntheticLambda67 = cameraPresenceProviderExternalSyntheticLambda63;
                                z2 = z;
                                cameraPresenceProviderExternalSyntheticLambda68 = cameraPresenceProviderExternalSyntheticLambda64;
                                cameraPresenceProviderExternalSyntheticLambda69 = cameraPresenceProviderExternalSyntheticLambda65;
                                function22 = function2;
                                cameraPresenceProviderExternalSyntheticLambda610 = cameraPresenceProviderExternalSyntheticLambda66;
                            } else {
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda612 = i4 != 0 ? null : cameraPresenceProviderExternalSyntheticLambda66;
                                CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda613 = i5 != 0 ? null : cameraPresenceProviderExternalSyntheticLambda63;
                                final boolean z8 = i6 != 0 ? false : z;
                                CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda614 = i8 != 0 ? null : cameraPresenceProviderExternalSyntheticLambda64;
                                if (i10 != 0) {
                                    int i25 = onExtraCallbackWithResult + 101;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    cameraPresenceProviderExternalSyntheticLambda611 = null;
                                } else {
                                    cameraPresenceProviderExternalSyntheticLambda611 = cameraPresenceProviderExternalSyntheticLambda65;
                                }
                                Function2<? super setOrientationDegrees, ? super AFf1bSDK<T>, Unit> function23 = i11 != 0 ? null : function2;
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(624605000, i3, -1, "im.toss.tosssecurities.uikit.chart.CoreChart (Chart.kt:63)");
                                }
                                SurfaceProcessorWithExecutorExternalSyntheticLambda1 surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback = r8lambdagFq9ZjkYMu6QWJyE7oyeb6idSPU.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
                                getHumanReadableName gethumanreadablenameOnWarmupCompleted = AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted();
                                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049998449);
                                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ICustomTabsService();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049997489);
                                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                                }
                                long j2 = jLongValue;
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized = getHumanReadableName.onNavigationEvent(gethumanreadablenameOnWarmupCompleted, j2, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                                }
                                getHumanReadableName gethumanreadablename = (getHumanReadableName) objOnMinimized;
                                final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_stock_average, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                boolean z9 = cameraPresenceProviderExternalSyntheticLambda613 != null;
                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strOnExtraCallback);
                                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(z9);
                                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                    SurfaceProcessorNodeOut surfaceProcessorNodeOutOnExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda613 == null ? null : SurfaceProcessorWithExecutorExternalSyntheticLambda1.onExtraCallbackWithResult(surfaceProcessorWithExecutorExternalSyntheticLambda1IAuthTabCallback, strOnExtraCallback, gethumanreadablename, 0, false, 0, 0L, (ExtensionsManagerExtensionsAvailability) null, (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (getSurfaceSize.IAuthTabCallback) null, false, 1020, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(surfaceProcessorNodeOutOnExtraCallbackWithResult);
                                    objOnMinimized2 = surfaceProcessorNodeOutOnExtraCallbackWithResult;
                                }
                                SurfaceProcessorNodeOut surfaceProcessorNodeOut2 = (SurfaceProcessorNodeOut) objOnMinimized2;
                                long jIAuthTabCallback = failAllPendingSnapshots.IAuthTabCallback(im.toss.tds.R.color.grey_opacity_100, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                final long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(failAllPendingSnapshots.IAuthTabCallback(im.toss.tds.R.color.background_default, cameraCaptureResultEmptyCameraCaptureResult2, 0), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                if (z8) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1810668866);
                                    z3 = false;
                                    j = jIAuthTabCallback;
                                    cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = cancelSuperTouch.onWarmupCompleted(cancelSuperTouch.onWarmupCompleted("highlightInfiniteTransition", cameraCaptureResultEmptyCameraCaptureResult2, 6, 0), 0.0f, 1.0f, new SwitchCompat(onQueryRefine.onExtraCallbackWithResult(2000, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null), r8lambda2X9gYN_5QVLqtGb6NTNoJyue7I.onExtraCallback(getExtraParameters.Normal), 0L, 4, (DefaultConstructorMarker) null), "highlightProgress", cameraCaptureResultEmptyCameraCaptureResult2, doTransformForOnOffText.onWarmupCompleted | 25008 | (SwitchCompat.onExtraCallback << 9), 0);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                } else {
                                    j = jIAuthTabCallback;
                                    z3 = false;
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1811159782);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = null;
                                }
                                if ((458752 & i3) == 131072) {
                                    int i27 = onExtraCallback + 71;
                                    onExtraCallbackWithResult = i27 % 128;
                                    boolean z10 = i27 % 2 == 0 ? z3 : true;
                                    int i28 = i3 & 112;
                                    boolean z11 = i28 == 32 ? true : z3;
                                    int i29 = i3 & 14;
                                    boolean z12 = i29 == 4;
                                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted);
                                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (!(!(z10 | z11 | z12 | zOnNavigationEvent2)) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized3 = new Function1() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda0
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onWarmupCompleted = 1;

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                int i30 = 2 % 2;
                                                int i31 = onExtraCallbackWithResult + 45;
                                                onWarmupCompleted = i31 % 128;
                                                int i32 = i31 % 2;
                                                boolean z13 = z8;
                                                if (i32 != 0) {
                                                    return AFf1dSDK.onExtraCallbackWithResult(z13, aFf1bSDK, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, (setIso) obj2);
                                                }
                                                Unit unitOnExtraCallbackWithResult = AFf1dSDK.onExtraCallbackWithResult(z13, aFf1bSDK, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, (setIso) obj2);
                                                int i33 = 50 / 0;
                                                return unitOnExtraCallbackWithResult;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport03, (Function1) objOnMinimized3);
                                    if (i28 == 32) {
                                        z4 = true;
                                        i12 = 4;
                                    } else {
                                        i12 = 4;
                                        z4 = false;
                                    }
                                    boolean z13 = i29 == i12;
                                    boolean z14 = (i3 & 7168) == 2048;
                                    boolean z15 = (3670016 & i3) == 1048576;
                                    if ((29360128 & i3) == 8388608) {
                                        z5 = true;
                                        surfaceProcessorNodeOut = surfaceProcessorNodeOut2;
                                    } else {
                                        int i30 = onExtraCallbackWithResult + 7;
                                        onExtraCallback = i30 % 128;
                                        int i31 = i30 % 2;
                                        surfaceProcessorNodeOut = surfaceProcessorNodeOut2;
                                        z5 = false;
                                    }
                                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(surfaceProcessorNodeOut);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    if ((i3 & 57344) == 16384) {
                                        int i32 = onExtraCallbackWithResult + 75;
                                        onExtraCallback = i32 % 128;
                                        int i33 = i32 % 2;
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(strOnExtraCallback);
                                    boolean z16 = z8;
                                    boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(jOnExtraCallbackWithResult);
                                    boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(j);
                                    boolean z17 = (i3 & 234881024) == 67108864;
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (((z13 | z4 | z14 | z15 | z5 | zOnExtraCallback2 | z6 | zOnNavigationEvent3 | zOnWarmupCompleted | zOnWarmupCompleted2) || z17) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                        final Function2<? super setOrientationDegrees, ? super AFf1bSDK<T>, Unit> function24 = function23;
                                        final CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda615 = cameraPresenceProviderExternalSyntheticLambda612;
                                        final CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda616 = cameraPresenceProviderExternalSyntheticLambda614;
                                        final CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda617 = cameraPresenceProviderExternalSyntheticLambda611;
                                        final long j3 = j;
                                        final SurfaceProcessorNodeOut surfaceProcessorNodeOut3 = surfaceProcessorNodeOut;
                                        final CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda618 = cameraPresenceProviderExternalSyntheticLambda613;
                                        z7 = z16;
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                        Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda1
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallback = 1;

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                int i34 = 2 % 2;
                                                int i35 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                                                onExtraCallback = i35 % 128;
                                                int i36 = i35 % 2;
                                                Unit unitIAuthTabCallback = AFf1dSDK.IAuthTabCallback(aFf1bSDK, function24, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda615, cameraPresenceProviderExternalSyntheticLambda616, cameraPresenceProviderExternalSyntheticLambda617, surfaceProcessorNodeOut3, cameraPresenceProviderExternalSyntheticLambda618, strOnExtraCallback, jOnExtraCallbackWithResult, j3, (setOrientationDegrees) obj2);
                                                int i37 = IAuthTabCallback + 45;
                                                onExtraCallback = i37 % 128;
                                                if (i37 % 2 != 0) {
                                                    return unitIAuthTabCallback;
                                                }
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function1);
                                        objOnMinimized4 = function1;
                                    } else {
                                        z7 = z16;
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                                    }
                                    isChildOrHidden.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    cameraPresenceProviderExternalSyntheticLambda67 = cameraPresenceProviderExternalSyntheticLambda613;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                    z2 = z7;
                                    cameraPresenceProviderExternalSyntheticLambda610 = cameraPresenceProviderExternalSyntheticLambda612;
                                    cameraPresenceProviderExternalSyntheticLambda68 = cameraPresenceProviderExternalSyntheticLambda614;
                                    cameraPresenceProviderExternalSyntheticLambda69 = cameraPresenceProviderExternalSyntheticLambda611;
                                    function22 = function23;
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda2
                                    private static int onNavigationEvent = 0;
                                    private static int onWarmupCompleted = 1;

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i34 = 2 % 2;
                                        int i35 = onWarmupCompleted + 73;
                                        onNavigationEvent = i35 % 128;
                                        int i36 = i35 % 2;
                                        Unit unitOnExtraCallbackWithResult = AFf1dSDK.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport02, cameraPresenceProviderExternalSyntheticLambda610, cameraPresenceProviderExternalSyntheticLambda67, z2, cameraPresenceProviderExternalSyntheticLambda68, cameraPresenceProviderExternalSyntheticLambda69, function22, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i37 = onWarmupCompleted + 29;
                                        onNavigationEvent = i37 % 128;
                                        if (i37 % 2 == 0) {
                                            return unitOnExtraCallbackWithResult;
                                        }
                                        throw null;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i11 = i2 & 256;
                        if (i11 == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i10 = i2 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i2 & 256;
                    if (i11 == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i10 = i2 & 128;
                if (i10 == 0) {
                }
                i11 = i2 & 256;
                if (i11 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda62;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i10 = i2 & 128;
            if (i10 == 0) {
            }
            i11 = i2 & 256;
            if (i11 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda62;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i10 = i2 & 128;
        if (i10 == 0) {
        }
        i11 = i2 & 256;
        if (i11 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements PointerInputEventHandler {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<AFf1bSDK<T>> onExtraCallback;
        final /* synthetic */ Function1<Integer, Unit> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends AFf1bSDK<T>> cameraPresenceProviderExternalSyntheticLambda6, Function1<? super Integer, Unit> function1) {
            this.onExtraCallback = cameraPresenceProviderExternalSyntheticLambda6;
            this.onNavigationEvent = function1;
        }

        public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, function1, handlerScheduledExecutorService2, setusecaseattached);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            return unitIAuthTabCallback;
        }

        public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, function1, setusecaseattached);
            }
            IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, function1, setusecaseattached);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallback(function1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(function1);
            int i3 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback(function1);
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(function1);
            int i3 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return unitIAuthTabCallback;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            final CameraPresenceProviderExternalSyntheticLambda6<AFf1bSDK<T>> cameraPresenceProviderExternalSyntheticLambda6 = this.onExtraCallback;
            final Function1<Integer, Unit> function1 = this.onNavigationEvent;
            Function1 function12 = new Function1() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$PointerInputChart$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 51;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                    if (i4 != 0) {
                        return AFf1dSDK.IAuthTabCallback.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, function1, (setUseCaseAttached) obj);
                    }
                    AFf1dSDK.IAuthTabCallback.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, function1, (setUseCaseAttached) obj);
                    throw null;
                }
            };
            final Function1<Integer, Unit> function13 = this.onNavigationEvent;
            Function0 function0 = new Function0() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$PointerInputChart$2$1$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 5;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnWarmupCompleted = AFf1dSDK.IAuthTabCallback.onWarmupCompleted(function13);
                    int i5 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnWarmupCompleted;
                }
            };
            final Function1<Integer, Unit> function14 = this.onNavigationEvent;
            Function0 function02 = new Function0() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$PointerInputChart$2$1$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unitOnExtraCallbackWithResult;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 93;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        unitOnExtraCallbackWithResult = AFf1dSDK.IAuthTabCallback.onExtraCallbackWithResult(function14);
                        int i4 = 54 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = AFf1dSDK.IAuthTabCallback.onExtraCallbackWithResult(function14);
                    }
                    int i5 = onNavigationEvent + 17;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            final CameraPresenceProviderExternalSyntheticLambda6<AFf1bSDK<T>> cameraPresenceProviderExternalSyntheticLambda62 = this.onExtraCallback;
            final Function1<Integer, Unit> function15 = this.onNavigationEvent;
            Object objOnExtraCallbackWithResult = AFf1dSDK.onExtraCallbackWithResult(highPriorityExecutor, function12, function0, function02, new Function2() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$PointerInputChart$2$1$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 33;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        AFf1dSDK.IAuthTabCallback.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, function15, (HandlerScheduledExecutorService2) obj, (setUseCaseAttached) obj2);
                        throw null;
                    }
                    Unit unitOnExtraCallback = AFf1dSDK.IAuthTabCallback.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, function15, (HandlerScheduledExecutorService2) obj, (setUseCaseAttached) obj2);
                    int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unitOnExtraCallback;
                }
            }, access13800Var);
            if (objOnExtraCallbackWithResult != access14100.onExtraCallback()) {
                return Unit.INSTANCE;
            }
            int i2 = onWarmupCompleted;
            int i3 = i2 + 83;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            Integer num = null;
            if (i2 % 2 == 0) {
                Integer numValueOf = Integer.valueOf(AFf1dSDK.onExtraCallbackWithResult(AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback(), setusecaseattached.onExtraCallback()));
                if (numValueOf.intValue() < 0) {
                    int i3 = onWarmupCompleted + 95;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                } else {
                    num = numValueOf;
                }
                if (num != null) {
                    function1.invoke(Integer.valueOf(num.intValue()));
                }
                return Unit.INSTANCE;
            }
            Integer.valueOf(AFf1dSDK.onExtraCallbackWithResult(AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback(), setusecaseattached.onExtraCallback())).intValue();
            num.hashCode();
            throw null;
        }

        private static final Unit onExtraCallback(Function1 function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                function1.invoke(-1);
                int i3 = 22 / 0;
                return Unit.INSTANCE;
            }
            function1.invoke(-1);
            return Unit.INSTANCE;
        }

        private static final Unit IAuthTabCallback(Function1 function1) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(-1);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function1 function1, HandlerScheduledExecutorService2 handlerScheduledExecutorService2, setUseCaseAttached setusecaseattached) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
                numValueOf = Integer.valueOf(AFf1dSDK.onExtraCallbackWithResult(AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback(), handlerScheduledExecutorService2.IAuthTabCallback()));
                int i3 = 47 / 0;
                if (numValueOf.intValue() < 0) {
                    int i4 = onWarmupCompleted + 47;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 % 5;
                    }
                    numValueOf = null;
                }
            } else {
                Intrinsics.checkNotNullParameter(handlerScheduledExecutorService2, "");
                numValueOf = Integer.valueOf(AFf1dSDK.onExtraCallbackWithResult(AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6).onExtraCallback(), handlerScheduledExecutorService2.IAuthTabCallback()));
                if (numValueOf.intValue() < 0) {
                }
            }
            if (numValueOf != null) {
                int i6 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    function1.invoke(Integer.valueOf(numValueOf.intValue()));
                    obj.hashCode();
                    throw null;
                }
                function1.invoke(Integer.valueOf(numValueOf.intValue()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6 A[PHI: r6
      0x01a6: PHI (r6v13 int) = (r6v4 int), (r6v7 int), (r6v8 int) binds: [B:78:0x01a4, B:85:0x01b4, B:84:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd A[PHI: r20
      0x01bd: PHI (r20v10 int) = (r20v1 int), (r20v4 int), (r20v5 int) binds: [B:87:0x01bb, B:94:0x01cd, B:93:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6;
        AFf1bSDK aFf1bSDK;
        int i2;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i4;
        int i5;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        Function1 function1;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        AFf1bSDK aFf1bSDK2;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65;
        final Function1 function12;
        final boolean z3;
        final float f;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i12;
        int i13;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        AFf1bSDK aFf1bSDK3 = (AFf1bSDK) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda67 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda68 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda69 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[6];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda610 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[7];
        Function2 function2 = (Function2) objArr[8];
        Function1 function13 = (Function1) objArr[9];
        float fFloatValue = ((Number) objArr[10]).floatValue();
        float fFloatValue2 = ((Number) objArr[11]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        final int iIntValue = ((Number) objArr[13]).intValue();
        final int iIntValue2 = ((Number) objArr[14]).intValue();
        final int iIntValue3 = ((Number) objArr[15]).intValue();
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda66, "");
        Intrinsics.checkNotNullParameter(aFf1bSDK3, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda69, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda610, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(622974915);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda66) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i15 = onExtraCallbackWithResult + 77;
            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda66;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFf1bSDK3)) {
                int i17 = onExtraCallback + 123;
                aFf1bSDK = aFf1bSDK3;
                onExtraCallbackWithResult = i17 % 128;
                i13 = i17 % 2 == 0 ? 108 : 32;
            } else {
                aFf1bSDK = aFf1bSDK3;
                i13 = 16;
            }
            i |= i13;
        } else {
            cameraPresenceProviderExternalSyntheticLambda6 = cameraPresenceProviderExternalSyntheticLambda66;
            aFf1bSDK = aFf1bSDK3;
        }
        int i18 = i;
        int i19 = iIntValue3 & 4;
        if (i19 == 0) {
            if ((iIntValue & 384) == 0) {
                int i20 = onExtraCallback + 59;
                i2 = i19;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i3 = iIntValue3 & 8;
            if (i3 == 0) {
                int i22 = onExtraCallback + 67;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                i18 |= 3072;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                if ((iIntValue & 3072) == 0) {
                    i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda67) ? 2048 : 1024;
                }
            }
            i4 = iIntValue3 & 16;
            if (i4 == 0) {
                i18 |= 24576;
            } else if ((iIntValue & 24576) == 0) {
                i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda68) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
            }
            i5 = iIntValue3 & 32;
            if (i5 != 0) {
                if ((iIntValue & 196608) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                        cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda67;
                        int i24 = onExtraCallbackWithResult + 119;
                        cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda68;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        i6 = Imgproc.FLOODFILL_MASK_ONLY;
                    } else {
                        cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda67;
                        cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda68;
                        i6 = Imgproc.FLOODFILL_FIXED_RANGE;
                    }
                    i18 |= i6;
                }
                if ((1572864 & iIntValue) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda69)) {
                        int i26 = onExtraCallbackWithResult + 17;
                        onExtraCallback = i26 % 128;
                        int i27 = i26 % 2;
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i18 |= i12;
                }
                if ((12582912 & iIntValue) == 0) {
                    i18 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda610) ? 8388608 : 4194304;
                    int i28 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i28 % 128;
                    int i29 = i28 % 2;
                }
                i7 = iIntValue3 & 256;
                int i30 = 100663296;
                if (i7 != 0) {
                    i18 |= i30;
                } else if ((100663296 & iIntValue) == 0) {
                    i30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 67108864 : 33554432;
                    i18 |= i30;
                }
                i8 = iIntValue3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
                int i31 = 805306368;
                if (i8 != 0) {
                    i18 |= i31;
                } else if ((iIntValue & 805306368) == 0) {
                    i31 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 536870912 : 268435456;
                    i18 |= i31;
                }
                boolean z4 = zBooleanValue;
                i9 = iIntValue3 & 1024;
                if (i9 != 0) {
                    i10 = iIntValue2 | 6;
                } else if ((iIntValue2 & 6) == 0) {
                    i10 = iIntValue2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 4 : 2);
                } else {
                    i10 = iIntValue2;
                }
                Function2 function22 = function2;
                i11 = iIntValue3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((iIntValue2 & 48) == 0) {
                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue2) ? 32 : 16;
                }
                int i32 = i10;
                float fIAuthTabCallback = fFloatValue;
                float fIAuthTabCallback2 = fFloatValue2;
                if ((i18 & 306783379) == 306783378 && (i32 & 19) == 18) {
                    int i33 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i33 % 128;
                    int i34 = i33 % 2;
                    z = false;
                } else {
                    z = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i18 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda610;
                    cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda69;
                    z3 = z4;
                    function12 = function13;
                    f = fIAuthTabCallback;
                    aFf1bSDK2 = aFf1bSDK;
                } else {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i2 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    if (i3 != 0) {
                        cameraPresenceProviderExternalSyntheticLambda62 = null;
                    }
                    if (i4 != 0) {
                        cameraPresenceProviderExternalSyntheticLambda63 = null;
                    }
                    if (i5 != 0) {
                        int i35 = onExtraCallbackWithResult + 41;
                        onExtraCallback = i35 % 128;
                        z4 = i35 % 2 != 0;
                    }
                    if (i7 != 0) {
                        int i36 = onExtraCallback + 33;
                        onExtraCallbackWithResult = i36 % 128;
                        if (i36 % 2 == 0) {
                            z2 = false;
                            int i37 = 44 / 0;
                        } else {
                            z2 = false;
                        }
                        function22 = null;
                    } else {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda7
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i38 = 2 % 2;
                                    int i39 = onNavigationEvent + 33;
                                    onExtraCallbackWithResult = i39 % 128;
                                    int i40 = i39 % 2;
                                    int iIntValue4 = ((Integer) obj).intValue();
                                    if (i40 == 0) {
                                        return AFf1dSDK.onExtraCallback(iIntValue4);
                                    }
                                    AFf1dSDK.onExtraCallback(iIntValue4);
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function1 = (Function1) objOnMinimized;
                    } else {
                        function1 = function13;
                    }
                    if (i9 != 0) {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    }
                    if (i11 != 0) {
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(622974915, i18, i32, "im.toss.tosssecurities.uikit.chart.PointerInputChart (Chart.kt:162)");
                    }
                    AFf1bSDK aFf1bSDK4 = aFf1bSDK;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(aFf1bSDK4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i18 >> 3) & 14);
                    Unit unit = Unit.INSTANCE;
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                    if ((1879048192 & i18) == 536870912) {
                        z2 = true;
                    }
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z2 | zOnNavigationEvent) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, function1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    int i38 = i18 & 268434558;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    aFf1bSDK2 = aFf1bSDK4;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport03;
                    cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda610;
                    cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda69;
                    onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK4, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport03, unit, (PointerInputEventHandler) objOnMinimized2), 0.0f, fIAuthTabCallback, 0.0f, fIAuthTabCallback2, 5, (Object) null), (CameraPresenceProviderExternalSyntheticLambda6<Double>) cameraPresenceProviderExternalSyntheticLambda62, (CameraPresenceProviderExternalSyntheticLambda6<Double>) cameraPresenceProviderExternalSyntheticLambda63, z4, cameraPresenceProviderExternalSyntheticLambda69, cameraPresenceProviderExternalSyntheticLambda610, function22, cameraCaptureResultEmptyCameraCaptureResult, i38, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    function12 = function1;
                    z3 = z4;
                    f = fIAuthTabCallback;
                }
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda611 = cameraPresenceProviderExternalSyntheticLambda63;
                final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda612 = cameraPresenceProviderExternalSyntheticLambda62;
                final Function2 function23 = function22;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda613 = cameraPresenceProviderExternalSyntheticLambda6;
                    final AFf1bSDK aFf1bSDK5 = aFf1bSDK2;
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda614 = cameraPresenceProviderExternalSyntheticLambda65;
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda615 = cameraPresenceProviderExternalSyntheticLambda64;
                    final float f2 = fIAuthTabCallback2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$$ExternalSyntheticLambda8
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i39 = 2 % 2;
                            int i40 = IAuthTabCallback + 119;
                            onNavigationEvent = i40 % 128;
                            int i41 = i40 % 2;
                            Unit unitOnExtraCallback = AFf1dSDK.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda613, aFf1bSDK5, quirksExternalSyntheticBackport04, cameraPresenceProviderExternalSyntheticLambda612, cameraPresenceProviderExternalSyntheticLambda611, z3, cameraPresenceProviderExternalSyntheticLambda614, cameraPresenceProviderExternalSyntheticLambda615, function23, function12, f, f2, iIntValue, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i42 = onNavigationEvent + 15;
                            IAuthTabCallback = i42 % 128;
                            if (i42 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    });
                }
                return null;
            }
            i18 |= 196608;
            cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda67;
            cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda68;
            if ((1572864 & iIntValue) == 0) {
            }
            if ((12582912 & iIntValue) == 0) {
            }
            i7 = iIntValue3 & 256;
            int i302 = 100663296;
            if (i7 != 0) {
            }
            i8 = iIntValue3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
            int i312 = 805306368;
            if (i8 != 0) {
            }
            boolean z42 = zBooleanValue;
            i9 = iIntValue3 & 1024;
            if (i9 != 0) {
            }
            Function2 function222 = function2;
            i11 = iIntValue3 & 2048;
            if (i11 != 0) {
            }
            int i322 = i10;
            float fIAuthTabCallback3 = fFloatValue;
            float fIAuthTabCallback22 = fFloatValue2;
            if ((i18 & 306783379) == 306783378) {
                z = true;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i18 & 1)) {
            }
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport0;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6112 = cameraPresenceProviderExternalSyntheticLambda63;
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6122 = cameraPresenceProviderExternalSyntheticLambda62;
            final Function2 function232 = function222;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        i18 |= 384;
        i2 = i19;
        i3 = iIntValue3 & 8;
        if (i3 == 0) {
        }
        i4 = iIntValue3 & 16;
        if (i4 == 0) {
        }
        i5 = iIntValue3 & 32;
        if (i5 != 0) {
        }
        cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda67;
        cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda68;
        if ((1572864 & iIntValue) == 0) {
        }
        if ((12582912 & iIntValue) == 0) {
        }
        i7 = iIntValue3 & 256;
        int i3022 = 100663296;
        if (i7 != 0) {
        }
        i8 = iIntValue3 & Imgcodecs.IMWRITE_AVIF_QUALITY;
        int i3122 = 805306368;
        if (i8 != 0) {
        }
        boolean z422 = zBooleanValue;
        i9 = iIntValue3 & 1024;
        if (i9 != 0) {
        }
        Function2 function2222 = function2;
        i11 = iIntValue3 & 2048;
        if (i11 != 0) {
        }
        int i3222 = i10;
        float fIAuthTabCallback32 = fFloatValue;
        float fIAuthTabCallback222 = fFloatValue2;
        if ((i18 & 306783379) == 306783378) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i18 & 1)) {
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0422 = quirksExternalSyntheticBackport0;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda61122 = cameraPresenceProviderExternalSyntheticLambda63;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda61222 = cameraPresenceProviderExternalSyntheticLambda62;
        final Function2 function2322 = function2222;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static final Unit IAuthTabCallback(setUseCaseAttached setusecaseattached) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
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

    public static final Object onExtraCallbackWithResult(@NotNull HighPriorityExecutor highPriorityExecutor, @NotNull Function1<? super setUseCaseAttached, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super HandlerScheduledExecutorService2, ? super setUseCaseAttached, Unit> function2, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, new onExtraCallbackWithResult(function1, function0, function02, function2, null), access13800Var);
        if (objOnWarmupCompleted == access14100.onExtraCallback()) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
        return unit;
    }

    public static final class onExtraCallbackWithResult extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function2<HandlerScheduledExecutorService2, setUseCaseAttached, Unit> $onDrag;
        final /* synthetic */ Function0<Unit> $onDragCancel;
        final /* synthetic */ Function0<Unit> $onDragEnd;
        final /* synthetic */ Function1<setUseCaseAttached, Unit> $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function1<? super setUseCaseAttached, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super HandlerScheduledExecutorService2, ? super setUseCaseAttached, Unit> function2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$onDragStart = function1;
            this.$onDragEnd = function0;
            this.$onDragCancel = function02;
            this.$onDrag = function2;
        }

        public static /* synthetic */ Unit onNavigationEvent(Function2 function2, HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(function2, handlerScheduledExecutorService2);
            int i4 = IAuthTabCallback + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(audioExecutor1, access13800Var);
            if (i3 != 0) {
                int i4 = 31 / 0;
            }
            int i5 = IAuthTabCallback + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(audioExecutor1, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 56 / 0;
            }
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallback(Function2 function2, HandlerScheduledExecutorService2 handlerScheduledExecutorService2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                function2.invoke(handlerScheduledExecutorService2, setUseCaseAttached.onNavigationEvent(DirectExecutor.IAuthTabCallback(handlerScheduledExecutorService2)));
                handlerScheduledExecutorService2.onExtraCallback();
                return Unit.INSTANCE;
            }
            function2.invoke(handlerScheduledExecutorService2, setUseCaseAttached.onNavigationEvent(DirectExecutor.IAuthTabCallback(handlerScheduledExecutorService2)));
            handlerScheduledExecutorService2.onExtraCallback();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[Catch: CancellationException -> 0x0061, TryCatch #1 {CancellationException -> 0x0061, blocks: (B:13:0x0039, B:34:0x00e7, B:38:0x00fa, B:39:0x0105, B:45:0x0123, B:47:0x012f, B:48:0x0132, B:49:0x0135, B:51:0x013f, B:55:0x0143, B:40:0x010a, B:59:0x0155, B:18:0x004c, B:29:0x00b3, B:31:0x00b7, B:20:0x005b, B:27:0x0078, B:25:0x0067), top: B:67:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[Catch: CancellationException -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0061, blocks: (B:13:0x0039, B:34:0x00e7, B:38:0x00fa, B:39:0x0105, B:45:0x0123, B:47:0x012f, B:48:0x0132, B:49:0x0135, B:51:0x013f, B:55:0x0143, B:40:0x010a, B:59:0x0155, B:18:0x004c, B:29:0x00b3, B:31:0x00b7, B:20:0x005b, B:27:0x0078, B:25:0x0067), top: B:67:0x0014 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            HandlerScheduledExecutorService2 handlerScheduledExecutorService2;
            Object objOnExtraCallbackWithResult;
            HandlerScheduledExecutorService2 handlerScheduledExecutorService22;
            Object objOnExtraCallbackWithResult2;
            List listOnExtraCallbackWithResult;
            List list;
            int i = 2 % 2;
            AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    this.L$0 = audioExecutor1;
                    this.label = 1;
                    objOnWarmupCompleted = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor1, false, (createPostFailedException) null, this, 2, (Object) null);
                    if (objOnWarmupCompleted != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
                if (i2 != 1) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 107;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 == 2) {
                        handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) this.L$1;
                        ResultKt.onNavigationEvent(obj);
                        int i6 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        objOnExtraCallbackWithResult = obj;
                        handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) objOnExtraCallbackWithResult;
                        if (handlerScheduledExecutorService22 != null) {
                            this.$onDragStart.invoke(setUseCaseAttached.onNavigationEvent(handlerScheduledExecutorService22.IAuthTabCallback()));
                            long jOnNavigationEvent = handlerScheduledExecutorService22.onNavigationEvent();
                            final Function2<HandlerScheduledExecutorService2, setUseCaseAttached, Unit> function2 = this.$onDrag;
                            Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.chart.ChartKt$detectDragGesturesAfterShortenLongPress$5$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i8 = 2 % 2;
                                    int i9 = onExtraCallbackWithResult + 55;
                                    onExtraCallback = i9 % 128;
                                    int i10 = i9 % 2;
                                    Unit unitOnNavigationEvent = AFf1dSDK.onExtraCallbackWithResult.onNavigationEvent(function2, (HandlerScheduledExecutorService2) obj2);
                                    int i11 = onExtraCallback + 55;
                                    onExtraCallbackWithResult = i11 % 128;
                                    int i12 = i11 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            this.L$0 = audioExecutor1;
                            this.L$1 = access15400.onNavigationEvent(handlerScheduledExecutorService2);
                            this.L$2 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                            this.label = 3;
                            objOnExtraCallbackWithResult2 = FeatureCombinationQueryImplExternalSyntheticLambda10.onExtraCallbackWithResult(audioExecutor1, jOnNavigationEvent, function1, this);
                            if (objOnExtraCallbackWithResult2 == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                            if (((Boolean) objOnExtraCallbackWithResult2).booleanValue()) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i8 = i3 + 9;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0 ? i2 != 3 : i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult2 = obj;
                    if (((Boolean) objOnExtraCallbackWithResult2).booleanValue()) {
                        this.$onDragCancel.invoke();
                    } else {
                        int i9 = onWarmupCompleted + 113;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            listOnExtraCallbackWithResult = audioExecutor1.onWarmupCompleted().onExtraCallbackWithResult();
                            list = listOnExtraCallbackWithResult;
                        } else {
                            listOnExtraCallbackWithResult = audioExecutor1.onWarmupCompleted().onExtraCallbackWithResult();
                            list = listOnExtraCallbackWithResult;
                        }
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            int i11 = onWarmupCompleted + 29;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 == 0) {
                                DirectExecutor.onNavigationEvent((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i10));
                                throw null;
                            }
                            HandlerScheduledExecutorService2 handlerScheduledExecutorService23 = (HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i10);
                            if (DirectExecutor.onNavigationEvent(handlerScheduledExecutorService23)) {
                                handlerScheduledExecutorService23.onExtraCallback();
                            }
                        }
                        this.$onDragEnd.invoke();
                        int i12 = onWarmupCompleted + 5;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 4 / 3;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
                handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) objOnWarmupCompleted;
                long jOnNavigationEvent2 = handlerScheduledExecutorService2.onNavigationEvent();
                this.L$0 = audioExecutor1;
                this.L$1 = access15400.onNavigationEvent(handlerScheduledExecutorService2);
                this.label = 2;
                objOnExtraCallbackWithResult = AFf1dSDK.onExtraCallbackWithResult(800957222, new Object[]{audioExecutor1, Long.valueOf(jOnNavigationEvent2), this}, -800957222, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                Object obj2 = objOnExtraCallbackWithResult;
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) objOnExtraCallbackWithResult;
                    if (handlerScheduledExecutorService22 != null) {
                    }
                    return Unit.INSTANCE;
                }
                return objOnExtraCallback;
            } catch (CancellationException e) {
                this.$onDragCancel.invoke();
                throw e;
            }
        }
    }

    static final class onWarmupCompleted extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Ref.ObjectRef<HandlerScheduledExecutorService2> $currentDown;
        final /* synthetic */ Ref.ObjectRef<HandlerScheduledExecutorService2> $longPress;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Ref.ObjectRef<HandlerScheduledExecutorService2> objectRef, Ref.ObjectRef<HandlerScheduledExecutorService2> objectRef2, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$currentDown = objectRef;
            this.$longPress = objectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$currentDown, this.$longPress, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(audioExecutor1, access13800Var);
            int i4 = onWarmupCompleted + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(audioExecutor1, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onwarmupcompleted.invokeSuspend(unit);
            }
            onwarmupcompleted.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        
            r4 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
        
            if (r5 == r3) goto L68;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009c A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7, types: [T, o.HandlerScheduledExecutorService2] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:18:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            newHandlerExecutor newhandlerexecutor;
            Object objIAuthTabCallback;
            AudioExecutor1 audioExecutor1;
            T t;
            Object obj2;
            int i2 = 2;
            int i3 = 2 % 2;
            AudioExecutor1 audioExecutor12 = (AudioExecutor1) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = this.label;
            Object obj3 = null;
            int i5 = 0;
            if (i4 != 0) {
                int i6 = onWarmupCompleted + 43;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0 ? i4 == 1 : i4 == 1) {
                    i = this.I$0;
                    ResultKt.onNavigationEvent(obj);
                    Object objIAuthTabCallback2 = obj;
                    newhandlerexecutor = (newHandlerExecutor) objIAuthTabCallback2;
                    List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
                    int size = listOnExtraCallbackWithResult.size();
                    int i7 = i5;
                    while (true) {
                        if (i7 >= size) {
                            int i8 = onWarmupCompleted + 23;
                            onExtraCallback = i8 % 128;
                            if (i8 % i2 == 0) {
                                int i9 = 23 / i5;
                                if (!DirectExecutor.onExtraCallback((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i7))) {
                                    break;
                                }
                                i7++;
                            } else {
                                if (!DirectExecutor.onExtraCallback((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i7))) {
                                    break;
                                }
                                i7++;
                            }
                            if (i == 0) {
                                return Unit.INSTANCE;
                            }
                            createPostFailedException createpostfailedexception = createPostFailedException.Main;
                            this.L$0 = audioExecutor12;
                            this.L$1 = obj3;
                            this.I$0 = i;
                            this.label = 1;
                            objIAuthTabCallback2 = audioExecutor12.IAuthTabCallback(createpostfailedexception, this);
                            if (objIAuthTabCallback2 != objOnExtraCallback) {
                                newhandlerexecutor = (newHandlerExecutor) objIAuthTabCallback2;
                                List listOnExtraCallbackWithResult2 = newhandlerexecutor.onExtraCallbackWithResult();
                                int size2 = listOnExtraCallbackWithResult2.size();
                                int i72 = i5;
                                if (i72 >= size2) {
                                    i = 1;
                                    break;
                                }
                            }
                            return objOnExtraCallback;
                        }
                    }
                    List listOnExtraCallbackWithResult3 = newhandlerexecutor.onExtraCallbackWithResult();
                    int size3 = listOnExtraCallbackWithResult3.size();
                    for (int i10 = i5; i10 < size3; i10++) {
                        HandlerScheduledExecutorService2 handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) listOnExtraCallbackWithResult3.get(i10);
                        if (handlerScheduledExecutorService2.IAuthTabCallback_Parcel() || DirectExecutor.onNavigationEvent(handlerScheduledExecutorService2, audioExecutor12.onExtraCallbackWithResult(), audioExecutor12.onExtraCallback())) {
                            break;
                        }
                    }
                    createPostFailedException createpostfailedexception2 = createPostFailedException.Final;
                    this.L$0 = audioExecutor12;
                    this.L$1 = newhandlerexecutor;
                    this.I$0 = i;
                    this.label = i2;
                    objIAuthTabCallback = audioExecutor12.IAuthTabCallback(createpostfailedexception2, this);
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    newhandlerexecutor = (newHandlerExecutor) this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    int i11 = onExtraCallback + 77;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    objIAuthTabCallback = obj;
                    List listOnExtraCallbackWithResult4 = ((newHandlerExecutor) objIAuthTabCallback).onExtraCallbackWithResult();
                    int size4 = listOnExtraCallbackWithResult4.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size4) {
                            break;
                        }
                        if (((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult4.get(i13)).IAuthTabCallback_Parcel()) {
                            int i14 = onWarmupCompleted + 51;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % i2;
                            i = 1;
                            break;
                        }
                        i13++;
                    }
                    if (AFf1dSDK.onExtraCallbackWithResult(newhandlerexecutor, this.$currentDown.element.onNavigationEvent())) {
                        List listOnExtraCallbackWithResult5 = newhandlerexecutor.onExtraCallbackWithResult();
                        int size5 = listOnExtraCallbackWithResult5.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size5) {
                                int i17 = onExtraCallback + 85;
                                onWarmupCompleted = i17 % 128;
                                int i18 = i17 % i2;
                                obj2 = null;
                                break;
                            }
                            obj2 = listOnExtraCallbackWithResult5.get(i16);
                            if (((HandlerScheduledExecutorService2) obj2).IAuthTabCallbackStub()) {
                                break;
                            }
                            i16++;
                        }
                        ?? r9 = (HandlerScheduledExecutorService2) obj2;
                        if (r9 != 0) {
                            this.$currentDown.element = r9;
                            this.$longPress.element = r9;
                            audioExecutor1 = audioExecutor12;
                        } else {
                            i = 1;
                            obj3 = null;
                            i5 = 0;
                            if (i == 0) {
                            }
                        }
                    } else {
                        Ref.ObjectRef<HandlerScheduledExecutorService2> objectRef = this.$longPress;
                        List listOnExtraCallbackWithResult6 = newhandlerexecutor.onExtraCallbackWithResult();
                        Ref.ObjectRef<HandlerScheduledExecutorService2> objectRef2 = this.$currentDown;
                        int size6 = listOnExtraCallbackWithResult6.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size6) {
                                audioExecutor1 = audioExecutor12;
                                t = 0;
                                break;
                            }
                            t = listOnExtraCallbackWithResult6.get(i19);
                            audioExecutor1 = audioExecutor12;
                            if (HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) t).onNavigationEvent(), objectRef2.element.onNavigationEvent())) {
                                break;
                            }
                            i19++;
                            audioExecutor12 = audioExecutor1;
                        }
                        objectRef.element = t;
                    }
                    audioExecutor12 = audioExecutor1;
                    i2 = 2;
                    obj3 = null;
                    i5 = 0;
                    if (i == 0) {
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                i = 0;
                if (i == 0) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Type inference failed for: r13v9, types: [T, java.lang.Object, o.HandlerScheduledExecutorService2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onExtraCallback onextracallback;
        Object obj;
        Ref.ObjectRef objectRef;
        HandlerScheduledExecutorService2 handlerScheduledExecutorService2;
        int i = 0;
        AudioExecutor1 audioExecutor1 = (AudioExecutor1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        access13800 access13800Var = (access13800) objArr[2];
        int i2 = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            int i3 = onExtraCallbackWithResult + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onextracallback = (onExtraCallback) access13800Var;
            int i5 = onextracallback.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i5 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj2 = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = onextracallback.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj2);
            if (onWarmupCompleted(audioExecutor1.onWarmupCompleted(), jLongValue)) {
                int i7 = onExtraCallbackWithResult + 89;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            List listOnExtraCallbackWithResult = audioExecutor1.onWarmupCompleted().onExtraCallbackWithResult();
            int size = listOnExtraCallbackWithResult.size();
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                int i8 = onExtraCallback + 111;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i)).onNavigationEvent(), jLongValue);
                    throw null;
                }
                obj = listOnExtraCallbackWithResult.get(i);
                if (HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) obj).onNavigationEvent(), jLongValue)) {
                    break;
                }
                i++;
            }
            ?? r13 = (HandlerScheduledExecutorService2) obj;
            if (r13 == 0) {
                return null;
            }
            objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r13;
            try {
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(objectRef2, objectRef, null);
                onextracallback.L$0 = access15400.onNavigationEvent(audioExecutor1);
                onextracallback.L$1 = r13;
                onextracallback.L$2 = objectRef;
                onextracallback.L$3 = access15400.onNavigationEvent(objectRef2);
                onextracallback.J$0 = jLongValue;
                onextracallback.J$1 = 100L;
                onextracallback.label = 1;
                if (audioExecutor1.onWarmupCompleted(100L, onwarmupcompleted, onextracallback) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                int i9 = onExtraCallbackWithResult + 81;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return null;
            } catch (currentThreadExecutor unused) {
                handlerScheduledExecutorService2 = r13;
                HandlerScheduledExecutorService2 handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) objectRef.element;
                return handlerScheduledExecutorService22 == null ? handlerScheduledExecutorService22 : handlerScheduledExecutorService2;
            }
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = (Ref.ObjectRef) onextracallback.L$2;
        handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) onextracallback.L$1;
        try {
            ResultKt.onNavigationEvent(obj2);
            int i92 = onExtraCallbackWithResult + 81;
            onExtraCallback = i92 % 128;
            int i102 = i92 % 2;
            return null;
        } catch (currentThreadExecutor unused2) {
            HandlerScheduledExecutorService2 handlerScheduledExecutorService222 = (HandlerScheduledExecutorService2) objectRef.element;
            if (handlerScheduledExecutorService222 == null) {
            }
        }
    }

    private static final boolean onWarmupCompleted(newHandlerExecutor newhandlerexecutor, long j) {
        Object obj;
        int i = 2 % 2;
        List listOnExtraCallbackWithResult = newhandlerexecutor.onExtraCallbackWithResult();
        int size = listOnExtraCallbackWithResult.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= size) {
                int i3 = onExtraCallback + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                break;
            }
            int i5 = onExtraCallbackWithResult + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) listOnExtraCallbackWithResult.get(i2)).onNavigationEvent(), j);
                throw null;
            }
            obj = listOnExtraCallbackWithResult.get(i2);
            if (HandlerScheduledExecutorServiceHandlerScheduledFuture.onExtraCallbackWithResult(((HandlerScheduledExecutorService2) obj).onNavigationEvent(), j)) {
                break;
            }
            i2++;
            int i6 = onExtraCallback + 119;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 5;
            }
        }
        HandlerScheduledExecutorService2 handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) obj;
        if (handlerScheduledExecutorService2 != null) {
            int i8 = onExtraCallbackWithResult + 97;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (handlerScheduledExecutorService2.IAuthTabCallbackStub()) {
                int i10 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            }
        }
        return true ^ z;
    }

    public static final <T extends AFf1jSDK> int onExtraCallbackWithResult(@NotNull List<? extends AFf1fSDK<T>> list, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int i2 = 0;
        if (list.isEmpty()) {
            int i3 = onExtraCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 33 / 0;
            }
            return -1;
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i5 = (int) (j >> 32);
        if (Float.intBitsToFloat((int) (list.get(lastIndex).IAuthTabCallback() >> 32)) <= Float.intBitsToFloat(i5)) {
            int i6 = onExtraCallbackWithResult + 61;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
            }
            return lastIndex;
        }
        while (i2 <= lastIndex) {
            int i8 = ((lastIndex - i2) / 2) + i2;
            int iIAuthTabCallback = (int) (list.get(i8).IAuthTabCallback() >> 32);
            if (Float.intBitsToFloat(iIAuthTabCallback) == Float.intBitsToFloat(i5)) {
                int i9 = onExtraCallbackWithResult + 55;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    return i8;
                }
                throw null;
            }
            if (Float.intBitsToFloat(iIAuthTabCallback) < Float.intBitsToFloat(i5)) {
                i2 = i8 + 1;
            } else {
                lastIndex = i8 - 1;
            }
        }
        return i2;
    }

    private static final AFf1bSDK<Object> IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends AFf1bSDK<Object>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFf1bSDK<Object> aFf1bSDK = (AFf1bSDK) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return aFf1bSDK;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallback + 113;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AFf1bSDK aFf1bSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(z), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(2109191756, objArr, -2109191753, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static final <T extends AFf1jSDK> void IAuthTabCallback(@NotNull CameraPresenceProviderExternalSyntheticLambda6<? extends List<? extends T>> cameraPresenceProviderExternalSyntheticLambda6, @NotNull AFf1bSDK<T> aFf1bSDK, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda62, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Double> cameraPresenceProviderExternalSyntheticLambda63, boolean z, @NotNull CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda64, @NotNull CameraPresenceProviderExternalSyntheticLambda6<AFf1gSDK<T>> cameraPresenceProviderExternalSyntheticLambda65, @Nullable Function2<? super setOrientationDegrees, ? super AFf1bSDK<T>, Unit> function2, @Nullable Function1<? super Integer, Unit> function1, float f, float f2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(z), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, function1, Float.valueOf(f), Float.valueOf(f2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallbackWithResult(1916608670, objArr, -1916608669, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, AFf1bSDK aFf1bSDK, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda63, boolean z, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda64, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda65, Function2 function2, Function1 function1, float f, float f2, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6, aFf1bSDK, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda62, cameraPresenceProviderExternalSyntheticLambda63, Boolean.valueOf(z), cameraPresenceProviderExternalSyntheticLambda64, cameraPresenceProviderExternalSyntheticLambda65, function2, function1, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(-1282901421, objArr, 1282901425, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    public static final Object onNavigationEvent(@NotNull AudioExecutor1 audioExecutor1, long j, @NotNull access13800<? super HandlerScheduledExecutorService2> access13800Var) {
        Object[] objArr = {audioExecutor1, Long.valueOf(j), access13800Var};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return onExtraCallbackWithResult(800957222, objArr, -800957222, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }

    private static final Unit onWarmupCompleted() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(-409370631, new Object[0], 409370633, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
    }
}
