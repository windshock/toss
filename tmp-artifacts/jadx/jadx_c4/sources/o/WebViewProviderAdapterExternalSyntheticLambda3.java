package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.RearDisplayPresentationSessionPresenterImpl;
import o.WebViewProviderAdapterExternalSyntheticLambda3;
import o.hasProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewProviderAdapterExternalSyntheticLambda3 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(Integer num) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(num);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(num);
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallbackWithResult(String str, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(str, z, quirksExternalSyntheticBackport0, str2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 17;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i5 | i3 | i));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i | i3)) | (~(i13 | i8)) | (~(i5 | i));
        int i16 = i5 + i3 + i6 + ((-298151579) * i2) + ((-427515960) * i4);
        int i17 = i16 * i16;
        int i18 = (i5 * (-431502880)) + 875560960 + ((-431502880) * i3) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i6) + ((-16252928) * i2) + (423624704 * i4) + (1109590016 * i17);
        int i19 = ((i5 * (-2003555040)) - 1632655964) + (i3 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i6 * (-2003554617)) + (i2 * 1812671363) + (i4 * (-1519508360)) + (i17 * (-1288372224));
        return i18 + ((i19 * i19) * (-1796407296)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl = (RearDisplayPresentationSessionPresenterImpl) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        Function1 function12 = (Function1) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport0, function1, function0, function2, zBooleanValue, function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallbackWithResult(str, z, quirksExternalSyntheticBackport0, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, z, quirksExternalSyntheticBackport0, str2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            i |= 1;
        }
        IAuthTabCallback(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 77559216, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -77559216, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i6 = onExtraCallback + 3;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(Integer num) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[PHI: r0
      0x004d: PHI (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r0
      0x0030: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v8 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Integer, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function2, boolean z, @Nullable Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean zOnExtraCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        Function1<? super Integer, Unit> function13;
        int i5;
        Function0<Unit> function02;
        int i6;
        Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function22;
        int i7;
        int i8;
        final Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function14;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function1<? super Integer, Unit> function15;
        final Function0<Unit> function03;
        final Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function23;
        final boolean z2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function1<? super Integer, Unit> function16;
        int i9 = 2 % 2;
        int i10 = onNavigationEvent + 111;
        onExtraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rearDisplayPresentationSessionPresenterImpl, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1438075235);
            if ((i & 48) == 0) {
                if ((i & 8) == 0) {
                    int i11 = onNavigationEvent + 27;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rearDisplayPresentationSessionPresenterImpl);
                } else {
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(rearDisplayPresentationSessionPresenterImpl);
                }
                i3 = (zOnExtraCallback ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rearDisplayPresentationSessionPresenterImpl, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1438075235);
            if ((i & 6) == 0) {
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                int i14 = onExtraCallback + 7;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 1024 : 2048;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function22 = function2;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((i & 196608) == 0) {
                                int i16 = onNavigationEvent + 117;
                                onExtraCallback = i16 % 128;
                                int i17 = i16 % 2;
                                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
                            }
                            i8 = i2 & 64;
                            if (i8 != 0) {
                                if ((i & 1572864) == 0) {
                                    int i18 = onNavigationEvent + 17;
                                    onExtraCallback = i18 % 128;
                                    int i19 = i18 % 2;
                                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 1048576 : 524288;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
                                    if (i13 != 0) {
                                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                                    }
                                    Function1<? super Integer, ? extends QuirksExternalSyntheticBackport0> function17 = null;
                                    if (i4 != 0) {
                                        int i20 = onExtraCallback + 81;
                                        onNavigationEvent = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                            function17.hashCode();
                                            throw null;
                                        }
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsCardKt$$ExternalSyntheticLambda2
                                                private static int onNavigationEvent = 0;
                                                private static int onWarmupCompleted = 1;

                                                public final Object invoke(Object obj) {
                                                    int i21 = 2 % 2;
                                                    int i22 = onWarmupCompleted + 3;
                                                    onNavigationEvent = i22 % 128;
                                                    Integer num = (Integer) obj;
                                                    if (i22 % 2 == 0) {
                                                        return WebViewProviderAdapterExternalSyntheticLambda3.IAuthTabCallback(num);
                                                    }
                                                    WebViewProviderAdapterExternalSyntheticLambda3.IAuthTabCallback(num);
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        function16 = (Function1) objOnMinimized;
                                    } else {
                                        function16 = function13;
                                    }
                                    Function0<Unit> function04 = i5 != 0 ? null : function02;
                                    Function2<? super Integer, ? super WebViewCompatExternalSyntheticLambda1, Unit> function24 = i6 != 0 ? null : function22;
                                    boolean z3 = i7 != 0 ? true : z;
                                    if (i8 != 0) {
                                        int i21 = onExtraCallback + 83;
                                        onNavigationEvent = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            function17.hashCode();
                                            throw null;
                                        }
                                    } else {
                                        function17 = function12;
                                    }
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1438075235, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsCard (NativeAdsBpsCard.kt:37)");
                                    }
                                    if (rearDisplayPresentationSessionPresenterImpl instanceof RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989154405);
                                        WindowAreaControllerImplExternalSyntheticLambda1.onWarmupCompleted((RearDisplayPresentationSessionPresenterImpl.IAuthTabCallbackStub) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, function04, function24, z3, function17, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 4194302, 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else if (rearDisplayPresentationSessionPresenterImpl instanceof RearDisplayPresentationSessionPresenterImpl.asBinder) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989142822);
                                        SafeWindowAreaComponentProviderExternalSyntheticLambda0.onNavigationEvent(-130437291, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{(RearDisplayPresentationSessionPresenterImpl.asBinder) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, function04, function24, Boolean.valueOf(z3), function17, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i3 & 4194302), 0}, 130437292, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else if (rearDisplayPresentationSessionPresenterImpl instanceof RearDisplayPresentationSessionPresenterImpl.onWarmupCompleted) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989131280);
                                        int i22 = i3 >> 3;
                                        WindowAreaControllerImplExternalSyntheticLambda2.onExtraCallback((RearDisplayPresentationSessionPresenterImpl.onWarmupCompleted) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, function24, z3, function17, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 1022) | (i22 & 7168) | (57344 & i22) | (i22 & 458752), 0);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    } else if (rearDisplayPresentationSessionPresenterImpl instanceof RearDisplayPresentationSessionPresenterImpl.onExtraCallback) {
                                        int i23 = onExtraCallback + 97;
                                        onNavigationEvent = i23 % 128;
                                        if (i23 % 2 == 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989121307);
                                            WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent((RearDisplayPresentationSessionPresenterImpl.onExtraCallback) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 26557) | ((i3 % 1) & 4068), 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989121307);
                                            WindowAreaControllerExternalSyntheticLambda0.onNavigationEvent((RearDisplayPresentationSessionPresenterImpl.onExtraCallback) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, z3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 1022) | ((i3 >> 6) & 7168), 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                    } else {
                                        if (!(rearDisplayPresentationSessionPresenterImpl instanceof RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989155455);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-989117176);
                                        Object[] objArr = {(RearDisplayPresentationSessionPresenterImpl.onExtraCallbackWithResult) rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport02, function16, Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i3 & 1022) | ((i3 >> 6) & 7168)), 0};
                                        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                                        WebViewRenderProcessImplExternalSyntheticLambda1.onExtraCallback(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), objArr, nSetPosition.onExtraCallbackWithResult(), 1035901062, -1035901061, iOnExtraCallbackWithResult);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    function15 = function16;
                                    function03 = function04;
                                    function23 = function24;
                                    function14 = function17;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    z2 = z3;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    function14 = function12;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                    function15 = function13;
                                    function03 = function02;
                                    function23 = function22;
                                    z2 = z;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsCardKt$$ExternalSyntheticLambda3
                                        private static int onExtraCallback = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i24 = 2 % 2;
                                            int i25 = onWarmupCompleted + 81;
                                            onExtraCallback = i25 % 128;
                                            int i26 = i25 % 2;
                                            Unit unitOnNavigationEvent = WebViewProviderAdapterExternalSyntheticLambda3.onNavigationEvent(rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport03, function15, function03, function23, z2, function14, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i27 = onWarmupCompleted + 35;
                                            onExtraCallback = i27 % 128;
                                            if (i27 % 2 == 0) {
                                                return unitOnNavigationEvent;
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
                            i3 |= 1572864;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    function22 = function2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function22 = function2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function22 = function2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function22 = function2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i3) != 599186, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1492778227);
        int i5 = i2 & 1;
        boolean z = true;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 109;
            onExtraCallback = i6 % 128;
            i3 = i6 % 2 != 0 ? i | 80 : i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i7 = onExtraCallback + 91;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ^ true ? 2 : 4) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            int i9 = onNavigationEvent + 57;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (i5 != 0) {
                int i11 = onNavigationEvent + 65;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallback + 23;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1492778227, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsAdLabel (NativeAdsBpsCard.kt:81)");
                    int i13 = 79 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1492778227, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsAdLabel (NativeAdsBpsCard.kt:81)");
                }
            }
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11);
            int i14 = ((i3 << 3) & 112) | 24582;
            Long lValueOf = Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1());
            Long lValueOf2 = Long.valueOf(jOnExtraCallback);
            Float fValueOf = Float.valueOf(0.0f);
            Integer numValueOf = Integer.valueOf(i14);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"AD", quirksExternalSyntheticBackport03, null, lValueOf, lValueOf2, 0L, null, null, null, fValueOf, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, numValueOf, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 23;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsCardKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    if (i19 == 0) {
                        int i20 = i;
                        int i21 = i2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {quirksExternalSyntheticBackport04, Integer.valueOf(i20), Integer.valueOf(i21), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        return (Unit) WebViewProviderAdapterExternalSyntheticLambda3.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1642691901, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1642691902, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                    }
                    int i22 = i;
                    int i23 = i2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {quirksExternalSyntheticBackport04, Integer.valueOf(i22), Integer.valueOf(i23), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    int i24 = 47 / 0;
                    return (Unit) WebViewProviderAdapterExternalSyntheticLambda3.onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr2, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1642691901, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1642691902, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, final boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        boolean z2;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        String str4 = str2;
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 123;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1894482084);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1894482084);
            if ((i & 6) != 0) {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    int i9 = onNavigationEvent + 61;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    int i11 = onExtraCallback + 69;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4);
                        throw null;
                    }
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 2048 : 1024;
                }
                z2 = false;
                if ((i3 & 1171) != 1170) {
                    int i12 = onNavigationEvent + 73;
                    onExtraCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        z2 = true;
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i4 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    if (i5 != 0) {
                        int i13 = onExtraCallback + 93;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        str4 = null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1894482084, i3, -1, "im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsRowBottomText (NativeAdsBpsCard.kt:103)");
                    }
                    hasProvider hasproviderOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str4, z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 3) & 896));
                    if (hasproviderOnExtraCallbackWithResult.length() > 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1649118735);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, quirksExternalSyntheticBackport03, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).RatingCompat1(), 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 112, 0, 262132);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1648977282);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    str3 = str4;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    str3 = str4;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.bps.NativeAdsBpsCardKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = 2 % 2;
                            int i15 = IAuthTabCallback + 15;
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnNavigationEvent = WebViewProviderAdapterExternalSyntheticLambda3.onNavigationEvent(str, z, quirksExternalSyntheticBackport04, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i17 = IAuthTabCallback + 45;
                            onWarmupCompleted = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 3 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = false;
            if ((i3 & 1171) != 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            int i14 = onNavigationEvent + 13;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            i6 = 4;
        } else {
            i6 = 2;
        }
        i3 = i6 | i;
        if ((i & 48) == 0) {
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = false;
        if ((i3 & 1171) != 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final hasProvider onExtraCallbackWithResult(String str, String str2, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int iOnNavigationEvent;
        String str3;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2058871018, i, -1, "im.toss.ads_sdk.ui.compose.bps.rememberBpsRowBottomText (NativeAdsBpsCard.kt:127)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        hasProvider hasproviderOnNavigationEvent = SafeWindowExtensionsProviderExternalSyntheticLambda1.onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, i & 14);
        hasProvider hasproviderOnExtraCallback = SafeWindowExtensionsProviderExternalSyntheticLambda1.onExtraCallback((str2 == null || StringsKt.isBlank(str2)) ? null : str2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
        long jRatingCompat1 = y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).RatingCompat1();
        long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(hasproviderOnNavigationEvent);
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(hasproviderOnExtraCallback);
        boolean z2 = (((i & 896) ^ 384) > 256 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z)) || (i & 384) == 256;
        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jRatingCompat1);
        boolean zOnWarmupCompleted2 = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z2 | zOnNavigationEvent | zOnNavigationEvent2 | zOnWarmupCompleted | zOnWarmupCompleted2)) {
            int i5 = onExtraCallback + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
                iAuthTabCallback.onExtraCallbackWithResult(hasproviderOnNavigationEvent);
                if (hasproviderOnExtraCallback != null) {
                    iAuthTabCallback.onWarmupCompleted(' ');
                    iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(jRatingCompat1, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, bindChildren.Companion.onExtraCallback(), (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 61436, (DefaultConstructorMarker) null));
                    try {
                        iAuthTabCallback.onExtraCallbackWithResult(hasproviderOnExtraCallback);
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (z) {
                    iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(jLongValue, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        if (iAuthTabCallback.onExtraCallback() == 0) {
                            int i7 = onExtraCallback + 87;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            str3 = "AD";
                        } else {
                            str3 = " · AD";
                        }
                        iAuthTabCallback.IAuthTabCallback(str3);
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                objOnMinimized = iAuthTabCallback.onExtraCallbackWithResult();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        hasProvider hasprovider = (hasProvider) objOnMinimized;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return hasprovider;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1642691901, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1642691902, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(RearDisplayPresentationSessionPresenterImpl rearDisplayPresentationSessionPresenterImpl, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, Function0 function0, Function2 function2, boolean z, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {rearDisplayPresentationSessionPresenterImpl, quirksExternalSyntheticBackport0, function1, function0, function2, Boolean.valueOf(z), function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onNavigationEvent(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 77559216, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -77559216, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }
}
