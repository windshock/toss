package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DynamicFromMapExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SpannedDataExternalSyntheticLambda0;
import o.getViewTypeCount;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u4;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DynamicFromMapExternalSyntheticLambda2 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult = {64988, 64991, 64979, 64909, 64990, 64967, 64986, 64989, 64966, 64976, 64982, 65008, 64964, 64977, 64925, 64965, 64978, 64896, 64995, 64897, 64961, 64911, 64901, 64983, 64970, 64922, 64915, 64900, 64993, 64899, 64984, 64963, 64923, 64905, 64907, 64960};
    private static char onNavigationEvent = 51247;

    public static /* synthetic */ Unit onExtraCallback(Context context, int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(context, i, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context, int i, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            unit = (Unit) onNavigationEvent(new Object[]{context, Integer.valueOf(i), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -95281160, 95281161, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            int i5 = 40 / 0;
        } else {
            unit = (Unit) onNavigationEvent(new Object[]{context, Integer.valueOf(i), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -95281160, 95281161, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
        }
        int i6 = onExtraCallback + 17;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(z, z2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 95;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = (~(i4 | i3)) | i5;
        int i8 = ~i4;
        int i9 = ~((~i5) | i8 | i3);
        int i10 = (~(i3 | i5)) | (~(i8 | (~i3)));
        int i11 = i4 + i5 + i2 + (1616745821 * i) + (2077170981 * i6);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i4) + 1587019776 + (806482222 * i5) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i2) + ((-395313152) * i) + (904921088 * i6) + (345505792 * i12);
        int i14 = (i4 * (-1558553916)) + 318941677 + (i5 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i2 * (-1558553459)) + (i * 397062201) + (i6 * 609114465) + (i12 * (-138936320));
        if (i13 + (i14 * i14 * 1630011392) == 1) {
            return onNavigationEvent(objArr);
        }
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        Function0 function0 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i15 = 2 % 2;
        int i16 = onExtraCallback + 93;
        IAuthTabCallback = i16 % 128;
        int i17 = i16 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(zBooleanValue, zBooleanValue2, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i18 = IAuthTabCallback + 123;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        boolean z;
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue2 & 17) != 16) {
            z = true;
        } else {
            int i4 = IAuthTabCallback + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr2 = new Object[1];
                a(new char[]{'\f', '\t', 16, 17, 20, 26, 7, '\"', 7, 14, 0, 7, '\n', 15, 17, 2, 5, 30, ' ', 17, '\"', '\r', 13894, 13894, 18, 6, 21, 18, 20, 26, 11, '\"', 11, 4, '\f', 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 27, 30, 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, '#', 0, '\"', 21, 31, 28}, (byte) (93 - (Process.myTid() >> 22)), 152 - ExpandableListView.getPackedPositionType(0L), objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-602631612, iIntValue2, -1, ((String) objArr2[0]).intern());
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(GraniteBrownfieldModule_getSchemeUri.onExtraCallbackWithResult(context, iIntValue, new Object[0]), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262134);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 119;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 77;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final Context context, final int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            int i5 = onExtraCallback + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i7 = onExtraCallback + 31;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 |= i3;
            int i9 = onExtraCallback + 11;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((i2 & 19) != 18) {
            int i11 = IAuthTabCallback + 15;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i13 = onExtraCallback + 63;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a(new char[]{'\f', '\t', 16, 17, 20, 26, 7, '\"', 7, 14, 0, 7, '\n', 15, 17, 2, 5, 30, ' ', 17, '\"', '\r', 13812, 13812, 18, 6, 21, 18, 20, 26, 11, '\"', 11, 4, '\f', 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 15, 22, 15, 6, 1, 6, 25, 5, 1, 11, ' ', 2, 27, 30, 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, '#', 0, '\"', 21, 28, 26}, (byte) (TextUtils.indexOf("", "", 0, 0) + 11), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 139, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1026227099, i2, -1, ((String) objArr[0]).intern());
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-602631612, true, new getBacktraceNote() { // from class: viva.republica.toss.password.reset.PasswordResetCertContentKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DynamicFromMapExternalSyntheticLambda2.onExtraCallbackWithResult(context, i, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(kotlin.jvm.functions.Function0 r15, o.u4 r16, o.CameraCaptureResultEmptyCameraCaptureResult r17, int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DynamicFromMapExternalSyntheticLambda2.onWarmupCompleted(kotlin.jvm.functions.Function0, o.u4, o.CameraCaptureResultEmptyCameraCaptureResult, int):kotlin.Unit");
    }

    public static final void onWarmupCompleted(final boolean z, final boolean z2, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(248248420);
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallback + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i8 = IAuthTabCallback + 73;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = IAuthTabCallback + 91;
                onExtraCallback = i10 % 128;
                i3 = i10 % 2 != 0 ? 4772 : 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i11 = onExtraCallback + 93;
            int i12 = i11 % 128;
            IAuthTabCallback = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 51;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i16 = IAuthTabCallback + 63;
                onExtraCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(new char[]{'\f', '\t', 16, 17, 20, 26, 7, '\"', 7, 14, 0, 7, '\n', 15, 17, 2, 5, 30, ' ', 17, '\"', '\r', 13839, 13839, 18, 6, 21, 18, 20, 26, 11, '\"', 11, 4, '\f', 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 29, 30, 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, '#', 0, '#', 15, 24, 26}, (byte) (51 >>> TextUtils.lastIndexOf("", 'A')), 120 >> (TypedValue.complexToFraction(0, 2.0f, 1.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 1.0f) == 0.0f ? 0 : -1)), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(248248420, i2, -1, ((String) objArr[0]).intern());
                } else {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{'\f', '\t', 16, 17, 20, 26, 7, '\"', 7, 14, 0, 7, '\n', 15, 17, 2, 5, 30, ' ', 17, '\"', '\r', 13839, 13839, 18, 6, 21, 18, 20, 26, 11, '\"', 11, 4, '\f', 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 29, 30, 20, 17, '\"', 30, 17, 2, 18, 22, 29, 11, '\"', 11, 4, 6, 11, 23, 2, 6, 5, 11, 1, 11, '\b', 2, 17, '#', 0, '#', 15, 24, 26}, (byte) (37 - TextUtils.lastIndexOf("", '0')), 92 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(248248420, i2, -1, ((String) objArr2[0]).intern());
                }
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            List<Integer> listIAuthTabCallback = IAuthTabCallback(z, z2);
            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f), 7, (Object) null), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            y1ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallback = y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback();
            DynamicFromMapExternalSyntheticLambda3 dynamicFromMapExternalSyntheticLambda3 = DynamicFromMapExternalSyntheticLambda3.onExtraCallback;
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(dynamicFromMapExternalSyntheticLambda3.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, onnavigationeventOnExtraCallback, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, dynamicFromMapExternalSyntheticLambda3.onNavigationEvent(), (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805306758, 0, 15866);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1665309879);
            Iterator<T> it = listIAuthTabCallback.iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Number) it.next()).intValue();
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1026227099, true, new getBacktraceNote() { // from class: viva.republica.toss.password.reset.PasswordResetCertContentKt$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DynamicFromMapExternalSyntheticLambda2.onExtraCallback(context, iIntValue, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, DynamicFromMapExternalSyntheticLambda3.onExtraCallback.onExtraCallbackWithResult(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 384, 126970);
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.onNavigationEvent()), (u2) null, ForwardingCameraControl.onExtraCallback(974225015, true, new getBacktraceNote() { // from class: viva.republica.toss.password.reset.PasswordResetCertContentKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DynamicFromMapExternalSyntheticLambda2.onNavigationEvent(function0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 0, 4090);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = onExtraCallback + 1;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.password.reset.PasswordResetCertContentKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4 = z;
                    boolean z5 = z2;
                    Function0 function02 = function0;
                    int i19 = i;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    Object[] objArr3 = {Boolean.valueOf(z4), Boolean.valueOf(z5), function02, Integer.valueOf(i19), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
                    int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                    return (Unit) DynamicFromMapExternalSyntheticLambda2.onNavigationEvent(objArr3, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -59703403, 59703403, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                }
            });
        }
    }

    private static final List<Integer> IAuthTabCallback(boolean z, boolean z2) {
        int i = 2 % 2;
        if (z && z2) {
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return CollectionsKt.listOf(new Integer[]{Integer.valueOf(R.string.app_reset_password_check_delete_cert_and_mobileid), Integer.valueOf(R.string.app_reset_password_check_cert_required_services), Integer.valueOf(R.string.app_reset_password_check_recreate_cert_and_mobileid)});
        }
        if (z2) {
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = R.string.app_reset_password_check_delete_cert;
                int i6 = R.string.app_reset_password_check_cert_required_services;
                int i7 = R.string.app_reset_password_check_recreate_cert_only;
                Integer[] numArr = new Integer[2];
                numArr[1] = Integer.valueOf(i5);
                numArr[1] = Integer.valueOf(i6);
                numArr[3] = Integer.valueOf(i7);
                return CollectionsKt.listOf(numArr);
            }
            return CollectionsKt.listOf(new Integer[]{Integer.valueOf(R.string.app_reset_password_check_delete_cert), Integer.valueOf(R.string.app_reset_password_check_cert_required_services), Integer.valueOf(R.string.app_reset_password_check_recreate_cert_only)});
        }
        return CollectionsKt.listOf(new Integer[]{Integer.valueOf(R.string.app_reset_password_check_delete_mobileid), Integer.valueOf(R.string.app_reset_password_check_recreate_mobileid_only)});
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 26, 23139 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $11 + 19;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 'J' - AndroidCharacter.getMirror('0'), ImageFormat.getBitsPerPixel(0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 101;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i + 7;
                cArr4[i2] = (char) (cArr[i2] + b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
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
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 24824), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, 19488 - ExpandableListView.getPackedPositionGroup(0L), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i10 = $11 + 91;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -59703403, 59703403, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(Context context, int i, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, -95281160, 95281161, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }
}
