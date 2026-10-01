package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areAllItemsEnabled;
import o.r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto;
import o.w0a;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto onNavigationEvent = new r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto();
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 9;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    private static final Unit IAuthTabCallback(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.IAuthTabCallback iAuthTabCallback, hasProvider hasprovider2, wa.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        r8lambda_moq0nysrol1o0qmavnpwgoovto.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport0, iAuthTabCallback, hasprovider2, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        hasProvider hasprovider = (hasProvider) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(hasprovider, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(hasprovider, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.IAuthTabCallback iAuthTabCallback, String str2, wa.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {r8lambda_moq0nysrol1o0qmavnpwgoovto, str, quirksExternalSyntheticBackport0, iAuthTabCallback, str2, onnavigationevent, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -689210845, PushInfo.Companion.onExtraCallback(), 689210845, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback());
        int i7 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i4;
        int i10 = ~i5;
        int i11 = i8 | (~(i9 | i10 | i2));
        int i12 = (~(i5 | i9 | i2)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i2 + i + (563899752 * i3) + (667302295 * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * 1426164010) - 416808960) + (1426164010 * i2) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i) + ((-1270874112) * i3) + (1914175488 * i6) + ((-1995833344) * i15);
        int i17 = (i4 * (-901935710)) + 144807674 + (i2 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i * (-901935539)) + (i3 * 42244168) + (i6 * (-913566613)) + (i15 * (-1006501888));
        return i16 + ((i17 * i17) * (-1006239744)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, hasProvider hasprovider, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.IAuthTabCallback iAuthTabCallback, hasProvider hasprovider2, wa.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(r8lambda_moq0nysrol1o0qmavnpwgoovto, hasprovider, quirksExternalSyntheticBackport0, iAuthTabCallback, hasprovider2, onnavigationevent, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(r8lambda_moq0nysrol1o0qmavnpwgoovto, hasprovider, quirksExternalSyntheticBackport0, iAuthTabCallback, hasprovider2, onnavigationevent, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto = (r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        wa.IAuthTabCallback iAuthTabCallback = (wa.IAuthTabCallback) objArr[3];
        String str2 = (String) objArr[4];
        wa.onNavigationEvent onnavigationevent = (wa.onNavigationEvent) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(str, quirksExternalSyntheticBackport0, iAuthTabCallback, str2, onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(hasProvider hasprovider, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(hasprovider, w0aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable wa.IAuthTabCallback iAuthTabCallback, @Nullable String str2, @Nullable wa.onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        wa.IAuthTabCallback iAuthTabCallback2;
        int i6;
        String str3;
        int i7;
        int i8;
        int iOrdinal;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final wa.onNavigationEvent onnavigationevent2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final wa.IAuthTabCallback iAuthTabCallback3;
        final String str4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(812282000);
        if ((i & 6) == 0) {
            i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i11 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i11 % 128;
                    i4 = i11 % 2 != 0 ? 0 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                int i12 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i12 % 128;
                i3 = i12 % 2 != 0 ? i3 | 25340 : i3 | 384;
            } else {
                if ((i & 384) == 0) {
                    iAuthTabCallback2 = iAuthTabCallback;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        str3 = str2;
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                            i7 = 1024;
                        } else {
                            int i13 = onExtraCallbackWithResult + 123;
                            IAuthTabCallback = i13 % 128;
                            int i14 = i13 % 2;
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        if (onnavigationevent == null) {
                            int i15 = IAuthTabCallback + 67;
                            onExtraCallbackWithResult = i15 % 128;
                            int i16 = i15 % 2;
                            iOrdinal = -1;
                        } else {
                            iOrdinal = onnavigationevent.ordinal();
                        }
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 16384 : 8192;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        onnavigationevent2 = onnavigationevent;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        iAuthTabCallback3 = iAuthTabCallback2;
                        str4 = str3;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = i5 != 0 ? u7.IAuthTabCallback.onExtraCallback() : iAuthTabCallback2;
                        String str5 = i6 != 0 ? null : str3;
                        wa.onNavigationEvent onnavigationevent3 = i8 != 0 ? wa.onNavigationEvent.Bottom : onnavigationevent;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i17 = IAuthTabCallback + 103;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(812282000, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header (HeaderPreset.kt:20)");
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        w2.IAuthTabCallback(1724574124, new Object[]{str, quirksExternalSyntheticBackport04, iAuthTabCallbackOnExtraCallback, null, Float.valueOf(0.0f), onnavigationevent3, str5, null, null, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i3 & 1022) | ((i3 << 3) & 458752) | ((i3 << 9) & 3670016)), 0, 8088}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        iAuthTabCallback3 = iAuthTabCallbackOnExtraCallback;
                        str4 = str5;
                        onnavigationevent2 = onnavigationevent3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj, Object obj2) {
                                int i19 = 2 % 2;
                                int i20 = IAuthTabCallback + 21;
                                onExtraCallbackWithResult = i20 % 128;
                                int i21 = i20 % 2;
                                Unit unitOnExtraCallback = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onExtraCallback(this.f$0, str, quirksExternalSyntheticBackport03, iAuthTabCallback3, str4, onnavigationevent2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i22 = onExtraCallbackWithResult + 99;
                                IAuthTabCallback = i22 % 128;
                                if (i22 % 2 == 0) {
                                    int i23 = 90 / 0;
                                }
                                return unitOnExtraCallback;
                            }
                        });
                        return;
                    }
                    return;
                }
                int i19 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i19 % 128;
                int i20 = i19 % 2;
                i3 |= 3072;
                str3 = str2;
                i8 = i2 & 16;
                if (i8 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            iAuthTabCallback2 = iAuthTabCallback;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            str3 = str2;
            i8 = i2 & 16;
            if (i8 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        iAuthTabCallback2 = iAuthTabCallback;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        str3 = str2;
        i8 = i2 & 16;
        if (i8 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onNavigationEvent(hasProvider hasprovider, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            int i4 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1466108135, i2, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header.<anonymous> (HeaderPreset.kt:40)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1466108135, i2, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header.<anonymous> (HeaderPreset.kt:40)");
            }
            areAllItemsEnabled.onWarmupCompleted(GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1975818925, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{areallitemsenabled, hasprovider, null, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 << 18) & 3670016), 62}, -1975818925);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(hasProvider hasprovider, w0a w0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w0aVar, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w0aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i6 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1784834252, i2, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header.<anonymous>.<anonymous> (HeaderPreset.kt:46)");
            }
            w0aVar.IAuthTabCallback(hasprovider, null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 15) & 458752, 30);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable wa.IAuthTabCallback iAuthTabCallback, @Nullable hasProvider hasprovider2, @Nullable wa.onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        wa.IAuthTabCallback iAuthTabCallback2;
        int i6;
        hasProvider hasprovider3;
        int i7;
        int iOrdinal;
        int i8;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        final hasProvider hasprovider4;
        final wa.onNavigationEvent onnavigationevent2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1185778466);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider)) {
                int i11 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i11 % 128;
                i9 = i11 % 2 == 0 ? 5 : 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
                    int i13 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i13 % 128;
                    i4 = i13 % 2 != 0 ? 120 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    iAuthTabCallback2 = iAuthTabCallback;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 256 : 128;
                }
                i6 = i2 & 8;
                if (i6 == 0) {
                    if ((i & 3072) == 0) {
                        hasprovider3 = hasprovider2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider3) ? 2048 : 1024;
                    }
                    i7 = i2 & 16;
                    if (i7 == 0) {
                        int i14 = onExtraCallbackWithResult + 17;
                        IAuthTabCallback = i14 % 128;
                        i3 = i14 % 2 != 0 ? i3 | 17985 : i3 | 24576;
                    } else if ((i & 24576) == 0) {
                        if (onnavigationevent == null) {
                            int i15 = IAuthTabCallback + 93;
                            onExtraCallbackWithResult = i15 % 128;
                            int i16 = i15 % 2;
                            iOrdinal = -1;
                        } else {
                            iOrdinal = onnavigationevent.ordinal();
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal)) {
                            int i17 = onExtraCallbackWithResult + 85;
                            int i18 = i17 % 128;
                            IAuthTabCallback = i18;
                            int i19 = i17 % 2;
                            int i20 = i18 + 97;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        iAuthTabCallbackOnExtraCallback = iAuthTabCallback2;
                        hasprovider4 = hasprovider3;
                        onnavigationevent2 = onnavigationevent;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        iAuthTabCallbackOnExtraCallback = i5 != 0 ? u7.IAuthTabCallback.onExtraCallback() : iAuthTabCallback2;
                        getBacktraceNote getbacktracenoteOnExtraCallback = null;
                        final hasProvider hasprovider5 = i6 != 0 ? null : hasprovider3;
                        wa.onNavigationEvent onnavigationevent3 = i7 != 0 ? wa.onNavigationEvent.Bottom : onnavigationevent;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i22 = onExtraCallbackWithResult + 77;
                            IAuthTabCallback = i22 % 128;
                            if (i22 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1185778466, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header (HeaderPreset.kt:37)");
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1185778466, i3, -1, "im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset.Header (HeaderPreset.kt:37)");
                        }
                        if (hasprovider5 == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-579208348);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-579208347);
                            getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1784834252, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset$$ExternalSyntheticLambda1
                                private static int IAuthTabCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                    int i23 = 2 % 2;
                                    int i24 = IAuthTabCallback + 117;
                                    onWarmupCompleted = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onWarmupCompleted(hasprovider5, (w0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onWarmupCompleted(hasprovider5, (w0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i25 = onWarmupCompleted + 71;
                                    IAuthTabCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        int i23 = i3 << 3;
                        w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1466108135, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i24 = 2 % 2;
                                int i25 = onExtraCallbackWithResult + 109;
                                IAuthTabCallback = i25 % 128;
                                if (i25 % 2 == 0) {
                                    return (Unit) r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -799290504, PushInfo.Companion.onExtraCallback(), 799290505, PushInfo.Companion.onExtraCallback(), new Object[]{hasprovider, (areAllItemsEnabled) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, PushInfo.Companion.onExtraCallback());
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport04, null, iAuthTabCallbackOnExtraCallback, 0.0f, onnavigationevent3, getbacktracenoteOnExtraCallback, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 112) | 6 | (i23 & 7168) | (i23 & 458752), 0, 3988);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        hasprovider4 = hasprovider5;
                        onnavigationevent2 = onnavigationevent3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.v2.HeaderPreset$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2) {
                                int i24 = 2 % 2;
                                int i25 = IAuthTabCallback + 95;
                                onWarmupCompleted = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnExtraCallbackWithResult = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onExtraCallbackWithResult(this.f$0, hasprovider, quirksExternalSyntheticBackport03, iAuthTabCallbackOnExtraCallback, hasprovider4, onnavigationevent2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i27 = IAuthTabCallback + 125;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        });
                    }
                    int i24 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i24 % 128;
                    int i25 = i24 % 2;
                }
                i3 |= 3072;
                hasprovider3 = hasprovider2;
                i7 = i2 & 16;
                if (i7 == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                int i242 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i242 % 128;
                int i252 = i242 % 2;
            }
            int i26 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i26 % 128;
            i3 = i26 % 2 == 0 ? i3 | 5608 : i3 | 384;
            iAuthTabCallback2 = iAuthTabCallback;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            hasprovider3 = hasprovider2;
            i7 = i2 & 16;
            if (i7 == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            int i2422 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2422 % 128;
            int i2522 = i2422 % 2;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        iAuthTabCallback2 = iAuthTabCallback;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        hasprovider3 = hasprovider2;
        i7 = i2 & 16;
        if (i7 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 9363) != 9362), i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        int i24222 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i24222 % 128;
        int i25222 = i24222 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(hasProvider hasprovider, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {hasprovider, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -799290504, PushInfo.Companion.onExtraCallback(), 799290505, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback());
    }

    private static final Unit onNavigationEvent(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, wa.IAuthTabCallback iAuthTabCallback, String str2, wa.onNavigationEvent onnavigationevent, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {r8lambda_moq0nysrol1o0qmavnpwgoovto, str, quirksExternalSyntheticBackport0, iAuthTabCallback, str2, onnavigationevent, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallbackWithResult(PushInfo.Companion.onExtraCallback(), -689210845, PushInfo.Companion.onExtraCallback(), 689210845, PushInfo.Companion.onExtraCallback(), objArr, PushInfo.Companion.onExtraCallback());
    }
}
