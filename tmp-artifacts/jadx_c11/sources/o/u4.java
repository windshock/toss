package o;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u4 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallbackWithResult;

    public u4(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Function0<Unit> function03;
        setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        boolean z3;
        u4 u4Var;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i3 & 2) != 0) {
            int i5 = IAuthTabCallback + 47;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                onnavigationeventOnExtraCallbackWithResult.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        Function0<Unit> function04 = (i3 & 4) != 0 ? null : function0;
        if ((i3 & 8) != 0) {
            int i6 = IAuthTabCallback + 117;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            function03 = null;
        } else {
            function03 = function02;
        }
        setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted = (i3 & 16) != 0 ? null : onextracallback;
        if ((i3 & 32) != 0) {
            int i8 = IAuthTabCallback + 105;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            onwarmupcompletedIAuthTabCallback = null;
        } else {
            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
        }
        setCallToAction.IAuthTabCallback iAuthTabCallback2 = (i3 & 64) != 0 ? null : iAuthTabCallback;
        onnavigationeventOnExtraCallbackWithResult = (i3 & 128) == 0 ? onnavigationevent : null;
        boolean z4 = false;
        if ((i3 & 256) != 0) {
            int i10 = onWarmupCompleted + 43;
            IAuthTabCallback = i10 % 128;
            z3 = i10 % 2 != 0;
        } else {
            z3 = z;
        }
        if ((i3 & 512) != 0) {
            int i11 = onWarmupCompleted + 59;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z4 = z2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(6136091, i, i2, "im.toss.tds.compose.component.compound.bottomcta.v1.CtaPreset.Button (CtaPreset.kt:33)");
        }
        setCallToAction.onExtraCallbackWithResult onextracallbackwithresult = (setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback());
        setBody setbody = setBody.onExtraCallback;
        if (onwarmupcompletedIAuthTabCallback == null) {
            onwarmupcompletedIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        }
        if (onextracallbackOnWarmupCompleted == null) {
            onextracallbackOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        }
        setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted = setbody.onWarmupCompleted(onwarmupcompletedIAuthTabCallback, onextracallbackOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 384, 0);
        if (onnavigationeventOnExtraCallbackWithResult == null) {
            onnavigationeventOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            int i13 = onWarmupCompleted + 55;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        setCallToAction.onNavigationEvent onnavigationevent2 = onnavigationeventOnExtraCallbackWithResult;
        if (iAuthTabCallback2 == null) {
            iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            u4Var = this;
        } else {
            u4Var = this;
            iAuthTabCallbackOnExtraCallback = iAuthTabCallback2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getMaxSize.onExtraCallbackWithResult(u4Var.onNavigationEvent(quirksExternalSyntheticBackport02), "tds_bottom_cta_v1_cta_button");
        int i15 = i << 9;
        setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallback, setclickdestinationbackupuriOnWarmupCompleted, onnavigationevent2, function04, function03, null, Boolean.valueOf(z3), Boolean.valueOf(z4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 1879048192) | (i15 & 3670016) | (i & 14) | (458752 & i15) | (234881024 & i)), 128}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z3;
        Function0<Unit> function03;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 125;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote, "");
            if ((i2 & 1) != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted = (i2 & 2) == 0 ? setBody.onExtraCallback.onWarmupCompleted(null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 3) : setclickdestinationbackupuri;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = (i2 & 4) == 0 ? setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult() : iAuthTabCallback;
            setCallToAction.onNavigationEvent onnavigationevent2 = (i2 & 8) == 0 ? setCallToAction.onNavigationEvent.Block : onnavigationevent;
            boolean z4 = (i2 & 16) == 0 ? true : z;
            if ((i2 & 32) == 0) {
                int i5 = IAuthTabCallback + 23;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z3 = false;
            } else {
                z3 = z2;
            }
            Function0<Unit> function04 = (i2 & 64) == 0 ? null : function0;
            if ((i2 & 128) == 0) {
                int i7 = IAuthTabCallback + 19;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                function03 = null;
            } else {
                function03 = function02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 119;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-874905960, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.CtaPreset.Button (CtaPreset.kt:66)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-874905960, i, -1, "im.toss.tds.compose.component.compound.bottomcta.v1.CtaPreset.Button (CtaPreset.kt:66)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getMaxSize.onExtraCallbackWithResult(onNavigationEvent(quirksExternalSyntheticBackport02), "tds_bottom_cta_v1_cta_button");
            int i10 = i << 3;
            int i11 = i >> 6;
            int i12 = i << 9;
            setAdvertiser.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, iAuthTabCallbackOnExtraCallbackWithResult, setclickdestinationbackupuriOnWarmupCompleted, onnavigationevent2, function04, function03, null, z4, z3, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i12 & 234881024) | (i & 7168) | ((i >> 3) & 112) | (i10 & 896) | (57344 & i11) | (i11 & 458752) | (29360128 & i12) | (i10 & 1879048192), 64);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onWarmupCompleted + 117;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getMaxSize.onExtraCallbackWithResult(onNavigationEvent(quirksExternalSyntheticBackport02), "tds_bottom_cta_v1_cta_button");
        int i102 = i << 3;
        int i112 = i >> 6;
        int i122 = i << 9;
        setAdvertiser.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, iAuthTabCallbackOnExtraCallbackWithResult, setclickdestinationbackupuriOnWarmupCompleted, onnavigationevent2, function04, function03, null, z4, z3, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i122 & 234881024) | (i & 7168) | ((i >> 3) & 112) | (i102 & 896) | (57344 & i112) | (i112 & 458752) | (29360128 & i122) | (i102 & 1879048192), 64);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
    }

    private final QuirksExternalSyntheticBackport0 onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        if (this.onExtraCallbackWithResult) {
            quirksExternalSyntheticBackport0 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            int i2 = IAuthTabCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return quirksExternalSyntheticBackport0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
            }
            return true;
        }
        if (obj instanceof u4) {
            return this.onExtraCallbackWithResult == ((u4) obj).onExtraCallbackWithResult;
        }
        int i4 = IAuthTabCallback + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }
}
