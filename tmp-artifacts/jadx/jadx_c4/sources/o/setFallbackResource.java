package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCacheComposition;
import o.setFallbackResource;
import o.setMaxFrame;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFallbackResource implements setFailureListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final List<setFailureListener> IAuthTabCallback;
    private final setMaxFrame onNavigationEvent;
    private final setMaxFrame onWarmupCompleted;

    private static final Unit onExtraCallback(setFallbackResource setfallbackresource, RowScope rowScope, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        setfallbackresource.IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 107;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setFallbackResource setfallbackresource, RowScope rowScope, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setfallbackresource, rowScope, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 41;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof setFallbackResource)) {
            int i8 = i2 + 97;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        setFallbackResource setfallbackresource = (setFallbackResource) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, setfallbackresource.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, setfallbackresource.onNavigationEvent)) {
            int i10 = onExtraCallbackWithResult + 71;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onWarmupCompleted, setfallbackresource.onWarmupCompleted))) {
            return true;
        }
        int i12 = onExtraCallback + 55;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SplitTextFieldGroup(items=" + this.IAuthTabCallback + ", horizontalWidth=" + this.onNavigationEvent + ", verticalWidth=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setFallbackResource(@NotNull List<? extends setFailureListener> list, @NotNull setMaxFrame setmaxframe, @NotNull setMaxFrame setmaxframe2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setmaxframe, "");
        Intrinsics.checkNotNullParameter(setmaxframe2, "");
        this.IAuthTabCallback = list;
        this.onNavigationEvent = setmaxframe;
        this.onWarmupCompleted = setmaxframe2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setFallbackResource(List list, setMaxFrame setmaxframe, setMaxFrame setmaxframe2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            setmaxframe2 = setmaxframe;
        }
        this(list, setmaxframe, setmaxframe2);
    }

    public final List<setFailureListener> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<setFailureListener> list = this.IAuthTabCallback;
        int i5 = i3 + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[PHI: r13
      0x0035: PHI (r13v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r13v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r13v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r13
      0x002a: PHI (r13v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r13v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r13v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.setFailureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull final RowScope rowScope, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(506335254);
            if ((i & 53) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rowScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(506335254);
            if ((i & 6) == 0) {
            }
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i5 = onExtraCallback + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 32 : 16;
        }
        int i6 = 0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 57;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(506335254, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextFieldGroup.Content (SplitTextFields.kt:303)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(506335254, i2, -1, "im.toss.compose.v3.textfield.split.SplitTextFieldGroup.Content (SplitTextFields.kt:303)");
            }
            boolean z = ((setCacheComposition.IAuthTabCallbackStub) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setIgnoreDisabledSystemAnimations.asBinder())) instanceof setCacheComposition.IAuthTabCallbackStub.onNavigationEvent;
            setMaxFrame setmaxframe = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() >= 2.0f ? this.onWarmupCompleted : this.onNavigationEvent;
            if (setmaxframe instanceof setMaxFrame.onExtraCallback) {
                int i8 = onExtraCallbackWithResult + 75;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, ((setMaxFrame.onExtraCallback) setmaxframe).onExtraCallbackWithResult());
                int i10 = onExtraCallback + 67;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            } else {
                quirksExternalSyntheticBackport0OnNavigationEvent = setmaxframe instanceof setMaxFrame.IAuthTabCallback ? rowScope.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, ((setMaxFrame.IAuthTabCallback) setmaxframe).onExtraCallback(), false) : !((setmaxframe instanceof setMaxFrame.onWarmupCompleted) ^ true) ? ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, ((setMaxFrame.onWarmupCompleted) setmaxframe).IAuthTabCallback()) : QuirksExternalSyntheticBackport0.Companion;
            }
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z ? 4.0f : 8.0f)), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i12 = onExtraCallback + 49;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    int i13 = 61 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i14 = onExtraCallback + 111;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScope rowScope2 = RowScopeInstance.onNavigationEvent;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1100853226);
            List<setFailureListener> list = this.IAuthTabCallback;
            int size = list.size();
            while (i6 < size) {
                int i15 = onExtraCallbackWithResult + 51;
                onExtraCallback = i15 % 128;
                if (i15 % 2 == 0) {
                    setFailureListener setfailurelistener = list.get(i6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1100854390);
                    setfailurelistener.IAuthTabCallback(rowScope2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 8);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i6 += 52;
                } else {
                    setFailureListener setfailurelistener2 = list.get(i6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1100854390);
                    setfailurelistener2.IAuthTabCallback(rowScope2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i6++;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 95;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.split.SplitTextFieldGroup$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i17 = 2 % 2;
                    int i18 = IAuthTabCallback + 35;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 != 0) {
                        unitOnExtraCallbackWithResult = setFallbackResource.onExtraCallbackWithResult(this.f$0, rowScope, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i19 = 22 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = setFallbackResource.onExtraCallbackWithResult(this.f$0, rowScope, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i20 = IAuthTabCallback + 1;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }
}
