package o;

import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AvoidPostviewAvailabilityCheckQuirk;
import o.setByteOrder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdalb_N4iUVLbnWVSot7IGZUP33tOo {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    private static final float onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        int i5 = i2 + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final /* synthetic */ float onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = onNavigationEvent(f);
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SurfaceProcessorNode IAuthTabCallback(@NotNull r8lambda4tMrngQSvLENU65MlLmHwvGfT8 r8lambda4tmrngqsvlenu65mllmhwvgft8, @NotNull SurfaceProcessorNode surfaceProcessorNode, @NotNull setTaggedAddrCtrl<? super getSurfaceSize, ? super GraphicDeviceInfo, ? super use, ? super delete, ? extends Typeface> settaggedaddrctrl, @NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z) {
        int iOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda4tmrngqsvlenu65mllmhwvgft8, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorNode, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        long jOnExtraCallback = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallback(surfaceProcessorNode.IAuthTabCallbackDefault());
        AvoidPostviewAvailabilityCheckQuirk.onWarmupCompleted onwarmupcompleted = AvoidPostviewAvailabilityCheckQuirk.Companion;
        if (AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(jOnExtraCallback, onwarmupcompleted.onWarmupCompleted())) {
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setTextSize(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(surfaceProcessorNode.IAuthTabCallbackDefault()));
        } else if (AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(jOnExtraCallback, onwarmupcompleted.onNavigationEvent())) {
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setTextSize(r8lambda4tmrngqsvlenu65mllmhwvgft8.getTextSize() * AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(surfaceProcessorNode.IAuthTabCallbackDefault()));
        }
        if (IAuthTabCallback(surfaceProcessorNode)) {
            int i2 = IAuthTabCallback + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            getSurfaceSize getsurfacesizeOnTransact = surfaceProcessorNode.onTransact();
            GraphicDeviceInfo graphicDeviceInfoAccess000 = surfaceProcessorNode.access000();
            if (graphicDeviceInfoAccess000 == null) {
                graphicDeviceInfoAccess000 = GraphicDeviceInfo.Companion.onWarmupCompleted();
            }
            use useVarIAuthTabCallbackStub = surfaceProcessorNode.IAuthTabCallbackStub();
            if (useVarIAuthTabCallbackStub != null) {
                int i4 = onWarmupCompleted + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iOnWarmupCompleted = useVarIAuthTabCallbackStub.onExtraCallback();
                int i6 = onWarmupCompleted + 111;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                iOnWarmupCompleted = use.Companion.onWarmupCompleted();
            }
            use useVarIAuthTabCallback = use.IAuthTabCallback(iOnWarmupCompleted);
            delete deleteVarAccess100 = surfaceProcessorNode.access100();
            Typeface typeface = (Typeface) settaggedaddrctrl.invoke(getsurfacesizeOnTransact, graphicDeviceInfoAccess000, useVarIAuthTabCallback, delete.IAuthTabCallback(deleteVarAccess100 != null ? deleteVarAccess100.IAuthTabCallback() : delete.Companion.onWarmupCompleted()));
            if (typeface != null) {
                r8lambda4tmrngqsvlenu65mllmhwvgft8.setTypeface(typeface);
            }
        }
        if (surfaceProcessorNode.asInterface() != null) {
            int i8 = IAuthTabCallback + 37;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (!Intrinsics.areEqual(surfaceProcessorNode.asInterface(), "")) {
                r8lambda4tmrngqsvlenu65mllmhwvgft8.setFontFeatureSettings(surfaceProcessorNode.asInterface());
            }
        }
        getParentMetadataCallback getparentmetadatacallbackExtraCallbackWithResult = surfaceProcessorNode.extraCallbackWithResult();
        if (getparentmetadatacallbackExtraCallbackWithResult != null && !Intrinsics.areEqual(getparentmetadatacallbackExtraCallbackWithResult, new getParentMetadataCallback(1.0f, 0.0f))) {
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setTextScaleX(r8lambda4tmrngqsvlenu65mllmhwvgft8.getTextScaleX() * getparentmetadatacallbackExtraCallbackWithResult.IAuthTabCallback());
            r8lambda4tmrngqsvlenu65mllmhwvgft8.setTextSkewX(r8lambda4tmrngqsvlenu65mllmhwvgft8.getTextSkewX() + getparentmetadatacallbackExtraCallbackWithResult.onExtraCallbackWithResult());
        }
        r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(surfaceProcessorNode.onExtraCallback());
        r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(surfaceProcessorNode.IAuthTabCallback(), setUseCaseDetached.Companion.IAuthTabCallback(), surfaceProcessorNode.onWarmupCompleted());
        r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallback(surfaceProcessorNode.ICustomTabsCallback());
        r8lambda4tmrngqsvlenu65mllmhwvgft8.onExtraCallbackWithResult(surfaceProcessorNode.writeTypedObject());
        r8lambda4tmrngqsvlenu65mllmhwvgft8.onNavigationEvent(surfaceProcessorNode.asBinder());
        if (AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallback(surfaceProcessorNode.IAuthTabCallbackStubProxy()), onwarmupcompleted.onWarmupCompleted())) {
            int i10 = onWarmupCompleted + 59;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(surfaceProcessorNode.IAuthTabCallbackStubProxy()) != 0.0f) {
                float textSize = r8lambda4tmrngqsvlenu65mllmhwvgft8.getTextSize() * r8lambda4tmrngqsvlenu65mllmhwvgft8.getTextScaleX();
                float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(surfaceProcessorNode.IAuthTabCallbackStubProxy());
                if (textSize != 0.0f) {
                    r8lambda4tmrngqsvlenu65mllmhwvgft8.setLetterSpacing(fC_ / textSize);
                }
            } else if (AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallback(surfaceProcessorNode.IAuthTabCallbackStubProxy()), onwarmupcompleted.onNavigationEvent())) {
                int i12 = onWarmupCompleted + 93;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                r8lambda4tmrngqsvlenu65mllmhwvgft8.setLetterSpacing(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(surfaceProcessorNode.IAuthTabCallbackStubProxy()));
            }
        }
        return onExtraCallback(surfaceProcessorNode.IAuthTabCallbackStubProxy(), z, surfaceProcessorNode.onExtraCallbackWithResult(), surfaceProcessorNode.onNavigationEvent());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SurfaceProcessorNode onExtraCallback(long j, boolean z, long j2, getHighestSurfacePriority gethighestsurfacepriority) {
        boolean z2;
        boolean z3;
        long jOnTransact = j2;
        int i = 2 % 2;
        boolean z4 = z && AvoidPostviewAvailabilityCheckQuirk.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallback(j), AvoidPostviewAvailabilityCheckQuirk.Companion.onWarmupCompleted()) && AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(j) != 0.0f;
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        if (setByteOrder.onExtraCallbackWithResult(jOnTransact, onextracallbackwithresult.onTransact()) || setByteOrder.onExtraCallbackWithResult(jOnTransact, onextracallbackwithresult.IAuthTabCallbackDefault())) {
            z2 = false;
        } else {
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z2 = true;
        }
        if (gethighestsurfacepriority != null) {
            z3 = getHighestSurfacePriority.IAuthTabCallback(gethighestsurfacepriority.onWarmupCompleted(), getHighestSurfacePriority.Companion.IAuthTabCallback()) ? false : true;
        }
        if (!z4) {
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!z2 && !z3) {
                return null;
            }
        }
        long jOnNavigationEvent = !z4 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j;
        if (!z2) {
            int i6 = onWarmupCompleted + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                onextracallbackwithresult.onTransact();
                throw null;
            }
            jOnTransact = onextracallbackwithresult.onTransact();
        }
        SurfaceProcessorNode surfaceProcessorNode = new SurfaceProcessorNode(0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, jOnNavigationEvent, !z3 ? null : gethighestsurfacepriority, (getParentMetadataCallback) null, (addCameraErrorListener) null, jOnTransact, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 63103, (DefaultConstructorMarker) null);
        int i7 = IAuthTabCallback + 21;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return surfaceProcessorNode;
    }

    private static final boolean IAuthTabCallback(SurfaceProcessorNode surfaceProcessorNode) {
        int i = 2 % 2;
        if (surfaceProcessorNode.onTransact() == null && surfaceProcessorNode.IAuthTabCallbackStub() == null) {
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (surfaceProcessorNode.access000() == null) {
                return false;
            }
        }
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
