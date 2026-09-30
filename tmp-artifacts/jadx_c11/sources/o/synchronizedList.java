package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.synchronizedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class synchronizedList {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(synchronizedList synchronizedlist, Object obj, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(synchronizedlist, obj, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(synchronizedList synchronizedlist, Object obj, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        synchronizedlist.onNavigationEvent(obj, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable final Object obj, @NotNull final getBacktraceNote<? super r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(837862958);
        Object obj2 = null;
        if ((i & 6) == 0) {
            int i5 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj);
                obj2.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                int i6 = onWarmupCompleted + 41;
                onExtraCallbackWithResult = i6 % 128;
                i3 = i6 % 2 != 0 ? 7 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(837862958, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.HeaderPreset.Item (TdsAgreementV4ExpandableAgreementPresets.kt:103)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(obj);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent) {
                int i7 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj2.hashCode();
                    throw null;
                }
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                getbacktracenote.invoke((r8lambda6FdWI3gCwdfToUXuRhHFsclpRbc) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i2 & 112));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.expandableagreement.HeaderPreset$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 63;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        return synchronizedList.IAuthTabCallback(this.f$0, obj, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    }
                    synchronizedList.IAuthTabCallback(this.f$0, obj, getbacktracenote, i, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    throw null;
                }
            });
        }
    }
}
