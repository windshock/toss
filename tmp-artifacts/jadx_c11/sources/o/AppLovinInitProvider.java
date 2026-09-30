package o;

import com.google.android.gms.internal.ads.zzaq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinInitProvider {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = (~i) | i7;
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~(i | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i4));
        int i15 = i4 + i5 + i3 + (783392123 * i6) + ((-786872706) * i2);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i4) + 1729888256 + (218870266 * i5) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i6) + ((-471334912) * i2) + ((-600899584) * i16);
        int i18 = (i4 * 375823119) + 1642083618 + (i5 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i3 * 375824245) + (i6 * (-117547465)) + (i2 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ long onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectionCount connectioncount, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 9;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            int i8 = IAuthTabCallback + 83;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectioncount, f);
    }

    public static final long onExtraCallback(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull connectionCount connectioncount, float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(connectioncount, "");
            return r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(connectioncount.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(), onExtraCallback(f))));
        }
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(connectioncount, "");
        r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(connectioncount.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(), onExtraCallback(f))));
        throw null;
    }

    public static /* synthetic */ long onNavigationEvent(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectionCount connectioncount, float f, InterfaceC0083handshake interfaceC0083handshake, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                InterfaceC0083handshake.Companion.IAuthTabCallback();
                throw null;
            }
            interfaceC0083handshake = InterfaceC0083handshake.Companion.IAuthTabCallback();
        }
        return onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, connectioncount, f, interfaceC0083handshake);
    }

    public static final float onWarmupCompleted(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull connectionCount connectioncount, @NotNull InterfaceC0083handshake interfaceC0083handshake) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(connectioncount, "");
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        float fOnExtraCallback = protocol.onExtraCallback(connectionCount.onExtraCallback(connectioncount, r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(), 0.0f, 2, null), interfaceC0083handshake);
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ connectionCount onWarmupCompleted(long j, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            int i5 = i4 + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        }
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f)};
        return (connectionCount) onExtraCallbackWithResult(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -539097095, objArr, 539097096, zzaq.onNavigationEvent());
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jLongValue) != 0) {
            connectionCount connectioncount = new connectionCount(AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jLongValue), fFloatValue);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return connectioncount;
        }
        connectionCount connectioncount2 = new connectionCount(accessgetTlsVersionsAsStringp.Typography5.getSize(), fFloatValue);
        int i6 = IAuthTabCallback + 121;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return connectioncount2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final connectionCount onWarmupCompleted(@NotNull accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgettlsversionsasstringp, "");
        connectionCount connectioncount = new connectionCount(accessgettlsversionsasstringp.getSize(), f);
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return connectioncount;
        }
        throw null;
    }

    public static /* synthetic */ connectionCount onWarmupCompleted(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            f = CipherSuiteCompanionORDER_BY_NAME1.onExtraCallback().onExtraCallback(accessgettlsversionsasstringp.getSize()).intValue();
            int i5 = IAuthTabCallback + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return onWarmupCompleted(accessgettlsversionsasstringp, f);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        delete deleteVar;
        long j;
        addCameraErrorListener addcameraerrorlistener;
        long jOnTransact;
        toChildrenConfigsMap tochildrenconfigsmap;
        getChildPreviewOutConfig getchildpreviewoutconfigOnExtraCallback;
        connectionCount connectioncount = (connectionCount) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[2];
        use useVar = (use) objArr[3];
        delete deleteVar2 = (delete) objArr[4];
        getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = (getSurfaceSize) objArr[5];
        String str = (String) objArr[6];
        long jLongValue2 = ((Number) objArr[7]).longValue();
        getHighestSurfacePriority gethighestsurfacepriority = (getHighestSurfacePriority) objArr[8];
        getParentMetadataCallback getparentmetadatacallback = (getParentMetadataCallback) objArr[9];
        addCameraErrorListener addcameraerrorlistener2 = (addCameraErrorListener) objArr[10];
        long jLongValue3 = ((Number) objArr[11]).longValue();
        bindChildren bindchildren = (bindChildren) objArr[12];
        ExifSpeedConverter exifSpeedConverter = (ExifSpeedConverter) objArr[13];
        createCameraCaptureCallback createcameracapturecallback = (createCameraCaptureCallback) objArr[14];
        toChildrenConfigsMap tochildrenconfigsmap2 = (toChildrenConfigsMap) objArr[15];
        mergeChildrenConfigs mergechildrenconfigs = (mergeChildrenConfigs) objArr[16];
        r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm = (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) objArr[17];
        getChildPreviewOutConfig getchildpreviewoutconfig = (getChildPreviewOutConfig) objArr[18];
        isUseCaseActive isusecaseactive = (isUseCaseActive) objArr[19];
        getPreviewFromChildren getpreviewfromchildren = (getPreviewFromChildren) objArr[20];
        int iIntValue = ((Number) objArr[21]).intValue();
        Object obj = objArr[22];
        int i = 2 % 2;
        Object obj2 = null;
        if ((iIntValue & 1) != 0) {
            int i2 = onNavigationEvent + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jLongValue = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue & 2) != 0) {
            graphicDeviceInfo = null;
        }
        if ((iIntValue & 4) != 0) {
            int i3 = onNavigationEvent + 97;
            deleteVar = deleteVar2;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            useVar = null;
        } else {
            deleteVar = deleteVar2;
        }
        delete deleteVar3 = (iIntValue & 8) != 0 ? null : deleteVar;
        if ((iIntValue & 16) != 0) {
            getsurfacesizeOnExtraCallbackWithResult = setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult();
        }
        if ((iIntValue & 32) != 0) {
            str = null;
        }
        if ((iIntValue & 64) != 0) {
            int i5 = IAuthTabCallback + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        getHighestSurfacePriority gethighestsurfacepriority2 = (iIntValue & 128) != 0 ? null : gethighestsurfacepriority;
        getParentMetadataCallback getparentmetadatacallback2 = (iIntValue & 256) != 0 ? null : getparentmetadatacallback;
        if ((iIntValue & 512) != 0) {
            int i7 = IAuthTabCallback + 41;
            j = jLongValue3;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            addcameraerrorlistener = null;
        } else {
            j = jLongValue3;
            addcameraerrorlistener = addcameraerrorlistener2;
        }
        if ((iIntValue & 1024) != 0) {
            int i8 = IAuthTabCallback + 125;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                obj2.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long j2 = jOnTransact;
        if ((iIntValue & 2048) != 0) {
            int i9 = onNavigationEvent + 97;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            bindchildren = null;
        }
        if ((iIntValue & 4096) != 0) {
            exifSpeedConverter = null;
        }
        if ((iIntValue & 8192) != 0) {
            createcameracapturecallback = null;
        }
        if ((iIntValue & 16384) != 0) {
            int i11 = IAuthTabCallback + 123;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            tochildrenconfigsmap = null;
        } else {
            tochildrenconfigsmap = tochildrenconfigsmap2;
        }
        mergeChildrenConfigs mergechildrenconfigs2 = (32768 & iIntValue) != 0 ? null : mergechildrenconfigs;
        r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm2 = (65536 & iIntValue) != 0 ? null : r8lambdak6cwcefle9txulslgjo2burubm;
        if ((131072 & iIntValue) != 0) {
            int i12 = IAuthTabCallback + 89;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            getchildpreviewoutconfigOnExtraCallback = AppLovinPostbackService.onExtraCallbackWithResult.onExtraCallback();
        } else {
            getchildpreviewoutconfigOnExtraCallback = getchildpreviewoutconfig;
        }
        return IAuthTabCallback(connectioncount, jLongValue, graphicDeviceInfo, useVar, deleteVar3, getsurfacesizeOnExtraCallbackWithResult, str, jLongValue2, gethighestsurfacepriority2, getparentmetadatacallback2, addcameraerrorlistener, j2, bindchildren, exifSpeedConverter, createcameracapturecallback, tochildrenconfigsmap, mergechildrenconfigs2, r8lambdak6cwcefle9txulslgjo2burubm2, getchildpreviewoutconfigOnExtraCallback, (262144 & iIntValue) != 0 ? null : isusecaseactive, (iIntValue & 524288) != 0 ? null : getpreviewfromchildren);
    }

    public static final getHumanReadableName IAuthTabCallback(@NotNull connectionCount connectioncount, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable use useVar, @Nullable delete deleteVar, @Nullable getSurfaceSize getsurfacesize, @Nullable String str, long j2, @Nullable getHighestSurfacePriority gethighestsurfacepriority, @Nullable getParentMetadataCallback getparentmetadatacallback, @Nullable addCameraErrorListener addcameraerrorlistener, long j3, @Nullable bindChildren bindchildren, @Nullable ExifSpeedConverter exifSpeedConverter, @Nullable createCameraCaptureCallback createcameracapturecallback, @Nullable toChildrenConfigsMap tochildrenconfigsmap, @Nullable mergeChildrenConfigs mergechildrenconfigs, @Nullable r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm, @Nullable getChildPreviewOutConfig getchildpreviewoutconfig, @Nullable isUseCaseActive isusecaseactive, @Nullable getPreviewFromChildren getpreviewfromchildren) {
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(connectioncount, "");
            RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(connectioncount.onExtraCallbackWithResult());
            throw null;
        }
        Intrinsics.checkNotNullParameter(connectioncount, "");
        long jOnNavigationEvent = RequestOptionConfigBuilderExternalSyntheticLambda0.onNavigationEvent(connectioncount.onExtraCallbackWithResult());
        int iAsInterface = createcameracapturecallback != null ? createcameracapturecallback.asInterface() : createCameraCaptureCallback.Companion.onTransact();
        int iIAuthTabCallbackDefault = tochildrenconfigsmap != null ? tochildrenconfigsmap.IAuthTabCallbackDefault() : toChildrenConfigsMap.Companion.IAuthTabCallbackStub();
        int iOnExtraCallback = isusecaseactive != null ? isusecaseactive.onExtraCallback() : isUseCaseActive.Companion.onWarmupCompleted();
        if (getpreviewfromchildren != null) {
            int i3 = onNavigationEvent + 69;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iIAuthTabCallback = getpreviewfromchildren.IAuthTabCallback();
        } else {
            iIAuthTabCallback = getPreviewFromChildren.Companion.IAuthTabCallback();
        }
        return new getHumanReadableName(j, jOnNavigationEvent, graphicDeviceInfo, useVar, deleteVar, getsurfacesize, str, j2, gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, j3, bindchildren, exifSpeedConverter, (hasMoreElements) null, iAsInterface, iIAuthTabCallbackDefault, 0L, mergechildrenconfigs, r8lambdak6cwcefle9txulslgjo2burubm, getchildpreviewoutconfig, iOnExtraCallback, iIAuthTabCallback, (notifySessionStop) null, 8536064, (DefaultConstructorMarker) null);
    }

    private static final float onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f, VirtualCameraControlExternalSyntheticLambda1.Companion.onNavigationEvent())) {
            int i4 = onNavigationEvent + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return Float.MAX_VALUE;
        }
        if (!Float.isNaN(f)) {
            return f;
        }
        int i6 = onNavigationEvent + 27;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return Float.NaN;
        }
        throw null;
    }

    public static final long onWarmupCompleted(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull connectionCount connectioncount, float f, @NotNull InterfaceC0083handshake interfaceC0083handshake) {
        float fOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
            Intrinsics.checkNotNullParameter(connectioncount, "");
            Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
            r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent();
            Float.isNaN(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f).IAuthTabCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(connectioncount, "");
        Intrinsics.checkNotNullParameter(interfaceC0083handshake, "");
        float fOnNavigationEvent2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent();
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f);
        if (Float.isNaN(virtualCameraControlExternalSyntheticLambda1OnNavigationEvent.IAuthTabCallback())) {
            int i3 = onNavigationEvent + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            virtualCameraControlExternalSyntheticLambda1 = virtualCameraControlExternalSyntheticLambda1OnNavigationEvent;
        }
        if (virtualCameraControlExternalSyntheticLambda1 != null) {
            fOnNavigationEvent = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            int i5 = onNavigationEvent + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            fOnNavigationEvent = connectioncount.onNavigationEvent();
        }
        float fOnExtraCallbackWithResult = connectioncount.onExtraCallbackWithResult(fOnNavigationEvent2, fOnNavigationEvent);
        long jOnNavigationEvent = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallbackWithResult));
        float fOnExtraCallback = protocol.onExtraCallback(fOnExtraCallbackWithResult, interfaceC0083handshake);
        RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallbackWithResult(jOnNavigationEvent);
        return RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(AvoidCaptureProcessProgressAvailabilityCheckQuirk.IAuthTabCallback(jOnNavigationEvent), AvoidCaptureProcessProgressAvailabilityCheckQuirk.onWarmupCompleted(jOnNavigationEvent) * fOnExtraCallback);
    }

    public static final connectionCount onExtraCallbackWithResult(long j, float f) {
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f)};
        return (connectionCount) onExtraCallbackWithResult(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -539097095, objArr, 539097096, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ getHumanReadableName onWarmupCompleted(connectionCount connectioncount, long j, GraphicDeviceInfo graphicDeviceInfo, use useVar, delete deleteVar, getSurfaceSize getsurfacesize, String str, long j2, getHighestSurfacePriority gethighestsurfacepriority, getParentMetadataCallback getparentmetadatacallback, addCameraErrorListener addcameraerrorlistener, long j3, bindChildren bindchildren, ExifSpeedConverter exifSpeedConverter, createCameraCaptureCallback createcameracapturecallback, toChildrenConfigsMap tochildrenconfigsmap, mergeChildrenConfigs mergechildrenconfigs, r8lambdak6CWcefLe9tXuLSlGJo2BURuBM r8lambdak6cwcefle9txulslgjo2burubm, getChildPreviewOutConfig getchildpreviewoutconfig, isUseCaseActive isusecaseactive, getPreviewFromChildren getpreviewfromchildren, int i, Object obj) {
        Object[] objArr = {connectioncount, Long.valueOf(j), graphicDeviceInfo, useVar, deleteVar, getsurfacesize, str, Long.valueOf(j2), gethighestsurfacepriority, getparentmetadatacallback, addcameraerrorlistener, Long.valueOf(j3), bindchildren, exifSpeedConverter, createcameracapturecallback, tochildrenconfigsmap, mergechildrenconfigs, r8lambdak6cwcefle9txulslgjo2burubm, getchildpreviewoutconfig, isusecaseactive, getpreviewfromchildren, Integer.valueOf(i), obj};
        return (getHumanReadableName) onExtraCallbackWithResult(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1403662836, objArr, 1403662836, zzaq.onNavigationEvent());
    }
}
