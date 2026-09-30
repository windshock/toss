package im.toss.tosssecurities.uikit.extension;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AppLovinNativeAdImplc;
import o.AppLovinStarRatingView;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TTHistoryActivity2;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.immediateFailedFuture;
import o.setByteOrder;
import o.toMetersPerSecond;
import o.w3b;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourcesKt {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 24282;
    private static int IAuthTabCallbackStub = 1;
    private static char onExtraCallback = 59091;
    private static char onExtraCallbackWithResult = 680;
    private static char onNavigationEvent = 19759;
    private static int onWarmupCompleted;

    private static final Unit onExtraCallback(String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 27;
        onWarmupCompleted = i5 % 128;
        onExtraCallbackWithResult(str, str2, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 11;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(w3b w3bVar, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(w3bVar, str, str2, quirksExternalSyntheticBackport0, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStub + 61;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w3b w3bVar, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 91;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(w3bVar, str, str2, quirksExternalSyntheticBackport0, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 7;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(w3bVar, str, str2, quirksExternalSyntheticBackport0, f, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 79;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 93;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 55 / 0;
        }
        int i8 = onWarmupCompleted + 61;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(w3b w3bVar, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(w3bVar, str, str2, quirksExternalSyntheticBackport0, f, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 81;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static final String onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null)) {
            int i4 = onWarmupCompleted + 87;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{53673, 59075, 22831, 56708, 6101, 11748, 21160, 38981, 13383, 56697, 48347, 9722, 47151, 29952, 38199, 61516, 50054, 64270, 4378, 29791, 20339, 30898, 16686, 51378, 33580, 1138, 49981, 46404, 41007, 47610, 63862, 35362, 50357, 44859, 9085, 60660}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        sb.append(".png");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0168, code lost:
    
        if (r0.equals("ICON") != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final w3b w3bVar, @Nullable final String str, @Nullable final String str2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        float f2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float f3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        String upperCase;
        int i5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2125677152);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(w3bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = onWarmupCompleted + 51;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i9 = onWarmupCompleted + 109;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                i5 = 256;
            } else {
                int i11 = onWarmupCompleted + 17;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 3 / 2;
                }
                i5 = 128;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            int i14 = onWarmupCompleted + 5;
            IAuthTabCallbackStub = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 99 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                    int i16 = onWarmupCompleted + 103;
                    IAuthTabCallbackStub = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 4 % 5;
                    }
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
            }
            i3 |= i4;
        }
        int i18 = i2 & 8;
        if (i18 == 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                int i19 = onWarmupCompleted + 125;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                if (i13 != 0) {
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                }
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                float fOnExtraCallback = i18 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2125677152, i3, -1, "im.toss.tosssecurities.uikit.extension.LeftResourceType (Resources.kt:50)");
                }
                if (str2 == null) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        final float f4 = fOnExtraCallback;
                        function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.extension.ResourcesKt$$ExternalSyntheticLambda1
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit unitOnNavigationEvent;
                                int i21 = 2 % 2;
                                int i22 = onExtraCallbackWithResult + 109;
                                IAuthTabCallback = i22 % 128;
                                if (i22 % 2 != 0) {
                                    unitOnNavigationEvent = ResourcesKt.onNavigationEvent(w3bVar, str, str2, quirksExternalSyntheticBackport04, f4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                    int i23 = 56 / 0;
                                } else {
                                    unitOnNavigationEvent = ResourcesKt.onNavigationEvent(w3bVar, str, str2, quirksExternalSyntheticBackport04, f4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                }
                                int i24 = onExtraCallbackWithResult + 1;
                                IAuthTabCallback = i24 % 128;
                                if (i24 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        return;
                    }
                    return;
                }
                if (str != null) {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                } else {
                    upperCase = null;
                }
                if (upperCase != null) {
                    int i21 = onWarmupCompleted + 73;
                    IAuthTabCallbackStub = i21 % 128;
                    int i22 = i21 % 2;
                    int iHashCode = upperCase.hashCode();
                    if (iHashCode != -2043608161) {
                        if (iHashCode != 2241657) {
                            if (iHashCode == 69775675) {
                                if (!upperCase.equals("IMAGE")) {
                                    int i23 = IAuthTabCallbackStub + 1;
                                    onWarmupCompleted = i23 % 128;
                                    int i24 = i23 % 2;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1049973828);
                                w3bVar.onExtraCallbackWithResult(onNavigationEvent(str2), quirksExternalSyntheticBackport04, fOnExtraCallback, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 1008) | ((i3 << 21) & 29360128), 120);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049629790);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    } else if (upperCase.equals("LOTTIE")) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049787580);
                        w3bVar.onWarmupCompleted(str2, IntCompanionObject.MAX_VALUE, quirksExternalSyntheticBackport04, (QuirkSettingsLoader) null, (immediateFailedFuture) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i3 >> 6) & 14) | 48 | ((i3 >> 3) & 896) | ((i3 << 15) & 458752), 24);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049629790);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    f3 = fOnExtraCallback;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1049629790);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    f3 = fOnExtraCallback;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                return;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            f3 = f2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                function2 = new Function2() { // from class: im.toss.tosssecurities.uikit.extension.ResourcesKt$$ExternalSyntheticLambda2
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i25 = 2 % 2;
                        int i26 = onNavigationEvent + 13;
                        onWarmupCompleted = i26 % 128;
                        if (i26 % 2 == 0) {
                            return ResourcesKt.onExtraCallbackWithResult(w3bVar, str, str2, quirksExternalSyntheticBackport02, f3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        Unit unitOnExtraCallbackWithResult = ResourcesKt.onExtraCallbackWithResult(w3bVar, str, str2, quirksExternalSyntheticBackport02, f3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i27 = 84 / 0;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                return;
            }
            return;
        }
        i3 |= 24576;
        f2 = f;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final String str, @NotNull final String str2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final long j2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1154203387);
        if ((i & 6) == 0) {
            int i8 = onWarmupCompleted + 11;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i10 = IAuthTabCallbackStub + 115;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i13 = onWarmupCompleted + 115;
            IAuthTabCallbackStub = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 87 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
            }
            i3 |= i4;
        }
        int i15 = i2 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                int i16 = onWarmupCompleted + 43;
                IAuthTabCallbackStub = i16 % 128;
                if (i16 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j);
                    throw null;
                }
                int i17 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ^ true) ? 2048 : 1024) | i3;
                int i18 = onWarmupCompleted + 87;
                IAuthTabCallbackStub = i18 % 128;
                int i19 = i18 % 2;
                i5 = i17;
            }
            if ((i5 & 1171) == 1170) {
                int i20 = IAuthTabCallbackStub + 71;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                int i22 = IAuthTabCallbackStub + 67;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                j2 = j;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            } else {
                if (i12 != 0) {
                    int i24 = onWarmupCompleted + 65;
                    IAuthTabCallbackStub = i24 % 128;
                    if (i24 % 2 == 0) {
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                        int i25 = 26 / 0;
                    } else {
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    }
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                long jOnTransact = i15 != 0 ? setByteOrder.Companion.onTransact() : j;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1154203387, i5, -1, "im.toss.tosssecurities.uikit.extension.SecuritiesHomeResource (Resources.kt:77)");
                }
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                int iHashCode = upperCase.hashCode();
                if (iHashCode != -2043608161) {
                    if (iHashCode == 2241657 ? upperCase.equals("ICON") : !(iHashCode != 69775675 || !upperCase.equals("IMAGE"))) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-634844132);
                        AppLovinNativeAdImplc.onExtraCallbackWithResult(onNavigationEvent(str2), quirksExternalSyntheticBackport04, jOnTransact, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 3) & 1008, 504);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    j2 = jOnTransact;
                } else if (upperCase.equals("LOTTIE")) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-634654350);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinStarRatingView.IAuthTabCallback(str2, quirksExternalSyntheticBackport04, false, false, 0, 0.0f, false, 0.0f, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, (i5 >> 3) & 126, 0, 8188);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    j2 = jOnTransact;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-634535961);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                j2 = jOnTransact;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.extension.ResourcesKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallback + 107;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnWarmupCompleted = ResourcesKt.onWarmupCompleted(str, str2, quirksExternalSyntheticBackport02, j2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i29 = onNavigationEvent + 97;
                        onExtraCallback = i29 % 128;
                        if (i29 % 2 == 0) {
                            return unitOnWarmupCompleted;
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
        i3 |= 3072;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 91;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i3];
            } else {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = 58224;
            int i6 = i3;
            while (i6 < 16) {
                int i7 = $11 + 73;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, maximumDrawingCacheSize, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, 12434 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 14, (KeyEvent.getMaxKeyCode() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
