package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import im.toss.features.edoc.composable.ComposablesKt$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.readFully;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readDir {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnNavigationEvent = onNavigationEvent();
        int i3 = onWarmupCompleted + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnNavigationEvent;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = onWarmupCompleted + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, booleanRef, booleanRef2, i);
        int i5 = onWarmupCompleted + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, long j2, boolean z, boolean z2, float f, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f), setiso};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(1306249799, -1306249798, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2);
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 87;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, i, (Function1<? super access13800<? super Boolean>, ? extends Object>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 27;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
            ((Boolean) onExtraCallbackWithResult(38859584, -38859584, PushInfo.Companion.onExtraCallback(), new Object[0], iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback2)).booleanValue();
            throw null;
        }
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback5 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback6 = PushInfo.Companion.onExtraCallback();
        boolean zBooleanValue = ((Boolean) onExtraCallbackWithResult(38859584, -38859584, PushInfo.Companion.onExtraCallback(), new Object[0], iOnExtraCallback6, iOnExtraCallback4, iOnExtraCallback5)).booleanValue();
        int i3 = onWarmupCompleted + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 125;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, i, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = IAuthTabCallback + 101;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, float f, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float fIAuthTabCallback;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        long jOnNavigationEvent = (i2 & 1) != 0 ? y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent() : j;
        long jIAuthTabCallbackDefault = (i2 & 2) != 0 ? setByteOrder.Companion.IAuthTabCallbackDefault() : j2;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 81;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f);
        } else {
            fIAuthTabCallback = f;
        }
        boolean z7 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            int i6 = onWarmupCompleted + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2123116034, i, -1, "im.toss.features.edoc.composable.fadingEdge (Composables.kt:22)");
        }
        boolean z8 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jOnNavigationEvent)) || (i & 48) == 32;
        if (((i & 896) ^ 384) > 256) {
            int i8 = IAuthTabCallback + 91;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 11 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jIAuthTabCallbackDefault)) {
                    z4 = (i & 384) == 256;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jIAuthTabCallbackDefault)) {
            }
        }
        boolean z9 = (((57344 & i) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z7)) || (i & 24576) == 16384;
        if ((((458752 & i) ^ 196608) <= 131072 || !cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z3)) && (i & 196608) != 131072) {
            z5 = false;
        } else {
            int i10 = onWarmupCompleted + 35;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            z5 = true;
        }
        if (((i & 7168) ^ 3072) > 2048) {
            int i12 = IAuthTabCallback + 121;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fIAuthTabCallback)) {
                z6 = (i & 3072) == 2048;
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z6 | z8 | z4 | z9 | z5)) {
            int i14 = IAuthTabCallback + 121;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ComposablesKt$.ExternalSyntheticLambda4(jOnNavigationEvent, jIAuthTabCallbackDefault, z7, z3, fIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = SessionProcessorSurface.onExtraCallback(quirksExternalSyntheticBackport0, (Function1) objOnMinimized);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        setIso setiso = (setIso) objArr[5];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        List listListOf = CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(jLongValue), setByteOrder.onNavigationEvent(jLongValue2)});
        setiso.onWarmupCompleted();
        if (zBooleanValue) {
            if (zBooleanValue2) {
                setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onExtraCallback(readFully.Companion, CollectionsKt.reversed(listListOf), Float.intBitsToFloat((int) (setiso.onTransact() >> 32)) - setiso.onExtraCallback(fFloatValue), Float.intBitsToFloat((int) (setiso.onTransact() >> 32)), 0, 8, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
                int i4 = onWarmupCompleted + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 4;
                }
            } else {
                setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onExtraCallback(readFully.Companion, listListOf, 0.0f, setiso.onExtraCallback(fFloatValue), 0, 10, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
            }
        } else if (zBooleanValue2) {
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, CollectionsKt.reversed(listListOf), Float.intBitsToFloat((int) setiso.onTransact()) - setiso.onExtraCallback(fFloatValue), Float.intBitsToFloat((int) setiso.onTransact()), 0, 8, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        } else {
            setOrientationDegrees.onExtraCallback(setiso, readFully.onExtraCallback.onWarmupCompleted(readFully.Companion, listListOf, 0.0f, setiso.onExtraCallback(fFloatValue), 0, 10, (Object) null), 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private static final boolean onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int size = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact().size();
        int iIAuthTabCallback = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().IAuthTabCallback();
        int iAsBinder = camera2CameraMetadataExternalSyntheticLambda1.asBinder();
        if (booleanRef.element) {
            return false;
        }
        int i5 = onWarmupCompleted + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        if (booleanRef2.element) {
            return false;
        }
        int i7 = onWarmupCompleted + 123;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            if ((size - iAsBinder) - i < iIAuthTabCallback) {
                return false;
            }
        } else if (size + iAsBinder + i < iIAuthTabCallback) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, @NotNull Function1<? super access13800<? super Boolean>, ? extends Object> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(404745592);
        if ((i2 & 6) == 0) {
            int i10 = onWarmupCompleted + 27;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                i5 = i;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i5)) {
                    int i12 = onWarmupCompleted + 83;
                    IAuthTabCallback = i12 % 128;
                    i6 = i12 % 2 != 0 ? 93 : 32;
                } else {
                    i6 = 16;
                }
                i4 |= i6;
            }
            if ((i2 & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                    int i13 = IAuthTabCallback + 13;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i4 |= i8;
            }
            i7 = i4;
            if ((i7 & 147) == 146) {
                int i15 = onWarmupCompleted + 55;
                IAuthTabCallback = i15 % 128;
                z = i15 % 2 == 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i11 != 0) {
                    int i16 = onWarmupCompleted + 51;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i5 = 10;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = onWarmupCompleted + 119;
                    IAuthTabCallback = i18 % 128;
                    if (i18 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(404745592, i7, -1, "im.toss.features.edoc.composable.LazyListPaging (Composables.kt:59)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(404745592, i7, -1, "im.toss.features.edoc.composable.LazyListPaging (Composables.kt:59)");
                }
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Object[] objArr = new Object[0];
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new ComposablesKt$.ExternalSyntheticLambda0();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                booleanRef.element = ((Boolean) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48)).booleanValue();
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Object[] objArr2 = new Object[0];
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new ComposablesKt$.ExternalSyntheticLambda1();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                booleanRef2.element = ((Boolean) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48)).booleanValue();
                boolean z2 = (i7 & 14) == 4;
                boolean z3 = (i7 & 112) == 32;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(!(z2 | z3)) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new ComposablesKt$.ExternalSyntheticLambda2(camera2CameraMetadataExternalSyntheticLambda1, booleanRef, booleanRef2, i5));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                isZslDisabledByByUserCaseConfig.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, Integer.valueOf(i5), function1, new onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3, booleanRef, booleanRef2, function1, (access13800) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7 & 1022);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            int i19 = i5;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ComposablesKt$.ExternalSyntheticLambda3(camera2CameraMetadataExternalSyntheticLambda1, i19, function1, i2, i3));
                return;
            }
            return;
        }
        i4 |= 48;
        i5 = i;
        if ((i2 & 384) == 0) {
        }
        i7 = i4;
        if ((i7 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1)) {
        }
        int i192 = i5;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i2 | i5));
        int i11 = ~(i7 | i9);
        int i12 = i2 | i11;
        int i13 = (~(i5 | i)) | i11 | (~(i8 | i));
        int i14 = i + i2 + i6 + (296844165 * i4) + (1729652556 * i3);
        int i15 = i14 * i14;
        int i16 = ((i * 599922083) - 580124672) + (599922083 * i2) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i6) + ((-279707648) * i4) + ((-265289728) * i3) + (2117271552 * i15);
        int i17 = (i * (-1181628991)) + 1322814002 + (i2 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i6 * (-1181629109)) + (i4 * (-698251017)) + (i3 * 1773125444) + (i15 * 938541056);
        if (i16 + (i17 * i17 * (-109772800)) == 1) {
            return IAuthTabCallback(objArr);
        }
        int i18 = 2 % 2;
        int i19 = onWarmupCompleted;
        int i20 = i19 + 1;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i19 + 45;
        IAuthTabCallback = i22 % 128;
        int i23 = i22 % 2;
        return false;
    }

    private static final boolean onExtraCallback() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        return ((Boolean) onExtraCallbackWithResult(38859584, -38859584, PushInfo.Companion.onExtraCallback(), new Object[0], iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback2)).booleanValue();
    }

    private static final Unit onNavigationEvent(long j, long j2, boolean z, boolean z2, float f, setIso setiso) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f), setiso};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(1306249799, -1306249798, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2);
    }
}
