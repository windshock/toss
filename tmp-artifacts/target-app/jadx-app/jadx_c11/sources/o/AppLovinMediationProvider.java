package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinMediationProvider {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ getHumanReadableName onExtraCallback(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, use useVar, delete deleteVar, getSurfaceSize getsurfacesize, String str, long j2, getHighestSurfacePriority gethighestsurfacepriority, getParentMetadataCallback getparentmetadatacallback, addCameraErrorListener addcameraerrorlistener, long j3, bindChildren bindchildren, ExifSpeedConverter exifSpeedConverter, createCameraCaptureCallback createcameracapturecallback, toChildrenConfigsMap tochildrenconfigsmap, mergeChildrenConfigs mergechildrenconfigs, r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm, getChildPreviewOutConfig getchildpreviewoutconfig, isUseCaseActive isusecaseactive, getPreviewFromChildren getpreviewfromchildren, int i, Object obj) {
        long jOnTransact;
        delete deleteVar2;
        String str2;
        long jOnNavigationEvent;
        getParentMetadataCallback getparentmetadatacallback2;
        bindChildren bindchildren2;
        ExifSpeedConverter exifSpeedConverter2;
        ExifSpeedConverter exifSpeedConverter3;
        toChildrenConfigsMap tochildrenconfigsmap2;
        mergeChildrenConfigs mergechildrenconfigs2;
        getPreviewFromChildren getpreviewfromchildren2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            jOnTransact = j;
        } else {
            int i5 = i4 + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i & 2) != 0 ? null : graphicDeviceInfo;
        use useVar2 = (i & 4) != 0 ? null : useVar;
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 31;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            deleteVar2 = null;
        } else {
            deleteVar2 = deleteVar;
        }
        getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = (i & 16) != 0 ? setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult() : getsurfacesize;
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 87;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 64) != 0) {
            int i11 = onExtraCallback + 53;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        getHighestSurfacePriority gethighestsurfacepriority2 = (i & 128) != 0 ? null : gethighestsurfacepriority;
        if ((i & 256) != 0) {
            int i13 = onWarmupCompleted + 115;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            getparentmetadatacallback2 = null;
        } else {
            getparentmetadatacallback2 = getparentmetadatacallback;
        }
        addCameraErrorListener addcameraerrorlistener2 = (i & 512) != 0 ? null : addcameraerrorlistener;
        long jOnTransact2 = (i & 1024) != 0 ? setByteOrder.Companion.onTransact() : j3;
        bindChildren bindchildren3 = (i & 2048) != 0 ? null : bindchildren;
        if ((i & 4096) != 0) {
            int i15 = onWarmupCompleted + 125;
            bindchildren2 = bindchildren3;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            exifSpeedConverter2 = null;
        } else {
            bindchildren2 = bindchildren3;
            exifSpeedConverter2 = exifSpeedConverter;
        }
        createCameraCaptureCallback createcameracapturecallback2 = (i & 8192) != 0 ? null : createcameracapturecallback;
        if ((i & 16384) != 0) {
            int i17 = onWarmupCompleted + 35;
            exifSpeedConverter3 = exifSpeedConverter2;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            tochildrenconfigsmap2 = null;
        } else {
            exifSpeedConverter3 = exifSpeedConverter2;
            tochildrenconfigsmap2 = tochildrenconfigsmap;
        }
        mergeChildrenConfigs mergechildrenconfigs3 = (32768 & i) != 0 ? null : mergechildrenconfigs;
        r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm2 = (i & 65536) != 0 ? null : r8lambdak6cwcefle9txulslgjo2burubm;
        getChildPreviewOutConfig getchildpreviewoutconfigOnExtraCallback = (i & 131072) != 0 ? AppLovinPostbackService.onExtraCallbackWithResult.onExtraCallback() : getchildpreviewoutconfig;
        isUseCaseActive isusecaseactive2 = (i & 262144) != 0 ? null : isusecaseactive;
        if ((i & 524288) != 0) {
            int i19 = onWarmupCompleted + 95;
            mergechildrenconfigs2 = mergechildrenconfigs3;
            onExtraCallback = i19 % 128;
            int i20 = i19 % 2;
            getpreviewfromchildren2 = null;
        } else {
            mergechildrenconfigs2 = mergechildrenconfigs3;
            getpreviewfromchildren2 = getpreviewfromchildren;
        }
        return onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnTransact, graphicDeviceInfo2, useVar2, deleteVar2, getsurfacesizeOnExtraCallbackWithResult, str2, jOnNavigationEvent, gethighestsurfacepriority2, getparentmetadatacallback2, addcameraerrorlistener2, jOnTransact2, bindchildren2, exifSpeedConverter3, createcameracapturecallback2, tochildrenconfigsmap2, mergechildrenconfigs2, r8lambdak6cwcefle9txulslgjo2burubm2, getchildpreviewoutconfigOnExtraCallback, isusecaseactive2, getpreviewfromchildren2);
    }

    public static final getHumanReadableName onExtraCallbackWithResult(@NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable use useVar, @Nullable delete deleteVar, @Nullable getSurfaceSize getsurfacesize, @Nullable String str, long j2, @Nullable getHighestSurfacePriority gethighestsurfacepriority, @Nullable getParentMetadataCallback getparentmetadatacallback, @Nullable addCameraErrorListener addcameraerrorlistener, long j3, @Nullable bindChildren bindchildren, @Nullable ExifSpeedConverter exifSpeedConverter, @Nullable createCameraCaptureCallback createcameracapturecallback, @Nullable toChildrenConfigsMap tochildrenconfigsmap, @Nullable mergeChildrenConfigs mergechildrenconfigs, @Nullable r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm, @Nullable getChildPreviewOutConfig getchildpreviewoutconfig, @Nullable isUseCaseActive isusecaseactive, @Nullable getPreviewFromChildren getpreviewfromchildren) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        getHumanReadableName gethumanreadablenameIAuthTabCallback = AppLovinInitProvider.IAuthTabCallback(AppLovinInitProvider.onWarmupCompleted(accessgettlsversionsasstringp, 0.0f, 1, (Object) null), j, graphicDeviceInfo, useVar, deleteVar, getsurfacesize, str, j2, gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, j3, bindchildren, exifSpeedConverter, createcameracapturecallback, tochildrenconfigsmap, mergechildrenconfigs, r8lambdak6cwcefle9txulslgjo2burubm, getchildpreviewoutconfig, isusecaseactive, getpreviewfromchildren);
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return gethumanreadablenameIAuthTabCallback;
    }

    public static final SurfaceProcessorNode onExtraCallbackWithResult(@NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        long j;
        GraphicDeviceInfo graphicDeviceInfo;
        use useVar;
        delete deleteVar;
        getSurfaceSize getsurfacesize;
        String str;
        long j2;
        getHighestSurfacePriority gethighestsurfacepriority;
        getParentMetadataCallback getparentmetadatacallback;
        addCameraErrorListener addcameraerrorlistener;
        long j3;
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
            j = 0;
            graphicDeviceInfo = null;
            useVar = null;
            deleteVar = null;
            getsurfacesize = null;
            str = null;
            j2 = 1;
            gethighestsurfacepriority = null;
            getparentmetadatacallback = null;
            addcameraerrorlistener = null;
            j3 = 1;
        } else {
            Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
            j = 0;
            graphicDeviceInfo = null;
            useVar = null;
            deleteVar = null;
            getsurfacesize = null;
            str = null;
            j2 = 0;
            gethighestsurfacepriority = null;
            getparentmetadatacallback = null;
            addcameraerrorlistener = null;
            j3 = 0;
        }
        return onExtraCallback(accessgettlsversionsasstringp, j, graphicDeviceInfo, useVar, deleteVar, getsurfacesize, str, j2, gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, j3, null, null, null, null, null, null, null, null, null, 1048575, null).isEngagementSignalsApiAvailable();
    }

    public static final long onExtraCallbackWithResult(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        Object obj = null;
        long jOnWarmupCompleted = AppLovinInitProvider.onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, AppLovinInitProvider.onWarmupCompleted(accessgettlsversionsasstringp, 0.0f, 1, (Object) null), 0.0f, 2, null);
        int i4 = onExtraCallback + 57;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return jOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }
}
