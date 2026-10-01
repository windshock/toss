package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeGlobalActivationLuckyLotteryKt$;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.setActivityClz;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getShort {
    private static int $10 = 0;
    private static int $11 = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final getShort onNavigationEvent;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = onTransact + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $11 + 23;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) + 26, (ViewConfiguration.getFadingEdgeLength() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j2 = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), Drawable.resolveOpacity(0, 0) + 26, 23139 - (ViewConfiguration.getTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        j = j2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24824), 73 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8089, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    j = 0;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 19488 - TextUtils.getTrimmedLength(""), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    j = 0;
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i8];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i9 = $11 + 101;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    j2 = j;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static {
        onExtraCallbackWithResult();
        onNavigationEvent = new getShort();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1105459832, false, new ComposableSingletons$HomeGlobalActivationLuckyLotteryKt$.ExternalSyntheticLambda1());
        int i = asInterface + 33;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return unit2;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onTransact + 63;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 105;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = onExtraCallbackWithResult + 45;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i10 = onExtraCallbackWithResult + 71;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1105459832, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeGlobalActivationLuckyLotteryKt.lambda$1105459832.<anonymous> (HomeGlobalActivationLuckyLottery.kt:363)");
            }
            Object[] objArr = new Object[1];
            a(new char[]{7, 11, 17, '\f', '\t', 18, 13776, 13776, 7, '\r', 17, '\r', 15, 2, 17, 11, 18, 5, 6, 18, 19, '\f', '\f', 15, 13841, 13841, 23, 5, '\r', 7, '\f', 15, 22, 11, 20, '\b', 7, 15, 23, '\t', 0, 5, 3, 20, 13828, 13828, 17, 6, 24, 6}, (byte) (27 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 50, objArr);
            setActivityClz.onNavigationEvent onnavigationevent = new setActivityClz.onNavigationEvent(((String) objArr[0]).intern(), (String) null);
            Object[] objArr2 = new Object[1];
            a(new char[]{5, 23, '\b', 22, 2, 14, 18, 5, '\t', 18, 13858, 13858}, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 109), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresult = new setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult(onnavigationevent, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(new char[]{7, 11, 17, '\f', '\t', 18, 13783, 13783, 7, '\r', 17, '\r', 15, 2, 17, 11, 18, 5, 6, 18, 19, '\f', '\f', 15, 13848, 13848, 23, 5, '\r', 7, '\f', 15, 22, 11, 20, '\b', 7, 15, 4, 19, 16, 20, 3, '\b', 17, 6, 24, 6}, (byte) (34 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.normalizeMetaState(0) + 48, objArr3);
            setActivityClz.onNavigationEvent onnavigationevent2 = new setActivityClz.onNavigationEvent(((String) objArr3[0]).intern(), (String) null);
            Object[] objArr4 = new Object[1];
            a(new char[]{5, 23, '\b', 22, 2, 14, 18, 5, '\t', 18, 13858, 13858}, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 109), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
            setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresult2 = new setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult(onnavigationevent2, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a(new char[]{7, 11, 17, '\f', '\t', 18, 13778, 13778, 7, '\r', 17, '\r', 15, 2, 17, 11, 18, 5, 6, 18, 19, '\f', '\f', 15, 13843, 13843, 23, 5, '\r', 7, '\f', 15, 22, 11, 20, '\b', 7, 15, 20, '\t', 16, '\n', 21, 18, 6, 22, 13850}, (byte) (29 - Color.argb(0, 0, 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 48, objArr5);
            setActivityClz.onNavigationEvent onnavigationevent3 = new setActivityClz.onNavigationEvent(((String) objArr5[0]).intern(), (String) null);
            Object[] objArr6 = new Object[1];
            a(new char[]{5, 23, '\b', 22, 2, 14, 18, 5, '\t', 18, 13858, 13858}, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 108), 12 - Drawable.resolveOpacity(0, 0), objArr6);
            List listListOf = CollectionsKt.listOf(new setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult[]{onextracallbackwithresult, onextracallbackwithresult2, new setActivityClz.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult(onnavigationevent3, ((String) objArr6[0]).intern())});
            Object[] objArr7 = new Object[1];
            a(new char[]{5, 23, '\b', 22, 2, 14, 18, 5, '\t', 18, 13858, 13858}, (byte) (KeyEvent.getDeadChar(0, 0) + 109), 12 - TextUtils.getOffsetAfter("", 0), objArr7);
            setActivityClz.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult3 = new setActivityClz.onWarmupCompleted.onExtraCallbackWithResult("Your Daily Fortune is ready", "Reveal and earn points", ((String) objArr7[0]).intern(), listListOf);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ComposableSingletons$HomeGlobalActivationLuckyLotteryKt$.ExternalSyntheticLambda0();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSystemExtension.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -868692651, 868692652, new Object[]{onextracallbackwithresult3, (Function1) objOnMinimized, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 4});
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{64976, 64981, 64979, 64970, 64961, 64991, 64987, 64963, 64960, 64980, 64924, 64965, 64967, 65065, 64990, 64988, 64925, 64986, 64978, 64905, 64966, 64989, 64983, 64982, 64926};
        onExtraCallback = (char) 51244;
    }
}
