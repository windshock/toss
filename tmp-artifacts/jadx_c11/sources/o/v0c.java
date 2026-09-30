package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.v0c;
import o.v2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v0c {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = onExtraCallback + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, boolean z2, boolean z3, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, z, z2, z3, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 71;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setContentInsetsRelative setcontentinsetsrelative, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, v2.onNavigationEvent onnavigationevent, boolean z2, FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 7;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setcontentinsetsrelative, quirksExternalSyntheticBackport0, z, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, z2, onnavigationevent2, getbacktracenote, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 57;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 14 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(v2.onWarmupCompleted onwarmupcompleted, v2.IAuthTabCallback iAuthTabCallback, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, setContentInsetsRelative setcontentinsetsrelative, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 107;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return (Unit) onNavigationEvent(new Object[]{onwarmupcompleted, iAuthTabCallback, onextracallback, iAuthTabCallbackDefault, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), onnavigationevent, iAuthTabCallback_Parcel, setcontentinsetsrelative, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -364115861, 364115862, PushInfo.Companion.onExtraCallback());
        }
        int i7 = 18 / 0;
        return (Unit) onNavigationEvent(new Object[]{onwarmupcompleted, iAuthTabCallback, onextracallback, iAuthTabCallbackDefault, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), onnavigationevent, iAuthTabCallback_Parcel, setcontentinsetsrelative, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -364115861, 364115862, PushInfo.Companion.onExtraCallback());
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        v2.IAuthTabCallback iAuthTabCallback = (v2.IAuthTabCallback) objArr[1];
        v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) objArr[2];
        v2.onExtraCallback onextracallback = (v2.onExtraCallback) objArr[3];
        v2.IAuthTabCallbackDefault iAuthTabCallbackDefault = (v2.IAuthTabCallbackDefault) objArr[4];
        v2.onNavigationEvent onnavigationevent = (v2.onNavigationEvent) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[8]).booleanValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int iIntValue2 = ((Number) objArr[11]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        ((Number) objArr[13]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, zBooleanValue, zBooleanValue2, zBooleanValue3, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -2140748402, 2140748402, iOnExtraCallback2);
        int i5 = onExtraCallback + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(setContentInsetsRelative setcontentinsetsrelative, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, v2.onNavigationEvent onnavigationevent, boolean z2, FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(setcontentinsetsrelative, quirksExternalSyntheticBackport0, z, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, z2, onnavigationevent2, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 91;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        v2.onWarmupCompleted onwarmupcompleted = (v2.onWarmupCompleted) objArr[0];
        v2.IAuthTabCallback iAuthTabCallback = (v2.IAuthTabCallback) objArr[1];
        v2.onExtraCallback onextracallback = (v2.onExtraCallback) objArr[2];
        v2.IAuthTabCallbackDefault iAuthTabCallbackDefault = (v2.IAuthTabCallbackDefault) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[6];
        boolean zBooleanValue2 = ((Boolean) objArr[7]).booleanValue();
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent = (FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent) objArr[8];
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel = (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) objArr[9];
        setContentInsetsRelative setcontentinsetsrelative = (setContentInsetsRelative) objArr[10];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[15];
        ((Number) objArr[16]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(onwarmupcompleted, iAuthTabCallback, onextracallback, iAuthTabCallbackDefault, zBooleanValue, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, zBooleanValue2, onnavigationevent, iAuthTabCallback_Parcel, setcontentinsetsrelative, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i4 | i);
        int i12 = (~(i | i4)) | (~(i7 | i9)) | i8;
        int i13 = i4 + i5 + i6 + ((-1422066268) * i3) + ((-2108786386) * i2);
        int i14 = i13 * i13;
        int i15 = ((-1583913924) * i4) + 967573504 + (322476998 * i5) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i6) + ((-1298137088) * i3) + (1722810368 * i2) + (518782976 * i14);
        int i16 = (i4 * 793895740) + 1353643607 + (i5 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (i6 * 793896001) + (i3 * 692483748) + (i2 * (-1016611666)) + (i14 * 166461440);
        int i17 = i15 + (i16 * i16 * 1997799424);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 11;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, boolean z2, boolean z3, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 63;
        onNavigationEvent = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, z, z2, z3, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, z, z2, z3, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 19;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, v2.onNavigationEvent onnavigationevent, boolean z, boolean z2, boolean z3, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
            int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
            return (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1776798644, -1776798641, iOnExtraCallback2);
        }
        Object[] objArr2 = {quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, v2.onWarmupCompleted onwarmupcompleted, v2.IAuthTabCallback iAuthTabCallback, v2.onExtraCallback onextracallback, boolean z2, getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallbackDefault, z, onwarmupcompleted, iAuthTabCallback, onextracallback, z2, getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        int i6 = onNavigationEvent + 71;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(v2.IAuthTabCallback iAuthTabCallback, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132 A[PHI: r6
      0x0132: PHI (r6v23 int) = (r6v2 int), (r6v7 int), (r6v8 int) binds: [B:96:0x0130, B:106:0x0151, B:105:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final setContentInsetsRelative setcontentinsetsrelative, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @Nullable v2.IAuthTabCallback iAuthTabCallback, @Nullable v2.onWarmupCompleted onwarmupcompleted, @Nullable v2.onExtraCallback onextracallback, @Nullable v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable v2.onNavigationEvent onnavigationevent, boolean z2, @Nullable FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent2, @NotNull final getBacktraceNote<? super v0b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iOrdinal;
        int i12;
        int i13;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z4;
        final v2.IAuthTabCallback iAuthTabCallback2;
        final v2.onWarmupCompleted onwarmupcompleted2;
        final v2.onExtraCallback onextracallback2;
        final v2.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final v2.onNavigationEvent onnavigationevent3;
        final boolean z5;
        final FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        v2.onExtraCallback onextracallback3;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onNavigationEvent2;
        v2.IAuthTabCallbackDefault iAuthTabCallbackDefault3;
        v2.onWarmupCompleted onwarmupcompleted3;
        v2.onNavigationEvent onnavigationevent5;
        v2.IAuthTabCallback iAuthTabCallback3;
        v2.onExtraCallback onextracallback4;
        boolean z7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i14;
        int i15 = 2 % 2;
        int i16 = onNavigationEvent + 55;
        onExtraCallback = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(setcontentinsetsrelative, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1754754754);
        if ((i & 6) == 0) {
            int i18 = onExtraCallback + 67;
            onNavigationEvent = i18 % 128;
            if (i18 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative)) {
                int i19 = onExtraCallback + 27;
                onNavigationEvent = i19 % 128;
                i14 = i19 % 2 != 0 ? 5 : 4;
            } else {
                i14 = 2;
            }
            i4 = i14 | i;
        } else {
            int i20 = onExtraCallback + 25;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                    int i23 = onNavigationEvent + 23;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 16384 : 8192;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback == null ? -1 : onextracallback.ordinal()) ? 131072 : 65536;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    int i25 = onNavigationEvent + 91;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallbackDefault == null ? -1 : iAuthTabCallbackDefault.ordinal()) ? 1048576 : 524288;
                }
                i11 = i3 & 128;
                int i26 = 12582912;
                if (i11 != 0) {
                    i4 |= i26;
                } else if ((12582912 & i) == 0) {
                    if (onnavigationevent == null) {
                        int i27 = onExtraCallback + 61;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        iOrdinal = -1;
                    } else {
                        iOrdinal = onnavigationevent.ordinal();
                    }
                    i26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 8388608 : 4194304;
                    i4 |= i26;
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                    if ((100663296 & i) == 0) {
                        i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent2)) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i13 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2);
                    } else {
                        i13 = i2;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        int i29 = onExtraCallback + 29;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        z3 = (i13 & 3) != 2;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        z4 = z;
                        iAuthTabCallback2 = iAuthTabCallback;
                        onwarmupcompleted2 = onwarmupcompleted;
                        onextracallback2 = onextracallback;
                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                        onnavigationevent3 = onnavigationevent;
                        z5 = z2;
                        onnavigationevent4 = onnavigationevent2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                        if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            if (i22 != 0) {
                                int i31 = onExtraCallback + 119;
                                onNavigationEvent = i31 % 128;
                                int i32 = i31 % 2;
                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                            } else {
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            }
                            z6 = i6 == 0 ? z : true;
                            v2.IAuthTabCallback iAuthTabCallback4 = i7 != 0 ? v2.IAuthTabCallback.Select : iAuthTabCallback;
                            v2.onWarmupCompleted onwarmupcompleted4 = i8 != 0 ? v2.onWarmupCompleted.Medium : onwarmupcompleted;
                            if (i9 != 0) {
                                int i33 = onExtraCallback + 105;
                                onNavigationEvent = i33 % 128;
                                if (i33 % 2 != 0) {
                                    onextracallback3 = v2.onExtraCallback.Pill;
                                    int i34 = 36 / 0;
                                } else {
                                    onextracallback3 = v2.onExtraCallback.Pill;
                                }
                            } else {
                                onextracallback3 = onextracallback;
                            }
                            v2.IAuthTabCallbackDefault iAuthTabCallbackDefault4 = i10 != 0 ? v2.IAuthTabCallbackDefault.Fill : iAuthTabCallbackDefault;
                            v2.onNavigationEvent onnavigationevent6 = i11 != 0 ? v2.onNavigationEvent.Medium : onnavigationevent;
                            boolean z8 = i12 == 0 ? z2 : false;
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                                iAuthTabCallbackDefault3 = iAuthTabCallbackDefault4;
                                onwarmupcompleted3 = onwarmupcompleted4;
                                onnavigationevent5 = onnavigationevent6;
                                onNavigationEvent2 = v2a.onNavigationEvent.onNavigationEvent(onextracallback3);
                            } else {
                                onNavigationEvent2 = onnavigationevent2;
                                iAuthTabCallbackDefault3 = iAuthTabCallbackDefault4;
                                onwarmupcompleted3 = onwarmupcompleted4;
                                onnavigationevent5 = onnavigationevent6;
                            }
                            iAuthTabCallback3 = iAuthTabCallback4;
                            onextracallback4 = onextracallback3;
                            z7 = z8;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                            z6 = z;
                            iAuthTabCallback3 = iAuthTabCallback;
                            onwarmupcompleted3 = onwarmupcompleted;
                            onextracallback4 = onextracallback;
                            iAuthTabCallbackDefault3 = iAuthTabCallbackDefault;
                            onnavigationevent5 = onnavigationevent;
                            z7 = z2;
                            onNavigationEvent2 = onnavigationevent2;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1754754754, i4, i13, "im.toss.tds.compose.component.compound.chip.TdsChipV1 (TdsChipV1.kt:82)");
                        }
                        int i35 = i4 >> 12;
                        int i36 = i35 & 14;
                        int i37 = i4 >> 9;
                        int i38 = i4 << 15;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        v2.onWarmupCompleted onwarmupcompleted5 = onwarmupcompleted3;
                        onWarmupCompleted(onwarmupcompleted3, iAuthTabCallback3, onextracallback4, iAuthTabCallbackDefault3, z7, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onnavigationevent5.m104getSizeD9Ej5fM(), 0.0f, 2, (Object) null), quirksExternalSyntheticBackport04, z6, onNavigationEvent2, v2a.onNavigationEvent.onExtraCallbackWithResult(onwarmupcompleted3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i36 | 48), setcontentinsetsrelative, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult2, ((i4 >> 3) & 234881024) | (i37 & 7168) | i36 | ((i4 >> 6) & 112) | (i37 & 896) | (i35 & 57344) | (3670016 & i38) | (29360128 & i38), (i4 & 14) | ((i13 << 3) & 112), 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onwarmupcompleted2 = onwarmupcompleted5;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        z4 = z6;
                        iAuthTabCallback2 = iAuthTabCallback3;
                        onextracallback2 = onextracallback4;
                        iAuthTabCallbackDefault2 = iAuthTabCallbackDefault3;
                        onnavigationevent3 = onnavigationevent5;
                        z5 = z7;
                        onnavigationevent4 = onNavigationEvent2;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                int i39 = 2 % 2;
                                int i40 = IAuthTabCallback + 119;
                                onWarmupCompleted = i40 % 128;
                                int i41 = i40 % 2;
                                Unit unitIAuthTabCallback = v0c.IAuthTabCallback(setcontentinsetsrelative, quirksExternalSyntheticBackport02, z4, iAuthTabCallback2, onwarmupcompleted2, onextracallback2, iAuthTabCallbackDefault2, onnavigationevent3, z5, onnavigationevent4, getbacktracenote, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i42 = onWarmupCompleted + 119;
                                IAuthTabCallback = i42 % 128;
                                if (i42 % 2 != 0) {
                                    int i43 = 91 / 0;
                                }
                                return unitIAuthTabCallback;
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 100663296;
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            int i262 = 12582912;
            if (i11 != 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        int i2622 = 12582912;
        if (i11 != 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0181 A[PHI: r9
      0x0181: PHI (r9v8 int) = (r9v7 int), (r9v30 int), (r9v31 int) binds: [B:111:0x0164, B:120:0x017f, B:119:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable v2.IAuthTabCallback iAuthTabCallback, @Nullable v2.onWarmupCompleted onwarmupcompleted, @Nullable v2.onExtraCallback onextracallback, @Nullable v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, @Nullable v2.onNavigationEvent onnavigationevent, boolean z, boolean z2, boolean z3, @NotNull final getBacktraceNote<? super v0b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final v2.IAuthTabCallback iAuthTabCallback2;
        final v2.onWarmupCompleted onwarmupcompleted2;
        final v2.onExtraCallback onextracallback2;
        final v2.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final v2.onNavigationEvent onnavigationevent2;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        v2.IAuthTabCallback iAuthTabCallback3;
        v2.onExtraCallback onextracallback3;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1980407638);
        int i12 = i2 & 1;
        if (i12 != 0) {
            int i13 = onExtraCallback + 3;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        Object obj = null;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i16 = onExtraCallback + 39;
            onNavigationEvent = i16 % 128;
            if (i16 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal())) {
                i4 = 16;
            } else {
                int i17 = onNavigationEvent + 73;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                i4 = 32;
            }
            i3 |= i4;
        }
        int i19 = i2 & 4;
        if (i19 != 0) {
            int i20 = onExtraCallback + 9;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 256 : 128;
        }
        int i22 = i2 & 8;
        if (i22 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback == null ? -1 : onextracallback.ordinal())) {
                int i23 = onExtraCallback + 93;
                onNavigationEvent = i23 % 128;
                i5 = i23 % 2 != 0 ? 120 : 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        int i24 = i2 & 16;
        if (i24 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallbackDefault == null ? -1 : iAuthTabCallbackDefault.ordinal()) ? 16384 : 8192;
        }
        int i25 = i2 & 32;
        if (i25 != 0) {
            i6 = 196608;
        } else {
            if ((i & 196608) == 0) {
                if (onnavigationevent == null) {
                    int i26 = onExtraCallback + 75;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    iOrdinal = -1;
                } else {
                    iOrdinal = onnavigationevent.ordinal();
                }
                i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 131072 : 65536;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                        int i28 = onExtraCallback + 111;
                        onNavigationEvent = i28 % 128;
                        if (i28 % 2 != 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 256;
                int i29 = 100663296;
                if (i10 != 0) {
                    i3 |= i29;
                } else if ((100663296 & i) == 0) {
                    int i30 = onExtraCallback + 121;
                    onNavigationEvent = i30 % 128;
                    if (i30 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    i29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 67108864 : 33554432;
                    i3 |= i29;
                }
                if ((805306368 & i) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 536870912 : 268435456;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    if (i15 != 0) {
                        int i31 = onNavigationEvent + 121;
                        onExtraCallback = i31 % 128;
                        int i32 = i31 % 2;
                        iAuthTabCallback3 = v2.IAuthTabCallback.Select;
                    } else {
                        iAuthTabCallback3 = iAuthTabCallback;
                    }
                    v2.onWarmupCompleted onwarmupcompleted3 = i19 != 0 ? v2.onWarmupCompleted.Medium : onwarmupcompleted;
                    if (i22 != 0) {
                        int i33 = onNavigationEvent + 39;
                        onExtraCallback = i33 % 128;
                        int i34 = i33 % 2;
                        onextracallback3 = v2.onExtraCallback.Pill;
                    } else {
                        onextracallback3 = onextracallback;
                    }
                    v2.IAuthTabCallbackDefault iAuthTabCallbackDefault3 = i24 != 0 ? v2.IAuthTabCallbackDefault.Fill : iAuthTabCallbackDefault;
                    v2.onNavigationEvent onnavigationevent3 = i25 != 0 ? v2.onNavigationEvent.Medium : onnavigationevent;
                    boolean z7 = i7 != 0 ? true : z;
                    boolean z8 = i8 != 0 ? false : z2;
                    boolean z9 = i10 == 0 ? z3 : false;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1980407638, i3, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1 (TdsChipV1.kt:111)");
                    }
                    float fM104getSizeD9Ej5fM = onnavigationevent3.m104getSizeD9Ej5fM();
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    onExtraCallback(z9 ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(fM104getSizeD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, (Object) null) : CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(fM104getSizeD9Ej5fM, 0.0f, 2, (Object) null), quirksExternalSyntheticBackport03, iAuthTabCallback3, onwarmupcompleted3, onextracallback3, iAuthTabCallbackDefault3, z7, z8, z9, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 524272) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3), 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    z6 = z9;
                    iAuthTabCallback2 = iAuthTabCallback3;
                    onwarmupcompleted2 = onwarmupcompleted3;
                    onextracallback2 = onextracallback3;
                    iAuthTabCallbackDefault2 = iAuthTabCallbackDefault3;
                    onnavigationevent2 = onnavigationevent3;
                    z4 = z7;
                    z5 = z8;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    iAuthTabCallback2 = iAuthTabCallback;
                    onwarmupcompleted2 = onwarmupcompleted;
                    onextracallback2 = onextracallback;
                    iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                    onnavigationevent2 = onnavigationevent;
                    z4 = z;
                    z5 = z2;
                    z6 = z3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda3
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i35 = 2 % 2;
                            int i36 = onWarmupCompleted + 9;
                            onExtraCallback = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitOnNavigationEvent = v0c.onNavigationEvent(quirksExternalSyntheticBackport02, iAuthTabCallback2, onwarmupcompleted2, onextracallback2, iAuthTabCallbackDefault2, onnavigationevent2, z4, z5, z6, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i38 = onExtraCallback + 117;
                            onWarmupCompleted = i38 % 128;
                            int i39 = i38 % 2;
                            return unitOnNavigationEvent;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i10 = i2 & 256;
            int i292 = 100663296;
            if (i10 != 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i3 |= i6;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i10 = i2 & 256;
        int i2922 = 100663296;
        if (i10 != 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0 A[PHI: r7
      0x00f0: PHI (r7v2 int) = (r7v1 int), (r7v12 int), (r7v13 int) binds: [B:68:0x00d7, B:78:0x00ee, B:77:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable v2.IAuthTabCallback iAuthTabCallback, @Nullable v2.onWarmupCompleted onwarmupcompleted, @Nullable v2.onExtraCallback onextracallback, @Nullable v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, boolean z2, boolean z3, @NotNull final getBacktraceNote<? super v0b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final v2.IAuthTabCallback iAuthTabCallback2;
        final v2.onWarmupCompleted onwarmupcompleted2;
        final v2.onExtraCallback onextracallback2;
        final v2.IAuthTabCallbackDefault iAuthTabCallbackDefault2;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        setContentInsetsRelative setcontentinsetsrelative;
        v2.onExtraCallback onextracallback3;
        boolean z7;
        boolean z8;
        setContentInsetsRelative setcontentinsetsrelative2;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1528040687);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            int i14 = onExtraCallback + 5;
            onNavigationEvent = i14 % 128;
            i3 = i14 % 2 != 0 ? i3 | 78 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                int i15 = onNavigationEvent + 15;
                onExtraCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback == null ? -1 : iAuthTabCallback.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted == null ? -1 : onwarmupcompleted.ordinal()) ? 2048 : 1024;
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                int i16 = onExtraCallback + 47;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback == null ? -1 : onextracallback.ordinal()) ? 16384 : 8192;
            }
            i7 = i2 & 32;
            int i18 = 196608;
            if (i7 != 0) {
                i3 |= i18;
            } else if ((196608 & i) == 0) {
                i18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallbackDefault == null ? -1 : iAuthTabCallbackDefault.ordinal()) ? 131072 : 65536;
                i3 |= i18;
            }
            i8 = i2 & 64;
            if (i8 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
            }
            i9 = i2 & 128;
            if (i9 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                int i19 = onExtraCallback + 25;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ^ true) ? 8388608 : 4194304;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    int i20 = onExtraCallback + 113;
                    onNavigationEvent = i20 % 128;
                    if (i20 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3);
                        throw null;
                    }
                    i11 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 67108864 : 33554432) | i3;
                }
                if ((805306368 & i) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 536870912 : 268435456;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i11) != 306783378, i11 & 1)) {
                    if (i13 != 0) {
                        int i21 = onExtraCallback + 61;
                        onNavigationEvent = i21 % 128;
                        if (i21 % 2 != 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    }
                    v2.IAuthTabCallback iAuthTabCallback3 = i4 != 0 ? v2.IAuthTabCallback.Select : iAuthTabCallback;
                    v2.onWarmupCompleted onwarmupcompleted3 = i5 != 0 ? v2.onWarmupCompleted.Medium : onwarmupcompleted;
                    if (i6 != 0) {
                        int i22 = onNavigationEvent + 109;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 == 0) {
                            v2.onExtraCallback onextracallback5 = v2.onExtraCallback.Pill;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        onextracallback3 = v2.onExtraCallback.Pill;
                        setcontentinsetsrelative = null;
                    } else {
                        setcontentinsetsrelative = null;
                        onextracallback3 = onextracallback;
                    }
                    v2.IAuthTabCallbackDefault iAuthTabCallbackDefault3 = i7 != 0 ? v2.IAuthTabCallbackDefault.Fill : iAuthTabCallbackDefault;
                    if (i8 != 0) {
                        int i23 = onExtraCallback + 41;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        z7 = true;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        int i25 = onExtraCallback + 125;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        z8 = false;
                    } else {
                        z8 = z2;
                    }
                    boolean z9 = i10 != 0 ? false : z3;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1528040687, i11, -1, "im.toss.tds.compose.component.compound.chip.TdsChipV1 (TdsChipV1.kt:138)");
                    }
                    v2a v2aVar = v2a.onNavigationEvent;
                    FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onNavigationEvent2 = v2aVar.onNavigationEvent(onextracallback3);
                    int i27 = i11 >> 9;
                    int i28 = i27 & 14;
                    FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelOnExtraCallbackWithResult = v2aVar.onExtraCallbackWithResult(onwarmupcompleted3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i28 | 48);
                    if (!z9) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-431688764);
                        setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setcontentinsetsrelative2 = setcontentinsetsrelativeIAuthTabCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-497460242);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setcontentinsetsrelative2 = setcontentinsetsrelative;
                    }
                    int i29 = i11 >> 6;
                    int i30 = i11 << 15;
                    v2.onExtraCallback onextracallback6 = onextracallback3;
                    setContentInsetsRelative setcontentinsetsrelative3 = setcontentinsetsrelative2;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    v2.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted3;
                    onWarmupCompleted(onwarmupcompleted3, iAuthTabCallback3, onextracallback3, iAuthTabCallbackDefault3, z8, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport03, z7, onNavigationEvent2, iAuthTabCallback_ParcelOnExtraCallbackWithResult, setcontentinsetsrelative3, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult2, (i29 & 7168) | ((i11 >> 3) & 112) | i28 | (i29 & 896) | (57344 & i27) | (458752 & i30) | (i30 & 3670016) | ((i11 << 3) & 29360128), (i11 >> 24) & 112, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i31 = onExtraCallback + 57;
                        onNavigationEvent = i31 % 128;
                        int i32 = i31 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    iAuthTabCallbackDefault2 = iAuthTabCallbackDefault3;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    onwarmupcompleted2 = onwarmupcompleted4;
                    iAuthTabCallback2 = iAuthTabCallback3;
                    z4 = z7;
                    z5 = z8;
                    z6 = z9;
                    onextracallback2 = onextracallback6;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    iAuthTabCallback2 = iAuthTabCallback;
                    onwarmupcompleted2 = onwarmupcompleted;
                    onextracallback2 = onextracallback;
                    iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
                    z4 = z;
                    z5 = z2;
                    z6 = z3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i33 = 2 % 2;
                            int i34 = onWarmupCompleted + 1;
                            onExtraCallbackWithResult = i34 % 128;
                            int i35 = i34 % 2;
                            Unit unitOnNavigationEvent = v0c.onNavigationEvent(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, iAuthTabCallback2, onwarmupcompleted2, onextracallback2, iAuthTabCallbackDefault2, z4, z5, z6, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i36 = onWarmupCompleted + 109;
                            onExtraCallbackWithResult = i36 % 128;
                            int i37 = i36 % 2;
                            return unitOnNavigationEvent;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 100663296;
            i11 = i3;
            if ((805306368 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i11) != 306783378, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        int i182 = 196608;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i3;
        if ((805306368 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i11) != 306783378, i11 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = onNavigationEvent + 85;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741254323, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous>.<anonymous>.<anonymous> (TdsChipV1.kt:189)");
                    int i5 = 41 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741254323, iIntValue, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous>.<anonymous>.<anonymous> (TdsChipV1.kt:189)");
                }
            }
            getbacktracenote.invoke(new v0b(rowScope), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, v2.onWarmupCompleted onwarmupcompleted, v2.IAuthTabCallback iAuthTabCallback, v2.onExtraCallback onextracallback, boolean z2, final getBacktraceNote getbacktracenote, final RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 47) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = onExtraCallback + 103;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i2 & 1)) {
            int i7 = onNavigationEvent + 27;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 113;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(190623245, i2, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous>.<anonymous> (TdsChipV1.kt:181)");
                    int i10 = 71 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(190623245, i2, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous>.<anonymous> (TdsChipV1.kt:181)");
                }
            }
            v2 v2Var = v2.onExtraCallback;
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{v2Var.getInterfaceDescriptor().onExtraCallback(iAuthTabCallbackDefault), ((accessisMonitoringp) v2.onWarmupCompleted(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -667399241, new Object[]{v2Var}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 667399243)).onExtraCallback(Boolean.valueOf(z)), v2Var.IAuthTabCallbackStubProxy().onExtraCallback(onwarmupcompleted), v2Var.onTransact().onExtraCallback(iAuthTabCallback), v2Var.asInterface().onExtraCallback(onextracallback), v2Var.IAuthTabCallbackStub().onExtraCallback(Boolean.valueOf(z2))}, ForwardingCameraControl.onExtraCallback(-1741254323, true, new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda8
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 89;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        v0c.onExtraCallbackWithResult(getbacktracenote, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = v0c.onExtraCallbackWithResult(getbacktracenote, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = onNavigationEvent + 39;
                    onExtraCallback = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 8 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(v2.IAuthTabCallback iAuthTabCallback, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            int i3 = 31 / 0;
            if (iAuthTabCallback == v2.IAuthTabCallback.Select) {
                int i4 = onExtraCallback + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture);
                    throw null;
                }
                unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture);
            }
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            if (iAuthTabCallback == v2.IAuthTabCallback.Select) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        onNavigationEvent = i3 % 128;
        boolean z = true;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
            if ((i & 36) == 0) {
                int i4 = onExtraCallback + 1;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0);
                    throw null;
                }
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i5 = onNavigationEvent + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 21;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1984940061, i, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous> (TdsChipV1.kt:209)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1984940061, i, -1, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1.<anonymous> (TdsChipV1.kt:209)");
            }
            getbacktracenote.invoke(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallback + 81;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 4;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onExtraCallback + 89;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 52 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final v2.onWarmupCompleted onwarmupcompleted, @NotNull final v2.IAuthTabCallback iAuthTabCallback, @NotNull final v2.onExtraCallback onextracallback, @NotNull final v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, final boolean z, @NotNull final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, @Nullable FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent, @Nullable FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, @Nullable setContentInsetsRelative setcontentinsetsrelative, @NotNull final getBacktraceNote<? super v0b, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent2;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel2;
        int i6;
        boolean z4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setContentInsetsRelative setcontentinsetsrelative2;
        final boolean z5;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent3;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onNavigationEvent2;
        FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelOnExtraCallbackWithResult;
        setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback;
        int i7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent4;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8;
        int i9;
        ?? r8;
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability;
        FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent5;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1843713635);
        if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i11 = onExtraCallback + 15;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallbackDefault.ordinal()) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
        }
        int i13 = i3 & 64;
        Object obj = null;
        if (i13 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i14 = onExtraCallback + 15;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        int i15 = i3 & 128;
        if (i15 == 0) {
            if ((12582912 & i) == 0) {
                z3 = z2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 8388608 : 4194304;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    onnavigationevent2 = onnavigationevent;
                    int i16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent2) ? 67108864 : 33554432;
                    i4 |= i16;
                } else {
                    onnavigationevent2 = onnavigationevent;
                }
                i4 |= i16;
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                    int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback_Parcel2) ? 536870912 : 268435456;
                    i4 |= i17;
                } else {
                    iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
                }
                i4 |= i17;
            } else {
                iAuthTabCallback_Parcel2 = iAuthTabCallback_Parcel;
            }
            if ((i2 & 6) != 0) {
                i6 = i2 | (((i3 & 1024) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative)) ? 4 : 2);
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                i6 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
            }
            if ((i4 & 306783379) != 306783378) {
                int i18 = onNavigationEvent + 49;
                onExtraCallback = i18 % 128;
                z4 = i18 % 2 != 0 ? (i6 & 19) != 18 : (i6 & 18) != 11;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                setcontentinsetsrelative2 = setcontentinsetsrelative;
                z5 = z3;
                onnavigationevent3 = onnavigationevent2;
                iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 256) != 0) {
                        onNavigationEvent2 = v2a.onNavigationEvent.onNavigationEvent(onextracallback);
                        i4 &= -234881025;
                    } else {
                        onNavigationEvent2 = onnavigationevent2;
                    }
                    if ((i3 & 512) != 0) {
                        iAuthTabCallback_ParcelOnExtraCallbackWithResult = v2a.onNavigationEvent.onExtraCallbackWithResult(onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | 48);
                        i4 &= -1879048193;
                    } else {
                        iAuthTabCallback_ParcelOnExtraCallbackWithResult = iAuthTabCallback_Parcel2;
                    }
                    if ((i3 & 1024) != 0) {
                        setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                        i6 &= -15;
                    } else {
                        setcontentinsetsrelativeIAuthTabCallback = setcontentinsetsrelative;
                    }
                    iAuthTabCallback_Parcel3 = iAuthTabCallback_ParcelOnExtraCallbackWithResult;
                    setcontentinsetsrelative2 = setcontentinsetsrelativeIAuthTabCallback;
                    i7 = i4;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    boolean z9 = z3;
                    onnavigationevent4 = onNavigationEvent2;
                    i8 = i6;
                    z6 = z9;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    if ((i3 & 1024) != 0) {
                        int i19 = onExtraCallback + 83;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        i6 &= -15;
                    }
                    setcontentinsetsrelative2 = setcontentinsetsrelative;
                    i7 = i4;
                    iAuthTabCallback_Parcel3 = iAuthTabCallback_Parcel2;
                    i8 = i6;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    z6 = z3;
                    onnavigationevent4 = onnavigationevent2;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i21 = onNavigationEvent + 25;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1843713635, i7, i8, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1 (TdsChipV1.kt:169)");
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1843713635, i7, i8, "im.toss.tds.compose.component.compound.chip.BasicTdsChipV1 (TdsChipV1.kt:169)");
                }
                ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability2 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(extensionsManagerExtensionsAvailability2.ordinal());
                if ((i7 & 458752) == 131072) {
                    int i22 = onNavigationEvent + 77;
                    onExtraCallback = i22 % 128;
                    boolean z10 = i22 % 2 != 0;
                    boolean z11 = (i7 & 7168) == 2048;
                    FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent6 = onnavigationevent4;
                    if ((57344 & i7) == 16384) {
                        int i23 = onExtraCallback + 91;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i7 & 14) == 4) {
                        int i25 = onNavigationEvent + 59;
                        onExtraCallback = i25 % 128;
                        int i26 = i25 % 2;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i27 = i7;
                    boolean z12 = (i7 & 896) == 256;
                    boolean z13 = (i8 & 112) == 32;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z13 | zOnExtraCallback | z10 | z11 | z7 | z8 | z12)) {
                        int i28 = onExtraCallback + 51;
                        onNavigationEvent = i28 % 128;
                        int i29 = i28 % 2;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            i9 = i27;
                            r8 = 1;
                            final boolean z14 = z6;
                            extensionsManagerExtensionsAvailability = extensionsManagerExtensionsAvailability2;
                            objOnMinimized = getPhysicalCameraCharacteristics.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(190623245, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda4
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int i30 = 2 % 2;
                                    int i31 = onWarmupCompleted + 123;
                                    IAuthTabCallback = i31 % 128;
                                    Object obj6 = null;
                                    if (i31 % 2 == 0) {
                                        v0c.onNavigationEvent(iAuthTabCallbackDefault, z, onwarmupcompleted, iAuthTabCallback, onextracallback, z14, getbacktracenote, (RowScope) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnNavigationEvent = v0c.onNavigationEvent(iAuthTabCallbackDefault, z, onwarmupcompleted, iAuthTabCallback, onextracallback, z14, getbacktracenote, (RowScope) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    int i32 = onWarmupCompleted + 27;
                                    IAuthTabCallback = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    throw null;
                                }
                            }));
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                        } else {
                            extensionsManagerExtensionsAvailability = extensionsManagerExtensionsAvailability2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i9 = i27;
                            r8 = 1;
                        }
                        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objOnMinimized;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport03, z6 ? 1.0f : 0.5f);
                        if (setcontentinsetsrelative2 == null) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2032513946);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, deviceQuirksExternalSyntheticLambda0);
                            boolean z15 = (i9 & 112) == 32 ? r8 : false;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (z15 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda5
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj3) {
                                        int i30 = 2 % 2;
                                        int i31 = onExtraCallback + 3;
                                        onExtraCallbackWithResult = i31 % 128;
                                        Object obj4 = null;
                                        if (i31 % 2 != 0) {
                                            v0c.onWarmupCompleted(iAuthTabCallback, (useAndConfigureProgramWithTexture) obj3);
                                            throw null;
                                        }
                                        Unit unitOnWarmupCompleted = v0c.onWarmupCompleted(iAuthTabCallback, (useAndConfigureProgramWithTexture) obj3);
                                        int i32 = onExtraCallback + 11;
                                        onExtraCallbackWithResult = i32 % 128;
                                        if (i32 % 2 == 0) {
                                            return unitOnWarmupCompleted;
                                        }
                                        obj4.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                            }
                            int i30 = i9 >> 21;
                            ZslControlImplExternalSyntheticLambda2.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, false, (Function1) objOnMinimized2, (int) r8, (Object) null), onnavigationevent6, iAuthTabCallback_Parcel3, (QuirkSettingsLoader.onWarmupCompleted) null, 0, 0, ForwardingCameraControl.onExtraCallback(-1984940061, (boolean) r8, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Unit unitIAuthTabCallback;
                                    int i31 = 2 % 2;
                                    int i32 = onWarmupCompleted + 17;
                                    onExtraCallbackWithResult = i32 % 128;
                                    if (i32 % 2 != 0) {
                                        unitIAuthTabCallback = v0c.IAuthTabCallback(getbacktracenote2, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        int i33 = 65 / 0;
                                    } else {
                                        unitIAuthTabCallback = v0c.IAuthTabCallback(getbacktracenote2, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    }
                                    int i34 = onWarmupCompleted + 101;
                                    onExtraCallbackWithResult = i34 % 128;
                                    int i35 = i34 % 2;
                                    return unitIAuthTabCallback;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, (i30 & 112) | 1572864 | (i30 & 896), 56);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            onnavigationevent5 = onnavigationevent6;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2032964996);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setContentInsetsAbsolute.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, deviceQuirksExternalSyntheticLambda0.IAuthTabCallback(), 0.0f, deviceQuirksExternalSyntheticLambda0.onExtraCallback(), 5, (Object) null), setcontentinsetsrelative2, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                            onnavigationevent5 = onnavigationevent6;
                            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationevent5, QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult2, (((i9 >> 21) & 112) >> 3) & 14);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                            ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability3 = extensionsManagerExtensionsAvailability;
                            float fOnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability3);
                            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) > 0) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(588471619);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallback - onnavigationevent5.IAuthTabCallback())), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(588567719);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            getbacktracenote2.invoke(rowScopeInstance, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            float fOnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0, extensionsManagerExtensionsAvailability3);
                            if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallbackWithResult, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) > 0) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(588712613);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallbackWithResult - onnavigationevent5.IAuthTabCallback())), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(588806791);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i31 = onNavigationEvent + 49;
                            onExtraCallback = i31 % 128;
                            int i32 = i31 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onnavigationevent3 = onnavigationevent5;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        z5 = z6;
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent7 = onnavigationevent3;
                final FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel4 = iAuthTabCallback_Parcel3;
                final setContentInsetsRelative setcontentinsetsrelative3 = setcontentinsetsrelative2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i33 = 2 % 2;
                        int i34 = IAuthTabCallback + 1;
                        onExtraCallback = i34 % 128;
                        int i35 = i34 % 2;
                        Unit unitOnExtraCallback = v0c.onExtraCallback(onwarmupcompleted, iAuthTabCallback, onextracallback, iAuthTabCallbackDefault, z, deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, z5, onnavigationevent7, iAuthTabCallback_Parcel4, setcontentinsetsrelative3, getbacktracenote, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i36 = onExtraCallback + 93;
                        IAuthTabCallback = i36 % 128;
                        if (i36 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 12582912;
        z3 = z2;
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-827598036);
        if (i != 0) {
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827598036, i, -1, "im.toss.tds.compose.component.compound.chip.Preview (TdsChipV1.kt:236)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827598036, i, -1, "im.toss.tds.compose.component.compound.chip.Preview (TdsChipV1.kt:236)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) v0ExternalSyntheticLambda4.onExtraCallbackWithResult.IAuthTabCallbackStub(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onExtraCallback + 107;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.chip.TdsChipV1Kt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onNavigationEvent + 73;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Integer numValueOf = Integer.valueOf(i11);
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    if (i10 != 0) {
                        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
                        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
                        return (Unit) v0c.onNavigationEvent(new Object[]{numValueOf, cameraCaptureResultEmptyCameraCaptureResult2, numValueOf2}, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -309102702, 309102704, iOnExtraCallback2);
                    }
                    int iOnExtraCallback3 = PushInfo.Companion.onExtraCallback();
                    int iOnExtraCallback4 = PushInfo.Companion.onExtraCallback();
                    Unit unit = (Unit) v0c.onNavigationEvent(new Object[]{numValueOf, cameraCaptureResultEmptyCameraCaptureResult2, numValueOf2}, iOnExtraCallback3, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -309102702, 309102704, iOnExtraCallback4);
                    int i12 = 87 / 0;
                    return unit;
                }
            });
        }
        int i8 = onNavigationEvent + 45;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -309102702, 309102704, iOnExtraCallback2);
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -2140748402, 2140748402, iOnExtraCallback2);
    }

    private static final Unit onNavigationEvent(v2.onWarmupCompleted onwarmupcompleted, v2.IAuthTabCallback iAuthTabCallback, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationevent, FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_Parcel, setContentInsetsRelative setcontentinsetsrelative, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {onwarmupcompleted, iAuthTabCallback, onextracallback, iAuthTabCallbackDefault, Boolean.valueOf(z), deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), onnavigationevent, iAuthTabCallback_Parcel, setcontentinsetsrelative, getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -364115861, 364115862, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, v2.IAuthTabCallback iAuthTabCallback, v2.onWarmupCompleted onwarmupcompleted, v2.onExtraCallback onextracallback, v2.IAuthTabCallbackDefault iAuthTabCallbackDefault, v2.onNavigationEvent onnavigationevent, boolean z, boolean z2, boolean z3, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, onwarmupcompleted, onextracallback, iAuthTabCallbackDefault, onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), getbacktracenote, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
        return (Unit) onNavigationEvent(objArr, iOnExtraCallback, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1776798644, -1776798641, iOnExtraCallback2);
    }
}
