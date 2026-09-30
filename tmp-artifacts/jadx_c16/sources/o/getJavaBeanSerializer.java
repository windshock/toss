package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdQRFailActivityKt$;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getJavaBeanSerializer {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final getJavaBeanSerializer IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = null;
    private static int onTransact = 1;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        return unitOnNavigationEvent;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i4 = i2 + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i4 = i3 + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        IAuthTabCallback = new getJavaBeanSerializer();
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(250888195, false, new ComposableSingletons$MobileIdQRFailActivityKt$.ExternalSyntheticLambda0());
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-863103151, false, new ComposableSingletons$MobileIdQRFailActivityKt$.ExternalSyntheticLambda1());
        int i = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = asInterface + 79;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(250888195, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdQRFailActivityKt.lambda$250888195.<anonymous> (MobileIdQRFailActivity.kt:64)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(250888195, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdQRFailActivityKt.lambda$250888195.<anonymous> (MobileIdQRFailActivity.kt:64)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 37;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i5 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = asInterface + 39;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = asInterface + 97;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 22) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                    int i6 = onTransact + 47;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-863103151, i3, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdQRFailActivityKt.lambda$-863103151.<anonymous> (MobileIdQRFailActivity.kt:94)");
            }
            immediateFailedFuture immediatefailedfutureOnNavigationEvent = ResourceSizeKt.onNavigationEvent(immediateFailedFuture.Companion, 1.0f);
            Object[] objArr = new Object[1];
            a(new char[]{19, 14, 14, '\t', '\n', 17, 13859, 13859, 14, 7, 19, 7, 21, 4, 14, '\b', 2, '\n', '\r', 14, 22, 4, 15, 23, 4, 5, 14, 4, '\f', '\r', 16, '\r', 13910, 13910, 3, 5, 6, 15, 7, '\n', 0, 1, 5, 6, 19, 2, 1, '\b', 14, 3, 1, '\b'}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 110), 52 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, (QuirkSettingsLoader) null, immediatefailedfutureOnNavigationEvent, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 24582, 46);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onTransact + 115;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = asInterface + 95;
        onTransact = i10 % 128;
        if (i10 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 81;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23140 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26, 23138 - ImageFormat.getBitsPerPixel(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i6 = $11 + 63;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i7 = $10 + 17;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - KeyEvent.keyCodeFromString("")), 74 - View.MeasureSpec.getMode(0), 8088 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback5 == null) {
                                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Process.getGidForName("") + 31, TextUtils.getOffsetBefore("", 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                            } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else {
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i13 = 0; i13 < i; i13++) {
                int i14 = $10 + 25;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr4[i13] = (char) (cArr4[i13] ^ 13722);
            }
            String str = new String(cArr4);
            int i16 = $10 + 59;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{64988, 64976, 64990, 64989, 64963, 64926, 64980, 64979, 64961, 64967, 64983, 64982, 64960, 64925, 64987, 64905, 64897, 64978, 64924, 64981, 64991, 64977, 65064, 65065, 64986};
        onExtraCallback = (char) 51244;
    }
}
