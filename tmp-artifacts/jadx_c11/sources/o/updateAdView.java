package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.common.collect.Synchronized;
import im.toss.tds.compose.foundation.anim.StaggersKt$;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.updateAdView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class updateAdView {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(int i, int i2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSwitchMinWidth getswitchminwidth, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = onWarmupCompleted + 23;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return onExtraCallbackWithResult(i, i2, getsupportedhighspeedresolutionsfor, getswitchminwidth, quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        }
        onExtraCallbackWithResult(i, i2, getsupportedhighspeedresolutionsfor, getswitchminwidth, quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, function1, i3, i4, i5, cameraCaptureResultEmptyCameraCaptureResult, i6);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int iIntValue5 = ((Number) objArr[6]).intValue();
        setOnQueryTextListener setonquerytextlistener = (setOnQueryTextListener) objArr[7];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        int iIntValue6 = ((Number) objArr[9]).intValue();
        int iIntValue7 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue8 = ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onWarmupCompleted(getsupportedhighspeedresolutionsfor, getswitchminwidth, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, setonquerytextlistener, settaggedaddrctrl, iIntValue6, iIntValue7, cameraCaptureResultEmptyCameraCaptureResult, iIntValue8);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, getswitchminwidth, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, setonquerytextlistener, settaggedaddrctrl, iIntValue6, iIntValue7, cameraCaptureResultEmptyCameraCaptureResult, iIntValue8);
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, Function1 function1, addShowingAdapter addshowingadapter, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, function1, addshowingadapter, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, function1, addshowingadapter, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i4);
        int i12 = i6 | i11;
        int i13 = (~(i6 | i4)) | (~(i7 | i8 | i9)) | i11 | (~(i3 | i6));
        int i14 = i3 + i4 + i2 + (1272450877 * i) + ((-51365948) * i5);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i3) + 922746880 + ((-1437248296) * i4) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i2) + ((-1881145344) * i) + ((-578813952) * i5) + ((-124846080) * i15);
        int i17 = (i3 * 1187242746) + 1002376400 + (i4 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i2 * 1187242569) + (i * (-1484311963)) + (i5 * 1141305060) + (i15 * 516358144);
        return i16 + ((i17 * i17) * (-861863936)) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static final Unit onExtraCallbackWithResult(int i, int i2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSwitchMinWidth getswitchminwidth, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, Function1 function1, int i3, int i4, int i5, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6) {
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 7;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        onNavigationEvent(i, i2, getsupportedhighspeedresolutionsfor, getswitchminwidth, quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i3 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i4), i5);
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 93;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, resourceManagerInternalResourceManagerHooks, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 33;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSwitchMinWidth getswitchminwidth, int i, int i2, int i3, int i4, int i5, setOnQueryTextListener setonquerytextlistener, setTaggedAddrCtrl settaggedaddrctrl, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        int i9 = 2 % 2;
        int i10 = onWarmupCompleted + 61;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), setonquerytextlistener, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i6 | 1)), Integer.valueOf(i7)}, -1256972455, 1256972456, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i12 = onWarmupCompleted + 125;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTaggedAddrCtrl settaggedaddrctrl, MediationAdapterRouterMediationAdapterRouterListenerWrapper mediationAdapterRouterMediationAdapterRouterListenerWrapper, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settaggedaddrctrl, mediationAdapterRouterMediationAdapterRouterListenerWrapper, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(boolean z, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(z, resourceManagerInternalResourceManagerHooks, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ int $delayMillis;
        final /* synthetic */ int $staggerDelayMillis;
        final /* synthetic */ int $staggerSize;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Integer> $triggerIdxState;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(int i, int i2, getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i3, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$delayMillis = i;
            this.$staggerSize = i2;
            this.$triggerIdxState = getsupportedhighspeedresolutionsfor;
            this.$staggerDelayMillis = i3;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$delayMillis, this.$staggerSize, this.$triggerIdxState, this.$staggerDelayMillis, access13800Var);
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 41;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r5, r10) != r1) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r5, r10) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:18:0x007b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor;
            int i3;
            int i4 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                long j = this.$delayMillis;
                this.label = 1;
            } else if (i5 != 1) {
                int i6 = onExtraCallback + 91;
                int i7 = i6 % 128;
                onNavigationEvent = i7;
                int i8 = i6 % 2;
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = i7 + 17;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i3 = this.I$2;
                i = this.I$1;
                i2 = this.I$0;
                getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) this.L$0;
                ResultKt.onNavigationEvent(obj);
                i3++;
                if (i3 < i2) {
                    Unit unit = Unit.INSTANCE;
                    int i11 = onNavigationEvent + 41;
                    onExtraCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unit;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i12 = onExtraCallback + 13;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                getsupportedhighspeedresolutionsfor.IAuthTabCallback(access14000.onNavigationEvent(i3));
                this.L$0 = getsupportedhighspeedresolutionsfor;
                this.I$0 = i2;
                this.I$1 = i;
                this.I$2 = i3;
                this.I$3 = i3;
                this.I$4 = 0;
                this.label = 2;
            } else {
                ResultKt.onNavigationEvent(obj);
            }
            int i14 = this.$staggerSize;
            getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor2 = this.$triggerIdxState;
            i = this.$staggerDelayMillis;
            i2 = i14;
            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
            i3 = 0;
            if (i3 < i2) {
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(setTaggedAddrCtrl settaggedaddrctrl, MediationAdapterRouterMediationAdapterRouterListenerWrapper mediationAdapterRouterMediationAdapterRouterListenerWrapper, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onWarmupCompleted + 27;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(970786534, i, -1, "im.toss.tds.compose.foundation.anim.StaggerRally.<anonymous> (Staggers.kt:123)");
                int i6 = onWarmupCompleted + 73;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            settaggedaddrctrl.invoke(mediationAdapterRouterMediationAdapterRouterListenerWrapper, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 111;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[PHI: r10
      0x012e: PHI (r10v17 int) = (r10v8 int), (r10v11 int), (r10v12 int) binds: [B:64:0x012c, B:71:0x013c, B:70:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i12;
        setOnQueryTextListener setonquerytextlistener;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        Integer num;
        MediationAdapterRouterMediationAdapterRouterListenerWrapper mediationAdapterRouterMediationAdapterRouterListenerWrapper;
        int i13;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int iIntValue5 = ((Number) objArr[6]).intValue();
        setOnQueryTextListener setonquerytextlistenerOnTransact = (setOnQueryTextListener) objArr[7];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue6 = ((Number) objArr[10]).intValue();
        int iIntValue7 = ((Number) objArr[11]).intValue();
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1560890842);
        if ((iIntValue6 & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor) ? 4 : 2) | iIntValue6;
        } else {
            i = iIntValue6;
        }
        Object obj2 = null;
        if ((iIntValue6 & 48) == 0) {
            int i15 = onWarmupCompleted + 113;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                obj2.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth) ? 32 : 16;
        }
        int i16 = i;
        int i17 = iIntValue7 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((iIntValue6 & 384) == 0) {
            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 256 : 128;
        }
        if ((iIntValue6 & 3072) == 0) {
            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue2) ? 2048 : 1024;
        }
        if ((iIntValue6 & 24576) == 0) {
            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue3) ? 16384 : 8192;
        }
        int i18 = iIntValue7 & 32;
        if (i18 == 0) {
            if ((iIntValue6 & 196608) == 0) {
                int i19 = onNavigationEvent + 55;
                i2 = iIntValue;
                onWarmupCompleted = i19 % 128;
                if (i19 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue4);
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue4)) {
                    int i20 = onNavigationEvent + 29;
                    i3 = iIntValue3;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i21 = 23 / 0;
                    }
                    i4 = 131072;
                } else {
                    i3 = iIntValue3;
                    i4 = 65536;
                }
                i16 |= i4;
            }
            i5 = iIntValue7 & 64;
            int i22 = 1572864;
            if (i5 != 0) {
                i16 |= i22;
            } else if ((1572864 & iIntValue6) == 0) {
                i22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue5) ? 1048576 : 524288;
                i16 |= i22;
            }
            i6 = iIntValue7 & 128;
            if (i6 == 0) {
                int i23 = onNavigationEvent + 95;
                i7 = iIntValue4;
                onWarmupCompleted = i23 % 128;
                if (i23 % 2 == 0) {
                    i16 |= 12582912;
                    int i24 = 43 / 0;
                } else {
                    i8 = 12582912;
                    i16 |= i8;
                }
            } else {
                i7 = iIntValue4;
                if ((12582912 & iIntValue6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setonquerytextlistenerOnTransact)) {
                        int i25 = onWarmupCompleted + 29;
                        onNavigationEvent = i25 % 128;
                        if (i25 % 2 != 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i16 |= i8;
                }
            }
            if ((100663296 & iIntValue6) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl)) {
                    int i26 = onNavigationEvent + 19;
                    onWarmupCompleted = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw null;
                    }
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i16 |= i13;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i16) == 38347922, i16 & 1)) {
                i9 = iIntValue7;
                i10 = iIntValue2;
                i11 = iIntValue6;
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                i12 = iIntValue5;
                setonquerytextlistener = setonquerytextlistenerOnTransact;
            } else {
                if (i17 != 0) {
                    i2 = 0;
                }
                if (i18 != 0) {
                    i7 = 500;
                }
                i12 = i5 != 0 ? 0 : iIntValue5;
                if (i6 != 0) {
                    setonquerytextlistenerOnTransact = getCallToActionButton.onExtraCallback.onTransact();
                }
                setonquerytextlistener = setonquerytextlistenerOnTransact;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1560890842, i16, -1, "im.toss.tds.compose.foundation.anim.StaggerRally (Staggers.kt:98)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new MediationAdapterRouterMediationAdapterRouterListenerWrapper(getsupportedhighspeedresolutionsfor, getswitchminwidth, iIntValue2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                MediationAdapterRouterMediationAdapterRouterListenerWrapper mediationAdapterRouterMediationAdapterRouterListenerWrapper2 = (MediationAdapterRouterMediationAdapterRouterListenerWrapper) objOnMinimized;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                if ((i16 & 896) == 256) {
                    int i27 = onNavigationEvent + 75;
                    onWarmupCompleted = i27 % 128;
                    boolean z2 = i27 % 2 != 0;
                    boolean z3 = (57344 & i16) == 16384;
                    boolean z4 = (i16 & 14) == 4;
                    if ((i16 & 7168) == 2048) {
                        int i28 = onNavigationEvent + 19;
                        onWarmupCompleted = i28 % 128;
                        int i29 = i28 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((z2 | z3 | z4) || z) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        num = numValueOf;
                        i9 = iIntValue7;
                        i11 = iIntValue6;
                        mediationAdapterRouterMediationAdapterRouterListenerWrapper = mediationAdapterRouterMediationAdapterRouterListenerWrapper2;
                        i10 = iIntValue2;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(i2, i3, getsupportedhighspeedresolutionsfor, iIntValue2, null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onwarmupcompleted2);
                        objOnMinimized2 = onwarmupcompleted2;
                    } else {
                        num = numValueOf;
                        i9 = iIntValue7;
                        i11 = iIntValue6;
                        mediationAdapterRouterMediationAdapterRouterListenerWrapper = mediationAdapterRouterMediationAdapterRouterListenerWrapper2;
                        i10 = iIntValue2;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(num, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, (i16 >> 9) & 14);
                    boolean z5 = (29360128 & i16) == 8388608;
                    boolean z6 = (i16 & 458752) == 131072;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(z6 | z5)) {
                        int i30 = onWarmupCompleted + 71;
                        onNavigationEvent = i30 % 128;
                        int i31 = i30 % 2;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            obj = null;
                            objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Integer.valueOf(setonquerytextlistener instanceof getStarRatingContentViewGroup ? ((getStarRatingContentViewGroup) setonquerytextlistener).onExtraCallback() : i7), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                            int i32 = onWarmupCompleted + 21;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                        } else {
                            obj = null;
                        }
                        setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{MaxNativeAdBuilder.asInterface().onExtraCallback(((getSupportedHighSpeedResolutionsFor) objOnMinimized3).onExtraCallbackWithResult()), MaxNativeAdBuilder.onNavigationEvent().onExtraCallback(Integer.valueOf(i12)), ((accessisMonitoringp) MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[0], -1249497741, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1249497743)).onExtraCallback(setonquerytextlistener)}, ForwardingCameraControl.onExtraCallback(970786534, true, new StaggersKt$.ExternalSyntheticLambda3(settaggedaddrctrl, mediationAdapterRouterMediationAdapterRouterListenerWrapper, getswitchminwidth), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
            int i34 = i2;
            int i35 = i7;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new StaggersKt$.ExternalSyntheticLambda4(getsupportedhighspeedresolutionsfor, getswitchminwidth, i34, i10, i3, i35, i12, setonquerytextlistener, settaggedaddrctrl, i11, i9));
            }
            return obj;
        }
        i16 |= 196608;
        i2 = iIntValue;
        i3 = iIntValue3;
        i5 = iIntValue7 & 64;
        int i222 = 1572864;
        if (i5 != 0) {
        }
        i6 = iIntValue7 & 128;
        if (i6 == 0) {
        }
        if ((100663296 & iIntValue6) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i16) == 38347922, i16 & 1)) {
        }
        int i342 = i2;
        int i352 = i7;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final boolean z, @NotNull final ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, @NotNull final getBacktraceNote<? super setHorizontalGravity, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1979495791);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                i4 = 4;
            } else {
                int i6 = onWarmupCompleted + 25;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onNavigationEvent + 13;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(resourceManagerInternalResourceManagerHooks);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(resourceManagerInternalResourceManagerHooks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = onNavigationEvent + 115;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 63 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            int i11 = onNavigationEvent + 67;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 26 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1979495791, i2, -1, "im.toss.tds.compose.foundation.anim.AnimateStagger (Staggers.kt:133)");
                }
                setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooks, (SearchView) null, (String) null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 26);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = onWarmupCompleted + 23;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i14 = 84 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                setVerticalGravity.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooks, (SearchView) null, (String) null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 26);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.foundation.anim.StaggersKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onWarmupCompleted + 21;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        return updateAdView.onNavigationEvent(z, resourceManagerInternalResourceManagerHooks, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnNavigationEvent = updateAdView.onNavigationEvent(z, resourceManagerInternalResourceManagerHooks, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i17 = 12 / 0;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, QuirkSettingsLoader.onNavigationEvent onnavigationevent, Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, Function1 function1, addShowingAdapter addshowingadapter, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(addshowingadapter, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 129) != 128) {
            z3 = true;
        } else {
            int i3 = onWarmupCompleted + 17;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(813073209, i, -1, "im.toss.tds.compose.foundation.anim.StaggerLazyColumn.<anonymous> (Staggers.kt:169)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(813073209, i, -1, "im.toss.tds.compose.foundation.anim.StaggerLazyColumn.<anonymous> (Staggers.kt:169)");
            }
            ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0, z, iAuthTabCallback_Parcel, onnavigationevent, camera2CameraControlImplExternalSyntheticLambda2, z2, (removeChildrenForExpandedActionView) null, function1, cameraCaptureResultEmptyCameraCaptureResult, 0, 256);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onWarmupCompleted + 17;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(int i, int i2, @NotNull getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, @NotNull getSwitchMinWidth<Integer> getswitchminwidth, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z, @Nullable FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, @Nullable QuirkSettingsLoader.onNavigationEvent onnavigationevent, @Nullable Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2, boolean z2, @NotNull Function1<? super AudioRestrictionControllerImplExternalSyntheticLambda0, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        boolean z3;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel2;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent2;
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda22;
        boolean z4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback;
        boolean z5;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent3;
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        QuirkSettingsLoader.onNavigationEvent onnavigationevent4;
        boolean z6;
        Camera2CameraControlImplExternalSyntheticLambda2 camera2CameraControlImplExternalSyntheticLambda23;
        boolean z7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda13;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel3;
        int i14 = 2 % 2;
        int i15 = onWarmupCompleted + 115;
        onNavigationEvent = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(getsupportedhighspeedresolutionsfor, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1294627051);
        if ((i3 & 6) == 0) {
            int i17 = onNavigationEvent + 9;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i);
                throw null;
            }
            i6 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth) ? 2048 : 1024;
        }
        int i18 = i5 & 16;
        if (i18 != 0) {
            i6 |= 24576;
        } else {
            if ((i3 & 24576) == 0) {
                int i19 = onNavigationEvent + 103;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i6 |= ((i5 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) ? 131072 : 65536;
            }
            i7 = i5 & 64;
            if (i7 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 1048576 : 524288;
            }
            i8 = i5 & 128;
            if (i8 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
            }
            if ((i3 & 100663296) == 0) {
                i6 |= ((i5 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback_Parcel)) ? 67108864 : 33554432;
            }
            i9 = i5 & 512;
            if (i9 == 0) {
                i6 |= 805306368;
            } else {
                if ((i3 & 805306368) == 0) {
                    int i21 = onNavigationEvent + 47;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent) ? 536870912 : 268435456;
                }
                if ((i4 & 6) == 0) {
                    int i23 = onWarmupCompleted;
                    int i24 = i23 + 105;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    if ((i5 & 1024) == 0) {
                        int i26 = i23 + 73;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        int i28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraControlImplExternalSyntheticLambda2) ? 4 : 2;
                        i10 = i28 | i4;
                    }
                    i10 = i28 | i4;
                } else {
                    i10 = i4;
                }
                i11 = i5 & 2048;
                if (i11 == 0) {
                    if ((i4 & 48) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                            int i29 = onNavigationEvent + 29;
                            onWarmupCompleted = i29 % 128;
                            int i30 = i29 % 2;
                            i12 = 32;
                        } else {
                            i12 = 16;
                        }
                        i13 = i10 | i12;
                    }
                    if ((i4 & 384) == 0) {
                        i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i6) == 306783378 || (i13 & 147) != 146, i6 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda1;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        z3 = z;
                        iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                        onnavigationevent2 = onnavigationevent;
                        camera2CameraControlImplExternalSyntheticLambda22 = camera2CameraControlImplExternalSyntheticLambda2;
                        z4 = z2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i3 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            if ((i5 & 32) != 0) {
                                int i31 = onNavigationEvent + 89;
                                onWarmupCompleted = i31 % 128;
                                int i32 = i31 % 2;
                                camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                                i6 &= -458753;
                            } else {
                                camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = camera2CameraMetadataExternalSyntheticLambda1;
                            }
                            if (i7 != 0) {
                                int i33 = onWarmupCompleted + 3;
                                onNavigationEvent = i33 % 128;
                                deviceQuirksExternalSyntheticLambda0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i33 % 2 != 0 ? 1.0f : 0.0f));
                            } else {
                                deviceQuirksExternalSyntheticLambda0OnExtraCallback = deviceQuirksExternalSyntheticLambda0;
                            }
                            if (i8 != 0) {
                                int i34 = onNavigationEvent + 29;
                                onWarmupCompleted = i34 % 128;
                                int i35 = i34 % 2;
                                z5 = false;
                            } else {
                                z5 = z;
                            }
                            if ((i5 & 256) != 0) {
                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                iAuthTabCallback_ParcelIAuthTabCallbackStub = !z5 ? focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub() : focusMeteringControlExternalSyntheticLambda12.IAuthTabCallback();
                                i6 &= -234881025;
                            } else {
                                iAuthTabCallback_ParcelIAuthTabCallbackStub = iAuthTabCallback_Parcel;
                            }
                            QuirkSettingsLoader.onNavigationEvent onnavigationeventIAuthTabCallbackStubProxy = i9 != 0 ? QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy() : onnavigationevent;
                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                            if ((i5 & 1024) != 0) {
                                onnavigationevent3 = onnavigationeventIAuthTabCallbackStubProxy;
                                camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback = Camera2CameraImplExternalSyntheticLambda22.onWarmupCompleted.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Camera2CameraImplExternalSyntheticLambda22.IAuthTabCallback);
                                i13 &= -15;
                            } else {
                                onnavigationevent3 = onnavigationeventIAuthTabCallbackStubProxy;
                                camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback = camera2CameraControlImplExternalSyntheticLambda2;
                            }
                            if (i11 != 0) {
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda04;
                                onnavigationevent4 = onnavigationevent3;
                                camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback;
                                z7 = z5;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_ParcelIAuthTabCallbackStub;
                                z6 = true;
                            } else {
                                deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda04;
                                onnavigationevent4 = onnavigationevent3;
                                z6 = z2;
                                camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2OnExtraCallback;
                                z7 = z5;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
                                iAuthTabCallback_Parcel3 = iAuthTabCallback_ParcelIAuthTabCallbackStub;
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i5 & 32) != 0) {
                                i6 &= -458753;
                            }
                            if ((i5 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            if ((i5 & 1024) != 0) {
                                i13 &= -15;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            camera2CameraMetadataExternalSyntheticLambda13 = camera2CameraMetadataExternalSyntheticLambda1;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                            z7 = z;
                            iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel;
                            onnavigationevent4 = onnavigationevent;
                            camera2CameraControlImplExternalSyntheticLambda23 = camera2CameraControlImplExternalSyntheticLambda2;
                            z6 = z2;
                        }
                        int i36 = i6;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1294627051, i36, i13, "im.toss.tds.compose.foundation.anim.StaggerLazyColumn (Staggers.kt:158)");
                        }
                        getMediaContentViewGroup getmediacontentviewgroupOnExtraCallback = getCallToActionButton.onExtraCallback.onExtraCallback();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda14 = camera2CameraMetadataExternalSyntheticLambda13;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(813073209, true, new StaggersKt$.ExternalSyntheticLambda1(quirksExternalSyntheticBackport03, camera2CameraMetadataExternalSyntheticLambda13, deviceQuirksExternalSyntheticLambda03, z7, iAuthTabCallback_Parcel3, onnavigationevent4, camera2CameraControlImplExternalSyntheticLambda23, z6, function1), cameraCaptureResultEmptyCameraCaptureResult2, 54);
                        int i37 = i36 >> 6;
                        int i38 = i36 << 9;
                        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{getsupportedhighspeedresolutionsfor, getswitchminwidth, 0, Integer.valueOf(i), Integer.valueOf(i2), 900, 0, getmediacontentviewgroupOnExtraCallback, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i37 & 14) | 115016064 | (i37 & 112) | (i38 & 7168) | (i38 & 57344)), 0}, -1256972455, 1256972456, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                        camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda14;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                        z3 = z7;
                        iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel3;
                        onnavigationevent2 = onnavigationevent4;
                        camera2CameraControlImplExternalSyntheticLambda22 = camera2CameraControlImplExternalSyntheticLambda23;
                        z4 = z6;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new StaggersKt$.ExternalSyntheticLambda2(i, i2, getsupportedhighspeedresolutionsfor, getswitchminwidth, quirksExternalSyntheticBackport02, camera2CameraMetadataExternalSyntheticLambda12, deviceQuirksExternalSyntheticLambda02, z3, iAuthTabCallback_Parcel2, onnavigationevent2, camera2CameraControlImplExternalSyntheticLambda22, z4, function1, i3, i4, i5));
                        return;
                    }
                    return;
                }
                i10 |= 48;
                i13 = i10;
                if ((i4 & 384) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i6) == 306783378 || (i13 & 147) != 146, i6 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            if ((i4 & 6) == 0) {
            }
            i11 = i5 & 2048;
            if (i11 == 0) {
            }
            i13 = i10;
            if ((i4 & 384) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i6) == 306783378 || (i13 & 147) != 146, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        if ((196608 & i3) == 0) {
        }
        i7 = i5 & 64;
        if (i7 == 0) {
        }
        i8 = i5 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i9 = i5 & 512;
        if (i9 == 0) {
        }
        if ((i4 & 6) == 0) {
        }
        i11 = i5 & 2048;
        if (i11 == 0) {
        }
        i13 = i10;
        if ((i4 & 384) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i6) == 306783378 || (i13 & 147) != 146, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSwitchMinWidth getswitchminwidth, int i, int i2, int i3, int i4, int i5, setOnQueryTextListener setonquerytextlistener, setTaggedAddrCtrl settaggedaddrctrl, int i6, int i7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i8) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), setonquerytextlistener, settaggedaddrctrl, Integer.valueOf(i6), Integer.valueOf(i7), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i8)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, -1809452489, 1809452489, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static final void onWarmupCompleted(@NotNull getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, @NotNull getSwitchMinWidth<Integer> getswitchminwidth, int i, int i2, int i3, int i4, int i5, @Nullable setOnQueryTextListener setonquerytextlistener, @NotNull setTaggedAddrCtrl<? super addShowingAdapter, ? super getSwitchMinWidth<Integer>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i6, int i7) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, getswitchminwidth, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), setonquerytextlistener, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i6), Integer.valueOf(i7)};
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        onExtraCallbackWithResult(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, -1256972455, 1256972456, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted);
    }
}
