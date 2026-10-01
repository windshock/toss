package o;

import im.toss.features.leave.common.nav.CancellationServiceNav;
import im.toss.features.leave.common.nav.CancellationServiceNav$CancelInProgress;
import im.toss.features.leave.common.nav.CancellationServiceNav$ServiceList;
import im.toss.features.leave.common.nav.LeaveNav$CancellationServiceNavRoot;
import im.toss.features.leave.ui.cancel.CancellationServiceGraphKt$;
import im.toss.features.leave.ui.cancel.detail.CancellationServiceDetailViewModel;
import im.toss.features.leave.ui.cancel.list.CancellationServiceListViewModel;
import im.toss.features.leave.ui.cancel.progress.CancellationServiceProcessViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.PullRefreshIndicatorKtExternalSyntheticLambda3;
import o.TimeoutCompanionNONE1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVPluginResourceManager {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(function0);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0);
        int i3 = onWarmupCompleted + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = ~i3;
        int i12 = i9 | (~(i11 | i4));
        int i13 = (~(i6 | i7 | i3)) | (~(i8 | i11 | i7));
        int i14 = i4 + i3 + i2 + ((-619979367) * i) + (68302741 * i5);
        int i15 = i14 * i14;
        int i16 = (i4 * 561304900) + 382271488 + (561304900 * i3) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i2) + (1615200256 * i) + ((-1821507584) * i5) + (428933120 * i15);
        int i17 = ((i4 * (-96142684)) - 56799437) + (i3 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i2 * (-96141863)) + (i * (-1380774991)) + (i5 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, str);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0, str);
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function1 function1, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{typographyKtExternalSyntheticLambda0, function1, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 95005865, -95005863, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        }
        int i4 = 3 / 0;
        return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{typographyKtExternalSyntheticLambda0, function1, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 95005865, -95005863, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setpopupcontentsizefhxjrpa);
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function1 function1, Function0 function0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(typographyKtExternalSyntheticLambda0, function1, function0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        }
        onNavigationEvent(typographyKtExternalSyntheticLambda0, function1, function0, exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(typographyKtExternalSyntheticLambda0);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pullRefreshIndicatorKtExternalSyntheticLambda5);
        int i4 = onWarmupCompleted + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[0];
        RVResourcePresetProxyInputStreamGetter rVResourcePresetProxyInputStreamGetter = (RVResourcePresetProxyInputStreamGetter) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(typographyKtExternalSyntheticLambda0, rVResourcePresetProxyInputStreamGetter);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, typographyKtExternalSyntheticLambda0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pullRefreshIndicatorKtExternalSyntheticLambda5, "");
        pullRefreshIndicatorKtExternalSyntheticLambda5.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setpopupcontentsizefhxjrpa, "");
        setpopupcontentsizefhxjrpa.onNavigationEvent(Reflection.getOrCreateKotlinClass(CancellationServiceNav$ServiceList.class), new CancellationServiceGraphKt$.ExternalSyntheticLambda4());
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        typographyKtExternalSyntheticLambda0.onExtraCallback(CancellationServiceNav$CancelInProgress.INSTANCE, new CancellationServiceGraphKt$.ExternalSyntheticLambda3());
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        TypographyKtExternalSyntheticLambda0.onExtraCallback(typographyKtExternalSyntheticLambda0, new CancellationServiceNav.ServiceDetail(str), (setPositionProvider) null, (PullRefreshIndicatorKtExternalSyntheticLambda3.IAuthTabCallback) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function0.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 44 / 0;
            }
            return unit;
        }
        function0.invoke();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0 = (TypographyKtExternalSyntheticLambda0) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        setDividerDrawable setdividerdrawable = (setDividerDrawable) objArr[3];
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0 = (TwoLineExternalSyntheticLambda0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setdividerdrawable, "");
            Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj4.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1290449685, iIntValue, -1, "im.toss.features.leave.ui.cancel.cancellationServiceGraph.<anonymous>.<anonymous> (CancellationServiceGraph.kt:20)");
            int i3 = onWarmupCompleted + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CancellationServiceGraphKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new CancellationServiceGraphKt$.ExternalSyntheticLambda5(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                obj = externalSyntheticLambda5;
            }
        }
        Function1 function12 = (Function1) obj;
        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback2) {
            obj2 = objOnMinimized2;
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CancellationServiceGraphKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new CancellationServiceGraphKt$.ExternalSyntheticLambda6(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                obj2 = externalSyntheticLambda6;
            }
        }
        Function0 function02 = (Function0) obj2;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i5 = onWarmupCompleted + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            obj3 = objOnMinimized3;
            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CancellationServiceGraphKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new CancellationServiceGraphKt$.ExternalSyntheticLambda7(function0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda7);
                int i6 = onExtraCallback + 83;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                obj3 = externalSyntheticLambda7;
            }
        }
        RVResourceEnviromentProxy.onWarmupCompleted((CancellationServiceListViewModel) null, function12, function02, function1, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallback + 117;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                obj4.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setdividerdrawable, "");
            Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2080477342, i, -1, "im.toss.features.leave.ui.cancel.cancellationServiceGraph.<anonymous>.<anonymous> (CancellationServiceGraph.kt:39)");
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new CancellationServiceGraphKt$.ExternalSyntheticLambda10(function0);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        saveAppModelList.IAuthTabCallback((Function0) objOnMinimized, (CancellationServiceDetailViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r0
      0x003b: PHI (r0v2 o.TextLinkScopeExternalSyntheticLambda7) = (r0v1 o.TextLinkScopeExternalSyntheticLambda7), (r0v3 o.TextLinkScopeExternalSyntheticLambda7) binds: [B:12:0x0039, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, RVResourcePresetProxyInputStreamGetter rVResourcePresetProxyInputStreamGetter) {
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7OnTransact;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rVResourcePresetProxyInputStreamGetter, "");
            CancellationServiceNav$CancelInProgress.INSTANCE.toString();
            typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
            throw null;
        }
        Intrinsics.checkNotNullParameter(rVResourcePresetProxyInputStreamGetter, "");
        String string = CancellationServiceNav$CancelInProgress.INSTANCE.toString();
        TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy = typographyKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy();
        if (twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy != null) {
            int i3 = onExtraCallback + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                int i4 = 96 / 0;
                if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                    textLinkScopeExternalSyntheticLambda7OnTransact.onWarmupCompleted(string, rVResourcePresetProxyInputStreamGetter);
                }
            } else {
                textLinkScopeExternalSyntheticLambda7OnTransact = twoLineExternalSyntheticLambda0IAuthTabCallbackStubProxy.onTransact();
                if (textLinkScopeExternalSyntheticLambda7OnTransact != null) {
                }
            }
        }
        typographyKtExternalSyntheticLambda0.getInterfaceDescriptor();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Function1 function1, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setdividerdrawable, "");
        Intrinsics.checkNotNullParameter(twoLineExternalSyntheticLambda0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 13;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(66089123, i, -1, "im.toss.features.leave.ui.cancel.cancellationServiceGraph.<anonymous>.<anonymous> (CancellationServiceGraph.kt:47)");
                int i4 = 79 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(66089123, i, -1, "im.toss.features.leave.ui.cancel.cancellationServiceGraph.<anonymous>.<anonymous> (CancellationServiceGraph.kt:47)");
            }
        }
        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(typographyKtExternalSyntheticLambda0);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                CancellationServiceGraphKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new CancellationServiceGraphKt$.ExternalSyntheticLambda9(typographyKtExternalSyntheticLambda0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                int i5 = onWarmupCompleted + 3;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                obj = externalSyntheticLambda9;
            }
        }
        RVResourcePackageProxyPackageLoadCallback.onWarmupCompleted((CancellationServiceProcessViewModel) null, function1, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 105;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = 22 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function1 function1, Function0 function0, ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1290449685, true, new CancellationServiceGraphKt$.ExternalSyntheticLambda0(typographyKtExternalSyntheticLambda0, function1, function0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(CancellationServiceNav$ServiceList.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2 = ForwardingCameraControl.onExtraCallbackWithResult(-2080477342, true, new CancellationServiceGraphKt$.ExternalSyntheticLambda1(function0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(CancellationServiceNav.ServiceDetail.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult2);
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3 = ForwardingCameraControl.onExtraCallbackWithResult(66089123, true, new CancellationServiceGraphKt$.ExternalSyntheticLambda2(function1, typographyKtExternalSyntheticLambda0));
        RippleContainer.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, Reflection.getOrCreateKotlinClass(CancellationServiceNav$CancelInProgress.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, encoderProfilesProxyVideoProfileProxyOnExtraCallbackWithResult3);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallbackWithResult(@NotNull ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CancellationServiceNav$ServiceList cancellationServiceNav$ServiceList = CancellationServiceNav$ServiceList.INSTANCE;
        CancellationServiceGraphKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new CancellationServiceGraphKt$.ExternalSyntheticLambda8(typographyKtExternalSyntheticLambda0, function1, function0);
        RippleContainer.onExtraCallback(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda8, cancellationServiceNav$ServiceList, Reflection.getOrCreateKotlinClass(LeaveNav$CancellationServiceNavRoot.class), access8100.onNavigationEvent(), CollectionsKt.emptyList(), (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, externalSyntheticLambda8);
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{typographyKtExternalSyntheticLambda0}, 1573066793, -1573066792, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{function0}, -130820561, 130820561, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, RVResourcePresetProxyInputStreamGetter rVResourcePresetProxyInputStreamGetter) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{typographyKtExternalSyntheticLambda0, rVResourcePresetProxyInputStreamGetter}, -1185693385, 1185693388, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final Unit onExtraCallbackWithResult(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, Function1 function1, Function0 function0, setDividerDrawable setdividerdrawable, TwoLineExternalSyntheticLambda0 twoLineExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {typographyKtExternalSyntheticLambda0, function1, function0, setdividerdrawable, twoLineExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onExtraCallback(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, 95005865, -95005863, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted);
    }
}
