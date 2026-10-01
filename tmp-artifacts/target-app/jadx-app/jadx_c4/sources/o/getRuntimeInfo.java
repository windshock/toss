package o;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.feature.credit.ui.main.R;
import im.toss.features.credit.data.response.CreditHomeHeaderItem;
import im.toss.features.credit.data.response.ScoreDeltaInfo;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getRuntimeInfo;
import o.getStreamSharingChildren;
import o.handleNativeAdClick;
import o.oExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getRuntimeInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(function0);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i3 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, ScoreDeltaInfo scoreDeltaInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(quirksExternalSyntheticBackport0, scoreDeltaInfo, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(quirksExternalSyntheticBackport0, scoreDeltaInfo, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(creditHomeHeaderItem, i);
        int i5 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 41 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(function2, i, creditHomeHeaderItem);
        }
        onWarmupCompleted(function2, i, creditHomeHeaderItem);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, creditHomeHeaderItem, i);
        int i5 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted((Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ScoreDeltaInfo scoreDeltaInfo = (ScoreDeltaInfo) objArr[0];
        List list = (List) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function2 function2 = (Function2) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        Function2 function22 = (Function2) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        Function0 function02 = (Function0) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {scoreDeltaInfo, list, function1, function2, function0, function22, Boolean.valueOf(zBooleanValue), function02, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(1206629763, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, objArr2, -1206629762);
        int i4 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, i, creditHomeHeaderItem);
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(1499027932, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{function2, creditHomeHeaderItem, Integer.valueOf(i)}, -1499027928);
        int i5 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, ScoreDeltaInfo scoreDeltaInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            i |= 1;
        }
        onWarmupCompleted(quirksExternalSyntheticBackport0, scoreDeltaInfo, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i) | i6);
        int i8 = ~i5;
        int i9 = i7 | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i);
        int i13 = (~(i8 | i)) | i11 | i12;
        int i14 = (~(i5 | i10)) | i12;
        int i15 = i + i6 + i2 + (1039959776 * i3) + ((-2046201414) * i4);
        int i16 = i15 * i15;
        int i17 = ((i * 868240256) - 1765242424) + (i6 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (868239597 * i2) + (817356128 * i3) + (406493490 * i4) + (i16 * 645267456);
        int i18 = ((357140864 * i) - 8388608) + ((-1785926397) * i6) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i2) + ((-201326592) * i3) + ((-406847488) * i4) + (529399808 * i16) + (i17 * i17 * 681705472);
        if (i18 != 1) {
            return i18 != 2 ? i18 != 3 ? i18 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }
        ScoreDeltaInfo scoreDeltaInfo = (ScoreDeltaInfo) objArr[0];
        List list = (List) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function2 function2 = (Function2) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        Function2 function22 = (Function2) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        Function0 function02 = (Function0) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        ((Number) objArr[11]).intValue();
        int i19 = 2 % 2;
        int i20 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        onWarmupCompleted(1726095641, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{scoreDeltaInfo, list, function1, function2, function0, function22, Boolean.valueOf(zBooleanValue), function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)}, -1726095641);
        Unit unit = Unit.INSTANCE;
        int i22 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-13808592, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], 13808594);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(creditHomeHeaderItem, i);
        }
        onNavigationEvent(creditHomeHeaderItem, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, ScoreDeltaInfo scoreDeltaInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, scoreDeltaInfo);
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            unit = Unit.INSTANCE;
            int i4 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            unit = Unit.INSTANCE;
        }
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        int i4 = 58 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, ScoreDeltaInfo scoreDeltaInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(scoreDeltaInfo.onNavigationEvent());
        if (i3 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
        if (i4 != 0) {
            unit = Unit.INSTANCE;
            int i5 = 15 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i6 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
        int i4 = 54 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(iIntValue));
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Function2 function2, int i, CreditHomeHeaderItem creditHomeHeaderItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
            function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(creditHomeHeaderItem, "");
        function2.invoke(creditHomeHeaderItem, Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20, types: [im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda11, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        Function2 function2;
        int i2;
        int i3;
        Function2 function22;
        int i4;
        final ScoreDeltaInfo scoreDeltaInfo;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i5;
        int i6;
        Object obj;
        Function0 function0;
        final Function0 function02;
        final Function2 function23;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function24;
        Function2 function25;
        Function1 function1;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        boolean z;
        Object obj2;
        final Function2 function26;
        Function0 function03;
        Object obj3;
        boolean z2;
        final Function2 function27;
        Object obj4;
        final Function2 function28;
        Function2 function29;
        int i7;
        int i8;
        ScoreDeltaInfo scoreDeltaInfo2 = (ScoreDeltaInfo) objArr[0];
        final List list = (List) objArr[1];
        final Function1 function12 = (Function1) objArr[2];
        Function2 function210 = (Function2) objArr[3];
        final Function0 function04 = (Function0) objArr[4];
        Function2 function211 = (Function2) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        Function0 function05 = (Function0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(scoreDeltaInfo2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function04, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1692652468);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreDeltaInfo2)) {
                int i10 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i = i8 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12)) {
                int i12 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i12 % 128;
                i7 = i12 % 2 != 0 ? 3860 : 256;
            } else {
                i7 = 128;
            }
            i |= i7;
        }
        int i13 = iIntValue2 & 8;
        if (i13 != 0) {
            i |= 3072;
        } else if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function210) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 16384 : 8192;
        }
        int i14 = iIntValue2 & 32;
        int i15 = 196608;
        if (i14 != 0) {
            i |= i15;
        } else if ((iIntValue & 196608) == 0) {
            i15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function211) ? 131072 : 65536;
            i |= i15;
        }
        int i16 = iIntValue2 & 64;
        if (i16 != 0) {
            i |= 1572864;
        } else {
            if ((iIntValue & 1572864) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                    int i17 = onExtraCallbackWithResult + 69;
                    function2 = function210;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = 75 / 0;
                    }
                    i2 = 1048576;
                } else {
                    function2 = function210;
                    i2 = 524288;
                }
                i |= i2;
            }
            i3 = iIntValue2 & 128;
            if (i3 != 0) {
                if ((iIntValue & 12582912) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function05)) {
                        int i19 = onExtraCallbackWithResult + 31;
                        function22 = function211;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 != 0) {
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        i4 = 8388608;
                    } else {
                        function22 = function211;
                        i4 = 4194304;
                    }
                    i |= i4;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i) != 4793490, i & 1)) {
                    if (i13 != 0) {
                        int i20 = IAuthTabCallback + 121;
                        onExtraCallbackWithResult = i20 % 128;
                        if (i20 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        ?? OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        Function2 function212 = OnMinimized;
                        if (OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function2 function213 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda3
                                private static int onExtraCallbackWithResult = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj6, Object obj7) {
                                    int i21 = 2 % 2;
                                    int i22 = onExtraCallbackWithResult + 75;
                                    onNavigationEvent = i22 % 128;
                                    int i23 = i22 % 2;
                                    Unit unitOnExtraCallback = getRuntimeInfo.onExtraCallback((CreditHomeHeaderItem) obj6, ((Integer) obj7).intValue());
                                    int i24 = onExtraCallbackWithResult + 69;
                                    onNavigationEvent = i24 % 128;
                                    int i25 = i24 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function213);
                            function212 = function213;
                        }
                        function24 = function212;
                    } else {
                        function24 = function2;
                    }
                    if (i14 != 0) {
                        int i21 = onExtraCallbackWithResult + 89;
                        IAuthTabCallback = i21 % 128;
                        if (i21 % 2 != 0) {
                            ?? OnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            int i22 = 19 / 0;
                            function29 = OnMinimized2;
                            if (OnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function2 function214 = new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj6, Object obj7) {
                                        int i23 = 2 % 2;
                                        int i24 = onNavigationEvent + 31;
                                        IAuthTabCallback = i24 % 128;
                                        int i25 = i24 % 2;
                                        CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        if (i25 != 0) {
                                            return getRuntimeInfo.onWarmupCompleted(creditHomeHeaderItem, iIntValue3);
                                        }
                                        getRuntimeInfo.onWarmupCompleted(creditHomeHeaderItem, iIntValue3);
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function214);
                                function29 = function214;
                            }
                            function25 = function29;
                        } else {
                            ?? OnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            function29 = OnMinimized3;
                            if (OnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            function25 = function29;
                        }
                    } else {
                        function25 = function22;
                    }
                    if (i16 != 0) {
                        zBooleanValue = false;
                    }
                    if (i3 != 0) {
                        ?? OnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        Function0 function06 = OnMinimized4;
                        if (OnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function07 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda5
                                private static int onExtraCallbackWithResult = 1;
                                private static int onNavigationEvent;

                                public final Object invoke() {
                                    int i23 = 2 % 2;
                                    int i24 = onNavigationEvent + 1;
                                    onExtraCallbackWithResult = i24 % 128;
                                    Object obj6 = null;
                                    if (i24 % 2 == 0) {
                                        getRuntimeInfo.onWarmupCompleted();
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnWarmupCompleted = getRuntimeInfo.onWarmupCompleted();
                                    int i25 = onNavigationEvent + 61;
                                    onExtraCallbackWithResult = i25 % 128;
                                    if (i25 % 2 != 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    obj6.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function07);
                            function06 = function07;
                        }
                        function05 = function06;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1692652468, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeReportCard (CreditHomeReportCard.kt:49)");
                    }
                    RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                    boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = focusMeteringControlExternalSyntheticLambda12.onExtraCallback();
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    i6 = iIntValue2;
                    QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
                    i5 = iIntValue;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    Function0 function08 = function05;
                    Function2 function215 = function24;
                    Function2 function216 = function25;
                    int i23 = i;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 2, (Object) null), zOnExtraCallbackWithResult ? ByteOrderedDataOutputStream.onExtraCallback(148034044) : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4294769916L), roundedCornerShapeOnNavigationEvent), roundedCornerShapeOnNavigationEvent), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), ByteOrderedDataOutputStream.onExtraCallback(zOnExtraCallbackWithResult ? 83892019 : Integer.MAX_VALUE), roundedCornerShapeOnNavigationEvent);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResult, 54);
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
                        int i24 = onExtraCallbackWithResult + 81;
                        function1 = function12;
                        IAuthTabCallback = i24 % 128;
                        if (i24 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                            Object obj6 = null;
                            obj6.hashCode();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        function1 = function12;
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    RoundedCornerShape roundedCornerShapeOnNavigationEvent2 = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                    boolean z3 = zBooleanValue && !list.isEmpty();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                    boolean z4 = (i23 & 57344) == 16384;
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!z4) {
                        Object obj7 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function09 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i25 = 2 % 2;
                                    int i26 = onNavigationEvent + 37;
                                    onExtraCallbackWithResult = i26 % 128;
                                    int i27 = i26 % 2;
                                    Unit unitOnExtraCallbackWithResult = getRuntimeInfo.onExtraCallbackWithResult(function04);
                                    int i28 = onNavigationEvent + 73;
                                    onExtraCallbackWithResult = i28 % 128;
                                    int i29 = i28 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function09);
                            obj7 = function09;
                        }
                        function0 = function04;
                        boolean z5 = z3;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, 0.0f, null, (Function0) obj7, cameraCaptureResultEmptyCameraCaptureResult, 6, 3), roundedCornerShapeOnNavigationEvent2, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), ByteOrderedDataOutputStream.onExtraCallback(117440512), 0.0f, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) << 32)), 0.0f, 0, 52, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent2, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), ByteOrderedDataOutputStream.onExtraCallback(117440512), 0.0f, 0L, 0.0f, 0, 60, (DefaultConstructorMarker) null)), roundedCornerShapeOnNavigationEvent2);
                        if (zOnExtraCallbackWithResult) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(822388591);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            jOnNavigationEvent = ByteOrderedDataOutputStream.onExtraCallback(131257084);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(822389999);
                            jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jOnNavigationEvent, (toMetersPerSecond) null, 2, (Object) null);
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f);
                        if (zOnExtraCallbackWithResult) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(822391951);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            jOnNavigationEvent2 = ByteOrderedDataOutputStream.onExtraCallback(83892019);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(822393359);
                            jOnNavigationEvent2 = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback3, fIAuthTabCallback, jOnNavigationEvent2, roundedCornerShapeOnNavigationEvent2);
                        component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback4);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                        if ((i23 & 896) == 256) {
                            z = true;
                            scoreDeltaInfo = scoreDeltaInfo2;
                        } else {
                            scoreDeltaInfo = scoreDeltaInfo2;
                            z = false;
                        }
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreDeltaInfo);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((z || zOnExtraCallback) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            function12 = function1;
                            Function0 function010 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda7
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke() {
                                    int i25 = 2 % 2;
                                    int i26 = onNavigationEvent + 99;
                                    onWarmupCompleted = i26 % 128;
                                    int i27 = i26 % 2;
                                    Function1 function13 = function12;
                                    if (i27 != 0) {
                                        return getRuntimeInfo.onWarmupCompleted(function13, scoreDeltaInfo);
                                    }
                                    getRuntimeInfo.onWarmupCompleted(function13, scoreDeltaInfo);
                                    Object obj8 = null;
                                    obj8.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function010);
                            obj2 = function010;
                        } else {
                            function12 = function1;
                            obj2 = objOnMinimized2;
                        }
                        onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback5, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, (Function0) obj2, 251, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(19.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f)), scoreDeltaInfo, cameraCaptureResultEmptyCameraCaptureResult, (i23 << 3) & 112, 0);
                        if (z5) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(427929126);
                            rotateYUV.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 390, 8);
                            onPageLoadError.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1371661105);
                            final int i25 = 0;
                            for (Object obj8 : list) {
                                if (i25 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final CreditHomeHeaderItem creditHomeHeaderItem = (CreditHomeHeaderItem) obj8;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                boolean z6 = (458752 & i23) == 131072;
                                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeHeaderItem);
                                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i25);
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (((z6 || zOnExtraCallback2) || zOnExtraCallback3) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    function27 = function216;
                                    Function0 function011 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda8
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke() {
                                            int i26 = 2 % 2;
                                            int i27 = onExtraCallbackWithResult + 69;
                                            onExtraCallback = i27 % 128;
                                            int i28 = i27 % 2;
                                            Function2 function217 = function27;
                                            if (i28 == 0) {
                                                return getRuntimeInfo.onExtraCallback(function217, creditHomeHeaderItem, i25);
                                            }
                                            getRuntimeInfo.onExtraCallback(function217, creditHomeHeaderItem, i25);
                                            Object obj9 = null;
                                            obj9.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function011);
                                    obj4 = function011;
                                } else {
                                    function27 = function216;
                                    obj4 = objOnMinimized3;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback2, 0.0f, null, (Function0) obj4, cameraCaptureResultEmptyCameraCaptureResult, 6, 3);
                                boolean z7 = (i23 & 7168) == 2048;
                                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i25);
                                Function1 function1OnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z7 | zOnExtraCallback4)) {
                                    int i26 = onExtraCallbackWithResult + 13;
                                    IAuthTabCallback = i26 % 128;
                                    if (i26 % 2 != 0) {
                                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                        throw null;
                                    }
                                    if (function1OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        function28 = function215;
                                        function1OnMinimized = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda9
                                            private static int onExtraCallbackWithResult = 1;
                                            private static int onWarmupCompleted;

                                            public final Object invoke(Object obj9) {
                                                int i27 = 2 % 2;
                                                int i28 = onWarmupCompleted + 23;
                                                onExtraCallbackWithResult = i28 % 128;
                                                int i29 = i28 % 2;
                                                Unit unitOnNavigationEvent = getRuntimeInfo.onNavigationEvent(function28, i25, (CreditHomeHeaderItem) obj9);
                                                int i30 = onExtraCallbackWithResult + 69;
                                                onWarmupCompleted = i30 % 128;
                                                if (i30 % 2 != 0) {
                                                    int i31 = 90 / 0;
                                                }
                                                return unitOnNavigationEvent;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((Object) function1OnMinimized);
                                    } else {
                                        function28 = function215;
                                    }
                                }
                                printVisualizationLog.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted3, creditHomeHeaderItem, true, false, 0L, null, function1OnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 3456, 48);
                                i25++;
                                function216 = function27;
                                function215 = function28;
                            }
                            function26 = function215;
                            function23 = function216;
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            onPageLoadError.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            function26 = function215;
                            function23 = function216;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(428594138);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (zBooleanValue || list.isEmpty()) {
                            obj = null;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-273863260);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-274427367);
                            onPageLoadError.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact2 = QuirkSettingsLoader.Companion.onTransact();
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                            component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onnavigationeventOnTransact2, cameraCaptureResultEmptyCameraCaptureResult, 48);
                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback3);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
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
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent3, onextracallbackwithresult3.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1420926484);
                            final int i27 = 0;
                            for (Object obj9 : list) {
                                if (i27 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final CreditHomeHeaderItem creditHomeHeaderItem2 = (CreditHomeHeaderItem) obj9;
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = QuirksExternalSyntheticBackport0.Companion;
                                boolean z8 = (458752 & i23) == 131072;
                                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(creditHomeHeaderItem2);
                                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i27);
                                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z8 | zOnExtraCallback5 | zOnExtraCallback6)) {
                                    obj3 = objOnMinimized4;
                                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Function0 function012 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda10
                                            private static int IAuthTabCallback = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke() {
                                                int i28 = 2 % 2;
                                                int i29 = onWarmupCompleted + 7;
                                                IAuthTabCallback = i29 % 128;
                                                int i30 = i29 % 2;
                                                Unit unitOnNavigationEvent = getRuntimeInfo.onNavigationEvent(function23, creditHomeHeaderItem2, i27);
                                                int i31 = IAuthTabCallback + 77;
                                                onWarmupCompleted = i31 % 128;
                                                if (i31 % 2 != 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                Object obj10 = null;
                                                obj10.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function012);
                                        obj3 = function012;
                                    }
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback4, 0.0f, null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult, 6, 3);
                                if ((i23 & 7168) == 2048) {
                                    int i28 = IAuthTabCallback + 117;
                                    onExtraCallbackWithResult = i28 % 128;
                                    int i29 = i28 % 2;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i27);
                                Function1 function1OnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!(z2 | zOnExtraCallback7)) {
                                    int i30 = IAuthTabCallback + 31;
                                    onExtraCallbackWithResult = i30 % 128;
                                    if (i30 % 2 == 0) {
                                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                        throw null;
                                    }
                                    if (function1OnMinimized2 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        printVisualizationLog.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted5, creditHomeHeaderItem2, true, false, 0L, null, function1OnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 3456, 48);
                                        i27++;
                                    }
                                }
                                function1OnMinimized2 = new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda11
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallback;

                                    public final Object invoke(Object obj10) {
                                        int i31 = 2 % 2;
                                        int i32 = onExtraCallback + 91;
                                        IAuthTabCallback = i32 % 128;
                                        if (i32 % 2 == 0) {
                                            getRuntimeInfo.onExtraCallback(function26, i27, (CreditHomeHeaderItem) obj10);
                                            Object obj11 = null;
                                            obj11.hashCode();
                                            throw null;
                                        }
                                        Unit unitOnExtraCallback = getRuntimeInfo.onExtraCallback(function26, i27, (CreditHomeHeaderItem) obj10);
                                        int i33 = IAuthTabCallback + 5;
                                        onExtraCallback = i33 % 128;
                                        if (i33 % 2 != 0) {
                                            int i34 = 11 / 0;
                                        }
                                        return unitOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((Object) function1OnMinimized2);
                                printVisualizationLog.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted5, creditHomeHeaderItem2, true, false, 0L, null, function1OnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 3456, 48);
                                i27++;
                            }
                            obj = null;
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            onPageLoadError.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        if (zBooleanValue) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-273834740);
                            onPageLoadError.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, 0);
                            function03 = function08;
                            onWarmupCompleted((Function0<Unit>) function03, cameraCaptureResultEmptyCameraCaptureResult, (i23 >> 21) & 14);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            function03 = function08;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-273750172);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        function2 = function26;
                        function02 = function03;
                    }
                } else {
                    scoreDeltaInfo = scoreDeltaInfo2;
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    i5 = iIntValue;
                    i6 = iIntValue2;
                    obj = null;
                    function0 = function04;
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                    function02 = function05;
                    function23 = function22;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return obj;
                }
                final ScoreDeltaInfo scoreDeltaInfo3 = scoreDeltaInfo;
                Object obj10 = obj;
                final Function2 function217 = function2;
                final Function0 function013 = function0;
                final boolean z9 = zBooleanValue;
                final int i31 = i5;
                final int i32 = i6;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj11, Object obj12) {
                        int i33 = 2 % 2;
                        int i34 = onExtraCallbackWithResult + 115;
                        onExtraCallback = i34 % 128;
                        int i35 = i34 % 2;
                        ScoreDeltaInfo scoreDeltaInfo4 = scoreDeltaInfo3;
                        List list2 = list;
                        Function1 function13 = function12;
                        Function2 function218 = function217;
                        Function0 function014 = function013;
                        Function2 function219 = function23;
                        boolean z10 = z9;
                        Function0 function015 = function02;
                        int i36 = i31;
                        int i37 = i32;
                        int iIntValue3 = ((Integer) obj12).intValue();
                        Object[] objArr2 = {scoreDeltaInfo4, list2, function13, function218, function014, function219, Boolean.valueOf(z10), function015, Integer.valueOf(i36), Integer.valueOf(i37), (CameraCaptureResultEmptyCameraCaptureResult) obj11, Integer.valueOf(iIntValue3)};
                        Unit unit = (Unit) getRuntimeInfo.onWarmupCompleted(1799783007, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr2, -1799783004);
                        int i38 = onExtraCallbackWithResult + 115;
                        onExtraCallback = i38 % 128;
                        if (i38 % 2 == 0) {
                            int i39 = 53 / 0;
                        }
                        return unit;
                    }
                });
                return obj10;
            }
            i |= 12582912;
            function22 = function211;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i) != 4793490, i & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        function2 = function210;
        i3 = iIntValue2 & 128;
        if (i3 != 0) {
        }
        function22 = function211;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i) != 4793490, i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1078595329);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1078595329, i2, -1, "im.toss.feature.credit.ui.main.home.component.ScoreRaiseRow (CreditHomeReportCard.kt:151)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            if ((i2 & 14) == 4) {
                int i9 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = IAuthTabCallback + 39;
                            onNavigationEvent = i12 % 128;
                            int i13 = i12 % 2;
                            Function0 function03 = function0;
                            if (i13 != 0) {
                                return getRuntimeInfo.IAuthTabCallback(function03);
                            }
                            getRuntimeInfo.IAuthTabCallback(function03);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                    obj = function02;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, (Function0) obj, 251, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 5, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i11 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    int i13 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.credit_home_score_raise_menu_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                oExternalSyntheticLambda1.IAuthTabCallback(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable(), (oExternalSyntheticLambda0.onExtraCallbackWithResult) null, oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback(), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue(), (oExternalSyntheticLambda0.onNavigationEvent) null, ((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).IAuthTabCallbackStub(), (getHumanReadableName) null, (createCameraCaptureCallback) null, GraphicDeviceInfo.Companion.asBinder(), (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, (String) null, (Function0) null, (Role) null, (Function1) null, false, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 24582, 244554);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    Unit unitOnExtraCallback = getRuntimeInfo.onExtraCallback(function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i18 = onExtraCallbackWithResult + 31;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public static final class IAuthTabCallback implements component5 {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        final /* synthetic */ int IAuthTabCallback;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;
        final /* synthetic */ int onWarmupCompleted;

        IAuthTabCallback(boolean z, boolean z2, int i, int i2, int i3) {
            this.onNavigationEvent = z;
            this.onExtraCallback = z2;
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = i2;
            this.onWarmupCompleted = i3;
        }

        public static /* synthetic */ Unit onExtraCallback(int i, int i2, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, int i3, getStreamSharingChildren getstreamsharingchildren3, long j, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i4 = 2 % 2;
            int i5 = asBinder + 65;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2, getstreamsharingchildren, getstreamsharingchildren2, i3, getstreamsharingchildren3, j, onextracallbackwithresult);
            int i7 = asBinder + 21;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }

        public /* bridge */ int IAuthTabCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 7;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int iIAuthTabCallback = super.IAuthTabCallback(futuresExternalSyntheticLambda3, list, i);
            int i5 = asBinder + 79;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return iIAuthTabCallback;
            }
            throw null;
        }

        public /* bridge */ int onExtraCallback(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 49;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
                throw null;
            }
            int iOnExtraCallback = super.onExtraCallback(futuresExternalSyntheticLambda3, list, i);
            int i4 = IAuthTabCallbackStub + 89;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return iOnExtraCallback;
            }
            throw null;
        }

        public /* bridge */ int onNavigationEvent(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = asBinder + 71;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = super.onNavigationEvent(futuresExternalSyntheticLambda3, list, i);
            int i5 = asBinder + 67;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return iOnNavigationEvent;
        }

        public /* bridge */ int onWarmupCompleted(FuturesExternalSyntheticLambda3 futuresExternalSyntheticLambda3, List<? extends FuturesExternalSyntheticLambda2> list, int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 35;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int iOnWarmupCompleted = super.onWarmupCompleted(futuresExternalSyntheticLambda3, list, i);
            int i5 = IAuthTabCallbackStub + 77;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return iOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, final long j) {
            int iOnExtraCallbackWithResult;
            boolean z;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback;
            getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2;
            int iT_;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            component7 component7Var = list.get(0);
            component7 component7Var2 = !(this.onNavigationEvent ^ true) ? list.get(1) : null;
            component7 component7Var3 = this.onExtraCallback ? (component7) CollectionsKt.last(list) : null;
            int iOnExtraCallbackWithResult2 = component7Var.onExtraCallbackWithResult(VirtualCameraCaptureResult.IAuthTabCallbackDefault(j));
            if (component7Var2 != null) {
                int i2 = IAuthTabCallbackStub + 95;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                iOnExtraCallbackWithResult = component7Var2.onExtraCallbackWithResult(VirtualCameraCaptureResult.IAuthTabCallbackDefault(j));
                int i4 = asBinder + 5;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iOnExtraCallbackWithResult = 0;
            }
            if (component7Var3 == null || iOnExtraCallbackWithResult2 + (this.onExtraCallbackWithResult / 2) > VirtualCameraCaptureResult.asInterface(j)) {
                z = false;
            } else {
                int i6 = asBinder + 111;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0 ? iOnExtraCallbackWithResult + this.onExtraCallbackWithResult <= VirtualCameraCaptureResult.asInterface(j) : iOnExtraCallbackWithResult - this.onExtraCallbackWithResult <= VirtualCameraCaptureResult.asInterface(j)) {
                    z = true;
                }
            }
            final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback3 = component7Var.onExtraCallback(j);
            if (component7Var2 != null) {
                int i7 = asBinder + 91;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    component7Var2.onExtraCallback(j);
                    throw null;
                }
                getstreamsharingchildrenOnExtraCallback = component7Var2.onExtraCallback(j);
            } else {
                getstreamsharingchildrenOnExtraCallback = null;
            }
            if (!(!z)) {
                int i8 = IAuthTabCallbackStub + 121;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                int i10 = this.onExtraCallbackWithResult;
                int i11 = this.IAuthTabCallback;
                getstreamsharingchildrenOnExtraCallback2 = component7Var3.onExtraCallback(VirtualCameraCaptureResult.onExtraCallbackWithResult(j, i10, i10, i11, i11));
            } else {
                getstreamsharingchildrenOnExtraCallback2 = null;
            }
            int iT_2 = getstreamsharingchildrenOnExtraCallback3.T_();
            if (getstreamsharingchildrenOnExtraCallback != null) {
                iT_ = this.onWarmupCompleted + getstreamsharingchildrenOnExtraCallback.T_();
                int i12 = IAuthTabCallbackStub + 45;
                asBinder = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 4 / 2;
                }
            } else {
                iT_ = 0;
            }
            final int i14 = iT_2 + iT_;
            final int iMax = Math.max(i14, getstreamsharingchildrenOnExtraCallback2 != null ? getstreamsharingchildrenOnExtraCallback2.T_() : 0);
            int iAsInterface = VirtualCameraCaptureResult.asInterface(j);
            final int i15 = this.onWarmupCompleted;
            final getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
            final getStreamSharingChildren getstreamsharingchildren2 = getstreamsharingchildrenOnExtraCallback2;
            return component4.IAuthTabCallback(component4Var, iAsInterface, iMax, (Map) null, new Function1() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$ScoreDeltaCardContent$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallbackWithResult + 13;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnExtraCallback = getRuntimeInfo.IAuthTabCallback.onExtraCallback(iMax, i14, getstreamsharingchildrenOnExtraCallback3, getstreamsharingchildren, i15, getstreamsharingchildren2, j, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i19 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 65 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, 4, (Object) null);
        }

        private static final Unit onExtraCallbackWithResult(int i, int i2, getStreamSharingChildren getstreamsharingchildren, getStreamSharingChildren getstreamsharingchildren2, int i3, getStreamSharingChildren getstreamsharingchildren3, long j, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i4 = 2 % 2;
            int i5 = IAuthTabCallbackStub + 49;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i7 = (i - i2) / 2;
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren, 0, i7, 0.0f, 4, (Object) null);
            if (getstreamsharingchildren2 != null) {
                int i8 = asBinder + 51;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren2, 0, i7 + getstreamsharingchildren.T_() + i3, 0.0f, 4, (Object) null);
            }
            if (getstreamsharingchildren3 != null) {
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren3, VirtualCameraCaptureResult.asInterface(j) - getstreamsharingchildren3.getInterfaceDescriptor(), i - getstreamsharingchildren3.T_(), 0.0f, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final ScoreDeltaInfo scoreDeltaInfo, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        boolean z3;
        long jLongValue;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-578009355);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            int i6 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02))) {
                int i8 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2 == 0 ? 2 : 4;
                i3 = i9 | i;
            }
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreDeltaInfo) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            int i10 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i5 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-578009355, i3, -1, "im.toss.feature.credit.ui.main.home.component.ScoreDeltaCardContent (CreditHomeReportCard.kt:178)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(93.0f));
            int iOnExtraCallbackWithResult2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(39.0f));
            int iOnExtraCallbackWithResult3 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f));
            if (scoreDeltaInfo.onWarmupCompleted() != null) {
                int i12 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = scoreDeltaInfo.IAuthTabCallback() != null;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallbackWithResult);
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallbackWithResult2);
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOnExtraCallbackWithResult3);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnExtraCallback2 | zOnExtraCallback3 | zOnExtraCallback4 | zOnExtraCallback5) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(z2, z4, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            component5 component5Var = (component5) objOnMinimized;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport03);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i14 = IAuthTabCallback + 101;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i16 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    z3 = false;
                    int i17 = 95 / 0;
                } else {
                    z3 = false;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                z3 = false;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            String strIAuthTabCallbackDefault = scoreDeltaInfo.IAuthTabCallbackDefault();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            boolean z5 = z4;
            boolean z6 = z3;
            boolean z7 = z2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault, null, gethumanreadablename, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(z6 ? 1 : 0), Boolean.valueOf(z6), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(z6 ? 1 : 0), 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (z7) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1478011642);
                String strOnWarmupCompleted = scoreDeltaInfo.onWarmupCompleted();
                Intrinsics.checkNotNull(strOnWarmupCompleted);
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1294610035);
                    jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1294610995);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnWarmupCompleted, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), null, null, 0L, Integer.valueOf(z6 ? 1 : 0), Boolean.valueOf(z6), null, null, cameraCaptureResultEmptyCameraCaptureResult2, 805306368, Integer.valueOf(z6 ? 1 : 0), 130546}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1478315318);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (!(!z5)) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1478349666);
                String strIAuthTabCallback = scoreDeltaInfo.IAuthTabCallback();
                Intrinsics.checkNotNull(strIAuthTabCallback);
                setMainImageUri.IAuthTabCallback(strIAuthTabCallback, deprecated_eventListenerFactory.Image, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(93.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(39.0f)), 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 3120, 0, 8180);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1478584150);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeReportCardKt$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallback + 55;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitIAuthTabCallback = getRuntimeInfo.IAuthTabCallback(quirksExternalSyntheticBackport02, scoreDeltaInfo, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i22 = IAuthTabCallback + 25;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    public static /* synthetic */ Unit onExtraCallback(ScoreDeltaInfo scoreDeltaInfo, List list, Function1 function1, Function2 function2, Function0 function0, Function2 function22, boolean z, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {scoreDeltaInfo, list, function1, function2, function0, function22, Boolean.valueOf(z), function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(1799783007, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -1799783004);
    }

    public static final void onNavigationEvent(@NotNull ScoreDeltaInfo scoreDeltaInfo, @NotNull List<CreditHomeHeaderItem> list, @NotNull Function1<? super String, Unit> function1, @Nullable Function2<? super CreditHomeHeaderItem, ? super Integer, Unit> function2, @NotNull Function0<Unit> function0, @Nullable Function2<? super CreditHomeHeaderItem, ? super Integer, Unit> function22, boolean z, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {scoreDeltaInfo, list, function1, function2, function0, function22, Boolean.valueOf(z), function02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(1726095641, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -1726095641);
    }

    private static final Unit onNavigationEvent() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-13808592, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[0], 13808594);
    }

    private static final Unit onWarmupCompleted(Function2 function2, CreditHomeHeaderItem creditHomeHeaderItem, int i) {
        Object[] objArr = {function2, creditHomeHeaderItem, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(1499027932, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -1499027928);
    }

    private static final Unit IAuthTabCallback(ScoreDeltaInfo scoreDeltaInfo, List list, Function1 function1, Function2 function2, Function0 function0, Function2 function22, boolean z, Function0 function02, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {scoreDeltaInfo, list, function1, function2, function0, function22, Boolean.valueOf(z), function02, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(1206629763, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, -1206629762);
    }
}
