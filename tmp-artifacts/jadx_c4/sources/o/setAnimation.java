package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.getPrivacyDestinationUri;
import o.setAnimation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setAnimation {
    private static int IAuthTabCallback = 1;
    public static final setAnimation onExtraCallback = new setAnimation();
    private static int onExtraCallbackWithResult;

    static {
        int i = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private setAnimation() {
    }

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private static int $10 = 0;
            private static int $11 = 1;
            private static char[] IAuthTabCallback = {27175, 27320, 27319, 27290, 27296, 27459, 27484, 27324, 27322, 27485, 27487, 27458, 27463, 27297, 27327, 27456, 27296, 27325, 27480, 27482, 27482, 27322, 27301, 27463, 27487, 27459, 27459, 27480, 27322, 27292, 27289, 27319, 27482, 27483, 27481, 27487};
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private final int onNavigationEvent;
            private final QuirksExternalSyntheticBackport0 onWarmupCompleted;

            private static final Unit onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onextracallbackwithresult.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallbackWithResult + 81;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onNavigationEvent(String str, onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    onExtraCallback(str, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
                    throw null;
                }
                Unit unitOnExtraCallback = onExtraCallback(str, onextracallbackwithresult, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
                int i4 = onExtraCallbackWithResult + 33;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }

            public static /* synthetic */ Unit onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                int i6 = onExtraCallbackWithResult + 23;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallback;
            }

            public onExtraCallbackWithResult(int i, @NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
                Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
                this.onNavigationEvent = i;
                this.onWarmupCompleted = quirksExternalSyntheticBackport0;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 2) != 0) {
                    int i3 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                    int i4 = onExtraCallback + 39;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                }
                this(i, quirksExternalSyntheticBackport0);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final Unit onExtraCallback(String str, onExtraCallbackWithResult onextracallbackwithresult, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 23;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                    if ((i & 17) != 45) {
                        int i4 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                    if ((i & 17) != 16) {
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1754330990, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1.LeftItem.NumberType.Content.<anonymous> (StepperRows.kt:100)");
                    }
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediateFailedFuture.Companion.onWarmupCompleted(), onextracallbackwithresult.onNavigationEvent + "번", cameraCaptureResultEmptyCameraCaptureResult, 12582912, 126);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            }

            @Override // o.setAnimation.IAuthTabCallback
            public void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
                int i2;
                boolean z;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
                StringBuilder sb;
                String str;
                int i3 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1769930728);
                if ((i & 6) == 0) {
                    i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 4 : 2) | i;
                    int i4 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    i2 = i;
                }
                if ((i2 & 3) != 2) {
                    int i6 = onExtraCallbackWithResult + 41;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
                    int i8 = onExtraCallback + 19;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i10 = onExtraCallback + 97;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1769930728, i2, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1.LeftItem.NumberType.Content (StepperRows.kt:90)");
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1769930728, i2, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1.LeftItem.NumberType.Content (StepperRows.kt:90)");
                    }
                    if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{(Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                        int i11 = this.onNavigationEvent;
                        sb = new StringBuilder();
                        sb.append("icon-step");
                        sb.append(i11);
                        str = "-rounded-dark.png";
                    } else {
                        int i12 = this.onNavigationEvent;
                        sb = new StringBuilder();
                        sb.append("icon-step");
                        sb.append(i12);
                        str = "-rounded-light.png";
                    }
                    sb.append(str);
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 36, 163, 0}, true, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
                    sb2.append(((String) objArr[0]).intern());
                    sb2.append(string);
                    final String string2 = sb2.toString();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.onWarmupCompleted;
                    getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult());
                    long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1754330990, true, new getBacktraceNote() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1$LeftItem$NumberType$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 97;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitOnNavigationEvent = setAnimation.IAuthTabCallback.onExtraCallbackWithResult.onNavigationEvent(string2, this, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i16 = onExtraCallback + 103;
                            IAuthTabCallback = i16 % 128;
                            int i17 = i16 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setIconUri.IAuthTabCallback(onextracallbackwithresult, quirksExternalSyntheticBackport0, (getBacktraceNote) null, jIAuthTabCallbackDefault, 0.0f, (Function0) null, (String) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12585984, 116);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i13 = onExtraCallback + 87;
                        onExtraCallbackWithResult = i13 % 128;
                        int i14 = i13 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1$LeftItem$NumberType$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            int i15 = 2 % 2;
                            int i16 = onExtraCallbackWithResult + 21;
                            onWarmupCompleted = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnWarmupCompleted = setAnimation.IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i18 = onExtraCallbackWithResult + 69;
                            onWarmupCompleted = i18 % 128;
                            if (i18 % 2 != 0) {
                                int i19 = 4 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    });
                }
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr = IAuthTabCallback;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i7 = $10 + 109;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 31;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 35, TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i9 <<= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35283), 35 - Color.alpha(0), View.MeasureSpec.getSize(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                i9++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i4];
                System.arraycopy(cArr, i3, cArr3, 0, i4);
                if (bArr != null) {
                    char[] cArr4 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Gravity.getAbsoluteGravity(0, 0)), 66 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } else {
                            int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), Color.alpha(0) + 29, 17657 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - KeyEvent.getDeadChar(0, 0)), (-16777146) - Color.rgb(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i6 > 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 0, i4);
                    int i13 = i4 - i6;
                    System.arraycopy(cArr5, 0, cArr3, i13, i6);
                    System.arraycopy(cArr5, i6, cArr3, 0, i13);
                }
                if (z) {
                    int i14 = $10 + 63;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    char[] cArr6 = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    int i16 = $10 + 97;
                    $11 = i16 % 128;
                    i = 2;
                    int i17 = i16 % 2;
                    cArr3 = cArr6;
                } else {
                    i = 2;
                }
                if (i5 > 0) {
                    int i18 = $11 + 79;
                    $10 = i18 % 128;
                    int i19 = i18 % i;
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                }
                objArr[0] = new String(cArr3);
            }
        }

        public static final class onNavigationEvent implements IAuthTabCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int asBinder = 1;
            private final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
            private final getBacktraceNote<setUpNativeAdViewComponents, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
            private final getPrivacyDestinationUri.onExtraCallbackWithResult onExtraCallback;
            private final Function0<Unit> onExtraCallbackWithResult;
            private final setByteOrder onNavigationEvent;
            private final float onTransact;
            private final QuirksExternalSyntheticBackport0 onWarmupCompleted;

            public /* synthetic */ onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, setByteOrder setbyteorder, float f, Function0 function0, getBacktraceNote getbacktracenote2, DefaultConstructorMarker defaultConstructorMarker) {
                this(onextracallbackwithresult, quirksExternalSyntheticBackport0, getbacktracenote, setbyteorder, f, function0, getbacktracenote2);
            }

            public static /* synthetic */ Unit onExtraCallback(onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackStub + 57;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(onnavigationevent, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
                int i5 = asBinder + 95;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }

            private static final Unit onExtraCallbackWithResult(onNavigationEvent onnavigationevent, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = asBinder + 61;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                onnavigationevent.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
                Unit unit = Unit.INSTANCE;
                int i6 = IAuthTabCallbackStub + 49;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 47 / 0;
                }
                return unit;
            }

            public static /* synthetic */ Unit onNavigationEvent(onNavigationEvent onnavigationevent, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = asBinder + 85;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                int i6 = IAuthTabCallbackStub + 27;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                return unitOnExtraCallbackWithResult;
            }

            private onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, setByteOrder setbyteorder, float f, Function0<Unit> function0, getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
                Intrinsics.checkNotNullParameter(getbacktracenote2, "");
                this.onExtraCallback = onextracallbackwithresult;
                this.onWarmupCompleted = quirksExternalSyntheticBackport0;
                this.asInterface = getbacktracenote;
                this.onNavigationEvent = setbyteorder;
                this.onTransact = f;
                this.onExtraCallbackWithResult = function0;
                this.IAuthTabCallback = getbacktracenote2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onNavigationEvent(getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, setByteOrder setbyteorder, float f, Function0 function0, getBacktraceNote getbacktracenote2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                setByteOrder setbyteorder2;
                Function0 function02;
                getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackStub = (i & 1) != 0 ? getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackStub() : onextracallbackwithresult;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                getBacktraceNote getbacktracenote3 = (i & 4) != 0 ? null : getbacktracenote;
                if ((i & 8) != 0) {
                    int i2 = asBinder + 53;
                    IAuthTabCallbackStub = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 2 % 2;
                    }
                    setbyteorder2 = null;
                } else {
                    setbyteorder2 = setbyteorder;
                }
                float fIAuthTabCallback = (i & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
                if ((i & 32) != 0) {
                    int i4 = IAuthTabCallbackStub + 1;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 18 / 0;
                    }
                    int i6 = 2 % 2;
                    function02 = null;
                } else {
                    function02 = function0;
                }
                this(onextracallbackwithresultIAuthTabCallbackStub, quirksExternalSyntheticBackport02, getbacktracenote3, setbyteorder2, fIAuthTabCallback, function02, getbacktracenote2, null);
            }

            public final getPrivacyDestinationUri.onExtraCallbackWithResult IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 95;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
                if (i3 == 0) {
                    int i4 = 60 / 0;
                }
                return onextracallbackwithresult;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final Unit onNavigationEvent(onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackStub + 19;
                asBinder = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                    if ((i & 101) == 0) {
                        i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
                    if ((i & 6) == 0) {
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
                    int i4 = asBinder + 101;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1144318627, i, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1.LeftItem.AssetType.Content.<anonymous> (StepperRows.kt:129)");
                    }
                    onnavigationevent.IAuthTabCallback.invoke(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 14));
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i6 = asBinder + 123;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            }

            @Override // o.setAnimation.IAuthTabCallback
            public void onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
                int i2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
                long jIAuthTabCallbackDefault;
                int i3 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1837558505);
                if ((i & 6) == 0) {
                    int i4 = asBinder + 93;
                    IAuthTabCallbackStub = i4 % 128;
                    int i5 = i4 % 2;
                    i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ^ true ? 2 : 4) | i;
                } else {
                    i2 = i;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1837558505, i2, -1, "im.toss.compose.v1.stepper.TdsStepperRowV1.LeftItem.AssetType.Content (StepperRows.kt:120)");
                    }
                    getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult = (getPrivacyDestinationUri.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(reverseAnimationSpeed.onExtraCallbackWithResult());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.onWarmupCompleted;
                    getBacktraceNote<setUpNativeAdViewComponents, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = this.asInterface;
                    setByteOrder setbyteorder = this.onNavigationEvent;
                    if (setbyteorder != null) {
                        jIAuthTabCallbackDefault = setbyteorder.access100();
                        int i6 = IAuthTabCallbackStub + 53;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setIconUri.IAuthTabCallback(onextracallbackwithresult, quirksExternalSyntheticBackport0, getbacktracenote, jIAuthTabCallbackDefault, this.onTransact, this.onExtraCallbackWithResult, (String) null, ForwardingCameraControl.onExtraCallback(-1144318627, true, new getBacktraceNote() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1$LeftItem$AssetType$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i8 = 2 % 2;
                            int i9 = onWarmupCompleted + 73;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnExtraCallback = setAnimation.IAuthTabCallback.onNavigationEvent.onExtraCallback(this.f$0, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i11 = onWarmupCompleted + 63;
                            IAuthTabCallback = i11 % 128;
                            if (i11 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 64);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v1.stepper.TdsStepperRowV1$LeftItem$AssetType$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unitOnNavigationEvent;
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 113;
                            onWarmupCompleted = i9 % 128;
                            if (i9 % 2 == 0) {
                                unitOnNavigationEvent = setAnimation.IAuthTabCallback.onNavigationEvent.onNavigationEvent(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i10 = 58 / 0;
                            } else {
                                unitOnNavigationEvent = setAnimation.IAuthTabCallback.onNavigationEvent.onNavigationEvent(this.f$0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            int i11 = onExtraCallbackWithResult + 71;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    });
                }
            }
        }
    }
}
