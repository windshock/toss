package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getExifOrientation;
import o.handleNativeAdClick;
import o.r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto;
import o.r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw;
import o.wa;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getExifOrientation {
    public static final getExifOrientation IAuthTabCallback;
    private static char asInterface;
    private static int onExtraCallback;
    private static getBacktraceNote<r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static int onTransact;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {108, -1, ISO7816.INS_UPDATE_RECORD, 99};
    private static final int $$b = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2 = 3 - (s * 3);
        int i3 = s3 * 2;
        int i4 = 110 - s2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i2;
            int i7 = i5;
            int i8 = 0;
            int i9 = i2 + i7;
            i = i8;
            int i10 = i6;
            i4 = i9;
            i2 = i10;
            bArr2[i] = (byte) i4;
            int i11 = i2 + 1;
            i8 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i6 = i11;
            i2 = bArr[i11];
            i7 = i12;
            int i92 = i2 + i7;
            i = i8;
            int i102 = i6;
            i4 = i92;
            i2 = i102;
            bArr2[i] = (byte) i4;
            int i112 = i2 + 1;
            i8 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            int i1122 = i2 + 1;
            i8 = i + 1;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 96 / 0;
        }
        int i6 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i2 + 25;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i4 = i3 + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    static {
        onTransact = 1;
        IAuthTabCallback();
        IAuthTabCallback = new getExifOrientation();
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1890677910, false, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.component.ComposableSingletons$OverseasKoreanNfcBlockBottomSheetKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getExifOrientation.onWarmupCompleted((r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1945186533, false, new getBacktraceNote() { // from class: viva.republica.toss.guest.certify.component.ComposableSingletons$OverseasKoreanNfcBlockBottomSheetKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return getExifOrientation.onExtraCallbackWithResult((r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            }
        });
        int i = asBinder + 109;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambda_moq0nysrol1o0qmavnpwgoovto, BuildConfig.FLAVOR);
            if ((i & 115) == 0) {
                int i6 = IAuthTabCallbackStub + 117;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda_moq0nysrol1o0qmavnpwgoovto)) {
                    int i8 = IAuthTabCallbackDefault + 61;
                    IAuthTabCallbackStub = i8 % 128;
                    i2 = i8 % 2 != 0 ? 3 : 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambda_moq0nysrol1o0qmavnpwgoovto, BuildConfig.FLAVOR);
            if ((i & 6) == 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallbackStub + 49;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1890677910, i3, -1, "viva.republica.toss.guest.certify.component.ComposableSingletons$OverseasKoreanNfcBlockBottomSheetKt.lambda$1890677910.<anonymous> (OverseasKoreanNfcBlockBottomSheet.kt:26)");
            }
            r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.onboarding_overseas_korean_nfc_block_sheet_header_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.onboarding_overseas_korean_nfc_block_sheet_header_description, cameraCaptureResultEmptyCameraCaptureResult, 0), (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 458752 & (i3 << 15), 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallbackStub + 91;
                IAuthTabCallbackDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 80 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i13 = IAuthTabCallbackStub + 103;
                IAuthTabCallbackDefault = i13 % 128;
                int i14 = i13 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, BuildConfig.FLAVOR);
        if ((i & 17) != 16) {
            int i5 = IAuthTabCallbackStub + 69;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackDefault + 57;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1945186533, i, -1, "viva.republica.toss.guest.certify.component.ComposableSingletons$OverseasKoreanNfcBlockBottomSheetKt.lambda$1945186533.<anonymous> (OverseasKoreanNfcBlockBottomSheet.kt:42)");
            }
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Image;
            handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(250.0f));
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            Object[] objArr = new Object[1];
            a((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22954), 1290132514 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{10518, 26472, 57945, 959, 44544, 15238, 24524, 38595, 24536, 51569, 24339, 25554, 43989, 57327, 21437, 16892, 44914, 41171, 37666, 62644, 21802, 58201, 29941, 54762, 25311, 13999, 34862, 19191, 64548, 51154, 1834, 47557, 47860, 48768, 21780, 17068, 49311, 57797, 18183, 23161, 52046, 7515, 43522, 23026, 34014, 55736, 24976, 15140, 37847, 4946, 10898, 8303, 59478, 16197, 24783}, new char[]{0, 0, 0, 0}, new char[]{8478, 58844, 43596, 31577}, objArr);
            setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0OnExtraCallback, onWarmupCompleted2, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3510, 0, 8176);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 87;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iRgb = (-16777173) - Color.rgb(0, 0, 0);
                    int iIndexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1451;
                    byte b = (byte) ($$a[1] + 1);
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(tapTimeout, iRgb, iIndexOf, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 49123);
                    int maximumFlingVelocity = 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int maxKeyCode = 1494 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b3 = $$a[1];
                    byte b4 = (byte) (b3 + 1);
                    byte b5 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, maximumFlingVelocity, maxKeyCode, 1533236389, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)), View.resolveSizeAndState(0, 0, 0) + 50, 22939 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 29 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 12577 - (Process.myTid() >> 22), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 47;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 7798559133331975163L;
        onExtraCallback = -1776194565;
        asInterface = (char) 51129;
    }
}
