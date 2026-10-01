package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.collect.Synchronized;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.R;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.MaxAppOpenAd;
import o.QuirksExternalSyntheticBackport0;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.putCharSequenceArrayList;
import o.putIntArray;
import o.removeAdapter;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putCharSequenceArrayList {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = -8951321091156588831L;

    public static /* synthetic */ Unit IAuthTabCallback(putFloatArray putfloatarray, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(putfloatarray, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 103;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(removeadapter);
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i3));
        int i12 = i8 | i5;
        int i13 = ~(i12 | i4);
        int i14 = (~(i3 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i5 + i4 + i6 + (1650861130 * i2) + ((-924421097) * i);
        int i16 = i15 * i15;
        int i17 = (i5 * (-405912681)) + 1474035712 + ((-405912681) * i4) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i6) + (986710016 * i2) + ((-948436992) * i) + ((-1864630272) * i16);
        int i18 = ((i5 * (-959335331)) - 587927435) + (i4 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i6 * (-959334869)) + (i2 * 22983790) + (i * 637852125) + (i16 * (-1124859904));
        int i19 = i17 + (i18 * i18 * (-1807482880));
        return i19 != 1 ? i19 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static final Unit onExtraCallback(putFloatArray putfloatarray, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(putfloatarray, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 45;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(removeadapter);
        }
        onWarmupCompleted(removeadapter);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        putFloatArray putfloatarray = (putFloatArray) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function1, putfloatarray);
        }
        onNavigationEvent(function1, putfloatarray);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1662821537, -1662821537, new Object[]{maxAppOpenAd}, iOnExtraCallback2);
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int i3 = 65 / 0;
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback6, iOnExtraCallback4, 1662821537, -1662821537, new Object[]{maxAppOpenAd}, iOnExtraCallback5);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[2];
        putIntegerArrayList putintegerarraylist = (putIntegerArrayList) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        putFloatArray putfloatarray = (putFloatArray) objArr[5];
        String str = (String) objArr[6];
        isContainerClickable iscontainerclickable = (isContainerClickable) objArr[7];
        getSwitchMinWidth getswitchminwidth = (getSwitchMinWidth) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, fFloatValue, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putintegerarraylist, function1, putfloatarray, str, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Gravity.getAbsoluteGravity(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 84, Color.rgb(0, 0, 0) + 16798449, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 14186), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 101;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(removeAdapter removeadapter) {
        Integer num;
        Integer num2;
        Object obj;
        setOnQueryTextListener setonquerytextlistener;
        float value;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            num2 = null;
            obj = null;
            removeAdapter.onNavigationEvent(removeadapter, null, null, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0.0f, 2, null);
            setonquerytextlistener = null;
            value = getVersionCode.STRONG.getValue();
            i = 117;
        } else {
            Intrinsics.checkNotNullParameter(removeadapter, "");
            num = null;
            num2 = null;
            obj = null;
            removeAdapter.onNavigationEvent(removeadapter, null, null, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0.0f, 3, null);
            setonquerytextlistener = null;
            value = getVersionCode.STRONG.getValue();
            i = 7;
        }
        removeAdapter.onExtraCallback(removeadapter, num, num2, setonquerytextlistener, value, i, obj);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.onNavigationEvent(removeadapter, null, null, getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 180.0f, 3, null);
        removeAdapter.onExtraCallback(removeadapter, (Integer) null, (Integer) null, (setOnQueryTextListener) null, getVersionCode.STRONG.getValue(), 7, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxAppOpenAd maxAppOpenAd = (MaxAppOpenAd) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(putIntArray.onWarmupCompleted.onNavigationEvent, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 125;
                onWarmupCompleted = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 != 0) {
                    return putCharSequenceArrayList.IAuthTabCallback(removeadapter);
                }
                putCharSequenceArrayList.IAuthTabCallback(removeadapter);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        maxAppOpenAd.onExtraCallbackWithResult(putIntArray.onNavigationEvent.onNavigationEvent, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 17;
                IAuthTabCallback = i3 % 128;
                removeAdapter removeadapter = (removeAdapter) obj;
                if (i3 % 2 != 0) {
                    return putCharSequenceArrayList.onExtraCallback(removeadapter);
                }
                putCharSequenceArrayList.onExtraCallback(removeadapter);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function1 function1, putFloatArray putfloatarray) {
        int i = 2 % 2;
        if (function1 != null) {
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(putfloatarray.onExtraCallback());
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putIntegerArrayList putintegerarraylist, final Function1 function1, final putFloatArray putfloatarray, String str, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        long jOnRelationshipValidationResult;
        String str2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            int i6 = onExtraCallback + 43;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable);
                throw null;
            }
            i2 = i | (!(cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ^ true) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth) ? 32 : 16;
            int i7 = onExtraCallback + 11;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 147) != 146) {
            int i9 = onExtraCallback + 17;
            IAuthTabCallback = i9 % 128;
            z = i9 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1011455198, i2, -1, "im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4Arrow.<anonymous> (TdsAgreementV4Arrow.kt:107)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f));
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i10 = 2 % 2;
                        int i11 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i11 % 128;
                        int i12 = i11 % 2;
                        Unit unitOnExtraCallbackWithResult = putCharSequenceArrayList.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
                        int i13 = onExtraCallbackWithResult + 109;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i10 = onExtraCallback + 91;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, f);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallbackWithResult + 41;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unitOnExtraCallbackWithResult = putCharSequenceArrayList.onExtraCallbackWithResult((MaxAppOpenAd) obj);
                        int i15 = onExtraCallback + 93;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, getswitchminwidth, (Function1) objOnMinimized2);
            getConfiguration<Float> getconfigurationOnExtraCallback = configureReward.onExtraCallback(0.9f, 1.0f);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(putfloatarray);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                Object obj = objOnMinimized3;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 73;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            Object[] objArr = {function1, putfloatarray};
                            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                            Unit unit = (Unit) putCharSequenceArrayList.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -1880454382, 1880454384, objArr, iOnExtraCallback2);
                            int i15 = onExtraCallback + 89;
                            onExtraCallbackWithResult = i15 % 128;
                            int i16 = i15 % 2;
                            return unit;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = configureReward.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putintegerarraylist, getconfigurationOnExtraCallback, null, false, null, false, null, null, (Function0) obj, 504, null);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1498850799);
                    jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1498851759);
                    jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onRelationshipValidationResult();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                String strOnWarmupCompleted = putfloatarray.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    str2 = strOnWarmupCompleted + " " + str;
                } else {
                    str2 = null;
                }
                Object[] objArr = new Object[1];
                a(new char[]{17664, 17768, 18831, 15705, 29718, 16763, 18167, 63692, 45767, 31764, 20216, 61487, 43547, 25774, 22138, 59424, 41589, 27877, 24449, 57836, 39871, 21825, 26496, 55746, 37869, 23955, 28456, 53593, 35675, 17861, 30501, 50935, 32963, 18982, 31985, 16047, 63631, 45617, 1115, 13875, 61501, 47789, 3096, 11790, 59429, 41755, 5577, 10182, 57811, 43857, 7650, 8092, 55583, 37797, 9597, 5985, 53577, 39921, 13001, 3327, 52982, 32826, 14981, 1155}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnRelationshipValidationResult, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, str2, cameraCaptureResultEmptyCameraCaptureResult, 6, 248);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = IAuthTabCallback + 69;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final putFloatArray putfloatarray, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<Object, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        Function1<Object, Unit> function12;
        int i6;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function1<Object, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Function1<Object, Unit> function14;
        String string;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(putfloatarray, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1966853440);
        if ((i & 6) == 0) {
            int i8 = onExtraCallback + 37;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putfloatarray) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            int i11 = IAuthTabCallback + 125;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i13 = onExtraCallback + 21;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    function12 = function1;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                        int i15 = IAuthTabCallback + 41;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i3 |= i6;
                }
                if ((i3 & 147) != 146) {
                    int i17 = IAuthTabCallback + 119;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                    if (i10 != 0) {
                        int i19 = IAuthTabCallback + 7;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    if (i5 != 0) {
                        int i21 = IAuthTabCallback + 125;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        function14 = null;
                    } else {
                        function14 = function12;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1966853440, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4Arrow (TdsAgreementV4Arrow.kt:73)");
                    }
                    Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = new putIntegerArrayList();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    final putIntegerArrayList putintegerarraylist = (putIntegerArrayList) objOnMinimized;
                    accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
                    Float fOnExtraCallbackWithResult = putfloatarray.onExtraCallbackWithResult();
                    float fOnWarmupCompleted = getFixedPositions.onWarmupCompleted(accessgettlsversionsasstringp, fOnExtraCallbackWithResult != null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallbackWithResult.floatValue() * accessgettlsversionsasstringp.getSize()) : VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0);
                    boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fOnWarmupCompleted);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(!zIAuthTabCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(RangesKt.coerceAtLeast(24.0f, fOnWarmupCompleted * 24.0f)));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    final float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
                    boolean z2 = (i3 & 14) == 4;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!z2) {
                        Object obj = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted);
                            obj = camera2CapturePipelineTorchTaskExternalSyntheticLambda2OnWarmupCompleted;
                        }
                        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putfloatarray.IAuthTabCallback());
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            putIntArray putintarrayIAuthTabCallback = putfloatarray.IAuthTabCallback();
                            if (Intrinsics.areEqual(putintarrayIAuthTabCallback, putIntArray.onWarmupCompleted.onNavigationEvent)) {
                                string = resources.getString(R.string.accessibility_folded);
                            } else {
                                if (!Intrinsics.areEqual(putintarrayIAuthTabCallback, putIntArray.onNavigationEvent.onNavigationEvent)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                string = resources.getString(R.string.accessibility_unfolded);
                            }
                            objOnMinimized4 = string;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        final String str = (String) objOnMinimized4;
                        Intrinsics.checkNotNull(str);
                        putfloatarray.onWarmupCompleted(((Boolean) CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0).onExtraCallbackWithResult()).booleanValue());
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        final Function1<Object, Unit> function15 = function14;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{putfloatarray.IAuthTabCallback(), null, 0, 0, ForwardingCameraControl.onExtraCallback(-1011455198, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i23 = 2 % 2;
                                int i24 = onExtraCallbackWithResult + 81;
                                onExtraCallback = i24 % 128;
                                int i25 = i24 % 2;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                float f = fIAuthTabCallback;
                                int iIntValue = ((Integer) obj5).intValue();
                                Object[] objArr = {quirksExternalSyntheticBackport06, Float.valueOf(f), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putintegerarraylist, function15, putfloatarray, str, (isContainerClickable) obj2, (getSwitchMinWidth) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue)};
                                int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
                                Unit unit = (Unit) putCharSequenceArrayList.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -383449871, 383449872, objArr, iOnExtraCallback2);
                                int i26 = onExtraCallback + 101;
                                onExtraCallbackWithResult = i26 % 128;
                                int i27 = i26 % 2;
                                return unit;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                        function13 = function14;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    function13 = function12;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.arrow.TdsAgreementV4ArrowKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException, Resources.NotFoundException {
                            int i23 = 2 % 2;
                            int i24 = IAuthTabCallback + 109;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitIAuthTabCallback = putCharSequenceArrayList.IAuthTabCallback(putfloatarray, quirksExternalSyntheticBackport03, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i26 = onExtraCallback + 101;
                            IAuthTabCallback = i26 % 128;
                            int i27 = i26 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function12 = function1;
            if ((i3 & 147) != 146) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i3 & 147) != 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putIntegerArrayList putintegerarraylist, Function1 function1, putFloatArray putfloatarray, String str, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Float.valueOf(f), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, putintegerarraylist, function1, putfloatarray, str, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, -383449871, 383449872, objArr, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, putFloatArray putfloatarray) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, -1880454382, 1880454384, new Object[]{function1, putfloatarray}, iOnExtraCallback2);
    }

    private static final Unit onExtraCallback(MaxAppOpenAd maxAppOpenAd) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 1662821537, -1662821537, new Object[]{maxAppOpenAd}, iOnExtraCallback2);
    }
}
