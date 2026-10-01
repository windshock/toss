package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import com.iap.ac.config.lite.preset.PresetParser;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.core.model.dst.widget.TextContentDto;
import im.toss.features.home.feature.cashflow.CashflowAnalysisViewModel;
import im.toss.features.home.feature.cashflow.R$string;
import im.toss.features.home.feature.cashflow.screen.CashflowAnalysisScreenKt$;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.CheckMask;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GeckoHubImp;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getJSONArray;
import o.getPrivacyDestinationUri;
import o.remoteCall;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.x2ExternalSyntheticLambda25;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class logDebugReflect {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | i2;
        int i9 = ~i2;
        int i10 = ~(i9 | i3 | i6);
        int i11 = i3 | (~(i6 | i9)) | (~(i7 | i2));
        int i12 = i3 + i2 + i4 + ((-381402339) * i5) + ((-2062754392) * i);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i3) + 1063714816 + (1288888451 * i2) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i4) + (1454768128 * i5) + (808452096 * i) + ((-1790509056) * i13);
        int i15 = (((-1355236691) * i3) - 921838429) + (i2 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + ((-1355236397) * i4) + ((-1583251481) * i5) + (1682205048 * i) + (i13 * (-427491328));
        boolean z = false;
        switch (i14 + (i15 * i15 * 844169216)) {
            case 1:
                Context context = (Context) objArr[0];
                Resources resources = (Resources) objArr[1];
                YearMonth yearMonth = (YearMonth) objArr[2];
                List list = (List) objArr[3];
                Function1 function1 = (Function1) objArr[4];
                int i16 = 2 % 2;
                BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(context).onExtraCallback(R$string.home_v2_feature_cashflow_select_month).onWarmupCompleted(false).onExtraCallback(true);
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int i17 = onExtraCallbackWithResult + 117;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    String string = ((YearMonth) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    arrayList.add(isRemoteExtension.onNavigationEvent(string, CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult(), CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult(), resources));
                    int i19 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                }
                ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(new Object[]{iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(arrayList).onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda0(function1, list)).IAuthTabCallback(list.indexOf(yearMonth))}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -846891035, 846891035, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).show();
                return null;
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                CashflowAnalysisViewModel cashflowAnalysisViewModel = (CashflowAnalysisViewModel) objArr[0];
                Function1 function12 = (Function1) objArr[1];
                remoteCall.onNavigationEvent onnavigationevent = (remoteCall.onNavigationEvent) objArr[2];
                remoteCall.onNavigationEvent.IAuthTabCallback iAuthTabCallback = (remoteCall.onNavigationEvent.IAuthTabCallback) objArr[3];
                String str = (String) objArr[4];
                int i21 = 2 % 2;
                int i22 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                Intrinsics.checkNotNullParameter(str, "");
                cashflowAnalysisViewModel.onExtraCallback(onnavigationevent, iAuthTabCallback);
                function12.invoke(str);
                Unit unit = Unit.INSTANCE;
                int i24 = onWarmupCompleted + 119;
                onExtraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                return unit;
            case 5:
                Throwable th = (Throwable) objArr[0];
                Function0 function0 = (Function0) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                ((Number) objArr[4]).intValue();
                int i26 = 2 % 2;
                int i27 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i27 % 128;
                int i28 = i27 % 2;
                onExtraCallback(th, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
                Unit unit2 = Unit.INSTANCE;
                int i29 = onExtraCallbackWithResult + 117;
                onWarmupCompleted = i29 % 128;
                int i30 = i29 % 2;
                return unit2;
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return onWarmupCompleted(objArr);
            case 8:
                List list3 = (List) objArr[0];
                getJSONArray.onNavigationEvent onnavigationevent2 = (getJSONArray.onNavigationEvent) objArr[1];
                Function0 function02 = (Function0) objArr[2];
                Function0 function03 = (Function0) objArr[3];
                Context context2 = (Context) objArr[4];
                Resources resources2 = (Resources) objArr[5];
                List list4 = (List) objArr[6];
                Function1 function13 = (Function1) objArr[7];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
                int iIntValue2 = ((Number) objArr[9]).intValue();
                int i31 = 2 % 2;
                if ((iIntValue2 & 3) != 2) {
                    int i32 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i32 % 128;
                    int i33 = i32 % 2;
                    z = true;
                } else {
                    int i34 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i34 % 128;
                    int i35 = i34 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    int i36 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i36 % 128;
                    int i37 = i36 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1584362743, iIntValue2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous> (CashflowAnalysisScreen.kt:123)");
                    }
                    ByteArrayPoolsByteArray127Pool.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1834474070, true, new CashflowAnalysisScreenKt$.ExternalSyntheticLambda21(list3, onnavigationevent2, function02, function03, context2, resources2, list4, function13), cameraCaptureResultEmptyCameraCaptureResult2, 54), FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), isEquals.onExtraCallback.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResult2, 3504, 1);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i38 = onWarmupCompleted + 83;
                        onExtraCallbackWithResult = i38 % 128;
                        int i39 = i38 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                Throwable th2 = (Throwable) objArr[0];
                Function0 function04 = (Function0) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue4 = ((Number) objArr[4]).intValue();
                int i40 = 2 % 2;
                int i41 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i41 % 128;
                int i42 = i41 % 2;
                Unit unit3 = (Unit) IAuthTabCallback(new Object[]{th2, function04, Integer.valueOf(iIntValue3), cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(iIntValue4)}, zziea.IAuthTabCallback(), 1133687268, -1133687263, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
                int i43 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i43 % 128;
                int i44 = i43 % 2;
                return unit3;
            case 11:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onNavigationEvent onnavigationevent, remoteCall.onNavigationEvent.IAuthTabCallback iAuthTabCallback, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(new Object[]{cashflowAnalysisViewModel, function1, onnavigationevent, iAuthTabCallback, str}, zziea.IAuthTabCallback(), -23022505, 23022509, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
            int i3 = 55 / 0;
        } else {
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(new Object[]{cashflowAnalysisViewModel, function1, onnavigationevent, iAuthTabCallback, str}, zziea.IAuthTabCallback(), -23022505, 23022509, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback2);
        }
        int i4 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, remoteCall remotecall, remoteCall.onWarmupCompleted.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function2, remotecall, onwarmupcompleted);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, remotecall, onwarmupcompleted);
        int i3 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function2 function2, getBacktraceNote getbacktracenote, Function1 function14, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(onnavigationevent, function0, function02, function1, function12, function13, function2, getbacktracenote, function14, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, function0, function02, function1, function12, function13, function2, getbacktracenote, function14, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {onnavigationevent, function1, function12, function2, getbacktracenote, function13, audioRestrictionControllerImplExternalSyntheticLambda0};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), -1650778072, 1650778075, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
            int i3 = 68 / 0;
        } else {
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            unit = (Unit) IAuthTabCallback(new Object[]{onnavigationevent, function1, function12, function2, getbacktracenote, function13, audioRestrictionControllerImplExternalSyntheticLambda0}, zziea.IAuthTabCallback(), -1650778072, 1650778075, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback2);
        }
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(remoteCall.onWarmupCompleted onwarmupcompleted, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onwarmupcompleted, onnavigationevent, function1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Context context = (Context) objArr[0];
        Resources resources = (Resources) objArr[1];
        getJSONArray.onNavigationEvent onnavigationevent = (getJSONArray.onNavigationEvent) objArr[2];
        List list = (List) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(context, resources, onnavigationevent, list, function1);
        }
        onExtraCallbackWithResult(context, resources, onnavigationevent, list, function1);
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(str);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str);
        int i3 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, Function1 function12, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(cashflowAnalysisViewModel, (Function1<? super String, Unit>) function1, (Function1<? super String, Unit>) function12, (Function1<? super String, Unit>) function13, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) IAuthTabCallback(new Object[]{list, onnavigationevent, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zziea.IAuthTabCallback(), 665222973, -665222965, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        }
        int i4 = 77 / 0;
        return (Unit) IAuthTabCallback(new Object[]{list, onnavigationevent, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zziea.IAuthTabCallback(), 665222973, -665222965, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1, onnavigationevent, function1, function12, function2, getbacktracenote, function13, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zziea.IAuthTabCallback(), 417462403, -417462401, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        int i4 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, remoteCall remotecall, remoteCall.onNavigationEvent.IAuthTabCallback iAuthTabCallback, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, remotecall, iAuthTabCallback, str);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function2 function2, getBacktraceNote getbacktracenote, Function1 function14, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(onnavigationevent, function0, function02, function1, function12, function13, function2, getbacktracenote, function14, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(remoteCall remotecall, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(remotecall, onnavigationevent, function1, function12, function2, getbacktracenote, function13, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 88 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final /* synthetic */ void onExtraCallback(remoteCall remotecall, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(remotecall, onnavigationevent, function1, function12, function2, getbacktracenote, function13, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ YearMonth onExtraCallbackWithResult(YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        YearMonth yearMonthOnExtraCallback = onExtraCallback(yearMonth);
        int i4 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return yearMonthOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onExtraCallbackWithResult(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, Function1 function12, Function1 function13, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallback(cashflowAnalysisViewModel, function1, function12, function13, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(cashflowAnalysisViewModel, function1, function12, function13, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(str);
        }
        onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, list, i);
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, remoteCall remotecall) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function1, remotecall);
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(remoteCall remotecall, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        onNavigationEvent(remotecall, onnavigationevent, function1, function12, function2, getbacktracenote, function13, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onNavigationEvent(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(rVClientStarter, yearMonth);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onWarmupCompleted(remoteCall remotecall) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(remotecall);
        }
        onExtraCallback(remotecall);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        remoteCall remotecall = (remoteCall) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, remotecall);
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cashflowAnalysisViewModel, function1, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onWarmupCompleted onwarmupcompleted, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cashflowAnalysisViewModel, function1, onwarmupcompleted, str);
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(list, onnavigationevent, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        int i6 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, remoteCall.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, onwarmupcompleted);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallbackDefault(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallbackDefault extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        IAuthTabCallbackDefault(Object obj) {
            super(0, obj, CashflowAnalysisViewModel.class, "trackAnalysisScreen", "trackAnalysisScreen()V", 0);
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).IAuthTabCallbackDefault();
            if (i3 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        asBinder(Object obj) {
            super(0, obj, CashflowAnalysisViewModel.class, "refreshOnResume", "refreshOnResume()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 65;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 9 / 0;
            }
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onWarmupCompleted();
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        onTransact(Object obj) {
            super(0, obj, CashflowAnalysisViewModel.class, "retry", "retry()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onNavigationEvent();
                int i3 = 53 / 0;
            } else {
                ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onNavigationEvent();
            }
            int i4 = onWarmupCompleted + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class access100 extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        access100(Object obj) {
            super(0, obj, CashflowAnalysisViewModel.class, "prevYearMonth", "prevYearMonth()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 21 / 0;
            }
        }
    }

    static final /* synthetic */ class access000 extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        access000(Object obj) {
            super(0, obj, CashflowAnalysisViewModel.class, "nextYearMonth", "nextYearMonth()V", 0);
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                CashflowAnalysisViewModel.onNavigationEvent(new Object[]{(CashflowAnalysisViewModel) ((CallableReference) this).receiver}, -288377681, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 288377681, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CashflowAnalysisViewModel.onNavigationEvent(new Object[]{(CashflowAnalysisViewModel) ((CallableReference) this).receiver}, -288377681, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 288377681, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            int i3 = onWarmupCompleted + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final /* synthetic */ class IAuthTabCallback_Parcel extends FunctionReferenceImpl implements Function1<String, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback_Parcel(Object obj) {
            super(1, obj, CashflowAnalysisViewModel.class, "toggleCalendarExpanded", "toggleCalendarExpanded(Ljava/lang/String;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((String) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onWarmupCompleted(str);
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function1<YearMonth, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        asInterface(Object obj) {
            super(1, obj, CashflowAnalysisViewModel.class, "selectYearMonth", "selectYearMonth(Ljava/time/YearMonth;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((YearMonth) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(YearMonth yearMonth) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(yearMonth, "");
                ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onWarmupCompleted(yearMonth);
            } else {
                Intrinsics.checkNotNullParameter(yearMonth, "");
                ((CashflowAnalysisViewModel) ((CallableReference) this).receiver).onWarmupCompleted(yearMonth);
                int i3 = 80 / 0;
            }
        }
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function1<remoteCall, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        IAuthTabCallbackStub(Object obj) {
            super(1, obj, CashflowAnalysisViewModel.class, "trackSectionImpression", "trackSectionImpression(Lim/toss/features/home/core/model/cashflow/analysis/section/CashflowAnalysisSectionDto;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((remoteCall) obj);
            if (i3 == 0) {
                return Unit.INSTANCE;
            }
            int i4 = 98 / 0;
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(remoteCall remotecall) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(remotecall, "");
            CashflowAnalysisViewModel.onNavigationEvent(new Object[]{(CashflowAnalysisViewModel) ((CallableReference) this).receiver, remotecall}, 1096052163, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1096052160, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onNavigationEvent(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onWarmupCompleted onwarmupcompleted, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(str, "");
            cashflowAnalysisViewModel.onExtraCallbackWithResult(onwarmupcompleted);
            function1.invoke(str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str, "");
        cashflowAnalysisViewModel.onExtraCallbackWithResult(onwarmupcompleted);
        function1.invoke(str);
        int i3 = 87 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        cashflowAnalysisViewModel.onWarmupCompleted(onextracallbackwithresult);
        function1.invoke(onextracallbackwithresult.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[PHI: r0
      0x0039: PHI (r0v9 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v10 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r0
      0x0026: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v10 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable CashflowAnalysisViewModel cashflowAnalysisViewModel, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function12, @Nullable Function1<? super String, Unit> function13, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        CashflowAnalysisViewModel cashflowAnalysisViewModel2;
        int i3;
        int i4;
        Function1<? super String, Unit> function14;
        int i5;
        Function1<? super String, Unit> function15;
        int i6;
        Function1<? super String, Unit> function16;
        int i7;
        int i8;
        Function1<? super String, Unit> function17;
        Function1<? super String, Unit> function18;
        Function1<? super String, Unit> function19;
        int i9;
        Function1<? super String, Unit> function110;
        Function1<? super String, Unit> function111;
        Function1<? super String, Unit> function112;
        Function1<? super String, Unit> function113;
        Function1<? super String, Unit> function114;
        Function1<? super String, Unit> function115;
        CashflowAnalysisViewModel cashflowAnalysisViewModel3;
        Function1<? super String, Unit> function116;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i10 = 2 % 2;
        int i11 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(414148914);
            if ((i & 68) == 0) {
                if ((i2 & 1) == 0) {
                    cashflowAnalysisViewModel2 = cashflowAnalysisViewModel;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2)) {
                        i3 = 4;
                    }
                    i4 = i3 | i;
                } else {
                    cashflowAnalysisViewModel2 = cashflowAnalysisViewModel;
                }
                i3 = 2;
                i4 = i3 | i;
            } else {
                cashflowAnalysisViewModel2 = cashflowAnalysisViewModel;
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(414148914);
            if ((i & 6) == 0) {
            }
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                function14 = function1;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 32 : 16;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i4 |= 384;
                function15 = function12;
            } else {
                function15 = function12;
                if ((i & 384) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15) ? 256 : 128;
                }
            }
            i6 = i2 & 8;
            if (i6 == 0) {
                i4 |= 3072;
                function16 = function13;
            } else {
                function16 = function13;
                if ((i & 3072) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function16)) {
                        int i13 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                cashflowAnalysisViewModel3 = cashflowAnalysisViewModel2;
                function115 = function16;
                function114 = function15;
                function116 = function14;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        int i15 = onExtraCallbackWithResult + 57;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 == 0) {
                            boolean z = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6;
                            throw null;
                        }
                        i8 = 0;
                        i4 &= -15;
                        cashflowAnalysisViewModel2 = (CashflowAnalysisViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(CashflowAnalysisViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    } else {
                        i8 = 0;
                        int i16 = onWarmupCompleted + 111;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    if (i12 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda1();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function17 = (Function1) objOnMinimized;
                    } else {
                        function17 = function1;
                    }
                    if (i5 != 0) {
                        int i18 = onWarmupCompleted + 95;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda2();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        function18 = (Function1) objOnMinimized2;
                    } else {
                        function18 = function12;
                    }
                    if (i6 != 0) {
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda3();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        i9 = i4;
                        function110 = function17;
                        function111 = function18;
                        function19 = (Function1) objOnMinimized3;
                    } else {
                        function19 = function13;
                        i9 = i4;
                        function110 = function17;
                        function111 = function18;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i4 &= -15;
                    }
                    i8 = 0;
                    function111 = function15;
                    i9 = i4;
                    function110 = function14;
                    function19 = function16;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(414148914, i9, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisScreen (CashflowAnalysisScreen.kt:67)");
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new IAuthTabCallbackDefault(cashflowAnalysisViewModel2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                RealImageLoaderKt.IAuthTabCallback(new Object[]{(access5300) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback2 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new asBinder(cashflowAnalysisViewModel2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                int i20 = i9;
                Function1<? super String, Unit> function117 = function19;
                disableEncrypt.onNavigationEvent(0L, (Function0) null, (access5300) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 0, 3);
                getJSONArray.IAuthTabCallback IAuthTabCallback2 = IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends getJSONArray>) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback((setRubIn) CashflowAnalysisViewModel.onNavigationEvent(new Object[]{cashflowAnalysisViewModel2}, 1635589843, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1635589839, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 7));
                if (IAuthTabCallback2 instanceof getJSONArray.onExtraCallbackWithResult) {
                    int i21 = onWarmupCompleted + 21;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1434836757);
                        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1434836757);
                        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                } else {
                    int i22 = i8;
                    if (IAuthTabCallback2 instanceof getJSONArray.IAuthTabCallback) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1434834487);
                        Throwable thOnExtraCallbackWithResult = IAuthTabCallback2.onExtraCallbackWithResult();
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnExtraCallback3 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized6 = new onTransact(cashflowAnalysisViewModel2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                        }
                        onExtraCallback(thOnExtraCallbackWithResult, (Function0<Unit>) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i22);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        if (!(IAuthTabCallback2 instanceof getJSONArray.onNavigationEvent)) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1434837891);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1434830426);
                        getJSONArray.onNavigationEvent onnavigationevent = (getJSONArray.onNavigationEvent) IAuthTabCallback2;
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnExtraCallback4) {
                            int i23 = onWarmupCompleted + 75;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized7 = new access100(cashflowAnalysisViewModel2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                            }
                            Function0 function0 = (access5300) objOnMinimized7;
                            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(!zOnExtraCallback5) || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized8 = new access000(cashflowAnalysisViewModel2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                            }
                            Function0 function02 = (access5300) objOnMinimized8;
                            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback6 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized9 = new IAuthTabCallback_Parcel(cashflowAnalysisViewModel2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                            }
                            Function1 function118 = (access5300) objOnMinimized9;
                            boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback7 || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized10 = new asInterface(cashflowAnalysisViewModel2);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                            }
                            Function1 function119 = (access5300) objOnMinimized10;
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnExtraCallback8) {
                                int i25 = onWarmupCompleted + 83;
                                onExtraCallbackWithResult = i25 % 128;
                                int i26 = i25 % 2;
                                if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized11 = new IAuthTabCallbackStub(cashflowAnalysisViewModel2);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                                }
                                Function1 function120 = (access5300) objOnMinimized11;
                                boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                                boolean z2 = (i20 & 7168) == 2048;
                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(z2 | zOnExtraCallback9)) {
                                    Object obj = objOnMinimized12;
                                    if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda4(cashflowAnalysisViewModel2, function117);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda4);
                                        obj = externalSyntheticLambda4;
                                    }
                                    Function2 function2 = (Function2) obj;
                                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                                    boolean z3 = (i20 & 112) == 32;
                                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(z3 | zOnExtraCallback10)) {
                                        int i27 = onExtraCallbackWithResult + 99;
                                        onWarmupCompleted = i27 % 128;
                                        int i28 = i27 % 2;
                                        Object obj2 = objOnMinimized13;
                                        if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            CashflowAnalysisScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda5(cashflowAnalysisViewModel2, function110);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda5);
                                            obj2 = externalSyntheticLambda5;
                                        }
                                        getBacktraceNote getbacktracenote = (getBacktraceNote) obj2;
                                        boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowAnalysisViewModel2);
                                        boolean z4 = (i20 & 896) == 256;
                                        Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!(!(zOnExtraCallback11 | z4))) {
                                            objOnMinimized14 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda6(cashflowAnalysisViewModel2, function111);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized14);
                                            function112 = function117;
                                            function113 = function111;
                                            onNavigationEvent(onnavigationevent, function0, function02, function118, function119, function120, function2, getbacktracenote, (Function1) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                            function114 = function113;
                                            Function1<? super String, Unit> function121 = function110;
                                            function115 = function112;
                                            cashflowAnalysisViewModel3 = cashflowAnalysisViewModel2;
                                            function116 = function121;
                                        } else {
                                            int i29 = onWarmupCompleted + 15;
                                            onExtraCallbackWithResult = i29 % 128;
                                            if (i29 % 2 != 0) {
                                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                throw null;
                                            }
                                            if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            }
                                            function112 = function117;
                                            function113 = function111;
                                            onNavigationEvent(onnavigationevent, function0, function02, function118, function119, function120, function2, getbacktracenote, (Function1) objOnMinimized14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            function114 = function113;
                                            Function1<? super String, Unit> function1212 = function110;
                                            function115 = function112;
                                            cashflowAnalysisViewModel3 = cashflowAnalysisViewModel2;
                                            function116 = function1212;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                function112 = function117;
                function113 = function111;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                function114 = function113;
                Function1<? super String, Unit> function12122 = function110;
                function115 = function112;
                cashflowAnalysisViewModel3 = cashflowAnalysisViewModel2;
                function116 = function12122;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda7(cashflowAnalysisViewModel3, function116, function114, function115, i, i2));
                return;
            }
            return;
        }
        i4 |= 48;
        function14 = function1;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 1171) == 1170, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$listState, access13800Var);
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                this.label = 1;
                if (Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, 0, 0, this, 2, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private static final Unit onExtraCallbackWithResult(Context context, Resources resources, getJSONArray.onNavigationEvent onnavigationevent, List list, Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {context, resources, onnavigationevent.onNavigationEvent(), list, function1};
            int iIAuthTabCallback = zziea.IAuthTabCallback();
            IAuthTabCallback(objArr, zziea.IAuthTabCallback(), 506838808, -506838807, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
            unit = Unit.INSTANCE;
            int i3 = 28 / 0;
        } else {
            Object[] objArr2 = {context, resources, onnavigationevent.onNavigationEvent(), list, function1};
            int iIAuthTabCallback2 = zziea.IAuthTabCallback();
            IAuthTabCallback(objArr2, zziea.IAuthTabCallback(), 506838808, -506838807, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback2);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(List list, getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i5 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1834474070, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous>.<anonymous> (CashflowAnalysisScreen.kt:126)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1834474070, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous>.<anonymous> (CashflowAnalysisScreen.kt:126)");
            }
            if (list.isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1651991368);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1653057117);
                String string = onnavigationevent.onNavigationEvent().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                String strOnExtraCallbackWithResult = getScreenOrientationThroughActivityFirst.onExtraCallbackWithResult(string);
                List list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    String string2 = ((YearMonth) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    arrayList.add(getScreenOrientationThroughActivityFirst.onExtraCallback(getScreenOrientationThroughActivityFirst.onExtraCallbackWithResult(string2)));
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(context);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list2);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent)) {
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda18(context, resources, onnavigationevent, list2, function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                        obj2 = externalSyntheticLambda18;
                    }
                    ByteArrayPoolsByteArrayPool.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, strOnExtraCallbackWithResult, arrayList, function0, function02, (Function0) obj2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), (GraphicDeviceInfo) null, readBoolean2.Side, cameraCaptureResultEmptyCameraCaptureResult, 806879232, 257);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements Function1 {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 93;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final Void onExtraCallbackWithResult(remoteCall remotecall) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 29;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Void voidOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            int i5 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return voidOnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Integer, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List IAuthTabCallback;
        final /* synthetic */ Function1 onExtraCallback;

        public onExtraCallbackWithResult(Function1 function1, List list) {
            this.onExtraCallback = function1;
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).intValue());
            int i4 = onExtraCallbackWithResult + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onExtraCallback.invoke(this.IAuthTabCallback.get(i));
            int i5 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    public static final class onNavigationEvent implements Function1<Integer, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List onExtraCallback;
        final /* synthetic */ Function1 onExtraCallbackWithResult;

        public onNavigationEvent(Function1 function1, List list) {
            this.onExtraCallbackWithResult = function1;
            this.onExtraCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(((Number) obj).intValue());
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objInvoke = this.onExtraCallbackWithResult.invoke(this.onExtraCallback.get(i));
            int i5 = onNavigationEvent + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, remoteCall.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(onwarmupcompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onWarmupCompleted implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallbackDefault = 1;
        private static int asInterface;
        final /* synthetic */ getBacktraceNote IAuthTabCallback;
        final /* synthetic */ getJSONArray.onNavigationEvent asBinder;
        final /* synthetic */ Function1 onExtraCallback;
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function2 onNavigationEvent;
        final /* synthetic */ Function1 onTransact;
        final /* synthetic */ Function1 onWarmupCompleted;

        public onWarmupCompleted(List list, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13) {
            this.onExtraCallbackWithResult = list;
            this.asBinder = onnavigationevent;
            this.onTransact = function1;
            this.onExtraCallback = function12;
            this.onNavigationEvent = function2;
            this.IAuthTabCallback = getbacktracenote;
            this.onWarmupCompleted = function13;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
            int i3;
            int i4;
            int i5 = 2 % 2;
            boolean z = true;
            if ((i2 & 6) == 0) {
                int i6 = IAuthTabCallbackDefault + 29;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 51 / 0;
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                        i4 = 2;
                    } else {
                        int i8 = asInterface + 99;
                        IAuthTabCallbackDefault = i8 % 128;
                        int i9 = i8 % 2;
                        i4 = 4;
                    }
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0)) {
                }
                i3 = i4 | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i) ? 32 : 16;
            }
            if ((i3 & 147) != 146) {
                int i10 = asInterface + 39;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = asInterface + 101;
                IAuthTabCallbackDefault = i12 % 128;
                if (i12 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    int i13 = 97 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
            }
            remoteCall remotecall = (remoteCall) this.onExtraCallbackWithResult.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2140542256);
            logDebugReflect.onExtraCallback(remotecall, this.asBinder, this.onTransact, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback, this.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 1;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(remoteCall.onWarmupCompleted onwarmupcompleted, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        boolean z = false;
        if ((i & 17) != 16) {
            int i5 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj2 = null;
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1618809772, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowAnalysisScreen.kt:163)");
            }
            TextContentDto textContentDtoIAuthTabCallbackDefault = onwarmupcompleted.IAuthTabCallbackDefault();
            List listIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            List listOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            TabBarBridgeExtension tabBarBridgeExtensionAsBinder = onwarmupcompleted.asBinder();
            TabBarBridgeExtension tabBarBridgeExtensionAsInterface = onwarmupcompleted.asInterface();
            YearMonth yearMonthOnNavigationEvent = onnavigationevent.onNavigationEvent();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            String str = "analysis_section_" + onnavigationevent.onNavigationEvent() + PresetParser.UNDERLINE + onwarmupcompleted.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!(zOnNavigationEvent | zOnExtraCallback))) {
                CashflowAnalysisScreenKt$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda17(function1, onwarmupcompleted);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                obj = externalSyntheticLambda17;
                getPathAndHash.onNavigationEvent(textContentDtoIAuthTabCallbackDefault, listIAuthTabCallback, listOnExtraCallbackWithResult, yearMonthOnNavigationEvent, ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, str, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 1), 0.0f, tabBarBridgeExtensionAsBinder, tabBarBridgeExtensionAsInterface, cameraCaptureResultEmptyCameraCaptureResult, 0, 32);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i9 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    throw null;
                }
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                getPathAndHash.onNavigationEvent(textContentDtoIAuthTabCallbackDefault, listIAuthTabCallback, listOnExtraCallbackWithResult, yearMonthOnNavigationEvent, ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, str, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 1), 0.0f, tabBarBridgeExtensionAsBinder, tabBarBridgeExtensionAsInterface, cameraCaptureResultEmptyCameraCaptureResult, 0, 32);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static final Object onExtraCallback(remoteCall remotecall) {
        String strOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remotecall, "");
            strOnNavigationEvent = remotecall.onNavigationEvent();
            int i3 = 28 / 0;
        } else {
            Intrinsics.checkNotNullParameter(remotecall, "");
            strOnNavigationEvent = remotecall.onNavigationEvent();
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getJSONArray.onNavigationEvent onnavigationevent = (getJSONArray.onNavigationEvent) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        Function2 function2 = (Function2) objArr[3];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        Function1 function13 = (Function1) objArr[5];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[6];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        remoteCall.onWarmupCompleted onwarmupcompletedOnExtraCallback = onnavigationevent.onExtraCallback();
        if (onwarmupcompletedOnExtraCallback != null) {
            AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "analysis-header-graph", (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-1618809772, true, new CashflowAnalysisScreenKt$.ExternalSyntheticLambda14(onwarmupcompletedOnExtraCallback, onnavigationevent, function1)), 2, (Object) null);
        }
        List listOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(listOnExtraCallbackWithResult.size(), new onExtraCallbackWithResult(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda15(), listOnExtraCallbackWithResult), new onNavigationEvent(IAuthTabCallback.onExtraCallback, listOnExtraCallbackWithResult), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onWarmupCompleted(listOnExtraCallbackWithResult, onnavigationevent, function12, function1, function2, getbacktracenote, function13)));
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "bottom-spacer", (Object) null, isEquals.onExtraCallback.onNavigationEvent(), 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean z;
        Object obj;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        getJSONArray.onNavigationEvent onnavigationevent = (getJSONArray.onNavigationEvent) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        int i = 4;
        Function2 function2 = (Function2) objArr[4];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[5];
        Function1 function13 = (Function1) objArr[6];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i5 = onExtraCallbackWithResult + 3;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 4;
                }
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            int i7 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-677585098, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous> (CashflowAnalysisScreen.kt:155)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-677585098, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent.<anonymous> (CashflowAnalysisScreen.kt:155)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getbacktracenote);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function13);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5)) {
                int i10 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 62 / 0;
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda22 externalSyntheticLambda22 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda22(onnavigationevent, function1, function12, function2, getbacktracenote, function13);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda22);
                        obj = externalSyntheticLambda22;
                    }
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
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[PHI: r0
      0x0036: PHI (r0v32 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v33 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0
      0x0028: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v33 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(getJSONArray.onNavigationEvent onnavigationevent, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function1<? super YearMonth, Unit> function12, Function1<? super remoteCall, Unit> function13, Function2<? super remoteCall.onWarmupCompleted, ? super String, Unit> function2, getBacktraceNote<? super remoteCall.onNavigationEvent, ? super remoteCall.onNavigationEvent.IAuthTabCallback, ? super String, Unit> getbacktracenote, Function1<? super remoteCall.onExtraCallbackWithResult, Unit> function14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2118917667);
            if ((i & 43) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2118917667);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function0)) {
                int i10 = onExtraCallbackWithResult + 101;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function02)) {
                int i12 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function12)) {
                int i14 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function13) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            int i16 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 53 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote) ? 8388608 : 4194304;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(getbacktracenote)) {
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function14)) {
                i3 = 67108864;
            } else {
                int i18 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                i3 = 33554432;
            }
            i2 |= i3;
            int i20 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((38347923 & i2) != 38347922, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i22 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2118917667, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisContent (CashflowAnalysisScreen.kt:108)");
            }
            RVClientStarter rVClientStarterIAuthTabCallback = onnavigationevent.IAuthTabCallback();
            YearMonth yearMonthOnNavigationEvent = onnavigationevent.onNavigationEvent();
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rVClientStarterIAuthTabCallback);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(yearMonthOnNavigationEvent);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = IAuthTabCallback(onnavigationevent.IAuthTabCallback(), onnavigationevent.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
            }
            List list = (List) objOnMinimized;
            RVClientStarter rVClientStarterIAuthTabCallback2 = onnavigationevent.IAuthTabCallback();
            YearMonth yearMonthOnNavigationEvent2 = onnavigationevent.onNavigationEvent();
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rVClientStarterIAuthTabCallback2);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(yearMonthOnNavigationEvent2);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!(!(zOnNavigationEvent3 | zOnNavigationEvent4)) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = onExtraCallback(onnavigationevent.IAuthTabCallback(), onnavigationevent.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            }
            List list2 = (List) objOnMinimized2;
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResult2, 0, 3);
            YearMonth yearMonthOnNavigationEvent3 = onnavigationevent.onNavigationEvent();
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent5 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(yearMonthOnNavigationEvent3, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 0);
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(-1584362743, true, new CashflowAnalysisScreenKt$.ExternalSyntheticLambda23(list, onnavigationevent, function0, function02, context, resources, list2, function12), cameraCaptureResultEmptyCameraCaptureResult2, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-677585098, true, new CashflowAnalysisScreenKt$.ExternalSyntheticLambda24(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, onnavigationevent, function13, function1, function2, getbacktracenote, function14), cameraCaptureResultEmptyCameraCaptureResult4, 54), cameraCaptureResultEmptyCameraCaptureResult3, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda25(onnavigationevent, function0, function02, function1, function12, function13, function2, getbacktracenote, function14, i));
        }
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, remoteCall remotecall, remoteCall.onWarmupCompleted.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            function2.invoke(remotecall, onwarmupcompleted.IAuthTabCallback());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        function2.invoke(remotecall, onwarmupcompleted.IAuthTabCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, remoteCall remotecall) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(remotecall);
            int i3 = 70 / 0;
            return Unit.INSTANCE;
        }
        function1.invoke(remotecall);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, remoteCall remotecall, remoteCall.onNavigationEvent.IAuthTabCallback iAuthTabCallback, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            getbacktracenote.invoke(remotecall, iAuthTabCallback, str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        getbacktracenote.invoke(remotecall, iAuthTabCallback, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onWarmupCompleted(Function1 function1, remoteCall remotecall) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(remotecall);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(remoteCall remotecall, getJSONArray.onNavigationEvent onnavigationevent, Function1<? super String, Unit> function1, Function1<? super remoteCall, Unit> function12, Function2<? super remoteCall.onWarmupCompleted, ? super String, Unit> function2, getBacktraceNote<? super remoteCall.onNavigationEvent, ? super remoteCall.onNavigationEvent.IAuthTabCallback, ? super String, Unit> getbacktracenote, Function1<? super remoteCall.onExtraCallbackWithResult, Unit> function13, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1506463491);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(remotecall) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent)) {
                int i8 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i8 % 128;
                i6 = i8 % 2 != 0 ? 44 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i9 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i11 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i11 % 128;
                i4 = i11 % 2 != 0 ? 17487 : 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i12 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 93 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 1048576 : 524288;
        }
        int i14 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((599187 & i14) != 599186, i14 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1506463491, i14, -1, "im.toss.features.home.feature.cashflow.screen.AnalysisSectionDispatcher (CashflowAnalysisScreen.kt:210)");
            }
            boolean z2 = remotecall instanceof remoteCall.onWarmupCompleted;
            if (z2) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(307455621);
                remoteCall.onWarmupCompleted onwarmupcompleted = (remoteCall.onWarmupCompleted) remotecall;
                YearMonth yearMonthOnNavigationEvent = onnavigationevent.onNavigationEvent();
                LocalDate localDateOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
                boolean zAsInterface = onnavigationevent.asInterface();
                if ((i14 & 57344) != 16384) {
                    int i15 = onWarmupCompleted + 7;
                    onExtraCallbackWithResult = i15 % 128;
                    boolean z3 = i15 % 2 != 0;
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(remotecall);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback || z3) {
                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda8(function2, remotecall);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda8);
                        obj = externalSyntheticLambda8;
                        parseFloat.onExtraCallback(onwarmupcompleted, yearMonthOnNavigationEvent, localDateOnWarmupCompleted, zAsInterface, function1, (Function1) obj, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 14) | ((i14 << 6) & 57344), 64);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        parseFloat.onExtraCallback(onwarmupcompleted, yearMonthOnNavigationEvent, localDateOnWarmupCompleted, zAsInterface, function1, (Function1) obj, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 & 14) | ((i14 << 6) & 57344), 64);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(307469457);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                String str = "analysis_section_" + onnavigationevent.onNavigationEvent() + PresetParser.UNDERLINE + remotecall.onNavigationEvent();
                if ((i14 & 7168) == 2048) {
                    int i16 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i16 % 128;
                    boolean z4 = i16 % 2 != 0;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(remotecall);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z4 | zOnExtraCallback2)) {
                        int i17 = onExtraCallbackWithResult + 9;
                        onWarmupCompleted = i17 % 128;
                        int i18 = i17 % 2;
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowAnalysisScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda9(function12, remotecall);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda9);
                            obj2 = externalSyntheticLambda9;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, str, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 1);
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i19 = onWarmupCompleted + 85;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                getAwbState.onExtraCallback();
                                z = false;
                                int i20 = 68 / 0;
                            } else {
                                z = false;
                                getAwbState.onExtraCallback();
                            }
                        } else {
                            z = false;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        AppLovinNativeAdImplExternalSyntheticLambda6.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallback.Thick, (AppLovinNativeAdImplExternalSyntheticLambda7.onWarmupCompleted) null, (AppLovinNativeAdImplExternalSyntheticLambda7.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 13);
                        if (remotecall instanceof remoteCall.onNavigationEvent) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483558058);
                            remoteCall.onNavigationEvent onnavigationevent2 = (remoteCall.onNavigationEvent) remotecall;
                            YearMonth yearMonthOnNavigationEvent2 = onnavigationevent.onNavigationEvent();
                            if ((i14 & 458752) == 131072) {
                                int i21 = onWarmupCompleted + 13;
                                onExtraCallbackWithResult = i21 % 128;
                                boolean z5 = i21 % 2 != 0 ? z : true;
                                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(remotecall);
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnExtraCallback3 | z5)) {
                                    Object obj3 = objOnMinimized3;
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda10(getbacktracenote, remotecall);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda10);
                                        obj3 = externalSyntheticLambda10;
                                    }
                                    parseColorLong.onExtraCallback(onnavigationevent2, yearMonthOnNavigationEvent2, (Function2) obj3, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14 & 14, 8);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                            }
                        } else if (remotecall instanceof remoteCall.IAuthTabCallback) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483570816);
                            getAbsoluteUrlWithURLLib.onExtraCallbackWithResult((remoteCall.IAuthTabCallback) remotecall, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14 & 14, 2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else if (remotecall instanceof remoteCall.onExtraCallback) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483575262);
                            getCORSUrl.onWarmupCompleted((remoteCall.onExtraCallback) remotecall, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14 & 14, 2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else if (remotecall instanceof remoteCall.onExtraCallbackWithResult) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483579697);
                            remoteCall.onExtraCallbackWithResult onextracallbackwithresult2 = (remoteCall.onExtraCallbackWithResult) remotecall;
                            if ((i14 & 3670016) == 1048576) {
                                int i22 = onWarmupCompleted + 103;
                                onExtraCallbackWithResult = i22 % 128;
                                boolean z6 = i22 % 2 != 0 ? z : true;
                                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(remotecall);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnExtraCallback4 | z6)) {
                                    Object obj4 = objOnMinimized4;
                                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        CashflowAnalysisScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new CashflowAnalysisScreenKt$.ExternalSyntheticLambda11(function13, remotecall);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda11);
                                        obj4 = externalSyntheticLambda11;
                                    }
                                    encodeOffilineUrlForAuth.onWarmupCompleted(onextracallbackwithresult2, (Function0) obj4, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i14 & 14, 4);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                            }
                        } else {
                            if (!z2) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483555532);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                throw new NoWhenBranchMatchedException();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(483586704);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda12(remotecall, onnavigationevent, function1, function12, function2, getbacktracenote, function13, i));
        }
    }

    private static final void onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1921658516);
        if (i != 0) {
            int i3 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            int i5 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1921658516, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisLoading (CashflowAnalysisScreen.kt:256)");
            }
            x2ExternalSyntheticLambda24.onExtraCallback(x2ExternalSyntheticLambda25.IAuthTabCallback.IAuthTabCallback.onNavigationEvent, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (x2ExternalSyntheticLambda28) null, (x2ExternalSyntheticLambda25.onExtraCallback) null, 0L, (DeviceQuirksExternalSyntheticLambda0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda13(i));
        }
    }

    private static final void onExtraCallback(Throwable th, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1587578902);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(th)) {
                int i5 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i9 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 19) != 18, i9 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1587578902, i9, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisError (CashflowAnalysisScreen.kt:264)");
                    int i11 = 76 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1587578902, i9, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAnalysisError (CashflowAnalysisScreen.kt:264)");
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_error_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String message = th.getMessage();
            if (message == null) {
                message = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, strOnExtraCallback, (deprecated_followRedirects) null, message, function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_retry, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, cameraCaptureResultEmptyCameraCaptureResult2, ((i9 << 21) & 234881024) | 6, 54, 94);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowAnalysisScreenKt$.ExternalSyntheticLambda16(th, function0, i));
            int i12 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static final List<YearMonth> IAuthTabCallback(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        YearMonth yearMonthPlusMonths = yearMonth.plusMonths(1L);
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        YearMonth yearMonth2 = (YearMonth) IAuthTabCallback(new Object[]{rVClientStarter}, zziea.IAuthTabCallback(), 769857632, -769857632, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (!yearMonthPlusMonths.isAfter(yearMonth2)) {
            listCreateListBuilder.add(yearMonthPlusMonths);
            int i4 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        listCreateListBuilder.add(yearMonth);
        if (!yearMonthMinusMonths.isBefore(rVClientStarter.IAuthTabCallback())) {
            int i6 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                listCreateListBuilder.add(yearMonthMinusMonths);
                int i7 = 34 / 0;
            } else {
                listCreateListBuilder.add(yearMonthMinusMonths);
            }
        }
        return CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.build(listCreateListBuilder)));
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RVClientStarter rVClientStarter = (RVClientStarter) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!rVClientStarter.onExtraCallback().isAfter(YearMonth.now())) {
            YearMonth yearMonthNow = YearMonth.now();
            Intrinsics.checkNotNullExpressionValue(yearMonthNow, "");
            int i4 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return yearMonthNow;
            }
            throw null;
        }
        int i5 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        YearMonth yearMonthOnExtraCallback = rVClientStarter.onExtraCallback();
        int i7 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return yearMonthOnExtraCallback;
    }

    private static final YearMonth onExtraCallback(YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(yearMonth, "");
        } else {
            Intrinsics.checkNotNullParameter(yearMonth, "");
        }
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        int i3 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return yearMonthMinusMonths;
    }

    private static final boolean onExtraCallbackWithResult(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(yearMonth, "");
        boolean z = !yearMonth.isBefore(rVClientStarter.IAuthTabCallback());
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static final List<YearMonth> onExtraCallback(RVClientStarter rVClientStarter) {
        int i = 2 % 2;
        List<YearMonth> listAccess000 = clearRevision.access000(clearRevision.onTransact(clearRevision.onExtraCallbackWithResult(rVClientStarter.onExtraCallback(), new CashflowAnalysisScreenKt$.ExternalSyntheticLambda19()), new CashflowAnalysisScreenKt$.ExternalSyntheticLambda20(rVClientStarter)));
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return listAccess000;
    }

    private static final List<YearMonth> onExtraCallback(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            List<YearMonth> listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.plus(onExtraCallback(rVClientStarter), yearMonth)));
            int i3 = 53 / 0;
            return listSortedDescending;
        }
        return CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.plus(onExtraCallback(rVClientStarter), yearMonth)));
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(list.get(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final getJSONArray IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends getJSONArray> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getJSONArray getjsonarray = (getJSONArray) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getjsonarray;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {th, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), -1412503935, 1412503945, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Context context, Resources resources, getJSONArray.onNavigationEvent onnavigationevent, List list, Function1 function1) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{context, resources, onnavigationevent, list, function1}, zziea.IAuthTabCallback(), 1799088678, -1799088667, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, remoteCall remotecall) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{function1, remotecall}, zziea.IAuthTabCallback(), -743832358, 743832365, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{str}, zziea.IAuthTabCallback(), 140435749, -140435740, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), -1662893690, 1662893696, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit IAuthTabCallback(List list, getJSONArray.onNavigationEvent onnavigationevent, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {list, onnavigationevent, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), 665222973, -665222965, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {camera2CameraMetadataExternalSyntheticLambda1, onnavigationevent, function1, function12, function2, getbacktracenote, function13, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), 417462403, -417462401, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallback(getJSONArray.onNavigationEvent onnavigationevent, Function1 function1, Function1 function12, Function2 function2, getBacktraceNote getbacktracenote, Function1 function13, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        Object[] objArr = {onnavigationevent, function1, function12, function2, getbacktracenote, function13, audioRestrictionControllerImplExternalSyntheticLambda0};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), -1650778072, 1650778075, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallback(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {th, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(objArr, zziea.IAuthTabCallback(), 1133687268, -1133687263, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final Unit onExtraCallbackWithResult(CashflowAnalysisViewModel cashflowAnalysisViewModel, Function1 function1, remoteCall.onNavigationEvent onnavigationevent, remoteCall.onNavigationEvent.IAuthTabCallback iAuthTabCallback, String str) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (Unit) IAuthTabCallback(new Object[]{cashflowAnalysisViewModel, function1, onnavigationevent, iAuthTabCallback, str}, zziea.IAuthTabCallback(), -23022505, 23022509, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final YearMonth onWarmupCompleted(RVClientStarter rVClientStarter) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        return (YearMonth) IAuthTabCallback(new Object[]{rVClientStarter}, zziea.IAuthTabCallback(), 769857632, -769857632, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }

    private static final void onExtraCallbackWithResult(Context context, Resources resources, YearMonth yearMonth, List<YearMonth> list, Function1<? super YearMonth, Unit> function1) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        IAuthTabCallback(new Object[]{context, resources, yearMonth, list, function1}, zziea.IAuthTabCallback(), 506838808, -506838807, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), iIAuthTabCallback);
    }
}
