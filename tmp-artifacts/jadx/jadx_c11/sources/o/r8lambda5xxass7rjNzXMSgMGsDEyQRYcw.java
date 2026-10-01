package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.graphics.RenderEffect;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraCaptureResult;
import o.component8;
import o.getOptionsView;
import o.getStreamSharingChildren;
import o.isExtraPreviewRequired;
import o.r8lambda5xxass7rjNzXMSgMGsDEyQRYcw;
import o.readFully;
import o.removeObserverLocked;
import o.setByteOrder;
import o.setIso;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda5xxass7rjNzXMSgMGsDEyQRYcw {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.IAuthTabCallback((access13800) this);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    public static final /* synthetic */ Object IAuthTabCallback(access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(-933574984, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, new Object[]{access13800Var}, 933574985);
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getOptionsView.onNavigationEvent onnavigationevent = (getOptionsView.onNavigationEvent) objArr[0];
        getOptionsView.onExtraCallbackWithResult onextracallbackwithresult = (getOptionsView.onExtraCallbackWithResult) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(onnavigationevent, onextracallbackwithresult, zBooleanValue, zBooleanValue2, fFloatValue);
        }
        onExtraCallbackWithResult(onnavigationevent, onextracallbackwithresult, zBooleanValue, zBooleanValue2, fFloatValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Ref.LongRef longRef, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {longRef, Long.valueOf(j)};
        Unit unit = (Unit) onExtraCallbackWithResult(-101408362, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 101408366);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getOptionsView getoptionsview, List list, float f, setTaggedAddrCtrl settaggedaddrctrl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 119;
        onExtraCallback = i5 % 128;
        onExtraCallback(quirksExternalSyntheticBackport0, getoptionsview, list, f, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final /* synthetic */ float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions);
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        List list = (List) objArr[1];
        getOptionsView getoptionsview = (getOptionsView) objArr[2];
        setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) objArr[3];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[4];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iIntValue, list, getoptionsview, settaggedaddrctrl, audioRestrictionControllerImplExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onNavigationEvent + 125;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(i, list, getoptionsview, settaggedaddrctrl, audioRestrictionControllerImplExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, list, getoptionsview, settaggedaddrctrl, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return onWarmupCompleted(i, list, getoptionsview, settaggedaddrctrl, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onWarmupCompleted(i, list, getoptionsview, settaggedaddrctrl, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getOptionsView getoptionsview, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, List list, setTaggedAddrCtrl settaggedaddrctrl, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(getoptionsview, camera2CameraMetadataExternalSyntheticLambda1, i, list, settaggedaddrctrl, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getoptionsview, camera2CameraMetadataExternalSyntheticLambda1, i, list, settaggedaddrctrl, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(getsupportedhighspeedresolutions, f);
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i6) | i);
        int i8 = ~i3;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i6);
        int i13 = (~(i8 | i6)) | i11 | i12;
        int i14 = (~(i3 | i10)) | i12;
        int i15 = i6 + i + i4 + (1039959776 * i5) + ((-2046201414) * i2);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i4) + ((-201326592) * i5) + ((-406847488) * i2) + (529399808 * i16);
        int i18 = ((i6 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i4 * 868239597) + (i5 * 817356128) + (i2 * 406493490) + (i16 * 645267456);
        switch (i17 + (i18 * i18 * 681705472)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                int iIntValue = ((Number) objArr[0]).intValue();
                int i19 = 2 % 2;
                int i20 = onExtraCallback + 121;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(iIntValue);
                int i22 = onNavigationEvent + 27;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                return objOnExtraCallbackWithResult;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
                getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[1];
                int i24 = 2 % 2;
                int i25 = onNavigationEvent + 35;
                onExtraCallback = i25 % 128;
                int i26 = i25 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(getstreamsharingchildren, onextracallbackwithresult);
                int i27 = onNavigationEvent + 111;
                onExtraCallback = i27 % 128;
                int i28 = i27 % 2;
                return unitOnWarmupCompleted;
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(i, list, getoptionsview, settaggedaddrctrl, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 85;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getOptionsView getoptionsview, List list, float f, setTaggedAddrCtrl settaggedaddrctrl, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(quirksExternalSyntheticBackport0, getoptionsview, list, f, settaggedaddrctrl, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(quirksExternalSyntheticBackport0, getoptionsview, list, f, settaggedaddrctrl, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, boolean z2, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(z, z2, f, quirksExternalSyntheticBackport0, (getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(readFully readfully, setIso setiso) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(readfully, setiso);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = onNavigationEvent + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ component8 onNavigationEvent(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, float f, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(i, list, getoptionsview, settaggedaddrctrl, f, camera2CameraMetadataExternalSyntheticLambda1, isextrapreviewrequired, virtualCameraCaptureResult);
            throw null;
        }
        component8 component8VarOnWarmupCompleted = onWarmupCompleted(i, list, getoptionsview, settaggedaddrctrl, f, camera2CameraMetadataExternalSyntheticLambda1, isextrapreviewrequired, virtualCameraCaptureResult);
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return component8VarOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(i);
        }
        onExtraCallback(i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getOptionsView getoptionsview, float f, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, List list, setTaggedAddrCtrl settaggedaddrctrl, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getoptionsview, f, camera2CameraMetadataExternalSyntheticLambda1, i, list, settaggedaddrctrl, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 82 / 0;
        }
        int i7 = onNavigationEvent + 89;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getoptionsview, settaggedaddrctrl, obj, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, boolean z2, float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, z2, f, quirksExternalSyntheticBackport0, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 63;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onWarmupCompleted(boolean z, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(z), Float.valueOf(f), sessionProcessorCaptureCallback};
        removeObserverLocked removeobserverlocked = (removeObserverLocked) onExtraCallbackWithResult(715809620, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -715809620);
        int i4 = onExtraCallback + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return removeobserverlocked;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean z;
        boolean z2;
        boolean z3;
        getOptionsView.onNavigationEvent onnavigationevent = (getOptionsView.onNavigationEvent) objArr[0];
        getOptionsView.onExtraCallbackWithResult onextracallbackwithresult = (getOptionsView.onExtraCallbackWithResult) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = ((Number) objArr[4]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        if ((iIntValue2 & 1) != 0) {
            onnavigationevent = getOptionsView.onNavigationEvent.Normal;
        }
        final getOptionsView.onNavigationEvent onnavigationevent2 = onnavigationevent;
        if ((iIntValue2 & 2) != 0) {
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onextracallbackwithresult = getOptionsView.onExtraCallbackWithResult.HorizontalLeft;
        }
        final getOptionsView.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        if ((iIntValue2 & 4) != 0) {
            zBooleanValue = true;
        }
        if ((iIntValue2 & 8) != 0) {
            zBooleanValue2 = false;
        }
        if ((iIntValue2 & 16) != 0) {
            int i4 = onNavigationEvent + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                int i5 = 6 / 0;
            } else {
                fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1755139868, iIntValue, -1, "im.toss.tds.compose.component.anim.logo.rememberSlidingListState (TdsAnimateLoop.kt:134)");
            int i8 = onExtraCallback + 93;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        Object[] objArr2 = new Object[0];
        getCaptureIds<getOptionsView, Object> getcaptureidsOnExtraCallbackWithResult = getOptionsView.Companion.onExtraCallbackWithResult();
        boolean z4 = ((6 ^ (iIntValue & 14)) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent2.ordinal())) || (iIntValue & 6) == 4;
        Object obj = null;
        if (((iIntValue & 112) ^ 48) > 32) {
            int i10 = onNavigationEvent + 23;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallbackwithresult2.ordinal());
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallbackwithresult2.ordinal())) {
                z = (iIntValue & 48) == 32;
            }
        }
        if (((iIntValue & 896) ^ 384) > 256) {
            int i11 = onNavigationEvent + 121;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue);
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue)) {
                z2 = (iIntValue & 384) == 256;
            }
        }
        if (((iIntValue & 7168) ^ 3072) > 2048) {
            int i12 = onNavigationEvent + 39;
            onExtraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue2);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue2)) {
                z3 = (iIntValue & 3072) == 2048;
            }
        }
        boolean z5 = (((57344 & iIntValue) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(fFloatValue)) || (iIntValue & 24576) == 16384;
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z5 | z2 | z | z4 | z3) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            final boolean z6 = zBooleanValue;
            final boolean z7 = zBooleanValue2;
            final float f = fFloatValue;
            objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda4
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    getOptionsView getoptionsview;
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 41;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        getoptionsview = (getOptionsView) r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(1218243171, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onnavigationevent2, onextracallbackwithresult2, Boolean.valueOf(z6), Boolean.valueOf(z7), Float.valueOf(f)}, -1218243165);
                        int i15 = 73 / 0;
                    } else {
                        getoptionsview = (getOptionsView) r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(1218243171, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onnavigationevent2, onextracallbackwithresult2, Boolean.valueOf(z6), Boolean.valueOf(z7), Float.valueOf(f)}, -1218243165);
                    }
                    int i16 = onWarmupCompleted + 35;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        return getoptionsview;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        getOptionsView getoptionsview = (getOptionsView) RememberSaveableKt.onWarmupCompleted(objArr2, getcaptureidsOnExtraCallbackWithResult, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return getoptionsview;
    }

    private static final getOptionsView onExtraCallbackWithResult(getOptionsView.onNavigationEvent onnavigationevent, getOptionsView.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, float f) {
        int i = 2 % 2;
        getOptionsView getoptionsview = new getOptionsView(onnavigationevent, onextracallbackwithresult, z, z2, f, null);
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return getoptionsview;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutions $baseSpeed$delegate;
        final /* synthetic */ getOptionsView $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(getOptionsView getoptionsview, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = getoptionsview;
            this.$baseSpeed$delegate = getsupportedhighspeedresolutions;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$baseSpeed$delegate, access13800Var);
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(this.$baseSpeed$delegate, this.$state.onWarmupCompleted().getValue() * 60.0f);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ int $base;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ int $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(int i, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i2, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$size = i;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$base = i2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$size, this.$listState, this.$base, access13800Var);
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 99 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 107;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (this.$size == 0) {
                    int i4 = onWarmupCompleted + 77;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return Unit.INSTANCE;
                    }
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                int i5 = this.$base;
                this.label = 1;
                if (Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, i5, 0, this, 2, (Object) null) == objOnWarmupCompleted) {
                    int i6 = onWarmupCompleted + 113;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutions $baseSpeed$delegate;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ int $size;
        final /* synthetic */ getOptionsView $state;
        float F$0;
        float F$1;
        float F$2;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(int i, getOptionsView getoptionsview, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$size = i;
            this.$state = getoptionsview;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$baseSpeed$delegate = getsupportedhighspeedresolutions;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$size, this.$state, this.$listState, this.$baseSpeed$delegate, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
        
            if (o.Camera2CameraImplExternalSyntheticLambda14.onExtraCallbackWithResult(r14, r13, r20) != r3) goto L35;
         */
        /* JADX WARN: Path cross not found for [B:19:0x0066, B:22:0x0073], limit reached: 37 */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[PHI: r4 r8
          0x007f: PHI (r4v6 java.lang.Object) = (r4v19 java.lang.Object), (r4v20 java.lang.Object), (r4v24 java.lang.Object) binds: [B:23:0x007d, B:20:0x0070, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
          0x007f: PHI (r8v2 long) = (r8v4 long), (r8v4 long), (r8v5 long) binds: [B:23:0x007d, B:20:0x0070, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e4 -> B:15:0x0054). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            Object objIAuthTabCallback;
            long jLongValue;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$size == 0) {
                    Unit unit = Unit.INSTANCE;
                    int i3 = onExtraCallbackWithResult + 81;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return unit;
                }
                int i5 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                j = 0;
            } else if (i2 == 1) {
                j = this.J$0;
                ResultKt.onNavigationEvent(obj);
                int i7 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                objIAuthTabCallback = obj;
                jLongValue = ((Number) objIAuthTabCallback).longValue();
                if (j != 0 && !this.$state.IAuthTabCallbackStub()) {
                    float f = (jLongValue - j) / 1.0E9f;
                    float f2 = !((Boolean) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1248301273, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this.$state}, -1248301271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).booleanValue() ? -1.0f : 1.0f;
                    float fOnExtraCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(this.$baseSpeed$delegate) * f * f2;
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                    this.L$0 = findresandmsg;
                    this.J$0 = j;
                    this.J$1 = jLongValue;
                    this.F$0 = f;
                    this.F$1 = f2;
                    this.F$2 = fOnExtraCallback;
                    this.label = 2;
                }
                j = jLongValue;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$1;
                ResultKt.onNavigationEvent(obj);
            }
            if (!findRes.onWarmupCompleted(findresandmsg)) {
                int i9 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    this.L$0 = findresandmsg;
                    this.J$0 = j;
                    this.label = 1;
                    objIAuthTabCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.IAuthTabCallback((access13800) this);
                    if (objIAuthTabCallback != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                this.L$0 = findresandmsg;
                this.J$0 = j;
                this.label = 1;
                objIAuthTabCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.IAuthTabCallback((access13800) this);
                if (objIAuthTabCallback != objOnWarmupCompleted) {
                    jLongValue = ((Number) objIAuthTabCallback).longValue();
                    if (j != 0) {
                        float f3 = (jLongValue - j) / 1.0E9f;
                        if (!((Boolean) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1248301273, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{this.$state}, -1248301271, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent())).booleanValue()) {
                        }
                        float fOnExtraCallback2 = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(this.$baseSpeed$delegate) * f3 * f2;
                        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = this.$listState;
                        this.L$0 = findresandmsg;
                        this.J$0 = j;
                        this.J$1 = jLongValue;
                        this.F$0 = f3;
                        this.F$1 = f2;
                        this.F$2 = fOnExtraCallback2;
                        this.label = 2;
                    }
                    j = jLongValue;
                    if (!findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
                return objOnWarmupCompleted;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onExtraCallback + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(994951758, i, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateLoop.kt:189)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, getoptionsview.onNavigationEvent(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
                int i7 = onExtraCallback + 35;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            settaggedaddrctrl.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, obj, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Object onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
        return numValueOf;
    }

    private static final Unit onNavigationEvent(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4;
        int i5;
        List list2;
        int i6;
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 59;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i2)) {
                int i10 = onExtraCallback + 13;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 = i3 | i6;
        } else {
            i4 = i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 145) != 144, i4 & 1)) {
            int i12 = onNavigationEvent + 87;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(647511249, i4, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateLoop.kt:220)");
            }
            if (i == 0) {
                int i14 = onNavigationEvent + 95;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                list2 = list;
                i5 = 0;
            } else {
                i5 = i2 % i;
                list2 = list;
            }
            Object obj = list2.get(i5);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, getoptionsview.onNavigationEvent(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i16 = onNavigationEvent + 105;
                onExtraCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i17 = onNavigationEvent + 55;
                onExtraCallback = i17 % 128;
                if (i17 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    int i18 = 14 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            settaggedaddrctrl.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, obj, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final int i, final List list, final getOptionsView getoptionsview, final setTaggedAddrCtrl settaggedaddrctrl, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        if (i == 0) {
            int i6 = onExtraCallback + 11;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, i2, new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda11
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                int iIntValue = ((Integer) obj).intValue();
                if (i10 != 0) {
                    return r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(426214556, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(iIntValue)}, -426214553);
                }
                int i11 = 14 / 0;
                return r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(426214556, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{Integer.valueOf(iIntValue)}, -426214553);
            }
        }, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(647511249, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda12
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 73;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Object obj5 = null;
                int i11 = i;
                List list2 = list;
                if (i10 != 0) {
                    r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(i11, list2, getoptionsview, settaggedaddrctrl, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    obj5.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(i11, list2, getoptionsview, settaggedaddrctrl, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i12 = onWarmupCompleted + 119;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }), 4, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Object onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return Integer.valueOf(i);
        }
        Integer.valueOf(i);
        throw null;
    }

    private static final Unit onWarmupCompleted(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i3 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i2)) {
                int i8 = onNavigationEvent + 103;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 = i3 | i6;
        } else {
            i4 = i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i4 & 145) != 144, i4 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 107;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1847691854, i4, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateLoop.kt:235)");
            }
            if (i == 0) {
                i5 = 0;
            } else {
                i5 = i2 % i;
                int i12 = onExtraCallback + 85;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
            Object obj = list.get(i5);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, getoptionsview.onNavigationEvent(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
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
                int i14 = onExtraCallback + 15;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            settaggedaddrctrl.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, obj, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onNavigationEvent + 79;
                onExtraCallback = i16 % 128;
                if (i16 % 2 == 0) {
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

    private static final Unit onWarmupCompleted(final int i, final List list, final getOptionsView getoptionsview, final setTaggedAddrCtrl settaggedaddrctrl, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        if (i == 0) {
            int i6 = onExtraCallback + 61;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i2 = 0;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, i2, new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 99;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                Object objOnWarmupCompleted = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(((Integer) obj).intValue());
                int i11 = IAuthTabCallback + 79;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                return objOnWarmupCompleted;
            }
        }, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1847691854, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnExtraCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(i, list, getoptionsview, settaggedaddrctrl, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Integer) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i11 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 31 / 0;
                }
                return unitOnExtraCallback;
            }
        }), 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(final getOptionsView getoptionsview, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, final int i, final List list, final setTaggedAddrCtrl settaggedaddrctrl, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        if ((i2 & 17) != 16) {
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-954837462, i2, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsAnimateLoop.kt:210)");
            }
            if (getoptionsview.asBinder()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(5638052);
                int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent2 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent3 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                boolean zBooleanValue = ((Boolean) getOptionsView.onNavigationEvent(iOnNavigationEvent2, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1248301273, iOnNavigationEvent, new Object[]{getoptionsview}, -1248301271, iOnNavigationEvent3)).booleanValue();
                boolean zOnTransact = getoptionsview.onTransact();
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getoptionsview);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(settaggedaddrctrl);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent | zOnNavigationEvent2)) {
                    int i6 = onNavigationEvent + 41;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda7
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallbackWithResult + 91;
                                onWarmupCompleted = i8 % 128;
                                int i9 = i8 % 2;
                                Unit unitOnExtraCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(i, list, getoptionsview, settaggedaddrctrl, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj3);
                                int i10 = onWarmupCompleted + 99;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                        obj2 = function1;
                    }
                    ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, zBooleanValue, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, zOnTransact, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0, 373);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(6362119);
                int iOnNavigationEvent4 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent5 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                int iOnNavigationEvent6 = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
                boolean zBooleanValue2 = ((Boolean) getOptionsView.onNavigationEvent(iOnNavigationEvent5, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1248301273, iOnNavigationEvent4, new Object[]{getoptionsview}, -1248301271, iOnNavigationEvent6)).booleanValue();
                boolean zOnTransact2 = getoptionsview.onTransact();
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getoptionsview);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(settaggedaddrctrl);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent3 | zOnNavigationEvent4)) {
                    int i7 = onExtraCallback + 123;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function1 function12 = new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda8
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj4) {
                                int i9 = 2 % 2;
                                int i10 = onExtraCallback + 37;
                                onWarmupCompleted = i10 % 128;
                                int i11 = i10 % 2;
                                int i12 = i;
                                if (i11 != 0) {
                                    Object[] objArr = {Integer.valueOf(i12), list, getoptionsview, settaggedaddrctrl, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj4};
                                    return (Unit) r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(2013159783, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -2013159781);
                                }
                                Object[] objArr2 = {Integer.valueOf(i12), list, getoptionsview, settaggedaddrctrl, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj4};
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function12);
                        obj3 = function12;
                    }
                    ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, zBooleanValue2, (FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent) null, (QuirkSettingsLoader.onWarmupCompleted) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, zOnTransact2, (removeChildrenForExpandedActionView) null, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0, 373);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 41;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onExtraCallback + 89;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final getOptionsView getoptionsview, float f, final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, final int i, final List list, final setTaggedAddrCtrl settaggedaddrctrl, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onNavigationEvent + 1;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1800921300, i2, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop.<anonymous>.<anonymous>.<anonymous> (TdsAnimateLoop.kt:204)");
            }
            onExtraCallbackWithResult(getoptionsview.onExtraCallbackWithResult(), getoptionsview.asBinder(), f, (QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, (getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-954837462, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda14
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = 2 % 2;
                    int i8 = onWarmupCompleted + 41;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallback(getoptionsview, camera2CameraMetadataExternalSyntheticLambda1, i, list, settaggedaddrctrl, (HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = onWarmupCompleted + 51;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 60 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 27648, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final component8 onWarmupCompleted(final int i, final List list, final getOptionsView getoptionsview, final setTaggedAddrCtrl settaggedaddrctrl, final float f, final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, isExtraPreviewRequired isextrapreviewrequired, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i2;
        int i3;
        Integer numValueOf;
        int iIntValue;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(isextrapreviewrequired, "");
        long jOnWarmupCompleted = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.onWarmupCompleted(0, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), 0, VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()));
        boolean z = true;
        if (i > 0) {
            int size = list.size();
            int i5 = 0;
            i3 = 0;
            int i6 = 0;
            while (i5 < size) {
                final Object obj = list.get(i5);
                List listIAuthTabCallback = isextrapreviewrequired.IAuthTabCallback("animate_loop_child_" + i5, ForwardingCameraControl.onExtraCallbackWithResult(994951758, z, new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 63;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnWarmupCompleted = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(getoptionsview, settaggedaddrctrl, obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i10 = IAuthTabCallback + 21;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }));
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIAuthTabCallback, 10));
                Iterator it = listIAuthTabCallback.iterator();
                while (it.hasNext()) {
                    arrayList.add(((component7) it.next()).onExtraCallback(jOnWarmupCompleted));
                }
                Iterator it2 = arrayList.iterator();
                Integer num = null;
                if (it2.hasNext()) {
                    numValueOf = Integer.valueOf(((getStreamSharingChildren) it2.next()).getInterfaceDescriptor());
                    while (it2.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((getStreamSharingChildren) it2.next()).getInterfaceDescriptor());
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            int i7 = onExtraCallback + 57;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            numValueOf = numValueOf2;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int i9 = onExtraCallback + 29;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((getStreamSharingChildren) it3.next()).T_());
                    while (it3.hasNext()) {
                        int i11 = onNavigationEvent + 21;
                        onExtraCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            numValueOf3.compareTo(Integer.valueOf(((getStreamSharingChildren) it3.next()).T_()));
                            throw null;
                        }
                        Integer numValueOf4 = Integer.valueOf(((getStreamSharingChildren) it3.next()).T_());
                        if (numValueOf3.compareTo(numValueOf4) < 0) {
                            numValueOf3 = numValueOf4;
                        }
                    }
                    num = numValueOf3;
                }
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (iIntValue > i6) {
                    i6 = iIntValue;
                }
                if (iIntValue2 > i3) {
                    i3 = iIntValue2;
                }
                i5++;
                z = true;
            }
            i2 = i6;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int iCoerceIn = RangesKt.coerceIn(i2, VirtualCameraCaptureResult.onTransact(virtualCameraCaptureResult.onExtraCallback()), VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()));
        int iCoerceIn2 = RangesKt.coerceIn(i3, VirtualCameraCaptureResult.asBinder(virtualCameraCaptureResult.onExtraCallback()), VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()));
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = ((component7) CollectionsKt.first(isextrapreviewrequired.IAuthTabCallback("fadingEdge", ForwardingCameraControl.onExtraCallbackWithResult(-1800921300, true, new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i12 = 2 % 2;
                int i13 = onExtraCallbackWithResult + 105;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                Unit unitOnWarmupCompleted = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(getoptionsview, f, camera2CameraMetadataExternalSyntheticLambda1, i, list, settaggedaddrctrl, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i15 = onExtraCallbackWithResult + 51;
                onExtraCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        })))).onExtraCallback(VirtualCameraCaptureResult.Companion.IAuthTabCallback(iCoerceIn, iCoerceIn2));
        return component4.IAuthTabCallback(isextrapreviewrequired, iCoerceIn, iCoerceIn2, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj2) {
                int i12 = 2 % 2;
                int i13 = onWarmupCompleted + 57;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr = {getstreamsharingchildrenOnExtraCallback, (getStreamSharingChildren.onExtraCallbackWithResult) obj2};
                Unit unit = (Unit) r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(-1376729933, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 1376729938);
                int i15 = onWarmupCompleted + 19;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                return unit;
            }
        }, 4, (Object) null);
    }

    private static final Unit onWarmupCompleted(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 1, 0.0f, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, 0, 0.0f, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getOptionsView getoptionsview, @NotNull final List<? extends T> list, float f, @NotNull final setTaggedAddrCtrl<? super HighSpeedResolverExternalSyntheticLambda2, ? super T, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        getOptionsView getoptionsview2;
        float f2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final float f3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getOptionsView getoptionsview3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        int i5;
        float f4;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getOptionsView getoptionsview4;
        final int size;
        int iMax;
        final Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
        int i7;
        boolean z2;
        Object objOnMinimized2;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback2;
        Object objOnMinimized3;
        int i8;
        Object[] objArr;
        boolean zOnExtraCallback3;
        boolean z3;
        boolean zOnNavigationEvent2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Object[] objArr2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean zOnNavigationEvent3;
        Object objOnMinimized4;
        final getOptionsView getoptionsview5;
        int i9;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        boolean zOnExtraCallback4;
        int i10;
        int i11;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport0;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1370266472);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i14 = onNavigationEvent + 79;
            onExtraCallback = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport06);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport06) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i15 = onNavigationEvent;
            int i16 = i15 + 95;
            onExtraCallback = i16 % 128;
            if (i16 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
                getoptionsview2 = getoptionsview;
            } else {
                int i17 = i15 + 111;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                getoptionsview2 = getoptionsview;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview2)) {
                    i11 = 32;
                }
                i3 |= i11;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            getoptionsview2 = getoptionsview;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                int i19 = onNavigationEvent + 123;
                onExtraCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                    throw null;
                }
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
            } else {
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list);
            }
            if (zOnExtraCallback4) {
                int i20 = onExtraCallback + 71;
                onNavigationEvent = i20 % 128;
                int i21 = i20 % 2;
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        int i22 = i2 & 8;
        if (i22 == 0) {
            if ((i & 3072) == 0) {
                int i23 = onExtraCallback + 29;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                f2 = f;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(settaggedaddrctrl) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362) {
                int i25 = onExtraCallback + 109;
                onNavigationEvent = i25 % 128;
                int i26 = i25 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                f3 = f;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                getoptionsview3 = getoptionsview2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i13 != 0) {
                        quirksExternalSyntheticBackport06 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if ((i2 & 2) != 0) {
                        i4 = 1;
                        i5 = 32;
                        getoptionsview2 = (getOptionsView) onExtraCallbackWithResult(1129917488, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{null, null, false, false, Float.valueOf(0.0f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 31}, -1129917481);
                        i3 &= -113;
                    } else {
                        i4 = 1;
                        i5 = 32;
                    }
                    if (i22 != 0) {
                        i6 = i3;
                        f4 = 0.3f;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                        getoptionsview4 = getoptionsview2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1370266472, i6, -1, "im.toss.tds.compose.component.anim.logo.TdsAnimateLoop (TdsAnimateLoop.kt:145)");
                        }
                        size = list.size();
                        iMax = 1073741823 - (1073741823 % Math.max(i4, size));
                        camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(60.0f);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
                        getOptionsView.onNavigationEvent onnavigationeventOnWarmupCompleted = getoptionsview4.onWarmupCompleted();
                        i7 = (i6 & 112) ^ 48;
                        z2 = (i7 <= i5 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview4)) || (i6 & 48) == i5;
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new onExtraCallbackWithResult(getoptionsview4, getsupportedhighspeedresolutions, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(onnavigationeventOnWarmupCompleted, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        getOptionsView.onExtraCallbackWithResult onextracallbackwithresult = (getOptionsView.onExtraCallbackWithResult) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1246868658, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{getoptionsview4}, 1246868659, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        getOptionsView.onNavigationEvent onnavigationeventOnWarmupCompleted2 = getoptionsview4.onWarmupCompleted();
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iMax);
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new onExtraCallback(size, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, iMax, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        i8 = i6;
                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(onextracallbackwithresult, onnavigationeventOnWarmupCompleted2, Integer.valueOf(size), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        objArr = new Object[]{(getOptionsView.onExtraCallbackWithResult) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1246868658, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{getoptionsview4}, 1246868659, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()), getoptionsview4.onWarmupCompleted(), Boolean.valueOf(getoptionsview4.IAuthTabCallbackStub()), Integer.valueOf(size)};
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                        z3 = (i7 <= 32 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview4)) || (i8 & 48) == 32;
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((!(zOnExtraCallback3 | z3) && !zOnNavigationEvent2) && objOnMinimized5 != onwarmupcompleted.onExtraCallback()) {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            objArr2 = objArr;
                        } else {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            objArr2 = objArr;
                            onNavigationEvent onnavigationevent = new onNavigationEvent(size, getoptionsview4, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, getsupportedhighspeedresolutions, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onnavigationevent);
                            objOnMinimized5 = onnavigationevent;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                        if ((i8 & 896) == 256) {
                            if ((i8 & 512) != 0) {
                                z4 = true;
                                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list)) {
                                }
                                z6 = ((i7 > 32 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getoptionsview4)) && (i8 & 48) != 32) ? false : z4;
                                z7 = (57344 & i8) == 16384 ? z4 : false;
                                if ((i8 & 7168) != 2048) {
                                    z4 = false;
                                }
                                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (((z6 | zOnExtraCallback5 | z5 | z7 | z4) || zOnNavigationEvent3) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    getoptionsview5 = getoptionsview4;
                                    i9 = 0;
                                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    final float f5 = f4;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    objOnMinimized4 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda15
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj, Object obj2) {
                                            component8 component8VarOnNavigationEvent;
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallbackWithResult + 125;
                                            onWarmupCompleted = i28 % 128;
                                            if (i28 % 2 != 0) {
                                                component8VarOnNavigationEvent = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onNavigationEvent(size, list, getoptionsview5, settaggedaddrctrl, f5, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                                int i29 = 24 / 0;
                                            } else {
                                                component8VarOnNavigationEvent = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onNavigationEvent(size, list, getoptionsview5, settaggedaddrctrl, f5, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                            }
                                            int i30 = onWarmupCompleted + 35;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            return component8VarOnNavigationEvent;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                } else {
                                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    getoptionsview5 = getoptionsview4;
                                    i9 = 0;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                }
                                hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport05, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, i8 & 14, i9);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                getoptionsview3 = getoptionsview5;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                f3 = f4;
                            } else {
                                z4 = true;
                            }
                            z5 = false;
                            if (i7 > 32) {
                                if ((57344 & i8) == 16384) {
                                }
                                if ((i8 & 7168) != 2048) {
                                }
                                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z6 | zOnExtraCallback5 | z5 | z7 | z4 | zOnNavigationEvent3) {
                                    getoptionsview5 = getoptionsview4;
                                    i9 = 0;
                                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    final float f52 = f4;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    objOnMinimized4 = new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda15
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onWarmupCompleted;

                                        public final Object invoke(Object obj, Object obj2) {
                                            component8 component8VarOnNavigationEvent;
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallbackWithResult + 125;
                                            onWarmupCompleted = i28 % 128;
                                            if (i28 % 2 != 0) {
                                                component8VarOnNavigationEvent = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onNavigationEvent(size, list, getoptionsview5, settaggedaddrctrl, f52, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                                int i29 = 24 / 0;
                                            } else {
                                                component8VarOnNavigationEvent = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onNavigationEvent(size, list, getoptionsview5, settaggedaddrctrl, f52, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, (isExtraPreviewRequired) obj, (VirtualCameraCaptureResult) obj2);
                                            }
                                            int i30 = onWarmupCompleted + 35;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            return component8VarOnNavigationEvent;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                    hasVideoCapture.onExtraCallback(quirksExternalSyntheticBackport05, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, i8 & 14, i9);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                    getoptionsview3 = getoptionsview5;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                                    f3 = f4;
                                }
                            } else {
                                if ((57344 & i8) == 16384) {
                                }
                                if ((i8 & 7168) != 2048) {
                                }
                                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z6 | zOnExtraCallback5 | z5 | z7 | z4 | zOnNavigationEvent3) {
                                }
                            }
                        } else {
                            z4 = true;
                        }
                        z5 = z4;
                        if (i7 > 32) {
                        }
                    } else {
                        f4 = f;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    f4 = f2;
                    i4 = 1;
                    i5 = 32;
                }
                i6 = i3;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                getoptionsview4 = getoptionsview2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                size = list.size();
                iMax = 1073741823 - (1073741823 % Math.max(i4, size));
                camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                }
                getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
                getOptionsView.onNavigationEvent onnavigationeventOnWarmupCompleted3 = getoptionsview4.onWarmupCompleted();
                i7 = (i6 & 112) ^ 48;
                if (i7 <= i5) {
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z2) {
                        objOnMinimized2 = new onExtraCallbackWithResult(getoptionsview4, getsupportedhighspeedresolutions, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(onnavigationeventOnWarmupCompleted3, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        getOptionsView.onExtraCallbackWithResult onextracallbackwithresult2 = (getOptionsView.onExtraCallbackWithResult) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1246868658, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{getoptionsview4}, 1246868659, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        getOptionsView.onNavigationEvent onnavigationeventOnWarmupCompleted22 = getoptionsview4.onWarmupCompleted();
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iMax);
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2)) {
                            objOnMinimized3 = new onExtraCallback(size, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, iMax, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            i8 = i6;
                            isZslDisabledByByUserCaseConfig.IAuthTabCallback(onextracallbackwithresult2, onnavigationeventOnWarmupCompleted22, Integer.valueOf(size), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            objArr = new Object[]{(getOptionsView.onExtraCallbackWithResult) getOptionsView.onNavigationEvent(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1246868658, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), new Object[]{getoptionsview4}, 1246868659, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent()), getoptionsview4.onWarmupCompleted(), Boolean.valueOf(getoptionsview4.IAuthTabCallbackStub()), Integer.valueOf(size)};
                            zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                            if (i7 <= 32) {
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                                Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback3 | z3 | zOnNavigationEvent2) {
                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    objArr2 = objArr;
                                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized52, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    boolean zOnExtraCallback52 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(size);
                                    if ((i8 & 896) == 256) {
                                    }
                                    z5 = z4;
                                    if (i7 > 32) {
                                    }
                                }
                            } else {
                                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
                                Object objOnMinimized522 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnExtraCallback3 | z3 | zOnNavigationEvent2) {
                                }
                            }
                        }
                    }
                } else {
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z2) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda16
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i27 = 2 % 2;
                        int i28 = onExtraCallback + 125;
                        IAuthTabCallback = i28 % 128;
                        int i29 = i28 % 2;
                        Unit unitOnExtraCallbackWithResult = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, getoptionsview3, list, f3, settaggedaddrctrl, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i30 = onExtraCallback + 35;
                        IAuthTabCallback = i30 % 128;
                        int i31 = i30 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f2 = f;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a3 A[PHI: r6 r11
      0x00a3: PHI (r6v7 java.lang.Float) = (r6v4 java.lang.Float), (r6v9 java.lang.Float) binds: [B:8:0x0044, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r11v3 java.lang.Float) = (r11v1 java.lang.Float), (r11v4 java.lang.Float) binds: [B:8:0x0044, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[PHI: r6 r11
      0x0046: PHI (r6v5 java.lang.Float) = (r6v4 java.lang.Float), (r6v9 java.lang.Float) binds: [B:8:0x0044, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r11v2 java.lang.Float) = (r11v1 java.lang.Float), (r11v4 java.lang.Float) binds: [B:8:0x0044, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Float fValueOf;
        Float fValueOf2;
        final readFully readfullyIAuthTabCallback;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            fValueOf = Float.valueOf(0.0f);
            fValueOf2 = Float.valueOf(0.0f);
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            if (!(!zBooleanValue)) {
                int i3 = onNavigationEvent + 37;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                readFully.onExtraCallback onextracallback = readFully.Companion;
                setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
                readfullyIAuthTabCallback = readFully.onExtraCallback.IAuthTabCallback(onextracallback, new Pair[]{getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(fFloatValue), setByteOrder.onNavigationEvent(onextracallbackwithresult.onNavigationEvent())), getWrite.IAuthTabCallback(Float.valueOf(1.0f - fFloatValue), setByteOrder.onNavigationEvent(onextracallbackwithresult.onNavigationEvent())), getWrite.IAuthTabCallback(fValueOf2, setByteOrder.onNavigationEvent(onextracallbackwithresult.IAuthTabCallbackDefault()))}, 0.0f, 0.0f, 0, 14, (Object) null);
            } else {
                readFully.onExtraCallback onextracallback2 = readFully.Companion;
                setByteOrder.onExtraCallbackWithResult onextracallbackwithresult2 = setByteOrder.Companion;
                readfullyIAuthTabCallback = readFully.onExtraCallback.onNavigationEvent(onextracallback2, new Pair[]{getWrite.IAuthTabCallback(fValueOf, setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(fFloatValue), setByteOrder.onNavigationEvent(onextracallbackwithresult2.onNavigationEvent())), getWrite.IAuthTabCallback(Float.valueOf(1.0f - fFloatValue), setByteOrder.onNavigationEvent(onextracallbackwithresult2.onNavigationEvent())), getWrite.IAuthTabCallback(fValueOf2, setByteOrder.onNavigationEvent(onextracallbackwithresult2.IAuthTabCallbackDefault()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                int i5 = onExtraCallback + 89;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            fValueOf = Float.valueOf(0.0f);
            fValueOf2 = Float.valueOf(1.0f);
            Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
            if (zBooleanValue) {
            }
        }
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 93;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onNavigationEvent(readfullyIAuthTabCallback, (setIso) obj);
                int i10 = onNavigationEvent + 83;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        int i7 = onNavigationEvent + 1;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit IAuthTabCallback(readFully readfully, setIso setiso) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        if (setUseCaseDetached.onExtraCallback(setiso.onTransact()) <= 0.0f) {
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }
        setOrientationDegrees.onExtraCallback(setiso, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, readBoolean.Companion.onTransact(), 62, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 113;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final boolean z, final boolean z2, final float f, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1157902370);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = onNavigationEvent + 21;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                    int i9 = onNavigationEvent + 25;
                    onExtraCallback = i9 % 128;
                    i4 = i9 % 2 == 0 ? 6660 : 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) == 9362) {
                int i10 = onExtraCallback;
                int i11 = i10 + 95;
                onNavigationEvent = i11 % 128;
                z3 = i11 % 2 == 0;
                int i12 = i10 + 113;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            } else {
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                if (i8 != 0) {
                    int i14 = onNavigationEvent + 123;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1157902370, i3, -1, "im.toss.tds.compose.component.anim.logo.FadingEdge (TdsAnimateLoop.kt:257)");
                }
                final float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 0.5f);
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(347659771);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, false, (RenderEffect) null, 0L, 0L, createFromFileString.Companion.onNavigationEvent(), 0, (seek) null, 458751, (Object) null);
                    boolean z4 = (i3 & 112) == 32;
                    boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fCoerceIn);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zIAuthTabCallback | z4) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda9
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj) {
                                int i16 = 2 % 2;
                                int i17 = onNavigationEvent + 101;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                                boolean z5 = z2;
                                if (i18 == 0) {
                                    return r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(z5, fCoerceIn, (SessionProcessorCaptureCallback) obj);
                                }
                                removeObserverLocked removeobserverlockedOnWarmupCompleted = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(z5, fCoerceIn, (SessionProcessorCaptureCallback) obj);
                                int i19 = 65 / 0;
                                return removeobserverlockedOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    quirksExternalSyntheticBackport0IAuthTabCallback = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(347655530);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport0IAuthTabCallback = quirksExternalSyntheticBackport04;
                }
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i16 = onExtraCallback + 109;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i18 = onExtraCallback + 39;
                    onNavigationEvent = i18 % 128;
                    if (i18 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
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
                getbacktracenote.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((((i3 >> 3) & 7168) >> 6) & 112) | 6));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onNavigationEvent + 103;
                    onExtraCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda10
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 11;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 != 0) {
                            return r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(z, z2, f, quirksExternalSyntheticBackport03, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.onWarmupCompleted(z, z2, f, quirksExternalSyntheticBackport03, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Ref.LongRef longRef = (Ref.LongRef) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        longRef.element = jLongValue;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onWarmupCompleted onwarmupcompleted;
        Ref.LongRef longRef;
        onWarmupCompleted onwarmupcompleted2 = (access13800) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = onwarmupcompleted2 instanceof onWarmupCompleted;
            throw null;
        }
        if (!(onwarmupcompleted2 instanceof onWarmupCompleted)) {
            onwarmupcompleted = new onWarmupCompleted(onwarmupcompleted2);
        } else {
            onwarmupcompleted = onwarmupcompleted2;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onNavigationEvent + 29;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    onwarmupcompleted.label = i3 % Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i3 - 2147483648;
                }
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            final Ref.LongRef longRef2 = new Ref.LongRef();
            Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.anim.logo.TdsAnimateLoopKt$$ExternalSyntheticLambda13
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 97;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = r8lambda5xxass7rjNzXMSgMGsDEyQRYcw.IAuthTabCallback(longRef2, ((Long) obj2).longValue());
                    int i9 = onNavigationEvent + 63;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 3 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
            onwarmupcompleted.L$0 = longRef2;
            onwarmupcompleted.label = 1;
            if (addSessionCaptureCallback.IAuthTabCallback(function1, onwarmupcompleted) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            longRef = longRef2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        Long lOnExtraCallback = access14000.onExtraCallback(longRef.element);
        int i6 = onExtraCallback + 3;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return lOnExtraCallback;
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return fOnNavigationEvent;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, List list, getOptionsView getoptionsview, setTaggedAddrCtrl settaggedaddrctrl, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Object[] objArr = {Integer.valueOf(i), list, getoptionsview, settaggedaddrctrl, audioRestrictionControllerImplExternalSyntheticLambda0};
        return (Unit) onExtraCallbackWithResult(2013159783, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -2013159781);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        return onExtraCallbackWithResult(426214556, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -426214553);
    }

    public static /* synthetic */ Unit onExtraCallback(getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(-1376729933, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, new Object[]{getstreamsharingchildren, onextracallbackwithresult}, 1376729938);
    }

    public static /* synthetic */ getOptionsView IAuthTabCallback(getOptionsView.onNavigationEvent onnavigationevent, getOptionsView.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, float f) {
        Object[] objArr = {onnavigationevent, onextracallbackwithresult, Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f)};
        return (getOptionsView) onExtraCallbackWithResult(1218243171, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1218243165);
    }

    private static final removeObserverLocked IAuthTabCallback(boolean z, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        Object[] objArr = {Boolean.valueOf(z), Float.valueOf(f), sessionProcessorCaptureCallback};
        return (removeObserverLocked) onExtraCallbackWithResult(715809620, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -715809620);
    }

    private static final Object onExtraCallbackWithResult(access13800<? super Long> access13800Var) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzgc.onExtraCallbackWithResult();
        return onExtraCallbackWithResult(-933574984, zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, new Object[]{access13800Var}, 933574985);
    }

    private static final Unit onWarmupCompleted(Ref.LongRef longRef, long j) {
        Object[] objArr = {longRef, Long.valueOf(j)};
        return (Unit) onExtraCallbackWithResult(-101408362, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, 101408366);
    }

    public static final getOptionsView onWarmupCompleted(@Nullable getOptionsView.onNavigationEvent onnavigationevent, @Nullable getOptionsView.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {onnavigationevent, onextracallbackwithresult, Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        return (getOptionsView) onExtraCallbackWithResult(1129917488, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), objArr, -1129917481);
    }
}
