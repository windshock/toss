package o;

import android.graphics.Rect;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AppLovinStarRatingView;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SnapshotStateListExternalSyntheticLambda0;
import o.immediateFailedFuture;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinStarRatingView {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
        float fFloatValue2 = ((Number) objArr[7]).floatValue();
        float fFloatValue3 = ((Number) objArr[8]).floatValue();
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[9];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[10];
        boolean zBooleanValue4 = ((Boolean) objArr[11]).booleanValue();
        String str = (String) objArr[12];
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int iIntValue4 = ((Number) objArr[15]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
        ((Number) objArr[17]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        onNavigationEvent(composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, zBooleanValue, zBooleanValue2, iIntValue, fFloatValue, zBooleanValue3, fFloatValue2, fFloatValue3, quirkSettingsLoader, immediatefailedfuture, zBooleanValue4, str, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2) : RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue2), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue3), iIntValue4);
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, immediateFailedFuture immediatefailedfuture, String str, Function0 function0, QuirkSettingsLoader quirkSettingsLoader, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, f, f2, immediatefailedfuture, str, function0, quirkSettingsLoader, z, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, f, f2, immediatefailedfuture, str, function0, quirkSettingsLoader, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ float onNavigationEvent(SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallback = onExtraCallback(snapshotKtExternalSyntheticLambda1);
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        int iIntValue = ((Number) objArr[4]).intValue();
        float fFloatValue = ((Number) objArr[5]).floatValue();
        boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
        float fFloatValue2 = ((Number) objArr[7]).floatValue();
        float fFloatValue3 = ((Number) objArr[8]).floatValue();
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[9];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[10];
        boolean zBooleanValue4 = ((Boolean) objArr[11]).booleanValue();
        String str = (String) objArr[12];
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int iIntValue4 = ((Number) objArr[15]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
        int iIntValue5 = ((Number) objArr[17]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue), Float.valueOf(fFloatValue), Boolean.valueOf(zBooleanValue3), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(zBooleanValue4), str, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue5)};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback3 = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback4 = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnExtraCallback2, iOnExtraCallback, 364824290, iOnExtraCallback3, objArr2, iOnExtraCallback4, -364824290);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, boolean z, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Object[] objArr = {composableLambdaImplExternalSyntheticLambda2, function0, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
            return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -245691573, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), 245691574);
        }
        Object[] objArr2 = {composableLambdaImplExternalSyntheticLambda2, function0, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i3 | i2));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i2 | i3)) | (~(i13 | i8)) | (~(i6 | i2));
        int i16 = i6 + i3 + i + ((-298151579) * i4) + ((-427515960) * i5);
        int i17 = i16 * i16;
        int i18 = ((i6 * (-2003555040)) - 1632655964) + (i3 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + ((-2003554617) * i) + (1812671363 * i4) + ((-1519508360) * i5) + (i17 * (-1288372224));
        int i19 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i3) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i) + ((-16252928) * i4) + (423624704 * i5) + (1109590016 * i17) + (i18 * i18 * (-1796407296));
        if (i19 != 1) {
            return i19 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
        }
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        float fFloatValue = ((Number) objArr[3]).floatValue();
        float fFloatValue2 = ((Number) objArr[4]).floatValue();
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[5];
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        String str = (String) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i20 = 2 % 2;
        int i21 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, function0, quirksExternalSyntheticBackport0, fFloatValue, fFloatValue2, quirkSettingsLoader, immediatefailedfuture, zBooleanValue, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i23 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i23 % 128;
        int i24 = i23 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, int i, float f, boolean z3, float f2, float f3, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, boolean z4, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        boolean z5;
        boolean z6;
        int i5;
        boolean z7;
        String str3;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i4 & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i4 & 8) != 0) {
            int i9 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z6 = true;
        } else {
            z6 = z2;
        }
        if ((i4 & 16) != 0) {
            int i11 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        float f4 = (i4 & 32) != 0 ? 1.0f : f;
        if ((i4 & 64) != 0) {
            int i13 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z7 = false;
        } else {
            z7 = z3;
        }
        float fOnExtraCallback = (i4 & 128) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f2;
        float fOnExtraCallback2 = (i4 & 256) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f3;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i4 & 512) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (i4 & 1024) != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
        boolean z8 = (i4 & 2048) != 0 ? true : z4;
        if ((i4 & 4096) != 0) {
            int i15 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i17 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1781331633, i2, i3, "im.toss.tds.compose.component.atom.lottie.TdsLottie (TdsLottie.kt:42)");
        }
        onNavigationEvent(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.IAuthTabCallback(SnapshotStateListExternalSyntheticLambda0.onTransact.onNavigationEvent(str)), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 62).onWarmupCompleted(), quirksExternalSyntheticBackport02, z5, z6, i5, f4, z7, fOnExtraCallback, fOnExtraCallback2, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, z8, str3, cameraCaptureResultEmptyCameraCaptureResult, i2 & 2147483632, i3 & 1022, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static final void onWarmupCompleted(int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, int i2, float f, boolean z3, float f2, float f3, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, boolean z4, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4, int i5) {
        int i6;
        float f4;
        float f5;
        String str2;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i8 % 128;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i8 % 2 != 0 ? (i5 & 2) == 0 : (i5 & 5) == 0) ? quirksExternalSyntheticBackport0 : QuirksExternalSyntheticBackport0.Companion;
        boolean z5 = (i5 & 4) != 0 ? true : z;
        boolean z6 = (i5 & 8) != 0 ? true : z2;
        if ((i5 & 16) != 0) {
            int i9 = IAuthTabCallback;
            int i10 = i9 + 71;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 79;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i6 = 1;
        } else {
            i6 = i2;
        }
        if ((i5 & 32) != 0) {
            int i14 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            f4 = 1.0f;
        } else {
            f4 = f;
        }
        boolean z7 = (i5 & 64) != 0 ? false : z3;
        float fOnExtraCallback = (i5 & 128) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f2;
        if ((i5 & 256) != 0) {
            float fOnExtraCallback2 = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
            int i16 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
            f5 = fOnExtraCallback2;
        } else {
            f5 = f3;
        }
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i5 & 512) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (i5 & 1024) != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
        boolean z8 = (i5 & 2048) != 0 ? true : z4;
        if ((i5 & 4096) != 0) {
            int i18 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i18 % 128;
            Object obj = null;
            if (i18 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1532348859, i3, i4, "im.toss.tds.compose.component.atom.lottie.TdsLottie (TdsLottie.kt:76)");
        }
        onNavigationEvent(RememberLottieCompositionKt.onExtraCallback(SnapshotStateListExternalSyntheticLambda0.onWarmupCompleted.onExtraCallbackWithResult(SnapshotStateListExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(i)), (String) null, (String) null, (String) null, (String) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 62).onWarmupCompleted(), quirksExternalSyntheticBackport02, z5, z6, i6, f4, z7, fOnExtraCallback, f5, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, z8, str2, cameraCaptureResultEmptyCameraCaptureResult, i3 & 2147483632, i4 & 1022, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i19 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
    }

    private static final float onExtraCallback(SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnWarmupCompleted = onWarmupCompleted(snapshotKtExternalSyntheticLambda1);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return fOnWarmupCompleted;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable final ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, int i, float f, boolean z3, float f2, float f3, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, boolean z4, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z5;
        final boolean z6;
        final int i24;
        final float f4;
        final boolean z7;
        final float f5;
        final float f6;
        final QuirkSettingsLoader quirkSettingsLoader2;
        immediateFailedFuture immediatefailedfuture2;
        boolean z8;
        final String str2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z9;
        float fOnExtraCallback;
        String str3;
        boolean z10;
        Object obj;
        int i25 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1080811489);
        if ((i2 & 6) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(composableLambdaImplExternalSyntheticLambda2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ^ true ? 128 : 256;
                }
                i7 = i4 & 8;
                Object obj2 = null;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    int i27 = IAuthTabCallback + 7;
                    onExtraCallbackWithResult = i27 % 128;
                    if (i27 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2);
                        throw null;
                    }
                    i5 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ^ true) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                            int i28 = IAuthTabCallback + 79;
                            onExtraCallbackWithResult = i28 % 128;
                            i9 = i28 % 2 != 0 ? 904 : 16384;
                        } else {
                            i9 = 8192;
                        }
                        i10 = i9 | i5;
                    }
                    i11 = i4 & 32;
                    if (i11 == 0) {
                        i10 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f))) {
                                int i29 = IAuthTabCallback + 79;
                                onExtraCallbackWithResult = i29 % 128;
                                if (i29 % 2 != 0) {
                                    obj2.hashCode();
                                    throw null;
                                }
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i10 |= i12;
                        }
                        i13 = i4 & 64;
                        if (i13 != 0) {
                            int i30 = onExtraCallbackWithResult + 67;
                            IAuthTabCallback = i30 % 128;
                            if (i30 % 2 == 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            i10 |= 1572864;
                        } else {
                            if ((1572864 & i2) == 0) {
                                i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                            }
                            i14 = i4 & 128;
                            if (i14 == 0) {
                                i10 |= 12582912;
                            } else {
                                if ((i2 & 12582912) == 0) {
                                    i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 8388608 : 4194304;
                                }
                                i15 = i4 & 256;
                                if (i15 != 0) {
                                    i10 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3)) {
                                        int i31 = IAuthTabCallback + 111;
                                        onExtraCallbackWithResult = i31 % 128;
                                        int i32 = i31 % 2;
                                        i16 = 67108864;
                                    } else {
                                        i16 = 33554432;
                                    }
                                    i10 |= i16;
                                }
                                i17 = i4 & 512;
                                if (i17 != 0) {
                                    i10 |= 805306368;
                                } else {
                                    if ((805306368 & i2) == 0) {
                                        i10 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader) ? 536870912 : 268435456;
                                    }
                                    i18 = i4 & 1024;
                                    if (i18 == 0) {
                                        i19 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture)) {
                                            int i33 = IAuthTabCallback + 17;
                                            onExtraCallbackWithResult = i33 % 128;
                                            int i34 = i33 % 2;
                                            i20 = 4;
                                        } else {
                                            i20 = 2;
                                        }
                                        i19 = i3 | i20;
                                    } else {
                                        i19 = i3;
                                    }
                                    i21 = i4 & 2048;
                                    if (i21 == 0) {
                                        i19 |= 48;
                                    } else if ((i3 & 48) == 0) {
                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 32 : 16;
                                    }
                                    i22 = i19;
                                    i23 = i4 & 4096;
                                    if (i23 != 0) {
                                        if ((i3 & 384) == 0) {
                                            int i35 = IAuthTabCallback + 61;
                                            onExtraCallbackWithResult = i35 % 128;
                                            int i36 = i35 % 2;
                                            i22 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i26 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            z5 = i6 != 0 ? true : z;
                                            boolean z11 = i7 != 0 ? true : z2;
                                            int i37 = i8 != 0 ? 1 : i;
                                            float f7 = i11 != 0 ? 1.0f : f;
                                            if (i13 != 0) {
                                                int i38 = onExtraCallbackWithResult + 71;
                                                IAuthTabCallback = i38 % 128;
                                                z9 = i38 % 2 == 0;
                                            } else {
                                                z9 = z3;
                                            }
                                            float fOnExtraCallback2 = i14 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f2;
                                            if (i15 != 0) {
                                                int i39 = onExtraCallbackWithResult + 97;
                                                IAuthTabCallback = i39 % 128;
                                                if (i39 % 2 == 0) {
                                                    VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                                                    obj2.hashCode();
                                                    throw null;
                                                }
                                                fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                                            } else {
                                                fOnExtraCallback = f3;
                                            }
                                            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = i17 != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
                                            immediateFailedFuture immediatefailedfutureIAuthTabCallback = i18 != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
                                            boolean z12 = i21 != 0 ? true : z4;
                                            String str4 = i23 != 0 ? null : str;
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                str3 = str4;
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1080811489, i10, i22, "im.toss.tds.compose.component.atom.lottie.TdsLottie (TdsLottie.kt:146)");
                                            } else {
                                                str3 = str4;
                                            }
                                            int iCoerceAtLeast = RangesKt.coerceAtLeast(i37, 1);
                                            int i40 = i10 & 14;
                                            int i41 = i37;
                                            int i42 = i10 >> 3;
                                            z8 = z12;
                                            final SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult = SaverKtExternalSyntheticLambda0.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2, z5, z11, z9, (SnapshotKtExternalSyntheticLambda0) null, f7, iCoerceAtLeast, (SnapshotCompanionExternalSyntheticLambda1) null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i42 & 896) | i40 | 24576 | (i42 & 112) | ((i10 >> 9) & 7168) | (458752 & i10), 896);
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult);
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnNavigationEvent) {
                                                z10 = z9;
                                            } else {
                                                int i43 = IAuthTabCallback + 21;
                                                z10 = z9;
                                                onExtraCallbackWithResult = i43 % 128;
                                                if (i43 % 2 != 0) {
                                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                    throw null;
                                                }
                                                obj = objOnMinimized;
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                }
                                                int i44 = i10 >> 12;
                                                int i45 = i22 << 18;
                                                onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, (Function0) obj, quirksExternalSyntheticBackport03, fOnExtraCallback2, fOnExtraCallback, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, z8, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i10 << 3) & 896) | i40 | (i44 & 7168) | (57344 & i44) | (i44 & 458752) | (3670016 & i45) | (29360128 & i45) | (234881024 & i45), 0);
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                f6 = fOnExtraCallback;
                                                quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                                                z7 = z10;
                                                f5 = fOnExtraCallback2;
                                                f4 = f7;
                                                z6 = z11;
                                                str2 = str3;
                                                i24 = i41;
                                            }
                                            Function0 function0 = new Function0() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda0
                                                private static int onExtraCallback = 1;
                                                private static int onExtraCallbackWithResult;

                                                public final Object invoke() {
                                                    Float fValueOf;
                                                    int i46 = 2 % 2;
                                                    int i47 = onExtraCallback + 13;
                                                    onExtraCallbackWithResult = i47 % 128;
                                                    if (i47 % 2 != 0) {
                                                        fValueOf = Float.valueOf(AppLovinStarRatingView.onNavigationEvent(snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult));
                                                        int i48 = 71 / 0;
                                                    } else {
                                                        fValueOf = Float.valueOf(AppLovinStarRatingView.onNavigationEvent(snapshotKtExternalSyntheticLambda1OnExtraCallbackWithResult));
                                                    }
                                                    int i49 = onExtraCallbackWithResult + 51;
                                                    onExtraCallback = i49 % 128;
                                                    if (i49 % 2 == 0) {
                                                        int i50 = 92 / 0;
                                                    }
                                                    return fValueOf;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0);
                                            obj = function0;
                                            int i442 = i10 >> 12;
                                            int i452 = i22 << 18;
                                            onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, (Function0) obj, quirksExternalSyntheticBackport03, fOnExtraCallback2, fOnExtraCallback, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, z8, str3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i10 << 3) & 896) | i40 | (i442 & 7168) | (57344 & i442) | (i442 & 458752) | (3670016 & i452) | (29360128 & i452) | (234881024 & i452), 0);
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            f6 = fOnExtraCallback;
                                            quirkSettingsLoader2 = quirkSettingsLoaderOnExtraCallback;
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                            immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                                            z7 = z10;
                                            f5 = fOnExtraCallback2;
                                            f4 = f7;
                                            z6 = z11;
                                            str2 = str3;
                                            i24 = i41;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            z5 = z;
                                            z6 = z2;
                                            i24 = i;
                                            f4 = f;
                                            z7 = z3;
                                            f5 = f2;
                                            f6 = f3;
                                            quirkSettingsLoader2 = quirkSettingsLoader;
                                            immediatefailedfuture2 = immediatefailedfuture;
                                            z8 = z4;
                                            str2 = str;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            final boolean z13 = z5;
                                            final immediateFailedFuture immediatefailedfuture3 = immediatefailedfuture2;
                                            final boolean z14 = z8;
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda1
                                                private static int onExtraCallbackWithResult = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj3, Object obj4) {
                                                    int i46 = 2 % 2;
                                                    int i47 = onWarmupCompleted + 119;
                                                    onExtraCallbackWithResult = i47 % 128;
                                                    int i48 = i47 % 2;
                                                    ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda22 = composableLambdaImplExternalSyntheticLambda2;
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                                    boolean z15 = z13;
                                                    boolean z16 = z6;
                                                    int i49 = i24;
                                                    float f8 = f4;
                                                    boolean z17 = z7;
                                                    float f9 = f5;
                                                    float f10 = f6;
                                                    QuirkSettingsLoader quirkSettingsLoader3 = quirkSettingsLoader2;
                                                    immediateFailedFuture immediatefailedfuture4 = immediatefailedfuture3;
                                                    boolean z18 = z14;
                                                    String str5 = str2;
                                                    int i50 = i2;
                                                    int i51 = i3;
                                                    int i52 = i4;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    Object[] objArr = {composableLambdaImplExternalSyntheticLambda22, quirksExternalSyntheticBackport04, Boolean.valueOf(z15), Boolean.valueOf(z16), Integer.valueOf(i49), Float.valueOf(f8), Boolean.valueOf(z17), Float.valueOf(f9), Float.valueOf(f10), quirkSettingsLoader3, immediatefailedfuture4, Boolean.valueOf(z18), str5, Integer.valueOf(i50), Integer.valueOf(i51), Integer.valueOf(i52), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                                                    Unit unit = (Unit) AppLovinStarRatingView.onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 847311548, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), -847311546);
                                                    int i53 = onExtraCallbackWithResult + 71;
                                                    onWarmupCompleted = i53 % 128;
                                                    if (i53 % 2 != 0) {
                                                        int i54 = 82 / 0;
                                                    }
                                                    return unit;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i22 |= 384;
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i18 = i4 & 1024;
                                if (i18 == 0) {
                                }
                                i21 = i4 & 2048;
                                if (i21 == 0) {
                                }
                                i22 = i19;
                                i23 = i4 & 4096;
                                if (i23 != 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i15 = i4 & 256;
                            if (i15 != 0) {
                            }
                            i17 = i4 & 512;
                            if (i17 != 0) {
                            }
                            i18 = i4 & 1024;
                            if (i18 == 0) {
                            }
                            i21 = i4 & 2048;
                            if (i21 == 0) {
                            }
                            i22 = i19;
                            i23 = i4 & 4096;
                            if (i23 != 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i14 = i4 & 128;
                        if (i14 == 0) {
                        }
                        i15 = i4 & 256;
                        if (i15 != 0) {
                        }
                        i17 = i4 & 512;
                        if (i17 != 0) {
                        }
                        i18 = i4 & 1024;
                        if (i18 == 0) {
                        }
                        i21 = i4 & 2048;
                        if (i21 == 0) {
                        }
                        i22 = i19;
                        i23 = i4 & 4096;
                        if (i23 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i13 = i4 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i4 & 128;
                    if (i14 == 0) {
                    }
                    i15 = i4 & 256;
                    if (i15 != 0) {
                    }
                    i17 = i4 & 512;
                    if (i17 != 0) {
                    }
                    i18 = i4 & 1024;
                    if (i18 == 0) {
                    }
                    i21 = i4 & 2048;
                    if (i21 == 0) {
                    }
                    i22 = i19;
                    i23 = i4 & 4096;
                    if (i23 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i10 = i5;
                i11 = i4 & 32;
                if (i11 == 0) {
                }
                i13 = i4 & 64;
                if (i13 != 0) {
                }
                i14 = i4 & 128;
                if (i14 == 0) {
                }
                i15 = i4 & 256;
                if (i15 != 0) {
                }
                i17 = i4 & 512;
                if (i17 != 0) {
                }
                i18 = i4 & 1024;
                if (i18 == 0) {
                }
                i21 = i4 & 2048;
                if (i21 == 0) {
                }
                i22 = i19;
                i23 = i4 & 4096;
                if (i23 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4 & 8;
            Object obj22 = null;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i10 = i5;
            i11 = i4 & 32;
            if (i11 == 0) {
            }
            i13 = i4 & 64;
            if (i13 != 0) {
            }
            i14 = i4 & 128;
            if (i14 == 0) {
            }
            i15 = i4 & 256;
            if (i15 != 0) {
            }
            i17 = i4 & 512;
            if (i17 != 0) {
            }
            i18 = i4 & 1024;
            if (i18 == 0) {
            }
            i21 = i4 & 2048;
            if (i21 == 0) {
            }
            i22 = i19;
            i23 = i4 & 4096;
            if (i23 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        Object obj222 = null;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i10 = i5;
        i11 = i4 & 32;
        if (i11 == 0) {
        }
        i13 = i4 & 64;
        if (i13 != 0) {
        }
        i14 = i4 & 128;
        if (i14 == 0) {
        }
        i15 = i4 & 256;
        if (i15 != 0) {
        }
        i17 = i4 & 512;
        if (i17 != 0) {
        }
        i18 = i4 & 1024;
        if (i18 == 0) {
        }
        i21 = i4 & 2048;
        if (i21 == 0) {
        }
        i22 = i19;
        i23 = i4 & 4096;
        if (i23 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i10) == 306783378 && (i22 & 147) == 146) ? false : true, i10 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            int i3 = 11 / 0;
            if (str != null) {
                int i4 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            }
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            if (str != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, immediateFailedFuture immediatefailedfuture, final String str, Function0 function0, QuirkSettingsLoader quirkSettingsLoader, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int iIntValue;
        int iIntValue2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        immediateFailedFuture.IAuthTabCallback iAuthTabCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        float f3;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        Rect rectOnExtraCallbackWithResult;
        Rect rectOnExtraCallbackWithResult2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i3 % 128;
            z2 = i3 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1893723377, i, -1, "im.toss.tds.compose.component.atom.lottie.TdsLottie.<anonymous> (TdsLottie.kt:184)");
            }
            if (composableLambdaImplExternalSyntheticLambda2 == null || (rectOnExtraCallbackWithResult2 = composableLambdaImplExternalSyntheticLambda2.onExtraCallbackWithResult()) == null) {
                iIntValue = 1;
                if (composableLambdaImplExternalSyntheticLambda2 != null || (rectOnExtraCallbackWithResult = composableLambdaImplExternalSyntheticLambda2.onExtraCallbackWithResult()) == null) {
                    iIntValue2 = 1;
                    float f4 = iIntValue2 / iIntValue;
                    quirksExternalSyntheticBackport0OnExtraCallback = !Float.isNaN(f) ? quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, f)) : quirksExternalSyntheticBackport0;
                    if (!Float.isNaN(f2)) {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, f2));
                    }
                    iAuthTabCallback = immediateFailedFuture.Companion;
                    if (Intrinsics.areEqual(immediatefailedfuture, iAuthTabCallback.IAuthTabCallback()) || Intrinsics.areEqual(immediatefailedfuture, ResourceSizeKt.onNavigationEvent(iAuthTabCallback)) || Intrinsics.areEqual(immediatefailedfuture, ResourceSizeKt.onWarmupCompleted(iAuthTabCallback))) {
                        if (Float.isNaN(f) && Float.isNaN(f2)) {
                            int i4 = IAuthTabCallback + 57;
                            onExtraCallbackWithResult = i4 % 128;
                            if (i4 % 2 != 0) {
                                onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                f3 = f + f4;
                            } else {
                                onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                f3 = f * f4;
                            }
                            quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f3));
                        } else if (Float.isNaN(f) || Float.isNaN(f2)) {
                            quirksExternalSyntheticBackport0AsBinder = QuirksExternalSyntheticBackport0.Companion;
                        } else {
                            int i5 = IAuthTabCallback + 89;
                            onExtraCallbackWithResult = i5 % 128;
                            int i6 = i5 % 2;
                            quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f2 / f4));
                        }
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(quirksExternalSyntheticBackport0AsBinder);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda2
                                private static int onExtraCallbackWithResult = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj) {
                                    int i7 = 2 % 2;
                                    int i8 = onNavigationEvent + 119;
                                    onExtraCallbackWithResult = i8 % 128;
                                    int i9 = i8 % 2;
                                    String str2 = str;
                                    useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                                    if (i9 != 0) {
                                        return AppLovinStarRatingView.IAuthTabCallback(str2, useandconfigureprogramwithtexture);
                                    }
                                    AppLovinStarRatingView.IAuthTabCallback(str2, useandconfigureprogramwithtexture);
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        }
                        ReadonlySnapshot.onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, function0, setAdVideoPlaybackListener.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized, 1, (Object) null), "LottieAnimation", (Object) null, showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2)), false, false, false, false, (RenderMode) null, false, (SnapshotStateObserverExternalSyntheticLambda0) null, quirkSettingsLoader, immediatefailedfuture, z, false, (Map) null, (ComposableLambdaImplExternalSyntheticLambda4) null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 123896);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i7 = IAuthTabCallback + 67;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        int i9 = IAuthTabCallback + 39;
                        onExtraCallbackWithResult = i9 % 128;
                        int i10 = i9 % 2;
                        if (!Intrinsics.areEqual(immediatefailedfuture, iAuthTabCallback.onExtraCallbackWithResult())) {
                            int i11 = onExtraCallbackWithResult + 7;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            if (Intrinsics.areEqual(immediatefailedfuture, iAuthTabCallback.onExtraCallback())) {
                            }
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent) {
                                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda2
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj) {
                                        int i72 = 2 % 2;
                                        int i82 = onNavigationEvent + 119;
                                        onExtraCallbackWithResult = i82 % 128;
                                        int i92 = i82 % 2;
                                        String str2 = str;
                                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                                        if (i92 != 0) {
                                            return AppLovinStarRatingView.IAuthTabCallback(str2, useandconfigureprogramwithtexture);
                                        }
                                        AppLovinStarRatingView.IAuthTabCallback(str2, useandconfigureprogramwithtexture);
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                                ReadonlySnapshot.onWarmupCompleted(composableLambdaImplExternalSyntheticLambda2, function0, setAdVideoPlaybackListener.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized, 1, (Object) null), "LottieAnimation", (Object) null, showAndRender.onExtraCallbackWithResult(composableLambdaImplExternalSyntheticLambda2)), false, false, false, false, (RenderMode) null, false, (SnapshotStateObserverExternalSyntheticLambda0) null, quirkSettingsLoader, immediatefailedfuture, z, false, (Map) null, (ComposableLambdaImplExternalSyntheticLambda4) null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 123896);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                            }
                        }
                    }
                } else {
                    int i13 = IAuthTabCallback + 57;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    Integer numValueOf = Integer.valueOf(rectOnExtraCallbackWithResult.height());
                    if (numValueOf.intValue() <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int i15 = onExtraCallbackWithResult + 89;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        iIntValue2 = numValueOf.intValue();
                    }
                    float f42 = iIntValue2 / iIntValue;
                    if (!Float.isNaN(f)) {
                    }
                    if (!Float.isNaN(f2)) {
                    }
                    iAuthTabCallback = immediateFailedFuture.Companion;
                    if (Intrinsics.areEqual(immediatefailedfuture, iAuthTabCallback.IAuthTabCallback())) {
                        if (Float.isNaN(f)) {
                            if (Float.isNaN(f)) {
                                quirksExternalSyntheticBackport0AsBinder = QuirksExternalSyntheticBackport0.Companion;
                                quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(quirksExternalSyntheticBackport0AsBinder);
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (zOnNavigationEvent) {
                                }
                            }
                        }
                    }
                }
            } else {
                Integer numValueOf2 = Integer.valueOf(rectOnExtraCallbackWithResult2.width());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                }
                if (composableLambdaImplExternalSyntheticLambda2 != null) {
                    iIntValue2 = 1;
                    float f422 = iIntValue2 / iIntValue;
                    if (!Float.isNaN(f)) {
                    }
                    if (!Float.isNaN(f2)) {
                    }
                    iAuthTabCallback = immediateFailedFuture.Companion;
                    if (Intrinsics.areEqual(immediatefailedfuture, iAuthTabCallback.IAuthTabCallback())) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable final ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, @NotNull final Function0<Float> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, boolean z, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        QuirkSettingsLoader quirkSettingsLoader2;
        int i8;
        int i9;
        int i10;
        int i11;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final float f4;
        final boolean z2;
        final float f5;
        final QuirkSettingsLoader quirkSettingsLoader3;
        final immediateFailedFuture immediatefailedfuture2;
        final String str2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(23026772);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(composableLambdaImplExternalSyntheticLambda2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            int i14 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                        int i16 = onExtraCallbackWithResult + 55;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        f3 = f2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            quirkSettingsLoader2 = quirkSettingsLoader;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader2) ^ true ? 65536 : 131072;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(immediatefailedfuture)) {
                                int i18 = IAuthTabCallback + 105;
                                onExtraCallbackWithResult = i18 % 128;
                                if (i18 % 2 != 0) {
                                    str.hashCode();
                                    throw null;
                                }
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            int i19 = IAuthTabCallback + 73;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                i3 |= 12582912;
                                int i20 = 17 / 0;
                            } else {
                                i3 |= 12582912;
                            }
                        } else {
                            if ((i & 12582912) == 0) {
                                int i21 = IAuthTabCallback + 59;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
                            }
                            i11 = i2 & 256;
                            if (i11 != 0) {
                                if ((i & 100663296) == 0) {
                                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 67108864 : 33554432;
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    float fOnExtraCallback = i4 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                    float fOnExtraCallback2 = i6 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f3;
                                    if (i7 != 0) {
                                        int i23 = IAuthTabCallback + 55;
                                        onExtraCallbackWithResult = i23 % 128;
                                        int i24 = i23 % 2;
                                        quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                                    } else {
                                        quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader2;
                                    }
                                    immediateFailedFuture immediatefailedfutureIAuthTabCallback = i8 != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
                                    boolean z3 = i10 != 0 ? true : z;
                                    str = i11 == 0 ? str : null;
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(23026772, i3, -1, "im.toss.tds.compose.component.atom.lottie.TdsLottie (TdsLottie.kt:182)");
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                    final float f6 = fOnExtraCallback;
                                    final float f7 = fOnExtraCallback2;
                                    final immediateFailedFuture immediatefailedfuture3 = immediatefailedfutureIAuthTabCallback;
                                    final String str3 = str;
                                    final QuirkSettingsLoader quirkSettingsLoader4 = quirkSettingsLoaderOnExtraCallback;
                                    final boolean z4 = z3;
                                    putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.ICustomTabsCallback(), null, null, ForwardingCameraControl.onExtraCallback(1893723377, true, new Function2() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda3
                                        private static int onExtraCallback = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i25 = 2 % 2;
                                            int i26 = onNavigationEvent + 55;
                                            onExtraCallback = i26 % 128;
                                            int i27 = i26 % 2;
                                            Unit unitIAuthTabCallback = AppLovinStarRatingView.IAuthTabCallback(composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport04, f6, f7, immediatefailedfuture3, str3, function0, quirkSettingsLoader4, z4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i28 = onNavigationEvent + 123;
                                            onExtraCallback = i28 % 128;
                                            int i29 = i28 % 2;
                                            return unitIAuthTabCallback;
                                        }
                                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 6);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        int i25 = onExtraCallbackWithResult + 101;
                                        IAuthTabCallback = i25 % 128;
                                        int i26 = i25 % 2;
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                    str2 = str;
                                    f4 = fOnExtraCallback;
                                    f5 = fOnExtraCallback2;
                                    quirkSettingsLoader3 = quirkSettingsLoaderOnExtraCallback;
                                    z2 = z3;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                    f4 = f;
                                    z2 = z;
                                    f5 = f3;
                                    quirkSettingsLoader3 = quirkSettingsLoader2;
                                    immediatefailedfuture2 = immediatefailedfuture;
                                    str2 = str;
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.lottie.TdsLottieKt$$ExternalSyntheticLambda4
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke(Object obj, Object obj2) {
                                            int i27 = 2 % 2;
                                            int i28 = onExtraCallback + 75;
                                            onExtraCallbackWithResult = i28 % 128;
                                            int i29 = i28 % 2;
                                            Unit unitOnNavigationEvent = AppLovinStarRatingView.onNavigationEvent(composableLambdaImplExternalSyntheticLambda2, function0, quirksExternalSyntheticBackport02, f4, f5, quirkSettingsLoader3, immediatefailedfuture2, z2, str2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                            int i30 = onExtraCallbackWithResult + 65;
                                            onExtraCallback = i30 % 128;
                                            if (i30 % 2 == 0) {
                                                return unitOnNavigationEvent;
                                            }
                                            throw null;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i11 = i2 & 256;
                        if (i11 != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    quirkSettingsLoader2 = quirkSettingsLoader;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                f3 = f2;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                quirkSettingsLoader2 = quirkSettingsLoader;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            f3 = f2;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            quirkSettingsLoader2 = quirkSettingsLoader;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i10 = i2 & 128;
            if (i10 != 0) {
            }
            i11 = i2 & 256;
            if (i11 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        f3 = f2;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        quirkSettingsLoader2 = quirkSettingsLoader;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i10 = i2 & 128;
        if (i10 != 0) {
        }
        i11 = i2 & 256;
        if (i11 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final float onWarmupCompleted(SnapshotKtExternalSyntheticLambda1 snapshotKtExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) snapshotKtExternalSyntheticLambda1.onExtraCallbackWithResult();
        if (i3 == 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, int i, float f, boolean z3, float f2, float f3, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, boolean z4, String str, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z3), Float.valueOf(f2), Float.valueOf(f3), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(z4), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 847311548, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), -847311546);
    }

    private static final Unit onExtraCallback(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, boolean z, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {composableLambdaImplExternalSyntheticLambda2, function0, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(z), str, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -245691573, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), 245691574);
    }

    private static final Unit onExtraCallback(ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, int i, float f, boolean z3, float f2, float f3, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, boolean z4, String str, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {composableLambdaImplExternalSyntheticLambda2, quirksExternalSyntheticBackport0, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z3), Float.valueOf(f2), Float.valueOf(f3), quirkSettingsLoader, immediatefailedfuture, Boolean.valueOf(z4), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        return (Unit) onWarmupCompleted(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), 364824290, ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), -364824290);
    }
}
