package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.tds.compose.component.atom.border.TdsBorderV1Kt$;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda6;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda6 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final /* synthetic */ class onExtraCallback {
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.values().length];
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Thick.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.values().length];
            try {
                iArr2[AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.None.ordinal()] = 1;
                int i = onWarmupCompleted + 55;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.Leading.ordinal()] = 2;
                int i4 = onWarmupCompleted + 87;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.Side.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            onNavigationEvent = iArr2;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 97;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(float f, float f2, float f3, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(f, f2, f3, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 103;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, float f3, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallbackWithResult(f, f2, f3, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, f2, f3, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 123;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback onextracallback, @Nullable AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted onwarmupcompleted, @Nullable AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent onnavigationevent, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted onwarmupcompleted2;
        float fOnExtraCallback;
        Pair pairIAuthTabCallback;
        int i3 = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 1) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback onextracallback2 = (i2 & 2) != 0 ? AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Default : onextracallback;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                onwarmupcompleted2 = AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.None;
                int i5 = 63 / 0;
            } else {
                onwarmupcompleted2 = AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.None;
            }
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent onnavigationevent2 = (i2 & 8) != 0 ? AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent.C0005onNavigationEvent.onExtraCallbackWithResult : onnavigationevent;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(71615907, i, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1 (TdsBorderV1.kt:122)");
        }
        int i6 = onExtraCallback.onExtraCallbackWithResult[onextracallback2.ordinal()];
        if (i6 == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(103421481);
            fOnExtraCallback = AppLovinAdLoadListener.onExtraCallbackWithResult.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (i6 != 2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(103419351);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(103423406);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            fOnExtraCallback = MaxAdRequestListener.IAuthTabCallback.onNavigationEvent();
        }
        long jIAuthTabCallback = AppLovinNativeAdImplExternalSyntheticLambda8.IAuthTabCallback.IAuthTabCallback(fOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, 48);
        int i7 = onExtraCallback.onNavigationEvent[onwarmupcompleted2.ordinal()];
        if (i7 == 1) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)));
        } else if (i7 != 2) {
            int i8 = onNavigationEvent + 123;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0 ? i7 != 3 : i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            pairIAuthTabCallback = getWrite.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(onnavigationevent2.onExtraCallbackWithResult()), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(onnavigationevent2.onExtraCallbackWithResult()));
        } else {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(onnavigationevent2.onExtraCallbackWithResult()), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)));
        }
        IAuthTabCallback(fOnExtraCallback, ((VirtualCameraControlExternalSyntheticLambda1) pairIAuthTabCallback.onExtraCallbackWithResult()).IAuthTabCallback(), ((VirtualCameraControlExternalSyntheticLambda1) pairIAuthTabCallback.IAuthTabCallback()).IAuthTabCallback(), quirksExternalSyntheticBackport02, jIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, (i << 9) & 7168, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i11 = onExtraCallback + 57;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 18 / 0;
        }
    }

    public static final void onWarmupCompleted(float f, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback onextracallback, @Nullable AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted onwarmupcompleted2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            int i6 = i4 + 77;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((i2 & 4) != 0) {
            onextracallback = AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Default;
        }
        AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback onextracallback3 = onextracallback;
        if ((i2 & 8) != 0) {
            int i7 = onNavigationEvent + 33;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                onwarmupcompleted2 = AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.None;
                int i8 = 25 / 0;
            } else {
                onwarmupcompleted2 = AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted.None;
            }
            onwarmupcompleted = onwarmupcompleted2;
            int i9 = onNavigationEvent + 117;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 2;
            }
        }
        AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted onwarmupcompleted3 = onwarmupcompleted;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i11 = onNavigationEvent + 111;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(8111345, i, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1 (TdsBorderV1.kt:150)");
        }
        IAuthTabCallback(quirksExternalSyntheticBackport0, onextracallback3, onwarmupcompleted3, AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent.IAuthTabCallback.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent.IAuthTabCallback.onWarmupCompleted(f)), cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 1022, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    @Deprecated
    public static final void onNavigationEvent(@NotNull AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jIAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = 60 / 0;
            } else {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            jIAuthTabCallback = AppLovinNativeAdImplExternalSyntheticLambda8.IAuthTabCallback.IAuthTabCallback(onextracallbackwithresult, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
        } else {
            jIAuthTabCallback = j;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1051642784, i, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1 (TdsBorderV1.kt:191)");
        }
        IAuthTabCallback(onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onExtraCallbackWithResult(), 0.0f, quirksExternalSyntheticBackport02, jIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, (i << 6) & 64512, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 73;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i10 = onExtraCallback + 63;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 29 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[PHI: r0
      0x0035: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r0
      0x002a: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0028, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(final float f, final float f2, float f3, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        float f4;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        final float f5;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        long j4;
        float f6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        float fIAuthTabCallback;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 85;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-206569102);
            if ((i & 108) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 4 : 2) | i;
            } else {
                int i9 = onExtraCallback + 15;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-206569102);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i11 = onExtraCallback + 123;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                int i13 = onNavigationEvent + 109;
                onExtraCallback = i13 % 128;
                i6 = i13 % 2 == 0 ? 14 : 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
            int i14 = onExtraCallback + 81;
            onNavigationEvent = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                f4 = f3;
                i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f4) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    int i17 = onExtraCallback + 109;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 == 0 ? (i2 & 16) != 0 : (i2 & 88) != 0) {
                        j2 = j;
                    } else {
                        j2 = j;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) {
                            int i18 = onExtraCallback + 67;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            i5 = 16384;
                        }
                        i3 |= i5;
                    }
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        float fIAuthTabCallback2 = i16 != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f4;
                        if (i4 != 0) {
                            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                        }
                        if ((i2 & 16) != 0) {
                            long jIAuthTabCallback = AppLovinNativeAdImplExternalSyntheticLambda8.IAuthTabCallback.IAuthTabCallback(f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 48);
                            i3 &= -57345;
                            f6 = fIAuthTabCallback2;
                            j4 = jIAuthTabCallback;
                        } else {
                            j4 = j2;
                            f6 = fIAuthTabCallback2;
                        }
                    } else {
                        int i20 = onExtraCallback + 119;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        j4 = j2;
                        f6 = f4;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-206569102, i3, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1 (TdsBorderV1.kt:207)");
                    }
                    if (f2 != 0.0f && f6 != 0.0f) {
                        quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f2, 0.0f, f6, 0.0f, 10, (Object) null);
                    } else if (f2 == 0.0f) {
                        int i22 = onExtraCallback + 91;
                        onNavigationEvent = i22 % 128;
                        quirksExternalSyntheticBackport0OnExtraCallback = (i22 % 2 == 0 ? f6 != 0.0f : f6 != 2.0f) ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, f6, 0.0f, 11, (Object) null) : QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    }
                    if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f, VirtualCameraControlExternalSyntheticLambda1.Companion.onWarmupCompleted())) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(788562778);
                        fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f / ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i23 = onExtraCallback + 71;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(788621399);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        fIAuthTabCallback = f;
                    }
                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback), 0.0f, 1, (Object) null), fIAuthTabCallback), j4, (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    f5 = f6;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    j3 = j4;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    f5 = f4;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    j3 = j2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.border.TdsBorderV1Kt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i25 = 2 % 2;
                            int i26 = onExtraCallbackWithResult + 91;
                            onExtraCallback = i26 % 128;
                            if (i26 % 2 == 0) {
                                return AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(f, f2, f5, quirksExternalSyntheticBackport03, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            }
                            Unit unitOnNavigationEvent = AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(f, f2, f5, quirksExternalSyntheticBackport03, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i27 = 93 / 0;
                            return unitOnNavigationEvent;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if ((i & 24576) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        f4 = f3;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1708732538);
        if (i != 0) {
            int i5 = onExtraCallback + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1708732538, i, -1, "im.toss.tds.compose.component.atom.border.Preview (TdsBorderV1.kt:231)");
                int i7 = onNavigationEvent + 1;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinNativeAdImplExternalSyntheticLambda9.onExtraCallback(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), -1842178524, 1842178524, zzgc.onExtraCallbackWithResult(), new Object[]{AppLovinNativeAdImplExternalSyntheticLambda9.IAuthTabCallback}, zzgc.onExtraCallbackWithResult()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i9 = onNavigationEvent + 69;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 5;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsBorderV1Kt$.ExternalSyntheticLambda0(i));
        }
    }
}
