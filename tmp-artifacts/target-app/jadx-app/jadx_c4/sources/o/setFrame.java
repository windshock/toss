package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.setCacheComposition;
import o.setFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFrame implements setFailureListener {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final String onNavigationEvent;

    private static final Unit IAuthTabCallback(setFrame setframe, RowScope rowScope, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        setframe.IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(setFrame setframe, RowScope rowScope, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(setframe, rowScope, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setframe, rowScope, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, surfaceProcessorNodeOut);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof o.setFrame) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r4.onNavigationEvent, ((o.setFrame) r5).onNavigationEvent)) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r5 = o.setFrame.onExtraCallbackWithResult + 121;
        o.setFrame.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SplitTextFieldItemText(text=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setFrame(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, SurfaceProcessorNodeOut surfaceProcessorNodeOut) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        if (surfaceProcessorNodeOut.IAuthTabCallbackDefault() > 1) {
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            long jOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor);
            RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnExtraCallbackWithResult);
            onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnExtraCallbackWithResult), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnExtraCallbackWithResult) * 0.9f));
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 25;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // o.setFailureListener
    public void IAuthTabCallback(@NotNull final RowScope rowScope, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-249682953);
        if ((i & 48) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 75;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 123;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-249682953, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextFieldItemText.Content (SplitTextFields.kt:272)");
            }
            setCacheComposition.IAuthTabCallbackStub iAuthTabCallbackStub = (setCacheComposition.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setIgnoreDisabledSystemAnimations.asBinder());
            boolean z = iAuthTabCallbackStub instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent;
            CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = iAuthTabCallbackStub.onExtraCallbackWithResult().onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i10 = onExtraCallbackWithResult + 45;
                onExtraCallback = i10 % 128;
                objOnMinimized = i10 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted).IAuthTabCallbackStub()), (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted).IAuthTabCallbackStub()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            String str = this.onNavigationEvent;
            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted), 0L, onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777213, (Object) null);
            long jAccess100 = ((setByteOrder) iAuthTabCallbackStub.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0).onNavigationEvent(((Boolean) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setIgnoreDisabledSystemAnimations.IAuthTabCallbackDefault())).booleanValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0).onExtraCallbackWithResult()).access100();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(!z ? 4.0f : 0.0f);
            int i11 = onExtraCallbackWithResult + 45;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, fIAuthTabCallback, 7, (Object) null);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.compose.v3.textfield.split.SplitTextFieldItemText$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = onWarmupCompleted + 75;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            setFrame.onNavigationEvent(getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = setFrame.onNavigationEvent(getsupportedhighspeedresolutionsfor, (SurfaceProcessorNodeOut) obj);
                        int i15 = IAuthTabCallback + 61;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            Function1 function1 = (Function1) objOnMinimized2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallback, gethumanreadablenameOnNavigationEvent, Long.valueOf(jAccess100), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, function1, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1572864, 65520}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextFieldItemText$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = IAuthTabCallback + 33;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    setFrame setframe = this.f$0;
                    if (i15 != 0) {
                        return setFrame.onExtraCallback(setframe, rowScope, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallback = setFrame.onExtraCallback(setframe, rowScope, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i16 = 66 / 0;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    private static final getHumanReadableName onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getHumanReadableName gethumanreadablename = (getHumanReadableName) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return gethumanreadablename;
    }

    private static final long onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        long jIAuthTabCallback = ((AvoidCaptureProcessProgressAvailabilityCheckQuirk) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return jIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<AvoidCaptureProcessProgressAvailabilityCheckQuirk> getsupportedhighspeedresolutionsfor, long j) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(j));
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
