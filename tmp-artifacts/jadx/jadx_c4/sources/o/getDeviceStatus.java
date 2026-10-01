package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getDeviceStatus;
import o.getViewTypeCount;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getDeviceStatus {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onUnavailable onunavailable = (onUnavailable) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(onunavailable, (Function1<? super onUnavailable, Unit>) function1, (Function1<? super onUnavailable, Unit>) function12, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(liteProcessServerManagerOpt liteprocessservermanageropt, Function1 function1, Function1 function12, boolean z, Function2 function2, onUnavailable onunavailable, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(liteprocessservermanageropt, function1, function12, z, function2, onunavailable, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 11;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, onUnavailable onunavailable, String str, Function1 function12) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, onunavailable, str, function12);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(onUnavailable onunavailable, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {onunavailable, function1, function12, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2055021703, -2055021703, iOnExtraCallback2);
        int i7 = onNavigationEvent + 25;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        List list = (List) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        Function2 function2 = (Function2) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Function2 function22 = (Function2) objArr[5];
        onUnavailable onunavailable = (onUnavailable) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(new Object[]{list, function1, function12, function2, Boolean.valueOf(zBooleanValue), function22, onunavailable, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1507904486, -1507904484, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, Function1 function1, Function1 function12, Function2 function2, boolean z, Function2 function22, onUnavailable onunavailable, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 77;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {list, function1, function12, function2, Boolean.valueOf(z), function22, onunavailable, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -561714142, 561714143, iOnExtraCallback2);
        int i7 = onNavigationEvent + 3;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor, function1, onunavailable);
        int i4 = onWarmupCompleted + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i2 | i9;
        int i11 = (~(i7 | i2)) | i9 | (~(i8 | i2));
        int i12 = ~((~i2) | i4 | i5);
        int i13 = i4 + i5 + i6 + ((-2027816600) * i3) + ((-1234684791) * i);
        int i14 = i13 * i13;
        int i15 = (i4 * (-132237830)) + 1711013888 + ((-132237830) * i5) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i6) + (811597824 * i3) + (1100742656 * i) + (1751056384 * i14);
        int i16 = ((i4 * 572746074) - 905264446) + (i5 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i6 * 572745585) + (i3 * 982511336) + (i * (-774025351)) + (i14 * 1257177088);
        int i17 = i15 + (i16 * i16 * 1874919424);
        return i17 != 1 ? i17 != 2 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, onunavailable);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        int i5 = onNavigationEvent + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(liteProcessServerManagerOpt liteprocessservermanageropt, Function1 function1, Function1 function12, boolean z, Function2 function2, onUnavailable onunavailable, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(liteprocessservermanageropt, function1, function12, z, function2, onunavailable, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 109;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i3;
        Function2 function2;
        final onUnavailable onunavailable;
        final boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        int i6;
        final List list = (List) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        final Function1 function12 = (Function1) objArr[2];
        final Function2 function22 = (Function2) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Function2 function23 = (Function2) objArr[5];
        onUnavailable onunavailable2 = (onUnavailable) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 23;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(531448901);
        int i10 = (iIntValue & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | iIntValue : iIntValue;
        if ((iIntValue & 48) == 0) {
            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        Object obj = null;
        if ((iIntValue & 384) == 0) {
            int i11 = onWarmupCompleted + 101;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i12 = onWarmupCompleted + 97;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i6 = 256;
            } else {
                i6 = 128;
            }
            i10 |= i6;
        }
        if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22)) {
                int i14 = onWarmupCompleted + 103;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i10 |= i5;
        }
        int i16 = iIntValue2 & 16;
        if (i16 != 0) {
            i10 |= 24576;
        } else if ((iIntValue & 24576) == 0) {
            int i17 = onWarmupCompleted + 9;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 16384 : 8192;
        }
        int i19 = iIntValue2 & 32;
        int i20 = 196608;
        if (i19 != 0) {
            i10 |= i20;
        } else if ((196608 & iIntValue) == 0) {
            i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ? 131072 : 65536;
            i10 |= i20;
        }
        int i21 = iIntValue2 & 64;
        if (i21 == 0) {
            if ((iIntValue & 1572864) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onunavailable2)) {
                    int i22 = onWarmupCompleted + 1;
                    onNavigationEvent = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                    i = 1048576;
                } else {
                    i = 524288;
                }
                i2 = i | i10;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i2) == 599186, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                function2 = function23;
                onunavailable = onunavailable2;
                z = zBooleanValue;
            } else {
                boolean z2 = i16 != 0 ? false : zBooleanValue;
                function2 = i19 != 0 ? null : function23;
                onUnavailable onunavailable3 = i21 != 0 ? null : onunavailable2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(531448901, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSection (CreditHomeBannerSection.kt:39)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-67568804);
                int i23 = 0;
                for (Object obj2 : list) {
                    if (i23 < 0) {
                        int i24 = onNavigationEvent + 93;
                        onWarmupCompleted = i24 % 128;
                        if (i24 % 2 == 0) {
                            CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        CollectionsKt.throwIndexOverflow();
                    }
                    liteProcessServerManagerOpt liteprocessservermanageropt = (liteProcessServerManagerOpt) obj2;
                    onUnavailable onunavailable4 = i23 == 0 ? onunavailable3 : null;
                    if (liteprocessservermanageropt.IAuthTabCallback().isEmpty()) {
                        int i25 = onWarmupCompleted + 117;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        if (onunavailable4 != null) {
                            int i27 = i2 >> 3;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i4 = iIntValue;
                            onExtraCallback(liteprocessservermanageropt, function12, function1, z2, i23 == 0 ? function2 : null, onunavailable4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i27 & 7168) | (i27 & 112) | ((i2 << 3) & 896), 0);
                            if (function22 != null) {
                                int i28 = onWarmupCompleted + 89;
                                onNavigationEvent = i28 % 128;
                                if (i28 % 2 != 0) {
                                    throw null;
                                }
                                if (i23 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2103020426);
                                    function22.invoke(cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i2 >> 9) & 14));
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2102974298);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i4 = iIntValue;
                        }
                    }
                    i23++;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2;
                    iIntValue = i4;
                }
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i29 = onWarmupCompleted + 87;
                    onNavigationEvent = i29 % 128;
                    int i30 = i29 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                z = z2;
                onunavailable = onunavailable3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                final Function2 function24 = function2;
                final int i31 = i3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i32 = 2 % 2;
                        int i33 = IAuthTabCallback + 121;
                        onWarmupCompleted = i33 % 128;
                        int i34 = i33 % 2;
                        Unit unitOnNavigationEvent = getDeviceStatus.onNavigationEvent(list, function1, function12, function22, z, function24, onunavailable, i31, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i35 = onWarmupCompleted + 29;
                        IAuthTabCallback = i35 % 128;
                        if (i35 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                });
            }
            return null;
        }
        i10 |= 1572864;
        i2 = i10;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i2) == 599186, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final liteProcessServerManagerOpt liteprocessservermanageropt, final Function1<? super onUnavailable, Unit> function1, final Function1<? super onUnavailable, Unit> function12, boolean z, Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, onUnavailable onunavailable, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        boolean z2;
        int i4;
        int i5;
        onUnavailable onunavailable2;
        boolean z3;
        final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean zOnExtraCallbackWithResult;
        long jITrustedWebActivityCallback;
        float fIAuthTabCallback;
        Throwable th;
        float fIAuthTabCallback2;
        int i6;
        Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function23 = function2;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(17355409);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(liteprocessservermanageropt) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onWarmupCompleted + 79;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i10 = onWarmupCompleted + 87;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ^ true) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            Object obj = null;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                int i13 = onWarmupCompleted + 81;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23);
                    obj.hashCode();
                    throw null;
                }
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function23) ^ true) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    onunavailable2 = onunavailable;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onunavailable2) ^ true ? 65536 : 131072;
                }
                if ((i3 & 74899) != 74898) {
                    int i14 = onWarmupCompleted + 11;
                    onNavigationEvent = i14 % 128;
                    z3 = i14 % 2 == 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                    boolean z4 = i12 != 0 ? false : z2;
                    if (i4 != 0) {
                        int i15 = onNavigationEvent + 107;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        function23 = null;
                    }
                    onUnavailable onunavailable3 = i5 != 0 ? null : onunavailable2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(17355409, i3, -1, "im.toss.feature.credit.ui.main.home.component.BannerSectionContent (CreditHomeBannerSection.kt:69)");
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 2, (Object) null), new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f))));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501304459);
                    if (z4) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501304090);
                        zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1639443631);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        zOnExtraCallbackWithResult = false;
                    }
                    if (!(!zOnExtraCallbackWithResult)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501302810);
                        jITrustedWebActivityCallback = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback();
                    } else if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                        int i17 = onWarmupCompleted + 117;
                        onNavigationEvent = i17 % 128;
                        if (i17 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501300411);
                            jITrustedWebActivityCallback = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 57).onWarmupCompleted();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501300411);
                            jITrustedWebActivityCallback = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onWarmupCompleted();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-501298910);
                        jITrustedWebActivityCallback = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jITrustedWebActivityCallback, new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f))));
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = liteprocessservermanageropt.IAuthTabCallback().size() == 1 ? VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)) : null;
                    if (virtualCameraControlExternalSyntheticLambda1OnNavigationEvent != null) {
                        int i18 = onNavigationEvent + 77;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1OnNavigationEvent.IAuthTabCallback();
                    } else {
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (onunavailable3 == null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1833264984);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        th = null;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1833264983);
                        th = null;
                        onWarmupCompleted(onunavailable3, function1, function12, z4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8176, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (function23 == null) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1833009358);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1187796655);
                        function23.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 >> 12) & 14));
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1187798027);
                    Iterator<T> it = liteprocessservermanageropt.IAuthTabCallback().iterator();
                    int i20 = 0;
                    while (it.hasNext()) {
                        int i21 = onNavigationEvent + 83;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 == 0) {
                            it.next();
                            th.hashCode();
                            throw th;
                        }
                        Object next = it.next();
                        if (i20 < 0) {
                            int i22 = onNavigationEvent + 53;
                            onWarmupCompleted = i22 % 128;
                            int i23 = i22 % 2;
                            CollectionsKt.throwIndexOverflow();
                        }
                        onWarmupCompleted((onUnavailable) next, function1, function12, z4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 8176, 0);
                        i20++;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    if (virtualCameraControlExternalSyntheticLambda1OnNavigationEvent != null) {
                        int i24 = onWarmupCompleted + 119;
                        onNavigationEvent = i24 % 128;
                        if (i24 % 2 != 0) {
                            virtualCameraControlExternalSyntheticLambda1OnNavigationEvent.IAuthTabCallback();
                            th.hashCode();
                            throw th;
                        }
                        fIAuthTabCallback2 = virtualCameraControlExternalSyntheticLambda1OnNavigationEvent.IAuthTabCallback();
                    } else {
                        fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, fIAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    function22 = function23;
                    z2 = z4;
                    onunavailable2 = onunavailable3;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    function22 = function23;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final boolean z5 = z2;
                    final onUnavailable onunavailable4 = onunavailable2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2, Object obj3) throws Throwable {
                            Unit unitOnWarmupCompleted;
                            int i25 = 2 % 2;
                            int i26 = IAuthTabCallback + 99;
                            onExtraCallbackWithResult = i26 % 128;
                            if (i26 % 2 == 0) {
                                unitOnWarmupCompleted = getDeviceStatus.onWarmupCompleted(liteprocessservermanageropt, function1, function12, z5, function22, onunavailable4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i27 = 1 / 0;
                            } else {
                                unitOnWarmupCompleted = getDeviceStatus.onWarmupCompleted(liteprocessservermanageropt, function1, function12, z5, function22, onunavailable4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            int i28 = onExtraCallbackWithResult + 37;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            onunavailable2 = onunavailable;
            if ((i3 & 74899) != 74898) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        Object obj2 = null;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        onunavailable2 = onunavailable;
        if ((i3 & 74899) != 74898) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onNavigationEvent(Function1 function1, onUnavailable onunavailable, String str, Function1 function12) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        function1.invoke(onunavailable);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Function1 function1, onUnavailable onunavailable) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(onunavailable);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final Function1 function1, final onUnavailable onunavailable) {
        int i = 2 % 2;
        onWarmupCompleted(getsupportedhighspeedresolutionsfor).onWarmupCompleted(new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 49;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Function1 function12 = function1;
                if (i4 == 0) {
                    return getDeviceStatus.onWarmupCompleted(function12, onunavailable);
                }
                getDeviceStatus.onWarmupCompleted(function12, onunavailable);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final onUnavailable onunavailable, final Function1<? super onUnavailable, Unit> function1, final Function1<? super onUnavailable, Unit> function12, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        setByteOrder setbyteorderOnNavigationEvent;
        String strOnExtraCallbackWithResult;
        setByteOrder setbyteorderOnNavigationEvent2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(516199538);
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onunavailable)) {
                i6 = 2;
            } else {
                int i8 = onWarmupCompleted + 65;
                onNavigationEvent = i8 % 128;
                i6 = i8 % 2 != 0 ? 5 : 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i9 = onNavigationEvent + 1;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i11 = onWarmupCompleted + 63;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    int i13 = onNavigationEvent + 19;
                    onWarmupCompleted = i13 % 128;
                    i4 = i13 % 2 == 0 ? 30512 : 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) == 1170) {
                int i14 = onNavigationEvent + 33;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                boolean z7 = i12 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(516199538, i3, -1, "im.toss.feature.credit.ui.main.home.component.BannerInSection (CreditHomeBannerSection.kt:118)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new ImageLoaderBuilderExternalSyntheticLambda6(2000L), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    int i16 = onWarmupCompleted + 55;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
                String str = (String) onUnavailable.onExtraCallbackWithResult(-472189384, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 472189386);
                CipherSuiteCompanion cipherSuiteCompanionAsInterface = onunavailable.asInterface();
                if (cipherSuiteCompanionAsInterface == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(759494308);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(717236477);
                    long jIAuthTabCallback = getMaxAdCount.IAuthTabCallback(cipherSuiteCompanionAsInterface, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jIAuthTabCallback);
                }
                long jAccess100 = setbyteorderOnNavigationEvent != null ? setbyteorderOnNavigationEvent.access100() : setByteOrder.Companion.onTransact();
                boolean zIAuthTabCallback_Parcel = onunavailable.IAuthTabCallback_Parcel();
                long jIAuthTabCallback2 = getMaxAdCount.IAuthTabCallback(onunavailable.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                String strAccess100 = onunavailable.access100();
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                GraphicDeviceInfo graphicDeviceInfoOnTransact = isRepeatingEnabled.onExtraCallback.onTransact();
                long jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                if (((String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1430561056)) == null || !(!StringsKt.isBlank(r29))) {
                    strOnExtraCallbackWithResult = onunavailable.onExtraCallbackWithResult();
                } else {
                    int i18 = onWarmupCompleted + 1;
                    onNavigationEvent = i18 % 128;
                    int i19 = i18 % 2;
                    strOnExtraCallbackWithResult = (String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1430561056);
                }
                String str2 = strOnExtraCallbackWithResult;
                CipherSuiteCompanion cipherSuiteCompanion = (CipherSuiteCompanion) onUnavailable.onExtraCallbackWithResult(401091475, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -401091475);
                if (cipherSuiteCompanion == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(760053796);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent2 = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(717254525);
                    long jIAuthTabCallback3 = getMaxAdCount.IAuthTabCallback(cipherSuiteCompanion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jIAuthTabCallback3);
                }
                if (z7) {
                    String str3 = (String) onUnavailable.onExtraCallbackWithResult(1430561057, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{onunavailable}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1430561056);
                    if (str3 != null) {
                        boolean z8 = StringsKt.isBlank(str3) ^ true;
                        getViewTypeCount.onNavigationEvent onnavigationeventIAuthTabCallback = getViewTypeCount.onNavigationEvent.Companion.IAuthTabCallback();
                        getViewTypeCount.onTransact ontransactIAuthTabCallback = getViewTypeCount.onTransact.Companion.IAuthTabCallback();
                        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                        AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(jOnExtraCallback);
                        setByteOrder setbyteorderOnNavigationEvent3 = setByteOrder.onNavigationEvent(jIsEngagementSignalsApiAvailable);
                        if ((i3 & 112) != 32) {
                            int i20 = onNavigationEvent + 45;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i22 = i3 & 14;
                        z5 = i22 != 4;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z5 | z4) {
                            Object obj2 = objOnMinimized2;
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                Function2 function2 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda2
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke(Object obj3, Object obj4) {
                                        int i23 = 2 % 2;
                                        int i24 = onWarmupCompleted + 43;
                                        onNavigationEvent = i24 % 128;
                                        int i25 = i24 % 2;
                                        Function1 function13 = function1;
                                        if (i25 != 0) {
                                            return getDeviceStatus.onExtraCallback(function13, onunavailable, (String) obj3, (Function1) obj4);
                                        }
                                        getDeviceStatus.onExtraCallback(function13, onunavailable, (String) obj3, (Function1) obj4);
                                        Object obj5 = null;
                                        obj5.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function2);
                                obj2 = function2;
                            }
                            Function2 function22 = (Function2) obj2;
                            if ((i3 & 896) == 256) {
                                int i23 = onWarmupCompleted + 105;
                                onNavigationEvent = i23 % 128;
                                int i24 = i23 % 2;
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            boolean z9 = i22 == 4;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z6 | z9)) {
                                Object obj3 = objOnMinimized3;
                                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda3
                                        private static int IAuthTabCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i25 = 2 % 2;
                                            int i26 = IAuthTabCallback + 31;
                                            onWarmupCompleted = i26 % 128;
                                            int i27 = i26 % 2;
                                            Unit unitOnNavigationEvent = getDeviceStatus.onNavigationEvent(getsupportedhighspeedresolutionsfor, function12, onunavailable);
                                            int i28 = onWarmupCompleted + 47;
                                            IAuthTabCallback = i28 % 128;
                                            int i29 = i28 % 2;
                                            return unitOnNavigationEvent;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                                    obj3 = function0;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                EmbedWebviewLoadPoint.onNavigationEvent((QuirksExternalSyntheticBackport0) null, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, str, jAccess100, zIAuthTabCallback_Parcel, jIAuthTabCallback2, (String) null, strAccess100, avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult, setbyteorderOnNavigationEvent3, graphicDeviceInfoOnTransact, str2, setbyteorderOnNavigationEvent2, z8, false, (String) null, ontransactIAuthTabCallback, onnavigationeventIAuthTabCallback, function22, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult2, 100663344, 14155782, 49217);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                z2 = z7;
                            }
                        }
                    }
                    getViewTypeCount.onNavigationEvent onnavigationeventIAuthTabCallback2 = getViewTypeCount.onNavigationEvent.Companion.IAuthTabCallback();
                    getViewTypeCount.onTransact ontransactIAuthTabCallback2 = getViewTypeCount.onTransact.Companion.IAuthTabCallback();
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                    AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirkOnExtraCallbackWithResult2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.onExtraCallbackWithResult(jOnExtraCallback);
                    setByteOrder setbyteorderOnNavigationEvent32 = setByteOrder.onNavigationEvent(jIsEngagementSignalsApiAvailable);
                    if ((i3 & 112) != 32) {
                    }
                    int i222 = i3 & 14;
                    if (i222 != 4) {
                    }
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z5 | z4) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final boolean z10 = z2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeBannerSectionKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj4, Object obj5) {
                        int i25 = 2 % 2;
                        int i26 = onExtraCallback + 73;
                        onWarmupCompleted = i26 % 128;
                        if (i26 % 2 == 0) {
                            return getDeviceStatus.onExtraCallback(onunavailable, function1, function12, z10, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        }
                        Unit unitOnExtraCallback = getDeviceStatus.onExtraCallback(onunavailable, function1, function12, z10, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i27 = 98 / 0;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        int i25 = onWarmupCompleted + 73;
        onNavigationEvent = i25 % 128;
        int i26 = i25 % 2;
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final ImageLoaderBuilderExternalSyntheticLambda6 onWarmupCompleted(getSupportedHighSpeedResolutionsFor<ImageLoaderBuilderExternalSyntheticLambda6> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ImageLoaderBuilderExternalSyntheticLambda6 imageLoaderBuilderExternalSyntheticLambda6 = (ImageLoaderBuilderExternalSyntheticLambda6) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return imageLoaderBuilderExternalSyntheticLambda6;
    }

    private static final Unit IAuthTabCallback(onUnavailable onunavailable, Function1 function1, Function1 function12, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {onunavailable, function1, function12, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 2055021703, -2055021703, iOnExtraCallback2);
    }

    public static final void onExtraCallbackWithResult(@NotNull List<liteProcessServerManagerOpt> list, @NotNull Function1<? super onUnavailable, Unit> function1, @NotNull Function1<? super onUnavailable, Unit> function12, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, boolean z, @Nullable Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable onUnavailable onunavailable, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {list, function1, function12, function2, Boolean.valueOf(z), function22, onunavailable, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        onWarmupCompleted(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1507904486, -1507904484, iOnExtraCallback2);
    }

    private static final Unit onExtraCallbackWithResult(List list, Function1 function1, Function1 function12, Function2 function2, boolean z, Function2 function22, onUnavailable onunavailable, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {list, function1, function12, function2, Boolean.valueOf(z), function22, onunavailable, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Unit) onWarmupCompleted(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -561714142, 561714143, iOnExtraCallback2);
    }
}
