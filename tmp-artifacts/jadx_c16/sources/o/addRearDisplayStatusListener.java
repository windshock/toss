package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.v2.screen.NativeAdsFullBannerV2ScreenKt$;
import im.toss.features.usshome.UssHomeItemAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1;
import o.createCameraCaptureCallback;
import o.seek;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class addRearDisplayStatusListener {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 7673545495462202037L;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        NativeAdsDto.Creative.FullBanner fullBanner = (NativeAdsDto.Creative.FullBanner) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        Function2 function2 = (Function2) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {fullBanner, Boolean.valueOf(zBooleanValue), Float.valueOf(fFloatValue), deleteprofile, Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), function2, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue))};
        onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -771064974, objArr2, 771064975);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(resources, useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(resources, useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function2);
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        if (i5 != 0) {
            return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 2103429531, objArr, -2103429527);
        }
        int i6 = 17 / 0;
        return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 2103429531, objArr, -2103429527);
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function0);
        }
        onWarmupCompleted(function0);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function2);
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, resources, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = onWarmupCompleted + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function2);
        int i4 = onWarmupCompleted + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i6 | i5;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i6);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i6) | (~i5)));
        int i13 = i6 + i5 + i4 + (1699743442 * i) + (2071835342 * i3);
        int i14 = i13 * i13;
        int i15 = ((i6 * (-557635572)) - 1375207424) + ((-557635572) * i5) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i4) + ((-648019968) * i) + ((-1801453568) * i3) + (1296564224 * i14);
        int i16 = ((i6 * (-355764420)) - 259725689) + (i5 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + (i4 * (-355763899)) + (i * 2119243930) + (i3 * (-943812730)) + (i14 * (-597164032));
        int i17 = i15 + (i16 * i16 * 58195968);
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
        }
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i18 = 2 % 2;
        int i19 = onWarmupCompleted + 41;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i21 = onNavigationEvent + 119;
        onWarmupCompleted = i21 % 128;
        int i22 = i21 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, long j, long j2, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j3, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j4, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(f, f2, setcontentinsetsrelative, function2, fullBanner, j, j2, z, z2, function0, z3, resources, j3, z4, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j4, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(f, f2, setcontentinsetsrelative, function2, fullBanner, j, j2, z, z2, function0, z3, resources, j3, z4, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j4, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(fullBanner, z, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(fullBanner, z, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function2);
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 41;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 83, TextUtils.indexOf((CharSequence) "", '0') + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14185), 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 8808 - View.resolveSizeAndState(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf((int) futures3.asBinder()));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf((int) futures3.asBinder()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(String str, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str + resources.getString(R.string.ads_sdk_talkback_message_clickable));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            String string = resources.getString(R.string.ads_sdk_talkback_message_clickable);
            Intrinsics.checkNotNullExpressionValue(string, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String string2 = resources.getString(R.string.ads_sdk_talkback_message_clickable);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string2);
        int i3 = 54 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function2 function2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            function2.invoke("2002", Boolean.TRUE);
            return Unit.INSTANCE;
        }
        function2.invoke("2002", Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jNewSessionWithExtras;
        int i2 = 2 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onWarmupCompleted + 89;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 28 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1318500896, i, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullBannerV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Screen.kt:143)");
                    int i5 = onNavigationEvent + 21;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback, onextracallbackwithresult.getInterfaceDescriptor()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 9, (Object) null);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-63996050);
                    jNewSessionWithExtras = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).newSessionWithExtras();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-63997234);
                    jNewSessionWithExtras = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -523958350, OverseasRrnInputTextField.IAuthTabCallback(), 523958365)).longValue();
                    int i7 = onWarmupCompleted + 109;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, jNewSessionWithExtras, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i9 = onNavigationEvent + 39;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        int i10 = 69 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"AD", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 24630, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback2, onextracallbackwithresult3.getInterfaceDescriptor()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 9, (Object) null);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback2, jNewSessionWithExtras, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"AD", CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f)), null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 24630, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(Function2 function2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke("1000", Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(Function2 function2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke("1002", Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(Function2 function2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{62685, 62701, 9260, 51023, 21217}, KeyEvent.normalizeMetaState(0) + 1, objArr);
        function2.invoke(((String) objArr[0]).intern(), Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z2 = true;
        } else {
            int i3 = onNavigationEvent + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z2 = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1))) {
            int i5 = onWarmupCompleted + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(104291695, i, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullBannerV2Screen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerV2Screen.kt:216)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1440073740);
            String strIAuthTabCallbackDefault = fullBanner.IAuthTabCallbackDefault();
            if (StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                strIAuthTabCallbackDefault = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_full_cta_default, cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault, null, null, Long.valueOf(z ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L) : setByteOrder.Companion.asBinder()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, long j, long j2, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j3, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j4, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        char c;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long jAsBinder;
        long jOnExtraCallbackWithResult;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
                int i5 = onWarmupCompleted + 61;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = onWarmupCompleted + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 123;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1898150531, i2, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullBannerV2Screen.<anonymous> (NativeAdsFullBannerV2Screen.kt:93)");
            }
            float fMin = Math.min(RangesKt.coerceIn((focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted() - 640.0f) / 200.0f, 0.0f, 1.0f), RangesKt.coerceIn((1.35f - f) / 0.35000002f, 0.0f, 1.0f));
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)) * fMin));
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)) * fMin));
            float fIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(focusMeteringControlExternalSyntheticLambda9.onNavigationEvent());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i11 = onNavigationEvent + 37;
                onWarmupCompleted = i11 % 128;
                objOnMinimized = i11 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            boolean z5 = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).floatValue() + f2 <= fIAuthTabCallbackDefault;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), z5 ? onextracallbackwithresult.onExtraCallback() : onextracallbackwithresult.IAuthTabCallback_Parcel()).onExtraCallback(z5 ? quirksExternalSyntheticBackport0 : setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport0, setcontentinsetsrelative, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda2(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized2);
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), 0, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            String strAsBinder = fullBanner.asBinder();
            if (StringsKt.isBlank(strAsBinder)) {
                strAsBinder = null;
            }
            if (strAsBinder != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(708978486);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strAsBinder);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda5(strAsBinder, resources);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized3, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                c = 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(709149761);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2) {
                    c = 2;
                } else {
                    int i12 = onWarmupCompleted + 15;
                    onNavigationEvent = i12 % 128;
                    c = 2;
                    if (i12 % 2 == 0) {
                        int i13 = 79 / 0;
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        }
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized4, 1, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        }
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized4, 1, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
                objOnMinimized4 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda6(resources);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized4, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.min(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.asBinder()) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f))))), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f))), j3, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), j3, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)));
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized5;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent2) {
                Object obj = objOnMinimized6;
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda7(function2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                    obj = externalSyntheticLambda7;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                String strOnTransact = fullBanner.onTransact();
                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strOnTransact, strAsBinder, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback3, "AsyncImage", strOnTransact, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2024);
                if (z4) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(710161849);
                    setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(-1318500896, true, new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda8(highSpeedResolverExternalSyntheticLambda1), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(711365021);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.onTransact());
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                    int i14 = onWarmupCompleted + 101;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized7;
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function2);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent3) {
                    Object obj2 = objOnMinimized8;
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda9(function2);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda9);
                        obj2 = externalSyntheticLambda9;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null), 1, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                    String strAsInterface = fullBanner.asInterface();
                    long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22);
                    createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
                    int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                    GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, null, Long.valueOf(j), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult5 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.onTransact()), 2, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized9 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized9;
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent4) {
                        Object obj3 = objOnMinimized10;
                        if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                            NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda10(function2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda10);
                            obj3 = externalSyntheticLambda10;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult5, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj3, 28, (Object) null);
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{fullBanner.IAuthTabCallbackStub(), quirksExternalSyntheticBackport0IAuthTabCallback, null, Long.valueOf(j2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iAuthTabCallback.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.onNavigationEvent(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, fIAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult6 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), 3, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                        RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f));
                        long jAsBinder2 = z ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281434870L);
                        if (z) {
                            int i16 = onNavigationEvent + 93;
                            onWarmupCompleted = i16 % 128;
                            if (i16 % 2 != 0) {
                                jAsBinder = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
                                int i17 = 71 / 0;
                            } else {
                                jAsBinder = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
                            }
                        } else {
                            jAsBinder = setByteOrder.Companion.asBinder();
                        }
                        long j5 = jAsBinder;
                        if (z) {
                            int i18 = onNavigationEvent + 115;
                            onWarmupCompleted = i18 % 128;
                            int i19 = i18 % 2;
                            jOnExtraCallbackWithResult = setByteOrder.Companion.asBinder();
                        } else {
                            jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281434870L);
                        }
                        getRequiredFeatureGroup getrequiredfeaturegroup = new getRequiredFeatureGroup(jAsBinder2, j5, jOnExtraCallbackWithResult, z ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L) : setByteOrder.Companion.asBinder(), (DefaultConstructorMarker) null);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent5) {
                            Object obj4 = objOnMinimized11;
                            if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda11(function2);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                obj4 = externalSyntheticLambda11;
                            }
                            getFrameRateRange.onExtraCallback((Function0) obj4, quirksExternalSyntheticBackport0OnExtraCallbackWithResult6, false, roundedCornerShapeOnNavigationEvent, getrequiredfeaturegroup, (getSessionType) null, (getCurrentMenuItems) null, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, ForwardingCameraControl.onExtraCallback(104291695, true, new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda12(fullBanner, z), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 817889280, 356);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                            if (z2) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1504147261);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), onextracallbackwithresult.onTransact());
                                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(!zOnNavigationEvent6) || objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized12 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda13(function0);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback5, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) objOnMinimized12, 15, (Object) null);
                                if (z3) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1849646678);
                                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0, cameraCaptureResultEmptyCameraCaptureResult, 438, 0);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1849647894);
                                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, 4, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3126, 2);
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = quirksExternalSyntheticBackport0OnExtraCallback6.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback7);
                                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                    int i20 = onNavigationEvent + 75;
                                    onWarmupCompleted = i20 % 128;
                                    int i21 = i20 % 2;
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = rowScopeInstance.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), onextracallbackwithresult.IAuthTabCallbackDefault());
                                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized13 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda3();
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult7 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback8, false, (Function1) objOnMinimized13, 1, (Object) null);
                                seek seekVarOnNavigationEvent = seek.onExtraCallbackWithResult.onNavigationEvent(seek.Companion, j4, 0, 2, (Object) null);
                                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback2 = showAndRender.IAuthTabCallback();
                                Object[] objArr = new Object[1];
                                a(new char[]{39420, 39316, 40291, 11438, 33990, 43483, 59328, 48256, 24427, 21513, 44735, 30203, 5191, 4955, 30109, 2908, 52537, 10920, 15606, 49272, 33283, 57748, 64439, 39246, 31713, 47342, 49423, 24109, 12487, 30672, 34914, 5931, 59887, 3371, 22278, 11483, 44787, 50243, 7724, 58815, 26513, 33648, 58847, 47770, 23865, 23148, 44276, 29601, 4672, 4358, 27520, 2305, 52001, 10408, 12938, 52847, 32838, 59283, 63918, 34563}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult8 = setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult7, "AsyncImage", ((String) objArr[0]).intern(), appLovinFullscreenImmersiveActivityIAuthTabCallback2);
                                Function1 function1IAuthTabCallback = showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback2, (Function1) null);
                                Object[] objArr2 = new Object[1];
                                a(new char[]{39420, 39316, 40291, 11438, 33990, 43483, 59328, 48256, 24427, 21513, 44735, 30203, 5191, 4955, 30109, 2908, 52537, 10920, 15606, 49272, 33283, 57748, 64439, 39246, 31713, 47342, 49423, 24109, 12487, 30672, 34914, 5931, 59887, 3371, 22278, 11483, 44787, 50243, 7724, 58815, 26513, 33648, 58847, 47770, 23865, 23148, 44276, 29601, 4672, 4358, 27520, 2305, 52001, 10408, 12938, 52847, 32838, 59283, 63918, 34563}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                                AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(((String) objArr2[0]).intern(), (String) null, quirksExternalSyntheticBackport0OnExtraCallbackWithResult8, (Function1) null, function1IAuthTabCallback, (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, seekVarOnNavigationEvent, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 1768);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized14 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda4();
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
                                }
                                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0AsBinder, (Function1) objOnMinimized14), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_close, cameraCaptureResultEmptyCameraCaptureResult, 0), rowScopeInstance.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.IAuthTabCallbackDefault()), null, Long.valueOf(j4), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1505659875);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i22 = onWarmupCompleted + 83;
        onNavigationEvent = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 24 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        NativeAdsDto.Creative.FullBanner fullBanner;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function0 function0;
        Function2 function2;
        boolean z;
        boolean z2;
        deleteProfile deleteprofile;
        float f;
        boolean z3;
        Object obj;
        long jMayLaunchUrl;
        long jIsEngagementSignalsApiAvailable;
        long jIPostMessageService_Parcel;
        int i3;
        long jITrustedWebActivityCallbackStubProxy;
        long jOnUnminimized;
        int i4;
        int i5;
        NativeAdsDto.Creative.FullBanner fullBanner2 = (NativeAdsDto.Creative.FullBanner) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        deleteProfile deleteprofile2 = (deleteProfile) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        Function2 function22 = (Function2) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(fullBanner2, "");
        Intrinsics.checkNotNullParameter(deleteprofile2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(2110519981);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fullBanner2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            int i7 = onNavigationEvent + 89;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile2.ordinal()) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 16384 : 8192;
        }
        Object obj2 = null;
        if ((196608 & iIntValue) == 0) {
            int i9 = onWarmupCompleted + 79;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3);
                obj2.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3)) {
                int i10 = onWarmupCompleted + 125;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i |= i5;
        }
        if ((1572864 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 1048576 : 524288;
            int i12 = onWarmupCompleted + 63;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((12582912 & iIntValue) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i14 = onWarmupCompleted + 49;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i |= i4;
        }
        int i16 = i;
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i16) != 4793490, i16 & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2110519981, i16, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullBannerV2Screen (NativeAdsFullBannerV2Screen.kt:74)");
            }
            boolean zOnExtraCallbackWithResult = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i16 >> 9) & 14) | 48);
            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            if (zOnExtraCallbackWithResult) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985153730);
                jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985155131);
                jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).mayLaunchUrl();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (zOnExtraCallbackWithResult) {
                int i17 = onWarmupCompleted + 35;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985157336);
                    jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 96).IPostMessageService_Parcel();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985157336);
                    jIPostMessageService_Parcel = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IPostMessageService_Parcel();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i3 = onWarmupCompleted + 29;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i18 = 88 / 0;
                        if (zOnExtraCallbackWithResult) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985160514);
                            jITrustedWebActivityCallbackStubProxy = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStubProxy();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985161908);
                            jITrustedWebActivityCallbackStubProxy = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                    } else if (zOnExtraCallbackWithResult) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (zOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985165300);
                        jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985163906);
                        jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).areNotificationsEnabled();
                    }
                    long j = jOnUnminimized;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fFloatValue);
                    setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f);
                    i2 = iIntValue;
                    function0 = function02;
                    function2 = function22;
                    z = zBooleanValue3;
                    z2 = zBooleanValue2;
                    deleteprofile = deleteprofile2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, fFloatValue, 7, (Object) null), 0.0f, 1, (Object) null);
                    obj = null;
                    long j2 = jITrustedWebActivityCallbackStubProxy;
                    fullBanner = fullBanner2;
                    z3 = zBooleanValue;
                    f = fFloatValue;
                    NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda0(fMin, fOnExtraCallback, setcontentinsetsrelativeIAuthTabCallback, function2, fullBanner2, jIPostMessageService_Parcel, j2, zOnExtraCallbackWithResult, z2, function0, z, resources, jMayLaunchUrl, z3, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j);
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(1898150531, true, externalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(985158420);
                jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
            }
            jIPostMessageService_Parcel = jIsEngagementSignalsApiAvailable;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            i3 = onWarmupCompleted + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (zOnExtraCallbackWithResult) {
            }
            long j3 = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky42.onExtraCallback(fFloatValue);
            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            float fMin2 = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f);
            i2 = iIntValue;
            function0 = function02;
            function2 = function22;
            z = zBooleanValue3;
            z2 = zBooleanValue2;
            deleteprofile = deleteprofile2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, fFloatValue, 7, (Object) null), 0.0f, 1, (Object) null);
            obj = null;
            long j22 = jITrustedWebActivityCallbackStubProxy;
            fullBanner = fullBanner2;
            z3 = zBooleanValue;
            f = fFloatValue;
            NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda02 = new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda0(fMin2, fOnExtraCallback2, setcontentinsetsrelativeIAuthTabCallback2, function2, fullBanner2, jIPostMessageService_Parcel, j22, zOnExtraCallbackWithResult, z2, function0, z, resources, jMayLaunchUrl, z3, r8lambdanm9dm2eewl4vrptnjmesfjqky42, j3);
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(1898150531, true, externalSyntheticLambda02, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        } else {
            fullBanner = fullBanner2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function0 = function02;
            function2 = function22;
            z = zBooleanValue3;
            z2 = zBooleanValue2;
            deleteprofile = deleteprofile2;
            f = fFloatValue;
            z3 = zBooleanValue;
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullBannerV2ScreenKt$.ExternalSyntheticLambda1(fullBanner, z3, f, deleteprofile, z2, z, function2, function0, i2));
        }
        return obj;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, -1569126945, new Object[]{function2}, 1569126945);
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, 1985754532, new Object[]{useandconfigureprogramwithtexture}, -1985754530);
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, -214743366, new Object[]{useandconfigureprogramwithtexture}, 214743369);
    }

    public static final void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, @NotNull deleteProfile deleteprofile, boolean z2, boolean z3, @NotNull Function2<? super String, ? super Boolean, Unit> function2, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -771064974, objArr, 771064975);
    }

    private static final Unit onExtraCallbackWithResult(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 2103429531, objArr, -2103429527);
    }
}
