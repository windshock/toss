package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zziea;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.features.home.feature.cashflow.CashflowSearchViewModel;
import im.toss.features.home.feature.cashflow.R$string;
import im.toss.features.home.feature.cashflow.screen.CashflowSearchScreenKt$;
import im.toss.features.home.feature.cashflow.screen.CashflowSearchScreenKt$animateScrollToTopContinuously$2$;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.Cacheurls1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CheckMask;
import o.DefaultJsApiHandlerProxyImpl;
import o.DefaultLoggerProxyImpl;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ParcelUtils;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ShadowNodePool;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.getPrivacyDestinationUri;
import o.getTyroBlockTime;
import o.handleNativeAdClick;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getDefaultValue {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static char asBinder = 0;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static final float onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onTransact;
    private static final float onWarmupCompleted;

    static final class access100 extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            if (i3 != 0) {
                return getDefaultValue.IAuthTabCallback((Camera2CameraMetadataExternalSyntheticLambda1) null, (access13800) this);
            }
            getDefaultValue.IAuthTabCallback((Camera2CameraMetadataExternalSyntheticLambda1) null, (access13800) this);
            throw null;
        }
    }

    public static /* synthetic */ YearMonth IAuthTabCallback(YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(yearMonth);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        YearMonth yearMonthOnNavigationEvent = onNavigationEvent(yearMonth);
        int i3 = asInterface + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return yearMonthOnNavigationEvent;
    }

    public static final /* synthetic */ Object IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1, access13800Var}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 648843515, -648843501, ACPayResult.onWarmupCompleted());
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1, access13800Var}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 648843515, -648843501, ACPayResult.onWarmupCompleted());
        int i3 = asInterface + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = asInterface + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i);
        int i5 = IAuthTabCallbackStub + 79;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{cashflowSearchViewModel}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1656008877, 1656008895, ACPayResult.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallbackStub + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1);
        int i4 = asInterface + 81;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 35;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult, i);
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        int i6 = asInterface + 61;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(ParcelUtils.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function1 function12, Function1 function13, Function0 function04, Function0 function05, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(onwarmupcompleted, applyconfig, function0, function02, function1, function03, function12, function13, function04, function05, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2));
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 39;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asInterface + 99;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallbackStub + 43;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        getRelatedFixedSize getrelatedfixedsize = (getRelatedFixedSize) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getrelatedfixedsize, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
        int i4 = IAuthTabCallbackStub + 31;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        }
        onExtraCallbackWithResult(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        int i5 = IAuthTabCallbackStub + 31;
        asInterface = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        findResAndMsg findresandmsg = (findResAndMsg) objArr[0];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(findresandmsg, camera2CameraMetadataExternalSyntheticLambda1);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, camera2CameraMetadataExternalSyntheticLambda1);
        int i3 = IAuthTabCallbackStub + 51;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function1 function12 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(str, (Function1<? super String, Unit>) function1, (Function1<? super Boolean, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 97;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        String str = (String) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        equalsParamTypes equalsparamtypes = (equalsParamTypes) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        collectExtensionPoint collectextensionpoint = (collectExtensionPoint) objArr[6];
        YearMonth yearMonth = (YearMonth) objArr[7];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[8];
        List list = (List) objArr[9];
        Map map = (Map) objArr[10];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[11];
        Function1 function13 = (Function1) objArr[12];
        Function1 function14 = (Function1) objArr[13];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[14];
        FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9 = (FocusMeteringControlExternalSyntheticLambda9) objArr[15];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
        int iIntValue = ((Number) objArr[17]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(camera2CameraMetadataExternalSyntheticLambda1, str, function1, function12, equalsparamtypes, zBooleanValue, collectextensionpoint, yearMonth, getsupportedhighspeedresolutionsfor, list, map, findresandmsg, function13, function14, cameraPresenceProviderExternalSyntheticLambda6, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ LocalDate onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor);
            obj.hashCode();
            throw null;
        }
        LocalDate localDateOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor);
        int i3 = asInterface + 113;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return localDateOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Unit unit;
        List list = (List) objArr[0];
        ParcelUtils.onWarmupCompleted onwarmupcompleted = (ParcelUtils.onWarmupCompleted) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Context context = (Context) objArr[4];
        Resources resources = (Resources) objArr[5];
        List list2 = (List) objArr[6];
        Function1 function1 = (Function1) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i3 != 0) {
            unit = (Unit) onExtraCallback(new Object[]{list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1105820501, 1105820508, ACPayResult.onWarmupCompleted());
            int i4 = 54 / 0;
        } else {
            unit = (Unit) onExtraCallback(new Object[]{list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1105820501, 1105820508, ACPayResult.onWarmupCompleted());
        }
        int i5 = IAuthTabCallbackStub + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e4, code lost:
    
        if (o.Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(r0, 0, 0, r3, 2, (java.lang.Object) null) != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0240, code lost:
    
        if (o.Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(r0, 0, 0, r3, 2, (java.lang.Object) null) == r7) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        access100 access100Var;
        float fFloatValue;
        Ref.FloatRef floatRef;
        int i7 = i5 | i4;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i8 | i5);
        int i11 = (~i7) | i10;
        int i12 = i10 | (~((~i5) | (~i4)));
        int i13 = i5 + i4 + i + (1699743442 * i3) + (2071835342 * i6);
        int i14 = i13 * i13;
        int i15 = ((i5 * (-355764420)) - 259725689) + (i4 * (-355764420)) + (i9 * 521) + (i11 * (-521)) + (i12 * 521) + ((-355763899) * i) + (2119243930 * i3) + ((-943812730) * i6) + (i14 * (-597164032));
        switch (((i5 * (-557635572)) - 1375207424) + ((-557635572) * i4) + (i9 * (-2106796043)) + (2106796043 * i11) + ((-2106796043) * i12) + (1630535680 * i) + ((-648019968) * i3) + ((-1801453568) * i6) + (1296564224 * i14) + (i15 * i15 * 58195968)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                int i16 = 2 % 2;
                int i17 = asInterface + 55;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                return CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
                int i19 = 2 % 2;
                int i20 = asInterface + 55;
                IAuthTabCallbackStub = i20 % 128;
                int i21 = i20 % 2;
                ParcelUtils parcelUtils = (ParcelUtils) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
                int i22 = IAuthTabCallbackStub + 63;
                asInterface = i22 % 128;
                int i23 = i22 % 2;
                return parcelUtils;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                equalsParamTypes equalsparamtypes = (equalsParamTypes) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                List list = (List) objArr[2];
                collectExtensionPoint collectextensionpoint = (collectExtensionPoint) objArr[3];
                Function1 function1 = (Function1) objArr[4];
                Function1 function12 = (Function1) objArr[5];
                String str = (String) objArr[6];
                Function1 function13 = (Function1) objArr[7];
                Function1 function14 = (Function1) objArr[8];
                YearMonth yearMonth = (YearMonth) objArr[9];
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[10];
                Map map = (Map) objArr[11];
                findResAndMsg findresandmsg = (findResAndMsg) objArr[12];
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[13];
                AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[14];
                int i24 = 2 % 2;
                Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
                AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "search_field", (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(-69351020, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda26(str, function13, function14)), 2, (Object) null);
                int i25 = access000.onExtraCallback[equalsparamtypes.ordinal()];
                if (i25 == 1) {
                    AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "search_guide", (Object) null, formatColor.onExtraCallbackWithResult.onNavigationEvent(), 2, (Object) null);
                    int i26 = IAuthTabCallbackStub + 99;
                    asInterface = i26 % 128;
                    int i27 = i26 % 2;
                } else if (i25 == 2) {
                    AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "search_empty_result", (Object) null, formatColor.onExtraCallbackWithResult.IAuthTabCallback(), 2, (Object) null);
                } else {
                    if (i25 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i28 = IAuthTabCallbackStub + 75;
                    asInterface = i28 % 128;
                    int i29 = i28 % 2;
                    if (zBooleanValue) {
                        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "search_calendar", (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(966565999, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda27(collectextensionpoint, yearMonth, list, getsupportedhighspeedresolutionsfor, map, findresandmsg, camera2CameraMetadataExternalSyntheticLambda1)), 2, (Object) null);
                        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, "search_transaction_list_top_spacer", (Object) null, formatColor.onExtraCallbackWithResult.onWarmupCompleted(), 2, (Object) null);
                    }
                    if (!list.isEmpty()) {
                        IpcClientKernelUtils.onExtraCallbackWithResult(audioRestrictionControllerImplExternalSyntheticLambda0, collectextensionpoint.IAuthTabCallback(), collectextensionpoint.onWarmupCompleted(), access8100.onNavigationEvent(), function1, new CashflowSearchScreenKt$.ExternalSyntheticLambda28(), new CashflowSearchScreenKt$.ExternalSyntheticLambda29(), function12);
                    }
                }
                return Unit.INSTANCE;
            case 11:
                return onTransact(objArr);
            case 12:
                return IAuthTabCallbackStub(objArr);
            case 13:
                return access100(objArr);
            case 14:
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda12 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
                access100 access100Var2 = (access13800) objArr[1];
                int i30 = 2 % 2;
                if (access100Var2 instanceof access100) {
                    int i31 = IAuthTabCallbackStub + 83;
                    asInterface = i31 % 128;
                    int i32 = i31 % 2;
                    access100Var = access100Var2;
                    int i33 = access100Var.label;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        int i34 = asInterface + 105;
                        IAuthTabCallbackStub = i34 % 128;
                        if (i34 % 2 != 0) {
                            access100Var.label = i33 >>> Integer.MIN_VALUE;
                        } else {
                            access100Var.label = i33 - 2147483648;
                        }
                    } else {
                        access100Var = new access100(access100Var2);
                        int i35 = asInterface + 81;
                        IAuthTabCallbackStub = i35 % 128;
                        int i36 = i35 % 2;
                    }
                }
                Object obj = access100Var.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i37 = access100Var.label;
                if (i37 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda12)) {
                        Unit unit = Unit.INSTANCE;
                        int i38 = asInterface + 43;
                        IAuthTabCallbackStub = i38 % 128;
                        int i39 = i38 % 2;
                        return unit;
                    }
                    fFloatValue = ((Float) onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda12}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 470998201, -470998184, ACPayResult.onWarmupCompleted())).floatValue();
                    if (fFloatValue <= 0.0f) {
                        access100Var.L$0 = access15400.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda12);
                        access100Var.F$0 = fFloatValue;
                        access100Var.label = 1;
                        break;
                    } else {
                        Ref.FloatRef floatRef2 = new Ref.FloatRef();
                        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(fFloatValue, camera2CameraMetadataExternalSyntheticLambda12, floatRef2, null);
                        access100Var.L$0 = camera2CameraMetadataExternalSyntheticLambda12;
                        access100Var.L$1 = access15400.onNavigationEvent(floatRef2);
                        access100Var.F$0 = fFloatValue;
                        access100Var.label = 2;
                        if (Camera2CameraImplExternalSyntheticLambda5.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda12, (isOverflowMenuShowing) null, iAuthTabCallbackStubProxy, access100Var, 1, (Object) null) != objOnWarmupCompleted) {
                            floatRef = floatRef2;
                            if (!IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda12)) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return objOnWarmupCompleted;
                }
                int i40 = IAuthTabCallbackStub;
                int i41 = i40 + 103;
                asInterface = i41 % 128;
                int i42 = i41 % 2;
                if (i37 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                if (i37 != 2) {
                    int i43 = i40 + 77;
                    asInterface = i43 % 128;
                    if (i43 % 2 != 0 ? i37 != 3 : i37 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                float f = access100Var.F$0;
                floatRef = (Ref.FloatRef) access100Var.L$1;
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda13 = (Camera2CameraMetadataExternalSyntheticLambda1) access100Var.L$0;
                ResultKt.onNavigationEvent(obj);
                fFloatValue = f;
                camera2CameraMetadataExternalSyntheticLambda12 = camera2CameraMetadataExternalSyntheticLambda13;
                if (!IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda12)) {
                    access100Var.L$0 = access15400.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda12);
                    access100Var.L$1 = access15400.onNavigationEvent(floatRef);
                    access100Var.F$0 = fFloatValue;
                    access100Var.label = 3;
                    break;
                }
                return Unit.INSTANCE;
            case 15:
                return access000(objArr);
            case 16:
                return IAuthTabCallbackStubProxy(objArr);
            case 17:
                return getInterfaceDescriptor(objArr);
            case 18:
                return IAuthTabCallback_Parcel(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
                int i44 = 2 % 2;
                int i45 = IAuthTabCallbackStub + 121;
                asInterface = i45 % 128;
                int i46 = i45 % 2;
                Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
                int i47 = asInterface + 125;
                IAuthTabCallbackStub = i47 % 128;
                int i48 = i47 % 2;
                return unitIAuthTabCallbackDefault;
            case 21:
                return extraCallbackWithResult(objArr);
            case 22:
                return ICustomTabsCallback(objArr);
            case 23:
                return readTypedObject(objArr);
            case 24:
                return extraCallback(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowSearchViewModel cashflowSearchViewModel, Function1 function1, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = asInterface + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallbackWithResult(cashflowSearchViewModel, function1, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallbackWithResult(cashflowSearchViewModel, function1, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowSearchViewModel cashflowSearchViewModel, ParcelUtils parcelUtils, Function1 function1, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{cashflowSearchViewModel, parcelUtils, function1, iAuthTabCallback}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1859413054, 1859413070, ACPayResult.onWarmupCompleted());
        int i4 = asInterface + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, UseCaseAttachState useCaseAttachState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(function1, useCaseAttachState);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function1, useCaseAttachState);
        int i3 = asInterface + 103;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(ParcelUtils.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function1 function12, Function1 function13, Function0 function04, Function0 function05, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onwarmupcompleted, applyconfig, function0, function02, function1, function03, function12, function13, function04, function05, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 41 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = asInterface + 15;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackStub + 47;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(equalsParamTypes equalsparamtypes, boolean z, List list, collectExtensionPoint collectextensionpoint, Function1 function1, Function1 function12, String str, Function1 function13, Function1 function14, YearMonth yearMonth, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Map map, findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(new Object[]{equalsparamtypes, Boolean.valueOf(z), list, collectextensionpoint, function1, function12, str, function13, function14, yearMonth, getsupportedhighspeedresolutionsfor, map, findresandmsg, camera2CameraMetadataExternalSyntheticLambda1, audioRestrictionControllerImplExternalSyntheticLambda0}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 365915616, -365915606, ACPayResult.onWarmupCompleted());
        int i3 = asInterface + 25;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, ParcelUtils.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, DefaultLoggerProxyImpl.IAuthTabCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, onwarmupcompleted, applyconfig, iAuthTabCallback);
        int i4 = IAuthTabCallbackStub + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static final /* synthetic */ void onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor, localDate);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = IAuthTabCallbackStub + 15;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CameraMetadataExternalSyntheticLambda1);
        int i4 = asInterface + 111;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RVClientStarter rVClientStarter = (RVClientStarter) objArr[0];
        YearMonth yearMonth = (YearMonth) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(rVClientStarter, yearMonth);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(rVClientStarter, yearMonth);
        int i3 = IAuthTabCallbackStub + 99;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zOnWarmupCompleted);
        }
        int i4 = 52 / 0;
        return Boolean.valueOf(zOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cashflowSearchViewModel);
        int i4 = asInterface + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(CashflowSearchViewModel cashflowSearchViewModel, Function1 function1, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = asInterface + 109;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(new Object[]{cashflowSearchViewModel, function1, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 647602251, -647602239, ACPayResult.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStub + 3;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 9;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return (Unit) onExtraCallback(new Object[]{str, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1913530853, -1913530829, ACPayResult.onWarmupCompleted());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function1 function1, Function1 function12, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function1, function12, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = IAuthTabCallbackStub + 55;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Map map, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{map, findresandmsg, getsupportedhighspeedresolutionsfor, camera2CameraMetadataExternalSyntheticLambda1, localDate}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1516854662, -1516854651, ACPayResult.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 25;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            i |= 1;
        }
        IAuthTabCallback((Function0<Unit>) function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(onextracallbackwithresult, i, str);
        }
        onExtraCallback(onextracallbackwithresult, i, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 61;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1815798346, 1815798365, ACPayResult.onWarmupCompleted());
        } else {
            onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1815798346, 1815798365, ACPayResult.onWarmupCompleted());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, collectExtensionPoint collectextensionpoint, YearMonth yearMonth, LocalDate localDate, String str, boolean z, equalsParamTypes equalsparamtypes, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = asInterface + 39;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonth, localDate, str, z, equalsparamtypes, function1, function12, function13, function14, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonth, localDate, str, z, equalsparamtypes, function1, function12, function13, function14, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[0];
        Resources resources = (Resources) objArr[1];
        ParcelUtils.onWarmupCompleted onwarmupcompleted = (ParcelUtils.onWarmupCompleted) objArr[2];
        List list = (List) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(context, resources, onwarmupcompleted, list, function1);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(context, resources, onwarmupcompleted, list, function1);
        int i3 = asInterface + 53;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(cashflowSearchViewModel);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cashflowSearchViewModel);
        int i3 = IAuthTabCallbackStub + 77;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        int i4 = asInterface + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, iAuthTabCallback);
        int i4 = asInterface + 81;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, list, i);
        int i5 = asInterface + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, collectExtensionPoint collectextensionpoint, ParcelUtils.onWarmupCompleted onwarmupcompleted, boolean z, equalsParamTypes equalsparamtypes, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function0 function0, Function1 function1, Function1 function12, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, onwarmupcompleted, z, equalsparamtypes, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, function0, function1, function12, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, onwarmupcompleted, z, equalsparamtypes, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, function0, function1, function12, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStub + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(collectExtensionPoint collectextensionpoint, YearMonth yearMonth, List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Map map, findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(collectextensionpoint, yearMonth, list, getsupportedhighspeedresolutionsfor, map, findresandmsg, camera2CameraMetadataExternalSyntheticLambda1, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 43;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallback = onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, function0, isinvideousage);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return decrementvideousageOnExtraCallback;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) onExtraCallback(new Object[0], ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 991478946, -991478943, ACPayResult.onWarmupCompleted());
        int i4 = IAuthTabCallbackStub + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    public static final /* synthetic */ boolean onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return zIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RoundedCornerShape roundedCornerShape, setLookAhead setlookahead) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(roundedCornerShape, setlookahead);
        }
        onExtraCallbackWithResult(roundedCornerShape, setlookahead);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(cashflowSearchViewModel);
        int i4 = IAuthTabCallbackStub + 91;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CashflowSearchViewModel cashflowSearchViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cashflowSearchViewModel, iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        int i5 = asInterface + 79;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, ParcelUtils.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1);
        int i4 = asInterface + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackStub + 23;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, collectExtensionPoint collectextensionpoint, YearMonth yearMonth, LocalDate localDate, String str, boolean z, equalsParamTypes equalsparamtypes, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = asInterface + 15;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonth, localDate, str, z, equalsparamtypes, function1, function12, function13, function14, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            onExtraCallbackWithResult(quirksExternalSyntheticBackport0, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonth, localDate, str, z, equalsparamtypes, function1, function12, function13, function14, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, str);
        int i4 = IAuthTabCallbackStub + 87;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ getSupportedHighSpeedResolutionsFor onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforIAuthTabCallback = IAuthTabCallback();
        int i4 = asInterface + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return getsupportedhighspeedresolutionsforIAuthTabCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1815798346, 1815798365, ACPayResult.onWarmupCompleted());
        int i6 = asInterface + 101;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        CashflowSearchViewModel cashflowSearchViewModel = (CashflowSearchViewModel) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback = (DefaultLoggerProxyImpl.IAuthTabCallback) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cashflowSearchViewModel, function2, str, str2, iAuthTabCallback);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = asInterface + 85;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallback;
        final /* synthetic */ LifecycleEventObserver onNavigationEvent;

        public onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, LifecycleEventObserver lifecycleEventObserver) {
            this.onExtraCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onNavigationEvent = lifecycleEventObserver;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = this.onExtraCallback.getLifecycle();
            if (i3 == 0) {
                lifecycle.onExtraCallbackWithResult(this.onNavigationEvent);
            } else {
                lifecycle.onExtraCallbackWithResult(this.onNavigationEvent);
                throw null;
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 67;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $11 + 101;
            $10 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (onTransact ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iCombineMeasuredStates = View.combineMeasuredStates(i4, i4) + 10;
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iCombineMeasuredStates, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.resolveSizeAndState(0, 0, 0) + 10, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 16015), 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19900, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 40 / 0;
        return Unit.INSTANCE;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback(Object obj) {
            super(0, obj, CashflowSearchViewModel.class, "refreshOnResume", "refreshOnResume()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            if (i3 == 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return unit2;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSearchViewModel) ((CallableReference) this).receiver).asInterface();
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras;
        boolean z;
        Object obj;
        boolean zOnExtraCallback;
        boolean z2;
        CashflowSearchViewModel cashflowSearchViewModel = (CashflowSearchViewModel) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function2 function2 = (Function2) objArr[2];
        int i3 = 3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1034720730);
        if ((iIntValue & 6) == 0) {
            if ((iIntValue2 & 1) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel)) {
                int i5 = asInterface + 109;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i6 = iIntValue2 & 2;
        if (i6 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i7 = IAuthTabCallbackStub + 45;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        int i9 = iIntValue2 & 4;
        if (i9 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            int i10 = IAuthTabCallbackStub + 115;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) != 146, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if ((iIntValue2 & 1) != 0) {
                    TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda5.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i12 = asInterface + 23;
                    int i13 = i12 % 128;
                    IAuthTabCallbackStub = i13;
                    int i14 = i12 % 2;
                    if (textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6) {
                        int i15 = i13 + 71;
                        asInterface = i15 % 128;
                        int i16 = i15 % 2;
                        defaultViewModelCreationExtras = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent.getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
                    }
                    cashflowSearchViewModel = (CashflowSearchViewModel) DefaultTextContextMenuDropdownProvider_androidKtExternalSyntheticLambda11.onExtraCallback(Reflection.getOrCreateKotlinClass(CashflowSearchViewModel.class), textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent, (String) null, (ViewModelProvider.onWarmupCompleted) null, defaultViewModelCreationExtras, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    i &= -15;
                }
                if (i6 != 0) {
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new CashflowSearchScreenKt$.ExternalSyntheticLambda30();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    function1 = (Function1) objOnMinimized;
                }
                if (i9 != 0) {
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new CashflowSearchScreenKt$.ExternalSyntheticLambda31();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    function2 = (Function2) objOnMinimized2;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((iIntValue2 & 1) != 0) {
                    i &= -15;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1034720730, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchScreen (CashflowSearchScreen.kt:112)");
            }
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new IAuthTabCallback(cashflowSearchViewModel);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            disableEncrypt.onNavigationEvent(0L, (Function0) null, (access5300) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
            ParcelUtils.onNavigationEvent onnavigationevent = (ParcelUtils) onExtraCallback(new Object[]{AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(cashflowSearchViewModel.onWarmupCompleted(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -676549730, 676549735, ACPayResult.onWarmupCompleted());
            if (onnavigationevent instanceof ParcelUtils.IAuthTabCallback) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2065778101);
                traceBeginSection.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i17 = asInterface + 117;
                IAuthTabCallbackStub = i17 % 128;
                int i18 = i17 % 2;
            } else if (onnavigationevent instanceof ParcelUtils.onNavigationEvent) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2065776146);
                Throwable thOnNavigationEvent = onnavigationevent.onNavigationEvent();
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new CashflowSearchScreenKt$.ExternalSyntheticLambda32(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                traceBeginSection.IAuthTabCallback(-305695574, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{thOnNavigationEvent, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 305695596, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                if (!(onnavigationevent instanceof ParcelUtils.onWarmupCompleted)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-2065778767);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(385582743);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback4 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new CashflowSearchScreenKt$.ExternalSyntheticLambda33(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                RealImageLoaderKt.IAuthTabCallback(new Object[]{(Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                ParcelUtils.onWarmupCompleted onwarmupcompleted = (ParcelUtils.onWarmupCompleted) onnavigationevent;
                applyConfig applyconfigOnNavigationEvent = cashflowSearchViewModel.onNavigationEvent();
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback5 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new onWarmupCompleted(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                Function0 function0 = (access5300) objOnMinimized6;
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback6 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized7 = new onNavigationEvent(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                Function0 function02 = (access5300) objOnMinimized7;
                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback7 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized8 = new asBinder(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                }
                Function1 function12 = (access5300) objOnMinimized8;
                boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnExtraCallback8 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized9 = new onTransact(cashflowSearchViewModel);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                }
                Function0 function03 = (access5300) objOnMinimized9;
                boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent);
                if ((i & 112) == 32) {
                    int i19 = IAuthTabCallbackStub + 97;
                    asInterface = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnExtraCallback9 | zOnExtraCallback10 | z)) {
                    Object obj2 = objOnMinimized10;
                    if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowSearchScreenKt$.ExternalSyntheticLambda34 externalSyntheticLambda34 = new CashflowSearchScreenKt$.ExternalSyntheticLambda34(cashflowSearchViewModel, onnavigationevent, function1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda34);
                        obj2 = externalSyntheticLambda34;
                    }
                    Function1 function13 = (Function1) obj2;
                    boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback11) {
                        Object obj3 = objOnMinimized11;
                        if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CashflowSearchScreenKt$.ExternalSyntheticLambda35 externalSyntheticLambda35 = new CashflowSearchScreenKt$.ExternalSyntheticLambda35(cashflowSearchViewModel);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda35);
                            obj3 = externalSyntheticLambda35;
                        }
                        Function1 function14 = (Function1) obj3;
                        boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnExtraCallback12) {
                            int i21 = asInterface + 65;
                            IAuthTabCallbackStub = i21 % 128;
                            if (i21 % 2 != 0) {
                                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                throw null;
                            }
                            Object obj4 = objOnMinimized12;
                            if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                CashflowSearchScreenKt$.ExternalSyntheticLambda36 externalSyntheticLambda36 = new CashflowSearchScreenKt$.ExternalSyntheticLambda36(cashflowSearchViewModel);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda36);
                                obj4 = externalSyntheticLambda36;
                            }
                            Function0 function04 = (Function0) obj4;
                            boolean zOnExtraCallback13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(!zOnExtraCallback13)) {
                                CashflowSearchScreenKt$.ExternalSyntheticLambda37 externalSyntheticLambda37 = new CashflowSearchScreenKt$.ExternalSyntheticLambda37(cashflowSearchViewModel);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda37);
                                obj = externalSyntheticLambda37;
                                Function0 function05 = (Function0) obj;
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                                z2 = (i & 896) == 256;
                                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z2 | zOnExtraCallback) {
                                    Object obj5 = objOnMinimized14;
                                    if (objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        CashflowSearchScreenKt$.ExternalSyntheticLambda38 externalSyntheticLambda38 = new CashflowSearchScreenKt$.ExternalSyntheticLambda38(cashflowSearchViewModel, function2);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda38);
                                        obj5 = externalSyntheticLambda38;
                                    }
                                    onNavigationEvent(onwarmupcompleted, applyconfigOnNavigationEvent, function0, function02, function12, function03, function13, function14, function04, function05, (getBacktraceNote) obj5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    int i22 = asInterface + 123;
                                    IAuthTabCallbackStub = i22 % 128;
                                    int i23 = i22 % 2;
                                }
                            } else {
                                obj = objOnMinimized13;
                                if (objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                Function0 function052 = (Function0) obj;
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cashflowSearchViewModel);
                                if ((i & 896) == 256) {
                                }
                                Object objOnMinimized142 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z2 | zOnExtraCallback) {
                                }
                            }
                        }
                    }
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = IAuthTabCallbackStub + 43;
                asInterface = i24 % 128;
                int i25 = i24 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        CashflowSearchViewModel cashflowSearchViewModel2 = cashflowSearchViewModel;
        Function1 function15 = function1;
        Function2 function22 = function2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda39(cashflowSearchViewModel2, function15, function22, iIntValue, iIntValue2));
        }
        return null;
    }

    private static final Unit IAuthTabCallbackStub(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cashflowSearchViewModel.onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cashflowSearchViewModel.asBinder();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = IAuthTabCallbackStub + 41;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onWarmupCompleted(Object obj) {
            super(0, obj, CashflowSearchViewModel.class, "prevYearMonth", "prevYearMonth()V", 0);
        }

        public final void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(CashflowSearchViewModel) ((CallableReference) this).receiver};
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            CashflowSearchViewModel.onNavigationEvent(-58576226, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent, objArr, iOnNavigationEvent2, 58576231);
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onNavigationEvent(Object obj) {
            super(0, obj, CashflowSearchViewModel.class, "nextYearMonth", "nextYearMonth()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSearchViewModel) ((CallableReference) this).receiver).IAuthTabCallback();
            int i4 = onExtraCallback + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static final /* synthetic */ class asBinder extends FunctionReferenceImpl implements Function1<YearMonth, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        asBinder(Object obj) {
            super(1, obj, CashflowSearchViewModel.class, "selectYearMonth", "selectYearMonth(Ljava/time/YearMonth;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((YearMonth) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onWarmupCompleted(YearMonth yearMonth) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(yearMonth, "");
            ((CashflowSearchViewModel) ((CallableReference) this).receiver).onNavigationEvent(yearMonth);
            int i4 = onNavigationEvent + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final /* synthetic */ class onTransact extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onTransact(Object obj) {
            super(0, obj, CashflowSearchViewModel.class, "trackSearchModeEntry", "trackSearchModeEntry()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            throw null;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ((CashflowSearchViewModel) ((CallableReference) this).receiver).IAuthTabCallbackDefault();
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        String strIAuthTabCallback;
        CashflowSearchViewModel cashflowSearchViewModel = (CashflowSearchViewModel) objArr[0];
        ParcelUtils.onWarmupCompleted onwarmupcompleted = (ParcelUtils) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback = (DefaultLoggerProxyImpl.IAuthTabCallback) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        cashflowSearchViewModel.onNavigationEvent(iAuthTabCallback);
        String strAsBinder = iAuthTabCallback.asBinder();
        if (strAsBinder != null) {
            int i2 = IAuthTabCallbackStub + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                cashflowSearchViewModel.onNavigationEvent().IAuthTabCallback(strAsBinder);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strIAuthTabCallback2 = cashflowSearchViewModel.onNavigationEvent().IAuthTabCallback(strAsBinder);
            if (strIAuthTabCallback2 != null && (strIAuthTabCallback = deprecated.IAuthTabCallback(strIAuthTabCallback2, onwarmupcompleted.onWarmupCompleted())) != null) {
                function1.invoke(strIAuthTabCallback);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 83;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(CashflowSearchViewModel cashflowSearchViewModel, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            cashflowSearchViewModel.onExtraCallback(iAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        cashflowSearchViewModel.onExtraCallback(iAuthTabCallback);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        CashflowSearchViewModel cashflowSearchViewModel = (CashflowSearchViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            CashflowSearchViewModel.onNavigationEvent(-1994396962, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{cashflowSearchViewModel}, iOnNavigationEvent2, 1994396963);
            return Unit.INSTANCE;
        }
        int iOnNavigationEvent4 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent5 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent6 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        CashflowSearchViewModel.onNavigationEvent(-1994396962, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent6, iOnNavigationEvent4, new Object[]{cashflowSearchViewModel}, iOnNavigationEvent5, 1994396963);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit asBinder(CashflowSearchViewModel cashflowSearchViewModel) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        cashflowSearchViewModel.onExtraCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(CashflowSearchViewModel cashflowSearchViewModel, Function2 function2, String str, String str2, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            cashflowSearchViewModel.onWarmupCompleted(str);
            function2.invoke(str2, iAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        cashflowSearchViewModel.onWarmupCompleted(str);
        function2.invoke(str2, iAuthTabCallback);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 45;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final getSupportedHighSpeedResolutionsFor IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        int i4 = IAuthTabCallbackStub + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsforOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(getRelatedFixedSize getrelatedfixedsize, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, "");
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, false);
        getrelatedfixedsize.onNavigationEvent(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback(Function0 function0, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE) {
            int i2 = asInterface + 19;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = IAuthTabCallbackStub + 103;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Context context, Resources resources, ParcelUtils.onWarmupCompleted onwarmupcompleted, List list, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(context, resources, onwarmupcompleted.IAuthTabCallbackDefault(), (List<YearMonth>) list, (Function1<? super YearMonth, Unit>) function1);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        boolean z;
        int i;
        List list = (List) objArr[0];
        ParcelUtils.onWarmupCompleted onwarmupcompleted = (ParcelUtils.onWarmupCompleted) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        Context context = (Context) objArr[4];
        Resources resources = (Resources) objArr[5];
        List list2 = (List) objArr[6];
        Function1 function1 = (Function1) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i2 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 123;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i5 = IAuthTabCallbackStub + 3;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = asInterface + 101;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-356136482, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchContent.<anonymous>.<anonymous> (CashflowSearchScreen.kt:230)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-356136482, iIntValue, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchContent.<anonymous>.<anonymous> (CashflowSearchScreen.kt:230)");
            }
            if (list.isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1091540604);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i8 = asInterface + 33;
                IAuthTabCallbackStub = i8 % 128;
                i = 2;
                if (i8 % 2 != 0) {
                    int i9 = 2 / 4;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1092615963);
                String string = onwarmupcompleted.IAuthTabCallbackDefault().toString();
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
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(onwarmupcompleted);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list2);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent)) {
                    int i10 = asInterface + 31;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CashflowSearchScreenKt$.ExternalSyntheticLambda40 externalSyntheticLambda40 = new CashflowSearchScreenKt$.ExternalSyntheticLambda40(context, resources, onwarmupcompleted, list2, function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda40);
                        obj = externalSyntheticLambda40;
                    }
                    ByteArrayPoolsByteArrayPool.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, strOnExtraCallbackWithResult, arrayList, function0, function02, (Function0) obj, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), (GraphicDeviceInfo) null, readBoolean2.Side, cameraCaptureResultEmptyCameraCaptureResult, 806879232, 257);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i = 2;
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = IAuthTabCallbackStub + 123;
                asInterface = i12 % 128;
                if (i12 % i == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i13 = 87 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(List list, ParcelUtils.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 41;
        int i5 = i4 % 128;
        asInterface = i5;
        int i6 = i4 % 2;
        if ((i & 3) != 2) {
            int i7 = i3 + 111;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i3 + 53;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 4;
            }
            z = true;
        } else {
            int i11 = i5 + 115;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1200697375, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchContent.<anonymous> (CashflowSearchScreen.kt:227)");
            }
            ByteArrayPoolsByteArray127Pool.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-356136482, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda25(list, onwarmupcompleted, function0, function02, context, resources, list2, function1), cameraCaptureResultEmptyCameraCaptureResult, 54), FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), formatColor.onExtraCallbackWithResult.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, 3504, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        if (!StringsKt.isBlank(str)) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2, true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        boolean zOnExtraCallback = invokeStaticMethod.onNavigationEvent.onExtraCallback(onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), z);
        if (z) {
            IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        }
        if (zOnExtraCallback) {
            int i2 = IAuthTabCallbackStub + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = asInterface + 69;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, collectExtensionPoint collectextensionpoint, ParcelUtils.onWarmupCompleted onwarmupcompleted, boolean z, equalsParamTypes equalsparamtypes, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function0 function0, Function1 function1, Function1 function12, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i5 = asInterface + 91;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = asInterface;
            int i8 = i7 + 91;
            IAuthTabCallbackStub = i8 % 128;
            z2 = i8 % 2 == 0;
            int i9 = i7 + 91;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            int i11 = asInterface + 49;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(597771474, i2, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchContent.<anonymous> (CashflowSearchScreen.kt:257)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            YearMonth yearMonthIAuthTabCallbackDefault = onwarmupcompleted.IAuthTabCallbackDefault();
            LocalDate localDateAsBinder = onwarmupcompleted.asBinder();
            String strIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSearchScreenKt$.ExternalSyntheticLambda43 externalSyntheticLambda43 = new CashflowSearchScreenKt$.ExternalSyntheticLambda43(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda43);
                    obj2 = externalSyntheticLambda43;
                }
                Function1 function13 = (Function1) obj2;
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3 || zOnNavigationEvent4) {
                    CashflowSearchScreenKt$.ExternalSyntheticLambda44 externalSyntheticLambda44 = new CashflowSearchScreenKt$.ExternalSyntheticLambda44(function0, getsupportedhighspeedresolutionsfor2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda44);
                    obj = externalSyntheticLambda44;
                    onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonthIAuthTabCallbackDefault, localDateAsBinder, strIAuthTabCallback, z, equalsparamtypes, function13, (Function1) obj, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i13 = asInterface + 101;
                        IAuthTabCallbackStub = i13 % 128;
                        int i14 = i13 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    int i15 = asInterface + 15;
                    IAuthTabCallbackStub = i15 % 128;
                    if (i15 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonthIAuthTabCallbackDefault, localDateAsBinder, strIAuthTabCallback, z, equalsparamtypes, function13, (Function1) obj, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 0);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i16 = IAuthTabCallbackStub + 121;
        asInterface = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 79 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, ParcelUtils.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, DefaultLoggerProxyImpl.IAuthTabCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        getbacktracenote.invoke(iAuthTabCallback.IAuthTabCallback(), deprecated.IAuthTabCallback(applyconfig.onExtraCallback(deprecated.onNavigationEvent(iAuthTabCallback.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallbackDefault()), iAuthTabCallback.IAuthTabCallback()), onwarmupcompleted.onWarmupCompleted()), onwarmupcompleted.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(ParcelUtils.onWarmupCompleted onwarmupcompleted, applyConfig applyconfig, Function0<Unit> function0, Function0<Unit> function02, Function1<? super YearMonth, Unit> function1, Function0<Unit> function03, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function12, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function13, Function0<Unit> function04, Function0<Unit> function05, getBacktraceNote<? super String, ? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        Object objOnMinimized;
        boolean zOnNavigationEvent3;
        boolean zOnNavigationEvent4;
        Object objOnMinimized2;
        Object objOnMinimized3;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean zOnNavigationEvent5;
        boolean zOnNavigationEvent6;
        Object objOnMinimized4;
        List list;
        Object objOnMinimized5;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        boolean zOnNavigationEvent7;
        List list2;
        boolean z;
        Object objValueOf;
        Iterator it;
        boolean zBooleanValue;
        boolean zOnNavigationEvent8;
        boolean zOnExtraCallback;
        boolean zOnExtraCallback2;
        Object objOnMinimized6;
        equalsParamTypes equalsparamtypes;
        boolean zOnNavigationEvent9;
        boolean zOnExtraCallback3;
        Object objOnMinimized7;
        boolean zOnNavigationEvent10;
        boolean zOnNavigationEvent11;
        boolean zOnNavigationEvent12;
        boolean zOnNavigationEvent13;
        boolean z2;
        ParcelUtils.onWarmupCompleted onwarmupcompleted3;
        applyConfig applyconfig2;
        int i5;
        int i6;
        boolean zOnExtraCallback4;
        int i7;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1646737205);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i9 = asInterface + 47;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(applyconfig);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(applyconfig);
            } else {
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(applyconfig);
            }
            if (zOnExtraCallback4) {
                int i10 = asInterface + 115;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ^ true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                int i12 = asInterface + 81;
                IAuthTabCallbackStub = i12 % 128;
                int i13 = i12 % 2;
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 1048576 : 524288;
            int i14 = IAuthTabCallbackStub + 45;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
        }
        if ((12582912 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13)) {
                int i16 = IAuthTabCallbackStub + 81;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i18 = IAuthTabCallbackStub + 59;
            asInterface = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 10 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1646737205, i3, i4, "im.toss.features.home.feature.cashflow.screen.CashflowSearchContent (CashflowSearchScreen.kt:160)");
                }
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                int i20 = i4;
                getRelatedFixedSize getrelatedfixedsize = (getRelatedFixedSize) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackDefault());
                RVClientStarter rVClientStarterIAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallbackStub();
                YearMonth yearMonthIAuthTabCallbackDefault = onwarmupcompleted.IAuthTabCallbackDefault();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterIAuthTabCallbackStub);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthIAuthTabCallbackDefault);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = onNavigationEvent(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                List list3 = (List) objOnMinimized;
                RVClientStarter rVClientStarterIAuthTabCallbackStub2 = onwarmupcompleted.IAuthTabCallbackStub();
                YearMonth yearMonthIAuthTabCallbackDefault2 = onwarmupcompleted.IAuthTabCallbackDefault();
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterIAuthTabCallbackStub2);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthIAuthTabCallbackDefault2);
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent3 | zOnNavigationEvent4) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = IAuthTabCallback(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                List list4 = (List) objOnMinimized2;
                Object[] objArr = new Object[0];
                objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized3 = new CashflowSearchScreenKt$.ExternalSyntheticLambda15();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                List listOnExtraCallback = onwarmupcompleted.onExtraCallback();
                String strIAuthTabCallback = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(listOnExtraCallback);
                zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback);
                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized4 = getField.IAuthTabCallback(onwarmupcompleted.onExtraCallback(), IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                list = (List) objOnMinimized4;
                Object[] objArr2 = new Object[0];
                objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = new CashflowSearchScreenKt$.ExternalSyntheticLambda16();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent7 || objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                    list2 = list;
                    if (!(list2 instanceof Collection)) {
                        int i21 = asInterface + 47;
                        IAuthTabCallbackStub = i21 % 128;
                        int i22 = i21 % 2;
                        if (list2.isEmpty()) {
                            z = false;
                            objValueOf = Boolean.valueOf(z);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objValueOf);
                        }
                    }
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((DefaultJsApiHandlerProxyImpl.onNavigationEvent) it.next()).onExtraCallback().isEmpty()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    objValueOf = Boolean.valueOf(z);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objValueOf);
                } else {
                    objValueOf = objOnMinimized8;
                }
                zBooleanValue = ((Boolean) objValueOf).booleanValue();
                String strIAuthTabCallback2 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                boolean zOnWarmupCompleted = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback2);
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnWarmupCompleted);
                objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent8 | zOnExtraCallback | zOnExtraCallback2) || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = invokeStaticMethod.onNavigationEvent.onWarmupCompleted(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor), zBooleanValue, onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                equalsparamtypes = (equalsParamTypes) objOnMinimized6;
                zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor));
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(equalsparamtypes.ordinal());
                objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent9 | zOnExtraCallback3) || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized7 = Boolean.valueOf(equalsparamtypes != equalsParamTypes.TransactionList && invokeStaticMethod.onNavigationEvent.onWarmupCompleted(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor)));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                boolean zBooleanValue2 = ((Boolean) objOnMinimized7).booleanValue();
                String strOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
                ServerSideBridge serverSideBridge = (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-1538640074, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1538640075, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                ServerSideBridge serverSideBridge2 = (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnWarmupCompleted);
                zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(serverSideBridge);
                zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(serverSideBridge2);
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent10 | zOnNavigationEvent11 | zOnNavigationEvent12 | zOnNavigationEvent13) {
                    Object obj2 = objOnMinimized9;
                    if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        collectExtensionPoint collectextensionpointOnWarmupCompleted = findMethod.onWarmupCompleted(list, onwarmupcompleted.onWarmupCompleted(), (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-1538640074, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1538640075, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted()), (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted()));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(collectextensionpointOnWarmupCompleted);
                        obj2 = collectextensionpointOnWarmupCompleted;
                    }
                    collectExtensionPoint collectextensionpoint = (collectExtensionPoint) obj2;
                    Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult = Camera2CameraControllerExternalSyntheticLambda0.onExtraCallbackWithResult(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
                    String strIAuthTabCallback3 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                    boolean zOnWarmupCompleted2 = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                    boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback3);
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnWarmupCompleted2);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent14 | zOnExtraCallback5) || objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized10 = Boolean.valueOf(invokeStaticMethod.onNavigationEvent.onNavigationEvent(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor), onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized10);
                    }
                    boolean zBooleanValue3 = ((Boolean) objOnMinimized10).booleanValue();
                    boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                    boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getrelatedfixedsize);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((zOnNavigationEvent15 | zOnNavigationEvent16 | zOnExtraCallback6) || objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized11 = new CashflowSearchScreenKt$.ExternalSyntheticLambda17(getrelatedfixedsize, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized11);
                    }
                    requestPostMessageChannel.onExtraCallbackWithResult(zBooleanValue3, (Function0) objOnMinimized11, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                    boolean z3 = (1879048192 & i3) == 536870912;
                    boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z3 | zOnExtraCallback7) || objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized12 = new CashflowSearchScreenKt$.ExternalSyntheticLambda18(textFieldScrollKtExternalSyntheticLambda0, function05);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                    }
                    int i23 = i3 >> 24;
                    isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, function05, (Function1) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i23 & 112);
                    int i24 = i3;
                    boolean z4 = true;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    clearValueCallback.onWarmupCompleted(new Object[]{null, null, ForwardingCameraControl.onExtraCallback(1200697375, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda19(list3, onwarmupcompleted, function0, function02, context, resources, list4, function1), cameraCaptureResultEmptyCameraCaptureResult2, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(597771474, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda20(camera2CameraMetadataExternalSyntheticLambda1OnExtraCallbackWithResult, collectextensionpoint, onwarmupcompleted, zBooleanValue2, equalsparamtypes, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, function03, function12, function13), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 384, 48, 2043}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
                    List listOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
                    if (listOnExtraCallbackWithResult == null) {
                        int i25 = IAuthTabCallbackStub + 35;
                        asInterface = i25 % 128;
                        int i26 = i25 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-825521666);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-825521665);
                        RealImageLoaderKt.IAuthTabCallback(new Object[]{function04, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i23 & 14)}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), 1641337170, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), -1641337169);
                        if ((i20 & 14) == 4) {
                            onwarmupcompleted3 = onwarmupcompleted;
                            z2 = true;
                        } else {
                            z2 = false;
                            onwarmupcompleted3 = onwarmupcompleted;
                        }
                        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(onwarmupcompleted3);
                        if ((i24 & 112) != 32) {
                            if ((i24 & 64) != 0) {
                                int i27 = asInterface + 125;
                                IAuthTabCallbackStub = i27 % 128;
                                if (i27 % 2 != 0) {
                                    applyconfig2 = applyconfig;
                                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(applyconfig2)) {
                                    }
                                } else {
                                    applyconfig2 = applyconfig;
                                    if (!cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(applyconfig2)) {
                                    }
                                }
                            } else {
                                applyconfig2 = applyconfig;
                            }
                            z4 = false;
                        } else {
                            applyconfig2 = applyconfig;
                        }
                        Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (((zOnExtraCallback8 | z2) || z4) || objOnMinimized13 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized13 = new CashflowSearchScreenKt$.ExternalSyntheticLambda21(getbacktracenote, onwarmupcompleted3, applyconfig2);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized13);
                        } else {
                            int i28 = asInterface + 15;
                            IAuthTabCallbackStub = i28 % 128;
                            if (i28 % 2 != 0) {
                                int i29 = 74 / 0;
                            }
                        }
                        unRegisterServerChannel.IAuthTabCallback(listOnExtraCallbackWithResult, (Function1) objOnMinimized13, function05, cameraCaptureResultEmptyCameraCaptureResult2, (i24 >> 21) & 896);
                        Unit unit = Unit.INSTANCE;
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                int i202 = i4;
                getRelatedFixedSize getrelatedfixedsize2 = (getRelatedFixedSize) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackDefault());
                RVClientStarter rVClientStarterIAuthTabCallbackStub3 = onwarmupcompleted.IAuthTabCallbackStub();
                YearMonth yearMonthIAuthTabCallbackDefault3 = onwarmupcompleted.IAuthTabCallbackDefault();
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterIAuthTabCallbackStub3);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthIAuthTabCallbackDefault3);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    objOnMinimized = onNavigationEvent(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    List list32 = (List) objOnMinimized;
                    RVClientStarter rVClientStarterIAuthTabCallbackStub22 = onwarmupcompleted.IAuthTabCallbackStub();
                    YearMonth yearMonthIAuthTabCallbackDefault22 = onwarmupcompleted.IAuthTabCallbackDefault();
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rVClientStarterIAuthTabCallbackStub22);
                    zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonthIAuthTabCallbackDefault22);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        objOnMinimized2 = IAuthTabCallback(onwarmupcompleted.IAuthTabCallbackStub(), onwarmupcompleted.IAuthTabCallbackDefault());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        List list42 = (List) objOnMinimized2;
                        Object[] objArr3 = new Object[0];
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                        }
                        getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr3, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                        List listOnExtraCallback2 = onwarmupcompleted.onExtraCallback();
                        String strIAuthTabCallback4 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                        zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(listOnExtraCallback2);
                        zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback4);
                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent5 | zOnNavigationEvent6)) {
                            objOnMinimized4 = getField.IAuthTabCallback(onwarmupcompleted.onExtraCallback(), IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                            list = (List) objOnMinimized4;
                            Object[] objArr22 = new Object[0];
                            objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                            }
                            getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) RememberSaveableKt.IAuthTabCallback(objArr22, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                            zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                            Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent7) {
                                list2 = list;
                                if (!(list2 instanceof Collection)) {
                                }
                                it = list2.iterator();
                                while (it.hasNext()) {
                                }
                                z = false;
                                objValueOf = Boolean.valueOf(z);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objValueOf);
                                zBooleanValue = ((Boolean) objValueOf).booleanValue();
                                String strIAuthTabCallback22 = IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
                                boolean zOnWarmupCompleted3 = onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2);
                                zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback22);
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnWarmupCompleted3);
                                objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnNavigationEvent8 | zOnExtraCallback | zOnExtraCallback2)) {
                                    objOnMinimized6 = invokeStaticMethod.onNavigationEvent.onWarmupCompleted(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor), zBooleanValue, onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2));
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                                    equalsparamtypes = (equalsParamTypes) objOnMinimized6;
                                    zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor));
                                    zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(equalsparamtypes.ordinal());
                                    objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(zOnNavigationEvent9 | zOnExtraCallback3)) {
                                        if (equalsparamtypes != equalsParamTypes.TransactionList) {
                                            objOnMinimized7 = Boolean.valueOf(equalsparamtypes != equalsParamTypes.TransactionList && invokeStaticMethod.onNavigationEvent.onWarmupCompleted(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor)));
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                                            boolean zBooleanValue22 = ((Boolean) objOnMinimized7).booleanValue();
                                            String strOnWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted();
                                            ServerSideBridge serverSideBridge3 = (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-1538640074, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1538640075, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                                            ServerSideBridge serverSideBridge22 = (ServerSideBridge) ParcelUtils.onWarmupCompleted.IAuthTabCallback(-418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 418415100, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{onwarmupcompleted}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                                            zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
                                            zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnWarmupCompleted2);
                                            zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(serverSideBridge3);
                                            zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(serverSideBridge22);
                                            Object objOnMinimized92 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (zOnNavigationEvent10 | zOnNavigationEvent11 | zOnNavigationEvent12 | zOnNavigationEvent13) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda22(onwarmupcompleted, applyconfig, function0, function02, function1, function03, function12, function13, function04, function05, getbacktracenote, i, i2));
        }
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, true);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function1 function1, UseCaseAttachState useCaseAttachState) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useCaseAttachState, "");
            function1.invoke(Boolean.valueOf(useCaseAttachState.isFocused()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useCaseAttachState, "");
        function1.invoke(Boolean.valueOf(useCaseAttachState.isFocused()));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke("");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, 1.0f);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 125;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getMaxSupportedFrameRate $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getMaxSupportedFrameRate getmaxsupportedframerate, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$focusRequester = getmaxsupportedframerate;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$focusRequester, access13800Var);
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            Object obj2 = null;
            if (i4 != 0) {
                int i5 = onWarmupCompleted;
                int i6 = i5 + 113;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i5 + 21;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getMaxSupportedFrameRate.onNavigationEvent(this.$focusRequester, 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(String str, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        Function1<? super String, Unit> function13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        getMaxSupportedFrameRate getmaxsupportedframerate;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        boolean z2;
        int i3;
        Throwable th;
        Object obj;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-279991431);
        if ((i & 6) == 0) {
            int i5 = IAuthTabCallbackStub + 17;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        Object obj2 = null;
        if ((i & 384) == 0) {
            int i7 = asInterface + 15;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12);
                obj2.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 256 : 128;
        }
        int i8 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i8 & 147) == 146), i8 & 1)) {
            int i9 = asInterface + 33;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallbackStub + 69;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-279991431, i8, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchField (CashflowSearchScreen.kt:316)");
            }
            if (invokeStaticMethod.onNavigationEvent.onExtraCallbackWithResult()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-397962852);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new getMaxSupportedFrameRate();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getmaxsupportedframerate = (getMaxSupportedFrameRate) objOnMinimized;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-397913035);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getmaxsupportedframerate = null;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new CashflowSearchScreenKt$.ExternalSyntheticLambda9();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, false, (Function1) objOnMinimized2, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            boolean z3 = (i8 & 896) == 256;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z3) {
                int i13 = asInterface + 117;
                IAuthTabCallbackStub = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 29 / 0;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized3 = new CashflowSearchScreenKt$.ExternalSyntheticLambda10(function12);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = SurfaceConfig.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized3);
                    if (getmaxsupportedframerate == null) {
                        int i15 = IAuthTabCallbackStub + 11;
                        asInterface = i15 % 128;
                        if (i15 % 2 == 0) {
                            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = UseCaseAdditionSimulator.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, getmaxsupportedframerate);
                            z = false;
                            int i16 = 63 / 0;
                        } else {
                            z = false;
                            quirksExternalSyntheticBackport0OnExtraCallbackWithResult = UseCaseAdditionSimulator.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, getmaxsupportedframerate);
                        }
                        int i17 = asInterface + 73;
                        IAuthTabCallbackStub = i17 % 128;
                        if (i17 % 2 != 0) {
                            int i18 = 2 / 4;
                        }
                    } else {
                        z = false;
                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult = quirksExternalSyntheticBackport0;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = quirksExternalSyntheticBackport0OnWarmupCompleted2.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    int i19 = i8 & 112;
                    z2 = i19 != 32 ? true : z;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z2) {
                        Object obj3 = objOnMinimized4;
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            CashflowSearchScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new CashflowSearchScreenKt$.ExternalSyntheticLambda11(function1);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda11);
                            obj3 = externalSyntheticLambda11;
                        }
                        formatColor formatcolor = formatColor.onExtraCallbackWithResult;
                        getMaxSupportedFrameRate getmaxsupportedframerate2 = getmaxsupportedframerate;
                        x2ExternalSyntheticLambda14.IAuthTabCallback(str, function1, (Function0) obj3, quirksExternalSyntheticBackport0OnExtraCallback3, false, (DeviceQuirksExternalSyntheticLambda0) null, (DeviceQuirksExternalSyntheticLambda0) null, 0L, (getBacktraceNote) null, (getBacktraceNote) null, (Function2) formatColor.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{formatcolor}, 869842252, -869842250, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()), (Function2) formatColor.onExtraCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{formatcolor}, -145756277, 145756277, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback()), (getBacktraceNote) null, (CameraUnavailableException) null, (CameraState) null, 0.0f, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i8 & 126, 54, 62448);
                        if (StringsKt.isBlank(str)) {
                            function13 = function1;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i3 = 0;
                            th = null;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1948313391);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            int i20 = IAuthTabCallbackStub + 113;
                            asInterface = i20 % 128;
                            int i21 = i20 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1947874214);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = submit.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, onextracallbackwithresult.IAuthTabCallbackStub()), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null), 1.0f);
                            i3 = 0;
                            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            boolean z4 = true;
                            if (!cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                            x2ExternalSyntheticLambda12 x2externalsyntheticlambda12 = x2ExternalSyntheticLambda12.onExtraCallbackWithResult;
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized5 = new CashflowSearchScreenKt$.ExternalSyntheticLambda12();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                            }
                            th = null;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized5, 1, (Object) null);
                            if (i19 == 32) {
                                int i22 = asInterface + 123;
                                IAuthTabCallbackStub = i22 % 128;
                                int i23 = i22 % 2;
                            } else {
                                z4 = false;
                            }
                            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (z4 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                function13 = function1;
                                CashflowSearchScreenKt$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new CashflowSearchScreenKt$.ExternalSyntheticLambda13(function13);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda13);
                                obj = externalSyntheticLambda13;
                            } else {
                                function13 = function1;
                                obj = objOnMinimized6;
                            }
                            x2externalsyntheticlambda12.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, false, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 2);
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (getmaxsupportedframerate2 != null) {
                            int i24 = IAuthTabCallbackStub + 111;
                            asInterface = i24 % 128;
                            if (i24 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-396430770);
                                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getmaxsupportedframerate2);
                                cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                throw th;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-396430770);
                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getmaxsupportedframerate2);
                            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (zOnNavigationEvent || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized7 = new onExtraCallback(getmaxsupportedframerate2, th);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                            }
                            isZslDisabledByByUserCaseConfig.onNavigationEvent(getmaxsupportedframerate2, (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult2, i3);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-396312567);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = SurfaceConfig.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized3);
                    if (getmaxsupportedframerate == null) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback32 = quirksExternalSyntheticBackport0OnWarmupCompleted22.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    int i192 = i8 & 112;
                    if (i192 != 32) {
                    }
                    Object objOnMinimized42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z2) {
                    }
                }
            }
        } else {
            function13 = function1;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda14(str, function13, function12, i));
        }
    }

    private static final boolean onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        if (camera2CameraMetadataExternalSyntheticLambda1.asBinder() <= 0) {
            int i2 = IAuthTabCallbackStub + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub() <= 0) {
                int i4 = IAuthTabCallbackStub + 67;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = asInterface + 13;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<LocalDate> $calendarSelectedDate$delegate;
        final /* synthetic */ List<LocalDate> $datesDescending;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(List<LocalDate> list, getSupportedHighSpeedResolutionsFor<LocalDate> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$datesDescending = list;
            this.$calendarSelectedDate$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$datesDescending, this.$calendarSelectedDate$delegate, access13800Var);
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return iAuthTabCallbackStubCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackStubCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            LocalDate localDateOnExtraCallback = getDefaultValue.onExtraCallback(this.$calendarSelectedDate$delegate);
            getSupportedHighSpeedResolutionsFor<LocalDate> getsupportedhighspeedresolutionsfor = this.$calendarSelectedDate$delegate;
            if (this.$datesDescending.isEmpty()) {
                localDateOnExtraCallback = null;
            } else if (localDateOnExtraCallback != null) {
                int i4 = onExtraCallbackWithResult + 7;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    this.$datesDescending.contains(localDateOnExtraCallback);
                    throw null;
                }
                if (!this.$datesDescending.contains(localDateOnExtraCallback)) {
                    localDateOnExtraCallback = (LocalDate) CollectionsKt.first(this.$datesDescending);
                    int i5 = onWarmupCompleted + 51;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 4;
                    }
                }
            }
            getDefaultValue.onExtraCallback(getsupportedhighspeedresolutionsfor, localDateOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 73 / 0;
            }
            return unit;
        }
    }

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$listState, access13800Var);
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackDefault;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 5;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 22 / 0;
            return iAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                this.label = 1;
                if (Camera2CameraMetadataExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, 0, 0, this, 2, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = IAuthTabCallback + 19;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 27;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(String str, Function1 function1, Function1 function12, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 29;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = asInterface + 13;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-69351020, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchTransactionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSearchScreen.kt:439)");
            }
            onNavigationEvent(str, (Function1<? super String, Unit>) function1, (Function1<? super Boolean, Unit>) function12, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackStub + 39;
                asInterface = i7 % 128;
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

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Map map = (Map) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[2];
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[3];
        LocalDate localDate = (LocalDate) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(localDate, "");
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor, localDate);
            throw null;
        }
        Intrinsics.checkNotNullParameter(localDate, "");
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor, localDate);
        Integer num = (Integer) map.get(localDate);
        if (num != null) {
            maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new asInterface(camera2CameraMetadataExternalSyntheticLambda1, num.intValue(), null), 3, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallbackStub + 123;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        Unit unit2 = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 27;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return unit2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        final /* synthetic */ int $targetIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
            this.$targetIndex = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$listState, this.$targetIndex, access13800Var);
            int i2 = onWarmupCompleted + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 30 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                int i4 = this.$targetIndex;
                this.label = 1;
                if (Camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, i4, 0, this, 2, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onWarmupCompleted + 89;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(collectExtensionPoint collectextensionpoint, YearMonth yearMonth, List list, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Map map, findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallbackStub + 111;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = IAuthTabCallbackStub + 3;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(966565999, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchTransactionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CashflowSearchScreen.kt:460)");
            }
            ShadowNodePool shadowNodePoolOnExtraCallbackWithResult = getServerChannel.onExtraCallbackWithResult(collectextensionpoint.IAuthTabCallback(), yearMonth, onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<LocalDate>) getsupportedhighspeedresolutionsfor), (LocalDate) null, ShadowNodePool.onNavigationEvent.MONTHLY, !list.isEmpty(), ShadowNodePool.onExtraCallbackWithResult.MONTHLY_DATE_WIDE, 4, (Object) null);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(map);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnNavigationEvent | zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent2)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CashflowSearchScreenKt$.ExternalSyntheticLambda41 externalSyntheticLambda41 = new CashflowSearchScreenKt$.ExternalSyntheticLambda41(map, findresandmsg, getsupportedhighspeedresolutionsfor, camera2CameraMetadataExternalSyntheticLambda1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda41);
                    obj = externalSyntheticLambda41;
                }
                Function1 function1 = (Function1) obj;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new CashflowSearchScreenKt$.ExternalSyntheticLambda42();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                getServerChannel.onExtraCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -391535523, new Object[]{shadowNodePoolOnExtraCallbackWithResult, function1, (Function1) objOnMinimized2, quirksExternalSyntheticBackport0OnExtraCallback, null, false, false, null, cameraCaptureResultEmptyCameraCaptureResult, 196992, 208}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), 391535529, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i, String str) {
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStub + 43;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(DefaultLoggerProxyImpl.onExtraCallbackWithResult onextracallbackwithresult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            unit = Unit.INSTANCE;
            int i4 = 30 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            unit = Unit.INSTANCE;
        }
        int i5 = asInterface + 19;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getInterfaceDescriptor(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
            this.$listState = camera2CameraMetadataExternalSyntheticLambda1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor(this.$listState, access13800Var);
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return getinterfacedescriptor;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.$listState;
                this.label = 1;
                if (getDefaultValue.IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, (access13800) this) == objOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 27;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(camera2CameraMetadataExternalSyntheticLambda1, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, String str, Function1 function1, Function1 function12, equalsParamTypes equalsparamtypes, boolean z, collectExtensionPoint collectextensionpoint, YearMonth yearMonth, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, List list, Map map, findResAndMsg findresandmsg, Function1 function13, Function1 function14, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        boolean z2;
        Throwable th;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 69;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
            if ((i & 68) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9)) {
                    int i6 = IAuthTabCallbackStub + 17;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                } else {
                    int i8 = IAuthTabCallbackStub + 35;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 4;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i10 = asInterface + 21;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-749300097, i3, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchTransactionList.<anonymous> (CashflowSearchScreen.kt:423)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(invokeStaticMethod.onNavigationEvent.onExtraCallback(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted()), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(onExtraCallbackWithResult), r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(onWarmupCompleted)));
            float fOnExtraCallback = StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onExtraCallbackWithResult(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fC_ + fOnExtraCallback), 7, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(equalsparamtypes.ordinal());
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(collectextensionpoint);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(yearMonth);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getsupportedhighspeedresolutionsfor);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list);
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(map);
            boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function13);
            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function14);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (((zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnNavigationEvent4 | zOnExtraCallback5 | zOnExtraCallback6 | zOnExtraCallback7 | zOnNavigationEvent5 | zOnNavigationEvent6) || zOnNavigationEvent7) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                th = null;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                CashflowSearchScreenKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new CashflowSearchScreenKt$.ExternalSyntheticLambda3(equalsparamtypes, z, list, collectextensionpoint, function13, function14, str, function1, function12, yearMonth, getsupportedhighspeedresolutionsfor, map, findresandmsg, camera2CameraMetadataExternalSyntheticLambda1);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda3);
                objOnMinimized = externalSyntheticLambda3;
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                th = null;
            }
            ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, camera2CameraMetadataExternalSyntheticLambda1, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 6, 504);
            if (!(!((Boolean) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1773060278, 1773060284, ACPayResult.onWarmupCompleted())).booleanValue())) {
                int i12 = IAuthTabCallbackStub + 21;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                if (equalsparamtypes == equalsParamTypes.TransactionList) {
                    int i14 = IAuthTabCallbackStub + 115;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1450222760);
                    boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(findresandmsg);
                    boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnExtraCallback8 | zOnNavigationEvent8) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new CashflowSearchScreenKt$.ExternalSyntheticLambda4(findresandmsg, camera2CameraMetadataExternalSyntheticLambda1);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    IAuthTabCallback((Function0<Unit>) objOnMinimized2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted(quirksExternalSyntheticBackport0, QuirkSettingsLoader.Companion.onWarmupCompleted()), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f) + fOnExtraCallback), 7, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    int i16 = asInterface + 67;
                    IAuthTabCallbackStub = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1449843165);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i18 = asInterface + 79;
                    IAuthTabCallbackStub = i18 % 128;
                    if (i18 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        th.hashCode();
                        throw th;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, collectExtensionPoint collectextensionpoint, YearMonth yearMonth, LocalDate localDate, String str, boolean z, equalsParamTypes equalsparamtypes, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function13, Function1<? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function14, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        int i4;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        int i6;
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(529075625);
        int i8 = i3 & 1;
        if (i8 != 0) {
            int i9 = IAuthTabCallbackStub + 33;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i11 = IAuthTabCallbackStub + 85;
            asInterface = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = asInterface + 79;
            IAuthTabCallbackStub = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(collectextensionpoint);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(collectextensionpoint) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i13 = asInterface + 123;
            IAuthTabCallbackStub = i13 % 128;
            if (i13 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(yearMonth);
                obj.hashCode();
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(yearMonth) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            int i14 = IAuthTabCallbackStub + 49;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(localDate)) {
                int i16 = IAuthTabCallbackStub + 27;
                asInterface = i16 % 128;
                i6 = i16 % 2 == 0 ? 32435 : 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((196608 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(equalsparamtypes.ordinal()) ? 8388608 : 4194304;
            int i17 = IAuthTabCallbackStub + 93;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
        }
        if ((100663296 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i19 = asInterface + 47;
                IAuthTabCallbackStub = i19 % 128;
                int i20 = i19 % 2;
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i4 |= i5;
        }
        if ((805306368 & i) == 0) {
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ^ true) ? 536870912 : 268435456;
        }
        int i21 = (i2 & 6) == 0 ? i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i21 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function14) ? 32 : 16;
        }
        int i22 = i21;
        if ((i4 & 306783379) == 306783378 && (i22 & 19) == 18) {
            int i23 = IAuthTabCallbackStub + 5;
            asInterface = i23 % 128;
            int i24 = i23 % 2;
            z2 = false;
        } else {
            z2 = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
            if (i8 != 0) {
                int i25 = IAuthTabCallbackStub + 99;
                asInterface = i25 % 128;
                if (i25 % 2 == 0) {
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    int i26 = 18 / 0;
                } else {
                    quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(529075625, i4, i22, "im.toss.features.home.feature.cashflow.screen.CashflowSearchTransactionList (CashflowSearchScreen.kt:392)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(collectextensionpoint.IAuthTabCallback());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = getStringDefault.IAuthTabCallback(collectextensionpoint.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            List<LocalDate> list = (List) objOnMinimized2;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(collectextensionpoint.IAuthTabCallback());
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list);
            boolean z4 = (i4 & 3670016) == 1048576;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((zOnNavigationEvent2 || zOnNavigationEvent3) || z4) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                int iOnExtraCallbackWithResult = invokeStaticMethod.onNavigationEvent.onExtraCallbackWithResult(z);
                Map mapOnExtraCallback = access8100.onExtraCallback();
                for (LocalDate localDate2 : list) {
                    mapOnExtraCallback.put(localDate2, Integer.valueOf(iOnExtraCallbackWithResult));
                    iOnExtraCallbackWithResult += IAuthTabCallback((getTyroBlockTime.onNavigationEvent.IAuthTabCallback) collectextensionpoint.IAuthTabCallback().IAuthTabCallback().get(localDate2)) + 1;
                }
                z3 = true;
                objOnMinimized3 = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            } else {
                z3 = true;
            }
            Map map = (Map) objOnMinimized3;
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(yearMonth);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent4) {
                Object obj2 = objOnMinimized4;
                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(localDate, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                    obj2 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) obj2;
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new CashflowSearchScreenKt$.ExternalSyntheticLambda5(camera2CameraMetadataExternalSyntheticLambda1));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5;
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent5 | zOnExtraCallback) || objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized6 = new IAuthTabCallbackStub(list, getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(list, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                boolean z5 = (i4 & 112) == 32 ? z3 : false;
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z5) {
                    Object obj3 = objOnMinimized7;
                    if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                        IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(camera2CameraMetadataExternalSyntheticLambda1, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iAuthTabCallbackDefault);
                        obj3 = iAuthTabCallbackDefault;
                    }
                    Function2 function2 = (Function2) obj3;
                    int i27 = i4 >> 15;
                    isZslDisabledByByUserCaseConfig.IAuthTabCallback(yearMonth, Boolean.valueOf(z), equalsparamtypes, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 9) & 14) | (i27 & 112) | (i27 & 896));
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport03, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(-749300097, true, new CashflowSearchScreenKt$.ExternalSyntheticLambda6(camera2CameraMetadataExternalSyntheticLambda1, str, function1, function12, equalsparamtypes, z, collectextensionpoint, yearMonth, getsupportedhighspeedresolutionsfor, list, map, findresandmsg, function13, function14, cameraPresenceProviderExternalSyntheticLambda6), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 6);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda7(quirksExternalSyntheticBackport02, camera2CameraMetadataExternalSyntheticLambda1, collectextensionpoint, yearMonth, localDate, str, z, equalsparamtypes, function1, function12, function13, function14, i, i2, i3));
        }
    }

    private static final Unit onExtraCallbackWithResult(RoundedCornerShape roundedCornerShape, setLookAhead setlookahead) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setlookahead, "");
        setlookahead.onWarmupCompleted(roundedCornerShape);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[PHI: r0
      0x0040: PHI (r0v27 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v28 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r0
      0x002b: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v28 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackStub + 13;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1062103244);
            if ((i & 72) == 0) {
                int i7 = IAuthTabCallbackStub + 99;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                int i9 = IAuthTabCallbackStub + 9;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1062103244);
            if ((i & 6) == 0) {
            }
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    i4 = 32;
                } else {
                    int i12 = asInterface + 11;
                    IAuthTabCallbackStub = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 2 % 4;
                    }
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
            } else {
                int i14 = asInterface + 67;
                IAuthTabCallbackStub = i14 % 128;
                if (i14 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i11 != 0) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    int i15 = asInterface + 85;
                    IAuthTabCallbackStub = i15 % 128;
                    int i16 = i15 % 2;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                } else {
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1062103244, i3, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchTopButton (CashflowSearchScreen.kt:521)");
                }
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_search_top_button, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(800.0f));
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f));
                QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                Cacheurls1.onExtraCallbackWithResult.onExtraCallback onextracallback = Cacheurls1.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(roundedCornerShapeOnNavigationEvent);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!zOnNavigationEvent) {
                    int i17 = asInterface + 119;
                    IAuthTabCallbackStub = i17 % 128;
                    int i18 = i17 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new CashflowSearchScreenKt$.ExternalSyntheticLambda23(roundedCornerShapeOnNavigationEvent);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = MaxRecyclerAdapter.onExtraCallback(quirksExternalSyntheticBackport03, onextracallback, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, ((i3 >> 3) & 14) | 48);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(isValidUrl.onExtraCallback(measureChildConstrained.IAuthTabCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onNavigationEvent(), roundedCornerShapeOnNavigationEvent), roundedCornerShapeOnNavigationEvent), (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, getSharedInstance.onExtraCallback(false, false, 0L, roundedCornerShapeOnNavigationEvent, (DeviceQuirksExternalSyntheticLambda0) null, (DeviceQuirksExternalSyntheticLambda0) null, (getConfiguration) null, (getCachingExecutorService) null, 247, (Object) null), false, (String) null, (Role) null, function0, 28, (Object) null), strOnExtraCallback, Role.IAuthTabCallback(Role.Companion.onWarmupCompleted()), (String) null, (Boolean) null, (String) null, function0, (List) null, 92, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f));
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                        int i19 = IAuthTabCallbackStub + 19;
                        asInterface = i19 % 128;
                        if (i19 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                            z = false;
                            int i20 = 96 / 0;
                        } else {
                            z = false;
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        }
                    } else {
                        z = false;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    boolean z2 = z;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    setMainImageUri.IAuthTabCallback(deprecated_authenticator.onWarmupCompleted("icon-arrow-up-circle-mono"), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IAuthTabCallbackStub(), 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult3, 3120, 0, 8164);
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallbackStub(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).isEngagementSignalsApiAvailable()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(z2 ? 1 : 0), Boolean.valueOf(z2), isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(z2 ? 1 : 0), 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i21 = asInterface + 39;
                        IAuthTabCallbackStub = i21 % 128;
                        int i22 = i21 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda24(function0, quirksExternalSyntheticBackport02, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[PHI: r0 r4
      0x0037: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r4v12 int) = (r4v4 int), (r4v13 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0 r4
      0x0028: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r4v5 int) = (r4v4 int), (r4v13 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i5;
        int i6 = 2 % 2;
        int i7 = asInterface + 89;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(460460628);
            i3 = i2 & 1;
            if (i3 != 0) {
                int i8 = IAuthTabCallbackStub + 13;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                i4 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            } else if ((i & 6) == 0) {
                int i10 = IAuthTabCallbackStub + 93;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i12 = IAuthTabCallbackStub + 17;
                    asInterface = i12 % 128;
                    i5 = i12 % 2 == 0 ? 5 : 4;
                } else {
                    i5 = 2;
                }
                i4 = i5 | i;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i4 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(460460628);
            i3 = i2 & 1;
            if (i3 != 0) {
            }
        }
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            int i13 = IAuthTabCallbackStub + 113;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
            int i15 = asInterface + 39;
            IAuthTabCallbackStub = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            quirksExternalSyntheticBackport03 = i3 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = asInterface + 109;
                IAuthTabCallbackStub = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(460460628, i4, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchGuideContent (CashflowSearchScreen.kt:563)");
            }
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport03, 0L, 0.0f, getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onTransact(), 0L, (String) null, deprecated_authenticator.onWarmupCompleted("icon-line-three-search-mono"), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_search_guide_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 & 14) | 3072, 0, 3894);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda0(quirksExternalSyntheticBackport03, i, i2));
        }
    }

    private static final Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            z = true;
        }
        unregisterOutputSurface.onTransact(useandconfigureprogramwithtexture, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        int i;
        boolean z;
        Object obj;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1040826722);
        int i3 = iIntValue2 & 1;
        if (i3 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i4 = IAuthTabCallbackStub + 39;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((i & 3) != 2) {
            int i6 = asInterface + 37;
            IAuthTabCallbackStub = i6 % 128;
            z = i6 % 2 == 0;
        }
        Object obj2 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallbackStub + 3;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (i3 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1040826722, i, -1, "im.toss.features.home.feature.cashflow.screen.CashflowSearchEmptyResultContent (CashflowSearchScreen.kt:575)");
            }
            getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackDefault = getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault();
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R$string.home_v2_feature_cashflow_search_empty_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new CashflowSearchScreenKt$.ExternalSyntheticLambda1();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
            Object[] objArr2 = new Object[1];
            a(new char[]{41959, 56584, 27333, 44771, 44932, 13761, 50210, 26447, 22566, 37712, 62920, 26325, 15367, 7861, 54250, 51700, 20646, 65071, 4805, 11433, 41946, 64096, 48778, 47517, 59240, 62229, 41588, 37122, 2216, 957, 8482, 53681, 8817, 25742, 15054, 59736, 4627, 2354, 45815, 35418, 35087, 8961, 50768, 42759, 8559, 30930, 59240, 62229, 33929, 4301, 3809, 25830, 16997, 11064}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 53, objArr2);
            obj = null;
            x2ExternalSyntheticLambda13.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0L, 0.0f, onextracallbackwithresultIAuthTabCallbackDefault, 0L, (String) null, ((String) objArr2[0]).intern(), 0, strOnExtraCallback, (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1575936, 0, 7862);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda2(onextracallback, iIntValue, iIntValue2));
        }
        int i8 = asInterface + 25;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r4
      0x003d: PHI (r1v5 j$.time.YearMonth) = (r1v4 j$.time.YearMonth), (r1v11 j$.time.YearMonth) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 j$.time.YearMonth) = (r2v2 j$.time.YearMonth), (r2v5 j$.time.YearMonth) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r4v1 java.util.List) = (r4v0 java.util.List), (r4v3 java.util.List) binds: [B:8:0x003b, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<YearMonth> onNavigationEvent(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        YearMonth yearMonthPlusMonths;
        YearMonth yearMonthMinusMonths;
        List listCreateListBuilder;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            yearMonthPlusMonths = yearMonth.plusMonths(1L);
            yearMonthMinusMonths = yearMonth.minusMonths(1L);
            YearMonth yearMonthOnNavigationEvent = onNavigationEvent(rVClientStarter);
            listCreateListBuilder = CollectionsKt.createListBuilder();
            if (!yearMonthPlusMonths.isAfter(yearMonthOnNavigationEvent)) {
                listCreateListBuilder.add(yearMonthPlusMonths);
                int i3 = IAuthTabCallbackStub + 19;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 3;
                }
            }
        } else {
            yearMonthPlusMonths = yearMonth.plusMonths(1L);
            yearMonthMinusMonths = yearMonth.minusMonths(1L);
            YearMonth yearMonthOnNavigationEvent2 = onNavigationEvent(rVClientStarter);
            listCreateListBuilder = CollectionsKt.createListBuilder();
            if (!yearMonthPlusMonths.isAfter(yearMonthOnNavigationEvent2)) {
            }
        }
        listCreateListBuilder.add(yearMonth);
        if (!yearMonthMinusMonths.isBefore(rVClientStarter.IAuthTabCallback())) {
            int i5 = IAuthTabCallbackStub + 29;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                listCreateListBuilder.add(yearMonthMinusMonths);
                throw null;
            }
            listCreateListBuilder.add(yearMonthMinusMonths);
        }
        return CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.build(listCreateListBuilder)));
    }

    private static final YearMonth onNavigationEvent(RVClientStarter rVClientStarter) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            rVClientStarter.onExtraCallback().isAfter(YearMonth.now());
            throw null;
        }
        if (!rVClientStarter.onExtraCallback().isAfter(YearMonth.now())) {
            YearMonth yearMonthNow = YearMonth.now();
            Intrinsics.checkNotNullExpressionValue(yearMonthNow, "");
            return yearMonthNow;
        }
        int i3 = asInterface + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return rVClientStarter.onExtraCallback();
        }
        rVClientStarter.onExtraCallback();
        obj.hashCode();
        throw null;
    }

    private static final YearMonth onNavigationEvent(YearMonth yearMonth) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(yearMonth, "");
        } else {
            Intrinsics.checkNotNullParameter(yearMonth, "");
        }
        YearMonth yearMonthMinusMonths = yearMonth.minusMonths(1L);
        int i3 = IAuthTabCallbackStub + 57;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return yearMonthMinusMonths;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onWarmupCompleted(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        boolean zIsBefore;
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(yearMonth, "");
            zIsBefore = yearMonth.isBefore(rVClientStarter.IAuthTabCallback());
        } else {
            Intrinsics.checkNotNullParameter(yearMonth, "");
            zIsBefore = !yearMonth.isBefore(rVClientStarter.IAuthTabCallback());
        }
        int i3 = asInterface + 89;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zIsBefore;
    }

    private static final List<YearMonth> onExtraCallbackWithResult(RVClientStarter rVClientStarter) {
        int i = 2 % 2;
        List<YearMonth> listAccess000 = clearRevision.access000(clearRevision.onTransact(clearRevision.onExtraCallbackWithResult(rVClientStarter.onExtraCallback(), new CashflowSearchScreenKt$.ExternalSyntheticLambda45()), new CashflowSearchScreenKt$.ExternalSyntheticLambda46(rVClientStarter)));
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return listAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final List<YearMonth> IAuthTabCallback(RVClientStarter rVClientStarter, YearMonth yearMonth) {
        List<YearMonth> listSortedDescending;
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.plus(onExtraCallbackWithResult(rVClientStarter), yearMonth)));
            int i3 = 80 / 0;
        } else {
            listSortedDescending = CollectionsKt.sortedDescending(CollectionsKt.distinct(CollectionsKt.plus(onExtraCallbackWithResult(rVClientStarter), yearMonth)));
        }
        int i4 = asInterface + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return listSortedDescending;
    }

    private static final Unit onExtraCallback(Function1 function1, List list, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 101;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            function1.invoke(list.get(i));
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 65;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        function1.invoke(list.get(i));
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final void onExtraCallback(Context context, Resources resources, YearMonth yearMonth, List<YearMonth> list, Function1<? super YearMonth, Unit> function1) {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = new BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(context).onExtraCallback(R$string.home_v2_feature_cashflow_select_month).onWarmupCompleted(false).onExtraCallback(true);
        List<YearMonth> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallbackStub + 55;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            String string = ((YearMonth) it.next()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(isRemoteExtension.onNavigationEvent(string, CommonModule_closeView.onWarmupCompleted.extraCallbackWithResult(), CheckMask.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult(), resources));
            int i4 = IAuthTabCallbackStub + 125;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        Object[] objArr = {iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(arrayList).onExtraCallback(new CashflowSearchScreenKt$.ExternalSyntheticLambda47(function1, list)).IAuthTabCallback(list.indexOf(yearMonth))};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        ((BrickModuleImplExternalSyntheticLambda1) BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback.onExtraCallback(objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
    }

    private static final int IAuthTabCallback(getTyroBlockTime.onNavigationEvent.IAuthTabCallback iAuthTabCallback) {
        List listOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (iAuthTabCallback != null && (listOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted()) != null) {
            return listOnWarmupCompleted.size();
        }
        int i3 = asInterface + 87;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<Camera2CameraImplExternalSyntheticLambda2, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ float $distanceToTop;
        final /* synthetic */ Ref.FloatRef $previousValue;
        final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 $this_animateScrollToTopContinuously;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(float f, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Ref.FloatRef floatRef, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$distanceToTop = f;
            this.$this_animateScrollToTopContinuously = camera2CameraMetadataExternalSyntheticLambda1;
            this.$previousValue = floatRef;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Ref.FloatRef floatRef, Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2, float f, float f2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, floatRef, camera2CameraImplExternalSyntheticLambda2, f, f2);
                obj.hashCode();
                throw null;
            }
            Unit unitIAuthTabCallback = IAuthTabCallback(camera2CameraMetadataExternalSyntheticLambda1, floatRef, camera2CameraImplExternalSyntheticLambda2, f, f2);
            int i3 = onNavigationEvent + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$distanceToTop, this.$this_animateScrollToTopContinuously, this.$previousValue, access13800Var);
            iAuthTabCallbackStubProxy.L$0 = obj;
            int i2 = onNavigationEvent + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((Camera2CameraImplExternalSyntheticLambda2) obj, (access13800) obj2);
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final Object onExtraCallbackWithResult(Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(camera2CameraImplExternalSyntheticLambda2, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Ref.FloatRef floatRef, Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2, float f, float f2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!getDefaultValue.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1)) {
                floatRef.element += camera2CameraImplExternalSyntheticLambda2.a_(f - floatRef.element);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Camera2CameraImplExternalSyntheticLambda2 camera2CameraImplExternalSyntheticLambda2 = (Camera2CameraImplExternalSyntheticLambda2) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 49;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                float f = -this.$distanceToTop;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(420, 0, setSubmitButtonEnabled.onWarmupCompleted(), 2, (Object) null);
                CashflowSearchScreenKt$animateScrollToTopContinuously$2$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new CashflowSearchScreenKt$animateScrollToTopContinuously$2$.ExternalSyntheticLambda0(this.$this_animateScrollToTopContinuously, this.$previousValue, camera2CameraImplExternalSyntheticLambda2);
                this.L$0 = access15400.onNavigationEvent(camera2CameraImplExternalSyntheticLambda2);
                this.label = 1;
                if (getShowText.onWarmupCompleted(0.0f, f, 0.0f, getthumbpositionOnExtraCallbackWithResult, externalSyntheticLambda0, this, 4, (Object) null) == objOnWarmupCompleted) {
                    int i4 = onNavigationEvent + 13;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onNavigationEvent + 69;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 33 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        int iOnNavigationEvent = 0;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = (Camera2CameraMetadataExternalSyntheticLambda1) objArr[0];
        int i = 2 % 2;
        List listOnTransact = camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onTransact();
        if (listOnTransact.isEmpty()) {
            return Float.valueOf(0.0f);
        }
        Iterator it = listOnTransact.iterator();
        while (it.hasNext()) {
            int i2 = asInterface + 25;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iOnNavigationEvent += ((Camera2CameraControlExternalSyntheticLambda7) it.next()).onNavigationEvent();
            int i4 = asInterface + 93;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return Float.valueOf((camera2CameraMetadataExternalSyntheticLambda1.asBinder() * ((iOnNavigationEvent / listOnTransact.size()) + camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().onExtraCallback())) + camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub() + ((int) camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallback_Parcel().asBinder()));
    }

    private static final boolean IAuthTabCallback(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            camera2CameraMetadataExternalSyntheticLambda1.asBinder();
            throw null;
        }
        if (camera2CameraMetadataExternalSyntheticLambda1.asBinder() != 0) {
            return false;
        }
        int i3 = IAuthTabCallbackStub + 125;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub() == 0;
        }
        camera2CameraMetadataExternalSyntheticLambda1.IAuthTabCallbackStub();
        throw null;
    }

    private static final decrementVideoUsage onExtraCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        CashflowSearchScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new CashflowSearchScreenKt$.ExternalSyntheticLambda8(function0);
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(externalSyntheticLambda8);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(textFieldScrollKtExternalSyntheticLambda0, externalSyntheticLambda8);
        int i2 = asInterface + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    private static final String IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = IAuthTabCallbackStub + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallbackStub + 61;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = asInterface + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private static final LocalDate onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<LocalDate> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        LocalDate localDate = (LocalDate) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return localDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<LocalDate> getsupportedhighspeedresolutionsfor, LocalDate localDate) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(localDate);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = IAuthTabCallbackStub + 87;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{41959, 56584, 27333, 44771, 44932, 13761, 50210, 26447, 22566, 37712, 62920, 26325, 15367, 7861, 54250, 51700, 20646, 65071, 4805, 11433, 41946, 64096, 48778, 47517, 59240, 62229, 41588, 37122, 2216, 957, 8482, 53681, 8817, 25742, 15054, 59736, 4627, 2354, 45815, 35418, 35087, 8961, 50768, 42759, 8559, 30930, 59240, 62229, 33929, 4301, 3809, 25830, 16997, 11064}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54, objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(96.0f);
        onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(320.0f);
        int i = IAuthTabCallbackDefault + 71;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, ParcelUtils.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1227830684, -1227830684, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, String str, Function1 function1, Function1 function12, equalsParamTypes equalsparamtypes, boolean z, collectExtensionPoint collectextensionpoint, YearMonth yearMonth, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, List list, Map map, findResAndMsg findresandmsg, Function1 function13, Function1 function14, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1, str, function1, function12, equalsparamtypes, Boolean.valueOf(z), collectextensionpoint, yearMonth, getsupportedhighspeedresolutionsfor, list, map, findresandmsg, function13, function14, cameraPresenceProviderExternalSyntheticLambda6, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 545835939, -545835918, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallback(new Object[]{useandconfigureprogramwithtexture}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -600276709, 600276718, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(getRelatedFixedSize getrelatedfixedsize, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2) {
        return (Unit) onExtraCallback(new Object[]{getrelatedfixedsize, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 283281445, -283281423, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        return (Unit) onExtraCallback(new Object[]{findresandmsg, camera2CameraMetadataExternalSyntheticLambda1}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1975369017, -1975369009, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(CashflowSearchViewModel cashflowSearchViewModel, Function2 function2, String str, String str2, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        return (Unit) onExtraCallback(new Object[]{cashflowSearchViewModel, function2, str, str2, iAuthTabCallback}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1357379392, 1357379415, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onExtraCallback(new Object[]{function0, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1664618608, -1664618604, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, Resources resources, ParcelUtils.onWarmupCompleted onwarmupcompleted, List list, Function1 function1) {
        return (Unit) onExtraCallback(new Object[]{context, resources, onwarmupcompleted, list, function1}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1560662077, -1560662075, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallback(new Object[]{useandconfigureprogramwithtexture}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -745920940, 745920955, ACPayResult.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallback(new Object[]{useandconfigureprogramwithtexture}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1304002177, 1304002197, ACPayResult.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(List list, ParcelUtils.onWarmupCompleted onwarmupcompleted, Function0 function0, Function0 function02, Context context, Resources resources, List list2, Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{list, onwarmupcompleted, function0, function02, context, resources, list2, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1105820501, 1105820508, ACPayResult.onWarmupCompleted());
    }

    private static final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult() {
        return (getSupportedHighSpeedResolutionsFor) onExtraCallback(new Object[0], ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 991478946, -991478943, ACPayResult.onWarmupCompleted());
    }

    private static final void IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1815798346, 1815798365, ACPayResult.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallback(String str, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallback(new Object[]{str, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1913530853, -1913530829, ACPayResult.onWarmupCompleted());
    }

    public static final void onExtraCallback(@Nullable CashflowSearchViewModel cashflowSearchViewModel, @Nullable Function1<? super String, Unit> function1, @Nullable Function2<? super String, ? super DefaultLoggerProxyImpl.IAuthTabCallback, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{cashflowSearchViewModel, function1, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 647602251, -647602239, ACPayResult.onWarmupCompleted());
    }

    private static final Unit onNavigationEvent(CashflowSearchViewModel cashflowSearchViewModel, ParcelUtils parcelUtils, Function1 function1, DefaultLoggerProxyImpl.IAuthTabCallback iAuthTabCallback) {
        return (Unit) onExtraCallback(new Object[]{cashflowSearchViewModel, parcelUtils, function1, iAuthTabCallback}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1859413054, 1859413070, ACPayResult.onWarmupCompleted());
    }

    private static final Unit onExtraCallback(CashflowSearchViewModel cashflowSearchViewModel) {
        return (Unit) onExtraCallback(new Object[]{cashflowSearchViewModel}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1656008877, 1656008895, ACPayResult.onWarmupCompleted());
    }

    private static final ParcelUtils onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<? extends ParcelUtils> cameraPresenceProviderExternalSyntheticLambda6) {
        return (ParcelUtils) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -676549730, 676549735, ACPayResult.onWarmupCompleted());
    }

    private static final boolean IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        return ((Boolean) onExtraCallback(new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1773060278, 1773060284, ACPayResult.onWarmupCompleted())).booleanValue();
    }

    private static final Unit IAuthTabCallback(equalsParamTypes equalsparamtypes, boolean z, List list, collectExtensionPoint collectextensionpoint, Function1 function1, Function1 function12, String str, Function1 function13, Function1 function14, YearMonth yearMonth, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Map map, findResAndMsg findresandmsg, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        return (Unit) onExtraCallback(new Object[]{equalsparamtypes, Boolean.valueOf(z), list, collectextensionpoint, function1, function12, str, function13, function14, yearMonth, getsupportedhighspeedresolutionsfor, map, findresandmsg, camera2CameraMetadataExternalSyntheticLambda1, audioRestrictionControllerImplExternalSyntheticLambda0}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 365915616, -365915606, ACPayResult.onWarmupCompleted());
    }

    private static final Unit onWarmupCompleted(Map map, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, LocalDate localDate) {
        return (Unit) onExtraCallback(new Object[]{map, findresandmsg, getsupportedhighspeedresolutionsfor, camera2CameraMetadataExternalSyntheticLambda1, localDate}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1516854662, -1516854651, ACPayResult.onWarmupCompleted());
    }

    private static final Object onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, access13800<? super Unit> access13800Var) {
        return onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1, access13800Var}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 648843515, -648843501, ACPayResult.onWarmupCompleted());
    }

    private static final float onWarmupCompleted(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1) {
        return ((Float) onExtraCallback(new Object[]{camera2CameraMetadataExternalSyntheticLambda1}, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 470998201, -470998184, ACPayResult.onWarmupCompleted())).floatValue();
    }

    static void onExtraCallback() {
        onNavigationEvent = (char) 5121;
        IAuthTabCallback = (char) 18915;
        onTransact = (char) 10116;
        asBinder = (char) 60533;
    }
}
