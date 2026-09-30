package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1pSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.RecomposerawaitIdle2;
import o.flipHorizontally;
import o.setByteOrder;
import o.startTrigger;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1pSDK {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        setByteOrder setbyteorder = (setByteOrder) objArr[3];
        Float f = (Float) objArr[4];
        startTrigger starttrigger = (startTrigger) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, fFloatValue, setbyteorder, f, starttrigger, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function0, fliphorizontally);
        }
        onWarmupCompleted(function0, fliphorizontally);
        throw null;
    }

    public static /* synthetic */ float onExtraCallback(float f) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Float.valueOf(f)};
        int iOnExtraCallbackWithResult = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (i3 != 0) {
            fFloatValue = ((Float) onExtraCallbackWithResult(364630371, -364630370, iOnExtraCallbackWithResult4, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).floatValue();
            int i4 = 74 / 0;
        } else {
            fFloatValue = ((Float) onExtraCallbackWithResult(364630371, -364630370, iOnExtraCallbackWithResult4, objArr, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).floatValue();
        }
        int i5 = onExtraCallback + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float fFloatValue = ((Number) objArr[0]).floatValue();
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return Float.valueOf(fFloatValue);
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, Function0 function0, setByteOrder setbyteorder, startTrigger starttrigger, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 17;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, f, function0, setbyteorder, starttrigger, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 85;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, setByteOrder setbyteorder, Float f2, startTrigger starttrigger, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, str, Float.valueOf(f), setbyteorder, f2, starttrigger, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            int iOnExtraCallbackWithResult = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {quirksExternalSyntheticBackport0, str, Float.valueOf(f), setbyteorder, f2, starttrigger, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult3 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallbackWithResult(1829802814, -1829802814, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr2, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4);
        int i6 = onExtraCallbackWithResult + 23;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = (~(i10 | i2)) | (~(i8 | i2));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i + i2 + i6 + ((-2109949842) * i4) + (2078889904 * i3);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i) + 932184064 + (61854959 * i2) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i6) + (610271232 * i4) + (922746880 * i3) + (671350784 * i14);
        int i16 = (i * (-573803825)) + 196542130 + (i2 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i6 * (-573803307)) + (i4 * (-843101306)) + (i3 * (-1524517520)) + (i14 * 458489856);
        return i15 + ((i16 * i16) * 64749568) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, Function0 function0, setByteOrder setbyteorder, startTrigger starttrigger, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, f, (Function0<Float>) function0, setbyteorder, starttrigger, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, fliphorizontally);
        int i4 = onExtraCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(getsupportedhighspeedresolutionsfor, iAuthTabCallback);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, iAuthTabCallback);
        int i3 = onExtraCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, final float f, @Nullable setByteOrder setbyteorder, @Nullable Float f2, @Nullable startTrigger starttrigger, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        setByteOrder setbyteorder2;
        int i4;
        Float f3;
        final startTrigger starttrigger2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final setByteOrder setbyteorder3;
        final Float f4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        startTrigger starttriggerOnNavigationEvent;
        Float f5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(739008212);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
            int i11 = onExtraCallback + 91;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i13 = onExtraCallback + 119;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 128 : 256;
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                int i16 = onExtraCallbackWithResult + 47;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                setbyteorder2 = setbyteorder;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    f3 = f2;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(f3) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                }
                if ((196608 & i) == 0) {
                    int i18 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    if ((i2 & 32) == 0) {
                        starttrigger2 = starttrigger;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(starttrigger2)) {
                            int i20 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                            i7 = Imgproc.FLOODFILL_MASK_ONLY;
                            if (i21 != 0) {
                                int i22 = 25 / 0;
                            }
                        }
                        i3 |= i7;
                    } else {
                        starttrigger2 = starttrigger;
                    }
                    i7 = Imgproc.FLOODFILL_FIXED_RANGE;
                    i3 |= i7;
                } else {
                    starttrigger2 = starttrigger;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    Function0 function0 = null;
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if (i15 != 0) {
                            setbyteorder2 = null;
                        }
                        if (i4 != 0) {
                            int i23 = onExtraCallback + 59;
                            onExtraCallbackWithResult = i23 % 128;
                            if (i23 % 2 != 0) {
                                int i24 = 51 / 0;
                            }
                            f3 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i5 = i3 & (-458753);
                            starttriggerOnNavigationEvent = startTrigger.onNavigationEvent(startTrigger.Companion.onExtraCallback());
                        }
                        setByteOrder setbyteorder4 = setbyteorder2;
                        f5 = f3;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(739008212, i5, -1, "im.toss.tosssecurities.uikit.compound.blur.BlurredImage (BlurredImage.kt:43)");
                        }
                        if (f5 != null) {
                            int i25 = onExtraCallback + 77;
                            onExtraCallbackWithResult = i25 % 128;
                            if (i25 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-208456257);
                                function0.hashCode();
                                throw null;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-208456257);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-208456256);
                            final float fFloatValue = f5.floatValue();
                            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue);
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda0
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i26 = 2 % 2;
                                        int i27 = onNavigationEvent + 87;
                                        onExtraCallback = i27 % 128;
                                        int i28 = i27 % 2;
                                        Float fValueOf = Float.valueOf(AFf1pSDK.onExtraCallback(fFloatValue));
                                        int i29 = onExtraCallback + 27;
                                        onNavigationEvent = i29 % 128;
                                        int i30 = i29 % 2;
                                        return fValueOf;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            function0 = (Function0) objOnMinimized;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        i6 = onExtraCallbackWithResult + 39;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            onNavigationEvent(quirksExternalSyntheticBackport05, str, f, (Function0<Float>) function0, setbyteorder4, starttriggerOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 & 18867) | (57344 & (i5 / 2)) | (458752 & i5), 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                            setbyteorder3 = setbyteorder4;
                            f4 = f5;
                            starttrigger2 = starttriggerOnNavigationEvent;
                        } else {
                            onNavigationEvent(quirksExternalSyntheticBackport05, str, f, (Function0<Float>) function0, setbyteorder4, starttriggerOnNavigationEvent, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 & 1022) | (57344 & (i5 << 3)) | (458752 & i5), 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                            setbyteorder3 = setbyteorder4;
                            f4 = f5;
                            starttrigger2 = starttriggerOnNavigationEvent;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 32) != 0) {
                            int i26 = onExtraCallback + 93;
                            onExtraCallbackWithResult = i26 % 128;
                            if (i26 % 2 != 0) {
                                function0.hashCode();
                                throw null;
                            }
                            i3 &= -458753;
                        }
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    i5 = i3;
                    starttriggerOnNavigationEvent = starttrigger2;
                    setByteOrder setbyteorder42 = setbyteorder2;
                    f5 = f3;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = quirksExternalSyntheticBackport04;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    if (f5 != null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i6 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    setbyteorder3 = setbyteorder2;
                    f4 = f3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i27 = 2 % 2;
                            int i28 = onWarmupCompleted + 113;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
                            Object obj3 = null;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport03;
                            String str2 = str;
                            float f6 = f;
                            setByteOrder setbyteorder5 = setbyteorder3;
                            Float f7 = f4;
                            startTrigger starttrigger3 = starttrigger2;
                            int i30 = i;
                            int i31 = i2;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (i29 != 0) {
                                AFf1pSDK.onExtraCallback(quirksExternalSyntheticBackport06, str2, f6, setbyteorder5, f7, starttrigger3, i30, i31, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                                obj3.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallback = AFf1pSDK.onExtraCallback(quirksExternalSyntheticBackport06, str2, f6, setbyteorder5, f7, starttrigger3, i30, i31, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue);
                            int i32 = IAuthTabCallback + 1;
                            onWarmupCompleted = i32 % 128;
                            if (i32 % 2 != 0) {
                                return unitOnExtraCallback;
                            }
                            obj3.hashCode();
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            f3 = f2;
            if ((196608 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        setbyteorder2 = setbyteorder;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        f3 = f2;
        if ((196608 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallback(Function0 function0, flipHorizontally fliphorizontally) {
        Float f;
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        Object obj = null;
        if (function0 != null) {
            int i4 = onExtraCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            f = (Float) function0.invoke();
        } else {
            f = null;
        }
        if (f != null) {
            int i6 = onExtraCallback + 25;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                fliphorizontally.IAuthTabCallbackStub(f.floatValue());
                obj.hashCode();
                throw null;
            }
            fliphorizontally.IAuthTabCallbackStub(f.floatValue());
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CarouselKtExternalSyntheticLambda11 carouselKtExternalSyntheticLambda11OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallback().onExtraCallbackWithResult();
        Intrinsics.checkNotNull(carouselKtExternalSyntheticLambda11OnExtraCallbackWithResult, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(setByteOrder.onNavigationEvent(ByteOrderedDataOutputStream.onExtraCallback(AFf1sSDK.onNavigationEvent(AFf1sSDK.onExtraCallback, carouselKtExternalSyntheticLambda11OnExtraCallbackWithResult.IAuthTabCallback(), 0, false, false, 0, null, 62, null))));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ setByteOrder $color;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<setByteOrder> $colorState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getSupportedHighSpeedResolutionsFor<setByteOrder> getsupportedhighspeedresolutionsfor, setByteOrder setbyteorder, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$colorState = getsupportedhighspeedresolutionsfor;
            this.$color = setbyteorder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$colorState, this.$color, access13800Var);
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            Object obj = null;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg2, access13800Var2);
                obj.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r2 == 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r4.$colorState.IAuthTabCallback(r4.$color);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            r4.$colorState.IAuthTabCallback(r4.$color);
            r5 = kotlin.Unit.INSTANCE;
            r5 = null;
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r2 + 99;
            o.AFf1pSDK.onNavigationEvent.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r5);
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                int i4 = 98 / 0;
            }
        }
    }

    private static final Unit onWarmupCompleted(Function0 function0, flipHorizontally fliphorizontally) {
        Float f;
        float fFloatValue;
        float f2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        if (function0 != null) {
            int i4 = onExtraCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            f = (Float) function0.invoke();
        } else {
            int i6 = onExtraCallbackWithResult + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            f = null;
        }
        if (f != null) {
            int i8 = onExtraCallback + 85;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                fFloatValue = f.floatValue();
                f2 = 0.0f;
            } else {
                fFloatValue = f.floatValue();
                f2 = 2.0f;
            }
            fliphorizontally.IAuthTabCallbackStub(fFloatValue / f2);
        }
        fliphorizontally.onNavigationEvent(createFromFileString.Companion.onExtraCallback());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, final float f, @Nullable final Function0<Float> function0, @Nullable setByteOrder setbyteorder, @Nullable startTrigger starttrigger, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        int i5;
        final startTrigger starttrigger2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final setByteOrder setbyteorder2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        setByteOrder setbyteorder3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        setByteOrder setbyteorder4;
        startTrigger starttriggerOnNavigationEvent;
        int i6;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06;
        setByteOrder setbyteorder5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07;
        setByteOrder setbyteorder6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        float fFloatValue;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-338151536);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i10 = onExtraCallback + 81;
                onExtraCallbackWithResult = i10 % 128;
                i4 = i10 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder)) {
                    int i12 = onExtraCallbackWithResult + 75;
                    onExtraCallback = i12 % 128;
                    i5 = i12 % 2 == 0 ? 26683 : Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = TTHistoryActivity2.SIZE;
                }
                i3 |= i5;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    starttrigger2 = starttrigger;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(starttrigger2)) {
                        i7 = Imgproc.FLOODFILL_MASK_ONLY;
                    }
                    i3 |= i7;
                } else {
                    starttrigger2 = starttrigger;
                }
                i7 = Imgproc.FLOODFILL_FIXED_RANGE;
                i3 |= i7;
            } else {
                starttrigger2 = starttrigger;
            }
            boolean z2 = false;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                setbyteorder2 = setbyteorder;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    if (i11 != 0) {
                        int i13 = onExtraCallbackWithResult + 97;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 17 / 0;
                        }
                        setbyteorder3 = null;
                    } else {
                        setbyteorder3 = setbyteorder;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        setbyteorder4 = setbyteorder3;
                        starttriggerOnNavigationEvent = startTrigger.onNavigationEvent(startTrigger.Companion.onExtraCallback());
                    } else {
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        starttriggerOnNavigationEvent = starttrigger2;
                        setbyteorder4 = setbyteorder3;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i15 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-338151536, i3, -1, "im.toss.tosssecurities.uikit.compound.blur.BlurredImage (BlurredImage.kt:63)");
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2121164577);
                        if (setbyteorder4 != null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2121176543);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = startRepeating.onNavigationEvent(quirksExternalSyntheticBackport05, f, starttriggerOnNavigationEvent.onNavigationEvent());
                            long jAccess100 = setbyteorder4.access100();
                            if (function0 != null) {
                                int i17 = onExtraCallbackWithResult + 21;
                                onExtraCallback = i17 % 128;
                                int i18 = i17 % 2;
                                fFloatValue = function0.invoke().floatValue();
                            } else {
                                fFloatValue = 1.0f;
                            }
                            FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, setByteOrder.onExtraCallbackWithResult(jAccess100, fFloatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null), (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            setbyteorder6 = setbyteorder4;
                            quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport05;
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2121506197);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = startRepeating.onNavigationEvent(quirksExternalSyntheticBackport05, f, starttriggerOnNavigationEvent.onNavigationEvent());
                            if ((i3 & 7168) == 2048) {
                                int i19 = onExtraCallbackWithResult + 67;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                z2 = true;
                            }
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda2
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i21 = 2 % 2;
                                        int i22 = onNavigationEvent + 11;
                                        onExtraCallbackWithResult = i22 % 128;
                                        int i23 = i22 % 2;
                                        Unit unitOnNavigationEvent = AFf1pSDK.onNavigationEvent(function0, (flipHorizontally) obj);
                                        int i24 = onExtraCallbackWithResult + 27;
                                        onNavigationEvent = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            return unitOnNavigationEvent;
                                        }
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport05;
                            setbyteorder6 = setbyteorder4;
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            AppLovinNativeAdImplc.onExtraCallbackWithResult(str, attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14, 508);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport07;
                        setbyteorder5 = setbyteorder6;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    } else {
                        setByteOrder setbyteorder7 = setbyteorder4;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport08 = quirksExternalSyntheticBackport05;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2122036576);
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        boolean z3 = (i3 & 112) == 32;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!z3) {
                            Object obj = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                RecomposerawaitIdle2 recomposerawaitIdle2OnExtraCallbackWithResult = Recomposerjoin2.IAuthTabCallback(Recomposerjoin2.onNavigationEvent(new RecomposerawaitIdle2.onNavigationEvent(context), Bitmap.Config.ARGB_8888).onExtraCallback(str).onNavigationEvent(64), false).onExtraCallback(ReferentialEqualityPolicy.INEXACT).onExtraCallbackWithResult();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(recomposerawaitIdle2OnExtraCallbackWithResult);
                                obj = recomposerawaitIdle2OnExtraCallbackWithResult;
                            }
                            RecomposerawaitIdle2 recomposerawaitIdle2 = (RecomposerawaitIdle2) obj;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                                int i21 = onExtraCallback + 17;
                                onExtraCallbackWithResult = i21 % 128;
                                i6 = 2;
                                objOnMinimized3 = i21 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                            } else {
                                i6 = 2;
                            }
                            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                            if (setbyteorder7 == null) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2122462113);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized4 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda3
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallbackWithResult;

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            int i22 = 2 % 2;
                                            int i23 = IAuthTabCallback + 29;
                                            onExtraCallbackWithResult = i23 % 128;
                                            int i24 = i23 % 2;
                                            Unit unitOnNavigationEvent = AFf1pSDK.onNavigationEvent(getsupportedhighspeedresolutionsfor, (KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback) obj2);
                                            int i25 = IAuthTabCallback + 67;
                                            onExtraCallbackWithResult = i25 % 128;
                                            if (i25 % 2 == 0) {
                                                return unitOnNavigationEvent;
                                            }
                                            Object obj3 = null;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                }
                                AccessibilityServiceStateProvider_androidKtExternalSyntheticLambda4.IAuthTabCallback(recomposerawaitIdle2, (Painter) null, (Painter) null, (Painter) null, (Function1) null, (Function1) objOnMinimized4, (Function1) null, (immediateFailedFuture) null, 0, cameraCaptureResultEmptyCameraCaptureResult2, 196608, 478);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2122825836);
                                if ((57344 & i3) == 16384) {
                                    int i22 = onExtraCallback + 11;
                                    onExtraCallbackWithResult = i22 % 128;
                                    int i23 = i22 % i6;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (z || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized5 = new onNavigationEvent(getsupportedhighspeedresolutionsfor, setbyteorder7, null);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(setbyteorder7, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 12) & 14);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            setByteOrder setbyteorder8 = (setByteOrder) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
                            if (setbyteorder8 == null) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2122971442);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                setbyteorder5 = setbyteorder7;
                                quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport08;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(2122971443);
                                long jAccess1002 = setbyteorder8.access100();
                                boolean z4 = (i3 & 7168) == 2048;
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!z4) {
                                    int i24 = onExtraCallback + 25;
                                    onExtraCallbackWithResult = i24 % 128;
                                    int i25 = i24 % i6;
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized6 = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda4
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onWarmupCompleted = 1;

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                int i26 = 2 % 2;
                                                int i27 = onExtraCallbackWithResult + 49;
                                                onWarmupCompleted = i27 % 128;
                                                if (i27 % 2 == 0) {
                                                    AFf1pSDK.IAuthTabCallback(function0, (flipHorizontally) obj2);
                                                    throw null;
                                                }
                                                Unit unitIAuthTabCallback = AFf1pSDK.IAuthTabCallback(function0, (flipHorizontally) obj2);
                                                int i28 = onExtraCallbackWithResult + 57;
                                                onWarmupCompleted = i28 % 128;
                                                if (i28 % 2 == 0) {
                                                    int i29 = 60 / 0;
                                                }
                                                return unitIAuthTabCallback;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized6);
                                    }
                                    quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport08;
                                    setbyteorder5 = setbyteorder7;
                                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(MaxRecyclerAdapter.onWarmupCompleted(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport08, (Function1) objOnMinimized6), jAccess1002, f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0L, (toMetersPerSecond) null, false, false, 56, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i26 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i26 % 128;
                        if (i26 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    setbyteorder2 = setbyteorder5;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                    starttrigger2 = starttriggerOnNavigationEvent;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                        starttriggerOnNavigationEvent = starttrigger2;
                        setbyteorder4 = setbyteorder;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        setbyteorder2 = setbyteorder5;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                        starttrigger2 = starttriggerOnNavigationEvent;
                    } else {
                        setbyteorder3 = setbyteorder;
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        starttriggerOnNavigationEvent = starttrigger2;
                        setbyteorder4 = setbyteorder3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        setbyteorder2 = setbyteorder5;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                        starttrigger2 = starttriggerOnNavigationEvent;
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.blur.BlurredImageKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i27 = 2 % 2;
                        int i28 = onExtraCallback + 47;
                        IAuthTabCallback = i28 % 128;
                        if (i28 % 2 == 0) {
                            AFf1pSDK.onExtraCallback(quirksExternalSyntheticBackport03, str, f, function0, setbyteorder2, starttrigger2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            throw null;
                        }
                        Unit unitOnExtraCallback = AFf1pSDK.onExtraCallback(quirksExternalSyntheticBackport03, str, f, function0, setbyteorder2, starttrigger2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i29 = IAuthTabCallback + 9;
                        onExtraCallback = i29 % 128;
                        int i30 = i29 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        if ((196608 & i) != 0) {
        }
        boolean z22 = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) == 74898, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final float onNavigationEvent(float f) {
        Object[] objArr = {Float.valueOf(f)};
        int iOnExtraCallbackWithResult = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return ((Float) onExtraCallbackWithResult(364630371, -364630370, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).floatValue();
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, float f, setByteOrder setbyteorder, Float f2, startTrigger starttrigger, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, Float.valueOf(f), setbyteorder, f2, starttrigger, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(1829802814, -1829802814, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }
}
