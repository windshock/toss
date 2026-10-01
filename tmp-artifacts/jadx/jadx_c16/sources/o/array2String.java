package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.home.core.model.dst.widget.TextContentDto;
import im.toss.features.home.feature.cashflow.CashflowSelectCategoryViewModel;
import im.toss.features.home.feature.cashflow.R$string;
import im.toss.features.home.feature.cashflow.screen.CashflowSelectCategoryScreenKt$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ProcessUtils;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.contextGetScreenOrientation;
import o.getPrivacyDestinationUri;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.wa;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class array2String {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit IAuthTabCallback(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cashflowSelectCategoryViewModel, function0);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, z);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, onnavigationevent);
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 35 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, boolean z3, String str, String str2, Function0 function0, Function0 function02, u2 u2Var, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws t7ExternalSyntheticLambda0.onExtraCallback {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, z, z2, z3, str, str2, function0, function02, u2Var, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        TextContentDto textContentDto = (TextContentDto) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(textContentDto, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(getsupportedhighspeedresolutionsfor);
        int i4 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {onnavigationevent, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -920619341, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 920619360, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr2);
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -505148609, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 505148610, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr2);
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback = (contextGetScreenOrientation.IAuthTabCallback) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(iAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel = (CashflowSelectCategoryViewModel) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cashflowSelectCategoryViewModel, function0);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitIAuthTabCallback = IAuthTabCallback();
            int i3 = 32 / 0;
        } else {
            unitIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, access13800 {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(cashflowSelectCategoryViewModel, (Function0<Unit>) function0, (Function0<Unit>) function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, boolean z, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(function0, z, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(function0, z, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {iAuthTabCallback, Boolean.valueOf(z), function1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -128108230, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 128108247, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
        int i6 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {iAuthTabCallback, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1011295408, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1011295421, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
        int i5 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(contextGetScreenOrientation.onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Unit unit;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1746223343, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1746223358, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)});
            int i5 = 5 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1746223343, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1746223358, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)});
        }
        int i6 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor);
        int i4 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {useandconfigureprogramwithtexture};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        if (i3 != 0) {
            unit = (Unit) onWarmupCompleted(iOnNavigationEvent3, -2123018013, iOnNavigationEvent4, 2123018033, iOnNavigationEvent, iOnNavigationEvent2, objArr);
            int i4 = 96 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(iOnNavigationEvent3, -2123018013, iOnNavigationEvent4, 2123018033, iOnNavigationEvent, iOnNavigationEvent2, objArr);
        }
        int i5 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(useandconfigureprogramwithtexture);
        }
        IAuthTabCallback(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i4 % 128;
        onNavigationEvent(th, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ProcessUtils.IAuthTabCallback iAuthTabCallback, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(iAuthTabCallback, function1, function0, function02, function03, function04, function05, function06, function07, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 52 / 0;
        }
        int i7 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {iAuthTabCallback, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1757228471, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1757228461, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
        int i6 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -739500281, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 739500283, iOnNavigationEvent3, iOnNavigationEvent4, new Object[]{r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, futures3});
        int i3 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(z, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted(z, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(z, function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, boolean z, boolean z2, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, z, z2, function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(ProcessUtils.IAuthTabCallback iAuthTabCallback, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(iAuthTabCallback, function1, function0, function02, function03, function04, function05, function06, function07, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, Function0 function0, Function0 function02, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(iAuthTabCallback, z, function1, function0, function02, audioRestrictionControllerImplExternalSyntheticLambda0);
        }
        IAuthTabCallback(iAuthTabCallback, z, function1, function0, function02, audioRestrictionControllerImplExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, boolean z3, String str, String str2, Function0 function0, Function0 function02, u2 u2Var, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws t7ExternalSyntheticLambda0.onExtraCallback {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(quirksExternalSyntheticBackport0, z, z2, z3, str, str2, function0, function02, u2Var, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(contextGetScreenOrientation.onNavigationEvent onnavigationevent, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(onnavigationevent, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(onnavigationevent, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, boolean z2, Function0 function0, String str, String str2, String str3, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, z2, function0, str, str2, str3, u3Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, onnavigationevent);
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i2 | i5)) | (~(i4 | i5));
        int i10 = ~i4;
        int i11 = (~(i10 | i5)) | i2;
        int i12 = (~(i5 | i2 | i4)) | (~(i8 | i10));
        int i13 = i2 + i4 + i6 + ((-373584967) * i) + ((-1711780345) * i3);
        int i14 = i13 * i13;
        int i15 = (i2 * 1075882953) + 1902575616 + (1075882953 * i4) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i6) + ((-375259136) * i) + ((-1109524480) * i3) + (585564160 * i14);
        int i16 = ((i2 * 235012993) - 778813113) + (i4 * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i6 * 235013625) + (i * 915899377) + (i3 * (-1709701169)) + (i14 * 1974403072);
        switch (i15 + (i16 * i16 * (-848756736))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                String str = (String) objArr[0];
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
                int i17 = 2 % 2;
                int i18 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
                int i20 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                return unitOnExtraCallbackWithResult;
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                Function0 function0 = (Function0) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i22 = 2 % 2;
                int i23 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                Unit unitOnExtraCallbackWithResult2 = onExtraCallbackWithResult(function0, zBooleanValue);
                int i25 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i25 % 128;
                int i26 = i25 % 2;
                return unitOnExtraCallbackWithResult2;
            case 12:
                return access100(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                Function0 function02 = (Function0) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                ((Number) objArr[6]).intValue();
                int i27 = 2 % 2;
                int i28 = onExtraCallbackWithResult + 51;
                onNavigationEvent = i28 % 128;
                int i29 = i28 % 2;
                onNavigationEvent(onnavigationevent, zBooleanValue2, zBooleanValue3, (Function0<Unit>) function02, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
                Unit unit = Unit.INSTANCE;
                int i30 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i30 % 128;
                int i31 = i30 % 2;
                return unit;
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return getInterfaceDescriptor(objArr);
            case 18:
                contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback = (contextGetScreenOrientation.IAuthTabCallback) objArr[0];
                RowScope rowScope = (RowScope) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i32 = 2 % 2;
                int i33 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i33 % 128;
                int i34 = i33 % 2;
                Unit unitOnExtraCallbackWithResult3 = onExtraCallbackWithResult(iAuthTabCallback, rowScope, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                int i35 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i35 % 128;
                int i36 = i35 % 2;
                return unitOnExtraCallbackWithResult3;
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Unit unitOnExtraCallback;
        Function0 function0 = (Function0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function0 function02 = (Function0) objArr[2];
        v5b v5bVar = (v5b) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = onExtraCallback(function0, zBooleanValue, function02, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i3 = 94 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(function0, zBooleanValue, function02, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, access13800 {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cashflowSelectCategoryViewModel, function0, function02, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, boolean z, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, z, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ProcessUtils.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(iAuthTabCallback, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, Function0 function0, Function0 function02, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z2, contextGetScreenOrientation.onNavigationEvent onnavigationevent, Function0 function03, Function0 function04, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws t7ExternalSyntheticLambda0.onExtraCallback {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(iAuthTabCallback, z, function1, function0, function02, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z2, onnavigationevent, function03, function04, getsupportedhighspeedresolutionsfor, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(iAuthTabCallback, z, function1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(z, function0, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 41 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback() {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 23 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallbackDefault extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallbackDefault(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "retry", "retry()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return unit;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {(CashflowSelectCategoryViewModel) ((CallableReference) this).receiver};
                int iOnExtraCallback = matches.onExtraCallback();
                int iOnExtraCallback2 = matches.onExtraCallback();
                CashflowSelectCategoryViewModel.IAuthTabCallback(matches.onExtraCallback(), iOnExtraCallback, objArr, matches.onExtraCallback(), -63332630, iOnExtraCallback2, 63332637);
                int i3 = 58 / 0;
            } else {
                Object[] objArr2 = {(CashflowSelectCategoryViewModel) ((CallableReference) this).receiver};
                int iOnExtraCallback3 = matches.onExtraCallback();
                int iOnExtraCallback4 = matches.onExtraCallback();
                CashflowSelectCategoryViewModel.IAuthTabCallback(matches.onExtraCallback(), iOnExtraCallback3, objArr2, matches.onExtraCallback(), -63332630, iOnExtraCallback4, 63332637);
            }
            int i4 = onNavigationEvent + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class asInterface extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        asInterface(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "trackScreen", "trackScreen()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).access100();
                int i3 = 41 / 0;
            } else {
                ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).access100();
            }
            int i4 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
        }
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function1<contextGetScreenOrientation.onNavigationEvent, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        asBinder(Object obj) {
            super(1, obj, CashflowSelectCategoryViewModel.class, "selectCategory", "selectCategory(Lim/toss/features/home/core/model/cashflow/select_category/CashflowSelectCategoryDto$Category;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent((contextGetScreenOrientation.onNavigationEvent) obj);
            if (i3 != 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onNavigationEvent(contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(onnavigationevent);
            } else {
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult(onnavigationevent);
                throw null;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            cashflowSelectCategoryViewModel.IAuthTabCallbackDefault();
            function0.invoke();
            return Unit.INSTANCE;
        }
        cashflowSelectCategoryViewModel.IAuthTabCallbackDefault();
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    static final /* synthetic */ class IAuthTabCallbackStub extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        IAuthTabCallbackStub(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "saveSelectedCategory", "saveSelectedCategory()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).IAuthTabCallbackStub();
            if (i3 != 0) {
                throw null;
            }
        }
    }

    private static final Unit onExtraCallback(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        cashflowSelectCategoryViewModel.asInterface();
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onExtraCallbackWithResult(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "changeCategoryOverride", "changeCategoryOverride()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
        }
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        IAuthTabCallback(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "trackLeaveDialogShown", "trackLeaveDialogShown()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).asBinder();
            int i3 = onNavigationEvent + 35;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onWarmupCompleted(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "saveSelectedCategoryFromLeaveDialog", "saveSelectedCategoryFromLeaveDialog()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel = (CashflowSelectCategoryViewModel) ((CallableReference) this).receiver;
            if (i3 != 0) {
                cashflowSelectCategoryViewModel.onTransact();
            } else {
                cashflowSelectCategoryViewModel.onTransact();
                throw null;
            }
        }
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent(Object obj) {
            super(0, obj, CashflowSelectCategoryViewModel.class, "cancelSelectedCategoryFromLeaveDialog", "cancelSelectedCategoryFromLeaveDialog()V", 0);
        }

        public /* synthetic */ Object invoke() {
            Unit unit;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            if (i3 != 0) {
                unit = Unit.INSTANCE;
                int i4 = 19 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i5 = onNavigationEvent + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSelectCategoryViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
            int i4 = onWarmupCompleted + 81;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.access13800 */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException, access13800 {
        CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel2;
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        access13800 access13800Var;
        int i5;
        access13800 access13800Var2;
        Function0<Unit> function07;
        Function0<Unit> function08;
        int i6;
        Object objOnMinimized;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1694954533);
        if ((i & 6) == 0) {
            int i9 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                cashflowSelectCategoryViewModel2 = cashflowSelectCategoryViewModel;
            } else {
                cashflowSelectCategoryViewModel2 = cashflowSelectCategoryViewModel;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            cashflowSelectCategoryViewModel2 = cashflowSelectCategoryViewModel;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                    int i11 = onExtraCallbackWithResult + 89;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                int i14 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                function04 = function02;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 256 : 128;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                function05 = function0;
                function06 = function02;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        access13800Var = null;
                        i5 = 0;
                        i3 &= -15;
                        cashflowSelectCategoryViewModel2 = (CashflowSelectCategoryViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(CashflowSelectCategoryViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    } else {
                        access13800Var = null;
                        i5 = 0;
                    }
                    if (i10 != 0) {
                        int i16 = onNavigationEvent + 17;
                        onExtraCallbackWithResult = i16 % 128;
                        if (i16 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            access13800Var.hashCode();
                            throw access13800Var;
                        }
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda37();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        function07 = (Function0) objOnMinimized2;
                        access13800Var2 = access13800Var;
                    } else {
                        access13800Var2 = access13800Var;
                        function07 = function0;
                    }
                    if (i13 != 0) {
                        int i17 = onExtraCallbackWithResult + 21;
                        onNavigationEvent = i17 % 128;
                        if (i17 % 2 == 0) {
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            int i18 = 35 / i5;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda38();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            i6 = i3;
                            function05 = function07;
                            function08 = (Function0) objOnMinimized;
                        } else {
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            i6 = i3;
                            function05 = function07;
                            function08 = (Function0) objOnMinimized;
                        }
                    } else {
                        function08 = function02;
                        i6 = i3;
                        function05 = function07;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    access13800Var2 = null;
                    i5 = 0;
                    Function0<Unit> function09 = function04;
                    i6 = i3;
                    function05 = function03;
                    function08 = function09;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onNavigationEvent + 55;
                    onExtraCallbackWithResult = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1694954533, i6, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectCategoryScreen (CashflowSelectCategoryScreen.kt:76)");
                }
                int i21 = i6;
                Function0<Unit> function010 = function08;
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(cashflowSelectCategoryViewModel2.onNavigationEvent(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7);
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new onExtraCallback(cashflowSelectCategoryViewModel2, context, access13800Var2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(cashflowSelectCategoryViewModel2, context, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i21 & 14);
                ProcessUtils.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<? extends ProcessUtils>) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback);
                if (onextracallbackwithresultOnExtraCallback instanceof ProcessUtils.onExtraCallback) {
                    int i22 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1058733820);
                    onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else if (onextracallbackwithresultOnExtraCallback instanceof ProcessUtils.onExtraCallbackWithResult) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1058736218);
                    Throwable thOnWarmupCompleted = onextracallbackwithresultOnExtraCallback.onWarmupCompleted();
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new IAuthTabCallbackDefault(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    onNavigationEvent(thOnWarmupCompleted, (Function0<Unit>) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (!(onextracallbackwithresultOnExtraCallback instanceof ProcessUtils.IAuthTabCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1058732556);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1538784261);
                    boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback4 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new asInterface(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    RealImageLoaderKt.IAuthTabCallback(new Object[]{(access5300) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i5)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                    ProcessUtils.IAuthTabCallback iAuthTabCallback = (ProcessUtils.IAuthTabCallback) onextracallbackwithresultOnExtraCallback;
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback5 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized6 = new asBinder(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    Function1 function1 = (access5300) objOnMinimized6;
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    int i24 = (i21 & 112) == 32 ? 1 : i5;
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnExtraCallback6 ? 1 : 0) | i24) == 1 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized7 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda39(cashflowSelectCategoryViewModel2, function05);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                    }
                    Function0 function011 = (Function0) objOnMinimized7;
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    int i25 = (i21 & 896) == 256 ? 1 : i5;
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (((zOnExtraCallback7 ? 1 : 0) | i25) != 0 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized8 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda40(cashflowSelectCategoryViewModel2, function010);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                    }
                    Function0 function012 = (Function0) objOnMinimized8;
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback8 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized9 = new IAuthTabCallbackStub(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                    }
                    Function0 function013 = (access5300) objOnMinimized9;
                    boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback9 || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized10 = new onExtraCallbackWithResult(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                        int i26 = onExtraCallbackWithResult + 59;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                    }
                    Function0 function014 = (access5300) objOnMinimized10;
                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback10 || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized11 = new IAuthTabCallback(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                    }
                    Function0 function015 = (access5300) objOnMinimized11;
                    boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback11 || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized12 = new onWarmupCompleted(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                    }
                    Function0 function016 = (access5300) objOnMinimized12;
                    boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSelectCategoryViewModel2);
                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback12 || objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized13 = new onNavigationEvent(cashflowSelectCategoryViewModel2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized13);
                    }
                    onNavigationEvent(iAuthTabCallback, function1, function011, function012, function013, function014, function015, function016, (access5300) objOnMinimized13, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                function06 = function010;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda41(cashflowSelectCategoryViewModel2, function05, function06, i, i2));
                int i28 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i28 % 128;
                int i29 = i28 % 2;
                return;
            }
            return;
        }
        i3 |= 384;
        function04 = function02;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) == 146, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> $onLeaveDialogShown;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Function0<Unit> function0, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$onLeaveDialogShown = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$onLeaveDialogShown, access13800Var);
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 61;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                ontransactCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$onLeaveDialogShown.invoke();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, false);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, boolean z, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 87) == 0) {
                int i5 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var);
                    obj.hashCode();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i6 = onNavigationEvent + 35;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2 != 0 ? 2 : 4;
                    i2 = i | i7;
                }
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1240350409, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:152)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1240350409, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:152)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.menu_save, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, setCallToAction.onExtraCallback.Fill, setCallToAction.onWarmupCompleted.Primary, setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted(), (setCallToAction.onNavigationEvent) null, false, z, cameraCaptureResultEmptyCameraCaptureResult, 1794048, i2 & 14, 390);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        boolean z2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 94) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i6 = onNavigationEvent + 13;
                    onExtraCallbackWithResult = i6 % 128;
                    i2 = i6 % 2 != 0 ? 5 : 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i7 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i7 % 128;
            z2 = i7 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1086577354, i3, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:162)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.app_home_consumption_transaction_category___cfef357d40, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, setCallToAction.onExtraCallback.Weak, setCallToAction.onWarmupCompleted.Dark, setCallToAction.IAuthTabCallback.Companion.onWarmupCompleted(), (setCallToAction.onNavigationEvent) null, !z, false, cameraCaptureResultEmptyCameraCaptureResult, 1794048, i3 & 14, 646);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function0 function0, boolean z, Function0 function02, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            i |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar) ? 2 : 4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-547446435, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous> (CashflowSelectCategoryScreen.kt:150)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-547446435, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous> (CashflowSelectCategoryScreen.kt:150)");
            }
            v5bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1240350409, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda42(function0, z), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1086577354, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda43(z, function02), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(ProcessUtils.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1088706008, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:193)");
            }
            w2.IAuthTabCallback(1724574124, new Object[]{ComputeExpression.IAuthTabCallback.IAuthTabCallback((Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), R$string.home_v2_feature_cashflow_select_category_header_current_v2, new Pair[]{getWrite.IAuthTabCallback("categoryName", iAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult().onWarmupCompleted())}), null, wa.IAuthTabCallback.Companion.onExtraCallback(), null, Float.valueOf(0.0f), null, null, null, null, null, null, false, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 8186}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 8) != 66) {
                int i4 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i4 % 128;
                z = i4 % 2 == 0;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(67298177, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:203)");
            }
            onNavigationEvent(iAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function1 function1, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        boolean z;
        boolean z2;
        Object obj;
        int i;
        ProcessUtils.IAuthTabCallback iAuthTabCallback = (ProcessUtils.IAuthTabCallback) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function1 function1 = (Function1) objArr[2];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((iIntValue2 & 48) == 0) {
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 83 / 0;
                i = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iIntValue)) {
            }
            iIntValue2 |= i;
        }
        if ((iIntValue2 & 145) != 144) {
            int i5 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue2 & 1)) {
            Object obj2 = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(934434991, iIntValue2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:212)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(934434991, iIntValue2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:212)");
            }
            contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) iAuthTabCallback.IAuthTabCallback().get(iIntValue);
            long jOnNavigationEvent = onnavigationevent.onNavigationEvent();
            Long lOnExtraCallback = iAuthTabCallback.onExtraCallback();
            if (lOnExtraCallback != null) {
                int i8 = onNavigationEvent + 79;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    lOnExtraCallback.longValue();
                    obj2.hashCode();
                    throw null;
                }
                if (jOnNavigationEvent == lOnExtraCallback.longValue()) {
                    int i9 = onExtraCallbackWithResult + 117;
                    onNavigationEvent = i9 % 128;
                    z2 = i9 % 2 != 0;
                } else {
                    z2 = false;
                }
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    int i10 = onNavigationEvent + 81;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 50 / 0;
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda44 externalSyntheticLambda44 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda44(function1, onnavigationevent);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda44);
                            obj = externalSyntheticLambda44;
                        }
                        onNavigationEvent(onnavigationevent, z2, !zBooleanValue, (Function0<Unit>) obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        obj = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        onNavigationEvent(onnavigationevent, z2, !zBooleanValue, (Function0<Unit>) obj, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(boolean z, Function0 function0, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-967737409, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:221)");
            }
            IAuthTabCallback(!z, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, boolean z, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        Function0 function02;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i5 % 128;
            z2 = i5 % 2 == 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2042497571, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:228)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_select_category_header_custom, cameraCaptureResultEmptyCameraCaptureResult, 0);
            wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = wa.IAuthTabCallback.Companion.onExtraCallback();
            String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_select_category_header_custom_right, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (z) {
                int i8 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                function02 = null;
            } else {
                function02 = function0;
            }
            w2.IAuthTabCallback(1724574124, new Object[]{strOnExtraCallback, null, iAuthTabCallbackOnExtraCallback, null, Float.valueOf(0.0f), null, null, null, null, strOnExtraCallback2, function02, false, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 6650}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(onnavigationevent);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 111) == 0) {
                int i7 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i8 = onNavigationEvent + 97;
                    onExtraCallbackWithResult = i8 % 128;
                    i3 = i8 % 2 != 0 ? 59 : 32;
                } else {
                    i3 = 16;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i2 & 48) == 0) {
            }
        }
        boolean z3 = false;
        if ((i4 & 145) != 144) {
            int i9 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i4 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1459120140, i4, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:236)");
            }
            contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) iAuthTabCallback.onWarmupCompleted().get(i);
            long jOnNavigationEvent = onnavigationevent.onNavigationEvent();
            Long lOnExtraCallback = iAuthTabCallback.onExtraCallback();
            if (lOnExtraCallback != null && jOnNavigationEvent == lOnExtraCallback.longValue()) {
                z3 = true;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onnavigationevent);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda12(function1, onnavigationevent);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                    obj2 = externalSyntheticLambda12;
                }
                onNavigationEvent(onnavigationevent, z3, !z, (Function0<Unit>) obj2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, Function0 function0, Function0 function02, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(1088706008, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda6(iAuthTabCallback)), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(67298177, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda7(iAuthTabCallback)), 3, (Object) null);
        map2String map2string = map2String.onWarmupCompleted;
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, (getBacktraceNote) map2String.onWarmupCompleted(new Object[]{map2string}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -315259275, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 315259275), 3, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, iAuthTabCallback.IAuthTabCallback().size(), (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(934434991, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda8(iAuthTabCallback, z, function1)), 6, (Object) null);
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-967737409, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda9(z, function0)), 3, (Object) null);
        if (!iAuthTabCallback.onWarmupCompleted().isEmpty()) {
            AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-2042497571, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda10(function02, z)), 3, (Object) null);
            AudioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, iAuthTabCallback.onWarmupCompleted().size(), (Function1) null, (Function1) null, ForwardingCameraControl.onExtraCallbackWithResult(-1459120140, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda11(iAuthTabCallback, z, function1)), 6, (Object) null);
        }
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, map2string.IAuthTabCallbackDefault(), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        Futures3 futures3 = (Futures3) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            onWarmupCompleted((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor, r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) futures3.asBinder()));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor, r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_((int) futures3.asBinder()));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, Function0 function0, Function0 function02, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z2, contextGetScreenOrientation.onNavigationEvent onnavigationevent, Function0 function03, Function0 function04, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws t7ExternalSyntheticLambda0.onExtraCallback {
        int i2;
        boolean z3;
        String str;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1392057645, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous> (CashflowSelectCategoryScreen.kt:183)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1392057645, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent.<anonymous> (CashflowSelectCategoryScreen.kt:183)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
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
                int i7 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 4;
                }
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f) + onNavigationEvent((getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1>) getsupportedhighspeedresolutionsfor)), 7, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iAuthTabCallback);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda25 externalSyntheticLambda25 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda25(iAuthTabCallback, z, function1, function0, function02);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda25);
                    obj = externalSyntheticLambda25;
                }
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 506);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted());
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent4 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda26(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = YuvImageOnePixelShiftQuirk.onExtraCallback(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized2));
                boolean zAsBinder = iAuthTabCallback.asBinder();
                String strIAuthTabCallback = IAuthTabCallback(iAuthTabCallback.onNavigationEvent());
                String strOnWarmupCompleted = onnavigationevent != null ? onnavigationevent.onWarmupCompleted() : null;
                if (strOnWarmupCompleted == null) {
                    int i9 = onNavigationEvent + 61;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    str = "";
                } else {
                    str = strOnWarmupCompleted;
                }
                IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, z2, z, zAsBinder, strIAuthTabCallback, str, function03, function04, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 256);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    private static final void onNavigationEvent(ProcessUtils.IAuthTabCallback iAuthTabCallback, Function1<? super contextGetScreenOrientation.onNavigationEvent, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        ?? r4;
        boolean z2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1728169478);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ^ true ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                int i9 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 5;
                }
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            int i11 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06)) {
                int i13 = onExtraCallbackWithResult + 107;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            int i15 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i2) != 38347922, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1728169478, i2, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryContent (CashflowSelectCategoryScreen.kt:130)");
            }
            contextGetScreenOrientation.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(iAuthTabCallback);
            boolean zOnExtraCallback = onExtraCallback(iAuthTabCallback);
            boolean z3 = iAuthTabCallback.onExtraCallbackWithResult() != null;
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                objOnMinimized = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                objOnMinimized2 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            if (((Boolean) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2092389884, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2092389900, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor2})).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-123107052);
                Unit unit = Unit.INSTANCE;
                boolean z4 = (i2 & 3670016) == 1048576;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z4 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new onTransact(function05, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda1(getsupportedhighspeedresolutionsfor2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                i3 = 54;
                z2 = true;
                r4 = 0;
                z = z3;
                v6.onWarmupCompleted(new Object[]{(Function0) objOnMinimized4, ForwardingCameraControl.onExtraCallback(-547446435, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda2(function06, z3, function07), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), map2String.onWarmupCompleted.onWarmupCompleted(), null, null, null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 438, 120}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                z = z3;
                i3 = 54;
                r4 = 0;
                z2 = true;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-121703992);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            boolean z5 = (!zOnExtraCallback || z) ? r4 : z2;
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda3(getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                int i18 = onNavigationEvent + 115;
                onExtraCallbackWithResult = i18 % 128;
                int i19 = i18 % 2;
            }
            requestPostMessageChannel.onExtraCallbackWithResult(z5, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, (int) r4);
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, map2String.onWarmupCompleted.onExtraCallback(), Boolean.valueOf((boolean) r4), null, null, null, Integer.valueOf((int) r4), Boolean.valueOf((boolean) r4), 0L, 0L, ForwardingCameraControl.onExtraCallback(-1392057645, z2, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda4(iAuthTabCallback, z, function1, function0, function02, r8lambdanm9dm2eewl4vrptnjmesfjqky4, zOnExtraCallback, onnavigationeventIAuthTabCallback, function04, function03, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda5(iAuthTabCallback, function1, function0, function02, function03, function04, function05, function06, function07, i));
        }
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        boolean z = false;
        contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback = (contextGetScreenOrientation.IAuthTabCallback) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = onExtraCallbackWithResult + 97;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i7 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1590961860, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectedTransactionRow.<anonymous> (CashflowSelectCategoryScreen.kt:283)");
            }
            unRegisterClientChannel.IAuthTabCallback(w3bVar, iAuthTabCallback.onNavigationEvent(), handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (String) null, true, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 14) | 12583296, 60);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(145690952, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectedTransactionRow.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:292)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(IpcClientKernelUtils1.onExtraCallbackWithResult(iAuthTabCallback.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0), IpcClientKernelUtils1.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, iAuthTabCallback.onExtraCallback()), (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(TextContentDto textContentDto, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i7 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1556054027, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectedTransactionRow.<anonymous>.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:299)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(IpcClientKernelUtils1.onExtraCallbackWithResult(textContentDto, cameraCaptureResultEmptyCameraCaptureResult, 0), IpcClientKernelUtils1.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, textContentDto), (getHumanReadableName) null, 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262140);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getBacktraceNote getbacktracenoteOnExtraCallback;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            int i3 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 4;
            }
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i5 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(602337392, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectedTransactionRow.<anonymous> (CashflowSelectCategoryScreen.kt:290)");
            }
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(145690952, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda35(iAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult, 54);
            TextContentDto textContentDtoIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
            if (textContentDtoIAuthTabCallback == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-139794781);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getbacktracenoteOnExtraCallback = null;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-139794780);
                getbacktracenoteOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1556054027, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda36(textContentDtoIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult, 54);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            w5aVar.onExtraCallbackWithResult(encoderProfilesProxyVideoProfileProxyOnExtraCallback, getbacktracenoteOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1717772851);
        if ((i & 6) == 0) {
            int i6 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iAuthTabCallback) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i8 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i10 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1717772851, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectedTransactionRow (CashflowSelectCategoryScreen.kt:273)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(602337392, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda28(iAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), isValidUrl.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, isValidUrl.IAuthTabCallback(new String[]{(String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{iAuthTabCallback.onExtraCallback()}), (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{iAuthTabCallback.IAuthTabCallback()}), (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{iAuthTabCallback.onTransact()})}), (Role) null, (String) null, (Boolean) null, (String) null, (Function0) null, (List) null, 126, (Object) null), ForwardingCameraControl.onExtraCallback(-1590961860, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda29(iAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onWarmupCompleted(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 24960, 110584);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda30(iAuthTabCallback, i));
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i6 = onNavigationEvent + 29;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(81410205, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowCategoryRow.<anonymous> (CashflowSelectCategoryScreen.kt:334)");
            }
            unRegisterClientChannel.IAuthTabCallback(w3bVar, onnavigationevent.onExtraCallbackWithResult(), handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, 0L, 0L, (String) null, false, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 14) | 384, 124);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(contextGetScreenOrientation.onNavigationEvent onnavigationevent, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallbackWithResult + 89;
            onNavigationEvent = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(527650890, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowCategoryRow.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:342)");
                    int i6 = 52 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(527650890, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowCategoryRow.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:342)");
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{onnavigationevent.onWarmupCompleted(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 13;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i9 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 / 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(contextGetScreenOrientation.onNavigationEvent onnavigationevent, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                i2 = 4;
            } else {
                int i6 = onExtraCallbackWithResult + 7;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2135433681, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowCategoryRow.<anonymous> (CashflowSelectCategoryScreen.kt:340)");
            }
            w5aVar.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(527650890, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda0(onnavigationevent), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void onNavigationEvent(contextGetScreenOrientation.onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Function0<Unit> function02;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Function0<Unit> function03;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1445935340);
        if ((i & 6) == 0) {
            int i5 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i7 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i9 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1445935340, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowCategoryRow (CashflowSelectCategoryScreen.kt:317)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            String strOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            Role roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onWarmupCompleted());
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(z ? R$string.home_v2_feature_cashflow_accessibility_selected : R$string.home_v2_feature_cashflow_accessibility_not_selected, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (z2) {
                int i11 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                function03 = function02;
            } else {
                function03 = null;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(2135433681, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda31(onnavigationevent), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), isValidUrl.onExtraCallback(onextracallback, strOnWarmupCompleted, roleIAuthTabCallback, strOnExtraCallback, Boolean.valueOf(z), (String) null, function03, (List) null, 80, (Object) null), ForwardingCameraControl.onExtraCallback(81410205, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda32(onnavigationevent), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, z ^ true ? null : (getBacktraceNote) map2String.onWarmupCompleted(new Object[]{map2String.onWarmupCompleted}, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 197032448, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -197032446), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onWarmupCompleted(), (String) null, z2 ? function02 : null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 384, 110552);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda33(onnavigationevent, z, z2, function0, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(boolean z, Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 77) == 0) {
                int i6 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                    int i8 = onExtraCallbackWithResult + 15;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-239364257, i3, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectCategorySaveButton.<anonymous> (CashflowSelectCategoryScreen.kt:395)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_select_category_save_button_title, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, setCallToAction.onExtraCallback.Fill, (setCallToAction.onWarmupCompleted) null, setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setCallToAction.onNavigationEvent.Inline, !z, z, cameraCaptureResultEmptyCameraCaptureResult, 14180352, i3 & 14, 38);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i12 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 86 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Unit unit;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 40 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function0 function0, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(boolean z, boolean z2, Function0 function0, String str, String str2, String str3, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z3;
        Object obj;
        Object objOnMinimized;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 17) != 16) {
            z3 = true;
        } else {
            int i3 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 3;
            }
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1466019323, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectCategorySaveButton.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:413)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            Role roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i5 = onNavigationEvent + 117;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                Object obj2 = objOnMinimized2;
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda18(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                    obj2 = externalSyntheticLambda18;
                }
                boolean z4 = !z;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = getPhysicalCameraInfos.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, z2, z4, roleIAuthTabCallback, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function1) obj2, 8, (Object) null);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda19(str);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent, false, (Function1) objOnMinimized3, 1, (Object) null);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i7 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    int i9 = onNavigationEvent + 111;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda20();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized4);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3) {
                    CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda21(function0);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                    obj = externalSyntheticLambda21;
                    setStarRating.onExtraCallbackWithResult(new Object[]{Boolean.valueOf(z2), quirksExternalSyntheticBackport0OnWarmupCompleted2, Boolean.valueOf(z4), null, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 24}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda22();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{ComputeExpression.IAuthTabCallback.IAuthTabCallback((Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), R$string.home_v2_feature_cashflow_select_category_save_title_v2, new Pair[]{getWrite.IAuthTabCallback("brandName", str2), getWrite.IAuthTabCallback("categoryName", str3)}), getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131064}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    obj = objOnMinimized5;
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    }
                    setStarRating.onExtraCallbackWithResult(new Object[]{Boolean.valueOf(z2), quirksExternalSyntheticBackport0OnWarmupCompleted2, Boolean.valueOf(z4), null, null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 24}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{ComputeExpression.IAuthTabCallback.IAuthTabCallback((Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), R$string.home_v2_feature_cashflow_select_category_save_title_v2, new Pair[]{getWrite.IAuthTabCallback("brandName", str2), getWrite.IAuthTabCallback("categoryName", str3)}), getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback, (Function1) objOnMinimized), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131064}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, String str2, boolean z, boolean z2, Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u3Var, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                int i5 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                int i6 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1707351653, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectCategorySaveButton.<anonymous> (CashflowSelectCategoryScreen.kt:406)");
            }
            u3Var.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1466019323, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda23(z, z2, function0, ComputeExpression.IAuthTabCallback.IAuthTabCallback((Resources) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback()), R$string.home_v2_feature_cashflow_select_category_all_check_box_content_description_v2, new Pair[]{getWrite.IAuthTabCallback("brandName", str), getWrite.IAuthTabCallback("categoryName", str2)}), str, str2), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 6) & 896) | 48, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.t7ExternalSyntheticLambda0$onExtraCallback */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, boolean z3, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, u2 u2Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws t7ExternalSyntheticLambda0.onExtraCallback {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        u2 u2Var2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        t7ExternalSyntheticLambda0.onExtraCallback onextracallback;
        u2 u2VarOnWarmupCompleted;
        Object objOnMinimized;
        String strOnExtraCallbackWithResult;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-571688814);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i11 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                int i13 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i13 % 128;
                i5 = 8388608;
                if (i13 % 2 != 0) {
                    z4 = false;
                    int i14 = 1 / 0;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
                i5 = 4194304;
            }
            i3 |= i5;
        } else {
            z4 = false;
        }
        if ((100663296 & i) == 0) {
            int i15 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            if ((i2 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(u2Var)) {
                int i17 = onNavigationEvent + 107;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i3) != 38347922 ? true : z4, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i10 != 0) {
                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((i2 & 256) != 0) {
                    onextracallback = null;
                    i3 &= -234881025;
                    u2VarOnWarmupCompleted = t7a.onWarmupCompleted(false, (Function0) null, (Function0) null, 0.0f, new t7ExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(0.0f, 0.0f, false, 400, 0, 7, (DefaultConstructorMarker) null), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 46);
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                int i18 = i3;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-571688814, i18, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSelectCategorySaveButton (CashflowSelectCategoryScreen.kt:378)");
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(str2, onextracallback, 2, onextracallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                if (z) {
                    onWarmupCompleted((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str2);
                }
                if (z) {
                    strOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                } else {
                    int i19 = onNavigationEvent + 25;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 != 0) {
                        onextracallback.hashCode();
                        throw onextracallback;
                    }
                    strOnExtraCallbackWithResult = str2;
                }
                if (z) {
                    z5 = true;
                    u2.onNavigationEvent(u2VarOnWarmupCompleted, onextracallback, 1, onextracallback);
                } else {
                    z5 = true;
                    u2.IAuthTabCallback(u2VarOnWarmupCompleted, onextracallback, 1, onextracallback);
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                u2 u2Var3 = u2VarOnWarmupCompleted;
                u1.IAuthTabCallback(quirksExternalSyntheticBackport03, u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(-239364257, z5, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda13(z2, function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(1707351653, z5, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda14(str, strOnExtraCallbackWithResult, z2, z3, function0), cameraCaptureResultEmptyCameraCaptureResult2, 54), (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, (i18 & 14) | 1573248 | ((i18 >> 21) & 112), 0, 4024);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                u2Var2 = u2Var3;
            } else {
                int i20 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 25347) != 0) {
                        i3 &= -234881025;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 256) != 0) {
                    }
                }
            }
            onextracallback = null;
            u2VarOnWarmupCompleted = u2Var;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            int i182 = i3;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            if (z) {
            }
            if (z) {
            }
            if (z) {
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            u2 u2Var32 = u2VarOnWarmupCompleted;
            u1.IAuthTabCallback(quirksExternalSyntheticBackport03, u2VarOnWarmupCompleted, ForwardingCameraControl.onExtraCallback(-239364257, z5, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda13(z2, function02), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(1707351653, z5, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda14(str, strOnExtraCallbackWithResult, z2, z3, function0), cameraCaptureResultEmptyCameraCaptureResult2, 54), (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult2, (i182 & 14) | 1573248 | ((i182 >> 21) & 112), 0, 4024);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            u2Var2 = u2Var32;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            u2Var2 = u2Var;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda15(quirksExternalSyntheticBackport03, z, z2, z3, str, str2, function0, function02, u2Var2, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1))) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 65 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i4 = onNavigationEvent + 87;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1824658386, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAddCustomCategoryRow.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:477)");
                        int i5 = 38 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1824658386, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAddCustomCategoryRow.<anonymous>.<anonymous> (CashflowSelectCategoryScreen.kt:477)");
                    }
                    int i6 = onNavigationEvent + 5;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onNavigationEvent + 65;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i9 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            int i5 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i7 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1128815705, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAddCustomCategoryRow.<anonymous> (CashflowSelectCategoryScreen.kt:475)");
                    int i10 = 54 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1128815705, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAddCustomCategoryRow.<anonymous> (CashflowSelectCategoryScreen.kt:475)");
                }
            }
            w5aVar.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(1824658386, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda34(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(boolean z, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1526729572);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i6 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i6 % 128;
                i4 = i6 % 2 == 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1526729572, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowAddCustomCategoryRow (CashflowSelectCategoryScreen.kt:456)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_select_category_add_custom, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = isValidUrl.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, strOnExtraCallback, Role.IAuthTabCallback(Role.Companion.onWarmupCompleted()), (String) null, (Boolean) null, (String) null, z ? function0 : null, (List) null, 92, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1128815705, true, new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda16(strOnExtraCallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport0OnExtraCallback, map2String.onWarmupCompleted.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onWarmupCompleted(), (String) null, z ? function0 : null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 390, 384, 110584);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda17(z, function0, i));
            int i9 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
            if (iAuthTabCallback.onExtraCallback() != null) {
                Long lOnExtraCallback = iAuthTabCallback.onExtraCallback();
                long jOnNavigationEvent = iAuthTabCallback.onNavigationEvent().onExtraCallbackWithResult().onNavigationEvent();
                if (lOnExtraCallback == null) {
                    return true;
                }
                int i4 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    lOnExtraCallback.longValue();
                    throw null;
                }
                if (lOnExtraCallback.longValue() != jOnNavigationEvent) {
                    return true;
                }
            }
        } else if (iAuthTabCallback.onExtraCallback() != null) {
        }
        return false;
    }

    private static final String IAuthTabCallback(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback) {
        String string;
        int i = 2 % 2;
        String str = (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{iAuthTabCallback.IAuthTabCallback()});
        if (str != null) {
            String str2 = null;
            String strSubstringBefore$default = StringsKt.substringBefore$default(str, "|", (String) null, 2, (Object) null);
            if (strSubstringBefore$default != null && (string = StringsKt.trim(strSubstringBefore$default).toString()) != null) {
                int i2 = onExtraCallbackWithResult + 23;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                if (string.length() > 0) {
                    int i4 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        String str3 = (String) isValidUrl.onExtraCallbackWithResult(-1382175170, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1382175171, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{iAuthTabCallback.IAuthTabCallback()});
        if (str3 != null) {
            return str3;
        }
        int i6 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-679786389);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-679786389);
        if (i != 0) {
            int i4 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-679786389, i, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryLoading (CashflowSelectCategoryScreen.kt:504)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i8 = onExtraCallbackWithResult + 63;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                int i10 = onNavigationEvent + 121;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 / 4;
                }
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_text_loading, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda27(i));
        }
    }

    private static final void onNavigationEvent(Throwable th, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(118244539);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(th)) {
                i3 = 4;
            } else {
                int i5 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i7 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 19) != 18, i7 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onNavigationEvent + 23;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(118244539, i7, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryError (CashflowSelectCategoryScreen.kt:514)");
                    int i9 = 11 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(118244539, i7, -1, "im.toss.features.home.feature.cashflow.screen.SelectCategoryError (CashflowSelectCategoryScreen.kt:514)");
                }
                int i10 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_error_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            String message = th.getMessage();
            if (message == null) {
                message = Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                int i12 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, strOnExtraCallback, (deprecated_followRedirects) null, message, function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_button_retry, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), setCallToAction.onWarmupCompleted.Primary, setCallToAction.onExtraCallback.Fill, cameraCaptureResultEmptyCameraCaptureResult2, ((i7 << 21) & 234881024) | 6, 54, 94);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSelectCategoryScreenKt$.ExternalSyntheticLambda24(th, function0, i));
        }
    }

    private static final contextGetScreenOrientation.onNavigationEvent IAuthTabCallback(ProcessUtils.IAuthTabCallback iAuthTabCallback) {
        Object next;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            iAuthTabCallback.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        Long lOnExtraCallback = iAuthTabCallback.onExtraCallback();
        if (lOnExtraCallback == null) {
            int i3 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        long jLongValue = lOnExtraCallback.longValue();
        Iterator it = iAuthTabCallback.IAuthTabCallback().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((contextGetScreenOrientation.onNavigationEvent) next).onNavigationEvent() == jLongValue) {
                break;
            }
        }
        contextGetScreenOrientation.onNavigationEvent onnavigationevent = (contextGetScreenOrientation.onNavigationEvent) next;
        if (onnavigationevent != null) {
            return onnavigationevent;
        }
        Iterator it2 = iAuthTabCallback.onWarmupCompleted().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((contextGetScreenOrientation.onNavigationEvent) next2).onNavigationEvent() == jLongValue) {
                obj = next2;
                break;
            }
        }
        return (contextGetScreenOrientation.onNavigationEvent) obj;
    }

    private static final ProcessUtils onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends ProcessUtils> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ProcessUtils processUtils = (ProcessUtils) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return processUtils;
        }
        throw null;
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<VirtualCameraControlExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f));
        int i4 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        int i5 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1362845001, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1362845019, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(contextGetScreenOrientation.onNavigationEvent onnavigationevent, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onnavigationevent, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 144315195, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -144315183, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, boolean z, Function0 function02, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function0, Boolean.valueOf(z), function02, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1623368863, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1623368868, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, boolean z) {
        Object[] objArr = {function0, Boolean.valueOf(z)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 291925541, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -291925530, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel, Function0 function0) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 595953525, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -595953525, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{cashflowSelectCategoryViewModel, function0});
    }

    public static /* synthetic */ Unit onExtraCallback(contextGetScreenOrientation.onNavigationEvent onnavigationevent, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onnavigationevent, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2044298108, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2044298122, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1420804707, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1420804704, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{str, useandconfigureprogramwithtexture});
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, contextGetScreenOrientation.onNavigationEvent onnavigationevent) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1519522552, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1519522560, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{function1, onnavigationevent});
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1814269147, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1814269156, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{getsupportedhighspeedresolutionsfor});
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 24429101, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -24429095, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1948704779, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1948704775, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{useandconfigureprogramwithtexture});
    }

    public static /* synthetic */ Unit onNavigationEvent(TextContentDto textContentDto, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {textContentDto, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 356950752, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -356950745, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -505148609, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 505148610, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onExtraCallbackWithResult(contextGetScreenOrientation.onNavigationEvent onnavigationevent, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onnavigationevent, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -920619341, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 920619360, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onWarmupCompleted(contextGetScreenOrientation.onNavigationEvent onnavigationevent, boolean z, boolean z2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {onnavigationevent, Boolean.valueOf(z), Boolean.valueOf(z2), function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1746223343, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1746223358, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2123018013, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2123018033, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{useandconfigureprogramwithtexture});
    }

    private static final Unit IAuthTabCallback(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1011295408, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1011295421, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onWarmupCompleted(contextGetScreenOrientation.IAuthTabCallback iAuthTabCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {iAuthTabCallback, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1757228471, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1757228461, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onNavigationEvent(ProcessUtils.IAuthTabCallback iAuthTabCallback, boolean z, Function1 function1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {iAuthTabCallback, Boolean.valueOf(z), function1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -128108230, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 128108247, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr);
    }

    private static final Unit onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return (Unit) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -739500281, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 739500283, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor, futures3});
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        return ((Boolean) onWarmupCompleted(FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -2092389884, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 2092389900, iOnNavigationEvent, iOnNavigationEvent2, new Object[]{getsupportedhighspeedresolutionsfor})).booleanValue();
    }
}
