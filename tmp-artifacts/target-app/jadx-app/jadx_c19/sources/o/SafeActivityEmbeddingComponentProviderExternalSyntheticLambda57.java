package o;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import com.horcrux.svg.SvgPackage;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.InAppPurchasePreparationViewModel;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.uikit.widget.TdsSkeletonV1View;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57 {
    private static final byte[] $$a = {59, -24, -77, -23};
    private static final int $$b = 240;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onExtraCallback = 478308908;

    private static String $$c(short s, int i2, byte b) {
        int i3 = 105 - (s * 3);
        int i4 = i2 + 4;
        int i5 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i6 + i3;
        }
        while (true) {
            i7++;
            i4++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i5 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess000 = access000(inAppPurchasePreparationViewModel);
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        int i6 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, z, function1, function0, function02, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitIAuthTabCallbackDefault;
    }

    private static final Unit IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, z, function1, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[1];
        getCreativeId getcreativeid = (getCreativeId) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Function1 function1 = (Function1) objArr[4];
        Function0 function0 = (Function0) objArr[5];
        Function0 function02 = (Function0) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        ((Number) objArr[10]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, zBooleanValue, function1, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~(i8 | i6);
        int i10 = ~i2;
        int i11 = ~i6;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = (~(i6 | i10 | i5)) | (~(i11 | i8));
        int i14 = ~(i8 | i10);
        int i15 = i2 + i5 + i3 + (762713021 * i4) + (1579510587 * i7);
        int i16 = i15 * i15;
        int i17 = ((i2 * (-1846875272)) - 1480523776) + ((-1846875272) * i5) + (i12 * (-1613556599)) + (i13 * (-1613556599)) + ((-1613556599) * i14) + (834535424 * i3) + ((-750387200) * i4) + ((-523632640) * i7) + ((-1971257344) * i16);
        int i18 = ((i2 * (-1364308824)) - 1074288667) + (i5 * (-1364308824)) + (i12 * 659) + (i13 * 659) + (i14 * 659) + (i3 * (-1364308165)) + (i4 * (-893132913)) + (i7 * 986770329) + (i16 * (-1162149888));
        switch (i17 + (i18 * i18 * (-1529413632))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
                int i19 = 2 % 2;
                int i20 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                Unit unitAccess100 = access100(inAppPurchasePreparationViewModel);
                int i22 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return unitAccess100;
            case 4:
                Function0 function0 = (Function0) objArr[0];
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
                int i24 = 2 % 2;
                int i25 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                if (Intrinsics.areEqual(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6), Boolean.TRUE)) {
                    return Unit.INSTANCE;
                }
                function0.invoke();
                Unit unit = Unit.INSTANCE;
                int i27 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i27 % 128;
                int i28 = i27 % 2;
                return unit;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onNavigationEvent(objArr);
            case 7:
                return asInterface(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchasePreparationViewModel);
        int i5 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{function0, cameraPresenceProviderExternalSyntheticLambda6}, -1686334517, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1686334521, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(inAppPurchasePreparationViewModel);
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, z, function1, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, inAppPurchasePreparationViewModel, setDetectableSize);
        if (i4 != 0) {
            int i5 = 15 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback();
        int i5 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {inAppPurchasePreparationViewModel};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(objArr, 1653571630, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1653571628, iOnExtraCallbackWithResult, SvgPackage.21.onExtraCallbackWithResult());
        int i5 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, Function0 function02, Function1 function1, WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{function0, inAppPurchasePreparationViewModel, function02, function1, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, onextracallback}, -1827521496, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1827521502, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        int i5 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws Throwable {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, z, function1, function0, function02, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        if (i7 == 0) {
            int i8 = 19 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {cameraPresenceProviderExternalSyntheticLambda6};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda40 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(objArr, 282681282, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -282681282, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4);
        int i5 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda40;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return asInterface(inAppPurchasePreparationViewModel);
        }
        asInterface(inAppPurchasePreparationViewModel);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return getInterfaceDescriptor(inAppPurchasePreparationViewModel);
        }
        getInterfaceDescriptor(inAppPurchasePreparationViewModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(str);
        }
        onExtraCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, Boolean.valueOf(z), function1, function0, function02, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, -968903568, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 968903575, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        int i8 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 33 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getCreativeId getcreativeid, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(getcreativeid, inAppPurchasePreparationViewModel, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getcreativeid, inAppPurchasePreparationViewModel, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0);
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0>) cameraPresenceProviderExternalSyntheticLambda6);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            int i5 = 6 / 0;
        }
        int i6 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> $toastMessageState$delegate;
        final /* synthetic */ r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 $toastState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4, CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> cameraPresenceProviderExternalSyntheticLambda6, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$toastState = r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4;
            this.$toastMessageState$delegate = cameraPresenceProviderExternalSyntheticLambda6;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$toastState, this.$toastMessageState$delegate, access13800Var);
            int i3 = IAuthTabCallback + 81;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i5 = IAuthTabCallback + 49;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallback + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = onExtraCallback + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            ResultKt.onNavigationEvent(obj);
            if (i4 == 0) {
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(this.$toastMessageState$delegate);
                obj2.hashCode();
                throw null;
            }
            if (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(this.$toastMessageState$delegate) != null) {
                this.$toastState.IAuthTabCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallback + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        Function0 function0 = (Function0) objArr[0];
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) objArr[4];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback) objArr[5];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.areEqual(onextracallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult);
            str.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if (Intrinsics.areEqual(onextracallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult)) {
            int i4 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                function0.invoke();
                throw null;
            }
            function0.invoke();
        } else if (!(!Intrinsics.areEqual(onextracallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onWarmupCompleted.onExtraCallbackWithResult))) {
            int i5 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            inAppPurchasePreparationViewModel.onNavigationEvent();
        } else if (Intrinsics.areEqual(onextracallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.C0041onExtraCallback.onWarmupCompleted)) {
            int i7 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            function02.invoke();
        } else if (onextracallback instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onExtraCallbackWithResult) {
            int i9 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            function1.invoke(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 != null ? windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.IAuthTabCallback() : null);
        } else if (!Intrinsics.areEqual(onextracallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.IAuthTabCallback.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        InAppPurchasePreparationViewModel.onWarmupCompleted(iOnNavigationEvent, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{inAppPurchasePreparationViewModel}, -1705945231, 1705945236);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, (ViewConfiguration.getTouchSlop() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), 2167 - TextUtils.indexOf("", "", 0), 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i8 = $11 + 117;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 3;
            }
        }
        if (!(!z)) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i12 = $11 + 117;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i14 = $10 + 47;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12844), 55 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2167 - View.resolveSize(0, 0), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onTransact(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit access000(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.asBinder.onExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.asBinder.onExtraCallback);
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit getInterfaceDescriptor(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallback_Parcel.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        inAppPurchasePreparationViewModel.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onWarmupCompleted.onExtraCallback);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        AppsInTossProduct appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface();
        setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationViewModel.IAuthTabCallbackStub().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback("product_id", appsInTossProductAsInterface.onTransact());
        setDetectableSize.onExtraCallback("price", WindowMetricsCalculatorCompanionExternalSyntheticLambda0.onExtraCallbackWithResult(Long.valueOf(appsInTossProductAsInterface.onExtraCallbackWithResult()), Integer.valueOf(appsInTossProductAsInterface.onWarmupCompleted())));
        Object[] objArr = new Object[1];
        a(8 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0') + 5, new char[]{5, 5, '\b', 65526, '\f', 65526, 1, 65528}, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 113, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), appsInTossProductAsInterface.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getCreativeId getcreativeid, final InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) {
        int i2 = 2 % 2;
        getCreativeId.onExtraCallback(getcreativeid, 1602841L, (Set) null, false, "appsintoss_app_visit__iap_purchase::click__cta", false, new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 79;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallbackWithResult(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, inAppPurchasePreparationViewModel, (SetDetectableSize) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallbackWithResult(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, inAppPurchasePreparationViewModel, (SetDetectableSize) obj);
                int i5 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 22, (Object) null);
        inAppPurchasePreparationViewModel.onActivityResized();
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getCreativeId $appsInTossLogger;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> $productInfo$delegate;
        final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> $toastMessageState$delegate;
        final /* synthetic */ InAppPurchasePreparationViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getCreativeId getcreativeid, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, CameraPresenceProviderExternalSyntheticLambda6<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> cameraPresenceProviderExternalSyntheticLambda62, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$appsInTossLogger = getcreativeid;
            this.$viewModel = inAppPurchasePreparationViewModel;
            this.$productInfo$delegate = cameraPresenceProviderExternalSyntheticLambda6;
            this.$toastMessageState$delegate = cameraPresenceProviderExternalSyntheticLambda62;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, SetDetectableSize setDetectableSize) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(inAppPurchasePreparationViewModel, cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, setDetectableSize);
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$appsInTossLogger, this.$viewModel, this.$productInfo$delegate, this.$toastMessageState$delegate, access13800Var);
            int i3 = onNavigationEvent + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i5 = onNavigationEvent + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i4 != 0) {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                int i5 = 12 / 0;
            } else {
                objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i6 = IAuthTabCallback + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r12.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r13);
            r2 = r12.$appsInTossLogger;
            r13 = r12.$viewModel;
            r1 = r12.$productInfo$delegate;
            r10 = r12.$toastMessageState$delegate;
            o.getCreativeId.onExtraCallback(r2, 1603491, (java.util.Set) null, false, "appsintoss_app_visit__iap_purchase::popup__purchase_error_toast", false, new im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$InAppPurchasePreparationScreen$3$3$1$$ExternalSyntheticLambda0(r13, r1, r10), 22, (java.lang.Object) null);
            r13 = kotlin.Unit.INSTANCE;
            r1 = o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent.IAuthTabCallback + 55;
            o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent.onNavigationEvent = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 37;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 40 / 0;
            }
        }

        private static final Unit onWarmupCompleted(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, SetDetectableSize setDetectableSize) {
            int i2 = 2 % 2;
            setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationViewModel.IAuthTabCallbackStub().onExtraCallbackWithResult());
            WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
            String strOnTransact = null;
            if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnWarmupCompleted != null) {
                int i3 = IAuthTabCallback + 51;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnWarmupCompleted.asInterface();
                    strOnTransact.hashCode();
                    throw null;
                }
                AppsInTossProduct appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnWarmupCompleted.asInterface();
                if (appsInTossProductAsInterface != null) {
                    int i4 = onNavigationEvent + 113;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    strOnTransact = appsInTossProductAsInterface.onTransact();
                }
            }
            setDetectableSize.onExtraCallback("product_id", strOnTransact);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted onwarmupcompletedOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
            Intrinsics.checkNotNull(onwarmupcompletedOnNavigationEvent, "");
            setDetectableSize.onExtraCallback("error_type", onwarmupcompletedOnNavigationEvent.onExtraCallback().onExtraCallback());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08dc A[PHI: r3
      0x08dc: PHI (r3v36 int) = (r3v35 int), (r3v37 int) binds: [B:224:0x08d9, B:221:0x08cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, @NotNull final getCreativeId getcreativeid, boolean z, @Nullable Function1<? super String, Unit> function1, @Nullable Function0<Unit> function0, @NotNull final Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) throws Throwable {
        int i4;
        int i5;
        boolean z2;
        int i6;
        Function1<? super String, Unit> function12;
        int i7;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Function0<Unit> function03;
        final boolean z3;
        final Function1<? super String, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        Function1<? super String, Unit> function14;
        Object obj;
        r8lambdaDdMU1QhgKvW1Thlkiuusmrk5NN4 r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback;
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        boolean zOnNavigationEvent3;
        boolean z4;
        int i8;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i9;
        AppsInTossProduct appsInTossProductAsInterface;
        final getCreativeId getcreativeid2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i10;
        int i11;
        Object objOnMinimized2;
        int i12;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(inAppPurchasePreparationViewModel, "");
        Intrinsics.checkNotNullParameter(getcreativeid, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1713747421);
        int iExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.extraCallback();
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i15 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getcreativeid)) {
                int i17 = onExtraCallbackWithResult + 67;
                onNavigationEvent = i17 % 128;
                i12 = i17 % 2 == 0 ? 30938 : 256;
            } else {
                i12 = 128;
            }
            i4 |= i12;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    function12 = function1;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 1048576 : 524288;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 599187) != 599186, i4 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    boolean z5 = i18 != 0 ? false : z2;
                    if (i6 != 0) {
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda1
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj2) {
                                    int i19 = 2 % 2;
                                    int i20 = onNavigationEvent + 13;
                                    onExtraCallback = i20 % 128;
                                    int i21 = i20 % 2;
                                    Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onWarmupCompleted((String) obj2);
                                    int i22 = onExtraCallback + 43;
                                    onNavigationEvent = i22 % 128;
                                    int i23 = i22 % 2;
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        function14 = (Function1) objOnMinimized3;
                    } else {
                        function14 = function12;
                    }
                    if (i7 != 0) {
                        int i19 = onNavigationEvent + 69;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            int i20 = 78 / 0;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda8
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i21 = 2 % 2;
                                        int i22 = onNavigationEvent + 93;
                                        onExtraCallbackWithResult = i22 % 128;
                                        int i23 = i22 % 2;
                                        Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent();
                                        int i24 = onNavigationEvent + 79;
                                        onExtraCallbackWithResult = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            int i25 = 45 / 0;
                                        }
                                        return unitOnNavigationEvent;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            function03 = (Function0) objOnMinimized2;
                        } else {
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            function03 = (Function0) objOnMinimized2;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                        return;
                    }
                    function03 = function0;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1713747421, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreen (InAppPurchasePreparationScreen.kt:45)");
                    }
                    final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(inAppPurchasePreparationViewModel.writeTypedObject(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2 = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent((setRubIn) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel}, -225118289, 225118298), (Object) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(228144287);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback) {
                        int i21 = onNavigationEvent + 9;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i22 = 79 / 0;
                            obj = objOnMinimized4;
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function0 function04 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda9
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke() {
                                        int i23 = 2 % 2;
                                        int i24 = onExtraCallbackWithResult + 15;
                                        IAuthTabCallback = i24 % 128;
                                        int i25 = i24 % 2;
                                        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = inAppPurchasePreparationViewModel;
                                        if (i25 == 0) {
                                            return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallback(inAppPurchasePreparationViewModel2);
                                        }
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallback(inAppPurchasePreparationViewModel2);
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function04);
                                obj = function04;
                            }
                            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback((r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted) null, (DeviceQuirksExternalSyntheticLambda0) null, (VirtualCameraControlExternalSyntheticLambda1) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                            cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchasePreparationViewModel.extraCallback(), (Object) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2);
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda40 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent);
                            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new onWarmupCompleted(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda40, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679943602);
                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                            int i23 = 3670016 & i4;
                            z4 = i23 != 1048576;
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent3 | z4) {
                                Object obj2 = objOnMinimized5;
                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    Function0 function05 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda10
                                        private static int onNavigationEvent = 0;
                                        private static int onWarmupCompleted = 1;

                                        public final Object invoke() {
                                            int i24 = 2 % 2;
                                            int i25 = onWarmupCompleted + 29;
                                            onNavigationEvent = i25 % 128;
                                            int i26 = i25 % 2;
                                            Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallback(function02, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                            int i27 = onNavigationEvent + 25;
                                            onWarmupCompleted = i27 % 128;
                                            int i28 = i27 % 2;
                                            return unitOnExtraCallback;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function05);
                                    obj2 = function05;
                                }
                                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj2, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 254);
                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent3 = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchasePreparationViewModel.asInterface(), Boolean.FALSE, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2);
                                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent4 = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent((getTileModeX) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{inAppPurchasePreparationViewModel}, -1981269108, 1981269112), (Object) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2);
                                final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2);
                                if (asBinder((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent3)) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679673438);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized6 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda11
                                            private static int onExtraCallback = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke() {
                                                int i24 = 2 % 2;
                                                int i25 = onWarmupCompleted + 97;
                                                onExtraCallback = i25 % 128;
                                                int i26 = i25 % 2;
                                                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.IAuthTabCallback();
                                                int i27 = onExtraCallback + 33;
                                                onWarmupCompleted = i27 % 128;
                                                int i28 = i27 % 2;
                                                return unitIAuthTabCallback;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                    }
                                    removeAllUpdateListeners.IAuthTabCallback(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, false, (String) null, (Role) null, (Function0) objOnMinimized6, 28, (Object) null), false, false, (TdsSkeletonV1View.onWarmupCompleted) null, (TdsSkeletonV1View.IAuthTabCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 30);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iExtraCallback);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        return;
                                    }
                                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                    final boolean z6 = z5;
                                    final Function1<? super String, Unit> function15 = function14;
                                    final Function0<Unit> function06 = function03;
                                    function2 = new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda12
                                        private static int onExtraCallbackWithResult = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke(Object obj3, Object obj4) {
                                            int i24 = 2 % 2;
                                            int i25 = onNavigationEvent + 61;
                                            onExtraCallbackWithResult = i25 % 128;
                                            int i26 = i25 % 2;
                                            Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onWarmupCompleted(quirksExternalSyntheticBackport05, inAppPurchasePreparationViewModel, getcreativeid, z6, function15, function06, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                            int i27 = onNavigationEvent + 105;
                                            onExtraCallbackWithResult = i27 % 128;
                                            if (i27 % 2 == 0) {
                                                int i28 = 92 / 0;
                                            }
                                            return unitOnWarmupCompleted;
                                        }
                                    };
                                } else {
                                    String strIAuthTabCallback = null;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679434149);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent4}, 949906919, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -949906914, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                    if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 == null) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679364400);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        if (z5) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1677731257);
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setContentInsetsAbsolute.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                                            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                                            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                                getAwbState.onExtraCallback();
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                            }
                                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                            setCallToAction.IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult3 = setCallToAction.IAuthTabCallback.Companion;
                                            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onextracallbackwithresult3.onNavigationEvent();
                                            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!zOnExtraCallback2) {
                                                Object obj3 = objOnMinimized7;
                                                if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    Function0 function07 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda15
                                                        private static int IAuthTabCallback = 0;
                                                        private static int onNavigationEvent = 1;

                                                        public final Object invoke() {
                                                            int i24 = 2 % 2;
                                                            int i25 = onNavigationEvent + 17;
                                                            IAuthTabCallback = i25 % 128;
                                                            int i26 = i25 % 2;
                                                            Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallback(new Object[]{inAppPurchasePreparationViewModel}, -1879737177, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1879737178, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                                            int i27 = IAuthTabCallback + 19;
                                                            onNavigationEvent = i27 % 128;
                                                            int i28 = i27 % 2;
                                                            return unit;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function07);
                                                    obj3 = function07;
                                                }
                                                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{"Success", null, iAuthTabCallbackOnNavigationEvent, null, null, null, (Function0) obj3, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                String strOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted.onExtraCallback();
                                                setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = onextracallbackwithresult3.onNavigationEvent();
                                                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!zOnExtraCallback3) {
                                                    int i24 = onNavigationEvent + 89;
                                                    onExtraCallbackWithResult = i24 % 128;
                                                    int i25 = i24 % 2;
                                                    Object obj4 = objOnMinimized8;
                                                    if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        Function0 function08 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda16
                                                            private static int onExtraCallback = 0;
                                                            private static int onExtraCallbackWithResult = 1;

                                                            public final Object invoke() {
                                                                int i26 = 2 % 2;
                                                                int i27 = onExtraCallbackWithResult + 29;
                                                                onExtraCallback = i27 % 128;
                                                                int i28 = i27 % 2;
                                                                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallbackWithResult(inAppPurchasePreparationViewModel);
                                                                int i29 = onExtraCallbackWithResult + 17;
                                                                onExtraCallback = i29 % 128;
                                                                if (i29 % 2 != 0) {
                                                                    int i30 = 52 / 0;
                                                                }
                                                                return unitOnExtraCallbackWithResult;
                                                            }
                                                        };
                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function08);
                                                        obj4 = function08;
                                                    }
                                                    setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback, null, iAuthTabCallbackOnNavigationEvent2, null, null, null, (Function0) obj4, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                    String strOnExtraCallback2 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback.onExtraCallback();
                                                    setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent3 = onextracallbackwithresult3.onNavigationEvent();
                                                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                    if (!zOnExtraCallback4) {
                                                        Object obj5 = objOnMinimized9;
                                                        if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            Function0 function09 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda2
                                                                private static int IAuthTabCallback = 1;
                                                                private static int onExtraCallback;

                                                                public final Object invoke() {
                                                                    int i26 = 2 % 2;
                                                                    int i27 = IAuthTabCallback + 5;
                                                                    onExtraCallback = i27 % 128;
                                                                    int i28 = i27 % 2;
                                                                    Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(inAppPurchasePreparationViewModel);
                                                                    int i29 = onExtraCallback + 109;
                                                                    IAuthTabCallback = i29 % 128;
                                                                    int i30 = i29 % 2;
                                                                    return unitOnNavigationEvent;
                                                                }
                                                            };
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function09);
                                                            obj5 = function09;
                                                        }
                                                        setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback2, null, iAuthTabCallbackOnNavigationEvent3, null, null, null, (Function0) obj5, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                        String strOnExtraCallback3 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.asBinder.onExtraCallback.onExtraCallback();
                                                        setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent4 = onextracallbackwithresult3.onNavigationEvent();
                                                        boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                        if (!zOnExtraCallback5) {
                                                            Object obj6 = objOnMinimized10;
                                                            if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                Function0 function010 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda3
                                                                    private static int IAuthTabCallback = 1;
                                                                    private static int onWarmupCompleted;

                                                                    public final Object invoke() {
                                                                        int i26 = 2 % 2;
                                                                        int i27 = IAuthTabCallback + 75;
                                                                        onWarmupCompleted = i27 % 128;
                                                                        if (i27 % 2 != 0) {
                                                                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.IAuthTabCallback(inAppPurchasePreparationViewModel);
                                                                            throw null;
                                                                        }
                                                                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.IAuthTabCallback(inAppPurchasePreparationViewModel);
                                                                        int i28 = onWarmupCompleted + 53;
                                                                        IAuthTabCallback = i28 % 128;
                                                                        if (i28 % 2 != 0) {
                                                                            return unitIAuthTabCallback;
                                                                        }
                                                                        throw null;
                                                                    }
                                                                };
                                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function010);
                                                                obj6 = function010;
                                                            }
                                                            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback3, null, iAuthTabCallbackOnNavigationEvent4, null, null, null, (Function0) obj6, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                            String strOnExtraCallback4 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallback_Parcel.onExtraCallbackWithResult.onExtraCallback();
                                                            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent5 = onextracallbackwithresult3.onNavigationEvent();
                                                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                            if (!zOnExtraCallback6) {
                                                                Object obj7 = objOnMinimized11;
                                                                if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                    Function0 function011 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda4
                                                                        private static int IAuthTabCallback = 0;
                                                                        private static int onWarmupCompleted = 1;

                                                                        public final Object invoke() {
                                                                            int i26 = 2 % 2;
                                                                            int i27 = onWarmupCompleted + 73;
                                                                            IAuthTabCallback = i27 % 128;
                                                                            int i28 = i27 % 2;
                                                                            Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onWarmupCompleted(inAppPurchasePreparationViewModel);
                                                                            if (i28 != 0) {
                                                                                int i29 = 47 / 0;
                                                                            }
                                                                            return unitOnWarmupCompleted;
                                                                        }
                                                                    };
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function011);
                                                                    obj7 = function011;
                                                                }
                                                                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback4, null, iAuthTabCallbackOnNavigationEvent5, null, null, null, (Function0) obj7, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                                String strOnExtraCallback5 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onWarmupCompleted.onExtraCallback.onExtraCallback();
                                                                setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent6 = onextracallbackwithresult3.onNavigationEvent();
                                                                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                                if (!zOnExtraCallback7) {
                                                                    Object obj8 = objOnMinimized12;
                                                                    if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                        Function0 function012 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda5
                                                                            private static int IAuthTabCallback = 0;
                                                                            private static int onWarmupCompleted = 1;

                                                                            public final Object invoke() {
                                                                                int i26 = 2 % 2;
                                                                                int i27 = onWarmupCompleted + 125;
                                                                                IAuthTabCallback = i27 % 128;
                                                                                int i28 = i27 % 2;
                                                                                InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel2 = inAppPurchasePreparationViewModel;
                                                                                if (i28 == 0) {
                                                                                    return (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onExtraCallback(new Object[]{inAppPurchasePreparationViewModel2}, -359878597, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 359878600, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                                                                }
                                                                                Object obj9 = null;
                                                                                obj9.hashCode();
                                                                                throw null;
                                                                            }
                                                                        };
                                                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function012);
                                                                        obj8 = function012;
                                                                    }
                                                                    setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnExtraCallback5, null, iAuthTabCallbackOnNavigationEvent6, null, null, null, (Function0) obj8, null, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 954}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1675682405);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback != null) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1675583546);
                                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(inAppPurchasePreparationViewModel.IAuthTabCallback_Parcel(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                                            getcreativeid2 = getcreativeid;
                                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getcreativeid2);
                                            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback);
                                            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (!(zOnExtraCallback8 | zOnNavigationEvent4 | zOnExtraCallback9)) {
                                                Object obj9 = objOnMinimized13;
                                                if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    Function0 function013 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda6
                                                        private static int onExtraCallbackWithResult = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke() {
                                                            int i26 = 2 % 2;
                                                            int i27 = onExtraCallbackWithResult + 89;
                                                            onWarmupCompleted = i27 % 128;
                                                            int i28 = i27 % 2;
                                                            Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onWarmupCompleted(getcreativeid2, inAppPurchasePreparationViewModel, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback);
                                                            int i29 = onWarmupCompleted + 117;
                                                            onExtraCallbackWithResult = i29 % 128;
                                                            int i30 = i29 % 2;
                                                            return unitOnWarmupCompleted;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function013);
                                                    obj9 = function013;
                                                }
                                                Function0 function014 = (Function0) obj9;
                                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41 safeActivityEmbeddingComponentProviderExternalSyntheticLambda41AsInterface = asInterface((CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2);
                                                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda41AsInterface instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent) {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1674834586);
                                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent) safeActivityEmbeddingComponentProviderExternalSyntheticLambda41AsInterface;
                                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda58.IAuthTabCallback(lowLightBoostControlExternalSyntheticLambda0.onNavigationEvent(onextracallback, 1.0f, true), safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent.onNavigationEvent(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent.onExtraCallbackWithResult(), safeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onNavigationEvent.onWarmupCompleted(), Intrinsics.areEqual(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback), Boolean.TRUE), function014, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                } else {
                                                    if (!(safeActivityEmbeddingComponentProviderExternalSyntheticLambda41AsInterface instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41$onExtraCallback)) {
                                                        int i26 = onNavigationEvent + 87;
                                                        onExtraCallbackWithResult = i26 % 128;
                                                        int i27 = i26 % 2;
                                                        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda41AsInterface != null) {
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1993691922);
                                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                    }
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1674280461);
                                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda59.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0.onNavigationEvent(onextracallback, 1.0f, true), windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback, Intrinsics.areEqual(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback), Boolean.TRUE), function014, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            }
                                        } else {
                                            getcreativeid2 = getcreativeid;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1673872005);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                        if (((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())) != null) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(234593247);
                                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda402 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                            if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda402 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted) {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(234650318);
                                                Unit unit = Unit.INSTANCE;
                                                boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getcreativeid2);
                                                boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2);
                                                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent);
                                                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(zOnExtraCallback10 | zOnExtraCallback11 | zOnNavigationEvent5) && !zOnNavigationEvent6) {
                                                    int i28 = onExtraCallbackWithResult + 65;
                                                    onNavigationEvent = i28 % 128;
                                                    if (i28 % 2 == 0) {
                                                        i10 = 0;
                                                        int i29 = 3 / 0;
                                                        if (objOnMinimized14 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                            i11 = i10;
                                                        }
                                                    } else {
                                                        i10 = 0;
                                                        if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        }
                                                    }
                                                    isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted onwarmupcompleted = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                                    Intrinsics.checkNotNull(onwarmupcompleted, "");
                                                    r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(onwarmupcompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11), (QuirksExternalSyntheticBackport0) null, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.onExtraCallbackWithResult.IAuthTabCallback(), (getBacktraceNote) null, (Function0) null, (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 114);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                } else {
                                                    i10 = 0;
                                                }
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                i11 = i10;
                                                objOnMinimized14 = new onNavigationEvent(getcreativeid, inAppPurchasePreparationViewModel, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent2, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent, null);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40.onWarmupCompleted onwarmupcompleted2 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                                Intrinsics.checkNotNull(onwarmupcompleted2, "");
                                                r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(onwarmupcompleted2.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i11), (QuirksExternalSyntheticBackport0) null, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.onExtraCallbackWithResult.IAuthTabCallback(), (getBacktraceNote) null, (Function0) null, (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 114);
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            } else {
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda402 instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40$onNavigationEvent) {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(235796016);
                                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda403 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                                                    Intrinsics.checkNotNull(safeActivityEmbeddingComponentProviderExternalSyntheticLambda403, "");
                                                    r8lambdaIItvJ65H1kry9itpoQE60dxnTI.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40$onNavigationEvent) safeActivityEmbeddingComponentProviderExternalSyntheticLambda403).onNavigationEvent(), new Object[]{Integer.valueOf(R.string.appsintoss_in_app_purchase_cta_purchase)}, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (QuirksExternalSyntheticBackport0) null, r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.onExtraCallbackWithResult.onWarmupCompleted(), (getBacktraceNote) null, (Function0) null, (r8lambdaDHTEMgjZGPjMLXAfOa2eIWlxu7w) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 114);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1100751007);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                                }
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        } else {
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(236484805);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        z3 = z5;
                                        function13 = function14;
                                    } else {
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                        boolean z7 = true;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679364399);
                                        String strOnExtraCallbackWithResult = inAppPurchasePreparationViewModel.IAuthTabCallbackStub().onExtraCallbackWithResult();
                                        if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback != null && (appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback.asInterface()) != null) {
                                            strIAuthTabCallback = appsInTossProductAsInterface.IAuthTabCallback();
                                        }
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda36.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, strOnExtraCallbackWithResult, strIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback != null) {
                                            int i30 = onNavigationEvent + 67;
                                            onExtraCallbackWithResult = i30 % 128;
                                            int i31 = i30 % 2;
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(676319905);
                                            String interfaceDescriptor = inAppPurchasePreparationViewModel.getInterfaceDescriptor();
                                            String strOnExtraCallbackWithResult2 = inAppPurchasePreparationViewModel.IAuthTabCallbackStub().onExtraCallbackWithResult();
                                            if (i23 == 1048576) {
                                                int i32 = onNavigationEvent + 125;
                                                onExtraCallbackWithResult = i32 % 128;
                                                boolean z8 = i32 % 2 == 0;
                                                boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inAppPurchasePreparationViewModel);
                                                boolean z9 = (458752 & i4) == 131072;
                                                if ((57344 & i4) == 16384) {
                                                    int i33 = onNavigationEvent + 37;
                                                    onExtraCallbackWithResult = i33 % 128;
                                                    int i34 = i33 % 2;
                                                } else {
                                                    z7 = false;
                                                }
                                                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback);
                                                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if ((zOnNavigationEvent7 || (zOnExtraCallback12 | z8 | z9 | z7)) || objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    final Function0<Unit> function015 = function03;
                                                    i9 = i4;
                                                    final Function1<? super String, Unit> function16 = function14;
                                                    Function1 function17 = new Function1() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda13
                                                        private static int onNavigationEvent = 0;
                                                        private static int onWarmupCompleted = 1;

                                                        public final Object invoke(Object obj10) {
                                                            int i35 = 2 % 2;
                                                            int i36 = onWarmupCompleted + 67;
                                                            onNavigationEvent = i36 % 128;
                                                            if (i36 % 2 == 0) {
                                                                return SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(function02, inAppPurchasePreparationViewModel, function015, function16, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback, (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback) obj10);
                                                            }
                                                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(function02, inAppPurchasePreparationViewModel, function015, function16, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0OnExtraCallback, (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback) obj10);
                                                            Object obj11 = null;
                                                            obj11.hashCode();
                                                            throw null;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function17);
                                                    objOnMinimized15 = function17;
                                                } else {
                                                    i9 = i4;
                                                }
                                                i8 = iExtraCallback;
                                                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda6.IAuthTabCallback(null, interfaceDescriptor, strOnExtraCallbackWithResult2, safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, safeActivityEmbeddingComponentProviderExternalSyntheticLambda33IAuthTabCallback, getcreativeid, (Function1) objOnMinimized15, cameraCaptureResultEmptyCameraCaptureResult3, 458752 & (i9 << 9), 1);
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                                            }
                                        } else {
                                            i8 = iExtraCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(677621657);
                                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(i8);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                            return;
                                        }
                                        final boolean z10 = z5;
                                        final Function1<? super String, Unit> function18 = function14;
                                        final Function0<Unit> function016 = function03;
                                        function2 = new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda14
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallbackWithResult;

                                            public final Object invoke(Object obj10, Object obj11) throws Throwable {
                                                int i35 = 2 % 2;
                                                int i36 = IAuthTabCallback + 11;
                                                onExtraCallbackWithResult = i36 % 128;
                                                int i37 = i36 % 2;
                                                Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(quirksExternalSyntheticBackport06, inAppPurchasePreparationViewModel, getcreativeid, z10, function18, function016, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj10, ((Integer) obj11).intValue());
                                                int i38 = onExtraCallbackWithResult + 17;
                                                IAuthTabCallback = i38 % 128;
                                                if (i38 % 2 != 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                throw null;
                                            }
                                        };
                                    }
                                }
                            }
                        } else {
                            obj = objOnMinimized4;
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback = r8lambdaPEtEbZoUEaIc2Hj0StO1oIbkWQ.IAuthTabCallback((r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g.onWarmupCompleted) null, (DeviceQuirksExternalSyntheticLambda0) null, (VirtualCameraControlExternalSyntheticLambda1) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                            cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(inAppPurchasePreparationViewModel.extraCallback(), (Object) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 2);
                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda404 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent);
                            zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback);
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                                objOnMinimized = new onWarmupCompleted(r8lambdaddmu1qhgkvw1thlkiuusmrk5nn4IAuthTabCallback, cameraPresenceProviderExternalSyntheticLambda6OnNavigationEvent, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda404, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                                Function0 function0IAuthTabCallback22 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1679943602);
                                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                                int i232 = 3670016 & i4;
                                if (i232 != 1048576) {
                                }
                                Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (zOnNavigationEvent3 | z4) {
                                }
                            }
                        }
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                function03 = function0;
                z3 = z2;
                function13 = function12;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final Function0<Unit> function017 = function03;
                    function2 = new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda7
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj10, Object obj11) throws Throwable {
                            int i35 = 2 % 2;
                            int i36 = IAuthTabCallback + 83;
                            onExtraCallbackWithResult = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.IAuthTabCallback(quirksExternalSyntheticBackport02, inAppPurchasePreparationViewModel, getcreativeid, z3, function13, function017, function02, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj10, ((Integer) obj11).intValue());
                            int i38 = IAuthTabCallback + 111;
                            onExtraCallbackWithResult = i38 % 128;
                            int i39 = i38 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
                    return;
                }
                return;
            }
            i4 |= 24576;
            function12 = function1;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 599187) != 599186, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function12 = function1;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 599187) != 599186, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final boolean asBinder(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i4 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i5 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
    }

    private static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41 asInterface(CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41> cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41 safeActivityEmbeddingComponentProviderExternalSyntheticLambda41 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda41) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda41;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 safeActivityEmbeddingComponentProviderExternalSyntheticLambda40 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i5 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda40;
    }

    private static final Boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i4 != 0) {
            return bool;
        }
        throw null;
    }

    private static final WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> cameraPresenceProviderExternalSyntheticLambda6) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i5 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        return (Unit) onExtraCallback(new Object[]{inAppPurchasePreparationViewModel}, -359878597, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 359878600, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit asBinder(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        return (Unit) onExtraCallback(new Object[]{inAppPurchasePreparationViewModel}, -1879737177, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1879737178, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40 onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40> cameraPresenceProviderExternalSyntheticLambda6) {
        return (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda40) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -282681282, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        return (Unit) onExtraCallback(new Object[]{function0, cameraPresenceProviderExternalSyntheticLambda6}, -1686334517, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1686334521, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 onTransact(CameraPresenceProviderExternalSyntheticLambda6<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27> cameraPresenceProviderExternalSyntheticLambda6) {
        return (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, 949906919, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -949906914, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, getCreativeId getcreativeid, boolean z, Function1 function1, Function0 function0, Function0 function02, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, inAppPurchasePreparationViewModel, getcreativeid, Boolean.valueOf(z), function1, function0, function02, Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, -968903568, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 968903575, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit onWarmupCompleted(Function0 function0, InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel, Function0 function02, Function1 function1, WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback onextracallback) {
        return (Unit) onExtraCallback(new Object[]{function0, inAppPurchasePreparationViewModel, function02, function1, windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, onextracallback}, -1827521496, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), 1827521502, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback_Parcel(InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel) {
        return (Unit) onExtraCallback(new Object[]{inAppPurchasePreparationViewModel}, 1653571630, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1653571628, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }
}
