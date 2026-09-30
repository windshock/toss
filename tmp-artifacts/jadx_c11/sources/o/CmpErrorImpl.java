package o;

import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.Camera2CameraControlImplExternalSyntheticLambda2;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CmpErrorImpl;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.Futures3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o._string;
import o.decrementVideoUsage;
import o.getCmpMessage;
import o.isInVideoUsage;
import o.removeChildrenForExpandedActionView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpErrorImpl {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i2;
        int i10 = ~i;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i2 + i4 + i5 + (563899752 * i6) + (667302295 * i3);
        int i15 = i14 * i14;
        int i16 = (i2 * (-901935710)) + 144807674 + (i4 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + ((-901935539) * i5) + (42244168 * i6) + ((-913566613) * i3) + (i15 * (-1006501888));
        if (((i2 * 1426164010) - 416808960) + (1426164010 * i4) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i6) + (1914175488 * i3) + ((-1995833344) * i15) + (i16 * i16 * (-1006239744)) != 1) {
            return onNavigationEvent(objArr);
        }
        getCmpMessage getcmpmessage = (getCmpMessage) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[2];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[3];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel = (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) objArr[6];
        QuirkSettingsLoader.onNavigationEvent onnavigationevent = (QuirkSettingsLoader.onNavigationEvent) objArr[7];
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2 = (Camera2CameraControlImplExternalSyntheticLambda2) objArr[8];
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        removeChildrenForExpandedActionView removechildrenforexpandedactionview = (removeChildrenForExpandedActionView) objArr[10];
        Function1 function1 = (Function1) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        int iIntValue4 = ((Number) objArr[16]).intValue();
        int i17 = 2 % 2;
        int i18 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getcmpmessage, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, zBooleanValue, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, zBooleanValue2, removechildrenforexpandedactionview, function1, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i20 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(getCmpMessage getcmpmessage, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, removeChildrenForExpandedActionView removechildrenforexpandedactionview, Function1 function1, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        IAuthTabCallback(getcmpmessage, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, removechildrenforexpandedactionview, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getCmpMessage getcmpmessage, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, getcmpmessage, cameraPresenceProviderExternalSyntheticLambda62, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        getCmpMessage getcmpmessage = (getCmpMessage) objArr[1];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[2];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[3];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[4];
        Configuration configuration = (Configuration) objArr[5];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[6];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[7];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(findresandmsg, getcmpmessage, r8lambdanm9dm2eewl4vrptnjmesfjqky4, camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, configuration, cameraPresenceProviderExternalSyntheticLambda62, isinvideousage);
        }
        onNavigationEvent(findresandmsg, getcmpmessage, r8lambdanm9dm2eewl4vrptnjmesfjqky4, camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, configuration, cameraPresenceProviderExternalSyntheticLambda62, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getCmpMessage getcmpmessage, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, getcmpmessage, cameraPresenceProviderExternalSyntheticLambda62, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public onWarmupCompleted(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            auth.onNavigationEvent.IAuthTabCallback(th, access8100.onNavigationEvent(getWrite.IAuthTabCallback("context", String.valueOf(coroutineContext))));
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getCmpMessage onWarmupCompleted;

        public onNavigationEvent(getCmpMessage getcmpmessage) {
            this.onWarmupCompleted = getcmpmessage;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.onExtraCallback();
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(FuturesCallbackListener.onTransact(futures3)));
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setUseCaseAttached.onNavigationEvent(FuturesCallbackListener.onTransact(futures3)));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final getCmpMessage getcmpmessage, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, @Nullable FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, @Nullable QuirkSettingsLoader.onNavigationEvent onnavigationevent, @Nullable Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, @Nullable removeChildrenForExpandedActionView removechildrenforexpandedactionview, @NotNull final Function1<? super AudioRestrictionControllerImplExternalSyntheticLambda0, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda62;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final boolean z3;
        final FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel2;
        final QuirkSettingsLoader.onNavigationEvent onnavigationevent2;
        final boolean z4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda63;
        final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda13;
        final Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda22;
        final removeChildrenForExpandedActionView removechildrenforexpandedactionview2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda64;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallback;
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback;
        boolean z5;
        removeChildrenForExpandedActionView removechildrenforexpandedactionview3;
        boolean z6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent3;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel3;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda65;
        boolean z7;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda14;
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda23;
        int i13;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        removeChildrenForExpandedActionView removechildrenforexpandedactionviewOnWarmupCompleted;
        int i14;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        setUseCaseAttached setusecaseattachedOnNavigationEvent;
        int i15;
        int i16 = 2 % 2;
        Intrinsics.checkNotNullParameter(getcmpmessage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-701232807);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getcmpmessage) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i18 = onNavigationEvent + 31;
                    onExtraCallbackWithResult = i18 % 128;
                    int i19 = i18 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                int i20 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                        int i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda12) ? 2048 : 1024;
                        i4 |= i22;
                    } else {
                        camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                    }
                    i4 |= i22;
                } else {
                    camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                    if ((i & 24576) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                            int i23 = onNavigationEvent + 83;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        i4 |= ((i3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback_Parcel)) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraControlImplExternalSyntheticLambda2)) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i12 = i2 | (((i3 & 1024) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(removechildrenforexpandedactionview)) ? 4 : 2);
                    } else {
                        i12 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i12 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        z3 = z;
                        iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                        onnavigationevent2 = onnavigationevent;
                        z4 = z2;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda62;
                        camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda12;
                        camera2CameraControlImplExternalSyntheticLambda22 = camera2CameraControlImplExternalSyntheticLambda2;
                        removechildrenforexpandedactionview2 = removechildrenforexpandedactionview;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if (i6 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                cameraPresenceProviderExternalSyntheticLambda64 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                            } else {
                                cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda62;
                            }
                            if ((i3 & 8) != 0) {
                                int i25 = onNavigationEvent + 103;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                                i4 &= -7169;
                            } else {
                                camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = camera2CameraMetadataExternalSyntheticLambda12;
                            }
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = i7 != 0 ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) : deviceQuirksExternalSyntheticLambda0;
                            boolean z8 = i8 != 0 ? false : z;
                            if ((i3 & 64) != 0) {
                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                if (z8) {
                                    iAuthTabCallback_ParcelIAuthTabCallback = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallback();
                                } else {
                                    int i27 = onExtraCallbackWithResult + 75;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % 2;
                                    iAuthTabCallback_ParcelIAuthTabCallback = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                                }
                                i4 &= -3670017;
                            } else {
                                iAuthTabCallback_ParcelIAuthTabCallback = iAuthTabCallback_Parcel;
                            }
                            QuirkSettingsLoader.onNavigationEvent onnavigationeventIAuthTabCallbackStubProxy = i10 != 0 ? QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy() : onnavigationevent;
                            if ((i3 & 256) != 0) {
                                camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback = Camera2CameraImplExternalSyntheticLambda22.onWarmupCompleted.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Camera2CameraImplExternalSyntheticLambda22.IAuthTabCallback);
                                i4 &= -234881025;
                            } else {
                                camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback = camera2CameraControlImplExternalSyntheticLambda2;
                            }
                            if (i11 != 0) {
                                int i29 = onExtraCallbackWithResult + 45;
                                onNavigationEvent = i29 % 128;
                                int i30 = i29 % 2;
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if ((i3 & 1024) != 0) {
                                int i31 = onExtraCallbackWithResult + 1;
                                onNavigationEvent = i31 % 128;
                                if (i31 % 2 == 0) {
                                    removechildrenforexpandedactionviewOnWarmupCompleted = setBackInvokedCallbackEnabled.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1);
                                    i14 = i12 & 81;
                                } else {
                                    removechildrenforexpandedactionviewOnWarmupCompleted = setBackInvokedCallbackEnabled.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    i14 = i12 & (-15);
                                }
                                i12 = i14;
                                z6 = z5;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                onnavigationevent3 = onnavigationeventIAuthTabCallbackStubProxy;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_ParcelIAuthTabCallback;
                                cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda64;
                                z7 = z8;
                                removechildrenforexpandedactionview3 = removechildrenforexpandedactionviewOnWarmupCompleted;
                            } else {
                                removechildrenforexpandedactionview3 = removechildrenforexpandedactionview;
                                z6 = z5;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                onnavigationevent3 = onnavigationeventIAuthTabCallbackStubProxy;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_ParcelIAuthTabCallback;
                                cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda64;
                                z7 = z8;
                            }
                            camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                            camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback;
                            i13 = i12;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                        } else {
                            int i32 = onNavigationEvent + 115;
                            onExtraCallbackWithResult = i32 % 128;
                            if (i32 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i3 & 39) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                if ((i3 & 1024) != 0) {
                                    i12 &= -15;
                                }
                                z7 = z;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel;
                                onnavigationevent3 = onnavigationevent;
                                camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2;
                                z6 = z2;
                                removechildrenforexpandedactionview3 = removechildrenforexpandedactionview;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda62;
                                camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda12;
                                i13 = i12;
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i3 & 8) != 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if ((i3 & 256) != 0) {
                                }
                                if ((i3 & 1024) != 0) {
                                }
                                z7 = z;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel;
                                onnavigationevent3 = onnavigationevent;
                                camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2;
                                z6 = z2;
                                removechildrenforexpandedactionview3 = removechildrenforexpandedactionview;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda62;
                                camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda12;
                                i13 = i12;
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-701232807, i4, i13, "im.toss.securities.core.exposure.v2.ExposureTrackLazyColumnV2 (LazyListExposureEffectV2.kt:53)");
                        }
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            int i33 = onExtraCallbackWithResult + 73;
                            onNavigationEvent = i33 % 128;
                            if (i33 % 2 == 0) {
                                setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
                                i15 = 3;
                                cameraPresenceProviderExternalSyntheticLambda0 = null;
                            } else {
                                cameraPresenceProviderExternalSyntheticLambda0 = null;
                                setusecaseattachedOnNavigationEvent = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
                                i15 = 2;
                            }
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setusecaseattachedOnNavigationEvent, cameraPresenceProviderExternalSyntheticLambda0, i15, cameraPresenceProviderExternalSyntheticLambda0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                        int i34 = i4 >> 6;
                        onExtraCallback(cameraPresenceProviderExternalSyntheticLambda65, camera2CameraMetadataExternalSyntheticLambda14, getcmpmessage, getsupportedhighspeedresolutionsfor, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 << 6) & 896) | (i34 & 14) | 3072 | (i34 & 112), 0);
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new Function1() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$$ExternalSyntheticLambda2
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj) {
                                    int i35 = 2 % 2;
                                    int i36 = onNavigationEvent + 21;
                                    onExtraCallback = i36 % 128;
                                    int i37 = i36 % 2;
                                    Unit unitOnNavigationEvent = CmpErrorImpl.onNavigationEvent(getsupportedhighspeedresolutionsfor, (Futures3) obj);
                                    int i38 = onExtraCallback + 109;
                                    onNavigationEvent = i38 % 128;
                                    if (i38 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        int i35 = i13 << 24;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        ResolutionCorrector.onWarmupCompleted(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport04, (Function1) objOnMinimized3), camera2CameraMetadataExternalSyntheticLambda14, deviceQuirksExternalSyntheticLambda03, z7, iAuthTabCallback_Parcel3, onnavigationevent3, camera2CameraControlImplExternalSyntheticLambda23, z6, removechildrenforexpandedactionview3, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (33554416 & i34) | (234881024 & i35) | (i35 & 1879048192), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda65;
                        camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda14;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                        z3 = z7;
                        iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel3;
                        onnavigationevent2 = onnavigationevent3;
                        camera2CameraControlImplExternalSyntheticLambda22 = camera2CameraControlImplExternalSyntheticLambda23;
                        z4 = z6;
                        removechildrenforexpandedactionview2 = removechildrenforexpandedactionview3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj, Object obj2) {
                                int i36 = 2 % 2;
                                int i37 = onExtraCallback + 1;
                                onNavigationEvent = i37 % 128;
                                int i38 = i37 % 2;
                                getCmpMessage getcmpmessage2 = getcmpmessage;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda66 = cameraPresenceProviderExternalSyntheticLambda63;
                                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda15 = camera2CameraMetadataExternalSyntheticLambda13;
                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda02;
                                boolean z9 = z3;
                                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel4 = iAuthTabCallback_Parcel2;
                                QuirkSettingsLoader.onNavigationEvent onnavigationevent4 = onnavigationevent2;
                                Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda24 = camera2CameraControlImplExternalSyntheticLambda22;
                                boolean z10 = z4;
                                removeChildrenForExpandedActionView removechildrenforexpandedactionview4 = removechildrenforexpandedactionview2;
                                Function1 function12 = function1;
                                int i39 = i;
                                int i40 = i2;
                                int i41 = i3;
                                int iIntValue = ((Integer) obj2).intValue();
                                Object[] objArr = {getcmpmessage2, quirksExternalSyntheticBackport06, cameraPresenceProviderExternalSyntheticLambda66, camera2CameraMetadataExternalSyntheticLambda15, deviceQuirksExternalSyntheticLambda04, Boolean.valueOf(z9), iAuthTabCallback_Parcel4, onnavigationevent4, camera2CameraControlImplExternalSyntheticLambda24, Boolean.valueOf(z10), removechildrenforexpandedactionview4, function12, Integer.valueOf(i39), Integer.valueOf(i40), Integer.valueOf(i41), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                Unit unit = (Unit) CmpErrorImpl.IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), 1257502716, objArr, _string.onNavigationEvent.IAuthTabCallback(), -1257502715, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
                                int i42 = onExtraCallback + 31;
                                onNavigationEvent = i42 % 128;
                                if (i42 % 2 == 0) {
                                    int i43 = 79 / 0;
                                }
                                return unit;
                            }
                        });
                        return;
                    }
                    return;
                }
                int i36 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i36 % 128;
                i4 = i36 % 2 == 0 ? i4 | 7076 : i4 | 24576;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
            if ((i & 3072) == 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
        if ((i & 3072) == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) == 306783378 || (i12 & 19) != 18, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 $density;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<Boolean> $isVisible;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> $lazyColumnOffset;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ findResAndMsg $scope;
        final /* synthetic */ getCmpMessage $tracker;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getCmpMessage getcmpmessage, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda6, Configuration configuration, CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda62, findResAndMsg findresandmsg, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$tracker = getcmpmessage;
            this.$density = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$lazyColumnOffset = cameraPresenceProviderExternalSyntheticLambda6;
            this.$configuration = configuration;
            this.$isVisible = cameraPresenceProviderExternalSyntheticLambda62;
            this.$scope = findresandmsg;
        }

        public static /* synthetic */ boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6);
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            return zOnExtraCallback;
        }

        public static /* synthetic */ List onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
            }
            onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
            throw null;
        }

        public static /* synthetic */ Pair onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Pair pairOnExtraCallback = onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6);
            if (i3 != 0) {
                int i4 = 84 / 0;
            }
            int i5 = onNavigationEvent + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return pairOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$tracker, this.$density, this.$listState, this.$lazyColumnOffset, this.$configuration, this.$isVisible, this.$scope, access13800Var);
            onextracallback.L$0 = obj;
            int i2 = onNavigationEvent + 7;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 75;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Pair onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Integer numValueOf = Integer.valueOf(camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub());
            Object objOnExtraCallbackWithResult = cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
            if (i3 == 0) {
                getWrite.IAuthTabCallback(numValueOf, objOnExtraCallbackWithResult);
                throw null;
            }
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(numValueOf, objOnExtraCallbackWithResult);
            int i4 = onNavigationEvent + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return pairIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        private static final List onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
            int i4 = IAuthTabCallback + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return listOnTransact;
        }

        /* renamed from: o.CmpErrorImpl$onExtraCallback$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements setTaggedAddrCtrl<Object, List<? extends Camera2CameraControlExternalSyntheticLambda7>, Boolean, access13800<? super List<? extends Camera2CameraControlExternalSyntheticLambda7>>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
                super(4, access13800Var);
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                List<? extends Camera2CameraControlExternalSyntheticLambda7> list = (List) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                access13800<? super List<? extends Camera2CameraControlExternalSyntheticLambda7>> access13800Var = (access13800) obj4;
                if (i3 != 0) {
                    return onWarmupCompleted(obj, list, zBooleanValue, access13800Var);
                }
                onWarmupCompleted(obj, list, zBooleanValue, access13800Var);
                throw null;
            }

            public final Object onWarmupCompleted(Object obj, List<? extends Camera2CameraControlExternalSyntheticLambda7> list, boolean z, access13800<? super List<? extends Camera2CameraControlExternalSyntheticLambda7>> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(access13800Var);
                anonymousClass4.L$0 = list;
                anonymousClass4.Z$0 = z;
                Object objInvokeSuspend = anonymousClass4.invokeSuspend(Unit.INSTANCE);
                int i2 = onWarmupCompleted + 75;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 63;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                List list = (List) this.L$0;
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = i2 + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                if (i6 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!z) {
                    return CollectionsKt.emptyList();
                }
                int i7 = onExtraCallback + 29;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return list;
            }
        }

        private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
            if (i3 == 0) {
                bool.booleanValue();
                obj.hashCode();
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            int i4 = onNavigationEvent + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        }

        /* renamed from: o.CmpErrorImpl$onExtraCallback$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends Camera2CameraControlExternalSyntheticLambda7>, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ findResAndMsg $$this$launch;
            final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> $lazyColumnOffset;
            final /* synthetic */ findResAndMsg $scope;
            final /* synthetic */ float $thresholdBottom;
            final /* synthetic */ float $thresholdTop;
            final /* synthetic */ getCmpMessage $tracker;
            final /* synthetic */ int $viewportBottom;
            final /* synthetic */ int $viewportTop;
            float F$0;
            /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(findResAndMsg findresandmsg, float f, float f2, getCmpMessage getcmpmessage, int i, int i2, findResAndMsg findresandmsg2, CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$$this$launch = findresandmsg;
                this.$thresholdTop = f;
                this.$thresholdBottom = f2;
                this.$tracker = getcmpmessage;
                this.$viewportTop = i;
                this.$viewportBottom = i2;
                this.$scope = findresandmsg2;
                this.$lazyColumnOffset = cameraPresenceProviderExternalSyntheticLambda6;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launch, this.$thresholdTop, this.$thresholdBottom, this.$tracker, this.$viewportTop, this.$viewportBottom, this.$scope, this.$lazyColumnOffset, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = onNavigationEvent + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onNavigationEvent = i2 % 128;
                Object obj3 = null;
                List<? extends Camera2CameraControlExternalSyntheticLambda7> list = (List) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(list, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(list, access13800Var);
                int i3 = onNavigationEvent + 3;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }

            public final Object onExtraCallback(List<? extends Camera2CameraControlExternalSyntheticLambda7> list, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 95;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(list, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 1;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i = 2 % 2;
                List list = (List) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda6 = this.$lazyColumnOffset;
                    try {
                        Result.Companion companion = Result.Companion;
                        obj2 = Result.constructor-impl(access14000.onExtraCallbackWithResult(Float.intBitsToFloat((int) ((setUseCaseAttached) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).onExtraCallback())));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.onExtraCallback(obj2)) {
                        int i3 = onNavigationEvent + 5;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        obj2 = null;
                    }
                    Float f = (Float) obj2;
                    if (f == null) {
                        return Unit.INSTANCE;
                    }
                    float fFloatValue = f.floatValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : list) {
                        Object objIAuthTabCallback = ((Camera2CameraControlExternalSyntheticLambda7) obj3).IAuthTabCallback();
                        r8lambdaLMJLs07tfVrB4WLnU72tKti2U r8lambdalmjls07tfvrb4wlnu72tkti2u = objIAuthTabCallback instanceof r8lambdaLMJLs07tfVrB4WLnU72tKti2U ? (r8lambdaLMJLs07tfVrB4WLnU72tKti2U) objIAuthTabCallback : null;
                        p6 section = r8lambdalmjls07tfvrb4wlnu72tkti2u != null ? r8lambdalmjls07tfvrb4wlnu72tkti2u.getSection() : null;
                        Object arrayList = linkedHashMap.get(section);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(section, arrayList);
                        }
                        ((List) arrayList).add(obj3);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i5 = IAuthTabCallback + 119;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        p6 p6Var = (p6) entry.getKey();
                        if (p6Var != null) {
                            Object value = entry.getValue();
                            if (((List) value).isEmpty()) {
                                value = null;
                            }
                            List list2 = (List) value;
                            if (list2 != null) {
                                int i7 = IAuthTabCallback + 63;
                                onNavigationEvent = i7 % 128;
                                int i8 = i7 % 2;
                                if (p5ExternalSyntheticLambda0.onExtraCallback(list2, this.$tracker.onWarmupCompleted(), getBacktraceNoteBytes.onExtraCallback(this.$thresholdTop), getBacktraceNoteBytes.onExtraCallback(this.$thresholdBottom), this.$viewportTop, this.$viewportBottom, getBacktraceNoteBytes.onExtraCallback(fFloatValue))) {
                                    int i9 = onNavigationEvent + 103;
                                    IAuthTabCallback = i9 % 128;
                                    int i10 = i9 % 2;
                                    linkedHashSet.add(p6Var);
                                }
                            }
                        }
                    }
                    getCmpMessage getcmpmessage = this.$tracker;
                    findResAndMsg findresandmsg = this.$scope;
                    this.L$0 = access15400.onNavigationEvent(list);
                    this.L$1 = access15400.onNavigationEvent(linkedHashMap);
                    this.L$2 = access15400.onNavigationEvent(linkedHashSet);
                    this.F$0 = fFloatValue;
                    this.label = 1;
                    if (getcmpmessage.onNavigationEvent(findresandmsg, linkedHashSet, this) == objOnWarmupCompleted) {
                        int i11 = onNavigationEvent + 103;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = onNavigationEvent + 59;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i13 = 97 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                final CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda6 = this.$lazyColumnOffset;
                IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new IAnimation[]{CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$LazyListExposureEffectV2$2$1$2$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 91;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        Pair pairOnNavigationEvent = CmpErrorImpl.onExtraCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6);
                        int i6 = onWarmupCompleted + 121;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            return pairOnNavigationEvent;
                        }
                        throw null;
                    }
                }), this.$tracker.onNavigationEvent()});
                int iOnExtraCallbackWithResult = this.$density.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.$configuration.screenHeightDp));
                float f = iOnExtraCallbackWithResult;
                float fOnExtraCallbackWithResult = (this.$tracker.onWarmupCompleted().onExtraCallbackWithResult() * f) + 0.0f;
                float fOnExtraCallbackWithResult2 = (f * (1.0f - this.$tracker.onWarmupCompleted().onExtraCallbackWithResult())) + 0.0f;
                final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = this.$listState;
                IAnimation iAnimationOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$LazyListExposureEffectV2$2$1$2$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = IAuthTabCallback + 69;
                        onExtraCallbackWithResult = i4 % 128;
                        Object obj2 = null;
                        if (i4 % 2 == 0) {
                            CmpErrorImpl.onExtraCallback.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12);
                            obj2.hashCode();
                            throw null;
                        }
                        List listOnExtraCallbackWithResult = CmpErrorImpl.onExtraCallback.onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda12);
                        int i5 = IAuthTabCallback + 95;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return listOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                });
                final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda62 = this.$isVisible;
                IAnimation iAnimationOnExtraCallbackWithResult2 = ycxycx.onExtraCallbackWithResult(iAnimationOnExtraCallbackWithResult, iAnimationOnWarmupCompleted, CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$LazyListExposureEffectV2$2$1$2$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 115;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Boolean boolValueOf = Boolean.valueOf(CmpErrorImpl.onExtraCallback.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda62));
                        int i6 = onNavigationEvent + 67;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return boolValueOf;
                    }
                }), new AnonymousClass4(null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(findresandmsg, fOnExtraCallbackWithResult, fOnExtraCallbackWithResult2, this.$tracker, 0, iOnExtraCallbackWithResult, this.$scope, this.$lazyColumnOffset, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(iAnimationOnExtraCallbackWithResult);
                this.I$0 = 0;
                this.I$1 = iOnExtraCallbackWithResult;
                this.I$2 = iOnExtraCallbackWithResult;
                this.F$0 = fOnExtraCallbackWithResult;
                this.F$1 = fOnExtraCallbackWithResult2;
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnExtraCallbackWithResult2, anonymousClass1, this) == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 11;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 46 / 0;
                    }
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 21;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onNavigationEvent + 49;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @NotNull final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull final getCmpMessage getcmpmessage, @Nullable CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda62, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        final CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda63;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        boolean z;
        boolean z2;
        Object[] objArr;
        int i5;
        int i6;
        CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda64 = cameraPresenceProviderExternalSyntheticLambda62;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(getcmpmessage, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(258397901);
        if ((i & 6) == 0) {
            int i8 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6) ? 4 : 2) | i;
            int i10 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) {
                int i12 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i12 % 128;
                i6 = i12 % 2 != 0 ? 55 : 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getcmpmessage)) {
                int i13 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i13 % 128;
                i5 = i13 % 2 == 0 ? 11151 : 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            int i15 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i15 % 128;
            i3 = i15 % 2 != 0 ? i3 | 3934 : i3 | 3072;
        } else if ((i & 3072) == 0) {
            int i16 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 0 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda64) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda64)) {
            }
            i3 |= i4;
        }
        int i18 = i3;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i18 & 1171) != 1170, i18 & 1))) {
            Object obj = null;
            if (i14 != 0) {
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                cameraPresenceProviderExternalSyntheticLambda64 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            }
            final CameraPresenceProviderExternalSyntheticLambda6<setUseCaseAttached> cameraPresenceProviderExternalSyntheticLambda65 = cameraPresenceProviderExternalSyntheticLambda64;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(258397901, i18, -1, "im.toss.securities.core.exposure.v2.LazyListExposureEffectV2 (LazyListExposureEffectV2.kt:85)");
            }
            final Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized2;
            Object[] objArr2 = {cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, getcmpmessage, cameraPresenceProviderExternalSyntheticLambda65, configuration, r8lambdanm9dm2eewl4vrptnjmesfjqky42};
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
            boolean z3 = (i18 & 112) == 32;
            boolean z4 = (i18 & 7168) == 2048;
            if ((i18 & 896) == 256) {
                r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                z = true;
            } else {
                int i19 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                z = false;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(configuration);
            if ((i18 & 14) == 4) {
                int i21 = onNavigationEvent + 63;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | z3 | z4 | z | zOnNavigationEvent | zOnExtraCallback2 | z2)) {
                int i23 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i23 % 128;
                if (i23 % 2 != 0) {
                    onwarmupcompleted.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized3 != onwarmupcompleted.onExtraCallback()) {
                    objArr = objArr2;
                } else {
                    final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky43 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                    objArr = objArr2;
                    Function1 function1 = new Function1() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$$ExternalSyntheticLambda0
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 101;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            Object[] objArr3 = {findresandmsg, getcmpmessage, r8lambdanm9dm2eewl4vrptnjmesfjqky43, camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda65, configuration, cameraPresenceProviderExternalSyntheticLambda6, (isInVideoUsage) obj2};
                            decrementVideoUsage decrementvideousage = (decrementVideoUsage) CmpErrorImpl.IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), -12514096, objArr3, _string.onNavigationEvent.IAuthTabCallback(), 12514096, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
                            int i27 = onNavigationEvent + 101;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 == 0) {
                                return decrementvideousage;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function1);
                    objOnMinimized3 = function1;
                }
                indexOfFirstNonAsciiWhitespace.IAuthTabCallback(objArr, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda65;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda64;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.securities.core.exposure.v2.LazyListExposureEffectV2Kt$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i24 = 2 % 2;
                    int i25 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i25 % 128;
                    if (i25 % 2 == 0) {
                        unitOnExtraCallbackWithResult = CmpErrorImpl.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, getcmpmessage, cameraPresenceProviderExternalSyntheticLambda63, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i26 = 88 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = CmpErrorImpl.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, getcmpmessage, cameraPresenceProviderExternalSyntheticLambda63, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i27 = onNavigationEvent + 123;
                    onExtraCallbackWithResult = i27 % 128;
                    int i28 = i27 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    private static final decrementVideoUsage onNavigationEvent(findResAndMsg findresandmsg, getCmpMessage getcmpmessage, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Configuration configuration, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, putChannelInfo.IAuthTabCallback().plus(new onWarmupCompleted(CoroutineExceptionHandler.extraCallbackWithResult)), (setRandomHost) null, new onExtraCallback(getcmpmessage, r8lambdanm9dm2eewl4vrptnjmesfjqky4, camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, configuration, cameraPresenceProviderExternalSyntheticLambda62, findresandmsg, null), 2, (Object) null);
        onNavigationEvent onnavigationevent = new onNavigationEvent(getcmpmessage);
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return onnavigationevent;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(findResAndMsg findresandmsg, getCmpMessage getcmpmessage, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Configuration configuration, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, isInVideoUsage isinvideousage) {
        Object[] objArr = {findresandmsg, getcmpmessage, r8lambdanm9dm2eewl4vrptnjmesfjqky4, camera2CameraMetadataExternalSyntheticLambda1, cameraPresenceProviderExternalSyntheticLambda6, configuration, cameraPresenceProviderExternalSyntheticLambda62, isinvideousage};
        return (decrementVideoUsage) IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), -12514096, objArr, _string.onNavigationEvent.IAuthTabCallback(), 12514096, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(getCmpMessage getcmpmessage, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, removeChildrenForExpandedActionView removechildrenforexpandedactionview, Function1 function1, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {getcmpmessage, quirksExternalSyntheticBackport0, cameraPresenceProviderExternalSyntheticLambda6, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, Boolean.valueOf(z), iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, Boolean.valueOf(z2), removechildrenforexpandedactionview, function1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) IAuthTabCallback(_string.onNavigationEvent.IAuthTabCallback(), 1257502716, objArr, _string.onNavigationEvent.IAuthTabCallback(), -1257502715, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback());
    }
}
