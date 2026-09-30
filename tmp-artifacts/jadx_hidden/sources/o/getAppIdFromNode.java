package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.devtool.runtime.ui.scheme.history.compose.SchemeHistoryItemKt$;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode61;

/* loaded from: classes.dex */
public final class getAppIdFromNode {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback = {32285, 32273, 32464, 32266, 32279, 32267, 32282, 32281, 32264, 32274, 32276, 32265, 32272, 32283, 32286, 32269, 32278, 32491, 32510, 32509, 32422, 32478, 32275, 32460, 32469, 32463, 32477, 32450, 32485, 32448, 32468, 32461, 32459, 48721, 46754, 32471, 32455, 32449, 32280, 32507, 32473, 32472, 32497};
    private static int onNavigationEvent = -1184334202;
    private static boolean onExtraCallbackWithResult = true;
    private static boolean onWarmupCompleted = true;
    private static long IAuthTabCallback = 2345278066944264379L;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = asInterface + 125;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 37;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(i, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(i, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, int i, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 53;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, i, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 95 / 0;
        }
        int i7 = asInterface + 67;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 26 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(int i, String str, String str2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 99;
        asInterface = i6 % 128;
        onNavigationEvent(i, str, str2, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i6 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 119;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 3;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, str);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, str);
        int i3 = asInterface + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, String str, String str2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = asInterface + 83;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return onExtraCallback(i, str, str2, function1, quirksExternalSyntheticBackport0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onExtraCallback(i, str, str2, function1, quirksExternalSyntheticBackport0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, i);
        if (i4 == 0) {
            int i5 = 0 / 0;
        }
        int i6 = asInterface + 103;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i6);
        int i8 = ~((~i) | i6);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i6) | i3)) | i7;
        int i11 = i6 + i3 + i4 + ((-1814252664) * i2) + (2073254503 * i5);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i6) + 1943797760 + (1745420935 * i3) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i4) + ((-1631584256) * i2) + ((-1368915968) * i5) + ((-1053032448) * i12);
        int i14 = (i6 * (-1919122223)) + 1408767311 + (i3 * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i4 * (-1919121629)) + (i2 * (-390511720)) + (i5 * 1804971285) + (i12 * 255066112);
        int i15 = i13 + (i14 * i14 * 379846656);
        if (i15 != 1) {
            return i15 != 2 ? i15 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }
        AppNode61 appNode61 = (AppNode61) objArr[0];
        int i16 = 2 % 2;
        int i17 = asInterface + 49;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        Intrinsics.checkNotNullParameter(appNode61, "");
        Unit unit = Unit.INSTANCE;
        int i19 = IAuthTabCallbackStub + 39;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 115;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, str);
        int i4 = IAuthTabCallbackStub + 23;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AppNode61 appNode61 = (AppNode61) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appNode61);
        int i4 = asInterface + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function1 function1, String str) {
        int i = 2 % 2;
        function1.invoke(new AppNode61.onExtraCallback(str));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, String str) {
        int i = 2 % 2;
        function1.invoke(new AppNode61.onNavigationEvent(str));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(int r12, o.w3b r13, o.CameraCaptureResultEmptyCameraCaptureResult r14, int r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppIdFromNode.onWarmupCompleted(int, o.w3b, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(java.lang.String r34, androidx.compose.foundation.layout.RowScope r35, o.CameraCaptureResultEmptyCameraCaptureResult r36, int r37) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppIdFromNode.IAuthTabCallback(java.lang.String, androidx.compose.foundation.layout.RowScope, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    private static final Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackStub + 107;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackStub + 123;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-101, -97, -95, -104, -124, -105, -125, -126, -120, -124, -108, -112, -117, -123, -124, -122, -127, -109, -120, -126, -120, -113, -114, -110, -106, -107, -98, -122, -116, -123, -126, -112, -115, -123, -115, -99, -100, -125, -98, -122, -116, -123, -126, -112, -115, -123, -115, -99, -100, -125, -126, -120, -124, -108, -112, -117, -123, -124, -122, -127, -109, -120, -126, -120, -113, -114, -110, -125, -120, -122, -123, -111, -126, -123, -114, -125, -112, -117, -123, -124, -122, -127, -113, -125, -120, -126, -120, -113, -114, -122, -125, -127, -116, -125, -120, -126, -127, -124, -115, -116, -117, -125, -118, -123, -123, -124, -119, -120, -121, -125, -122, -122, -123, -124, -125, -126, -127}, 105 >>> (KeyEvent.getMaxKeyCode() - 61), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(965936688, i, -1, ((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a(null, null, new byte[]{-101, -97, -95, -104, -124, -105, -125, -126, -120, -124, -108, -112, -117, -123, -124, -122, -127, -109, -120, -126, -120, -113, -114, -110, -106, -107, -98, -122, -116, -123, -126, -112, -115, -123, -115, -99, -100, -125, -98, -122, -116, -123, -126, -112, -115, -123, -115, -99, -100, -125, -126, -120, -124, -108, -112, -117, -123, -124, -122, -127, -109, -120, -126, -120, -113, -114, -110, -125, -120, -122, -123, -111, -126, -123, -114, -125, -112, -117, -123, -124, -122, -127, -113, -125, -120, -126, -120, -113, -114, -122, -125, -127, -116, -125, -120, -126, -127, -124, -115, -116, -117, -125, -118, -123, -123, -124, -119, -120, -121, -125, -122, -122, -123, -124, -125, -126, -127}, (KeyEvent.getMaxKeyCode() >> 16) + 127, objArr2);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(965936688, i, -1, ((String) objArr2[0]).intern());
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = asInterface + 99;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = IAuthTabCallbackStub + 41;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asInterface + 101;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                b(new char[]{57846, 47804, 7419, 57759, 62362, 35174, 31675, 26827, 12101, 47196, 10946, 39349, 31786, 27574, 6571, 52019, 36109, 6808, 51349, 62477, 56052, 54766, 48715, 9595, 60371, 34002, 27940, 22213, 14507, 46602, 23619, 34724, 18833, 24943, 5100, 45278, 38771, 4101, 49885, 57846, 42041, 50107, 45502, 4873, 62743, 62173, 24734, 23624, 751, 44519, 22134, 36208, 21443, 23701, 1302, 48780, 24754, 3642, 62476, 61358, 45494, 14698, 44030, 6339, 65405, 59477, 39632, 18906, 3138, 39854, 18872, 31569, 23894, 19086, 14495, 42036, 27360, 1514, 61040, 54632, 48087, 13508, 56583, 1731, 51438, 58888, 35846, 14247, 6559, 37138, 17380, 24803, 10103, 16464, 13017, 37368, 29760, 29630, 57728, 49927, 34099, 8838, 53467, 3124, 54014, 56757, 34339, 15628, 58247}, 1 - TextUtils.indexOf("", ""), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1576871547, i, -1, ((String) objArr[0]).intern());
            }
            w5a.onExtraCallback(new Object[]{w5aVar, ForwardingCameraControl.onExtraCallback(-1180629777, true, new SchemeHistoryItemKt$.ExternalSyntheticLambda7(str), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(965936688, true, new SchemeHistoryItemKt$.ExternalSyntheticLambda8(str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function1 function1, int i) {
        int i2 = 2 % 2;
        function1.invoke(new AppNode61.onWarmupCompleted(i));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 15;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallback(java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppIdFromNode.onExtraCallback(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onNavigationEvent(int r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull java.lang.String r33, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super o.AppNode61, kotlin.Unit> r34, @org.jetbrains.annotations.Nullable o.QuirksExternalSyntheticBackport0 r35, @org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppIdFromNode.onNavigationEvent(int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, o.QuirksExternalSyntheticBackport0, o.CameraCaptureResultEmptyCameraCaptureResult, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r14
      0x0025: PHI (r14v8 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r14
      0x0023: PHI (r14v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r14v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r14v9 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onNavigationEvent(@org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r14, int r15) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppIdFromNode.onNavigationEvent(o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 17;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, IAuthTabCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $10 + 73;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i6 = 62 / 0;
            objArr[0] = str;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = $10 + 75;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i3]);
            }
            cArr2 = cArr3;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
        if (onWarmupCompleted) {
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 69;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ Unit onNavigationEvent(AppNode61 appNode61) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1732813197, new Object[]{appNode61}, iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1732813195);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2109740422, objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2109740419);
    }

    private static final Unit onExtraCallback(Function1 function1, int i, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {function1, Integer.valueOf(i), rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -438238384, objArr, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 438238384);
    }

    private static final Unit IAuthTabCallback(AppNode61 appNode61) {
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 1416424266, new Object[]{appNode61}, iOnExtraCallbackWithResult2, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1416424265);
    }
}
