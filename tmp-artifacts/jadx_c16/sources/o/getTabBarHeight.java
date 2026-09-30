package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt$;
import im.toss.features.payment.ui.autopay.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getTabBarHeight {
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static char asBinder;
    private static long asInterface;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    public static final getTabBarHeight onNavigationEvent;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {104, -2, 24, -74};
    private static final int $$b = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int onTransact = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 110 - s2;
        int i5 = 4 - (i * 4);
        int i6 = (s * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8;
            int i10 = i7 + 1;
            i2 = i3;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            int i11 = i4;
            i7 = i5;
            i5 = i11;
            int i92 = i5 + i8;
            int i102 = i7 + 1;
            i2 = i3;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            getbacktracenote = onExtraCallback;
            int i4 = 84 / 0;
        } else {
            getbacktracenote = onExtraCallback;
        }
        int i5 = i3 + 69;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 111;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return asInterface(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asInterface(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 3;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i8 | i4));
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i3 | i));
        int i12 = i3 | i;
        int i13 = i10 | i12;
        int i14 = (~(i4 | i3)) | (~i12);
        int i15 = i3 + i + i2 + (1068639271 * i5) + ((-1919980423) * i6);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1648758371) - 594280448) + (1648758371 * i) + (i11 * (-226102882)) + ((-226102882) * i13) + (226102882 * i14) + (1422655488 * i2) + ((-1693188096) * i5) + (611057664 * i6) + ((-810221568) * i16);
        int i18 = (i3 * 982247175) + 1844138806 + (i * 982247175) + (i11 * (-762)) + (i13 * (-762)) + (i14 * 762) + (i2 * 982246413) + (i5 * 1533776379) + (i6 * 1016546853) + (i16 * (-1070530560));
        int i19 = i17 + (i18 * i18 * 1708326912);
        return i19 != 1 ? i19 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 63;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 23;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onTransact + 99;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 95;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getInterfaceDescriptor + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i5 = i3 + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i5 = i3 + 99;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 19;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i2 + 5;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallbackDefault;
        int i4 = i3 + 21;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    static {
        IAuthTabCallback_Parcel = 1;
        IAuthTabCallbackDefault();
        onNavigationEvent = new getTabBarHeight();
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(129851923, false, new ComposableSingletons$AccountTerminateDevToolActivityKt$.ExternalSyntheticLambda0());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1881500750, false, new ComposableSingletons$AccountTerminateDevToolActivityKt$.ExternalSyntheticLambda1());
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1895297961, false, new ComposableSingletons$AccountTerminateDevToolActivityKt$.ExternalSyntheticLambda2());
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1018785686, false, new ComposableSingletons$AccountTerminateDevToolActivityKt$.ExternalSyntheticLambda3());
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1742981612, false, new ComposableSingletons$AccountTerminateDevToolActivityKt$.ExternalSyntheticLambda4());
        int i = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i4 = getInterfaceDescriptor + 99;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 9;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(129851923, i2, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$129851923.<anonymous> (AccountTerminateDevToolActivity.kt:84)");
                int i8 = onTransact + 59;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, "계좌해지 서비스 Debug Tools", null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 6), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getInterfaceDescriptor + 93;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getInterfaceDescriptor + 121;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 109;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1881500750, i2, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$-1881500750.<anonymous> (AccountTerminateDevToolActivity.kt:91)");
            }
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52527), KeyEvent.keyCodeFromString("") + 248515966, new char[]{29643, 51135, 59978, 57973, 18715, 20825, 40709, 5029, 42629, 34181, 16110, 312, 12558, 25354, 55873, 25761, 23584, 12958, 51076, 46803, 19757, 57723, 27112, 43788, 57173, 9340, 55807, 6754, 57180}, new char[]{0, 0, 0, 0}, new char[]{32344, 53261, 12046, 20685}, objArr);
            w5aVar.IAuthTabCallback("계좌해지 페이지 바로가기", ((String) objArr[0]).intern(), (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getInterfaceDescriptor + 51;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onTransact + 23;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i4 = onTransact + 31;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                int i6 = onTransact + 49;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i8 = getInterfaceDescriptor + 65;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1895297961, i, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$1895297961.<anonymous> (AccountTerminateDevToolActivity.kt:104)");
            }
            w5aVar.onExtraCallbackWithResult("계좌해지 서비스 점검, 운영시간 무시", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onTransact + 99;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 7;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 127) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getInterfaceDescriptor + 77;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1018785686, i, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$-1018785686.<anonymous> (AccountTerminateDevToolActivity.kt:117)");
                    int i5 = 10 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1018785686, i, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$-1018785686.<anonymous> (AccountTerminateDevToolActivity.kt:117)");
                }
            }
            w5aVar.IAuthTabCallback("해지 가능 여부 조회 모킹", "활성화 후 아래에서 선택", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 81;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 59;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 43 - Color.green(0), 1451 - Color.red(0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 49123), 44 - ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23973 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 51, TextUtils.getCapsMode("", 0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 45849), View.combineMeasuredStates(0, 0) + 29, (-16764639) - Color.rgb(0, 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 59;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onTransact + 41;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= !(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ^ true) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = onTransact + 105;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i7 = getInterfaceDescriptor + 115;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1742981612, i, -1, "im.toss.features.account_terminator.ui.devtool.ComposableSingletons$AccountTerminateDevToolActivityKt.lambda$1742981612.<anonymous> (AccountTerminateDevToolActivity.kt:145)");
            }
            w5aVar.IAuthTabCallback("해지 및 잔고이전 실행 모킹", "활성화 후 아래에서 선택", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(-1486301100, R.onWarmupCompleted(), new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1486301100, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(226337826, R.onWarmupCompleted(), new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -226337825, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted());
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (getBacktraceNote) onExtraCallback(290243263, R.onWarmupCompleted(), new Object[]{this}, -290243261, iOnWarmupCompleted, R.onWarmupCompleted(), R.onWarmupCompleted());
    }

    static void IAuthTabCallbackDefault() {
        asInterface = 7798559133331975163L;
        IAuthTabCallbackStub = 757645723;
        asBinder = (char) 27643;
    }
}
