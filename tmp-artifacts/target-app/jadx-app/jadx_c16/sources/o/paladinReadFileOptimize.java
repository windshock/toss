package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import im.toss.features.edoc.composable.PrintableEDocListScreenKt$;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getViewTypeCount;
import o.setCallToAction;
import o.setClickTrackingUrls;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocForPrint;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class paladinReadFileOptimize {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -636864136, 636864137, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(zBooleanValue), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, R.drawable.IAuthTabCallback());
        int i3 = onExtraCallback + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, String str, String str2, String str3, boolean z, String str4, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 125;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallback(j, str, str2, str3, z, str4, z2, quirksExternalSyntheticBackport0, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(j, str, str2, str3, z, str4, z2, quirksExternalSyntheticBackport0, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, List list, Function1 function1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, list, function1, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 61;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 22 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        IAuthTabCallbackStub(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        String str = (String) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(EDocForPrint eDocForPrint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted(eDocForPrint);
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function1, jLongValue);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, jLongValue);
        int i3 = onExtraCallback + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(long j, String str, String str2, String str3, boolean z, String str4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(j, str, str2, str3, z, str4, quirksExternalSyntheticBackport0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 117;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(long j, String str, String str2, String str3, boolean z, String str4, boolean z2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 25;
        onNavigationEvent = i5 % 128;
        IAuthTabCallback(j, str, str2, str3, z, str4, z2, quirksExternalSyntheticBackport0, function2, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 19;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 73;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, List list, Map map, Function2 function2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1, list, map, function2, function0, function02, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 75;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 635161947, -635161938, R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, boolean z2, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unit = (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -947675236, 947675242, R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
            int i4 = 28 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -947675236, 947675242, R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
        }
        int i5 = onExtraCallback + 33;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(function2, jLongValue, zBooleanValue);
        }
        onNavigationEvent(function2, jLongValue, zBooleanValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(long j, String str, String str2, String str3, boolean z, String str4, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 23;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, str, str2, str3, z, str4, quirksExternalSyntheticBackport0, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 67;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 58 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, Map map, Function2 function2, Function0 function0, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list, map, function2, function0, audioRestrictionControllerImplExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = onNavigationEvent + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, Function1 function1, Function0 function0, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(list, function1, function0, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        onExtraCallback(list, function1, function0, audioRestrictionControllerImplExternalSyntheticLambda0);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, List list, Map map, Function2 function2, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, list, map, function2, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 79;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, List list, Function1 function1, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, (List<EDocForPrint>) list, (Function1<? super Long, Unit>) function1, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onNavigationEvent(EDocForPrint eDocForPrint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(eDocForPrint);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = IAuthTabCallback(eDocForPrint);
        int i3 = onExtraCallback + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return objIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, boolean z, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1075996146, 1075996154, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Map map, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(map, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, R.drawable.IAuthTabCallback());
        } else {
            onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, R.drawable.IAuthTabCallback());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i3)) | i4;
        int i9 = ~i3;
        int i10 = i7 | i4;
        int i11 = (~(i | i9 | i4)) | (~(i10 | i3));
        int i12 = (~i10) | (~(i9 | (~i4)));
        int i13 = i4 + i3 + i2 + (1353909401 * i5) + ((-1351514252) * i6);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i4) + 799145984 + ((-1483212659) * i3) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i2) + (337379328 * i5) + ((-1540358144) * i6) + (669122560 * i14);
        int i16 = ((i4 * 521834465) - 1171472169) + (i3 * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i2 * 521834041) + (i5 * 1123214353) + (i6 * (-684621612)) + (i14 * 1028784128);
        switch (i15 + (i16 * i16 * 1635647488)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                String str = (String) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                String str2 = (String) objArr[2];
                w5a w5aVar = (w5a) objArr[3];
                int i17 = 4;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                        int i19 = onNavigationEvent;
                        int i20 = i19 + 51;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = i19 + 75;
                        onExtraCallback = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 4 % 5;
                        }
                    } else {
                        i17 = 2;
                    }
                    iIntValue |= i17;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                } else {
                    int i24 = onExtraCallback + 51;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-808941721, iIntValue, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:277)");
                    }
                    w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1856419953, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda5(str, zBooleanValue), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-303332592, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda6(str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 54);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 9:
                return onTransact(objArr);
            case 10:
                return asBinder(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, zBooleanValue, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, boolean z, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, z, str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 57;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 6 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static final Object onWarmupCompleted(EDocForPrint eDocForPrint) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eDocForPrint, "");
            Long.valueOf(eDocForPrint.IAuthTabCallback());
            throw null;
        }
        Intrinsics.checkNotNullParameter(eDocForPrint, "");
        Long lValueOf = Long.valueOf(eDocForPrint.IAuthTabCallback());
        int i3 = onNavigationEvent + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return lValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            z = (i & 96) != 67;
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onNavigationEvent + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1601905461, i, -1, "im.toss.features.edoc.composable.MultiPrintableEDocListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:73)");
                }
                onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null), function0, cameraCaptureResultEmptyCameraCaptureResult, 6, 0}, R.drawable.IAuthTabCallback());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i6 = onNavigationEvent + 31;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i7 = 60 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null), function0, cameraCaptureResultEmptyCameraCaptureResult, 6, 0}, R.drawable.IAuthTabCallback());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(List list, Map map, Function2 function2, Function0 function0, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        readFile readfile = readFile.onExtraCallbackWithResult;
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, (getBacktraceNote) readFile.onExtraCallback(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1580741913, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1580741914, new Object[]{readfile}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, readfile.onNavigationEvent(), 3, (Object) null);
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), new onWarmupCompleted(new PrintableEDocListScreenKt$.ExternalSyntheticLambda10(), list), new IAuthTabCallback(onNavigationEvent.IAuthTabCallback, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onExtraCallback(list, map, function2)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-1601905461, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda11(function0)), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Map map, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1637486027, i2, -1, "im.toss.features.edoc.composable.MultiPrintableEDocListScreen.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:82)");
                int i6 = onNavigationEvent + 59;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.edoc.R.string.edoc_composable___2ac71d40ed, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, !map.isEmpty(), false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 758);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull List<EDocForPrint> list, @NotNull Map<Long, Boolean> map, @NotNull Function2<? super Long, ? super Boolean, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2094684040);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = onNavigationEvent + 19;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i9 = onExtraCallback + 77;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i10 = onNavigationEvent + 95;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            int i12 = onExtraCallback + 17;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i14 = onNavigationEvent + 17;
                onExtraCallback = i14 % 128;
                i4 = i14 % 2 != 0 ? 24548 : 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                i3 = 65536;
            } else {
                int i15 = onNavigationEvent + 83;
                onExtraCallback = i15 % 128;
                int i16 = i15 % 2;
                i3 = 131072;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i2) != 74898, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2094684040, i2, -1, "im.toss.features.edoc.composable.MultiPrintableEDocListScreen (PrintableEDocListScreen.kt:35)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i17 = onExtraCallback + 43;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, readDir.onNavigationEvent(onextracallback, 0L, 0L, 0.0f, false, true, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 15), 1.0f, false, 2, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list);
            boolean z = (i2 & 896) == 256;
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (57344 & i2) == 16384;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | z | z2 | z3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    PrintableEDocListScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new PrintableEDocListScreenKt$.ExternalSyntheticLambda12(list, map, function2, function0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda12);
                    obj = externalSyntheticLambda12;
                }
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 3) & 112, 508);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                u1.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (u2) null, ForwardingCameraControl.onExtraCallback(1637486027, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda13(map, function02), cameraCaptureResultEmptyCameraCaptureResult2, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, 805306752, 0, 3579);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onExtraCallback + 119;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PrintableEDocListScreenKt$.ExternalSyntheticLambda14(camera2CameraMetadataExternalSyntheticLambda1, list, map, function2, function0, function02, i));
        }
    }

    private static final String onNavigationEvent(String str) {
        String str2;
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = Calendar.getInstance().get(1);
        int iIntValue = 0;
        String strSubstring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
        if (intOrNull != null) {
            int i5 = onNavigationEvent + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iIntValue = intOrNull.intValue();
        }
        if (i4 == iIntValue) {
            int i7 = onNavigationEvent + 91;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            str2 = "M월 d일";
        } else {
            str2 = "yy년 M월 d일";
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(mergeParams.onExtraCallback(str, str2, "yyyy-MM-dd'T'HH:mm:ss"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        return (String) obj;
    }

    private static final Unit onNavigationEvent(Function2 function2, long j, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(Long.valueOf(j), Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long jLongValue;
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            int i4 = onNavigationEvent + 75;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1438266999, iIntValue, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:125)");
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804886726);
                if (zBooleanValue) {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804890384);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                    } else {
                        int i6 = onNavigationEvent + 67;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804889424);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 27)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804889424);
                            jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804887632);
                    jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                }
                long j = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = onExtraCallback + 9;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, 5, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0, 130934}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onNavigationEvent + 1;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(804886726);
                if (zBooleanValue) {
                }
                long j2 = jLongValue;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i72 = onExtraCallback + 9;
                onNavigationEvent = i72 % 128;
                int i82 = i72 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j2), 0L, 0L, null, 5, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0, 130934}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jOnUnminimized;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1555903768, i, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:132)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-574896913);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-574895953);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(jOnUnminimized), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str, boolean z, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            int i3 = onExtraCallback + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 19) != 18) {
            int i5 = onExtraCallback + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i7 = onExtraCallback + 69;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(822052529, i, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:123)");
            }
            w5aVar.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1438266999, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda24(str, z), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1555903768, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda25(str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54 | ((i << 6) & 896));
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i8 = onExtraCallback + 65;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onNavigationEvent + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(84658301, i2, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:140)");
            }
            if (str == null || str.length() == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(909819909);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i8 = onExtraCallback + 63;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(909690174);
                w3bVar.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, RectangleShapeKt.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 1572864, 62);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 47;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1340418595, i, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:156)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-347913686);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-347912726);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onNavigationEvent + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 123;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallback + 107;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean z;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        RightPreset rightPreset = (RightPreset) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 120) == 0) {
                iIntValue |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 2 : 4;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            int i3 = onExtraCallback + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallback + 79;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 121;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-834132415, iIntValue, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:148)");
                    int i8 = 32 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-834132415, iIntValue, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:148)");
                }
            }
            if (zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1042049923);
                setStarRating.onExtraCallbackWithResult(new Object[]{Boolean.valueOf(zBooleanValue2), null, false, null, setClickTrackingUrls.onNavigationEvent.Large, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 46}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1042201389);
                rightPreset.onExtraCallback(ForwardingCameraControl.onExtraCallback(1340418595, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda16(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult implements Function1 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 59;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 81 / 0;
            }
        }

        public final Void onExtraCallbackWithResult(EDocForPrint eDocForPrint) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 43;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(obj);
            }
            onExtraCallbackWithResult(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Function1 {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 15;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final Void onExtraCallbackWithResult(EDocForPrint eDocForPrint) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(obj);
            }
            onExtraCallbackWithResult(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106 A[PHI: r20
      0x0106: PHI (r20v4 boolean) = (r20v3 boolean), (r20v7 boolean) binds: [B:69:0x0104, B:66:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109 A[PHI: r20
      0x0109: PHI (r20v6 boolean) = (r20v3 boolean), (r20v7 boolean) binds: [B:69:0x0104, B:66:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z, @NotNull String str4, boolean z2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function2<? super Long, ? super Boolean, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z4;
        String strOnNavigationEvent;
        Function0 function0;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1030765236);
        if ((i & 6) == 0) {
            int i8 = onNavigationEvent + 1;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i10 = onExtraCallback + 69;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i11 = onExtraCallback + 47;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i12 = onNavigationEvent + 55;
                onExtraCallback = i12 % 128;
                i6 = i12 % 2 != 0 ? 8131 : 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            int i13 = onNavigationEvent + 75;
            onExtraCallback = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 29 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 131072 : 65536;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4)) {
            }
            i3 |= i5;
        }
        if ((1572864 & i) == 0) {
            int i15 = onExtraCallback + 7;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 == 0) {
                z3 = false;
                int i16 = 8 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 1048576 : 524288;
            } else {
                z3 = false;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                }
            }
            i3 |= i4;
        } else {
            z3 = false;
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922 ? true : z3, i3 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1030765236, i3, -1, "im.toss.features.edoc.composable.MultiPrintableEDoc (PrintableEDocListScreen.kt:104)");
            }
            if ((i3 & 7168) == 2048) {
                int i18 = onNavigationEvent + 67;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
                z4 = true;
            } else {
                z4 = z3;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z4 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                if (str3 == null || (strOnNavigationEvent = onNavigationEvent(str3)) == null) {
                    strOnNavigationEvent = "";
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(strOnNavigationEvent);
                objOnMinimized = strOnNavigationEvent;
            }
            String str5 = (String) objOnMinimized;
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1488252480);
                if ((234881024 & i3) == 67108864) {
                    int i20 = onExtraCallback + 63;
                    onNavigationEvent = i20 % 128;
                    boolean z7 = i20 % 2 == 0 ? z3 : true;
                    if ((i3 & 14) == 4) {
                        int i21 = onNavigationEvent + 107;
                        onExtraCallback = i21 % 128;
                        int i22 = i21 % 2;
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if ((3670016 & i3) == 1048576) {
                        int i23 = onNavigationEvent + 69;
                        onExtraCallback = i23 % 128;
                        int i24 = i23 % 2;
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z5 | z7 | z6) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new PrintableEDocListScreenKt$.ExternalSyntheticLambda17(function2, j, z2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    function0 = (Function0) objOnMinimized2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1488202199);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                function0 = null;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(822052529, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda18(str, z, str5), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(84658301, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda19(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-834132415, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda20(z, z2, str4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i3 >> 18) & 112) | 196998, 384, 110552);
            AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 6, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PrintableEDocListScreenKt$.ExternalSyntheticLambda21(j, str, str2, str3, z, str4, z2, quirksExternalSyntheticBackport02, function2, i, i2));
        }
    }

    public static final class IAuthTabCallback implements Function1<Integer, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onWarmupCompleted;

        public IAuthTabCallback(Function1 function1, List list) {
            this.onWarmupCompleted = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(((Number) obj).intValue());
            int i4 = onExtraCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onWarmupCompleted.invoke(this.IAuthTabCallback.get(i));
            int i5 = onExtraCallback + 31;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        }
    }

    public static final class asBinder implements Function1<Integer, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onWarmupCompleted;

        public asBinder(Function1 function1, List list) {
            this.onWarmupCompleted = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIntValue = ((Number) obj).intValue();
            if (i3 != 0) {
                return onWarmupCompleted(iIntValue);
            }
            int i4 = 5 / 0;
            return onWarmupCompleted(iIntValue);
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onWarmupCompleted.invoke(this.onExtraCallbackWithResult.get(i));
            int i5 = onNavigationEvent + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    public static final class asInterface implements Function1<Integer, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;

        public asInterface(Function1 function1, List list) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(((Number) obj).intValue());
            int i4 = onWarmupCompleted + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 111;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.onNavigationEvent;
            if (i4 == 0) {
                return function1.invoke(this.onExtraCallbackWithResult.get(i));
            }
            function1.invoke(this.onExtraCallbackWithResult.get(i));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Function1<Integer, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onWarmupCompleted;

        public onWarmupCompleted(Function1 function1, List list) {
            this.onWarmupCompleted = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIntValue = ((Number) obj).intValue();
            if (i3 == 0) {
                return onExtraCallbackWithResult(iIntValue);
            }
            onExtraCallbackWithResult(iIntValue);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onWarmupCompleted.invoke(this.IAuthTabCallback.get(i));
            int i5 = onNavigationEvent + 67;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    public static final class IAuthTabCallbackDefault implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function1 IAuthTabCallback;
        final /* synthetic */ List onNavigationEvent;

        public IAuthTabCallbackDefault(List list, Function1 function1) {
            this.onNavigationEvent = list;
            this.IAuthTabCallback = function1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            int i5 = onExtraCallback + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public final void onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            boolean z;
            int i4;
            int i5 = 2 % 2;
            int i6 = onExtraCallbackWithResult + 121;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if ((i2 & 6) == 0) {
                i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                int i8 = onExtraCallbackWithResult + 63;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i10 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                int i12 = onExtraCallback + 77;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i14 = onExtraCallback + 65;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            EDocForPrint eDocForPrint = (EDocForPrint) this.onNavigationEvent.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-684417220);
            paladinReadFileOptimize.onNavigationEvent(eDocForPrint.IAuthTabCallback(), eDocForPrint.onExtraCallback(), eDocForPrint.onExtraCallbackWithResult(), eDocForPrint.asBinder(), eDocForPrint.onNavigationEvent(), eDocForPrint.onWarmupCompleted(), null, this.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 64);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 37;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    public static final class onExtraCallback implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function2 IAuthTabCallback;
        final /* synthetic */ Map onNavigationEvent;
        final /* synthetic */ List onWarmupCompleted;

        public onExtraCallback(List list, Map map, Function2 function2) {
            this.onWarmupCompleted = list;
            this.onNavigationEvent = map;
            this.IAuthTabCallback = function2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            Number number = (Number) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }
            onExtraCallbackWithResult(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            Object obj5 = null;
            obj5.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            boolean z;
            int i4;
            int i5;
            int i6 = 2 % 2;
            if ((i2 & 6) == 0) {
                int i7 = onExtraCallback + 71;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 27 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                }
                i3 = i2 | i5;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                int i9 = onExtraCallbackWithResult + 103;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 47 / 0;
                    i4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                int i11 = onExtraCallback + 75;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            EDocForPrint eDocForPrint = (EDocForPrint) this.onWarmupCompleted.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1507875947);
            long jIAuthTabCallback = eDocForPrint.IAuthTabCallback();
            String strOnExtraCallback = eDocForPrint.onExtraCallback();
            String strOnExtraCallbackWithResult = eDocForPrint.onExtraCallbackWithResult();
            String strAsBinder = eDocForPrint.asBinder();
            boolean zOnNavigationEvent = eDocForPrint.onNavigationEvent();
            String strOnWarmupCompleted = eDocForPrint.onWarmupCompleted();
            Boolean bool = (Boolean) this.onNavigationEvent.get(Long.valueOf(eDocForPrint.IAuthTabCallback()));
            paladinReadFileOptimize.IAuthTabCallback(jIAuthTabCallback, strOnExtraCallback, strOnExtraCallbackWithResult, strAsBinder, zOnNavigationEvent, strOnWarmupCompleted, bool != null ? bool.booleanValue() : false, null, this.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 0, 128);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallbackWithResult + 89;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i14 = 11 / 0;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        int i;
        int i2;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i4;
        boolean z = false;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i5 = 4;
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1341797223);
        int i7 = iIntValue2 & 1;
        if (i7 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i8 = onNavigationEvent + 25;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 39 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                    i5 = 2;
                }
                i = i5 | iIntValue;
            } else {
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                }
                i = i5 | iIntValue;
            }
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i10 = onExtraCallback + 101;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i |= i4;
        }
        if ((i & 19) != 18) {
            int i12 = onExtraCallback + 15;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i14 = onExtraCallback + 7;
            int i15 = i14 % 128;
            onNavigationEvent = i15;
            int i16 = i14 % 2;
            if (i7 != 0) {
                int i17 = i15 + 101;
                onExtraCallback = i17 % 128;
                if (i17 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    throw null;
                }
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1341797223, i, -1, "im.toss.features.edoc.composable.EDocIssueButton (PrintableEDocListScreen.kt:176)");
            }
            getViewTypeCount.onTransact ontransactOnExtraCallbackWithResult = getViewTypeCount.onTransact.Companion.onExtraCallbackWithResult();
            readFile readfile = readFile.onExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i3 = iIntValue2;
            i2 = iIntValue;
            w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{readfile.onExtraCallback(), true, onextracallback, readfile.IAuthTabCallback(), null, null, null, null, null, Float.valueOf(0.0f), null, null, null, ontransactOnExtraCallbackWithResult, null, function0, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 6) & 896) | 3126), Integer.valueOf(((i << 12) & 458752) | 3072), 221168}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i18 = onExtraCallback + 55;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            i2 = iIntValue;
            i3 = iIntValue2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PrintableEDocListScreenKt$.ExternalSyntheticLambda9(onextracallback, function0, i2, i3));
        }
        return null;
    }

    private static final Object IAuthTabCallback(EDocForPrint eDocForPrint) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eDocForPrint, "");
        Long lValueOf = Long.valueOf(eDocForPrint.IAuthTabCallback());
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return lValueOf;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-182800087, i, -1, "im.toss.features.edoc.composable.SinglePrintableEDocListScreen.<anonymous>.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:240)");
            }
            onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 1, (Object) null), function0, cameraCaptureResultEmptyCameraCaptureResult, 6, 0}, R.drawable.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 113;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(List list, Function1 function1, Function0 function0, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        readFile readfile = readFile.onExtraCallbackWithResult;
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, readfile.onWarmupCompleted(), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, readfile.asInterface(), 3, (Object) null);
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), new asInterface(new PrintableEDocListScreenKt$.ExternalSyntheticLambda22(), list), new asBinder(onExtraCallbackWithResult.onExtraCallbackWithResult, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new IAuthTabCallbackDefault(list, function1)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-182800087, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda23(function0)), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[PHI: r0
      0x0054: PHI (r0v43 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v44 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0046, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[PHI: r0
      0x0048: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v44 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0046, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, @NotNull List<EDocForPrint> list, @NotNull Function1<? super Long, Unit> function1, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i3;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1785269482);
            if ((i & 99) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                int i6 = onNavigationEvent + 65;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(camera2CameraMetadataExternalSyntheticLambda1, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function0, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1785269482);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i8 = onNavigationEvent + 63;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function0)) {
                int i10 = onNavigationEvent + 111;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            int i12 = onNavigationEvent + 49;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1785269482, i2, -1, "im.toss.features.edoc.composable.SinglePrintableEDocListScreen (PrintableEDocListScreen.kt:207)");
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(list);
            boolean z = (i2 & 896) == 256;
            boolean z2 = (i2 & 7168) == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!(zOnExtraCallback | z | z2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    PrintableEDocListScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new PrintableEDocListScreenKt$.ExternalSyntheticLambda7(list, function1, function0);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda7);
                    obj = externalSyntheticLambda7;
                }
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult2, (i2 << 3) & 112, 509);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PrintableEDocListScreenKt$.ExternalSyntheticLambda8(camera2CameraMetadataExternalSyntheticLambda1, list, function1, function0, i));
        }
    }

    private static final String onExtraCallbackWithResult(String str) {
        String str2;
        Object obj;
        int i = 2 % 2;
        int i2 = Calendar.getInstance().get(1);
        String strSubstring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
        if (i2 == (intOrNull != null ? intOrNull.intValue() : 0)) {
            str2 = "M월 d일";
        } else {
            str2 = "yy년 M월 d일";
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(mergeParams.onExtraCallback(str, str2, "yyyy-MM-dd'T'HH:mm:ss"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i3 = onNavigationEvent + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            obj = null;
        }
        String str3 = (String) obj;
        int i5 = onNavigationEvent + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str3;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(Long.valueOf(j));
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        long jIsEngagementSignalsApiAvailable;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = onExtraCallback + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i7 = onExtraCallback + 21;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 94 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1856419953, i, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:279)");
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608143540);
                if (z) {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608140842);
                        jIsEngagementSignalsApiAvailable = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608139882);
                        jIsEngagementSignalsApiAvailable = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                    }
                } else {
                    int i9 = onExtraCallback + 99;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608142634);
                        jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 17).isEngagementSignalsApiAvailable();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608142634);
                        jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                    }
                }
                long j = jIsEngagementSignalsApiAvailable;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, 5, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0, 130934}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1608143540);
                if (z) {
                }
                long j2 = jIsEngagementSignalsApiAvailable;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j2), 0L, 0L, null, 5, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0, 130934}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jOnUnminimized;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-303332592, i, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:286)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(555160343);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(555161303);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
            }
            long j = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onNavigationEvent + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 45;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i4 = onExtraCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onNavigationEvent + 11;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1665233691, i2, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:294)");
            }
            if (str != null) {
                int i8 = onExtraCallback + 51;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (str.length() != 0) {
                    int i10 = onNavigationEvent + 117;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2104667616);
                    w3bVar.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, RectangleShapeKt.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 1572864, 62);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2104797351);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onExtraCallback + 23;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = onNavigationEvent + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1339949140, i, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous>.<anonymous> (PrintableEDocListScreen.kt:305)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i7 = onExtraCallback + 73;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(799070579);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(799071539);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onNavigationEvent + 97;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 67) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 111;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1652209193, iIntValue, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:302)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1652209193, iIntValue, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc.<anonymous> (PrintableEDocListScreen.kt:302)");
            }
            if (zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-638489461);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-638816201);
                rightPreset.onExtraCallback(ForwardingCameraControl.onExtraCallback(-1339949140, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda15(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 3) & 112) | 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(long j, @NotNull String str, @Nullable String str2, @Nullable String str3, boolean z, @NotNull String str4, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function1<? super Long, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        String str5;
        int i4;
        boolean z2;
        String strOnExtraCallbackWithResult;
        Function0 function0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1910832956);
        if ((i & 6) == 0) {
            int i7 = onNavigationEvent + 17;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 11 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                    int i9 = onExtraCallback + 71;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            int i11 = onNavigationEvent + 121;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 131072 : 65536;
        }
        int i13 = i2 & 64;
        if (i13 == 0) {
            if ((1572864 & i) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 1048576 : 524288;
            }
            if ((i & 12582912) != 0) {
                int i14 = onExtraCallback + 113;
                str5 = "";
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 8388608 : 4194304;
            } else {
                str5 = "";
            }
            i4 = i3;
            if ((4793491 & i4) == 4793490) {
                int i16 = onExtraCallback + 21;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1910832956, i4, -1, "im.toss.features.edoc.composable.SinglePrintableEDoc (PrintableEDocListScreen.kt:258)");
                }
                boolean z3 = (i4 & 7168) == 2048;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                Object obj = null;
                if (z3) {
                    if (str3 == null || (strOnExtraCallbackWithResult = onExtraCallbackWithResult(str3)) == null) {
                        strOnExtraCallbackWithResult = str5;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(strOnExtraCallbackWithResult);
                    objOnMinimized = strOnExtraCallbackWithResult;
                    String str6 = (String) objOnMinimized;
                    if (z) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-127276135);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        function0 = null;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-127314884);
                        boolean z4 = (29360128 & i4) == 8388608;
                        if ((i4 & 14) == 4) {
                            int i18 = onNavigationEvent + 83;
                            onExtraCallback = i18 % 128;
                            boolean z5 = i18 % 2 == 0;
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(z4 | z5)) {
                                int i19 = onNavigationEvent + 25;
                                onExtraCallback = i19 % 128;
                                if (i19 % 2 != 0) {
                                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                    throw null;
                                }
                                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized2 = new PrintableEDocListScreenKt$.ExternalSyntheticLambda0(function1, j);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                function0 = (Function0) objOnMinimized2;
                            }
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-808941721, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda1(str, z, str6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(1665233691, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda2(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1652209193, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda3(z, str4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i4 >> 15) & 112) | 196998, 384, 110552);
                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 6, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i20 = onExtraCallback + 95;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                } else {
                    int i21 = onNavigationEvent + 103;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    String str62 = (String) objOnMinimized;
                    if (z) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-808941721, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda1(str, z, str62), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(1665233691, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda2(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1652209193, true, new PrintableEDocListScreenKt$.ExternalSyntheticLambda3(z, str4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i4 >> 15) & 112) | 196998, 384, 110552);
                    AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 6, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new PrintableEDocListScreenKt$.ExternalSyntheticLambda4(j, str, str2, str3, z, str4, quirksExternalSyntheticBackport03, function1, i, i2));
                return;
            }
            return;
        }
        i3 |= 1572864;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 12582912) != 0) {
        }
        i4 = i3;
        if ((4793491 & i4) == 4793490) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 45624264, -45624260, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -525145964, 525145967, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, long j, boolean z) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1973033745, -1973033745, R.drawable.IAuthTabCallback(), new Object[]{function2, Long.valueOf(j), Boolean.valueOf(z)}, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -963203508, 963203513, R.drawable.IAuthTabCallback(), new Object[]{str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1232404138, 1232404148, R.drawable.IAuthTabCallback(), new Object[]{str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, long j) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -828296259, 828296261, R.drawable.IAuthTabCallback(), new Object[]{function1, Long.valueOf(j)}, R.drawable.IAuthTabCallback());
    }

    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 921246595, -921246588, R.drawable.IAuthTabCallback(), new Object[]{quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, R.drawable.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -636864136, 636864137, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(boolean z, boolean z2, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -947675236, 947675242, R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(String str, boolean z, String str2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1075996146, 1075996154, R.drawable.IAuthTabCallback(), new Object[]{str, Boolean.valueOf(z), str2, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(boolean z, String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 635161947, -635161938, R.drawable.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, R.drawable.IAuthTabCallback());
    }
}
