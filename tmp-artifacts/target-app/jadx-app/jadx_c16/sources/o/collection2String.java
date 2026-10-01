package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.core.model.dst.widget.TextContentDto;
import im.toss.features.home.feature.cashflow.CashflowSelectTransactionsViewModel;
import im.toss.features.home.feature.cashflow.R$string;
import im.toss.features.home.feature.cashflow.screen.CashflowSelectTransactionsScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import j$.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TimeoutCompanionNONE1;
import o.getPrivacyDestinationUri;
import o.getScreenOrientationThroughResourcesFirst;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.isDebug;
import o.setCallToAction;
import o.setClickTrackingUrls;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.wa;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class collection2String {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(int i, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 != 0) {
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onWarmupCompleted(iOnWarmupCompleted4, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1611180843, iOnWarmupCompleted5, 1611180852, iOnWarmupCompleted6, new Object[]{numValueOf, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2});
        int i6 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TextContentDto textContentDto, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(textContentDto, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 89 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, isDebug.onWarmupCompleted onwarmupcompleted, Function1 function1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {camera2CameraMetadataExternalSyntheticLambda1, onwarmupcompleted, function1, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -77133588, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 77133589, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
        int i5 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, long j, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, j, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isDebug.onWarmupCompleted onwarmupcompleted, Context context, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(onwarmupcompleted, context, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, boolean z2, Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, z2, function0, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        isDebug.onWarmupCompleted onwarmupcompleted = (isDebug.onWarmupCompleted) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(onwarmupcompleted, function0, function1, function02, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, function0, function1, function02, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        List list = (List) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Integer numOnNavigationEvent = onNavigationEvent((List<getScreenOrientationThroughResourcesFirst.IAuthTabCallback>) list, str);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return numOnNavigationEvent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        isDebug.onWarmupCompleted onwarmupcompleted = (isDebug.onWarmupCompleted) objArr[0];
        Context context = (Context) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        u4 u4Var = (u4) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, context, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1135441210, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1135441200, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{th, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue))});
        } else {
            onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1135441210, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1135441200, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{th, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))});
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(int i, Function0 function0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1095020957, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1095020955, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{Integer.valueOf(i), function0, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)});
        }
        Object[] objArr = {Integer.valueOf(i), function0, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int i6 = 12 / 0;
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1095020957, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1095020955, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(getScreenOrientationThroughResourcesFirst.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 51 / 0;
        }
        int i7 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onExtraCallback(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(onwarmupcompleted, z, z2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallback(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, boolean z, boolean z2, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(onwarmupcompleted, z, z2, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        Function0 function0 = (Function0) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        onExtraCallback(iIntValue, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowSelectTransactionsViewModel cashflowSelectTransactionsViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowSelectTransactionsViewModel, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(iCustomTabsCallback_Parcel);
        int i4 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isDebug.onWarmupCompleted onwarmupcompleted, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onWarmupCompleted(onwarmupcompleted, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, function0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -909841563, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 909841563, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{th, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)});
        int i6 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onWarmupCompleted(function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(function0, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, z);
        int i3 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(onwarmupcompleted, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(isDebug.onWarmupCompleted onwarmupcompleted, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onwarmupcompleted, function1, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Unit unitOnWarmupCompleted;
        getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted = (getScreenOrientationThroughResourcesFirst.onWarmupCompleted) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, jLongValue, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i3 = 52 / 0;
        } else {
            unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, jLongValue, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = (~i) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~(i7 | (~i5) | i)) | (~(i8 | i5)) | (~(i3 | i5 | i));
        int i12 = (~(i | i3)) | i5 | i9;
        int i13 = i3 + i5 + i4 + (5090439 * i6) + ((-1076018391) * i2);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i3) - 1475346432) + (1088368604 * i5) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i4) + (1616379904 * i6) + ((-1222115328) * i2) + (1028194304 * i14);
        int i16 = (i3 * (-1092730454)) + 799718796 + (i5 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i4 * (-1092730761)) + (i6 * 1582232257) + (i2 * 741505039) + (i14 * (-1125187584));
        switch (i15 + (i16 * i16 * (-410583040))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return getInterfaceDescriptor(objArr);
            case 11:
                return access000(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static final Unit onWarmupCompleted(CashflowSelectTransactionsViewModel cashflowSelectTransactionsViewModel, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(cashflowSelectTransactionsViewModel, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, Function0 function0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {th, function0, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1332797070, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1332797073, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent((Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(onwarmupcompleted, z, z2, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, z, z2, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(isDebug.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(onwarmupcompleted, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, (Function0<Unit>) function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(ICustomTabsCallback_Parcel iCustomTabsCallback_Parcel) {
        int i = 2 % 2;
        if (iCustomTabsCallback_Parcel != null) {
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iCustomTabsCallback_Parcel.onExtraCallbackWithResult();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent(Object obj) {
            super(0, obj, CashflowSelectTransactionsViewModel.class, "retry", "retry()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult();
                throw null;
            }
            ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult();
            int i3 = onExtraCallback + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallbackWithResult(Object obj) {
            super(0, obj, CashflowSelectTransactionsViewModel.class, "trackScreen", "trackScreen()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).onExtraCallback();
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<String, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallback(Object obj) {
            super(1, obj, CashflowSelectTransactionsViewModel.class, "toggleSelection", "toggleSelection(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((String) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
            int i4 = IAuthTabCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        onExtraCallback(Object obj) {
            super(0, obj, CashflowSelectTransactionsViewModel.class, "save", "save()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 95 / 0;
            }
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((CashflowSelectTransactionsViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
            int i3 = onExtraCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[PHI: r1
      0x004f: PHI (r1v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable CashflowSelectTransactionsViewModel cashflowSelectTransactionsViewModel, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        int i5;
        ICustomTabsCallback_Parcel onBackPressedDispatcher;
        CashflowSelectTransactionsViewModel cashflowSelectTransactionsViewModel2 = cashflowSelectTransactionsViewModel;
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-529219018);
            if ((i & 33) != 0) {
                i4 = i;
            } else if ((i2 & 1) == 0) {
                int i8 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 9 / 0;
                    i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2)) {
                }
                i4 = i3 | i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-529219018);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 3) != 2, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || !(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage())) {
                if ((i2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    i5 = 1;
                    cashflowSelectTransactionsViewModel2 = (CashflowSelectTransactionsViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(CashflowSelectTransactionsViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i4 &= -15;
                }
                i5 = 1;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 1) != 0) {
                    i5 = 1;
                    i4 &= -15;
                }
                i5 = 1;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-529219018, i4, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectTransactionsScreen (CashflowSelectTransactionsScreen.kt:63)");
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) CashflowSelectTransactionsViewModel.onNavigationEvent(new Object[]{cashflowSelectTransactionsViewModel2}, -225180591, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), 225180594, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
            isEngagementSignalsApiAvailable isengagementsignalsapiavailableOnWarmupCompleted = ICustomTabsServiceStub.onNavigationEvent.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ICustomTabsServiceStub.IAuthTabCallback);
            Object obj = null;
            if (isengagementsignalsapiavailableOnWarmupCompleted != null) {
                onBackPressedDispatcher = isengagementsignalsapiavailableOnWarmupCompleted.getOnBackPressedDispatcher();
            } else {
                int i10 = onExtraCallbackWithResult + 41;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                onBackPressedDispatcher = null;
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onBackPressedDispatcher);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((zOnExtraCallback ? 1 : 0) ^ i5) != 0) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda2(onBackPressedDispatcher);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda2);
                    obj2 = externalSyntheticLambda2;
                }
                Function0 function0 = (Function0) obj2;
                isDebug.onExtraCallbackWithResult onextracallbackwithresult = (isDebug) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -838334048, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 838334052, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback});
                if (onextracallbackwithresult instanceof isDebug.IAuthTabCallback) {
                    int i12 = IAuthTabCallback + 99;
                    onExtraCallbackWithResult = i12 % 128;
                    if (i12 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1773322560);
                        onNavigationEvent((Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1773322560);
                        onNavigationEvent((Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                } else if (onextracallbackwithresult instanceof isDebug.onExtraCallbackWithResult) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1773319365);
                    Throwable thOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new onNavigationEvent(cashflowSelectTransactionsViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1135441210, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1135441200, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{thOnExtraCallbackWithResult, function0, (access5300) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0});
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (!(onextracallbackwithresult instanceof isDebug.onWarmupCompleted)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1773324475);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    int i13 = IAuthTabCallback + 49;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(861867665);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(861867665);
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new onExtraCallbackWithResult(cashflowSelectTransactionsViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    RealImageLoaderKt.IAuthTabCallback(new Object[]{(access5300) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                    isDebug.onWarmupCompleted onwarmupcompleted = (isDebug.onWarmupCompleted) onextracallbackwithresult;
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback4 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new IAuthTabCallback(cashflowSelectTransactionsViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    Function1 function1 = (access5300) objOnMinimized4;
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectTransactionsViewModel2);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback5 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new onExtraCallback(cashflowSelectTransactionsViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    onWarmupCompleted(onwarmupcompleted, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, (Function0<Unit>) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda3(cashflowSelectTransactionsViewModel2, i, i2));
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int $focusedTransactionScrollOffset;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ isDebug.onWarmupCompleted $state;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isDebug.onWarmupCompleted onwarmupcompleted, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = onwarmupcompleted;
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$focusedTransactionScrollOffset = i;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$listState, this.$focusedTransactionScrollOffset, access13800Var);
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                String strOnExtraCallbackWithResult = this.$state.onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                    return Unit.INSTANCE;
                }
                Object[] objArr = {this.$state.IAuthTabCallback(), strOnExtraCallbackWithResult};
                Integer num = (Integer) collection2String.onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 672797272, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -672797267, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
                if (num == null) {
                    return Unit.INSTANCE;
                }
                int i5 = onExtraCallback + 87;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int iIntValue = num.intValue();
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                int i7 = -this.$focusedTransactionScrollOffset;
                this.L$0 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                this.I$0 = iIntValue;
                this.label = 1;
                if (camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback(iIntValue, i7, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(isDebug.onWarmupCompleted onwarmupcompleted, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1512200572, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous> (CashflowSelectTransactionsScreen.kt:107)");
                int i4 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
            onExtraCallback(onNavigationEvent(onwarmupcompleted.onWarmupCompleted()), (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(isDebug.onWarmupCompleted onwarmupcompleted, Context context, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        String strOnExtraCallback;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i7 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i7 % 128;
                i3 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i8 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1664742541, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous>.<anonymous> (CashflowSelectTransactionsScreen.kt:116)");
                int i12 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
            }
            int iOnExtraCallback = onwarmupcompleted.onExtraCallback();
            if (iOnExtraCallback == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2089750837);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(onExtraCallback(onwarmupcompleted.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (iOnExtraCallback != 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2089759525);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                strOnExtraCallback = ComputeExpression.IAuthTabCallback.onNavigationEvent(context, onWarmupCompleted(onwarmupcompleted.onWarmupCompleted()), new Pair[]{getWrite.IAuthTabCallback("count", Integer.valueOf(onwarmupcompleted.onExtraCallback()))});
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2089756539);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(((Integer) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 363737565, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -363737554, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{onwarmupcompleted.onWarmupCompleted()})).intValue(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Block, onwarmupcompleted.onExtraCallback() > 0 && !onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(isDebug.onWarmupCompleted onwarmupcompleted, Context context, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 103;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i8 % 128;
            Object obj = null;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 119;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(164067002, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous> (CashflowSelectTransactionsScreen.kt:113)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(164067002, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous> (CashflowSelectTransactionsScreen.kt:113)");
            }
            u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion), (u2) null, ForwardingCameraControl.onExtraCallback(1664742541, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda16(onwarmupcompleted, context, function0), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getScreenOrientationThroughResourcesFirst.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i2 & 129) != 128) {
            z = true;
        } else {
            int i4 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(893381918, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectTransactionsScreen.kt:148)");
            }
            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            LocalDate localDateOnExtraCallback = iAuthTabCallback.onExtraCallback();
            Locale localeOnExtraCallbackWithResult = PageExitListener.onExtraCallbackWithResult(resources);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(localDateOnExtraCallback);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(localeOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = RVTraceUtils.IAuthTabCallback.onWarmupCompleted(resources, iAuthTabCallback.onExtraCallback());
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i6 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
            w2.IAuthTabCallback(1724574124, new Object[]{(String) objOnMinimized, verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), wa.IAuthTabCallback.Companion.onNavigationEvent(), wa.onTransact.Companion.onNavigationEvent(), Float.valueOf(0.0f), null, null, wa.IAuthTabCallbackStub.Companion.onExtraCallbackWithResult(), null, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, 12586368, 0, 8048}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    static final class IAuthTabCallbackStub implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ getScreenOrientationThroughResourcesFirst.onWarmupCompleted IAuthTabCallback;
        final /* synthetic */ Function1<String, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(Function1<? super String, Unit> function1, getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted) {
            this.onWarmupCompleted = function1;
            this.IAuthTabCallback = onwarmupcompleted;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.invoke(this.IAuthTabCallback.onWarmupCompleted());
                int i3 = 42 / 0;
            } else {
                this.onWarmupCompleted.invoke(this.IAuthTabCallback.onWarmupCompleted());
            }
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class asInterface implements Function1 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final asInterface onWarmupCompleted = new asInterface();

        static {
            int i = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final Void onExtraCallback(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Void voidOnExtraCallback = onExtraCallback(obj);
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            return voidOnExtraCallback;
        }
    }

    public static final class asBinder implements Function1<Integer, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallback;

        public asBinder(Function1 function1, List list) {
            this.onExtraCallback = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIntValue = ((Number) obj).intValue();
            if (i3 != 0) {
                return onNavigationEvent(iIntValue);
            }
            onNavigationEvent(iIntValue);
            throw null;
        }

        public final Object onNavigationEvent(int i) {
            Object objInvoke;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 3;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                objInvoke = this.onExtraCallback.invoke(this.IAuthTabCallback.get(i));
                int i4 = 50 / 0;
            } else {
                objInvoke = this.onExtraCallback.invoke(this.IAuthTabCallback.get(i));
            }
            int i5 = onWarmupCompleted + 117;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvoke;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(isDebug.onWarmupCompleted onwarmupcompleted, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        for (getScreenOrientationThroughResourcesFirst.IAuthTabCallback iAuthTabCallback : onwarmupcompleted.IAuthTabCallback()) {
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(893381918, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda17(iAuthTabCallback)), 3, (Object) null);
            List listOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(listOnNavigationEvent.size(), (Function1) null, new asBinder(asInterface.onWarmupCompleted, listOnNavigationEvent), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new IAuthTabCallbackDefault(listOnNavigationEvent, onwarmupcompleted, function1)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Object obj;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        isDebug.onWarmupCompleted onwarmupcompleted = (isDebug.onWarmupCompleted) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[3];
        int i = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 6) == 0) {
                int i4 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 66 / 0;
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                        i = 2;
                    }
                    iIntValue |= i;
                    int i6 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                    }
                    iIntValue |= i;
                    int i62 = IAuthTabCallback + 119;
                    onExtraCallbackWithResult = i62 % 128;
                    int i72 = i62 % 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((iIntValue & 19) == 18), iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-342653079, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent.<anonymous> (CashflowSelectTransactionsScreen.kt:140)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnExtraCallback | zOnNavigationEvent))) {
                CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda15(onwarmupcompleted, function1);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                obj = externalSyntheticLambda15;
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(isDebug.onWarmupCompleted onwarmupcompleted, Function0<Unit> function0, Function1<? super String, Unit> function1, Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(836808528);
        if ((i & 6) == 0) {
            int i8 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i12 = onExtraCallbackWithResult;
                int i13 = i12 + 63;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                int i15 = i12 + 101;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                i3 = 2048;
            } else {
                int i17 = onExtraCallbackWithResult + 59;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(836808528, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsContent (CashflowSelectTransactionsScreen.kt:93)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
            int iOnExtraCallbackWithResult = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f));
            String strOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            List listIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallbackWithResult);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent | zOnExtraCallback2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    onWarmupCompleted onwarmupcompleted2 = new onWarmupCompleted(onwarmupcompleted, camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, iOnExtraCallbackWithResult, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onwarmupcompleted2);
                    obj = onwarmupcompleted2;
                }
                isZslDisabledByByUserCaseConfig.IAuthTabCallback(strOnExtraCallbackWithResult, listIAuthTabCallback, Integer.valueOf(iOnExtraCallbackWithResult), (Function2) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(1512200572, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda5(onwarmupcompleted, function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, ForwardingCameraControl.onExtraCallback(164067002, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda6(onwarmupcompleted, context, function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-342653079, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda7(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, onwarmupcompleted, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 24960, 48, 2027}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda8(onwarmupcompleted, function0, function1, function02, i));
        }
    }

    public static final class IAuthTabCallbackDefault implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function1 IAuthTabCallback;
        final /* synthetic */ isDebug.onWarmupCompleted onExtraCallbackWithResult;
        final /* synthetic */ List onNavigationEvent;

        public IAuthTabCallbackDefault(List list, isDebug.onWarmupCompleted onwarmupcompleted, Function1 function1) {
            this.onNavigationEvent = list;
            this.onExtraCallbackWithResult = onwarmupcompleted;
            this.IAuthTabCallback = function1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            Number number = (Number) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                unit = Unit.INSTANCE;
                int i3 = 1 / 0;
            } else {
                onExtraCallbackWithResult(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                unit = Unit.INSTANCE;
            }
            int i4 = onExtraCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            boolean z = false;
            if ((i2 & 6) == 0) {
                int i7 = onWarmupCompleted + 23;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 16 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ^ true ? 2 : 4;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                }
                i3 = i5 | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i9 = onExtraCallback + 59;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                int i11 = onExtraCallback + 27;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted = (getScreenOrientationThroughResourcesFirst.onWarmupCompleted) this.onNavigationEvent.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-926056129);
            boolean zContains = this.onExtraCallbackWithResult.asInterface().contains(onwarmupcompleted.onWarmupCompleted());
            boolean zOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent();
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.IAuthTabCallback);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent2 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallbackStub(this.IAuthTabCallback, onwarmupcompleted);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            collection2String.onExtraCallback(onwarmupcompleted, zContains, !zOnNavigationEvent, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i;
        int iIntValue = ((Number) objArr[0]).intValue();
        y1a y1aVar = (y1a) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((iIntValue2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i3 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue2 |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            int i5 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(622837782, iIntValue2, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsTopBar.<anonymous>.<anonymous> (CashflowSelectTransactionsScreen.kt:190)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, 0), null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue2 << 15) & 458752), 30}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(int i, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1685809456);
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                int i6 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i6 % 128;
                i4 = i6 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i7 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 1 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1685809456, i3, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsTopBar (CashflowSelectTransactionsScreen.kt:180)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = YuvImageOnePixelShiftQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null));
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    int i9 = IAuthTabCallback + 65;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                MaxAdViewAdapterListener.onWarmupCompleted(function0, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14, 254);
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(622837782, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda21(i), cameraCaptureResultEmptyCameraCaptureResult2, 54), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 438, 0, 16376);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = YuvImageOnePixelShiftQuirk.onWarmupCompleted(verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null));
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted3);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                MaxAdViewAdapterListener.onWarmupCompleted(function0, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 3) & 14, 254);
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(622837782, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda21(i), cameraCaptureResultEmptyCameraCaptureResult2, 54), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null), y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 438, 0, 16376);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda22(i, function0, i2));
        }
    }

    private static final Integer onNavigationEvent(List<getScreenOrientationThroughResourcesFirst.IAuthTabCallback> list, String str) {
        int i = 2 % 2;
        int size = 0;
        for (getScreenOrientationThroughResourcesFirst.IAuthTabCallback iAuthTabCallback : list) {
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = size + 1;
            Iterator it = iAuthTabCallback.onNavigationEvent().iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (Intrinsics.areEqual(((getScreenOrientationThroughResourcesFirst.onWarmupCompleted) it.next()).onWarmupCompleted(), str)) {
                    break;
                }
                int i6 = IAuthTabCallback + 115;
                int i7 = i6 % 128;
                onExtraCallbackWithResult = i7;
                i5 = i6 % 2 != 0 ? i5 + 107 : i5 + 1;
                int i8 = i7 + 39;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            if (i5 >= 0) {
                return Integer.valueOf(i4 + i5);
            }
            size = i4 + iAuthTabCallback.onNavigationEvent().size();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2 == 0 ? 2 : 4;
            i2 = i | i5;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(653215117, i2, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow.<anonymous> (CashflowSelectTransactionsScreen.kt:240)");
            }
            unRegisterClientChannel.IAuthTabCallback(w3bVar, onwarmupcompleted.onExtraCallback(), handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (String) null, true, cameraCaptureResultEmptyCameraCaptureResult, 12583296 | (i2 & 14), 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, long j, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-491161447, i, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow.<anonymous>.<anonymous> (CashflowSelectTransactionsScreen.kt:249)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(IpcClientKernelUtils1.onExtraCallbackWithResult(onwarmupcompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0), IpcClientKernelUtils1.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, onwarmupcompleted.onNavigationEvent()), (getHumanReadableName) null, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 196596);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(IpcClientKernelUtils1.onExtraCallbackWithResult(onwarmupcompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0), IpcClientKernelUtils1.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, onwarmupcompleted.onNavigationEvent()), (getHumanReadableName) null, j, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 196596);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(TextContentDto textContentDto, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 110) != 38) {
                z = true;
            } else {
                int i4 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(746140806, i, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow.<anonymous>.<anonymous>.<anonymous> (CashflowSelectTransactionsScreen.kt:258)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(IpcClientKernelUtils1.onExtraCallbackWithResult(textContentDto, cameraCaptureResultEmptyCameraCaptureResult, 0), IpcClientKernelUtils1.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, textContentDto), (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized(), 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262132);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, long j, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        getBacktraceNote getbacktracenoteOnExtraCallback = null;
        if ((i & 6) == 0) {
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                getbacktracenoteOnExtraCallback.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1115180607, i, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow.<anonymous> (CashflowSelectTransactionsScreen.kt:247)");
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-491161447, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda13(onwarmupcompleted, j), cameraCaptureResultEmptyCameraCaptureResult, 54);
            TextContentDto textContentDtoIAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallbackStub();
            if (textContentDtoIAuthTabCallbackStub == null) {
                int i4 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-773000528);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    getbacktracenoteOnExtraCallback.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-773000528);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-773000527);
                getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(746140806, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda14(textContentDtoIAuthTabCallbackStub), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            w5aVar.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, getbacktracenoteOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(boolean z, boolean z2, Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 55) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 55;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i2 & 1)) {
            int i10 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 30 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-409523887, i2, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow.<anonymous> (CashflowSelectTransactionsScreen.kt:268)");
                }
                setClickTrackingUrls.IAuthTabCallback iAuthTabCallback = setClickTrackingUrls.IAuthTabCallback.Fill;
                setClickTrackingUrls.onNavigationEvent onnavigationevent = setClickTrackingUrls.onNavigationEvent.Medium;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda4(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                rightPreset.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback, onnavigationevent, z2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, (3670016 & (i2 << 18)) | 3456, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                setClickTrackingUrls.IAuthTabCallback iAuthTabCallback2 = setClickTrackingUrls.IAuthTabCallback.Fill;
                setClickTrackingUrls.onNavigationEvent onnavigationevent2 = setClickTrackingUrls.onNavigationEvent.Medium;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    objOnMinimized = new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda4(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    rightPreset.onWarmupCompleted(z, (QuirksExternalSyntheticBackport0) null, iAuthTabCallback2, onnavigationevent2, z2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, (3670016 & (i2 << 18)) | 3456, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, boolean z, boolean z2, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1752961604);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i8 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i8 % 128;
                i4 = i8 % 2 == 0 ? 84 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i9 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            int i11 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1752961604, i2, -1, "im.toss.features.home.feature.cashflow.screen.TransactionRow (CashflowSelectTransactionsScreen.kt:216)");
            }
            long jOnExtraCallbackWithResult = getHash.onExtraCallbackWithResult(onwarmupcompleted.onExtraCallbackWithResult(), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
            String strIAuthTabCallback = isValidUrl.IAuthTabCallback(new String[]{(String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{onwarmupcompleted.onNavigationEvent()}), (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{onwarmupcompleted.IAuthTabCallbackStub()}), (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{onwarmupcompleted.onTransact()})});
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(z ? R$string.home_v2_feature_cashflow_accessibility_selected : R$string.home_v2_feature_cashflow_accessibility_not_selected, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Role roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onNavigationEvent());
            if (!z2) {
                function02 = null;
            } else {
                int i13 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                function02 = function0;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = isValidUrl.onExtraCallback(onextracallback, strIAuthTabCallback, roleIAuthTabCallback, strOnExtraCallback, Boolean.valueOf(z), (String) null, function02, (List) null, 80, (Object) null);
            getViewTypeCount.onTransact ontransactOnWarmupCompleted = getViewTypeCount.onTransact.Companion.onWarmupCompleted();
            if (z2) {
                int i15 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                function03 = function0;
            } else {
                function03 = null;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1115180607, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda9(onwarmupcompleted, jOnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport0OnExtraCallback, ForwardingCameraControl.onExtraCallback(653215117, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda10(onwarmupcompleted), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-409523887, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda11(z, z2, function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnWarmupCompleted, (String) null, function03, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 196998, 384, 110552);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda12(onwarmupcompleted, z, z2, function0, i));
        }
    }

    private static final Unit onWarmupCompleted(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1785260217, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsLoading.<anonymous> (CashflowSelectTransactionsScreen.kt:283)");
            }
            MaxAdViewAdapterListener.onWarmupCompleted(function0, YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 252);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1021016947);
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 8 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1021016947, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsLoading (CashflowSelectTransactionsScreen.kt:281)");
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(1785260217, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda0(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, isEqualsIgnoreCase.onExtraCallback.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult2, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(1785260217, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda0(function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, isEqualsIgnoreCase.onExtraCallback.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult2, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda1(function0, i));
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int i;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function0 function0;
        Function0 function02;
        Throwable th;
        int i3;
        Throwable th2 = (Throwable) objArr[0];
        Function0 function03 = (Function0) objArr[1];
        Function0 function04 = (Function0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1572096999);
        if ((iIntValue & 6) == 0) {
            int i7 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(th2);
                throw null;
            }
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(th2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                int i8 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i |= i3;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 256 : 128;
        }
        if ((i & 147) != 146) {
            int i10 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i12 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i12 % 128;
                if (i12 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1572096999, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsError (CashflowSelectTransactionsScreen.kt:298)");
                    int i13 = 2 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1572096999, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsError (CashflowSelectTransactionsScreen.kt:298)");
                }
                int i14 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function0 = function04;
            function02 = function03;
            th = th2;
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(1745347909, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda18(function03), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(691021682, true, new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda19(th2, function04), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function0 = function04;
            function02 = function03;
            th = th2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectTransactionsScreenKt$.ExternalSyntheticLambda20(th, function02, function0, i2));
        }
        return null;
    }

    private static final Unit onExtraCallback(Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1745347909, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsError.<anonymous> (CashflowSelectTransactionsScreen.kt:300)");
            }
            MaxAdViewAdapterListener.onWarmupCompleted(function0, YuvImageOnePixelShiftQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion), (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 252);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i2 = onExtraCallbackWithResult + 51;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i2 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i2 % 128;
        int i6 = i2 % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 109) == 0) {
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i3 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(691021682, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.SelectTransactionsError.<anonymous> (CashflowSelectTransactionsScreen.kt:302)");
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(YuvImageOnePixelShiftQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null)), deviceQuirksExternalSyntheticLambda0);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_error_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String message = th.getMessage();
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, strOnExtraCallback, (deprecated_followRedirects) null, message == null ? Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName() : message, function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_retry, cameraCaptureResultEmptyCameraCaptureResult, 0), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, cameraCaptureResultEmptyCameraCaptureResult, 0, 54, 94);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final int onNavigationEvent(setNavigationBarVisibility setnavigationbarvisibility) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i = onTransact.onWarmupCompleted[setnavigationbarvisibility.ordinal()]) != 1 : (i = onTransact.onWarmupCompleted[setnavigationbarvisibility.ordinal()]) != 0) {
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0 ? i != 2 : i != 4) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return R$string.home_v2_feature_cashflow_select_transactions_title_dutch;
            }
        }
        int i5 = R$string.home_v2_feature_cashflow_select_transactions_title_hide;
        int i6 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final int onExtraCallback(setNavigationBarVisibility setnavigationbarvisibility) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onTransact.onWarmupCompleted[setnavigationbarvisibility.ordinal()];
        if (i4 != 1) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 113;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0 ? i4 != 2 : i4 != 3) {
                int i7 = i5 + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return R$string.home_v2_feature_cashflow_select_transactions_cta_dutch_empty;
            }
        }
        int i9 = R$string.home_v2_feature_cashflow_select_transactions_cta_hide_empty;
        int i10 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final int onWarmupCompleted(setNavigationBarVisibility setnavigationbarvisibility) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact.onWarmupCompleted[setnavigationbarvisibility.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return R$string.home_v2_feature_cashflow_select_transactions_cta_hide_count;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i4 + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            i = R$string.home_v2_feature_cashflow_select_transactions_cta_dutch_count;
            int i8 = 36 / 0;
        } else {
            i = R$string.home_v2_feature_cashflow_select_transactions_cta_dutch_count;
        }
        int i9 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 74 / 0;
        }
        return i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onTransact.onWarmupCompleted[((setNavigationBarVisibility) objArr[0]).ordinal()];
        if (i2 == 1 || i2 == 2) {
            return Integer.valueOf(R$string.home_v2_feature_cashflow_select_transactions_cta_hide_count_one);
        }
        int i3 = IAuthTabCallback + 105;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i4 + 43;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return Integer.valueOf(R$string.home_v2_feature_cashflow_select_transactions_cta_dutch_count_one);
        }
        int i7 = R$string.home_v2_feature_cashflow_select_transactions_cta_dutch_count_one;
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        isDebug isdebug = (isDebug) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return isdebug;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(isDebug.onWarmupCompleted onwarmupcompleted, Context context, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onwarmupcompleted, context, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 759955232, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -759955225, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(getScreenOrientationThroughResourcesFirst.onWarmupCompleted onwarmupcompleted, long j, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onwarmupcompleted, Long.valueOf(j), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 89625959, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -89625953, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(isDebug.onWarmupCompleted onwarmupcompleted, Function0 function0, Function1 function1, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {onwarmupcompleted, function0, function1, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 2044797846, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -2044797838, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final isDebug onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends isDebug> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (isDebug) onWarmupCompleted(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -838334048, iOnWarmupCompleted2, 838334052, iOnWarmupCompleted3, new Object[]{cameraPresenceProviderExternalSyntheticLambda6});
    }

    private static final Unit onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, isDebug.onWarmupCompleted onwarmupcompleted, Function1 function1, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {camera2CameraMetadataExternalSyntheticLambda1, onwarmupcompleted, function1, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -77133588, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 77133589, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final void onExtraCallbackWithResult(Throwable th, Function0<Unit> function0, Function0<Unit> function02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {th, function0, function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1135441210, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1135441200, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final Unit onNavigationEvent(Throwable th, Function0 function0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {th, function0, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1332797070, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1332797073, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final Unit onWarmupCompleted(Throwable th, Function0 function0, Function0 function02, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {th, function0, function02, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -909841563, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 909841563, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final Unit onExtraCallback(int i, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1611180843, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1611180852, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    private static final Unit onExtraCallbackWithResult(int i, Function0 function0, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Integer.valueOf(i), function0, Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1095020957, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1095020955, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    public static final /* synthetic */ Integer IAuthTabCallback(List list, String str) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Integer) onWarmupCompleted(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 672797272, iOnWarmupCompleted2, -672797267, iOnWarmupCompleted3, new Object[]{list, str});
    }

    private static final int onExtraCallbackWithResult(setNavigationBarVisibility setnavigationbarvisibility) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return ((Integer) onWarmupCompleted(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 363737565, iOnWarmupCompleted2, -363737554, iOnWarmupCompleted3, new Object[]{setnavigationbarvisibility})).intValue();
    }
}
