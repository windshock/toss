package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AFh1lSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1oSDKAFa1zSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull String str, float f, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f2, @Nullable AFh1lSDK.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AFh1lSDK.onNavigationEvent onnavigationevent, @Nullable Integer num, @Nullable Integer num2, long j, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        float f3;
        Integer num3;
        String str3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-256927232);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            f3 = f;
        } else {
            f3 = f2;
        }
        AFh1lSDK.onExtraCallbackWithResult onextracallbackwithresult2 = (i2 & 16) != 0 ? null : onextracallbackwithresult;
        AFh1lSDK.onNavigationEvent onnavigationevent2 = (i2 & 32) != 0 ? null : onnavigationevent;
        Integer num4 = (i2 & 64) != 0 ? null : num;
        if ((i2 & 128) != 0) {
            int i6 = IAuthTabCallback + 33;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            num3 = null;
        } else {
            num3 = num2;
        }
        long jOnTransact = (i2 & 256) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i2 & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i8 = IAuthTabCallback + 77;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            str3 = null;
        } else {
            str3 = str2;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i9 = onExtraCallback + 25;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-256927232, i, -1, "im.toss.tosssecurities.uikit.compound.image.TossSecImage (TossSecImage.kt:37)");
        }
        if (StringsKt__StringsKt.isBlank(str)) {
            int i11 = onExtraCallback + 13;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 82 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return;
        }
        int i13 = i >> 3;
        AppLovinNativeAdImplc.onExtraCallbackWithResult(IAuthTabCallback(str, f, f3, onextracallbackwithresult2, onnavigationevent2, num4, num3, cameraCaptureResultEmptyCameraCaptureResult, (3670016 & i13) | (i & 126) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13), 0), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, f, f3).onExtraCallback(quirksExternalSyntheticBackport02), jOnTransact, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, str3, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 18) & 896) | (234881024 & i13), 248);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i14 = onExtraCallback + 109;
        IAuthTabCallback = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull String str, float f, float f2, @Nullable AFh1lSDK.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AFh1lSDK.onNavigationEvent onnavigationevent, @Nullable Integer num, @Nullable Integer num2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        AFh1lSDK.onExtraCallbackWithResult onextracallbackwithresult2;
        Integer num3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        float f3 = (i2 & 4) != 0 ? f : f2;
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            onextracallbackwithresult2 = null;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        AFh1lSDK.onNavigationEvent onnavigationevent2 = (i2 & 16) != 0 ? null : onnavigationevent;
        if ((i2 & 32) != 0) {
            int i5 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        Integer num4 = (i2 & 64) != 0 ? null : num2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1493793256, i, -1, "im.toss.tosssecurities.uikit.compound.image.rememberResizedImageUrl (TossSecImage.kt:71)");
        }
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) && (i & 6) != 4) {
            z = false;
        } else {
            int i7 = IAuthTabCallback + 89;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        boolean z5 = (((i & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f)) || (i & 48) == 32;
        if (((i & 896) ^ 384) > 256) {
            int i9 = onExtraCallback + 95;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f3)) {
                z2 = (i & 384) == 256;
            }
        }
        if (((i & 7168) ^ 3072) > 2048) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onextracallbackwithresult2 == null ? -1 : onextracallbackwithresult2.ordinal())) {
            }
        } else if ((i & 3072) == 2048) {
            int i11 = onExtraCallback + 5;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (((57344 & i) ^ 24576) > 16384) {
            int i13 = onExtraCallback + 61;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent2 != null ? onnavigationevent2.ordinal() : -1)) {
                z4 = (i & 24576) == 16384;
            }
        }
        boolean z6 = (((458752 & i) ^ 196608) > 131072 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(num3)) || (i & 196608) == 131072;
        Integer num5 = num3;
        boolean z7 = (((3670016 & i) ^ 1572864) > 1048576 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(num4)) || (i & 1572864) == 1048576;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnNavigationEvent | z4 | z5 | z | z2 | z3 | z6 | z7)) {
            int i15 = onExtraCallback + 123;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 16 / 0;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AFh1lSDK aFh1lSDK = AFh1lSDK.IAuthTabCallback;
                    Integer numValueOf = Integer.valueOf((int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(f));
                    Integer num6 = numValueOf.intValue() <= 0 ? null : numValueOf;
                    Integer numValueOf2 = Integer.valueOf((int) r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(f3));
                    String strOnNavigationEvent = aFh1lSDK.onNavigationEvent(str, num6, numValueOf2.intValue() <= 0 ? null : numValueOf2, onextracallbackwithresult2, onnavigationevent2, num5, num4);
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = str;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(strOnNavigationEvent);
                    objOnMinimized = strOnNavigationEvent;
                }
            } else if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
        }
        String str2 = (String) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return str2;
    }
}
