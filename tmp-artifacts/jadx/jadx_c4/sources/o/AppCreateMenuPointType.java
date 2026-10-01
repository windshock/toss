package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import com.google.android.gms.internal.ads.zzaq;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageViewModel;
import im.toss.features.credit.CreditBaseViewModel;
import im.toss.features.credit.data.response.Avatar;
import im.toss.features.credit.data.response.MyQuizDetailsResponse;
import im.toss.features.credit.data.response.QuizHistory;
import im.toss.features.credit.data.response.QuizStats;
import im.toss.features.credit.ui.quiz.R;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tds.compose.foundation.anim.rally.RallyData;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityOnPausePoint;
import o.AppCreateMenuPointType;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.Futures3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RealImageLoaderexecute2;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.enableActivityMonitorInitFloatOpt;
import o.getBacktraceNote;
import o.getPreRenderJob;
import o.getSupportedHighSpeedResolutionsFor;
import o.getViewTypeCount;
import o.lExternalSyntheticLambda3;
import o.removeAllLottieOnCompositionLoadedListener;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.wa;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppCreateMenuPointType {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 20239;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 47743;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 58806;
    private static char onWarmupCompleted = 20202;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        CreditQuizMyPageViewModel creditQuizMyPageViewModel = (CreditQuizMyPageViewModel) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(str, creditQuizMyPageViewModel, function0, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        int i3 = 85 / 0;
        return onExtraCallbackWithResult(str, creditQuizMyPageViewModel, function0, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditQuizMyPageViewModel creditQuizMyPageViewModel, long j, String str, Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(creditQuizMyPageViewModel, j, str, function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(creditQuizMyPageViewModel, j, str, function1);
        int i3 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, creditQuizMyPageViewModel, function0, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit IAuthTabCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Avatar avatar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(str, quirksExternalSyntheticBackport0, avatar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(str, quirksExternalSyntheticBackport0, avatar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 9;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, setDetectableSize);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, str);
        int i4 = IAuthTabCallbackDefault + 45;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ActivityOnPausePoint activityOnPausePoint, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(activityOnPausePoint, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ActivityOnPausePoint activityOnPausePoint, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{activityOnPausePoint, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzaq.onNavigationEvent(), 1116397618, zzaq.onNavigationEvent(), -1116397603, zzaq.onNavigationEvent());
        int i5 = onExtraCallbackWithResult + 45;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{enableactivitymonitorinitfloatopt, str, setDetectableSize}, zzaq.onNavigationEvent(), -537563346, zzaq.onNavigationEvent(), 537563351, iOnNavigationEvent);
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(RallyData rallyData, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(rallyData, getsupportedhighspeedresolutionsfor);
        }
        onExtraCallback(rallyData, getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Avatar avatar = (Avatar) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onExtraCallbackWithResult = i2 % 128;
        onExtraCallback(str, quirksExternalSyntheticBackport0, avatar, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, activityOnPausePoint, getbacktracenote, function0, function1, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = IAuthTabCallbackDefault + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(getbacktracenote, enableactivitymonitorinitfloatopt, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, enableactivitymonitorinitfloatopt, str);
        int i3 = IAuthTabCallbackDefault + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        Avatar avatar = (Avatar) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, quirksExternalSyntheticBackport0, avatar, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        Futures3 futures3 = (Futures3) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, futures3};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(iOnNavigationEvent2, objArr2, iOnNavigationEvent3, 978615132, iOnNavigationEvent4, -978615122, iOnNavigationEvent);
        int i4 = IAuthTabCallbackDefault + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(RallyData rallyData, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(rallyData, context, getsupportedhighspeedresolutionsfor, str);
        }
        onWarmupCompleted(rallyData, context, getsupportedhighspeedresolutionsfor, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, Avatar avatar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(str, avatar, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, activityOnPausePoint, setDetectableSize}, zzaq.onNavigationEvent(), -2117291668, zzaq.onNavigationEvent(), 2117291669, iOnNavigationEvent);
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Avatar avatar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, quirksExternalSyntheticBackport0, avatar, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzaq.onNavigationEvent(), -1418767258, zzaq.onNavigationEvent(), 1418767267, zzaq.onNavigationEvent());
        int i7 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, enableactivitymonitorinitfloatopt, str);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(ActivityOnPausePoint activityOnPausePoint, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(activityOnPausePoint, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(enableactivitymonitorinitfloatopt, str, setDetectableSize);
        }
        onWarmupCompleted(enableactivitymonitorinitfloatopt, str, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, String str, ActivityOnPausePoint activityOnPausePoint) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(getbacktracenote, str, activityOnPausePoint);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getbacktracenote, str, activityOnPausePoint);
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {activityOnPausePoint, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), objArr2, zzaq.onNavigationEvent(), 1442531471, zzaq.onNavigationEvent(), -1442531459, iOnNavigationEvent);
        int i4 = IAuthTabCallbackDefault + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(context);
        }
        onWarmupCompleted(context);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(str, creditQuizMyPageViewModel, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 19;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, activityOnPausePoint, setDetectableSize);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(String str, ActivityOnPausePoint activityOnPausePoint, getBacktraceNote getbacktracenote, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            onNavigationEvent(str, activityOnPausePoint, (getBacktraceNote<? super Long, ? super String, ? super Function1<? super SetDetectableSize, Unit>, Unit>) getbacktracenote, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onNavigationEvent(str, activityOnPausePoint, (getBacktraceNote<? super Long, ? super String, ? super Function1<? super SetDetectableSize, Unit>, Unit>) getbacktracenote, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(str, setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(str, setDetectableSize);
        int i3 = onExtraCallbackWithResult + 77;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
        }
        onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Avatar avatar, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(avatar, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(str, creditQuizMyPageViewModel, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 75;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, futures3);
        }
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, futures3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        int i4 = IAuthTabCallbackDefault + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        String str = (String) objArr[1];
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, str, activityOnPausePoint}, zzaq.onNavigationEvent(), 1347928238, zzaq.onNavigationEvent(), -1347928235, zzaq.onNavigationEvent());
        }
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        Unit unit = (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, str, activityOnPausePoint}, zzaq.onNavigationEvent(), 1347928238, zzaq.onNavigationEvent(), -1347928235, iOnNavigationEvent);
        int i3 = 92 / 0;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        boolean z;
        long jOnNavigationEvent;
        int i7 = i5 | i6;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i5));
        int i12 = i5 + i3 + i + (1389894630 * i2) + ((-1243605516) * i4);
        int i13 = i12 * i12;
        int i14 = (((-88671125) * i5) - 261777699) + (i3 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + ((-88671137) * i) + ((-349388198) * i2) + ((-147040884) * i4) + (i13 * 182059008);
        switch (((-345998475) * i5) + 1335230464 + (862422157 * i3) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i) + (1607991296 * i2) + ((-548405248) * i4) + ((-1553596416) * i13) + (i14 * i14 * (-132513792))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt = (enableActivityMonitorInitFloatOpt) objArr[0];
                String str = (String) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i15 = 2 % 2;
                int i16 = onExtraCallbackWithResult + 71;
                IAuthTabCallbackDefault = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("text1", enableactivitymonitorinitfloatopt.IAuthTabCallbackDefault());
                setDetectableSize.onExtraCallback("text2", enableactivitymonitorinitfloatopt.onTransact());
                setDetectableSize.onExtraCallback("banner_id", enableactivitymonitorinitfloatopt.onWarmupCompleted());
                Object[] objArr2 = new Object[1];
                a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, Process.getGidForName("") + 9, objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
                Unit unit = Unit.INSTANCE;
                int i18 = onExtraCallbackWithResult + 61;
                IAuthTabCallbackDefault = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[0];
                RowScope rowScope = (RowScope) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i20 = 2 % 2;
                int i21 = onExtraCallbackWithResult + 51;
                IAuthTabCallbackDefault = i21 % 128;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    z = (iIntValue & 74) != 21;
                } else {
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue & 17) != 16) {
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i22 = onExtraCallbackWithResult + 3;
                        IAuthTabCallbackDefault = i22 % 128;
                        int i23 = i22 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1406861050, iIntValue, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:423)");
                        int i24 = onExtraCallbackWithResult + 99;
                        IAuthTabCallbackDefault = i24 % 128;
                        if (i24 % 2 == 0) {
                            int i25 = 2 / 2;
                        }
                    }
                    MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
                    if (myQuizDetailsResponseAsInterface != null) {
                        QuizStats quizStats = (QuizStats) MyQuizDetailsResponse.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 265356919, new Object[]{myQuizDetailsResponseAsInterface}, -265356918, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                        if (quizStats != null) {
                            jOnNavigationEvent = quizStats.onNavigationEvent();
                            int i26 = onExtraCallbackWithResult + 15;
                            IAuthTabCallbackDefault = i26 % 128;
                            int i27 = i26 % 2;
                        } else {
                            int i28 = IAuthTabCallbackDefault + 13;
                            onExtraCallbackWithResult = i28 % 128;
                            int i29 = i28 % 2;
                            jOnNavigationEvent = 0;
                        }
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{getLongName.onNavigationEvent(jOnNavigationEvent, null, 1, null), null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return getInterfaceDescriptor(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return access100(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Avatar avatar, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(avatar, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 73 / 0;
        }
        int i6 = onExtraCallbackWithResult + 123;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, Avatar avatar, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, avatar, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackDefault + 113;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, setDetectableSize);
        int i4 = IAuthTabCallbackDefault + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, str);
        int i4 = IAuthTabCallbackDefault + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(CreditQuizMyPageViewModel creditQuizMyPageViewModel, long j, String str, Function1 function1) {
        boolean z;
        boolean z2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            z = true;
            z2 = true;
            i = 75;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            z = false;
            z2 = false;
            i = 8;
        }
        CreditBaseViewModel.onExtraCallback(creditQuizMyPageViewModel, j, str, z, z2, function1, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 63;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $10 + 21;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRgb, deadChar, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i14 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 10 - KeyEvent.normalizeMetaState(0), 12434 - ExpandableListView.getPackedPositionGroup(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i14 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 16014), 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19901 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        zzbc.IAuthTabCallback(context).finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final String str, @NotNull final CreditQuizMyPageViewModel creditQuizMyPageViewModel, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        Object objOnNavigationEvent;
        ActivityOnPausePoint activityOnPausePoint;
        Context context;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IAuthTabCallbackDefault + 73;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(creditQuizMyPageViewModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1844895987);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i8 = onExtraCallbackWithResult + 107;
                IAuthTabCallbackDefault = i8 % 128;
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
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel)) {
                int i10 = IAuthTabCallbackDefault + 39;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i12 = IAuthTabCallbackDefault + 17;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ^ true ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170) {
            int i14 = IAuthTabCallbackDefault + 7;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i16 = IAuthTabCallbackDefault + 75;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 91 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1844895987, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreen (CreditQuizMyPageScreen.kt:77)");
                }
                objOnNavigationEvent = ((kotlin.Result) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizMyPageViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult()).onNavigationEvent();
                if (kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
                    int i18 = onExtraCallbackWithResult + 87;
                    IAuthTabCallbackDefault = i18 % 128;
                    int i19 = i18 % 2;
                    objOnNavigationEvent = null;
                }
                activityOnPausePoint = (ActivityOnPausePoint) objOnNavigationEvent;
                if (activityOnPausePoint != null) {
                    int i20 = IAuthTabCallbackDefault + 93;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        return;
                    } else {
                        function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda19
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 73;
                                IAuthTabCallback = i23 % 128;
                                if (i23 % 2 == 0) {
                                    AppCreateMenuPointType.IAuthTabCallback(str, creditQuizMyPageViewModel, function0, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(str, creditQuizMyPageViewModel, function0, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i24 = IAuthTabCallback + 97;
                                onWarmupCompleted = i24 % 128;
                                int i25 = i24 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                    }
                } else {
                    setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
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
                        int i22 = IAuthTabCallbackDefault + 77;
                        context = context2;
                        onExtraCallbackWithResult = i22 % 128;
                        if (i22 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        getAwbState.onExtraCallback();
                    } else {
                        context = context2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(setContentInsetsAbsolute.IAuthTabCallback(onextracallback, setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
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
                    MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
                    int i23 = i2 & 14;
                    onWarmupCompleted(str, myQuizDetailsResponseAsInterface != null ? myQuizDetailsResponseAsInterface.onExtraCallbackWithResult() : null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i23);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditQuizMyPageViewModel);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda20
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Unit unitIAuthTabCallback;
                                int i24 = 2 % 2;
                                int i25 = IAuthTabCallback + 33;
                                onWarmupCompleted = i25 % 128;
                                if (i25 % 2 == 0) {
                                    unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(creditQuizMyPageViewModel, ((Long) obj3).longValue(), (String) obj4, (Function1) obj5);
                                    int i26 = 6 / 0;
                                } else {
                                    unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(creditQuizMyPageViewModel, ((Long) obj3).longValue(), (String) obj4, (Function1) obj5);
                                }
                                int i27 = IAuthTabCallback + 69;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    int i24 = i2 << 3;
                    final Context context3 = context;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    onNavigationEvent(str, activityOnPausePoint, (getBacktraceNote<? super Long, ? super String, ? super Function1<? super SetDetectableSize, Unit>, Unit>) objOnMinimized, function0, function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i24 & 7168) | i23 | (i24 & 57344));
                    onPageLoadError.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    ComponentRegistryBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(activityOnPausePoint.IAuthTabCallback(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(100.0f), 7, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, RemoteWorkContinuation.onExtraCallback | 48, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context3);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!zOnExtraCallback2) {
                        int i25 = IAuthTabCallbackDefault + 85;
                        onExtraCallbackWithResult = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i26 = 69 / 0;
                            obj = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda21
                                    private static int IAuthTabCallback = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = IAuthTabCallback + 29;
                                        onWarmupCompleted = i28 % 128;
                                        Object obj3 = null;
                                        if (i28 % 2 != 0) {
                                            AppCreateMenuPointType.onExtraCallbackWithResult(context3);
                                            throw null;
                                        }
                                        Unit unitOnExtraCallbackWithResult = AppCreateMenuPointType.onExtraCallbackWithResult(context3);
                                        int i29 = onWarmupCompleted + 39;
                                        IAuthTabCallback = i29 % 128;
                                        if (i29 % 2 != 0) {
                                            return unitOnExtraCallbackWithResult;
                                        }
                                        obj3.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function02);
                                obj = function02;
                            }
                            getFrame.onWarmupCompleted(new Object[]{setcontentinsetsrelativeIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted3, 0, null, (Function0) obj, null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 0, 236}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1231897955, -1231897954, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        } else {
                            obj = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            getFrame.onWarmupCompleted(new Object[]{setcontentinsetsrelativeIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted3, 0, null, (Function0) obj, null, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult2, 0, 236}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1231897955, -1231897954, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                        }
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                objOnNavigationEvent = ((kotlin.Result) AndroidTextContextMenuToolbarProviderExternalSyntheticLambda3.IAuthTabCallback(creditQuizMyPageViewModel.IAuthTabCallback(), (TextFieldScrollKtExternalSyntheticLambda0) null, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) null, (CoroutineContext) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 7).onExtraCallbackWithResult()).onNavigationEvent();
                if (kotlin.Result.onExtraCallback(objOnNavigationEvent)) {
                }
                activityOnPausePoint = (ActivityOnPausePoint) objOnNavigationEvent;
                if (activityOnPausePoint != null) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda22
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4) {
                    int i27 = 2 % 2;
                    int i28 = onNavigationEvent + 73;
                    onWarmupCompleted = i28 % 128;
                    int i29 = i28 % 2;
                    String str2 = str;
                    CreditQuizMyPageViewModel creditQuizMyPageViewModel2 = creditQuizMyPageViewModel;
                    Function0 function03 = function0;
                    Function1 function12 = function1;
                    int i30 = i;
                    int iIntValue = ((Integer) obj4).intValue();
                    Unit unit = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str2, creditQuizMyPageViewModel2, function03, function12, Integer.valueOf(i30), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)}, zzaq.onNavigationEvent(), -67359249, zzaq.onNavigationEvent(), 67359253, zzaq.onNavigationEvent());
                    int i31 = onNavigationEvent + 117;
                    onWarmupCompleted = i31 % 128;
                    int i32 = i31 % 2;
                    return unit;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    private static final Unit onExtraCallbackWithResult(Avatar avatar, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Integer numValueOf;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallbackWithResult + 53;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallbackDefault + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 5;
            }
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(736118949, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHeader.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:128)");
            }
            if (avatar != null) {
                int i7 = IAuthTabCallbackDefault + 23;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                numValueOf = Integer.valueOf(avatar.onTransact());
                int i9 = onExtraCallbackWithResult + 25;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            } else {
                int i11 = IAuthTabCallbackDefault + 49;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 4;
                }
                numValueOf = null;
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Lv." + numValueOf + " " + (avatar != null ? avatar.IAuthTabCallbackDefault() : null), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Avatar avatar, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 79;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2145243238, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHeader.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:135)");
            }
            if (avatar != null) {
                String str = (String) Avatar.IAuthTabCallback(new Object[]{avatar}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -2009440744, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 2009440745);
                String str2 = str == null ? "" : str;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final String str, @Nullable final Avatar avatar, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        Throwable th;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int iIntValue;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1122518619);
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = IAuthTabCallbackDefault + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(avatar) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = IAuthTabCallbackDefault + 53;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 94 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = IAuthTabCallbackDefault + 35;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1122518619, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHeader (CreditQuizMyPageScreen.kt:119)");
                        int i10 = 11 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1122518619, i2, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageHeader (CreditQuizMyPageScreen.kt:119)");
                    }
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i11 = IAuthTabCallbackDefault + 57;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    int i13 = onExtraCallbackWithResult + 67;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(736118949, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i15 = 2 % 2;
                        int i16 = onNavigationEvent + 73;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Avatar avatar2 = avatar;
                        y1a y1aVar = (y1a) obj2;
                        if (i17 != 0) {
                            return AppCreateMenuPointType.onNavigationEvent(avatar2, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        Unit unitOnNavigationEvent = AppCreateMenuPointType.onNavigationEvent(avatar2, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i18 = 50 / 0;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(70.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 1, (Object) null), (y1ExternalSyntheticLambda0.onNavigationEvent) null, ForwardingCameraControl.onExtraCallback(2145243238, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda16
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i15 = 2 % 2;
                        int i16 = onExtraCallbackWithResult + 111;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        Unit unitOnWarmupCompleted = AppCreateMenuPointType.onWarmupCompleted(avatar, (y1ExternalSyntheticLambda3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i18 = onExtraCallbackWithResult + 99;
                        onExtraCallback = i18 % 128;
                        if (i18 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 16372);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                onExtraCallback(str, highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-27.0f), 1, (Object) null), onextracallbackwithresult.IAuthTabCallback()), avatar, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 896) | (i2 & 14), 0);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if ((avatar == null ? avatar.onExtraCallbackWithResult() : null) == null) {
                    int i15 = onExtraCallbackWithResult + 69;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1275651771);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
                    Integer numOnExtraCallbackWithResult = avatar.onExtraCallbackWithResult();
                    if (numOnExtraCallbackWithResult != null) {
                        int i17 = IAuthTabCallbackDefault + 41;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                        iIntValue = numOnExtraCallbackWithResult.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    th = null;
                    hasMatte.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, iIntValue, 0, cameraCaptureResultEmptyCameraCaptureResult2, 6, 4);
                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult2, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    th = null;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1275453805);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onExtraCallbackWithResult + 97;
                    IAuthTabCallbackDefault = i19 % 128;
                    if (i19 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i20 = 8 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub2, onextracallbackwithresult3.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult22.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback2, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult3.onExtraCallback(), false);
                int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnWarmupCompleted2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult22.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(736118949, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda15
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i152 = 2 % 2;
                        int i162 = onNavigationEvent + 73;
                        IAuthTabCallback = i162 % 128;
                        int i172 = i162 % 2;
                        Avatar avatar2 = avatar;
                        y1a y1aVar = (y1a) obj2;
                        if (i172 != 0) {
                            return AppCreateMenuPointType.onNavigationEvent(avatar2, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        Unit unitOnNavigationEvent = AppCreateMenuPointType.onNavigationEvent(avatar2, y1aVar, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i182 = 50 / 0;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(70.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), 1, (Object) null), (y1ExternalSyntheticLambda0.onNavigationEvent) null, ForwardingCameraControl.onExtraCallback(2145243238, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda16
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i152 = 2 % 2;
                        int i162 = onExtraCallbackWithResult + 111;
                        onExtraCallback = i162 % 128;
                        int i172 = i162 % 2;
                        Unit unitOnWarmupCompleted = AppCreateMenuPointType.onWarmupCompleted(avatar, (y1ExternalSyntheticLambda3) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i182 = onExtraCallbackWithResult + 99;
                        onExtraCallback = i182 % 128;
                        if (i182 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 16372);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                onExtraCallback(str, highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(CaptureNoResponseQuirk.onWarmupCompleted(onextracallback2, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-27.0f), 1, (Object) null), onextracallbackwithresult3.IAuthTabCallback()), avatar, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i2 << 3) & 896) | (i2 & 14), 0);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if ((avatar == null ? avatar.onExtraCallbackWithResult() : null) == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            th = null;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda17
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i21 = 2 % 2;
                    int i22 = onExtraCallback + 19;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    Unit unitOnWarmupCompleted = AppCreateMenuPointType.onWarmupCompleted(str, avatar, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i24 = onNavigationEvent + 55;
                    onExtraCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            });
        }
        int i21 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackDefault = i21 % 128;
        if (i21 % 2 != 0) {
            return;
        }
        th.hashCode();
        throw th;
    }

    private static final boolean onExtraCallback(RallyData rallyData, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        if (rallyData.onExtraCallbackWithResult() != RallyData.AnimateState.PLAYING) {
            return false;
        }
        int i2 = IAuthTabCallbackDefault + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor) > 5) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Avatar $avatar;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Integer> $clickCount$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $tooltipText$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, Avatar avatar, getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
            this.$avatar = avatar;
            this.$clickCount$delegate = getsupportedhighspeedresolutionsfor;
            this.$tooltipText$delegate = getsupportedhighspeedresolutionsfor2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$context, this.$avatar, this.$clickCount$delegate, this.$tooltipText$delegate, access13800Var);
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String strOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                if (AppCreateMenuPointType.onNavigationEvent(this.$clickCount$delegate) == 0) {
                    return Unit.INSTANCE;
                }
                getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor = this.$tooltipText$delegate;
                if (AppCreateMenuPointType.onNavigationEvent(this.$clickCount$delegate) <= 5) {
                    minFresh.onNavigationEvent(this.$context, noStore.Companion.IAuthTabCallbackStub());
                    strOnNavigationEvent = this.$avatar.IAuthTabCallbackStub();
                    int i5 = IAuthTabCallback + 123;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    minFresh.onNavigationEvent(this.$context, noStore.Companion.access100());
                    strOnNavigationEvent = this.$avatar.onNavigationEvent();
                }
                AppCreateMenuPointType.onNavigationEvent(getsupportedhighspeedresolutionsfor, strOnNavigationEvent);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor2 = this.$tooltipText$delegate;
            Object[] objArr = {this.$avatar};
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            AppCreateMenuPointType.onNavigationEvent(getsupportedhighspeedresolutionsfor2, (String) Avatar.IAuthTabCallback(objArr, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1592771429, iOnExtraCallbackWithResult2, 1592771429));
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, 35 >>> TextUtils.getTrimmedLength(""), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, 8 - TextUtils.getTrimmedLength(""), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(RallyData rallyData, Context context, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final String str) {
        int i = 2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor) + 1);
        rallyData.access000();
        minFresh.onNavigationEvent(context, noStore.Companion.asBinder());
        ConvertByteArrayToFloatArray.onExtraCallback(1303045L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    AppCreateMenuPointType.IAuthTabCallback(str, (SetDetectableSize) obj);
                    throw null;
                }
                Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(str, (SetDetectableSize) obj);
                int i4 = onExtraCallbackWithResult + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }, 14, null);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        long jIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            jIAuthTabCallbackStub = FuturesCallbackListener.onWarmupCompleted(futures3, false, 0, (Object) null).IAuthTabCallbackStub() << 66;
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            jIAuthTabCallbackStub = FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null).IAuthTabCallbackStub() >> 32;
        }
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor, Float.intBitsToFloat((int) jIAuthTabCallbackStub));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objArr[1];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objArr[2];
        Futures3 futures3 = (Futures3) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor) == 0.0f) {
                float fOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor2) - Float.intBitsToFloat((int) (FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null).IAuthTabCallbackStub() >> 32));
                int iOnNavigationEvent = zzaq.onNavigationEvent();
                onNavigationEvent((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor, fOnExtraCallbackWithResult + ((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor3}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, iOnNavigationEvent)).floatValue());
            }
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            if (IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor) == 0.0f) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 71;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor, Float.intBitsToFloat((int) (FuturesCallbackListener.onWarmupCompleted(futures3, true, 0, (Object) null).IAuthTabCallbackStub() >> 48)));
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            if (((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor2}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, iOnNavigationEvent)).floatValue() == 1.0f) {
                onExtraCallback((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor2, onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor) - asInterface((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor3));
                int i3 = IAuthTabCallbackDefault + 111;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor, Float.intBitsToFloat((int) (FuturesCallbackListener.onWarmupCompleted(futures3, false, 1, (Object) null).IAuthTabCallbackStub() >> 32)));
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            if (((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor2}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, iOnNavigationEvent2)).floatValue() == 0.0f) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Avatar avatar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function2 function2;
        CameraPresenceProviderExternalSyntheticLambda0 cameraPresenceProviderExternalSyntheticLambda0;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3;
        RallyData rallyData;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport0;
        int i4 = 2 % 2;
        Float fValueOf = Float.valueOf(0.0f);
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1407263356);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        Object obj = null;
        if (i5 != 0) {
            int i6 = IAuthTabCallbackDefault + 103;
            onExtraCallbackWithResult = i6 % 128;
            i3 = i6 % 2 != 0 ? i3 | 91 : i3 | 48;
        } else if ((i & 48) == 0) {
            int i7 = onExtraCallbackWithResult + 17;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport06);
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport06) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(avatar) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            int i8 = IAuthTabCallbackDefault + 45;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 81 / 0;
                if (i5 != 0) {
                    quirksExternalSyntheticBackport06 = QuirksExternalSyntheticBackport0.Companion;
                }
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport06;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1407263356, i3, -1, "im.toss.feature.credit.ui.quiz.mypage.AvatarArea (CreditQuizMyPageScreen.kt:167)");
                }
                if (avatar != null) {
                    int i10 = IAuthTabCallbackDefault + 109;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.asBinder();
                        obj.hashCode();
                        throw null;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        return;
                    } else {
                        function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda25
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i11 = 2 % 2;
                                int i12 = onNavigationEvent + 111;
                                IAuthTabCallback = i12 % 128;
                                int i13 = i12 % 2;
                                String str2 = str;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport08 = quirksExternalSyntheticBackport07;
                                Avatar avatar2 = avatar;
                                int i14 = i;
                                int i15 = i2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Unit unit = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str2, quirksExternalSyntheticBackport08, avatar2, Integer.valueOf(i14), Integer.valueOf(i15), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)}, zzaq.onNavigationEvent(), -788061203, zzaq.onNavigationEvent(), 788061211, zzaq.onNavigationEvent());
                                int i16 = IAuthTabCallback + 111;
                                onNavigationEvent = i16 % 128;
                                if (i16 % 2 == 0) {
                                    return unit;
                                }
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        };
                    }
                } else {
                    final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((String) Avatar.IAuthTabCallback(new Object[]{avatar}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1592771429, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1592771429), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                    final RallyData rallyDataOnNavigationEvent = getLoadType.onNavigationEvent(((getUserIdentifier) deprecated_proxy.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1261663334, new Object[]{deprecated_proxy.onNavigationEvent, deprecated_proxySelector.SMALL, certificatePinner.X}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1261663334, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult())).onNavigationEvent(), (Object) null, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 254);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(rallyDataOnNavigationEvent.onExtraCallbackWithResult().ordinal());
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnExtraCallback) {
                        Object obj2 = objOnMinimized3;
                        if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda26
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i11 = 2 % 2;
                                    int i12 = onNavigationEvent + 53;
                                    onExtraCallbackWithResult = i12 % 128;
                                    int i13 = i12 % 2;
                                    Boolean boolValueOf = Boolean.valueOf(AppCreateMenuPointType.IAuthTabCallback(rallyDataOnNavigationEvent, getsupportedhighspeedresolutionsfor5));
                                    int i14 = onNavigationEvent + 39;
                                    onExtraCallbackWithResult = i14 % 128;
                                    int i15 = i14 % 2;
                                    return boolValueOf;
                                }
                            });
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult);
                            obj2 = cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult;
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) obj2;
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized4;
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized5;
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            int i11 = onExtraCallbackWithResult + 5;
                            IAuthTabCallbackDefault = i11 % 128;
                            if (i11 % 2 == 0) {
                                cameraPresenceProviderExternalSyntheticLambda0 = null;
                                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 5, (Object) null);
                            } else {
                                cameraPresenceProviderExternalSyntheticLambda0 = null;
                                objOnMinimized6 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                        } else {
                            cameraPresenceProviderExternalSyntheticLambda0 = null;
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized6;
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        int i12 = i3;
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(fValueOf, cameraPresenceProviderExternalSyntheticLambda0, 2, cameraPresenceProviderExternalSyntheticLambda0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                        }
                        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
                        int iOnExtraCallback = onExtraCallback((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor5);
                        boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                        boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(avatar);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if ((zOnExtraCallback2 || zOnExtraCallback3) || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor5;
                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport07;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(context, avatar, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor6, null);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(onextracallbackwithresult);
                            objOnMinimized8 = onextracallbackwithresult;
                        } else {
                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor5;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor7;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport07;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Integer.valueOf(iOnExtraCallback), (Function2) objOnMinimized8, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport03);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                        if (!cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        } else {
                            int i13 = IAuthTabCallbackDefault + 103;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        QuirkSettingsLoader.onNavigationEvent onnavigationeventAsBinder = onextracallbackwithresult2.asBinder();
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rallyDataOnNavigationEvent);
                        boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(context);
                        if ((i12 & 14) != 4) {
                            int i15 = onExtraCallbackWithResult + 111;
                            IAuthTabCallbackDefault = i15 % 128;
                            int i16 = i15 % 2;
                            z = false;
                        } else {
                            z = true;
                        }
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!(zOnNavigationEvent | zOnExtraCallback4 | z)) {
                            Object obj3 = objOnMinimized9;
                            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor11 = getsupportedhighspeedresolutionsfor;
                                Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda27
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke() {
                                        int i17 = 2 % 2;
                                        int i18 = onExtraCallback + 123;
                                        onExtraCallbackWithResult = i18 % 128;
                                        int i19 = i18 % 2;
                                        Unit unitOnExtraCallback = AppCreateMenuPointType.onExtraCallback(rallyDataOnNavigationEvent, context, getsupportedhighspeedresolutionsfor11, str);
                                        int i20 = onExtraCallback + 53;
                                        onExtraCallbackWithResult = i20 % 128;
                                        if (i20 % 2 != 0) {
                                            return unitOnExtraCallback;
                                        }
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                                obj3 = function0;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageLoaderBuilderExternalSyntheticLambda2.onNavigationEvent((QuirksExternalSyntheticBackport0) onextracallback, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, 200L, (Function0) obj3, 255, (Object) null);
                            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventAsBinder, cameraCaptureResultEmptyCameraCaptureResult2, 48);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent);
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                            if (!Intrinsics.areEqual((String) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor6}, zzaq.onNavigationEvent(), -1838491659, zzaq.onNavigationEvent(), 1838491672, zzaq.onNavigationEvent()), (String) Avatar.IAuthTabCallback(new Object[]{avatar}, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1592771429, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1592771429))) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1017565632);
                                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized10 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda29
                                        private static int onExtraCallback = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke(Object obj4) {
                                            int i17 = 2 % 2;
                                            int i18 = onNavigationEvent + 85;
                                            onExtraCallback = i18 % 128;
                                            int i19 = i18 % 2;
                                            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor12 = getsupportedhighspeedresolutionsfor9;
                                            if (i19 != 0) {
                                                return (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor12, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor8, (Futures3) obj4}, zzaq.onNavigationEvent(), -194731223, zzaq.onNavigationEvent(), 194731223, zzaq.onNavigationEvent());
                                            }
                                            Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized10);
                                }
                                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor8;
                                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                rallyData = rallyDataOnNavigationEvent;
                                RealImageLoaderexecuteresult1.onExtraCallback((String) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor6}, zzaq.onNavigationEvent(), -1838491659, zzaq.onNavigationEvent(), 1838491672, zzaq.onNavigationEvent()), CaptureNoResponseQuirk.onWarmupCompleted(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(onextracallback, (Function1) objOnMinimized10), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor8}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, zzaq.onNavigationEvent())).floatValue())).IAuthTabCallback(), 0.0f, 2, (Object) null), null, RealImageLoaderexecute2.onExtraCallbackWithResult.SMALL, null, null, 0, false, 0, Float.valueOf(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Float>) getsupportedhighspeedresolutionsfor9)), null, false, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 0, 3572);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor2;
                            } else {
                                getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor8;
                                rallyData = rallyDataOnNavigationEvent;
                                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                getsupportedhighspeedresolutionsfor4 = getsupportedhighspeedresolutionsfor2;
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1018015504);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = CaptureNoResponseQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor3}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, zzaq.onNavigationEvent())).floatValue())).IAuthTabCallback(), 0.0f, 2, (Object) null);
                                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized11 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda28
                                        private static int onExtraCallback = 0;
                                        private static int onExtraCallbackWithResult = 1;

                                        public final Object invoke(Object obj4) {
                                            int i17 = 2 % 2;
                                            int i18 = onExtraCallback + 31;
                                            onExtraCallbackWithResult = i18 % 128;
                                            int i19 = i18 % 2;
                                            Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(getsupportedhighspeedresolutionsfor4, (Futures3) obj4);
                                            int i20 = onExtraCallbackWithResult + 75;
                                            onExtraCallback = i20 % 128;
                                            if (i20 % 2 == 0) {
                                                return unitIAuthTabCallback;
                                            }
                                            Object obj5 = null;
                                            obj5.hashCode();
                                            throw null;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized11);
                                }
                                RealImageLoaderexecuteresult1.onExtraCallback((String) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor6}, zzaq.onNavigationEvent(), -1838491659, zzaq.onNavigationEvent(), 1838491672, zzaq.onNavigationEvent()), r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized11), null, RealImageLoaderexecute2.onExtraCallbackWithResult.SMALL, null, null, 0, false, 0, null, null, false, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 0, 4084);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                int i17 = IAuthTabCallbackDefault + 59;
                                onExtraCallbackWithResult = i17 % 128;
                                int i18 = i17 % 2;
                            }
                            Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized12 = new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda30
                                    private static int IAuthTabCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj4) {
                                        int i19 = 2 % 2;
                                        int i20 = IAuthTabCallback + 31;
                                        onExtraCallbackWithResult = i20 % 128;
                                        int i21 = i20 % 2;
                                        Unit unitOnNavigationEvent = AppCreateMenuPointType.onNavigationEvent(getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, (Futures3) obj4);
                                        int i22 = IAuthTabCallback + 17;
                                        onExtraCallbackWithResult = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            return unitOnNavigationEvent;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized12);
                            }
                            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{avatar.onWarmupCompleted(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(clearAds.onExtraCallbackWithResult(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(onextracallback, (Function1) objOnMinimized12), rallyData), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(110.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(35.0f), 0.0f, 10, (Object) null), null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-360195549);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult2.IAuthTabCallback());
                                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult2.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4);
                                Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                                if (!cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult3.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult3.onTransact());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                onPageLoadError.IAuthTabCallbackStub(30, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f);
                                float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(120.0f);
                                immediateFailedFuture immediatefailedfutureOnExtraCallbackWithResult = immediateFailedFuture.Companion.onExtraCallbackWithResult();
                                Object[] objArr = new Object[1];
                                a(new char[]{32231, 4257, 53039, 59541, 41294, 2571, 9273, 28971, 46652, 870, 27384, 32317, 58796, 36716, 61878, 60230, 54191, 43140, 34071, 20600, 35284, 40553, 36096, 61314, 28255, 40655, 35535, 16346, 55787, 64989, 59888, 24181, 51093, 13720, 29968, 36624, 51283, 3512, 46524, 21199, 20019, 31978, 30669, 21326, 47086, 41477, 4284, 21392, 39765, 6489, 40921, 57150, 32792, 15174, 20315, 1330, 25647, 28310, 51656, 54958, 39562, 6815, 2573, 10770, 58299, 64265}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 66, objArr);
                                AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.0f, false, fIAuthTabCallback, fIAuthTabCallback2, (QuirkSettingsLoader) null, immediatefailedfutureOnExtraCallbackWithResult, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 113246214, 6, 6782);
                                onPageLoadError.IAuthTabCallbackStub(16, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-359675648);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                        }
                    }
                }
            } else {
                if (i5 != 0) {
                }
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport072 = quirksExternalSyntheticBackport06;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (avatar != null) {
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            function2 = new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda31
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj4, Object obj5) {
                    int i19 = 2 % 2;
                    int i20 = onNavigationEvent + 89;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnExtraCallback = AppCreateMenuPointType.onExtraCallback(str, quirksExternalSyntheticBackport02, avatar, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i22 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnExtraCallback;
                }
            };
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(function2);
        }
    }

    private static final Unit onWarmupCompleted(String str, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) throws Throwable {
        List listAsBinder;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        int size = 0;
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("section_type", "review_note");
        MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
        if (myQuizDetailsResponseAsInterface == null || (listAsBinder = myQuizDetailsResponseAsInterface.asBinder()) == null) {
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallbackDefault + 57;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 67 / 0;
                size = listAsBinder.size();
            } else {
                size = listAsBinder.size();
            }
        }
        setDetectableSize.onExtraCallback("solved_quiz_cnt", Integer.valueOf(size));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        final String str = (String) objArr[1];
        final ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[2];
        int i = 2 % 2;
        getbacktracenote.invoke(1303037L, "review_note", new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 == 0) {
                    return AppCreateMenuPointType.onExtraCallbackWithResult(str2, activityOnPausePoint, (SetDetectableSize) obj);
                }
                AppCreateMenuPointType.onExtraCallbackWithResult(str2, activityOnPausePoint, (SetDetectableSize) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, Color.blue(0) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, final String str) {
        int i = 2 % 2;
        getbacktracenote.invoke(1303039L, "show_more", new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    AppCreateMenuPointType.onExtraCallbackWithResult(str, (SetDetectableSize) obj);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = AppCreateMenuPointType.onExtraCallbackWithResult(str, (SetDetectableSize) obj);
                int i4 = IAuthTabCallback + 53;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, 8 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function0 function0, final String str) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1303041L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 3;
                onWarmupCompleted = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    AppCreateMenuPointType.onWarmupCompleted(str, (SetDetectableSize) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = AppCreateMenuPointType.onWarmupCompleted(str, (SetDetectableSize) obj);
                int i4 = onWarmupCompleted + 23;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
        }, 14, null);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, final String str) {
        int i = 2 % 2;
        getbacktracenote.invoke(1303047L, "banner", new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(enableactivitymonitorinitfloatopt, str, (SetDetectableSize) obj);
                int i5 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitIAuthTabCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("text1", enableactivitymonitorinitfloatopt.IAuthTabCallbackDefault());
        setDetectableSize.onExtraCallback("text2", enableactivitymonitorinitfloatopt.onTransact());
        setDetectableSize.onExtraCallback("banner_id", enableactivitymonitorinitfloatopt.onWarmupCompleted());
        Object[] objArr = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, View.MeasureSpec.getMode(0) + 8, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, final String str) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1303049L, false, null, null, new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 25;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt2 = enableactivitymonitorinitfloatopt;
                if (i4 != 0) {
                    return AppCreateMenuPointType.onExtraCallback(enableactivitymonitorinitfloatopt2, str, (SetDetectableSize) obj);
                }
                Unit unitOnExtraCallback = AppCreateMenuPointType.onExtraCallback(enableactivitymonitorinitfloatopt2, str, (SetDetectableSize) obj);
                int i5 = 95 / 0;
                return unitOnExtraCallback;
            }
        }, 14, null);
        String strOnExtraCallback = enableactivitymonitorinitfloatopt.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        function1.invoke(convertAnyToMap.onExtraCallback(strOnExtraCallback, ((String) objArr[0]).intern(), "credit_quiz_mypage"));
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        int size = 0;
        String str = (String) objArr[0];
        ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{39765, 6489, 30669, 21326, 24482, 34902, 53951, 46908}, (ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        setDetectableSize.onExtraCallback("section_type", "my_record");
        MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
        if (myQuizDetailsResponseAsInterface != null) {
            int i2 = IAuthTabCallbackDefault + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            List listAsBinder = myQuizDetailsResponseAsInterface.asBinder();
            if (listAsBinder != null) {
                int i4 = IAuthTabCallbackDefault + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                size = listAsBinder.size();
                int i6 = onExtraCallbackWithResult + 23;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        setDetectableSize.onExtraCallback("solved_quiz_cnt", Integer.valueOf(size));
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallbackDefault + 63;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, final String str, final ActivityOnPausePoint activityOnPausePoint) {
        int i = 2 % 2;
        getbacktracenote.invoke(1303037L, "my_record", new Function1() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                if (i4 == 0) {
                    return AppCreateMenuPointType.onExtraCallback(str2, activityOnPausePoint, (SetDetectableSize) obj);
                }
                AppCreateMenuPointType.onExtraCallback(str2, activityOnPausePoint, (SetDetectableSize) obj);
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(ActivityOnPausePoint activityOnPausePoint, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallbackDefault + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 17;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(684342237, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:400)");
                    int i6 = 37 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(684342237, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:400)");
                }
            }
            MyQuizDetailsResponse myQuizDetailsResponseAsInterface = activityOnPausePoint.asInterface();
            Integer numValueOf = null;
            if (myQuizDetailsResponseAsInterface != null) {
                int i7 = onExtraCallbackWithResult + 103;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    numValueOf.hashCode();
                    throw null;
                }
                QuizStats quizStats = (QuizStats) MyQuizDetailsResponse.onExtraCallbackWithResult(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 265356919, new Object[]{myQuizDetailsResponseAsInterface}, -265356918, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult());
                if (quizStats != null) {
                    numValueOf = Integer.valueOf(quizStats.IAuthTabCallback());
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{numValueOf + "%", null, null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = IAuthTabCallbackDefault + 115;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 / 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final ActivityOnPausePoint activityOnPausePoint, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i4 = IAuthTabCallbackDefault + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1273575880, i, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:398)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, ForwardingCameraControl.onExtraCallback(684342237, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda23
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 67;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(activityOnPausePoint, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    if (i8 != 0) {
                        int i9 = 97 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 3) & 112) | 6)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -99696964, 99696975, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 73;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallbackWithResult + 27;
                IAuthTabCallbackDefault = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        boolean z;
        int i;
        int i2;
        final ActivityOnPausePoint activityOnPausePoint = (ActivityOnPausePoint) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i4 = IAuthTabCallbackDefault + 77;
                onExtraCallbackWithResult = i4 % 128;
                i2 = i4 % 2 != 0 ? 3 : 4;
            } else {
                i2 = 2;
            }
            iIntValue |= i2;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = IAuthTabCallbackDefault + 65;
            onExtraCallbackWithResult = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 49;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1770495839, iIntValue, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:421)");
                    int i7 = 78 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1770495839, iIntValue, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody.<anonymous>.<anonymous> (CreditQuizMyPageScreen.kt:421)");
                }
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, ForwardingCameraControl.onExtraCallback(-1406861050, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 51;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unit = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{activityOnPausePoint, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, zzaq.onNavigationEvent(), -938211632, zzaq.onNavigationEvent(), 938211634, zzaq.onNavigationEvent());
                    int i11 = onNavigationEvent + 117;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 3) & 112) | 6)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -99696964, 99696975, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i = onExtraCallbackWithResult + 3;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i = onExtraCallbackWithResult + 65;
        IAuthTabCallbackDefault = i % 128;
        int i8 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final String str, @NotNull final ActivityOnPausePoint activityOnPausePoint, @NotNull final getBacktraceNote<? super Long, ? super String, ? super Function1<? super SetDetectableSize, Unit>, Unit> getbacktracenote, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        long jOnRelationshipValidationResult;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activityOnPausePoint, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-425438303);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityOnPausePoint) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i10 = IAuthTabCallbackDefault + 125;
                onExtraCallbackWithResult = i10 % 128;
                i8 = i10 % 2 != 0 ? 12599 : 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        int i11 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i11 & 9363) != 9362, i11 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onExtraCallbackWithResult + 117;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-425438303, i11, -1, "im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageBody (CreditQuizMyPageScreen.kt:282)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            int i14 = i11 & 896;
            if (i14 == 256) {
                int i15 = IAuthTabCallbackDefault + 81;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                z = true;
            } else {
                z = false;
            }
            int i17 = i11 & 14;
            boolean z8 = i17 == 4;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityOnPausePoint);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((z | z8 | zOnExtraCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 45;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Unit unit = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, str, activityOnPausePoint}, zzaq.onNavigationEvent(), 405082900, zzaq.onNavigationEvent(), -405082894, zzaq.onNavigationEvent());
                        int i20 = onExtraCallback + 83;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, null, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 3), 0.0f, 1, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            EngineInitFailedPoint2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 7, (Object) null);
            wa.IAuthTabCallback.onNavigationEvent onnavigationevent = wa.IAuthTabCallback.Companion;
            wa.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onnavigationevent.onExtraCallback();
            ActivityOnDestroyPoint activityOnDestroyPoint = ActivityOnDestroyPoint.onNavigationEvent;
            w2.IAuthTabCallback(activityOnDestroyPoint.IAuthTabCallback(), quirksExternalSyntheticBackport0OnExtraCallback2, (wa.onTransact) null, iAuthTabCallbackOnExtraCallback, 0.99f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult2, 27702, 0, 4068);
            QuizHistory quizHistoryIAuthTabCallbackStub = activityOnPausePoint.IAuthTabCallbackStub();
            if (quizHistoryIAuthTabCallbackStub == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(15220753);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                z2 = false;
                z3 = true;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(15220754);
                z2 = false;
                z3 = true;
                ActivityResultPoint.onWarmupCompleted(quizHistoryIAuthTabCallbackStub, true, cameraCaptureResultEmptyCameraCaptureResult2, 48, 0);
                Unit unit = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (activityOnPausePoint.asBinder() != z3) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(16235415);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                i3 = i11;
                i4 = i17;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(15368283);
                boolean z9 = (i14 == 256 ? z2 : z3) ^ z3;
                boolean z10 = i17 == 4 ? z3 : z2;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (((z9 | z10) ^ z3) != z3) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallback + 3;
                            onNavigationEvent = i19 % 128;
                            Object obj = null;
                            if (i19 % 2 != 0) {
                                AppCreateMenuPointType.onWarmupCompleted(getbacktracenote, str);
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = AppCreateMenuPointType.onWarmupCompleted(getbacktracenote, str);
                            int i20 = onExtraCallback + 47;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 == 0) {
                                return unitOnWarmupCompleted;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    boolean z11 = z2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback, 0.0f, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6, 1);
                    int i18 = R.string.my_credit_quiz_show_more;
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i18, cameraCaptureResultEmptyCameraCaptureResult2, z11 ? 1 : 0);
                    String str2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_count, cameraCaptureResultEmptyCameraCaptureResult2, z11 ? 1 : 0) + " " + DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i18, cameraCaptureResultEmptyCameraCaptureResult2, z11 ? 1 : 0);
                    lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted = lExternalSyntheticLambda3.onWarmupCompleted.FULL;
                    if (i17 != 4) {
                        int i19 = onExtraCallbackWithResult + 65;
                        IAuthTabCallbackDefault = i19 % 128;
                        boolean z12 = i19 % 2 == 0 ? z11 ? 1 : 0 : true;
                        if ((i11 & 7168) == 2048) {
                            int i20 = onExtraCallbackWithResult + 75;
                            IAuthTabCallbackDefault = i20 % 128;
                            int i21 = i20 % 2;
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                        if (!(z12 | z4)) {
                            Object obj = objOnMinimized3;
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                Function0 function02 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda2
                                    private static int onExtraCallbackWithResult = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i22 = 2 % 2;
                                        int i23 = onExtraCallbackWithResult + 65;
                                        onNavigationEvent = i23 % 128;
                                        int i24 = i23 % 2;
                                        Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(function0, str);
                                        int i25 = onExtraCallbackWithResult + 29;
                                        onNavigationEvent = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            return unitIAuthTabCallback;
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function02);
                                obj = function02;
                            }
                            i3 = i11;
                            i4 = i17;
                            r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.onExtraCallback(strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function0) obj, str2, (lExternalSyntheticLambda3.onExtraCallback) null, (GraphicDeviceInfo) null, 0L, false, (lExternalSyntheticLambda3.onWarmupCompleted) null, true, onwarmupcompleted, (lExternalSyntheticLambda3.onExtraCallbackWithResult) null, true, (lExternalSyntheticLambda3.IAuthTabCallback) null, cameraCaptureResultEmptyCameraCaptureResult2, 805306368, 390, 10736);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    }
                } else {
                    int i22 = onExtraCallbackWithResult + 77;
                    IAuthTabCallbackDefault = i22 % 128;
                    if (i22 % 2 == 0) {
                        Object obj2 = null;
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    boolean z112 = z2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback, 0.0f, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6, 1);
                    int i182 = R.string.my_credit_quiz_show_more;
                    String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i182, cameraCaptureResultEmptyCameraCaptureResult2, z112 ? 1 : 0);
                    String str22 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_count, cameraCaptureResultEmptyCameraCaptureResult2, z112 ? 1 : 0) + " " + DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i182, cameraCaptureResultEmptyCameraCaptureResult2, z112 ? 1 : 0);
                    lExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2 = lExternalSyntheticLambda3.onWarmupCompleted.FULL;
                    if (i17 != 4) {
                    }
                }
            }
            if (activityOnPausePoint.onTransact()) {
                int i23 = onExtraCallbackWithResult + 51;
                IAuthTabCallbackDefault = i23 % 128;
                int i24 = i23 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(16283372);
                EngineInitFailedPoint1.onExtraCallback((String) null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz_empty_title, cameraCaptureResultEmptyCameraCaptureResult2, 0), (String) null, (setCallToAction.onWarmupCompleted) null, false, (removeAllLottieOnCompositionLoadedListener.IAuthTabCallback) null, (Function0) null, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 253);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(16416951);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            EngineInitFailedPoint2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
            final enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatoptOnExtraCallbackWithResult = activityOnPausePoint.onExtraCallbackWithResult();
            if (enableactivitymonitorinitfloatoptOnExtraCallbackWithResult == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(16522474);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                z7 = true;
                i6 = i4;
                i7 = 256;
                z6 = false;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(16522475);
                if (i14 == 256) {
                    z5 = true;
                    i5 = 2;
                } else {
                    int i25 = onExtraCallbackWithResult + 81;
                    IAuthTabCallbackDefault = i25 % 128;
                    i5 = 2;
                    int i26 = i25 % 2;
                    z5 = false;
                }
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(enableactivitymonitorinitfloatoptOnExtraCallbackWithResult);
                int i27 = i4;
                if (i27 == 4) {
                    int i28 = IAuthTabCallbackDefault + 25;
                    onExtraCallbackWithResult = i28 % 128;
                    boolean z13 = i28 % i5 == 0;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if ((z5 | zOnExtraCallback2 | z13) || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda3
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i29 = 2 % 2;
                                int i30 = onWarmupCompleted + 29;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                Unit unit2 = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str}, zzaq.onNavigationEvent(), 282653189, zzaq.onNavigationEvent(), -282653175, zzaq.onNavigationEvent());
                                int i32 = onWarmupCompleted + 63;
                                onNavigationEvent = i32 % 128;
                                int i33 = i32 % 2;
                                return unit2;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback, 0.0f, (Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult2, 6, 1);
                    VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                    String strOnNavigationEvent = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.onNavigationEvent();
                    String strIAuthTabCallbackDefault = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.IAuthTabCallbackDefault();
                    String strOnTransact = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.onTransact();
                    getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(enableactivitymonitorinitfloatoptOnExtraCallbackWithResult);
                    boolean z14 = i27 == 4;
                    boolean z15 = (i3 & 57344) == 16384;
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (!(z15 | zOnExtraCallback3 | z14)) {
                        Object obj3 = objOnMinimized5;
                        if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function03 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda4
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() throws Throwable {
                                    int i29 = 2 % 2;
                                    int i30 = onWarmupCompleted + 77;
                                    onExtraCallbackWithResult = i30 % 128;
                                    if (i30 % 2 == 0) {
                                        AppCreateMenuPointType.onExtraCallback(function1, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str);
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    Unit unitOnExtraCallback = AppCreateMenuPointType.onExtraCallback(function1, enableactivitymonitorinitfloatoptOnExtraCallbackWithResult, str);
                                    int i31 = onWarmupCompleted + 57;
                                    onExtraCallbackWithResult = i31 % 128;
                                    int i32 = i31 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function03);
                            obj3 = function03;
                        }
                        i6 = i27;
                        EmbedWebviewLoadPoint.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, virtualCameraControlExternalSyntheticLambda1OnNavigationEvent, strOnNavigationEvent, 0L, false, 0L, strIAuthTabCallbackDefault, strOnTransact, (AvoidCaptureProcessProgressAvailabilityCheckQuirk) null, (setByteOrder) null, (GraphicDeviceInfo) null, (String) null, (setByteOrder) null, false, false, (String) null, ontransactOnNavigationEvent, (getViewTypeCount.onNavigationEvent) null, (Function2) null, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult2, 48, 1572864, 458552);
                        if (enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.onExtraCallbackWithResult()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1687920042);
                            String strIAuthTabCallback = enableactivitymonitorinitfloatoptOnExtraCallbackWithResult.IAuthTabCallback();
                            String str3 = strIAuthTabCallback == null ? "" : strIAuthTabCallback;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 2, (Object) null);
                            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1608109267);
                                jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1608108307);
                                jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onRelationshipValidationResult();
                            }
                            long j = jOnRelationshipValidationResult;
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            int i29 = onExtraCallbackWithResult + 115;
                            IAuthTabCallbackDefault = i29 % 128;
                            int i30 = i29 % 2;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, quirksExternalSyntheticBackport0OnExtraCallback3, null, Long.valueOf(j), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11)), 0L, null, null, null, Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f)), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 805330944, 0, 130532}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1688367868);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        z6 = false;
                        z7 = true;
                        EngineInitFailedPoint2.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 1);
                        Unit unit2 = Unit.INSTANCE;
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        i7 = 256;
                    }
                }
            }
            boolean z16 = i14 == i7 ? z7 : z6;
            boolean z17 = i6 == 4 ? z7 : z6;
            boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(activityOnPausePoint);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!(z16 | z17 | zOnExtraCallback4)) {
                Object obj4 = objOnMinimized6;
                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function04 = new Function0() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke() {
                            int i31 = 2 % 2;
                            int i32 = onExtraCallback + 65;
                            IAuthTabCallback = i32 % 128;
                            int i33 = i32 % 2;
                            getBacktraceNote getbacktracenote2 = getbacktracenote;
                            if (i33 != 0) {
                                return AppCreateMenuPointType.onExtraCallback(getbacktracenote2, str, activityOnPausePoint);
                            }
                            int i34 = 27 / 0;
                            return AppCreateMenuPointType.onExtraCallback(getbacktracenote2, str, activityOnPausePoint);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function04);
                    obj4 = function04;
                }
                boolean z18 = z6;
                boolean z19 = z7;
                w2.IAuthTabCallback(1724574124, new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.my_credit_quiz, cameraCaptureResultEmptyCameraCaptureResult2, z18 ? 1 : 0), ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback, 0.0f, (Function0) obj4, cameraCaptureResultEmptyCameraCaptureResult2, 6, 1), onnavigationevent.onExtraCallback(), null, Float.valueOf(0.99f), null, null, null, null, null, null, Boolean.valueOf(z18), null, cameraCaptureResultEmptyCameraCaptureResult2, 24960, Integer.valueOf(z18 ? 1 : 0), 8168}, -1724574112, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
                w4.onExtraCallbackWithResult(activityOnDestroyPoint.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, activityOnDestroyPoint.onExtraCallbackWithResult(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1273575880, z19, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i31 = 2 % 2;
                        int i32 = IAuthTabCallback + 123;
                        onExtraCallback = i32 % 128;
                        int i33 = i32 % 2;
                        Unit unitOnExtraCallback = AppCreateMenuPointType.onExtraCallback(activityOnPausePoint, (RightPreset) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                        int i34 = IAuthTabCallback + 1;
                        onExtraCallback = i34 % 128;
                        int i35 = i34 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 196998, 0, 131034);
                w4.onExtraCallbackWithResult(activityOnDestroyPoint.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, activityOnDestroyPoint.onExtraCallback(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1770495839, z19, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i31 = 2 % 2;
                        int i32 = onExtraCallbackWithResult + 17;
                        onNavigationEvent = i32 % 128;
                        if (i32 % 2 == 0) {
                            AppCreateMenuPointType.IAuthTabCallback(activityOnPausePoint, (RightPreset) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        Unit unitIAuthTabCallback = AppCreateMenuPointType.IAuthTabCallback(activityOnPausePoint, (RightPreset) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                        int i33 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i33 % 128;
                        int i34 = i33 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, 196998, 0, 131034);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.quiz.mypage.CreditQuizMyPageScreenKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj5, Object obj6) {
                    int i31 = 2 % 2;
                    int i32 = onExtraCallback + 45;
                    IAuthTabCallback = i32 % 128;
                    int i33 = i32 % 2;
                    String str4 = str;
                    ActivityOnPausePoint activityOnPausePoint2 = activityOnPausePoint;
                    getBacktraceNote getbacktracenote2 = getbacktracenote;
                    Function0 function05 = function0;
                    Function1 function12 = function1;
                    int i34 = i;
                    int iIntValue = ((Integer) obj6).intValue();
                    Unit unit3 = (Unit) AppCreateMenuPointType.onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str4, activityOnPausePoint2, getbacktracenote2, function05, function12, Integer.valueOf(i34), (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(iIntValue)}, zzaq.onNavigationEvent(), 336450933, zzaq.onNavigationEvent(), -336450926, zzaq.onNavigationEvent());
                    int i35 = IAuthTabCallback + 75;
                    onExtraCallback = i35 % 128;
                    int i36 = i35 % 2;
                    return unit3;
                }
            });
        }
    }

    private static final int onExtraCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.intValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIntValue = number.intValue();
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(i));
        if (i4 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = IAuthTabCallbackDefault + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    private static final float asInterface(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).floatValue();
        int i4 = onExtraCallbackWithResult + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f));
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).floatValue();
        int i4 = onExtraCallbackWithResult + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f));
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return number.floatValue();
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f));
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = onExtraCallbackWithResult + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            number.floatValue();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f));
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, enableactivitymonitorinitfloatopt, str}, zzaq.onNavigationEvent(), 282653189, zzaq.onNavigationEvent(), -282653175, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Avatar avatar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, quirksExternalSyntheticBackport0, avatar, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzaq.onNavigationEvent(), -788061203, zzaq.onNavigationEvent(), 788061211, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, CreditQuizMyPageViewModel creditQuizMyPageViewModel, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, creditQuizMyPageViewModel, function0, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, zzaq.onNavigationEvent(), -67359249, zzaq.onNavigationEvent(), 67359253, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, Futures3 futures3) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, futures3}, zzaq.onNavigationEvent(), -194731223, zzaq.onNavigationEvent(), 194731223, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, ActivityOnPausePoint activityOnPausePoint, getBacktraceNote getbacktracenote, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, activityOnPausePoint, getbacktracenote, function0, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, zzaq.onNavigationEvent(), 336450933, zzaq.onNavigationEvent(), -336450926, zzaq.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(getBacktraceNote getbacktracenote, String str, ActivityOnPausePoint activityOnPausePoint) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, str, activityOnPausePoint}, zzaq.onNavigationEvent(), 405082900, zzaq.onNavigationEvent(), -405082894, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(ActivityOnPausePoint activityOnPausePoint, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{activityOnPausePoint, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzaq.onNavigationEvent(), -938211632, zzaq.onNavigationEvent(), 938211634, zzaq.onNavigationEvent());
    }

    private static final float onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return ((Float) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, zzaq.onNavigationEvent(), 1111208460, zzaq.onNavigationEvent(), -1111208449, iOnNavigationEvent)).floatValue();
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, Futures3 futures3) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, futures3}, zzaq.onNavigationEvent(), 978615132, zzaq.onNavigationEvent(), -978615122, iOnNavigationEvent);
    }

    private static final Unit onWarmupCompleted(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Avatar avatar, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, quirksExternalSyntheticBackport0, avatar, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, zzaq.onNavigationEvent(), -1418767258, zzaq.onNavigationEvent(), 1418767267, zzaq.onNavigationEvent());
    }

    private static final String onTransact(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (String) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutionsfor}, zzaq.onNavigationEvent(), -1838491659, zzaq.onNavigationEvent(), 1838491672, iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, String str, ActivityOnPausePoint activityOnPausePoint) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{getbacktracenote, str, activityOnPausePoint}, zzaq.onNavigationEvent(), 1347928238, zzaq.onNavigationEvent(), -1347928235, iOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(enableActivityMonitorInitFloatOpt enableactivitymonitorinitfloatopt, String str, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{enableactivitymonitorinitfloatopt, str, setDetectableSize}, zzaq.onNavigationEvent(), -537563346, zzaq.onNavigationEvent(), 537563351, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(String str, ActivityOnPausePoint activityOnPausePoint, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{str, activityOnPausePoint, setDetectableSize}, zzaq.onNavigationEvent(), -2117291668, zzaq.onNavigationEvent(), 2117291669, iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(ActivityOnPausePoint activityOnPausePoint, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{activityOnPausePoint, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzaq.onNavigationEvent(), 1116397618, zzaq.onNavigationEvent(), -1116397603, zzaq.onNavigationEvent());
    }

    private static final Unit onExtraCallbackWithResult(ActivityOnPausePoint activityOnPausePoint, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(zzaq.onNavigationEvent(), new Object[]{activityOnPausePoint, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, zzaq.onNavigationEvent(), 1442531471, zzaq.onNavigationEvent(), -1442531459, zzaq.onNavigationEvent());
    }
}
