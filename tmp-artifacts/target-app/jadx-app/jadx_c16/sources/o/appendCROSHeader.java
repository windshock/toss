package o;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightAlarmActivityKt$;
import im.toss.features.loan.ui.R;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyDestinationUri;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class appendCROSHeader {
    private static getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static byte[] IAuthTabCallbackDefault;
    private static short[] IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static int asBinder;
    private static int asInterface;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final appendCROSHeader onWarmupCompleted;
    private static final byte[] $$a = {74, 75, -50, -9};
    private static final int $$b = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int onTransact = 0;
    private static int getInterfaceDescriptor = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3;
        int i4 = (b2 * 4) + 4;
        int i5 = 115 - (b * 3);
        byte[] bArr = $$a;
        int i6 = (i * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5 += i4;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i4;
            i4 = bArr[i4];
            i5 += i4;
            i4 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 51;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 59;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 53;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 39;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i4 = i2 + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<y1ExternalSyntheticLambda3, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i4 = i3 + 65;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return getbacktracenote;
    }

    private static final Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            int i3 = getInterfaceDescriptor + 81;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i5 = onTransact + 15;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1811879479, i, -1, "im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightAlarmActivityKt.lambda$1811879479.<anonymous> (LoanComparisonMidnightAlarmActivity.kt:112)");
            }
            Object[] objArr = new Object[1];
            a((short) (KeyEvent.normalizeMetaState(0) - 88), (byte) ((-111) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0') + 625168052, (-771721067) - (ViewConfiguration.getJumpTapTimeout() >> 16), (-34) - TextUtils.getCapsMode("", 0, 0), objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 3;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 92) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-135323135, i2, -1, "im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightAlarmActivityKt.lambda$-135323135.<anonymous> (LoanComparisonMidnightAlarmActivity.kt:108)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = getInterfaceDescriptor + 77;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onExtraCallback();
        onWarmupCompleted = new appendCROSHeader();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1966789263, false, new ComposableSingletons$LoanComparisonMidnightAlarmActivityKt$.ExternalSyntheticLambda0());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1811879479, false, new ComposableSingletons$LoanComparisonMidnightAlarmActivityKt$.ExternalSyntheticLambda1());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-135323135, false, new ComposableSingletons$LoanComparisonMidnightAlarmActivityKt$.ExternalSyntheticLambda2());
        int i = access100 + 103;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i5 = onTransact + 121;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = getInterfaceDescriptor + 65;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 3;
                }
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = getInterfaceDescriptor + 121;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1966789263, i2, -1, "im.toss.features.loan.comparison.midnight.ComposableSingletons$LoanComparisonMidnightAlarmActivityKt.lambda$1966789263.<anonymous> (LoanComparisonMidnightAlarmActivity.kt:130)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_comparison_midnight_alarm_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 6}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43424), AndroidCharacter.getMirror('0') - 6, 22438 - TextUtils.indexOf((CharSequence) "", '0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            if (i8 != 0) {
                byte[] bArr2 = IAuthTabCallbackDefault;
                if (bArr2 != null) {
                    int i9 = $11 + 123;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", c, 0)), 55 - TextUtils.getOffsetBefore("", 0), 2167 - TextUtils.getTrimmedLength(""), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = '0';
                    }
                    int i10 = $11 + 9;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 3 / 5;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr3 = IAuthTabCallbackDefault;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, View.MeasureSpec.getSize(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - (-4629411779493505016L))) - ((int) (asBinder | (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = IAuthTabCallbackDefault;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 43, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (asBinder ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 11;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i8;
                try {
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asInterface), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 86 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = IAuthTabCallbackDefault;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr6[i15] = (byte) (bArr5[i15] ^ (-4629411779493505016L));
                        }
                        int i16 = $10 + 77;
                        $11 = i16 % 128;
                        i4 = 2;
                        int i17 = i16 % 2;
                        bArr5 = bArr6;
                    } else {
                        i4 = 2;
                    }
                    if (bArr5 != null) {
                        int i18 = $10 + 53;
                        $11 = i18 % 128;
                        int i19 = i18 % i4;
                        z = true;
                    } else {
                        int i20 = $10 + 85;
                        $11 = i20 % 128;
                        int i21 = i20 % i4;
                        z = false;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i22 = $11 + 29;
                        $10 = i22 % 128;
                        if (i22 % 2 != 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr7 = IAuthTabCallbackDefault;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = IAuthTabCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onExtraCallback() {
        onNavigationEvent = 2130405701;
        asBinder = -1538795479;
        asInterface = -1984405541;
        IAuthTabCallbackDefault = new byte[]{30, -51, -50, -5, 14, -65, -50, -79, -45, -10, -116, -29, 35, 118, -22, -73, -27, -29, -11, -117, -7, -50, -6, -79, 33, -114, -4, -50, -73, -30, -25, -31, 15, -96, -26, 9, -119, -30, -26, -55, 36, -71, -56, -73, -47, -33, -29, 38, -30, -73, -91, -31, -50, -30, -2};
    }
}
