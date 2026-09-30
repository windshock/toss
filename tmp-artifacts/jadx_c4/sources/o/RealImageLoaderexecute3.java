package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RealImageLoaderexecute3;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderexecute3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onNavigationEvent = -6058782346868337847L;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(long j, String str, Map map, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 21;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(j, str, map, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 105;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 85 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, setDetectableSize);
        int i4 = onWarmupCompleted + 51;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = onWarmupCompleted + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, String str, Map map, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(j, str, map, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 27;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 47 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, String str, Map map, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(j, str, map, function1);
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "screen");
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(long j, String str, Map map, final Function1 function1) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, str, map, new Function1() { // from class: im.toss.components.compose.extensions.TrackerKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = RealImageLoaderexecute3.onExtraCallback(function1, (SetDetectableSize) obj);
                int i5 = onExtraCallback + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 2, null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(final long j, @Nullable String str, @Nullable Map<String, ?> map, @Nullable Function1<? super SetDetectableSize, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        Map<String, ?> map2;
        int i4;
        Function1<? super SetDetectableSize, Unit> function12;
        boolean z;
        String str2;
        final Function1<? super SetDetectableSize, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function1<? super SetDetectableSize, Unit> function14;
        boolean z2;
        boolean z3;
        boolean zOnExtraCallback;
        boolean z4;
        String strIntern = str;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1257266851);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            int i7 = onWarmupCompleted + 65;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i9 = onWarmupCompleted + 85;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIntern);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIntern) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            int i11 = IAuthTabCallback + 27;
            onWarmupCompleted = i11 % 128;
            i3 = i11 % 2 != 0 ? i3 | 8612 : i3 | 384;
        } else {
            if ((i & 384) == 0) {
                map2 = map;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170) {
                    int i12 = onWarmupCompleted + 43;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    int i14 = onWarmupCompleted + 5;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    if (i6 != 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{54813, 22844, 51286, 31644}, 36654 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                        strIntern = ((String) objArr[0]).intern();
                    }
                    Map<String, ?> map3 = i10 != 0 ? null : map2;
                    if (i4 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.components.compose.extensions.TrackerKt$$ExternalSyntheticLambda0
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj) {
                                    int i15 = 2 % 2;
                                    int i16 = onExtraCallbackWithResult + 91;
                                    IAuthTabCallback = i16 % 128;
                                    Object obj2 = null;
                                    SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
                                    if (i16 % 2 != 0) {
                                        RealImageLoaderexecute3.onExtraCallback(setDetectableSize);
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnExtraCallback = RealImageLoaderexecute3.onExtraCallback(setDetectableSize);
                                    int i17 = onExtraCallbackWithResult + 91;
                                    IAuthTabCallback = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return unitOnExtraCallback;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function14 = (Function1) objOnMinimized;
                    } else {
                        function14 = function12;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1257266851, i3, -1, "im.toss.components.compose.extensions.ScreenLog (Tracker.kt:15)");
                        int i15 = IAuthTabCallback + 53;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 2 % 3;
                        }
                    }
                    TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START;
                    if ((i3 & 14) == 4) {
                        int i17 = IAuthTabCallback + 93;
                        onWarmupCompleted = i17 % 128;
                        if (i17 % 2 == 0) {
                            z2 = true;
                        }
                        z3 = (i3 & 112) != 32;
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map3);
                        z4 = (i3 & 7168) == 2048;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z4 | z2 | z3 | zOnExtraCallback) {
                            int i18 = IAuthTabCallback + 113;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            Object obj = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                final String str3 = strIntern;
                                final Map<String, ?> map4 = map3;
                                final Function1<? super SetDetectableSize, Unit> function15 = function14;
                                Function0 function0 = new Function0() { // from class: im.toss.components.compose.extensions.TrackerKt$$ExternalSyntheticLambda1
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i19 = 2 % 2;
                                        int i20 = onNavigationEvent + 43;
                                        onExtraCallbackWithResult = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            return RealImageLoaderexecute3.onNavigationEvent(j, str3, map4, function15);
                                        }
                                        int i21 = 27 / 0;
                                        return RealImageLoaderexecute3.onNavigationEvent(j, str3, map4, function15);
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                                obj = function0;
                            }
                            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda5.IAuthTabCallback(onextracallbackwithresult, (TextFieldScrollKtExternalSyntheticLambda0) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            str2 = strIntern;
                            map2 = map3;
                            function13 = function14;
                        }
                    } else {
                        int i19 = onWarmupCompleted + 119;
                        IAuthTabCallback = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    z2 = false;
                    if ((i3 & 112) != 32) {
                    }
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(map3);
                    if ((i3 & 7168) == 2048) {
                    }
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z4 | z2 | z3 | zOnExtraCallback) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    str2 = strIntern;
                    function13 = function12;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final String str4 = str2;
                    final Map<String, ?> map5 = map2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.components.compose.extensions.TrackerKt$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) throws Throwable {
                            int i21 = 2 % 2;
                            int i22 = onWarmupCompleted + 13;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            Unit unitOnExtraCallbackWithResult = RealImageLoaderexecute3.onExtraCallbackWithResult(j, str4, map5, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i24 = onWarmupCompleted + 21;
                            onNavigationEvent = i24 % 128;
                            int i25 = i24 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i3 & 1171) != 1170) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        map2 = map;
        int i21 = onWarmupCompleted + 63;
        IAuthTabCallback = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 2 % 5;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 1171) != 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 85;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 39;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19627 - KeyEvent.normalizeMetaState(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), KeyEvent.keyCodeFromString("") + 59, 6383 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 59 - ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf("", "", 0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i9 = 35 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 58 - ImageFormat.getBitsPerPixel(0), 6383 - TextUtils.getTrimmedLength(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }
}
