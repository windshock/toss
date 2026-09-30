package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.oExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;
import o.y1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1a {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final y1a onWarmupCompleted = new y1a();

    static {
        int i = onExtraCallback + 121;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(y1a y1aVar, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, long j, getHumanReadableName gethumanreadablename, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        y1aVar.onExtraCallback(hasprovider, quirksExternalSyntheticBackport0, (Function0<Unit>) function0, j, gethumanreadablename, j2, j3, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 63;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        long j;
        GraphicDeviceInfo graphicDeviceInfo;
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i2;
        int i10 = i8 | i2;
        int i11 = (~((~i2) | i6)) | (~i10);
        int i12 = (~(i5 | i7 | i2)) | (~(i10 | i6));
        int i13 = i2 + i6 + i4 + (528639218 * i) + ((-532493036) * i3);
        int i14 = i13 * i13;
        int i15 = (i2 * (-1573143961)) + 2078511484 + (i6 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + ((-1573143025) * i4) + (123045422 * i) + ((-1548035028) * i3) + (i14 * 1845559296);
        if (((i2 * 873666089) - 1460666368) + (873666089 * i6) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i4) + (1819279360 * i) + ((-1621098496) * i3) + (586088448 * i14) + (i15 * i15 * 1848705024) == 1) {
            return onExtraCallback(objArr);
        }
        hasProvider hasprovider = (hasProvider) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult = (oExternalSyntheticLambda0.onExtraCallbackWithResult) objArr[3];
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = (oExternalSyntheticLambda0.IAuthTabCallback) objArr[4];
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent = (oExternalSyntheticLambda0.onNavigationEvent) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        long jLongValue2 = ((Number) objArr[7]).longValue();
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[8];
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[9];
        Function0 function0 = (Function0) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int i16 = 2 % 2;
        int i17 = IAuthTabCallback + 19;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (iIntValue3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (iIntValue3 & 4) != 0 ? null : onextracallbackwithresult;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = (iIntValue3 & 8) != 0 ? null : iAuthTabCallback;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = (iIntValue3 & 16) != 0 ? null : onnavigationevent;
        long jOnTransact = (iIntValue3 & 32) != 0 ? setByteOrder.Companion.onTransact() : jLongValue;
        if ((iIntValue3 & 64) != 0) {
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i19 = IAuthTabCallback + 93;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            j = jOnNavigationEvent;
        } else {
            j = jLongValue2;
        }
        getHumanReadableName gethumanreadablename2 = (iIntValue3 & 128) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult()) : gethumanreadablename;
        if ((iIntValue3 & 256) != 0) {
            int i21 = IAuthTabCallback + 5;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            graphicDeviceInfo = null;
        } else {
            graphicDeviceInfo = graphicDeviceInfo2;
        }
        Function0 function02 = (iIntValue3 & 512) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1733156320, iIntValue, iIntValue2, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.TextButton (TitlePreset.kt:120)");
        }
        int i23 = iIntValue << 3;
        oExternalSyntheticLambda1.onWarmupCompleted(hasprovider, onextracallback2, jOnTransact, onextracallbackwithresult2, iAuthTabCallback2, 0L, onnavigationevent2, j, gethumanreadablename2, null, graphicDeviceInfo, null, null, null, function02, null, null, false, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 126) | ((iIntValue >> 9) & 896) | (i23 & 7168) | (i23 & 57344) | ((iIntValue << 6) & 3670016) | (29360128 & i23) | (i23 & 234881024), ((iIntValue >> 24) & 14) | ((iIntValue >> 15) & 57344), 244256);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        int i24 = onNavigationEvent + 55;
        IAuthTabCallback = i24 % 128;
        int i25 = i24 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1a y1aVar, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, long j, getHumanReadableName gethumanreadablename, long j2, long j3, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 37;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            IAuthTabCallback(y1aVar, hasprovider, quirksExternalSyntheticBackport0, function0, j, gethumanreadablename, j2, j3, graphicDeviceInfo, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(y1aVar, hasprovider, quirksExternalSyntheticBackport0, function0, j, gethumanreadablename, j2, j3, graphicDeviceInfo, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallback + 55;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 86 / 0;
        }
        return unitIAuthTabCallback;
    }

    private y1a() {
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallback + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i2 & 8) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i2 & 16) != 0) {
            int i8 = IAuthTabCallback + 121;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 1;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(749005338, i, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Paragraph (TitlePreset.kt:31)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(749005338, i, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Paragraph (TitlePreset.kt:31)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.top.v2.TitlePreset$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 53;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnNavigationEvent = y1a.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                    int i14 = onWarmupCompleted + 71;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 33 / 0;
                    }
                    return unitOnNavigationEvent;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, false, (Function1) objOnMinimized, 1, (Object) null);
        int i11 = i << 3;
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | (i11 & 7168) | (i11 & 57344), (i << 6) & 3670016, 196580);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        y1a y1aVar = (y1a) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue2 & 2) != 0) {
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue2 & 4) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        if ((iIntValue2 & 8) != 0) {
            int i5 = IAuthTabCallback + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        if ((iIntValue2 & 16) != 0) {
            graphicDeviceInfo = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(191497714, iIntValue, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Paragraph (TitlePreset.kt:50)");
        }
        y1aVar.onWarmupCompleted(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport0, jLongValue, jLongValue2, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 524272, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onNavigationEvent + 61;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, long j, @Nullable getHumanReadableName gethumanreadablename, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        Function0<Unit> function02;
        int i6;
        long j4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function0<Unit> function03;
        final long j6;
        final long j7;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename3;
        GraphicDeviceInfo graphicDeviceInfo3;
        getHumanReadableName gethumanreadablename4;
        long j8;
        long j9;
        long j10;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function0<Unit> function04;
        int i12;
        int i13;
        int i14 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(447577068);
        if ((i & 6) == 0) {
            int i15 = IAuthTabCallback + 21;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 89 / 0;
                i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ^ true ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider)) {
            }
            i3 = i13 | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i18 = onNavigationEvent + 1;
                    IAuthTabCallback = i18 % 128;
                    i4 = i18 % 2 == 0 ? 88 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        j4 = j;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            int i19 = onNavigationEvent + 17;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) {
                                int i21 = IAuthTabCallback + 31;
                                onNavigationEvent = i21 % 128;
                                i12 = i21 % 2 != 0 ? 28077 : 16384;
                            }
                            i3 |= i12;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i8 = i3 | 196608;
                    } else {
                        i8 = i3;
                        if ((196608 & i) == 0) {
                            i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 131072 : 65536;
                        }
                    }
                    i9 = i2 & 64;
                    if (i9 == 0) {
                        i8 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 1048576 : 524288;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((i & 12582912) == 0) {
                            i11 = i8 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 8388608 : 4194304);
                        }
                        if ((i11 & 4793491) != 4793490) {
                            int i22 = onNavigationEvent + 87;
                            IAuthTabCallback = i22 % 128;
                            z = i22 % 2 != 0;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                if (i17 != 0) {
                                    int i23 = onNavigationEvent + 117;
                                    IAuthTabCallback = i23 % 128;
                                    int i24 = i23 % 2;
                                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                                }
                                if (i5 != 0) {
                                    function02 = null;
                                }
                                long jOnTransact = i6 != 0 ? setByteOrder.Companion.onTransact() : j4;
                                if ((i2 & 16) != 0) {
                                    int i25 = onNavigationEvent + 43;
                                    IAuthTabCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                    i11 &= -57345;
                                } else {
                                    gethumanreadablename3 = gethumanreadablename;
                                }
                                long jOnTransact2 = i7 != 0 ? setByteOrder.Companion.onTransact() : j2;
                                long jOnNavigationEvent = i9 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                graphicDeviceInfo3 = i10 != 0 ? null : graphicDeviceInfo;
                                gethumanreadablename4 = gethumanreadablename3;
                                j8 = jOnTransact;
                                j9 = jOnTransact2;
                                j10 = jOnNavigationEvent;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                function04 = function02;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                if ((i2 & 16) != 0) {
                                    i11 &= -57345;
                                }
                                gethumanreadablename4 = gethumanreadablename;
                                j9 = j2;
                                j10 = j3;
                                graphicDeviceInfo3 = graphicDeviceInfo;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                function04 = function02;
                                j8 = j4;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(447577068, i11, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Selector (TitlePreset.kt:70)");
                            }
                            int i27 = i11 >> 3;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            y1ExternalSyntheticLambda7.onWarmupCompleted(hasprovider, quirksExternalSyntheticBackport04, function04, gethumanreadablename4, j9, j10, j8, graphicDeviceInfo3, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i27 & 458752) | (i11 & 1022) | (i27 & 7168) | (57344 & i27) | ((i11 << 9) & 3670016) | (i11 & 29360128), 256);
                            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                int i28 = IAuthTabCallback + 111;
                                onNavigationEvent = i28 % 128;
                                int i29 = i28 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            function03 = function04;
                            j6 = j8;
                            gethumanreadablename2 = gethumanreadablename4;
                            j7 = j9;
                            j5 = j10;
                            graphicDeviceInfo2 = graphicDeviceInfo3;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                            gethumanreadablename2 = gethumanreadablename;
                            j5 = j3;
                            graphicDeviceInfo2 = graphicDeviceInfo;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            function03 = function02;
                            j6 = j4;
                            j7 = j2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.v2.TitlePreset$$ExternalSyntheticLambda1
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2) {
                                    int i30 = 2 % 2;
                                    int i31 = onExtraCallbackWithResult + 87;
                                    onWarmupCompleted = i31 % 128;
                                    int i32 = i31 % 2;
                                    Unit unitOnWarmupCompleted = y1a.onWarmupCompleted(this.f$0, hasprovider, quirksExternalSyntheticBackport03, function03, j6, gethumanreadablename2, j7, j5, graphicDeviceInfo2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i33 = onWarmupCompleted + 101;
                                    onExtraCallbackWithResult = i33 % 128;
                                    if (i33 % 2 != 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    int i30 = onNavigationEvent + 13;
                    IAuthTabCallback = i30 % 128;
                    int i31 = i30 % 2;
                    i8 |= 12582912;
                    i11 = i8;
                    if ((i11 & 4793491) != 4793490) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                j4 = j;
                if ((i & 24576) == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i9 = i2 & 64;
                if (i9 == 0) {
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                }
                i11 = i8;
                if ((i11 & 4793491) != 4793490) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            function02 = function0;
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            j4 = j;
            if ((i & 24576) == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i9 = i2 & 64;
            if (i9 == 0) {
            }
            i10 = i2 & 128;
            if (i10 != 0) {
            }
            i11 = i8;
            if ((i11 & 4793491) != 4793490) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        j4 = j;
        if ((i & 24576) == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i9 = i2 & 64;
        if (i9 == 0) {
        }
        i10 = i2 & 128;
        if (i10 != 0) {
        }
        i11 = i8;
        if ((i11 & 4793491) != 4793490) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i11 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public final void onExtraCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable getHumanReadableName gethumanreadablename, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnTransact;
        long j4;
        Function0<Unit> function02;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact2 = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        getHumanReadableName gethumanreadablename2 = (i2 & 8) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((i2 & 16) != 0) {
            int i4 = IAuthTabCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j2;
        }
        if ((i2 & 32) != 0) {
            int i6 = onNavigationEvent + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i8 = IAuthTabCallback + 83;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 3;
            }
            j4 = jOnNavigationEvent;
        } else {
            j4 = j3;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 64) != 0 ? null : graphicDeviceInfo;
        if ((i2 & 128) != 0) {
            int i10 = IAuthTabCallback + 109;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onNavigationEvent + 39;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(560998282, i, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Selector (TitlePreset.kt:94)");
                int i13 = 47 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(560998282, i, -1, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.Selector (TitlePreset.kt:94)");
            }
        }
        int i14 = i << 3;
        onExtraCallback(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, function02, jOnTransact2, gethumanreadablename2, jOnTransact, j4, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, (i14 & 29360128) | (i & 112) | ((i >> 15) & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i & 234881024), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = IAuthTabCallback + 75;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable oExternalSyntheticLambda0.onNavigationEvent onnavigationevent, long j, long j2, @Nullable getHumanReadableName gethumanreadablename, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent2;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo2;
        Function0<Unit> function02;
        List list;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (i3 & 4) != 0 ? null : onextracallbackwithresult;
        if ((i3 & 8) != 0) {
            int i5 = onNavigationEvent + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallback2 = null;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        if ((i3 & 16) != 0) {
            int i7 = onNavigationEvent + 125;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        long jOnTransact = (i3 & 32) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i3 & 64) != 0) {
            int i8 = IAuthTabCallback + 119;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i9 = 24 / 0;
            } else {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            }
        } else {
            jOnNavigationEvent = j2;
        }
        getHumanReadableName gethumanreadablename2 = (i3 & 128) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(oExternalSyntheticLambda1.onExtraCallbackWithResult()) : gethumanreadablename;
        if ((i3 & 256) != 0) {
            int i10 = onNavigationEvent + 55;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if ((i3 & 512) != 0) {
            int i12 = onNavigationEvent + 115;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            function02 = null;
        } else {
            function02 = function0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = IAuthTabCallback + 17;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1157800254, i, i2, "im.toss.tds.compose.component.compound.top.v2.TitlePreset.TextButton (TitlePreset.kt:149)");
            list = null;
            if (i14 != 0) {
                throw null;
            }
        } else {
            list = null;
        }
        onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -566999436, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, new hasProvider(str, list, 2, list), quirksExternalSyntheticBackport02, onextracallbackwithresult2, iAuthTabCallback2, onnavigationevent2, Long.valueOf(jOnTransact), Long.valueOf(jOnNavigationEvent), gethumanreadablename2, graphicDeviceInfo2, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(2147483632 & i), Integer.valueOf(i2 & 14), 0}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 566999436);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, iIAuthTabCallback, 1254492510);
    }

    public final void IAuthTabCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, @Nullable oExternalSyntheticLambda0.onNavigationEvent onnavigationevent, long j, long j2, @Nullable getHumanReadableName gethumanreadablename, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {this, hasprovider, quirksExternalSyntheticBackport0, onextracallbackwithresult, iAuthTabCallback, onnavigationevent, Long.valueOf(j), Long.valueOf(j2), gethumanreadablename, graphicDeviceInfo, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -566999436, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, iIAuthTabCallback, 566999436);
    }
}
