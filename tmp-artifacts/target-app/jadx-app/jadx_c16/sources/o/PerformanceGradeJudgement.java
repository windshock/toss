package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.SvgPackage;
import com.otaliastudios.cameraview.R$styleable;
import com.tmoney.a;
import im.toss.feature.credit.ui.main.report.CreditScoreReportScreenKt$;
import im.toss.features.credit.data.remote.model.Badge;
import im.toss.features.credit.data.remote.model.CardUsageReportResponse;
import im.toss.features.credit.data.remote.model.CurrentUsageInfo;
import im.toss.features.credit.data.remote.model.DetailsButton;
import im.toss.features.credit.data.remote.model.HelpInfo;
import im.toss.features.credit.data.remote.model.LoanAccount;
import im.toss.features.credit.data.remote.model.LoanUsageReportResponse;
import im.toss.features.credit.data.remote.model.MyDataLinkInfo;
import im.toss.features.credit.data.remote.model.PreviousUsage;
import im.toss.features.credit.data.remote.model.Reason;
import im.toss.features.credit.data.remote.model.ScoreReasonAnalysisInfo;
import im.toss.features.credit.data.remote.model.ScoreReportResponse;
import im.toss.features.credit.data.remote.model.ScoreStatusBoardInfo;
import im.toss.features.credit.data.remote.model.ScoreStatusBoardLogParams;
import im.toss.features.credit.data.remote.model.StatusItem;
import im.toss.features.credit.data.remote.model.SubTitle;
import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2Row;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.tds.compose.component.compound.listheader.v3.RightPreset;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TimeoutCompanionNONE1;
import o.getPreRenderJob;
import o.getPrivacyDestinationUri;
import o.getViewTypeCount;
import o.hasProvider;
import o.initSDK;
import o.lExternalSyntheticLambda3;
import o.mExternalSyntheticApiModelOutline1;
import o.oExternalSyntheticLambda0;
import o.populateMuteImage;
import o.readFully;
import o.setByteOrder;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.wa;
import o.x2ExternalSyntheticLambda19;
import o.y1ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PerformanceGradeJudgement {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static long onNavigationEvent = -5211931489020642546L;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(CardUsageReportResponse cardUsageReportResponse, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent(cardUsageReportResponse, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardUsageReportResponse, rounduptonearesthalfint, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Reason reason, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(-663568037, new Object[]{reason, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 663568043, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i5 = onWarmupCompleted + 109;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(ScoreReportResponse scoreReportResponse, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 == 0) {
            return (Unit) onWarmupCompleted(698422269, new Object[]{scoreReportResponse, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -698422266, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        Unit unit = (Unit) onWarmupCompleted(698422269, new Object[]{scoreReportResponse, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -698422266, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i6 = 55 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, setDetectableSize);
        int i4 = onExtraCallback + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, int i, initSDK initsdk, Function1 function1, Function1 function12, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(list, i, initsdk, function1, function12, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, i, initsdk, function1, function12, x2externalsyntheticlambda21, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = onExtraCallback + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(List list, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(list, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, onnavigationevent);
        int i3 = onExtraCallback + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult((Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 55;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, LoanUsageReportResponse loanUsageReportResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, loanUsageReportResponse);
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, int i, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 71;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            onExtraCallback(quirksExternalSyntheticBackport0, list, i, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, list, i, function1, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i7 = onWarmupCompleted + 97;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 1 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, String str, String str2, String str3, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(quirksExternalSyntheticBackport0, list, str, str2, str3, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(quirksExternalSyntheticBackport0, list, str, str2, str3, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit IAuthTabCallback(addPermRequstCallback addpermrequstcallback, Function1 function1, Function0 function0, boolean z, updateMainThreadPriority updatemainthreadpriority, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(addpermrequstcallback, (Function1<? super String, Unit>) function1, (Function0<Unit>) function0, z, updatemainthreadpriority, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 123;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutions, futures3);
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, futures3);
        }
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, futures3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1814928238, new Object[]{getsupportedhighspeedresolutionsfor, getrequestcode}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1814928251, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Reason reason = (Reason) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1660199366, new Object[]{reason, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1660199371, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        LoanUsageReportResponse loanUsageReportResponse = (LoanUsageReportResponse) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(loanUsageReportResponse, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(loanUsageReportResponse, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 33 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        onNavigationEvent(quirksExternalSyntheticBackport0, str, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        Pair[] pairArr = (Pair[]) objArr[0];
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(pairArr, sessionProcessorCaptureCallback);
        }
        onNavigationEvent(pairArr, sessionProcessorCaptureCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsService(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(1656824216, new Object[]{quirksExternalSyntheticBackport0, str, function0, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1656824187, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        DetailsButton detailsButton = (DetailsButton) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, detailsButton);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = onWarmupCompleted + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        CardUsageReportResponse cardUsageReportResponse = (CardUsageReportResponse) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent(cardUsageReportResponse, function1, zBooleanValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardUsageReportResponse, function1, zBooleanValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        CardUsageReportResponse cardUsageReportResponse = (CardUsageReportResponse) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        RightPreset rightPreset = (RightPreset) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardUsageReportResponse, jLongValue, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        Unit unit;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        w5a w5aVar = (w5a) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onWarmupCompleted(1519336303, new Object[]{Boolean.valueOf(zBooleanValue), str, str2, Boolean.valueOf(zBooleanValue2), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1519336293, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            int i3 = 91 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(1519336303, new Object[]{Boolean.valueOf(zBooleanValue), str, str2, Boolean.valueOf(zBooleanValue2), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1519336293, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        int i4 = onWarmupCompleted + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        u3 u3Var = (u3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[0];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor);
        }
        onWarmupCompleted(r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(long j, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(j, str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(j, str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardUsageReportResponse cardUsageReportResponse, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cardUsageReportResponse, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CardUsageReportResponse cardUsageReportResponse, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardUsageReportResponse, r8lambdauhpxsw2exovtbrzj8u1te7trnw, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(Reason reason, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(reason, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(ScoreReportResponse scoreReportResponse, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(scoreReportResponse, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(scoreReportResponse, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(DisclaimerV2Row disclaimerV2Row, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(896787809, new Object[]{disclaimerV2Row, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -896787787, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, int i, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onWarmupCompleted(-77291498, new Object[]{str, str2, Integer.valueOf(i), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 77291530, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i6 = onExtraCallback + 31;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, String str3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onWarmupCompleted(-872198895, new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 872198904, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i7 = onExtraCallback + 57;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1);
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, str);
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 115;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(607551902, new Object[]{quirksExternalSyntheticBackport0, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        } else {
            onWarmupCompleted(607551902, new Object[]{quirksExternalSyntheticBackport0, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 97;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, setByteOrder setbyteorder, String str2, String str3, boolean z, boolean z2, boolean z3, Badge badge, DetailsButton detailsButton, boolean z4, boolean z5, Function0 function0, Function1 function1, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 41;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1632993060, new Object[]{quirksExternalSyntheticBackport0, str, setbyteorder, str2, str3, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), badge, detailsButton, Boolean.valueOf(z4), Boolean.valueOf(z5), function0, function1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1632993091, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i8 = onExtraCallback + 71;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, int i, Function1 function1, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 85;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(-409126899, new Object[]{quirksExternalSyntheticBackport0, list, Integer.valueOf(i), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 409126901, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 3;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, addPermRequstCallback addpermrequstcallback, updateMainThreadPriority updatemainthreadpriority, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, addpermrequstcallback, updatemainthreadpriority, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 7 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(addPermRequstCallback addpermrequstcallback, Function1 function1, Function0 function0, boolean z, updateMainThreadPriority updatemainthreadpriority, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 79;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(addpermrequstcallback, function1, function0, z, updatemainthreadpriority, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(addpermrequstcallback, function1, function0, z, updatemainthreadpriority, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, v1Var);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        int i5 = onExtraCallback + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutionsfor, futures3);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(getTimebase gettimebase, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(1584316298, new Object[]{gettimebase, futures3}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1584316278, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(initSDK initsdk, Function1 function1, Function1 function12, List list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(initsdk, function1, function12, list);
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(readfully, setorientationdegrees);
        int i4 = onExtraCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        onExtraCallback(scoreReportResponse, (List<hasProvider>) list, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanUsageReportResponse loanUsageReportResponse, long j, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanUsageReportResponse, j, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanUsageReportResponse loanUsageReportResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanUsageReportResponse, function1, z, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 56 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Reason reason, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(reason, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(reason, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreReportResponse scoreReportResponse, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(scoreReportResponse, onnavigationevent);
        }
        onWarmupCompleted(scoreReportResponse, onnavigationevent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreStatusBoardInfo scoreStatusBoardInfo, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(596269342, new Object[]{scoreStatusBoardInfo, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -596269316, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i5 = onExtraCallback + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(1200422679, objArr, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1200422665, iIAuthTabCallback);
        int i4 = onWarmupCompleted + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, im.toss.tds.compose.component.compound.listrow.v1.RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 111;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-361217727, new Object[]{str, setDetectableSize}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 361217735, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LoanUsageReportResponse loanUsageReportResponse, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, loanUsageReportResponse, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(addPermRequstCallback addpermrequstcallback, Function1 function1, Function0 function0, boolean z, updateMainThreadPriority updatemainthreadpriority, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(addpermrequstcallback, function1, function0, z, updatemainthreadpriority, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 93;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var, CardUsageReportResponse cardUsageReportResponse, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(findresandmsg, v1Var, cardUsageReportResponse, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(findresandmsg, v1Var, cardUsageReportResponse, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(findresandmsg, v1Var, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1864295594, new Object[]{getsupportedhighspeedresolutions, extensionsManager1}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1864295601, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, extensionsManager1);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(initSDK initsdk, Function1 function1, Function1 function12, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(initsdk, function1, function12, list);
        int i4 = onWarmupCompleted + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        w5a w5aVar = (w5a) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, str2, iIntValue, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {scoreReportResponse, list, Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)};
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback4 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        if (i3 == 0) {
            return (Unit) onWarmupCompleted(-918439657, objArr2, iIAuthTabCallback2, iIAuthTabCallback3, iIAuthTabCallback4, 918439657, iIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Badge badge, DetailsButton detailsButton, Function1 function1, im.toss.tds.compose.component.compound.listrow.v1.RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(badge, detailsButton, function1, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        int i6 = onExtraCallback + 123;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(CardUsageReportResponse cardUsageReportResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            onWarmupCompleted(cardUsageReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onWarmupCompleted(cardUsageReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(Reason reason, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onWarmupCompleted(1593255575, new Object[]{reason, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1593255540, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i5 = onWarmupCompleted + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(ScoreReportResponse scoreReportResponse, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(scoreReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, setByteOrder setbyteorder, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(str, setbyteorder, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(str, setbyteorder, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 25;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, CardUsageReportResponse cardUsageReportResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onWarmupCompleted(-1658937204, new Object[]{function1, cardUsageReportResponse}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1658937205, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, LoanAccount loanAccount) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, loanAccount);
        int i4 = onWarmupCompleted + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, List list, String str, String str2, String str3, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, (List<String>) list, str, str2, str3, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            IAuthTabCallback(quirksExternalSyntheticBackport0, (List<String>) list, str, str2, str3, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, addPermRequstCallback addpermrequstcallback, updateMainThreadPriority updatemainthreadpriority, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 19;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, addpermrequstcallback, updatemainthreadpriority, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 59;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(addPermRequstCallback addpermrequstcallback, Function1 function1, Function0 function0, boolean z, updateMainThreadPriority updatemainthreadpriority, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(addpermrequstcallback, (Function1<? super String, Unit>) function1, (Function0<Unit>) function0, z, updatemainthreadpriority, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 1;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutionsfor);
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, getrequestcode);
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(updateMainThreadPriority updatemainthreadpriority, addPermRequstCallback addpermrequstcallback, ScoreReportResponse scoreReportResponse, boolean z, Function1 function1, Function0 function0, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(updatemainthreadpriority, addpermrequstcallback, scoreReportResponse, z, function1, function0, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(updatemainthreadpriority, addpermrequstcallback, scoreReportResponse, z, function1, function0, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        setByteOrder setbyteorder = (setByteOrder) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
        Badge badge = (Badge) objArr[8];
        DetailsButton detailsButton = (DetailsButton) objArr[9];
        boolean zBooleanValue4 = ((Boolean) objArr[10]).booleanValue();
        boolean zBooleanValue5 = ((Boolean) objArr[11]).booleanValue();
        Function0 function0 = (Function0) objArr[12];
        Function1 function1 = (Function1) objArr[13];
        int iIntValue = ((Number) objArr[14]).intValue();
        int iIntValue2 = ((Number) objArr[15]).intValue();
        int iIntValue3 = ((Number) objArr[16]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        ((Number) objArr[18]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, str, setbyteorder, str2, str3, zBooleanValue, zBooleanValue2, zBooleanValue3, badge, detailsButton, zBooleanValue4, zBooleanValue5, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2), iIntValue3);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function1, scoreReportResponse);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, scoreReportResponse);
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) throws NoWhenBranchMatchedException {
        ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(scoreReportResponse, function1, zBooleanValue, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(scoreReportResponse, function1, zBooleanValue, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018d A[PHI: r0 r6
      0x018d: PHI (r0v92 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v91 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v97 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:20:0x018b, B:17:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r6v11 int) = (r6v10 int), (r6v59 int) binds: [B:20:0x018b, B:17:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190 A[PHI: r0 r6
      0x0190: PHI (r0v96 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v91 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v97 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:20:0x018b, B:17:0x017c] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r6v58 int) = (r6v10 int), (r6v59 int) binds: [B:20:0x018b, B:17:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        boolean z;
        long jOnUnminimized;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i7;
        int i8;
        boolean z2;
        Function0 function0;
        int i9;
        Object obj;
        long jLongValue;
        long jLongValue2;
        int i10;
        int i11 = ~i5;
        int i12 = ~i;
        int i13 = ~(i11 | i12);
        int i14 = (~((~i6) | i12)) | i13;
        int i15 = i5 | i;
        int i16 = (~(i6 | i12)) | i13;
        int i17 = i5 + i + i2 + (1258674323 * i3) + ((-126594725) * i4);
        int i18 = i17 * i17;
        int i19 = ((i5 * (-1656160718)) - 817430035) + (i * (-1656161339)) + (i14 * 621) + (i15 * 621) + (i16 * 621) + ((-1656160097) * i2) + ((-2121497779) * i3) + (1378977669 * i4) + (i18 * (-275906560));
        switch (((-1449289074) * i5) + 1954676736 + ((-212912869) * i) + (i14 * (-1236376205)) + (i15 * (-1236376205)) + ((-1236376205) * i16) + (1609302016 * i2) + (881065984 * i3) + ((-991690752) * i4) + ((-541982720) * i18) + (i19 * i19 * (-372375552))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                ((Number) objArr[3]).intValue();
                int i20 = 2 % 2;
                int i21 = onExtraCallback + 109;
                onWarmupCompleted = i21 % 128;
                int i22 = i21 % 2;
                onExtraCallback(scoreReportResponse, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
                Unit unit = Unit.INSTANCE;
                int i23 = onWarmupCompleted + 121;
                onExtraCallback = i23 % 128;
                int i24 = i23 % 2;
                return unit;
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                int i25 = 4;
                Reason reason = (Reason) objArr[0];
                w5a w5aVar = (w5a) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i26 = 2 % 2;
                int i27 = onExtraCallback + 85;
                onWarmupCompleted = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue2 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(w5aVar)) {
                        int i29 = onExtraCallback + 79;
                        int i30 = i29 % 128;
                        onWarmupCompleted = i30;
                        if (i29 % 2 != 0) {
                            i25 = 2;
                        }
                        int i31 = i30 + 17;
                        onExtraCallback = i31 % 128;
                        int i32 = i31 % 2;
                    } else {
                        i25 = 2;
                    }
                    iIntValue2 |= i25;
                    int i33 = onExtraCallback + 107;
                    onWarmupCompleted = i33 % 128;
                    int i34 = i33 % 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    int i35 = onWarmupCompleted + 31;
                    onExtraCallback = i35 % 128;
                    z = i35 % 2 != 0;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    int i36 = onExtraCallback + 109;
                    onWarmupCompleted = i36 % 128;
                    int i37 = i36 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i38 = onWarmupCompleted + 71;
                        onExtraCallback = i38 % 128;
                        int i39 = i38 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1292190631, iIntValue2, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:366)");
                    }
                    String strOnWarmupCompleted = reason.onWarmupCompleted();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        int i40 = onExtraCallback + 123;
                        onWarmupCompleted = i40 % 128;
                        if (i40 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-549640352);
                            jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 110)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-549640352);
                            jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-549639392);
                        jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onUnminimized();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    w5aVar.IAuthTabCallbackStub(strOnWarmupCompleted, reason.onExtraCallbackWithResult(), new getHumanReadableName(jOnUnminimized, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult2, (iIntValue2 << 12) & 57344, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int iIntValue4 = ((Number) objArr[4]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                ((Number) objArr[6]).intValue();
                int i41 = 2 % 2;
                int i42 = onWarmupCompleted + 33;
                onExtraCallback = i42 % 128;
                if (i42 % 2 != 0) {
                    iIntValue4 |= 1;
                }
                onWarmupCompleted(str, str2, str3, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult3, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue4));
                Unit unit2 = Unit.INSTANCE;
                int i43 = onExtraCallback + 55;
                onWarmupCompleted = i43 % 128;
                int i44 = i43 % 2;
                return unit2;
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                return onTransact(objArr);
            case 12:
                return asInterface(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return access000(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                return access100(objArr);
            case 17:
                return IAuthTabCallback_Parcel(objArr);
            case 18:
                return extraCallbackWithResult(objArr);
            case 19:
                return writeTypedObject(objArr);
            case 20:
                return ICustomTabsCallback(objArr);
            case 21:
                return extraCallback(objArr);
            case 22:
                return readTypedObject(objArr);
            case 23:
                return onActivityResized(objArr);
            case 24:
                return onActivityLayout(objArr);
            case 25:
                return onMessageChannelReady(objArr);
            case R$styleable.CameraView_cameraPictureMetering /* 26 */:
                return onMinimized(objArr);
            case 27:
                return onPostMessage(objArr);
            case 28:
                return ICustomTabsCallbackDefault(objArr);
            case 29:
                return ICustomTabsCallbackStub(objArr);
            case 30:
                return onUnminimized(objArr);
            case 31:
                return onRelationshipValidationResult(objArr);
            case 32:
                return ICustomTabsCallbackStubProxy(objArr);
            case 33:
                return ICustomTabsService(objArr);
            case 34:
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[0];
                String str4 = (String) objArr[1];
                Function0 function02 = (Function0) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue5 = ((Number) objArr[4]).intValue();
                int iIntValue6 = ((Number) objArr[5]).intValue();
                int i45 = 2 % 2;
                int i46 = onExtraCallback + 1;
                onWarmupCompleted = i46 % 128;
                if (i46 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(function02, "");
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallback(-1888750);
                    i7 = iIntValue6 & 1;
                    if (i7 != 0) {
                        i8 = iIntValue5 | 6;
                    } else if ((iIntValue5 & 6) == 0) {
                        i8 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 2 : 4) | iIntValue5;
                    } else {
                        i8 = iIntValue5;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(function02, "");
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallback(-1888750);
                    i7 = iIntValue6 & 1;
                    if (i7 != 0) {
                    }
                }
                if ((iIntValue5 & 48) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4)) {
                        i10 = 32;
                    } else {
                        int i47 = onExtraCallback + 95;
                        onWarmupCompleted = i47 % 128;
                        int i48 = i47 % 2;
                        i10 = 16;
                    }
                    i8 |= i10;
                }
                if ((iIntValue5 & 384) == 0) {
                    i8 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 256 : 128;
                }
                int i49 = i8;
                if ((i49 & 147) != 146) {
                    int i50 = onExtraCallback + 117;
                    onWarmupCompleted = i50 % 128;
                    int i51 = i50 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i49 & 1)) {
                    if (i7 != 0) {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i52 = onExtraCallback + 37;
                        onWarmupCompleted = i52 % 128;
                        int i53 = i52 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1888750, i49, -1, "im.toss.feature.credit.ui.main.report.TopLineGradientListFooter (CreditScoreReportScreen.kt:1181)");
                    }
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda02.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent()));
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        int i54 = onWarmupCompleted + 105;
                        onExtraCallback = i54 % 128;
                        if (i54 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1815080135);
                            jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 22).onRelationshipValidationResult();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1815080135);
                            jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1815079175);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(jLongValue, 0.8f)));
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1815076391);
                        jLongValue2 = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1815075431);
                        jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    int i55 = onWarmupCompleted + 31;
                    onExtraCallback = i55 % 128;
                    int i56 = i55 % 2;
                    Pair[] pairArr = {pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(Float.valueOf(0.75f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(jLongValue2, 0.8f))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda02.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent()))};
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda13();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (toMetersPerSecond) null, true, (RenderEffect) null, 0L, 0L, 0, 0, (seek) null, 520191, (Object) null);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(pairArr);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized2 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda14(pairArr);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized2), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                        int i57 = onWarmupCompleted + 29;
                        onExtraCallback = i57 % 128;
                        int i58 = i57 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i59 = onWarmupCompleted + 111;
                        onExtraCallback = i59 % 128;
                        int i60 = i59 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    i9 = iIntValue5;
                    obj = null;
                    function0 = function02;
                    r8lambdaaaW7q4e7M6FXEn0dhXQ28rxyMzQ.IAuthTabCallback(str4, (QuirksExternalSyntheticBackport0) null, y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService(), function0, (String) null, GraphicDeviceInfo.Companion.asBinder(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), false, (lExternalSyntheticLambda3.onWarmupCompleted) null, false, (lExternalSyntheticLambda3.onWarmupCompleted) null, (lExternalSyntheticLambda3.onExtraCallbackWithResult) null, (Drawable) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i49 >> 3) & 14) | 1769472 | ((i49 << 3) & 7168), 0, 8082);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    function0 = function02;
                    i9 = iIntValue5;
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda15(onextracallback, str4, function0, i9, iIntValue6));
                }
                return obj;
            case 35:
                Reason reason2 = (Reason) objArr[0];
                setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue7 = ((Number) objArr[3]).intValue();
                int i61 = 2 % 2;
                Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i62 = onWarmupCompleted + 121;
                    onExtraCallback = i62 % 128;
                    int i63 = i62 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-48637924, iIntValue7, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:357)");
                }
                getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1292190631, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda75(reason2), cameraCaptureResultEmptyCameraCaptureResult5, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-269234907, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda76(reason2), cameraCaptureResultEmptyCameraCaptureResult5, 54), onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult5, 1576326, 384, 126898);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i64 = onWarmupCompleted + 31;
                    onExtraCallback = i64 % 128;
                    int i65 = i64 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i66 = onExtraCallback + 41;
                    onWarmupCompleted = i66 % 128;
                    int i67 = i66 % 2;
                }
                return Unit.INSTANCE;
            case R$styleable.CameraView_cameraPictureSnapshotMetering /* 36 */:
                return ICustomTabsCallback_Parcel(objArr);
            case R$styleable.CameraView_cameraPlaySounds /* 37 */:
                return mayLaunchUrl(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static final Unit onWarmupCompleted(long j, String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(j, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardUsageReportResponse cardUsageReportResponse, r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(cardUsageReportResponse, r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(cardUsageReportResponse, r8lambda_moq0nysrol1o0qmavnpwgoovto, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(LoanUsageReportResponse loanUsageReportResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(loanUsageReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(loanUsageReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ScoreReportResponse scoreReportResponse, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 == 0) {
            return (Unit) onWarmupCompleted(-343006415, new Object[]{scoreReportResponse, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 343006442, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(list, onnavigationevent);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, PreviousUsage previousUsage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, previousUsage);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, ScoreReportResponse scoreReportResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, scoreReportResponse);
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, str);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = onExtraCallback + 95;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, List list, Function1 function1, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, i, list, function1, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 24 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, str, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 91 / 0;
        }
        int i8 = onWarmupCompleted + 77;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(addPermRequstCallback addpermrequstcallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(addpermrequstcallback, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(findresandmsg, v1Var);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = onExtraCallback + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 9;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ExpandableListView.getPackedPositionChild(0L) + 60, (Process.myPid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 58, 6383 - Color.blue(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $10 + 43;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit onWarmupCompleted(ScoreReportResponse scoreReportResponse, initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        ScoreStatusBoardInfo scoreStatusBoardInfoAsBinder = scoreReportResponse.asBinder();
        if (scoreStatusBoardInfoAsBinder != null) {
            int i4 = onExtraCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ScoreStatusBoardLogParams scoreStatusBoardLogParamsIAuthTabCallback = scoreStatusBoardInfoAsBinder.IAuthTabCallback();
            if (scoreStatusBoardLogParamsIAuthTabCallback != null) {
                int i6 = onWarmupCompleted + 35;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                onnavigationevent.onExtraCallback("recent_loan_sector", scoreStatusBoardLogParamsIAuthTabCallback.onTransact());
                onnavigationevent.onExtraCallback("debit_card_usage_duration", scoreStatusBoardLogParamsIAuthTabCallback.IAuthTabCallback());
                onnavigationevent.onExtraCallback("delinquency_day", scoreStatusBoardLogParamsIAuthTabCallback.onWarmupCompleted());
                onnavigationevent.onExtraCallback("credit_history_length", scoreStatusBoardLogParamsIAuthTabCallback.onExtraCallbackWithResult());
                onnavigationevent.onExtraCallback("non_financial_info_cnt", scoreStatusBoardLogParamsIAuthTabCallback.onNavigationEvent());
                onnavigationevent.onExtraCallback("on_time_payment_duration", scoreStatusBoardLogParamsIAuthTabCallback.onExtraCallback());
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 31;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 40 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        getTimebase gettimebase = (getTimebase) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            gettimebase.onExtraCallback((int) Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        gettimebase.onExtraCallback((int) Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 91;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Function1 function1, ScoreReportResponse scoreReportResponse) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        DetailsButton detailsButtonOnExtraCallbackWithResult = scoreReportResponse.onExtraCallbackWithResult();
        if (detailsButtonOnExtraCallbackWithResult != null) {
            int i2 = onWarmupCompleted + 49;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            strOnWarmupCompleted = detailsButtonOnExtraCallbackWithResult.onWarmupCompleted();
            if (strOnWarmupCompleted == null) {
                strOnWarmupCompleted = "";
            }
        }
        function1.invoke(strOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[PHI: r2
      0x008c: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v10 java.lang.String) binds: [B:29:0x0089, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        boolean z;
        String str;
        String strOnNavigationEvent;
        int i;
        ScoreReportResponse scoreReportResponse = (ScoreReportResponse) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        u4 u4Var = (u4) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
                int i3 = onWarmupCompleted + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i5 = onExtraCallback + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1674230808, iIntValue, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportScreen.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:205)");
            }
            DetailsButton detailsButtonOnExtraCallbackWithResult = scoreReportResponse.onExtraCallbackWithResult();
            if (detailsButtonOnExtraCallbackWithResult != null) {
                int i7 = onExtraCallback + 83;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    strOnNavigationEvent = detailsButtonOnExtraCallbackWithResult.onNavigationEvent();
                    int i8 = 10 / 0;
                    str = strOnNavigationEvent == null ? "" : strOnNavigationEvent;
                } else {
                    strOnNavigationEvent = detailsButtonOnExtraCallbackWithResult.onNavigationEvent();
                    if (strOnNavigationEvent == null) {
                    }
                }
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(scoreReportResponse);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CreditScoreReportScreenKt$.ExternalSyntheticLambda77 externalSyntheticLambda77 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda77(function1, scoreReportResponse);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda77);
                        obj = externalSyntheticLambda77;
                    }
                    u4Var.onNavigationEvent(str, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, iIntValue & 14, 1014);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i9 = onWarmupCompleted + 99;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i10 = 72 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 98) == 0) {
                int i6 = onWarmupCompleted + 99;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var);
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u3Var)) {
                    int i7 = onExtraCallback + 73;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u3Var, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 113;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-135105334, i3, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportScreen.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:215)");
            }
            u3Var.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.close, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (oExternalSyntheticLambda0.IAuthTabCallback) null, oExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onNavigationEvent(), 0L, false, function0, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 21) & 29360128) | 3072, 54);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(updateMainThreadPriority updatemainthreadpriority, addPermRequstCallback addpermrequstcallback, ScoreReportResponse scoreReportResponse, boolean z, Function1 function1, Function0 function0, enableLoopMonitor enableloopmonitor, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z2;
        Throwable th;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(enableloopmonitor, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            int i5 = onExtraCallback + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int iOrdinal = -1;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1232515766, i, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportScreen.<anonymous> (CreditScoreReportScreen.kt:159)");
            }
            setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getTimebase gettimebase = (getTimebase) objOnMinimized;
            if (updatemainthreadpriority == null) {
                int i7 = onExtraCallback + 109;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 33 / 0;
                }
            } else {
                iOrdinal = updatemainthreadpriority.ordinal();
            }
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOrdinal);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(setcontentinsetsrelativeIAuthTabCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i9 = onExtraCallback + 45;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new onExtraCallbackWithResult(updatemainthreadpriority, setcontentinsetsrelativeIAuthTabCallback, gettimebase, (access13800) null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(updatemainthreadpriority, addpermrequstcallback, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i11 = onWarmupCompleted + 39;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), setcontentinsetsrelativeIAuthTabCallback, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                    int i13 = onExtraCallback + 89;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i15 = onExtraCallback + 39;
                    onWarmupCompleted = i15 % 128;
                    if (i15 % 2 != 0) {
                        Object obj = null;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        obj.hashCode();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                onExtraCallback(scoreReportResponse, (List<hasProvider>) addpermrequstcallback.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                onWarmupCompleted(scoreReportResponse, (Function1<? super String, Unit>) function1, z, cameraCaptureResultEmptyCameraCaptureResult, 0);
                onExtraCallback(scoreReportResponse, cameraCaptureResultEmptyCameraCaptureResult, 0);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda41(gettimebase);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                onExtraCallback(r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(onextracallback, (Function1) objOnMinimized3), addpermrequstcallback, updatemainthreadpriority, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, 6, 0);
                onExtraCallbackWithResult((Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, 0);
                DisclaimerV2 disclaimerV2 = (DisclaimerV2) ScoreReportResponse.onNavigationEvent(869472741, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{scoreReportResponse}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -869472741);
                if (disclaimerV2 == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1670253910);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1670253911);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda42();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    onPageLoaded.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, disclaimerV2, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 384, 1);
                    Unit unit = Unit.INSTANCE;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (scoreReportResponse.onExtraCallbackWithResult() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-383674333);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1674230808, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda43(scoreReportResponse, function1), cameraCaptureResultEmptyCameraCaptureResult, 54);
                    if (z) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-383229111);
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback2 = ForwardingCameraControl.onExtraCallback(-135105334, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda44(function0), cameraCaptureResultEmptyCameraCaptureResult, 54);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        encoderProfilesProxyVideoProfileProxy = encoderProfilesProxyVideoProfileProxyOnExtraCallback2;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-382891491);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        encoderProfilesProxyVideoProfileProxy = null;
                    }
                    th = null;
                    u1.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (u2) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, encoderProfilesProxyVideoProfileProxy, 0L, true, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 805306758, 0, 3450);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    th = null;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-382814238);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onWarmupCompleted + 77;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw th;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable addPermRequstCallback addpermrequstcallback, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, boolean z, @Nullable updateMainThreadPriority updatemainthreadpriority, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        CreditScoreReportScreenKt$.ExternalSyntheticLambda60 externalSyntheticLambda57;
        ScoreReportResponse scoreReportResponseOnWarmupCompleted;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z4;
        updateMainThreadPriority updatemainthreadpriority2;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2075043459);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(addpermrequstcallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i8 = onExtraCallback + 85;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i10 = onWarmupCompleted + 39;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            int i12 = onExtraCallback + 125;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(updatemainthreadpriority == null ? -1 : updatemainthreadpriority.ordinal())) {
                    i5 = 16384;
                } else {
                    int i15 = onExtraCallback + 55;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362) {
                int i17 = onWarmupCompleted + 25;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                int i19 = onExtraCallback + 91;
                onWarmupCompleted = i19 % 128;
                int i20 = i19 % 2;
                boolean z5 = i14 != 0 ? false : z2;
                updateMainThreadPriority updatemainthreadpriority3 = i4 != 0 ? null : updatemainthreadpriority;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i21 = onExtraCallback + 29;
                    onWarmupCompleted = i21 % 128;
                    int i22 = i21 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2075043459, i3, -1, "im.toss.feature.credit.ui.main.report.CreditScoreReportScreen (CreditScoreReportScreen.kt:141)");
                }
                if (addpermrequstcallback == null || (scoreReportResponseOnWarmupCompleted = addpermrequstcallback.onWarmupCompleted()) == null) {
                    int i23 = onWarmupCompleted + 45;
                    onExtraCallback = i23 % 128;
                    int i24 = i23 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        externalSyntheticLambda57 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda57(addpermrequstcallback, function1, function0, z5, updatemainthreadpriority3, i, i2);
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda57);
                        return;
                    }
                    return;
                }
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreReportResponseOnWarmupCompleted);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CreditScoreReportScreenKt$.ExternalSyntheticLambda58 externalSyntheticLambda58 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda58(scoreReportResponseOnWarmupCompleted);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda58);
                        obj = externalSyntheticLambda58;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setThreadList.onWarmupCompleted(1624512L, (String) null, (Function1) obj, ForwardingCameraControl.onExtraCallback(-1232515766, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda59(updatemainthreadpriority3, addpermrequstcallback, scoreReportResponseOnWarmupCompleted, z5, function1, function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 3078, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = onWarmupCompleted + 95;
                        onExtraCallback = i25 % 128;
                        if (i25 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i26 = 17 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                    z4 = z5;
                    updatemainthreadpriority2 = updatemainthreadpriority3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda57);
                return;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            updatemainthreadpriority2 = updatemainthreadpriority;
            z4 = z2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                externalSyntheticLambda57 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda60(addpermrequstcallback, function1, function0, z4, updatemainthreadpriority2, i, i2);
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda57);
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final VirtualCameraControlExternalSyntheticLambda1 onWarmupCompleted(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fC_ = r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor));
        if (i3 == 0) {
            VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fC_);
            throw null;
        }
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1OnNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fC_);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return virtualCameraControlExternalSyntheticLambda1OnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(ScoreReportResponse scoreReportResponse, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = onWarmupCompleted + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-221174520, i, -1, "im.toss.feature.credit.ui.main.report.ScoreReportTop.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:244)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{scoreReportResponse.IAuthTabCallbackStub(), null, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131046}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 51;
                onExtraCallback = i7 % 128;
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

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        int iAsBinder = (int) futures3.asBinder();
        if (iAsBinder != IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor)) {
            onWarmupCompleted(-712545836, new Object[]{getsupportedhighspeedresolutionsfor, Integer.valueOf(iAsBinder)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 712545855, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, (int) futures3.asBinder());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor, (int) futures3.asBinder());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull ScoreReportResponse scoreReportResponse, @Nullable List<hasProvider> list, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        String str;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(scoreReportResponse, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2118009938);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreReportResponse)) {
                int i6 = onWarmupCompleted + 27;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list)) {
                i3 = 16;
            } else {
                int i8 = onExtraCallback + 101;
                onWarmupCompleted = i8 % 128;
                i3 = i8 % 2 != 0 ? 30 : 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i9 = onWarmupCompleted + 87;
            onExtraCallback = i9 % 128;
            z = i9 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 63;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2118009938, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReportTop (CreditScoreReportScreen.kt:233)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(IAuthTabCallbackDefault((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor3));
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky42);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new CreditScoreReportScreenKt$.ExternalSyntheticLambda65(r8lambdanm9dm2eewl4vrptnjmesfjqky42, getsupportedhighspeedresolutionsfor3));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized3;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
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
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda66(getsupportedhighspeedresolutionsfor3);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            }
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-221174520, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda67(scoreReportResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport02, (Function1) objOnMinimized4), (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, fIAuthTabCallback, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54, 384, 12284);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport02, 0.6f, false, 2, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda68(getsupportedhighspeedresolutionsfor2);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized5);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda6)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (list == null) {
                int i12 = onExtraCallback + 115;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(722374779);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                str = "";
                r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(722374780);
                getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor2;
                r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                str = "";
                mExternalSyntheticApiModelOutline1.onWarmupCompleted.onExtraCallbackWithResult(list, mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 12, (Object) null), Integer.MAX_VALUE, 0, 0, false, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onTransact(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult3, 3456, 1769472, 6, 949872);
                Unit unit = Unit.INSTANCE;
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0, 0.4f, false, 2, (Object) null), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4.c_(onTransact((getSupportedHighSpeedResolutionsFor<Integer>) getsupportedhighspeedresolutionsfor))).IAuthTabCallback());
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.IAuthTabCallback(), false);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                int i14 = onExtraCallback + 79;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback4);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
            String strOnTransact = scoreReportResponse.onTransact();
            AppLovinNativeAdImplc.onExtraCallbackWithResult(strOnTransact == null ? str : strOnTransact, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(180.0f), 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f), 0.0f, 11, (Object) null), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 48, 508);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda69(scoreReportResponse, list, i));
        }
        int i16 = onWarmupCompleted + 57;
        onExtraCallback = i16 % 128;
        int i17 = i16 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i;
        Reason reason = (Reason) objArr[0];
        w3b w3bVar = (w3b) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i3 = onWarmupCompleted + 21;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                i = 4;
            } else {
                int i5 = onWarmupCompleted + 91;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i7 = onWarmupCompleted + 91;
            onExtraCallback = i7 % 128;
            Object obj = null;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 37;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1817588958, iIntValue, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:327)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1817588958, iIntValue, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:327)");
            }
            w3bVar.onExtraCallbackWithResult(reason.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f), (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 384, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Reason reason, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        long jOnUnminimized;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onWarmupCompleted + 77;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 79;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-520636074, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:333)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-520636074, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:333)");
            }
            String strOnWarmupCompleted = reason.onWarmupCompleted();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (!(!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue())) {
                int i9 = onExtraCallback + 13;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2115054307);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 43)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2115054307);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2115053347);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            w5aVar.IAuthTabCallbackStub(strOnWarmupCompleted, reason.onExtraCallbackWithResult(), new getHumanReadableName(jOnUnminimized, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 97;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Reason reason, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 84 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = onWarmupCompleted + 63;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 59;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-269234907, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:360)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-269234907, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:360)");
            }
            w3bVar.onExtraCallbackWithResult(reason.onExtraCallback(), (QuirksExternalSyntheticBackport0) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f), (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 384, 122);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 13;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onWarmupCompleted + 47;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Function1 function1, ScoreReportResponse scoreReportResponse) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ScoreReasonAnalysisInfo scoreReasonAnalysisInfoAsInterface = scoreReportResponse.asInterface();
        if (scoreReasonAnalysisInfoAsInterface != null) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                strIAuthTabCallback = scoreReasonAnalysisInfoAsInterface.IAuthTabCallback();
                int i5 = 68 / 0;
                if (strIAuthTabCallback == null) {
                    int i6 = onWarmupCompleted + 51;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    strIAuthTabCallback = "";
                }
            } else {
                strIAuthTabCallback = scoreReasonAnalysisInfoAsInterface.IAuthTabCallback();
                if (strIAuthTabCallback == null) {
                }
            }
        }
        function1.invoke(strIAuthTabCallback);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull ScoreReportResponse scoreReportResponse, @NotNull Function1<? super String, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Pair pairIAuthTabCallback;
        int i3;
        String strOnExtraCallback;
        boolean z2;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        String strOnExtraCallback2;
        Object objOnMinimized;
        int i4;
        int i5 = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(scoreReportResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(300695035);
        setOnQueryTextListener setonquerytextlistener = null;
        if ((i & 6) == 0) {
            int i6 = onWarmupCompleted + 83;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreReportResponse);
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreReportResponse) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i7 = onWarmupCompleted + 123;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        int i9 = i2;
        boolean z3 = true;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i9 & 147) != 146, i9 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(300695035, i9, -1, "im.toss.feature.credit.ui.main.report.ScoreReasonSection (CreditScoreReportScreen.kt:310)");
            }
            ScoreReasonAnalysisInfo scoreReasonAnalysisInfoAsInterface = scoreReportResponse.asInterface();
            List listOnWarmupCompleted = scoreReasonAnalysisInfoAsInterface != null ? scoreReasonAnalysisInfoAsInterface.onWarmupCompleted() : null;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i10 = onWarmupCompleted + 119;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
            List list = listOnWarmupCompleted;
            if (list == null || list.isEmpty()) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1291921593);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                int i12 = onWarmupCompleted + 87;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1295605106);
                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                    if (listOnWarmupCompleted.size() <= 4) {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(listOnWarmupCompleted, CollectionsKt.emptyList());
                    } else {
                        List list2 = listOnWarmupCompleted;
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(CollectionsKt.take(list2, 2), CollectionsKt.drop(list2, 2));
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1295605106);
                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                    if (listOnWarmupCompleted.size() <= 3) {
                    }
                }
                List list3 = (List) pairIAuthTabCallback.onExtraCallbackWithResult();
                List list4 = (List) pairIAuthTabCallback.IAuthTabCallback();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1205136867);
                Iterator it = list3.iterator();
                while (true) {
                    i3 = 54;
                    if (!it.hasNext()) {
                        break;
                    }
                    Reason reason = (Reason) it.next();
                    getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                    boolean z4 = z3;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-520636074, z4, new CreditScoreReportScreenKt$.ExternalSyntheticLambda35(reason), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-1817588958, z4, new CreditScoreReportScreenKt$.ExternalSyntheticLambda36(reason), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult3, 1576326, 384, 126898);
                    getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor2;
                    setonquerytextlistener = null;
                    i9 = i9;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3;
                    z3 = true;
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = getsupportedhighspeedresolutionsfor2;
                int i13 = i9;
                setOnQueryTextListener setonquerytextlistener2 = setonquerytextlistener;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                float f = 0.0f;
                int i14 = 6;
                if (z) {
                    List list5 = list4;
                    if (list5.isEmpty()) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                        if (z) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1291927545);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292300413);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, setonquerytextlistener2), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f), 5, (Object) null);
                            ScoreReasonAnalysisInfo scoreReasonAnalysisInfoAsInterface2 = scoreReportResponse.asInterface();
                            if (scoreReasonAnalysisInfoAsInterface2 == null || (strOnExtraCallback = scoreReasonAnalysisInfoAsInterface2.onExtraCallback()) == null) {
                                strOnExtraCallback = "";
                            }
                            if ((i13 & 112) == 32) {
                                int i15 = onExtraCallback + 121;
                                onWarmupCompleted = i15 % 128;
                                int i16 = i15 % 2;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(scoreReportResponse);
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if ((zOnExtraCallback | z2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized3 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda39(function1, scoreReportResponse);
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                            }
                            onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, strOnExtraCallback, (Function0<Unit>) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-1294317769);
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1205174214);
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            setVerticalGravity.onWarmupCompleted(onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3), (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(500, 0, setonquerytextlistener2, i14, setonquerytextlistener2), f, 2, setonquerytextlistener2), (SearchView) null, (String) null, ForwardingCameraControl.onExtraCallback(-48637924, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda37((Reason) it2.next()), cameraCaptureResultEmptyCameraCaptureResult4, i3), cameraCaptureResultEmptyCameraCaptureResult4, 196992, 26);
                            f = f;
                            str = str;
                            i3 = i3;
                            i14 = 6;
                        }
                        String str2 = str;
                        float f2 = f;
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3) || list5.isEmpty()) {
                            getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor3;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292450329);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292829924);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, f2, 1, setonquerytextlistener2), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f), 5, (Object) null);
                            ScoreReasonAnalysisInfo scoreReasonAnalysisInfoAsInterface3 = scoreReportResponse.asInterface();
                            if (scoreReasonAnalysisInfoAsInterface3 != null) {
                                int i17 = onWarmupCompleted + 13;
                                onExtraCallback = i17 % 128;
                                int i18 = i17 % 2;
                                strOnExtraCallback2 = scoreReasonAnalysisInfoAsInterface3.onExtraCallback();
                                if (strOnExtraCallback2 == null) {
                                    int i19 = onExtraCallback + 87;
                                    onWarmupCompleted = i19 % 128;
                                    int i20 = i19 % 2;
                                    strOnExtraCallback2 = str2;
                                }
                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor3;
                                    objOnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda38(getsupportedhighspeedresolutionsfor);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                                } else {
                                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor3;
                                }
                                onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, strOnExtraCallback2, (Function0<Unit>) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 390);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                strOnExtraCallback2 = str2;
                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                }
                                onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback2, strOnExtraCallback2, (Function0<Unit>) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 390);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                        }
                        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                            int i21 = onWarmupCompleted + 75;
                            onExtraCallback = i21 % 128;
                            if (i21 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292414338);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 104);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292414338);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            int i22 = onWarmupCompleted + 91;
                            onExtraCallback = i22 % 128;
                            int i23 = i22 % 2;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1292344185);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda40(scoreReportResponse, function1, z, i));
            int i24 = onWarmupCompleted + 97;
            onExtraCallback = i24 % 128;
            int i25 = i24 % 2;
        }
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        int i;
        ScoreStatusBoardInfo scoreStatusBoardInfo = (ScoreStatusBoardInfo) objArr[0];
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onExtraCallback + 45;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                i = 2;
            } else {
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                i = 4;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 105;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(389138700, iIntValue, -1, "im.toss.feature.credit.ui.main.report.ScoreBoardSection.<anonymous> (CreditScoreReportScreen.kt:425)");
            }
            areallitemsenabled.onWarmupCompleted(scoreStatusBoardInfo.asBinder(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 18) & 3670016) | 196608, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onWarmupCompleted + 55;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getrequestcode, "");
            onExtraCallback((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor, getrequestcode);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(getrequestcode, "");
        onExtraCallback((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor, getrequestcode);
        int i3 = 9 / 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void onExtraCallback(@NotNull ScoreReportResponse scoreReportResponse, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        List<StatusItem> listIAuthTabCallbackDefault;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(scoreReportResponse, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-925828066);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(scoreReportResponse)) {
                int i7 = onExtraCallback + 67;
                onWarmupCompleted = i7 % 128;
                i3 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-925828066, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreBoardSection (CreditScoreReportScreen.kt:417)");
            }
            ScoreStatusBoardInfo scoreStatusBoardInfoAsBinder = scoreReportResponse.asBinder();
            if (scoreStatusBoardInfoAsBinder != null) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(936254210);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getRequestCode.LEFT, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(389138700, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda54(scoreStatusBoardInfoAsBinder), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0, 4086);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 5, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                List listListOf = CollectionsKt.listOf(new String[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_status_board_positive_tab, cameraCaptureResultEmptyCameraCaptureResult2, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_status_board_negative_tab, cameraCaptureResultEmptyCameraCaptureResult2, 0)});
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda55(getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                onWarmupCompleted(-409126899, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, listListOf, 0, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 3078, 4}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 409126901, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                int i8 = onExtraCallback.onWarmupCompleted[onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor).ordinal()];
                if (i8 == 1) {
                    listIAuthTabCallbackDefault = scoreStatusBoardInfoAsBinder.IAuthTabCallbackDefault();
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i9 = onExtraCallback + 61;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    listIAuthTabCallbackDefault = scoreStatusBoardInfoAsBinder.onExtraCallbackWithResult();
                }
                if (listIAuthTabCallbackDefault == null) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(937211520);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(937211521);
                    for (StatusItem statusItem : listIAuthTabCallbackDefault) {
                        onWarmupCompleted(statusItem.onNavigationEvent(), statusItem.onExtraCallbackWithResult(), statusItem.onExtraCallback(), statusItem.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                onPageLoadError.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(937455460);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda56(scoreReportResponse, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[PHI: r4
      0x00ab: PHI (r4v13 java.lang.String) = (r4v12 java.lang.String), (r4v15 java.lang.String) binds: [B:27:0x00a8, B:24:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(addPermRequstCallback addpermrequstcallback, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        String str;
        String str2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onExtraCallback + 47;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 73;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-283601781, i2, -1, "im.toss.feature.credit.ui.main.report.CardAndLoanReportSection.<anonymous> (CreditScoreReportScreen.kt:476)");
            }
            ScoreReportResponse scoreReportResponseOnWarmupCompleted = addpermrequstcallback.onWarmupCompleted();
            if (scoreReportResponseOnWarmupCompleted != null) {
                int i8 = onWarmupCompleted + 55;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    str2 = (String) ScoreReportResponse.onNavigationEvent(-62913333, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{scoreReportResponseOnWarmupCompleted}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 62913334);
                    int i9 = 41 / 0;
                    if (str2 == null) {
                        int i10 = onWarmupCompleted + 109;
                        onExtraCallback = i10 % 128;
                        int i11 = i10 % 2;
                        str = "";
                    } else {
                        str = str2;
                    }
                } else {
                    str2 = (String) ScoreReportResponse.onNavigationEvent(-62913333, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{scoreReportResponseOnWarmupCompleted}, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 62913334);
                    if (str2 == null) {
                    }
                }
                areallitemsenabled.onWarmupCompleted(str, (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 196608, 22);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        getRequestCode getrequestcode = (getRequestCode) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getrequestcode, "");
            onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor, getrequestcode);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(getrequestcode, "");
        onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor, getrequestcode);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull addPermRequstCallback addpermrequstcallback, @Nullable updateMainThreadPriority updatemainthreadpriority, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        updateMainThreadPriority updatemainthreadpriority2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        updateMainThreadPriority updatemainthreadpriority3;
        updateMainThreadPriority updatemainthreadpriority4;
        getRequestCode getrequestcode;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(addpermrequstcallback, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(984430621);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            int i6 = onWarmupCompleted + 115;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(addpermrequstcallback) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i9 = onExtraCallback + 75;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(updatemainthreadpriority == null ? -1 : updatemainthreadpriority.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1024 : 2048;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            int i10 = onWarmupCompleted;
            int i11 = i10 + 123;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            if (i5 != 0) {
                int i13 = i10 + 7;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            }
            if (i8 != 0) {
                int i15 = onExtraCallback + 57;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                updatemainthreadpriority3 = null;
            } else {
                updatemainthreadpriority3 = updatemainthreadpriority;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(984430621, i3, -1, "im.toss.feature.credit.ui.main.report.CardAndLoanReportSection (CreditScoreReportScreen.kt:467)");
            }
            if (addpermrequstcallback.onExtraCallback() == null || addpermrequstcallback.onExtraCallbackWithResult() == null) {
                updatemainthreadpriority4 = updatemainthreadpriority3;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1137542149);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1136233267);
                updateMainThreadPriority updatemainthreadpriority5 = updateMainThreadPriority.LOAN;
                if (updatemainthreadpriority3 == updatemainthreadpriority5) {
                    int i17 = onWarmupCompleted + 11;
                    onExtraCallback = i17 % 128;
                    int i18 = i17 % 2;
                    getrequestcode = getRequestCode.RIGHT;
                } else {
                    getrequestcode = getRequestCode.LEFT;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(getrequestcode, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-283601781, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda46(addpermrequstcallback), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport04, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, (getBacktraceNote) null, (wa.onWarmupCompleted) null, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 3) & 112) | 3078, 0, 4084);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
                List listListOf = CollectionsKt.listOf(new String[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_card_usage_tab, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_loan_usage_tab, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)});
                int i19 = updatemainthreadpriority3 == updatemainthreadpriority5 ? 1 : 0;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda47(getsupportedhighspeedresolutionsfor);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                onWarmupCompleted(-409126899, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, listListOf, Integer.valueOf(i19), (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3078, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 409126901, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1145061717, IAuthTabCallback((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor));
                int i20 = onExtraCallback.onWarmupCompleted[IAuthTabCallback((getSupportedHighSpeedResolutionsFor<getRequestCode>) getsupportedhighspeedresolutionsfor).ordinal()];
                if (i20 == 1) {
                    updatemainthreadpriority4 = updatemainthreadpriority3;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1145064715);
                    onWarmupCompleted(addpermrequstcallback.onExtraCallback(), function1, updatemainthreadpriority4 == updateMainThreadPriority.CARD, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 6) & 112, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    if (i20 != 2) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1145063009);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw new NoWhenBranchMatchedException();
                    }
                    int i21 = onWarmupCompleted + 67;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1145069195);
                    LoanUsageReportResponse loanUsageReportResponseOnExtraCallbackWithResult = addpermrequstcallback.onExtraCallbackWithResult();
                    if (updatemainthreadpriority3 == updatemainthreadpriority5) {
                        int i23 = onExtraCallback + 123;
                        onWarmupCompleted = i23 % 128;
                        if (i23 % 2 == 0) {
                            z = true;
                        }
                    }
                    updatemainthreadpriority4 = updatemainthreadpriority3;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    onExtraCallback(loanUsageReportResponseOnExtraCallbackWithResult, function1, z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 6) & 112, 0);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackStub();
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = onExtraCallback + 87;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            updatemainthreadpriority2 = updatemainthreadpriority4;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            updatemainthreadpriority2 = updatemainthreadpriority;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda48(quirksExternalSyntheticBackport03, addpermrequstcallback, updatemainthreadpriority2, function1, i, i2));
        }
    }

    private static final Unit onNavigationEvent(List list, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Object[] objArr = new Object[1];
            a(new char[]{65101, 33825, 2747, 37178}, (PointF.length(2.0f, 2.0f) > 2.0f ? 1 : (PointF.length(2.0f, 2.0f) == 2.0f ? 0 : -1)) + 11448, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{65101, 33825, 2747, 37178}, 31357 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        onnavigationevent.onExtraCallback(((String) obj).intern(), (CharSequence) CollectionsKt.first(list));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(initSDK initsdk, Function1 function1, Function1 function12, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
            if (initsdk != null) {
                initsdk.setCustomParams(new CreditScoreReportScreenKt$.ExternalSyntheticLambda27(list));
                int i4 = onWarmupCompleted + 109;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (initsdk != null) {
        }
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        function1.invoke(0);
        function12.invoke(getRequestCode.LEFT);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(List list, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Object[] objArr = new Object[1];
        a(new char[]{65101, 33825, 2747, 37178}, 31357 - TextUtils.indexOf("", ""), objArr);
        onnavigationevent.onExtraCallback(((String) objArr[0]).intern(), (CharSequence) list.get(1));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(initSDK initsdk, Function1 function1, Function1 function12, List list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (initsdk != null) {
            initsdk.setCustomParams(new CreditScoreReportScreenKt$.ExternalSyntheticLambda45(list));
            int i3 = onExtraCallback + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        function1.invoke(1);
        function12.invoke(getRequestCode.RIGHT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(List list, int i, initSDK initsdk, Function1 function1, Function1 function12, x2ExternalSyntheticLambda21 x2externalsyntheticlambda21, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        boolean zOnNavigationEvent3;
        boolean zOnNavigationEvent4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(x2externalsyntheticlambda21, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(x2externalsyntheticlambda21) ? 4 : 2);
        } else {
            i3 = i2;
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i5 = onWarmupCompleted + 47;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1255596517, i3, -1, "im.toss.feature.credit.ui.main.report.ScoreReportTab.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:520)");
                }
                String str = (String) CollectionsKt.first(list);
                boolean z2 = i != 0;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CreditScoreReportScreenKt$.ExternalSyntheticLambda49 externalSyntheticLambda49 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda49(initsdk, function1, function12, list);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda49);
                        obj = externalSyntheticLambda49;
                    }
                    int i7 = (i3 << 3) & 112;
                    x2externalsyntheticlambda21.IAuthTabCallback(str, z2, (Function0) obj, (QuirksExternalSyntheticBackport0) null, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 2040);
                    String str2 = (String) list.get(1);
                    if (i == 1) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        z = true;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    }
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(initsdk);
                    boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(list);
                    boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                    boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function12);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent5 | zOnNavigationEvent6 | zOnNavigationEvent7 | zOnNavigationEvent8)) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            CreditScoreReportScreenKt$.ExternalSyntheticLambda50 externalSyntheticLambda50 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda50(initsdk, function1, function12, list);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda50);
                            obj2 = externalSyntheticLambda50;
                        }
                        x2externalsyntheticlambda21.IAuthTabCallback(str2, z, (Function0) obj2, (QuirksExternalSyntheticBackport0) null, false, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function2) null, cameraCaptureResultEmptyCameraCaptureResult, 0, i7, 2040);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i8 = onWarmupCompleted + 47;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String str3 = (String) CollectionsKt.first(list);
                if (i != 0) {
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(list);
                zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent | zOnNavigationEvent2 | zOnNavigationEvent3 | zOnNavigationEvent4) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallback + 33;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, List list, Function1 function1, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((i2 & 6) == 0) {
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                i4 = 32;
            } else {
                int i6 = onWarmupCompleted + 99;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 4;
                }
                i4 = 16;
            }
            i3 |= i4;
            int i8 = onExtraCallback + 125;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 47;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2041437885, i3, -1, "im.toss.feature.credit.ui.main.report.ScoreReportTab.<anonymous> (CreditScoreReportScreen.kt:512)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = notifyPublicListeners.onWarmupCompleted(i);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getTimebase gettimebase = (getTimebase) objOnMinimized;
            int iIntValue = ((Number) gettimebase.asBinder()).intValue();
            x2ExternalSyntheticLambda22.IAuthTabCallback(new Object[]{Integer.valueOf(iIntValue), quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0), x2ExternalSyntheticLambda19.onNavigationEvent.Fixed, x2ExternalSyntheticLambda19.asBinder.Companion.IAuthTabCallbackStub(), null, null, ForwardingCameraControl.onExtraCallback(1255596517, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda79(list, iIntValue, initsdk, gettimebase.onTransact(), function1), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1576320, 48}, -878512974, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), 878512985, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i3;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        List list = (List) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Function1 function1 = (Function1) objArr[3];
        int i4 = 4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-256718744);
        int i6 = iIntValue3 & 1;
        if (i6 != 0) {
            i = iIntValue2 | 6;
        } else if ((iIntValue2 & 6) == 0) {
            int i7 = onWarmupCompleted + 89;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                int i9 = onExtraCallback + 53;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i4 = 2;
            }
            i = i4 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 32 : 16;
        }
        int i11 = iIntValue3 & 4;
        if (i11 != 0) {
            i |= 384;
        } else if ((iIntValue2 & 384) == 0) {
            int i12 = onExtraCallback + 93;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue)) {
                int i13 = onWarmupCompleted + 27;
                onExtraCallback = i13 % 128;
                i2 = i13 % 2 == 0 ? 2873 : 256;
            } else {
                i2 = 128;
            }
            i |= i2;
        }
        if ((iIntValue2 & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 1171) != 1170, i & 1)) {
            if (i6 != 0) {
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                int i14 = onExtraCallback + 53;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
            }
            i3 = i11 == 0 ? iIntValue : 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 7;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-256718744, i, -1, "im.toss.feature.credit.ui.main.report.ScoreReportTab (CreditScoreReportScreen.kt:510)");
            }
            setThreadList.IAuthTabCallback(new onJavaCrashFilter("credit_score_report_tab"), (initMiniApp) null, (initSDK) null, (Function2) null, (Set) null, ForwardingCameraControl.onExtraCallback(2041437885, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda28(onextracallback2, i3, list, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i18 = onWarmupCompleted + 81;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
            }
            onextracallback = onextracallback2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
            i3 = iIntValue;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda29(onextracallback, list, i3, function1, iIntValue2, iIntValue3));
        }
        return null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        int i = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        RowScope rowScope = (RowScope) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue2 & 6) == 0) {
            int i3 = onExtraCallback + 19;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope);
                throw null;
            }
            iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            int i4 = onWarmupCompleted + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 51;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(924095820, iIntValue2, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:561)");
                    int i7 = 24 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(924095820, iIntValue2, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:561)");
                }
            }
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablename, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (str2 != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1001458132);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onMessageChannelReady(), (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)));
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = rowScope.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, onextracallbackwithresult.IAuthTabCallbackDefault());
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                    int i8 = onExtraCallback + 97;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1716932207);
                for (int iCoerceIn = RangesKt.coerceIn(iIntValue, new IntRange(1, 3)); i < iCoerceIn; iCoerceIn = iCoerceIn) {
                    int i10 = onExtraCallback + 25;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{str2, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1020}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                    i++;
                    int i12 = onExtraCallback + 111;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1000587466);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onWarmupCompleted + 67;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(String str, String str2, int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i2 & 6) == 0) {
            int i5 = onExtraCallback + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i7 = onWarmupCompleted + 55;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    int i9 = onWarmupCompleted + 47;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i11 = onExtraCallback + 27;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i13 = onExtraCallback + 17;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 45 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-825326877, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow.<anonymous> (CreditScoreReportScreen.kt:559)");
                }
                w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(924095820, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda12(str, str2, i), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 3) & 112) | 6);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(924095820, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda12(str, str2, i), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 3) & 112) | 6);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, im.toss.tds.compose.component.compound.listrow.v1.RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onWarmupCompleted + 103;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 59;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1509854893, i, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow.<anonymous> (CreditScoreReportScreen.kt:589)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1509854893, i, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow.<anonymous> (CreditScoreReportScreen.kt:589)");
            }
            getHumanReadableName gethumanreadablename = (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(728399322);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(728400282);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablename, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[PHI: r0
      0x0047: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r0
      0x003c: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003a, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-326928768);
            if ((i2 & 36) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-326928768);
            if ((i2 & 6) == 0) {
            }
        }
        if ((i2 & 48) == 0) {
            int i6 = onExtraCallback + 111;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i7 = onWarmupCompleted + 55;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-326928768, i3, -1, "im.toss.feature.credit.ui.main.report.ScoreStatusBoardInfoRow (CreditScoreReportScreen.kt:555)");
            }
            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-825326877, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda72(str, str3, i), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), addAttachUserData.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, getDid.Companion.IAuthTabCallback()), (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1509854893, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda73(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), getViewTypeCount.onExtraCallback.Companion.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1769478, 384, 126876);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onWarmupCompleted + 103;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda74(str, str2, str3, i, i2));
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(v1 v1Var, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$sheetState, access13800Var);
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$sheetState;
                this.label = 1;
                if (v1.IAuthTabCallback(v1Var, (u5b) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = onExtraCallbackWithResult + 39;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(findResAndMsg findresandmsg, v1 v1Var, CardUsageReportResponse cardUsageReportResponse, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        Object obj;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 33;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if ((i & 50) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
                    int i6 = onWarmupCompleted + 91;
                    onExtraCallback = i6 % 128;
                    i2 = i6 % 2 == 0 ? 3 : 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(areallitemsenabled, "");
            if ((i & 6) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1491607610, i3, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous> (CreditScoreReportScreen.kt:622)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || zOnNavigationEvent) {
                CreditScoreReportScreenKt$.ExternalSyntheticLambda34 externalSyntheticLambda34 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda34(findresandmsg, v1Var);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda34);
                int i7 = onWarmupCompleted + 119;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                obj = externalSyntheticLambda34;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = measureChildConstrained.onExtraCallback(onextracallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventAsInterface, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
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
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i9 = onWarmupCompleted + 53;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        int i10 = 0 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                areallitemsenabled.onWarmupCompleted(cardUsageReportResponse.onTransact(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 196608, 22);
                setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onNavigationEvent(), rowScopeInstance.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallback, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 6, (Object) null), onextracallbackwithresult.IAuthTabCallbackDefault()), (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, getAvailableLevel.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 12585990, 116);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i11 = onWarmupCompleted + 121;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = measureChildConstrained.onExtraCallback(onextracallback, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(onnavigationeventAsInterface2, onextracallbackwithresult3.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult22.onTransact());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                areallitemsenabled.onWarmupCompleted(cardUsageReportResponse.onTransact(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 196608, 22);
                setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.onNavigationEvent(), rowScopeInstance2.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallback, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), 6, (Object) null), onextracallbackwithresult3.IAuthTabCallbackDefault()), (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, getAvailableLevel.onWarmupCompleted.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 12585990, 116);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CardUsageReportResponse cardUsageReportResponse, long j, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        SubTitle subTitleAsBinder;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 33;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallback + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1488155385, i, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous> (CreditScoreReportScreen.kt:652)");
                }
                subTitleAsBinder = cardUsageReportResponse.asBinder();
                if (subTitleAsBinder == null) {
                    int i7 = onExtraCallback + 75;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    String strOnNavigationEvent = subTitleAsBinder.onNavigationEvent();
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = "";
                    }
                    String str = strOnNavigationEvent;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i9 = onExtraCallback + 79;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                subTitleAsBinder = cardUsageReportResponse.asBinder();
                if (subTitleAsBinder == null) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, PreviousUsage previousUsage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            previousUsage.onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnTransact = previousUsage.onTransact();
        if (strOnTransact == null) {
            int i3 = onWarmupCompleted + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            strOnTransact = "";
        }
        function1.invoke(strOnTransact);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 51;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{65101, 20193, 40751, 60486, 15512}, 45232 / (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{65101, 20193, 40751, 60486, 15512}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45232, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str) {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1886504L, false, (String) null, (Map) null, new CreditScoreReportScreenKt$.ExternalSyntheticLambda78(str), 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{65101, 20193, 40751, 60486, 15512}, View.MeasureSpec.getSize(0) + 45233, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, String str) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1886506L, false, (String) null, (Map) null, new CreditScoreReportScreenKt$.ExternalSyntheticLambda30(str), 14, (Object) null);
        Object[] objArr = new Object[1];
        a(new char[]{65098, 43731, 22357, 994, 44140, 22673, 1286, 45476, 23086, 1869, 46044, 23590, 2210, 46421, 24968, 2602, 46764, 25378, 3166, 47312, 25912, 4577, 47634, 26258, 4917, 49121, 26844, 5443, 49648, 27258, 5786, 49946, 28604, 6267, 50340, 29141, 6743, 50934, 29484, 8089, 51215, 29866, 8509, 51795, 30354, 9064, 53230, 30750, 9356, 53524, 32165, 9761, 54087, 32671, 10366, 54521, 33070, 11661, 54829, 33449, 12249, 55363, 34031, 12631, 56714, 34325, 12936, 57126, 35744, 13549, 57681, 36341, 13937, 58001, 36637, 15272}, 21695 - AndroidCharacter.getMirror('0'), objArr);
        function1.invoke(((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String strOnWarmupCompleted;
        Function1 function1 = (Function1) objArr[0];
        CardUsageReportResponse cardUsageReportResponse = (CardUsageReportResponse) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DetailsButton detailsButtonIAuthTabCallback = cardUsageReportResponse.IAuthTabCallback();
        if (detailsButtonIAuthTabCallback != null) {
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            strOnWarmupCompleted = detailsButtonIAuthTabCallback.onWarmupCompleted();
            if (i5 == 0) {
                int i6 = 0 / 0;
                if (strOnWarmupCompleted == null) {
                    strOnWarmupCompleted = "";
                }
            } else if (strOnWarmupCompleted == null) {
            }
        }
        function1.invoke(strOnWarmupCompleted);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 61;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CardUsageReportResponse cardUsageReportResponse, r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda_moq0nysrol1o0qmavnpwgoovto, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambda_moq0nysrol1o0qmavnpwgoovto) ? 4 : 2;
            int i3 = onExtraCallback + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onExtraCallback + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1522889659, i, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous> (CreditScoreReportScreen.kt:795)");
            }
            HelpInfo helpInfoOnExtraCallback = cardUsageReportResponse.onExtraCallback();
            if (helpInfoOnExtraCallback != null) {
                int i7 = onExtraCallback + 27;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                String strOnExtraCallbackWithResult = helpInfoOnExtraCallback.onExtraCallbackWithResult();
                String str = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
                r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(str, (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, (i << 15) & 458752, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 91;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        int i;
        DisclaimerV2Row disclaimerV2Row = (DisclaimerV2Row) objArr[0];
        areCachedAdResourcesMissing arecachedadresourcesmissing = (areCachedAdResourcesMissing) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onWarmupCompleted + 125;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
                i = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2;
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing)) {
            }
            iIntValue |= i;
        }
        int i5 = iIntValue;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i5 & 19) != 18, i5 & 1)) {
            int i6 = onWarmupCompleted + 23;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(547261681, i5, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:806)");
            }
            String strOnExtraCallbackWithResult = disclaimerV2Row.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult == null) {
                int i7 = onWarmupCompleted + 117;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
                strOnExtraCallbackWithResult = "";
            }
            arecachedadresourcesmissing.onWarmupCompleted(strOnExtraCallbackWithResult, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i5 & 14, 1022);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 57;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i9 != 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CardUsageReportResponse cardUsageReportResponse, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        int i5 = (i & 6) == 0 ? i | (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2) : i;
        boolean z = true;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i5 & 19) != 18, i5 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1073422810, i5, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous>.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:804)");
                int i6 = onWarmupCompleted + 121;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            HelpInfo helpInfoOnExtraCallback = cardUsageReportResponse.onExtraCallback();
            List<DisclaimerV2Row> listOnWarmupCompleted = helpInfoOnExtraCallback != null ? helpInfoOnExtraCallback.onWarmupCompleted() : null;
            if (listOnWarmupCompleted == null) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1987628017);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1987628018);
                for (DisclaimerV2Row disclaimerV2Row : listOnWarmupCompleted) {
                    if (disclaimerV2Row.IAuthTabCallback() > 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1131717357);
                        arecachedadresourcesmissing.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(547261681, z, new CreditScoreReportScreenKt$.ExternalSyntheticLambda0(disclaimerV2Row), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i5 << 21) & 29360128) | 1572864, 63);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        z = z;
                    } else {
                        boolean z2 = z;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1131851711);
                        String strOnExtraCallbackWithResult = disclaimerV2Row.onExtraCallbackWithResult();
                        if (strOnExtraCallbackWithResult == null) {
                            int i8 = onExtraCallback + 125;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                            str = str2;
                        } else {
                            str = strOnExtraCallbackWithResult;
                        }
                        int i9 = i5;
                        arecachedadresourcesmissing.onWarmupCompleted(str, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, i9 & 14, 1022);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        z = z2;
                        i5 = i9;
                        str2 = str2;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 105;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onExtraCallback + 87;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 5 / 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i14 = onExtraCallback + 121;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CardUsageReportResponse cardUsageReportResponse, roundUpToNearestHalfInt rounduptonearesthalfint, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rounduptonearesthalfint, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rounduptonearesthalfint)) {
                i3 = 4;
            } else {
                int i5 = onWarmupCompleted + 95;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = onWarmupCompleted + 7;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 109;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2029364413, i2, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:803)");
                    int i10 = 56 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2029364413, i2, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:803)");
                }
            }
            rounduptonearesthalfint.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(-1073422810, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda31(cardUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1572864 | ((i2 << 21) & 29360128), 63);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(CardUsageReportResponse cardUsageReportResponse, r8lambdauHPxsw2eXOvTbrZJ8u1Te7TrNw r8lambdauhpxsw2exovtbrzj8u1te7trnw, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
            if ((i & 25) != 7) {
                int i4 = onExtraCallback + 11;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(r8lambdauhpxsw2exovtbrzj8u1te7trnw, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1469477548, i, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous> (CreditScoreReportScreen.kt:800)");
            }
            getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0L, 0L, null, null, ForwardingCameraControl.onExtraCallback(-2029364413, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda26(cardUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196608, 30}, -1636332773);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 1;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ v1 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(v1 v1Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sheetState = v1Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$sheetState, access13800Var);
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                iAuthTabCallbackCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                v1 v1Var = this.$sheetState;
                this.label = 1;
                if (v1.onExtraCallback(v1Var, (x1) null, this, 1, (Object) null) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallback + 119;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    private static final Unit IAuthTabCallback(findResAndMsg findresandmsg, v1 v1Var) {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(v1Var, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(findResAndMsg findresandmsg, v1 v1Var, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) != 0) {
            i2 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            int i4 = onWarmupCompleted + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2 == 0 ? 2 : 4;
            i2 = i | i5;
        }
        if ((i2 & 19) != 18) {
            int i6 = onExtraCallback + 37;
            onWarmupCompleted = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1948026269, i2, -1, "im.toss.feature.credit.ui.main.report.CardUsageView.<anonymous> (CreditScoreReportScreen.kt:816)");
            }
            String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.app_1won_bottom_sheet_confirm_word, cameraCaptureResultEmptyCameraCaptureResult, 0);
            setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Fill;
            setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
            setCallToAction.onNavigationEvent onnavigationevent = setCallToAction.onNavigationEvent.Inline;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(findresandmsg);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v1Var);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnNavigationEvent)) {
                int i7 = onExtraCallback + 105;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CreditScoreReportScreenKt$.ExternalSyntheticLambda6 externalSyntheticLambda6 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda6(findresandmsg, v1Var);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda6);
                    obj2 = externalSyntheticLambda6;
                }
                u4Var.onNavigationEvent(strOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (Function0) null, (Function0) obj2, onextracallback, onwarmupcompleted, iAuthTabCallbackOnExtraCallbackWithResult, onnavigationevent, false, false, cameraCaptureResultEmptyCameraCaptureResult, 14376960, i2 & 14, 774);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0394 A[PHI: r3
      0x0394: PHI (r3v133 java.lang.String) = (r3v132 java.lang.String), (r3v134 java.lang.String) binds: [B:87:0x0391, B:84:0x038a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0397  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v94, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v95, types: [im.toss.feature.credit.ui.main.report.CreditScoreReportScreenKt$$ExternalSyntheticLambda18, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v96 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull CardUsageReportResponse cardUsageReportResponse, @NotNull Function1<? super String, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        findResAndMsg findresandmsg;
        setByteOrder setbyteorderOnNavigationEvent;
        long jAccess100;
        ?? r15;
        int i5;
        long j;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        float f;
        v1 v1Var;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        setByteOrder setbyteorderOnNavigationEvent2;
        long jAccess1002;
        String str;
        long jLongValue;
        long jLongValue2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str2;
        int i6;
        findResAndMsg findresandmsg2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zOnExtraCallback;
        Function0 function0OnMinimized;
        boolean z9;
        String strOnNavigationEvent;
        String strOnExtraCallback;
        String strIAuthTabCallback;
        String strOnExtraCallbackWithResult;
        int i7;
        int i8 = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(cardUsageReportResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1116124655);
        int i9 = (i & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cardUsageReportResponse) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i10 = onWarmupCompleted + 119;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i9 |= i7;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
            }
            i3 = i9;
            if ((i3 & 147) == 146) {
                int i13 = onExtraCallback + 125;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                z4 = z2;
            } else {
                boolean z10 = i12 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i15 = onWarmupCompleted + 93;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1116124655, i3, -1, "im.toss.feature.credit.ui.main.report.CardUsageView (CreditScoreReportScreen.kt:605)");
                }
                v1 v1VarOnExtraCallback = y1.onExtraCallback((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) null, (u5b) null, (Function2) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) null, (findResAndMsg) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1023);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                findResAndMsg findresandmsg3 = (findResAndMsg) objOnMinimized;
                SubTitle subTitleAsBinder = cardUsageReportResponse.asBinder();
                String strOnWarmupCompleted = subTitleAsBinder != null ? subTitleAsBinder.onWarmupCompleted() : null;
                if (strOnWarmupCompleted == null) {
                    int i17 = onExtraCallback + 15;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1167493263);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i4 = 6;
                    findresandmsg = findresandmsg3;
                    setbyteorderOnNavigationEvent = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1167493264);
                    i4 = 6;
                    findresandmsg = findresandmsg3;
                    long jIAuthTabCallback = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, strOnWarmupCompleted, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jIAuthTabCallback);
                }
                if (setbyteorderOnNavigationEvent == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146044408);
                    jAccess100 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i4).ICustomTabsService();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146038921);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    jAccess100 = setbyteorderOnNavigationEvent.access100();
                }
                long j2 = jAccess100;
                if (z10) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146046323);
                    i5 = i3;
                    j = j2;
                    r15 = 1;
                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult = y1ExternalSyntheticLambda9.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0, 700L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    r15 = 1;
                    i5 = i3;
                    j = j2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146047577);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult = QuirksExternalSyntheticBackport0.Companion;
                }
                w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1491607610, (boolean) r15, new CreditScoreReportScreenKt$.ExternalSyntheticLambda16(findresandmsg, v1VarOnExtraCallback, cardUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1488155385, (boolean) r15, new CreditScoreReportScreenKt$.ExternalSyntheticLambda17(cardUsageReportResponse, j), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), wa.onWarmupCompleted.Center, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 805309446, 6, 2548);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, (int) r15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f));
                float fOnWarmupCompleted = ((CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse})) != null ? r3.onWarmupCompleted() : 0.0f;
                populateMuteImage.onExtraCallbackWithResult onextracallbackwithresult = populateMuteImage.onExtraCallbackWithResult.Bold;
                CurrentUsageInfo currentUsageInfo = (CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse});
                String strOnNavigationEvent2 = currentUsageInfo != null ? currentUsageInfo.onNavigationEvent() : null;
                if (strOnNavigationEvent2 == null) {
                    int i19 = onExtraCallback + 81;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1169638587);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    v1Var = v1VarOnExtraCallback;
                    f = 0.0f;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    setbyteorderOnNavigationEvent2 = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1169638588);
                    f = 0.0f;
                    v1Var = v1VarOnExtraCallback;
                    quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                    long jIAuthTabCallback2 = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, strOnNavigationEvent2, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jIAuthTabCallback2);
                }
                if (setbyteorderOnNavigationEvent2 == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146114232);
                    jAccess1002 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1146107536);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    jAccess1002 = setbyteorderOnNavigationEvent2.access100();
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                pauseVideo.IAuthTabCallback(100.0f, fOnWarmupCompleted, quirksExternalSyntheticBackport0OnNavigationEvent, onextracallbackwithresult, jAccess1002, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3462, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, f, (int) r15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), f, 2, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface = focusMeteringControlExternalSyntheticLambda12.asInterface();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventAsInterface, onextracallbackwithresult2.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                CurrentUsageInfo currentUsageInfo2 = (CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse});
                if (currentUsageInfo2 != null) {
                    int i21 = onExtraCallback + 105;
                    onWarmupCompleted = i21 % 128;
                    if (i21 % 2 != 0) {
                        strOnExtraCallbackWithResult = currentUsageInfo2.onExtraCallbackWithResult();
                        int i22 = 38 / 0;
                        str = strOnExtraCallbackWithResult == null ? "" : strOnExtraCallbackWithResult;
                    } else {
                        strOnExtraCallbackWithResult = currentUsageInfo2.onExtraCallbackWithResult();
                        if (strOnExtraCallbackWithResult == null) {
                        }
                    }
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameOnWarmupCompleted = appLovinPostbackService.onWarmupCompleted();
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1478780628);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1478781588);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, gethumanreadablenameOnWarmupCompleted, Long.valueOf(jLongValue), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 131058}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    findResAndMsg findresandmsg4 = findresandmsg;
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    CurrentUsageInfo currentUsageInfo3 = (CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse});
                    String str4 = (currentUsageInfo3 == null || (strIAuthTabCallback = currentUsageInfo3.IAuthTabCallback()) == null) ? "" : strIAuthTabCallback;
                    getHumanReadableName gethumanreadablenameOnWarmupCompleted2 = appLovinPostbackService.onWarmupCompleted();
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1478789812);
                        jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1478790772);
                        jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str4, null, gethumanreadablenameOnWarmupCompleted2, Long.valueOf(jLongValue2), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onExtraCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0, 130802}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult2.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                    CurrentUsageInfo currentUsageInfo4 = (CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse});
                    if (currentUsageInfo4 != null) {
                        int i23 = onWarmupCompleted + 31;
                        onExtraCallback = i23 % 128;
                        if (i23 % 2 == 0) {
                            currentUsageInfo4.IAuthTabCallbackStub();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        String strIAuthTabCallbackStub = currentUsageInfo4.IAuthTabCallbackStub();
                        String str5 = strIAuthTabCallbackStub == null ? "" : strIAuthTabCallbackStub;
                        getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                        long jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str5, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jICustomTabsService), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        boolean z11 = false;
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport0, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        CurrentUsageInfo currentUsageInfo5 = (CurrentUsageInfo) CardUsageReportResponse.onExtraCallbackWithResult(1886870498, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1886870498, new Object[]{cardUsageReportResponse});
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{(currentUsageInfo5 == null || (strOnExtraCallback = currentUsageInfo5.onExtraCallback()) == null) ? "" : strOnExtraCallback, null, appLovinPostbackService.IAuthTabCallback_Parcel(), Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isrepeatingenabled.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                        if (!StringsKt.isBlank(cardUsageReportResponse.asInterface())) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1171228919);
                            IAuthTabCallback(j, cardUsageReportResponse.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1171315409);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0);
                        Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i24 = onExtraCallback + 5;
                            onWarmupCompleted = i24 % 128;
                            if (i24 % 2 != 0) {
                                getAwbState.onExtraCallback();
                                int i25 = 87 / 0;
                            } else {
                                getAwbState.onExtraCallback();
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback4);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult3.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        List listIAuthTabCallbackDefault = cardUsageReportResponse.IAuthTabCallbackDefault();
                        if (listIAuthTabCallbackDefault == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1918252997);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            str2 = "";
                            i6 = i5;
                            findresandmsg2 = findresandmsg4;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1918252998);
                            int i26 = 0;
                            for (Object obj2 : listIAuthTabCallbackDefault) {
                                int i27 = onWarmupCompleted + 65;
                                onExtraCallback = i27 % 128;
                                int i28 = i27 % 2;
                                if (i26 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                PreviousUsage previousUsage = (PreviousUsage) obj2;
                                String strOnExtraCallback2 = previousUsage.onExtraCallback();
                                String strAsBinder = previousUsage.asBinder();
                                String strOnExtraCallbackWithResult2 = previousUsage.onExtraCallbackWithResult();
                                Badge badgeOnWarmupCompleted = previousUsage.onWarmupCompleted();
                                DetailsButton detailsButtonIAuthTabCallback = previousUsage.IAuthTabCallback();
                                boolean zOnNavigationEvent = previousUsage.onNavigationEvent();
                                if (i26 == 0) {
                                    int i29 = onExtraCallback + 29;
                                    onWarmupCompleted = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        z5 = true;
                                    }
                                    if (previousUsage.onTransact() == null) {
                                        z6 = true;
                                        if (!StringsKt.isBlank(r4)) {
                                            z7 = true;
                                        }
                                        z8 = (i5 & 112) == 32 ? z6 : z11;
                                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(previousUsage);
                                        function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if ((z8 | zOnExtraCallback) || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            function0OnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda18(function1, previousUsage);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        v1Var = v1Var;
                                        onExtraCallback(null, strOnExtraCallback2, null, strAsBinder, strOnExtraCallbackWithResult2, z5, false, false, badgeOnWarmupCompleted, detailsButtonIAuthTabCallback, zOnNavigationEvent, z7, function0OnMinimized, function1, cameraCaptureResultEmptyCameraCaptureResult3, 1572864, (i5 << 6) & 7168, 133);
                                        i26++;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3;
                                        str3 = str3;
                                        z11 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    z7 = z11;
                                    if ((i5 & 112) == 32) {
                                    }
                                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(previousUsage);
                                    function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (z8 | zOnExtraCallback) {
                                        function0OnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda18(function1, previousUsage);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult32 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    v1Var = v1Var;
                                    onExtraCallback(null, strOnExtraCallback2, null, strAsBinder, strOnExtraCallbackWithResult2, z5, false, false, badgeOnWarmupCompleted, detailsButtonIAuthTabCallback, zOnNavigationEvent, z7, function0OnMinimized, function1, cameraCaptureResultEmptyCameraCaptureResult32, 1572864, (i5 << 6) & 7168, 133);
                                    i26++;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult32;
                                    str3 = str3;
                                    z11 = false;
                                }
                                z5 = z11;
                                if (previousUsage.onTransact() == null) {
                                }
                                z7 = z11;
                                if ((i5 & 112) == 32) {
                                }
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(previousUsage);
                                function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (z8 | zOnExtraCallback) {
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult322 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                v1Var = v1Var;
                                onExtraCallback(null, strOnExtraCallback2, null, strAsBinder, strOnExtraCallbackWithResult2, z5, false, false, badgeOnWarmupCompleted, detailsButtonIAuthTabCallback, zOnNavigationEvent, z7, function0OnMinimized, function1, cameraCaptureResultEmptyCameraCaptureResult322, 1572864, (i5 << 6) & 7168, 133);
                                i26++;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult322;
                                str3 = str3;
                                z11 = false;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            str2 = str3;
                            i6 = i5;
                            findresandmsg2 = findresandmsg4;
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            Unit unit = Unit.INSTANCE;
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
                        String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_card_banner_text2, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(strOnExtraCallback3);
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                        if (!zOnNavigationEvent2) {
                            Object obj3 = objOnMinimized2;
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                CreditScoreReportScreenKt$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda19(strOnExtraCallback3);
                                cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(externalSyntheticLambda19);
                                obj3 = externalSyntheticLambda19;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = ImageLoaderBuilderExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback, 0.0f, (Function0) obj3, cameraCaptureResultEmptyCameraCaptureResult4, 6, 1);
                            setByteOrder setbyteorderOnNavigationEvent3 = setByteOrder.onNavigationEvent(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue());
                            String strOnExtraCallback4 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.feature.credit.ui.main.R.string.credit_score_report_card_banner_text1, cameraCaptureResultEmptyCameraCaptureResult4, 0);
                            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(strOnExtraCallback3);
                            int i30 = i6 & 112;
                            boolean z12 = i30 == 32;
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                            if (!(zOnNavigationEvent3 | z12)) {
                                Object obj4 = objOnMinimized3;
                                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    CreditScoreReportScreenKt$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda20(function1, strOnExtraCallback3);
                                    cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(externalSyntheticLambda20);
                                    obj4 = externalSyntheticLambda20;
                                }
                                String str6 = str2;
                                Object[] objArr = new Object[1];
                                a(new char[]{65105, 64460, 62799, 61130, 59470, 58758, 57104, 55441, 53826, 53188, 51538, 49862, 48220, 47575, 45849, 44226, 42566, 41947, 40280, 38532, 36932, 36289, 34560, 32967, 31298, 30671, 29005, 27345, 25610, 25044, 23369, 21697, 20022, 19372, 17763, 16053, 14452, 13823, 12144, 10480, 8764, 8160, 6527, 4839, 3174, 2489, 867, 64766, 63072, 62438, 60710, 59111, 57442, 56802, 55136, 53408, 51825, 51182, 49508}, 1409 - TextUtils.getCapsMode(str6, 0, 0), objArr);
                                onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, ((String) objArr[0]).intern(), setbyteorderOnNavigationEvent3, strOnExtraCallback4, strOnExtraCallback3, false, true, true, null, null, false, false, (Function0) obj4, function1, cameraCaptureResultEmptyCameraCaptureResult4, 14352432, (i6 << 6) & 7168, 3840);
                                cameraCaptureResultEmptyCameraCaptureResult4.asInterface();
                                MyDataLinkInfo myDataLinkInfo = (MyDataLinkInfo) CardUsageReportResponse.onExtraCallbackWithResult(1462009089, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), -1462009088, new Object[]{cardUsageReportResponse});
                                if (myDataLinkInfo == null) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1024922099);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1024922100);
                                    IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (List<String>) myDataLinkInfo.IAuthTabCallbackStub(), myDataLinkInfo.onWarmupCompleted(), myDataLinkInfo.IAuthTabCallback(), myDataLinkInfo.onExtraCallbackWithResult(), function1, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i6 << 12) & 458752, 1);
                                    Unit unit2 = Unit.INSTANCE;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                if (cardUsageReportResponse.IAuthTabCallback() != null) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1173384194);
                                    z9 = true;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 5, (Object) null);
                                    DetailsButton detailsButtonIAuthTabCallback2 = cardUsageReportResponse.IAuthTabCallback();
                                    String str7 = (detailsButtonIAuthTabCallback2 == null || (strOnNavigationEvent = detailsButtonIAuthTabCallback2.onNavigationEvent()) == null) ? str6 : strOnNavigationEvent;
                                    boolean z13 = i30 == 32;
                                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(cardUsageReportResponse);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!(z13 | zOnExtraCallback2)) {
                                        Object obj5 = objOnMinimized4;
                                        if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            CreditScoreReportScreenKt$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda21(function1, cardUsageReportResponse);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda21);
                                            obj5 = externalSyntheticLambda21;
                                        }
                                        onWarmupCompleted(607551902, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, str7, (Function0) obj5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    }
                                } else {
                                    z9 = true;
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1173675377);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                                if (v1Var.IAuthTabCallback_Parcel()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1173755450);
                                    v1 v1Var2 = v1Var;
                                    u6a.IAuthTabCallback(v1Var2, (setContentInsetsRelative) null, 0L, 0L, (Function2) null, ForwardingCameraControl.onExtraCallback(-1522889659, z9, new CreditScoreReportScreenKt$.ExternalSyntheticLambda22(cardUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(1948026269, z9, new CreditScoreReportScreenKt$.ExternalSyntheticLambda23(findresandmsg2, v1Var2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getBacktraceNote) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, (String) null, (Function1) null, ForwardingCameraControl.onExtraCallback(-1469477548, z9, new CreditScoreReportScreenKt$.ExternalSyntheticLambda24(cardUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1769472, 3072, 8094);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1175253649);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                }
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                z4 = z10;
                            }
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda25(cardUsageReportResponse, function1, z4, i, i2));
                return;
            }
            return;
        }
        i9 |= 384;
        z2 = z;
        i3 = i9;
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanUsageReportResponse loanUsageReportResponse, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(areallitemsenabled, "");
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 121;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(areallitemsenabled)) {
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onWarmupCompleted + 33;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 97;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(885455354, i2, -1, "im.toss.feature.credit.ui.main.report.LoanUsageView.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:856)");
                    int i10 = 94 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(885455354, i2, -1, "im.toss.feature.credit.ui.main.report.LoanUsageView.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:856)");
                }
            }
            areallitemsenabled.onWarmupCompleted(loanUsageReportResponse.IAuthTabCallbackStub(), (QuirksExternalSyntheticBackport0) null, (getHumanReadableName) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 196608, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onExtraCallback + 7;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(LoanUsageReportResponse loanUsageReportResponse, long j, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(304176263, i, -1, "im.toss.feature.credit.ui.main.report.LoanUsageView.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:863)");
            }
            SubTitle subTitleAsBinder = loanUsageReportResponse.asBinder();
            if (subTitleAsBinder != null) {
                int i3 = onExtraCallback + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                String strOnNavigationEvent = subTitleAsBinder.onNavigationEvent();
                if (strOnNavigationEvent == null) {
                    strOnNavigationEvent = "";
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnNavigationEvent, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i5 = onExtraCallback + 1;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 83;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, LoanUsageReportResponse loanUsageReportResponse, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 25;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 29;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 117;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1198401263, i, -1, "im.toss.feature.credit.ui.main.report.LoanUsageView.<anonymous> (CreditScoreReportScreen.kt:852)");
                int i12 = onExtraCallback + 79;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
            }
            w2.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(885455354, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda32(loanUsageReportResponse), cameraCaptureResultEmptyCameraCaptureResult, 54), quirksExternalSyntheticBackport0, (wa.onTransact) null, wa.IAuthTabCallback.Companion.onExtraCallback(), 0.0f, (wa.onNavigationEvent) null, (getBacktraceNote) null, (wa.IAuthTabCallbackStub) null, (wa.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(304176263, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda33(loanUsageReportResponse, j), cameraCaptureResultEmptyCameraCaptureResult, 54), wa.onWarmupCompleted.Center, (wa.onExtraCallbackWithResult) null, cameraCaptureResultEmptyCameraCaptureResult, 805309446, 6, 2548);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onExtraCallback + 111;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i16 = onWarmupCompleted + 9;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, LoanAccount loanAccount) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = loanAccount.asInterface();
        if (strAsInterface == null) {
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            strAsInterface = "";
        }
        function1.invoke(strAsInterface);
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 9;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function1 function1, LoanUsageReportResponse loanUsageReportResponse) {
        String strOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DetailsButton detailsButtonOnWarmupCompleted = loanUsageReportResponse.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 54 / 0;
            if (detailsButtonOnWarmupCompleted != null) {
                strOnWarmupCompleted = detailsButtonOnWarmupCompleted.onWarmupCompleted();
                if (strOnWarmupCompleted == null) {
                    int i5 = onExtraCallback + 125;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 3;
                    }
                    strOnWarmupCompleted = "";
                }
            }
        } else if (detailsButtonOnWarmupCompleted != null) {
        }
        function1.invoke(strOnWarmupCompleted);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [im.toss.feature.credit.ui.main.report.CreditScoreReportScreenKt$$ExternalSyntheticLambda9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull LoanUsageReportResponse loanUsageReportResponse, @NotNull Function1<? super String, Unit> function1, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        boolean z2;
        int i3;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4;
        setByteOrder setbyteorderOnNavigationEvent;
        long jAccess100;
        long j;
        boolean z5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        String str;
        int i6;
        int i7;
        ?? r8;
        boolean z6;
        boolean zOnExtraCallback;
        Function0 function0OnMinimized;
        String strOnNavigationEvent;
        int i8 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(loanUsageReportResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1456649681);
        int i9 = (i & 6) == 0 ? (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanUsageReportResponse) ? 4 : 2) | i : i;
        Object obj = null;
        if ((i & 48) == 0) {
            int i10 = onWarmupCompleted + 49;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                obj.hashCode();
                throw null;
            }
            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                int i12 = onWarmupCompleted + 79;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                z2 = z;
                i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 256 : 128;
            }
            i3 = i9;
            if ((i3 & 147) == 146) {
                int i14 = onExtraCallback + 9;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                z4 = z2;
            } else {
                boolean z7 = i11 != 0 ? false : z2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1456649681, i3, -1, "im.toss.feature.credit.ui.main.report.LoanUsageView (CreditScoreReportScreen.kt:840)");
                }
                SubTitle subTitleAsBinder = loanUsageReportResponse.asBinder();
                String strOnWarmupCompleted = subTitleAsBinder != null ? subTitleAsBinder.onWarmupCompleted() : null;
                if (strOnWarmupCompleted == null) {
                    int i16 = onWarmupCompleted + 81;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1298730545);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1298730545);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i4 = 0;
                    setbyteorderOnNavigationEvent = null;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1298730544);
                    i4 = 0;
                    long jIAuthTabCallback = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, strOnWarmupCompleted, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jIAuthTabCallback);
                }
                if (setbyteorderOnNavigationEvent == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-318984520);
                    jAccess100 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-318990007);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    jAccess100 = setbyteorderOnNavigationEvent.access100();
                }
                long j2 = jAccess100;
                if (z7) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-318982637);
                    j = j2;
                    z5 = true;
                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult = y1ExternalSyntheticLambda9.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, 0, 700L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    j = j2;
                    z5 = true;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-318981383);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    quirksExternalSyntheticBackport0OnExtraCallbackWithResult = QuirksExternalSyntheticBackport0.Companion;
                }
                accessisMonitoringp accessismonitoringp = (accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[i4], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1913699679, -1913699676, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                SubTitle subTitleAsBinder2 = loanUsageReportResponse.asBinder();
                long j3 = j;
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringp.onExtraCallback(new MonitorCrashHeaderParams(clearFaultAdjacentMetadata.onExtraCallback(String.valueOf(subTitleAsBinder2 != null ? subTitleAsBinder2.onNavigationEvent() : null)), (boolean) i4)), ForwardingCameraControl.onExtraCallback(-1198401263, z5, new CreditScoreReportScreenKt$.ExternalSyntheticLambda8(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, loanUsageReportResponse, j3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                if (StringsKt.isBlank(loanUsageReportResponse.asInterface())) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1297476687);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1297563177);
                    IAuthTabCallback(j3, loanUsageReportResponse.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) i4);
                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((int) i4)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), (boolean) i4);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) i4));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i17 = onExtraCallback + 87;
                    onWarmupCompleted = i17 % 128;
                    int i18 = i17 % 2;
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
                int i19 = 0;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
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
                List list = (List) LoanUsageReportResponse.onNavigationEvent(1464189192, matches.onExtraCallback(), matches.onExtraCallback(), -1464189191, new Object[]{loanUsageReportResponse}, matches.onExtraCallback(), matches.onExtraCallback());
                if (list == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-547868325);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    i5 = 0;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    str = "";
                    i6 = i3;
                    i7 = 6;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-547868324);
                    int i20 = 0;
                    for (Object obj2 : list) {
                        if (i20 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        LoanAccount loanAccount = (LoanAccount) obj2;
                        String strOnWarmupCompleted2 = loanAccount.onWarmupCompleted();
                        String strIAuthTabCallbackDefault = loanAccount.IAuthTabCallbackDefault();
                        String strOnNavigationEvent2 = loanAccount.onNavigationEvent();
                        Badge badgeOnExtraCallback = loanAccount.onExtraCallback();
                        DetailsButton detailsButtonOnExtraCallbackWithResult = loanAccount.onExtraCallbackWithResult();
                        boolean zIAuthTabCallback = loanAccount.IAuthTabCallback();
                        ?? r7 = i20 == 0 ? 1 : i19;
                        List list2 = (List) LoanUsageReportResponse.onNavigationEvent(1464189192, matches.onExtraCallback(), matches.onExtraCallback(), -1464189191, new Object[]{loanUsageReportResponse}, matches.onExtraCallback(), matches.onExtraCallback());
                        if (list2 != null) {
                            int i21 = onWarmupCompleted + 65;
                            onExtraCallback = i21 % 128;
                            int i22 = i21 % 2;
                            r8 = i20 == list2.size() - 1 ? 1 : i19;
                        }
                        String strAsInterface = loanAccount.asInterface();
                        if (strAsInterface != null) {
                            int i23 = onWarmupCompleted + 117;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            boolean z8 = StringsKt.isBlank(strAsInterface) ^ true;
                            if ((i3 & 112) != 32) {
                                int i25 = onWarmupCompleted + 107;
                                onExtraCallback = i25 % 128;
                                z6 = i25 % 2 != 0;
                            }
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanAccount);
                            function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnExtraCallback | z6) || function0OnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                function0OnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda9(function1, loanAccount);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                            }
                            int i26 = i3;
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            onExtraCallback(null, strOnWarmupCompleted2, null, strIAuthTabCallbackDefault, strOnNavigationEvent2, r7, r8, false, badgeOnExtraCallback, detailsButtonOnExtraCallbackWithResult, zIAuthTabCallback, z8, function0OnMinimized, function1, cameraCaptureResultEmptyCameraCaptureResult4, 0, (i26 << 6) & 7168, 133);
                            i20++;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4;
                            i19 = 0;
                            i3 = i26;
                            str2 = str2;
                        }
                        if ((i3 & 112) != 32) {
                        }
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(loanAccount);
                        function0OnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | z6)) {
                            function0OnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda9(function1, loanAccount);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((Object) function0OnMinimized);
                        }
                        int i262 = i3;
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult42 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        onExtraCallback(null, strOnWarmupCompleted2, null, strIAuthTabCallbackDefault, strOnNavigationEvent2, r7, r8, false, badgeOnExtraCallback, detailsButtonOnExtraCallbackWithResult, zIAuthTabCallback, z8, function0OnMinimized, function1, cameraCaptureResultEmptyCameraCaptureResult42, 0, (i262 << 6) & 7168, 133);
                        i20++;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult42;
                        i19 = 0;
                        i3 = i262;
                        str2 = str2;
                    }
                    i5 = i19;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    str = str2;
                    i6 = i3;
                    i7 = 6;
                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    Unit unit = Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                MyDataLinkInfo myDataLinkInfo = (MyDataLinkInfo) LoanUsageReportResponse.onNavigationEvent(-341226689, matches.onExtraCallback(), matches.onExtraCallback(), 341226689, new Object[]{loanUsageReportResponse}, matches.onExtraCallback(), matches.onExtraCallback());
                if (myDataLinkInfo == null) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1442189828);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1442189827);
                    onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i5)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
                    IAuthTabCallback((QuirksExternalSyntheticBackport0) null, (List<String>) myDataLinkInfo.IAuthTabCallbackStub(), myDataLinkInfo.onWarmupCompleted(), myDataLinkInfo.IAuthTabCallback(), myDataLinkInfo.onExtraCallbackWithResult(), function1, cameraCaptureResultEmptyCameraCaptureResult2, (i6 << 12) & 458752, 1);
                    Unit unit2 = Unit.INSTANCE;
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (loanUsageReportResponse.onWarmupCompleted() != null) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1296377086);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 5, (Object) null);
                    DetailsButton detailsButtonOnWarmupCompleted = loanUsageReportResponse.onWarmupCompleted();
                    if (detailsButtonOnWarmupCompleted != null && (strOnNavigationEvent = detailsButtonOnWarmupCompleted.onNavigationEvent()) != null) {
                        str = strOnNavigationEvent;
                    }
                    int i27 = (i6 & 112) == 32 ? 1 : i5;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(loanUsageReportResponse);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (((zOnExtraCallback2 ? 1 : 0) | i27) == 0) {
                        int i28 = onWarmupCompleted + 93;
                        onExtraCallback = i28 % 128;
                        if (i28 % 2 == 0) {
                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new CreditScoreReportScreenKt$.ExternalSyntheticLambda10(function1, loanUsageReportResponse);
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                        }
                        onWarmupCompleted(607551902, new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, str, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i7), Integer.valueOf(i5)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1296085903);
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i29 = onExtraCallback + 69;
                    onWarmupCompleted = i29 % 128;
                    int i30 = i29 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                z4 = z7;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda11(loanUsageReportResponse, function1, z4, i, i2));
                return;
            }
            return;
        }
        i9 |= 384;
        z2 = z;
        i3 = i9;
        if ((i3 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r1
      0x003e: PHI (r1v48 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v49 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1
      0x0032: PHI (r1v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r1v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r1v49 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(long j, @NotNull String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        long jOnRelationshipValidationResult;
        long jOnUnminimized;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-708705525);
            if ((i & 40) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-708705525);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i5 = onExtraCallback + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str);
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i6 = onWarmupCompleted + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-708705525, i2, -1, "im.toss.feature.credit.ui.main.report.TipRow (CreditScoreReportScreen.kt:925)");
                int i8 = onExtraCallback + 55;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(CameraDeviceCompatStateCallbackExecutorWrapperExternalSyntheticLambda3.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda1.Min), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                int i10 = onWarmupCompleted + 43;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                    int i11 = 25 / 0;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), 0.0f, 1, (Object) null);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult2, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1164105906);
                jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1164104946);
                jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onRelationshipValidationResult();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, jOnRelationshipValidationResult, (toMetersPerSecond) null, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            hasProvider.IAuthTabCallback iAuthTabCallback = new hasProvider.IAuthTabCallback(0, 1, (DefaultConstructorMarker) null);
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
            int iOnNavigationEvent = iAuthTabCallback.onNavigationEvent(new SurfaceProcessorNode(j, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (requestClose) null, (hasMoreElements) null, 65530, (DefaultConstructorMarker) null));
            try {
                iAuthTabCallback.IAuthTabCallback("Tip ");
                Unit unit = Unit.INSTANCE;
                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                iAuthTabCallback.IAuthTabCallback(str);
                hasProvider hasproviderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel();
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult3, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1164091410);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1164090450);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).onUnminimized();
                }
                long j2 = jOnUnminimized;
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasproviderOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnExtraCallback, gethumanreadablenameIAuthTabCallback_Parcel, j2, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, isrepeatingenabled.onTransact(), (Function1) null, cameraCaptureResultEmptyCameraCaptureResult3, 48, 1572864, 196592);
                cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onWarmupCompleted + 113;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } catch (Throwable th) {
                iAuthTabCallback.onNavigationEvent(iOnNavigationEvent);
                throw th;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda62(j, str, i));
        }
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        onWarmupCompleted(getsupportedhighspeedresolutions, (int) futures3.asBinder());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, setByteOrder setbyteorder, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jOnTransact;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 37;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 79;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 89;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(702437072, i, -1, "im.toss.feature.credit.ui.main.report.UsageHistoryRow.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:1007)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 11, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f)), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
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
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
            if (setbyteorder != null) {
                jOnTransact = setbyteorder.access100();
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i10 = onWarmupCompleted + 5;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 5 / 2;
                }
            }
            AppLovinNativeAdImplc.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0OnWarmupCompleted2, jOnTransact, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 48, 504);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onWarmupCompleted + 121;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        long jOnUnminimized;
        long jLongValue;
        boolean z = false;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        w5a w5aVar = (w5a) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 2 : 4;
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = onWarmupCompleted;
            int i7 = i6 + 63;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 9;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i11 = onWarmupCompleted + 65;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(666433061, iIntValue, -1, "im.toss.feature.credit.ui.main.report.UsageHistoryRow.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:1025)");
            }
            if (zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1926446995);
                w5aVar.IAuthTabCallback(str, str2, 0L, 0L, (GraphicDeviceInfo) null, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 24) & 234881024) | 12582912, 92);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1926136189);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492059362);
                if (zBooleanValue2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492060268);
                    jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                } else {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        int i12 = onWarmupCompleted + 111;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492062060);
                            jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 16)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492062060);
                            jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492063020);
                        jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                    }
                }
                long j = jOnUnminimized;
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                getHumanReadableName gethumanreadablename = new getHumanReadableName(j, 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null);
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492070330);
                if (zBooleanValue2) {
                    int i13 = onExtraCallback + 105;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492070709);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492072012);
                        jLongValue = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492072972);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                        int i15 = onExtraCallback + 57;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda03 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (true ^ ((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda03, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492075724);
                        jLongValue = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(492074764);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                w5aVar.IAuthTabCallback(str, str2, gethumanreadablename, new getHumanReadableName(jLongValue, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 12) & 57344, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = onWarmupCompleted + 53;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, DetailsButton detailsButton) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(detailsButton.onWarmupCompleted());
            unit = Unit.INSTANCE;
            int i3 = 73 / 0;
        } else {
            function1.invoke(detailsButton.onWarmupCompleted());
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(Badge badge, DetailsButton detailsButton, Function1 function1, im.toss.tds.compose.component.compound.listrow.v1.RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        Object next;
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 72) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    i2 = 4;
                } else {
                    int i6 = onExtraCallback + 27;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 5;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(960660628, i3, -1, "im.toss.feature.credit.ui.main.report.UsageHistoryRow.<anonymous>.<anonymous> (CreditScoreReportScreen.kt:1048)");
                int i10 = onWarmupCompleted + 37;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
            if (badge != null && !StringsKt.isBlank(badge.onWarmupCompleted())) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1673751638);
                Iterator it = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (StringsKt.equals(((AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) next).name(), badge.onNavigationEvent(), true)) {
                        break;
                    }
                }
                AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = (AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult) next;
                String strOnWarmupCompleted = badge.onWarmupCompleted();
                AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent = AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent.Small;
                AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted = AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted.Weak;
                if (onextracallbackwithresult2 == null) {
                    int i12 = onExtraCallback + 83;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    onextracallbackwithresult = AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult.Blue;
                } else {
                    onextracallbackwithresult = onextracallbackwithresult2;
                }
                rightPreset.IAuthTabCallback(strOnWarmupCompleted, (QuirksExternalSyntheticBackport0) null, onnavigationevent, onextracallbackwithresult, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 15) & 458752) | 24960, 2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (detailsButton != null) {
                int i14 = onExtraCallback + 3;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 5 / 0;
                    if (!StringsKt.isBlank(detailsButton.onNavigationEvent())) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1674211771);
                        String strOnNavigationEvent = detailsButton.onNavigationEvent();
                        setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                        setCallToAction.onWarmupCompleted onwarmupcompleted2 = setCallToAction.onWarmupCompleted.Dark;
                        setCallToAction.onExtraCallback onextracallback = setCallToAction.onExtraCallback.Weak;
                        setCallToAction.onNavigationEvent onnavigationevent2 = setCallToAction.onNavigationEvent.Inline;
                        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(detailsButton);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(zOnNavigationEvent | zOnExtraCallback)) {
                            Object obj = objOnMinimized;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                CreditScoreReportScreenKt$.ExternalSyntheticLambda61 externalSyntheticLambda61 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda61(function1, detailsButton);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda61);
                                obj = externalSyntheticLambda61;
                            }
                            setAdvertiser.onExtraCallbackWithResult(strOnNavigationEvent, (QuirksExternalSyntheticBackport0) null, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted2, onextracallback, onnavigationevent2, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj, false, false, cameraCaptureResultEmptyCameraCaptureResult, 224640, 0, 1730);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1674660558);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                } else if (!StringsKt.isBlank(detailsButton.onNavigationEvent())) {
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i16 = onWarmupCompleted + 23;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @Nullable setByteOrder setbyteorder, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, boolean z3, @Nullable Badge badge, @Nullable DetailsButton detailsButton, boolean z4, boolean z5, @NotNull Function0<Unit> function0, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setByteOrder setbyteorder2;
        boolean z7;
        Badge badge2;
        DetailsButton detailsButton2;
        boolean z8;
        boolean z9;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function02;
        int i11;
        int i12;
        int i13 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-530000530);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            int i15 = onWarmupCompleted + 19;
            onExtraCallback = i15 % 128;
            int i16 = i15 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        int i17 = i4;
        int i18 = i3 & 4;
        int i19 = 256;
        if (i18 != 0) {
            i17 |= 384;
        } else {
            if ((i & 384) == 0) {
                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setbyteorder) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                int i20 = onExtraCallback + 93;
                onWarmupCompleted = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 59 / 0;
                    i12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                }
                i17 |= i12;
            }
            if ((i & 24576) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                    int i22 = onWarmupCompleted + 5;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i17 |= i11;
            }
            if ((196608 & i) == 0) {
                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i17 |= 12582912;
            } else {
                if ((12582912 & i) == 0) {
                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 8388608 : 4194304;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i17 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(badge) ? 67108864 : 33554432;
                    }
                    i7 = i3 & 512;
                    if (i7 == 0) {
                        i17 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        int i24 = onWarmupCompleted + 69;
                        onExtraCallback = i24 % 128;
                        if (i24 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(detailsButton);
                            throw null;
                        }
                        i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(detailsButton) ? 536870912 : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ^ true ? 2 : 4);
                    } else {
                        i9 = i2;
                    }
                    i10 = i3 & 2048;
                    if (i10 != 0) {
                        if ((i2 & 48) == 0) {
                            int i25 = onExtraCallback + 85;
                            onWarmupCompleted = i25 % 128;
                            int i26 = i25 % 2;
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 32 : 16;
                        }
                        if ((i2 & 384) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                                int i27 = onExtraCallback + 125;
                                onWarmupCompleted = i27 % 128;
                                int i28 = i27 % 2;
                            } else {
                                i19 = 128;
                            }
                            i9 |= i19;
                        }
                        if ((i2 & 3072) == 0) {
                            i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ^ true ? 1024 : 2048;
                        }
                        int i29 = i9;
                        if ((306783379 & i17) == 306783378 && (i29 & 1171) == 1170) {
                            int i30 = onExtraCallback + 45;
                            onWarmupCompleted = i30 % 128;
                            int i31 = i30 % 2;
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z6, i17 & 1)) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i14 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            setbyteorder2 = i18 != 0 ? null : setbyteorder;
                            boolean z10 = i5 != 0 ? false : z3;
                            Badge badge3 = i6 != 0 ? null : badge;
                            DetailsButton detailsButton3 = i7 != 0 ? null : detailsButton;
                            boolean z11 = i8 != 0 ? true : z4;
                            boolean z12 = i10 != 0 ? true : z5;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-530000530, i17, i29, "im.toss.feature.credit.ui.main.report.UsageHistoryRow (CreditScoreReportScreen.kt:969)");
                            }
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                                int i32 = onWarmupCompleted + 95;
                                onExtraCallback = i32 % 128;
                                int i33 = i32 % 2;
                                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                            int i34 = i17;
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            Badge badge4 = badge3;
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            DetailsButton detailsButton4 = detailsButton3;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport03);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
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
                            if (z) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1269455354);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                int i35 = onExtraCallback + 33;
                                onWarmupCompleted = i35 % 128;
                                int i36 = i35 % 2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1269152639);
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f), 0.0f, 2, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), RoundedCornerShapeKt.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 12, (Object) null)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            if (z2) {
                                function02 = null;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1269996986);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1269498227);
                                function02 = null;
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(RangesKt.coerceAtLeast(IAuthTabCallback(getsupportedhighspeedresolutions) - r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(52.0f)), 0.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(34.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.onNavigationEvent()), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onActivityLayout(), RoundedCornerShapeKt.onExtraCallback(0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 3, (Object) null)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = addAttachUserData.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, getDid.Companion.IAuthTabCallback());
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized2 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda1(getsupportedhighspeedresolutions);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized2);
                            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                            badge2 = badge4;
                            detailsButton2 = detailsButton4;
                            boolean z13 = z12;
                            w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{ForwardingCameraControl.onExtraCallback(666433061, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda2(z10, str2, str3, z11), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), Boolean.valueOf(z10), quirksExternalSyntheticBackport0OnNavigationEvent, ForwardingCameraControl.onExtraCallback(702437072, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda3(str, setbyteorder2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), onnavigationevent.onNavigationEvent(), null, ForwardingCameraControl.onExtraCallback(960660628, true, new CreditScoreReportScreenKt$.ExternalSyntheticLambda4(badge2, detailsButton2, function1), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), onnavigationevent.onNavigationEvent(), null, Float.valueOf(0.0f), null, null, getViewTypeCount.onNavigationEvent.Companion.IAuthTabCallback(), null, null, z12 ? function0 : function02, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i34 >> 18) & 112) | 14183430), 384, 225056}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i37 = onWarmupCompleted + 55;
                                onExtraCallback = i37 % 128;
                                int i38 = i37 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            z9 = z13;
                            z7 = z10;
                            z8 = z11;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                            setbyteorder2 = setbyteorder;
                            z7 = z3;
                            badge2 = badge;
                            detailsButton2 = detailsButton;
                            z8 = z4;
                            z9 = z5;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda5(quirksExternalSyntheticBackport02, str, setbyteorder2, str2, str3, z, z2, z7, badge2, detailsButton2, z8, z9, function0, function1, i, i2, i3));
                            return;
                        }
                        return;
                    }
                    i9 |= 48;
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    int i292 = i9;
                    if ((306783379 & i17) == 306783378) {
                        z6 = true;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z6, i17 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                i10 = i3 & 2048;
                if (i10 != 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i2922 = i9;
                if ((306783379 & i17) == 306783378) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z6, i17 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i3 & 512;
            if (i7 == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            i10 = i3 & 2048;
            if (i10 != 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i29222 = i9;
            if ((306783379 & i17) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z6, i17 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i10 = i3 & 2048;
        if (i10 != 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i292222 = i9;
        if ((306783379 & i17) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z6, i17 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, ExtensionsManager1 extensionsManager1) {
        float fOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(getsupportedhighspeedresolutions, (int) (extensionsManager1.onExtraCallbackWithResult() >> 64));
            fOnExtraCallbackWithResult = (int) extensionsManager1.onExtraCallbackWithResult();
        } else {
            onExtraCallbackWithResult(getsupportedhighspeedresolutions, (int) (extensionsManager1.onExtraCallbackWithResult() >> 32));
            fOnExtraCallbackWithResult = (int) extensionsManager1.onExtraCallbackWithResult();
        }
        IAuthTabCallback(getsupportedhighspeedresolutions2, fOnExtraCallbackWithResult);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        long jOnUnminimized;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2070599157);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = onExtraCallback + 81;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
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
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            int i10 = onExtraCallback + 11;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
        }
        int i11 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i11) != 74898, i11 & 1)) {
            if (i7 != 0) {
                int i12 = onExtraCallback + 57;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 != 0) {
                    quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                    int i13 = 40 / 0;
                } else {
                    quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                }
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2070599157, i11, -1, "im.toss.feature.credit.ui.main.report.GradientEmptyView (CreditScoreReportScreen.kt:1084)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                int i14 = onWarmupCompleted + 83;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                objOnMinimized2 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized2;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(setMaxAdCount.onExtraCallback(onextracallback, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.6f))), getWrite.IAuthTabCallback(Float.valueOf(0.25f), setByteOrder.onNavigationEvent(getMaxAdCount.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.9f))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent()))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390, 4), 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(250.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(250.0f));
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, onextracallbackwithresult.IAuthTabCallbackDefault(), (toMetersPerSecond) null, 2, (Object) null);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda51(getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = setImageAssetsFolder.onNavigationEvent(calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized3), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits((((Float) onWarmupCompleted(375634363, new Object[]{getsupportedhighspeedresolutions2}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -375634326, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).floatValue() / 2.0f) - (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(350.0f)) / 2.0f)) << 32) | (Float.floatToRawIntBits(((Float) onWarmupCompleted(-1403315670, new Object[]{getsupportedhighspeedresolutions}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1403315693, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).floatValue() / 2.0f) & 4294967295L)), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallback(), onextracallbackwithresult.IAuthTabCallbackDefault(), 0.0f, 0.0f, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(350.0f))) & 4294967295L) | (Float.floatToRawIntBits(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(350.0f))) << 32)), false, false, 0.0f, 472, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onNavigationEvent(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i16 = onWarmupCompleted + 43;
                onExtraCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i17 = 46 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
            Object obj2 = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
            mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = mExternalSyntheticApiModelOutline1.asInterface.Companion.asBinder().IAuthTabCallbackDefault();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            mexternalsyntheticapimodeloutline1.onExtraCallback(list, iAuthTabCallbackIAuthTabCallbackDefault, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, Integer.MAX_VALUE, 0, 0, false, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{appLovinPostbackService}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopCenter, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i11 >> 3) & 14) | 3456, 1769472, 6, 949872);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                int i18 = onExtraCallback + 53;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1625675438);
                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1625674478);
                jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            int i20 = onWarmupCompleted + 19;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnNavigationEvent2, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jOnUnminimized), 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i11 >> 6) & 14) | 48), 0, 130800}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 0.0f, 13, (Object) null);
            setCallToAction.onExtraCallback onextracallback2 = setCallToAction.onExtraCallback.Weak;
            setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
            if ((i11 & 458752) == 131072) {
                int i22 = onExtraCallback + 85;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i11 & 57344) != 16384;
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (((!z2) || z) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                CreditScoreReportScreenKt$.ExternalSyntheticLambda52 externalSyntheticLambda52 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda52(function1, str3);
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda52);
                obj = externalSyntheticLambda52;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                obj = objOnMinimized4;
            }
            setAdvertiser.onExtraCallbackWithResult(str2, quirksExternalSyntheticBackport0OnExtraCallback2, iAuthTabCallbackOnNavigationEvent, (setCallToAction.onWarmupCompleted) null, onextracallback2, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, (Function0) obj, false, false, cameraCaptureResultEmptyCameraCaptureResult3, ((i11 >> 9) & 14) | 25008, 0, 1768);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult3;
            onPageLoadError.onExtraCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 152134227, new Object[]{cameraCaptureResultEmptyCameraCaptureResult2, 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -152134227);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i24 = onWarmupCompleted + 97;
                onExtraCallback = i24 % 128;
                if (i24 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda53(quirksExternalSyntheticBackport03, list, str, str2, str3, function1, i, i2));
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(getsupportedhighspeedresolutions, (int) extensionsManager1.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final void onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        long jOnRelationshipValidationResult;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1950772416);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                i4 = 16;
            } else {
                int i6 = onWarmupCompleted + 15;
                onExtraCallback = i6 % 128;
                i4 = i6 % 2 == 0 ? 97 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = onExtraCallback + 25;
                onWarmupCompleted = i7 % 128;
                i3 = i7 % 2 != 0 ? 21380 : 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 147) != 146, i2 & 1)) {
            int i8 = onExtraCallback + 1;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onWarmupCompleted + 123;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1950772416, i2, -1, "im.toss.feature.credit.ui.main.report.GreyGradientListFooter (CreditScoreReportScreen.kt:1151)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1950772416, i2, -1, "im.toss.feature.credit.ui.main.report.GreyGradientListFooter (CreditScoreReportScreen.kt:1151)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(1.0f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null);
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(-(onExtraCallbackWithResult(getsupportedhighspeedresolutions) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2086564327);
                jOnRelationshipValidationResult = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 476605378, OverseasRrnInputTextField.IAuthTabCallback(), -476605362)).longValue();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(2086563367);
                jOnRelationshipValidationResult = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onRelationshipValidationResult();
                int i11 = onExtraCallback + 59;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = setImageAssetsFolder.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent, jIAuthTabCallback, getMaxAdCount.onNavigationEvent(jOnRelationshipValidationResult, 0.25f), setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, 0.0f, 0L, false, false, 0.0f, 504, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda63(getsupportedhighspeedresolutions);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            onWarmupCompleted(607551902, new Object[]{calculatePlaceholderForExtensions.onExtraCallbackWithResult(onextracallback, (Function1) objOnMinimized2), str, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i2 & 896) | (i2 & 112) | 6), 0}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda64(quirksExternalSyntheticBackport0, str, function0, i));
        }
    }

    private static final Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onExtraCallback());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onExtraCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 1;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
        return unit2;
    }

    private static final removeObserverLocked onNavigationEvent(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        readFully.onExtraCallback onextracallback = readFully.Companion;
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sessionProcessorCaptureCallback.onWarmupCompleted() >> 32));
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new CreditScoreReportScreenKt$.ExternalSyntheticLambda7(onextracallback.onWarmupCompleted(pairArr2, jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), createURational.Companion.onExtraCallback())));
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32));
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0.0f, (hasMoreElements) null, (seek) null, 0, 122, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{65098, 50313, 35809, 20016, 5380, 55411, 40610, 26014, 10494, 61239, 45592, 31012, 16362, 711, 51705, 35885, 21275, 5745, 56496, 41945, 26284, 11632, 61519, 46894, 32240}, TextUtils.getOffsetAfter("", 1) + 32744, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{65098, 50313, 35809, 20016, 5380, 55411, 40610, 26014, 10494, 61239, 45592, 31012, 16362, 711, 51705, 35885, 21275, 5745, 56496, 41945, 26284, 11632, 61519, 46894, 32240}, 15061 - TextUtils.getOffsetAfter("", 0), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallback + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1918858062);
        if ((i & 6) == 0) {
            int i4 = onWarmupCompleted + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i5 = onWarmupCompleted + 63;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1918858062, i2, -1, "im.toss.feature.credit.ui.main.report.ScoreReportFeedbackRow (CreditScoreReportScreen.kt:1224)");
                }
                AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
                getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent = onnavigationevent.onNavigationEvent();
                getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent2 = onnavigationevent.onNavigationEvent();
                getViewTypeCount.onTransact ontransactOnExtraCallbackWithResult = getViewTypeCount.onTransact.Companion.onExtraCallbackWithResult();
                getAvailableLevel getavailablelevel = getAvailableLevel.onWarmupCompleted;
                getBacktraceNote getbacktracenoteIAuthTabCallback = getavailablelevel.IAuthTabCallback();
                getBacktraceNote getbacktracenoteOnWarmupCompleted = getavailablelevel.onWarmupCompleted();
                if ((i2 & 14) == 4) {
                    int i7 = onWarmupCompleted + 103;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        z = true;
                    }
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z) {
                    int i8 = onWarmupCompleted + 115;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Object obj2 = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        CreditScoreReportScreenKt$.ExternalSyntheticLambda70 externalSyntheticLambda70 = new CreditScoreReportScreenKt$.ExternalSyntheticLambda70(function1);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda70);
                        obj2 = externalSyntheticLambda70;
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{getbacktracenoteIAuthTabCallback, true, null, getbacktracenoteOnWarmupCompleted, onextracallbackOnNavigationEvent, null, null, onextracallbackOnNavigationEvent2, null, fValueOf, null, null, null, ontransactOnExtraCallbackWithResult, null, (Function0) obj2, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 12610614, 3072, 221028}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                AppLovinNativeAdImplExternalSyntheticLambda6.onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult.Companion.IAuthTabCallback(), (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
                getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent2 = getViewTypeCount.onExtraCallback.Companion;
                getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent3 = onnavigationevent2.onNavigationEvent();
                getViewTypeCount.onExtraCallback onextracallbackOnNavigationEvent22 = onnavigationevent2.onNavigationEvent();
                getViewTypeCount.onTransact ontransactOnExtraCallbackWithResult2 = getViewTypeCount.onTransact.Companion.onExtraCallbackWithResult();
                getAvailableLevel getavailablelevel2 = getAvailableLevel.onWarmupCompleted;
                getBacktraceNote getbacktracenoteIAuthTabCallback2 = getavailablelevel2.IAuthTabCallback();
                getBacktraceNote getbacktracenoteOnWarmupCompleted2 = getavailablelevel2.onWarmupCompleted();
                if ((i2 & 14) == 4) {
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditScoreReportScreenKt$.ExternalSyntheticLambda71(function1, i));
        }
    }

    private static final int onTransact(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).intValue();
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return iIntValue;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(i));
        int i5 = onWarmupCompleted + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final int IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).intValue();
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf(iIntValue));
        if (i3 == 0) {
            return null;
        }
        int i4 = 54 / 0;
        return null;
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onWarmupCompleted + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = onWarmupCompleted + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final getRequestCode onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<getRequestCode> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getRequestCode getrequestcode = (getRequestCode) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            return getrequestcode;
        }
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<getRequestCode> getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getrequestcode);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getRequestCode IAuthTabCallback(getSupportedHighSpeedResolutionsFor<getRequestCode> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getRequestCode getrequestcode = (getRequestCode) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return getrequestcode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<getRequestCode> getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(getrequestcode);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onExtraCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return fOnNavigationEvent;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        int i5 = onWarmupCompleted + 23;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fOnNavigationEvent);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    private static /* synthetic */ Object mayLaunchUrl(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return Float.valueOf(getsupportedhighspeedresolutions.onNavigationEvent());
        }
        getsupportedhighspeedresolutions.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return fOnNavigationEvent;
    }

    private static final void onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onExtraCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ScoreReportResponse scoreReportResponse, List list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(499863428, new Object[]{scoreReportResponse, list, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -499863424, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onExtraCallback(r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        return (VirtualCameraControlExternalSyntheticLambda1) onWarmupCompleted(-271722991, new Object[]{r8lambdanm9dm2eewl4vrptnjmesfjqky4, getsupportedhighspeedresolutionsfor}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 271723015, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, int i, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(-656464053, new Object[]{str, str2, Integer.valueOf(i), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 656464078, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardUsageReportResponse cardUsageReportResponse, long j, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(922958558, new Object[]{cardUsageReportResponse, Long.valueOf(j), rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -922958537, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, DetailsButton detailsButton) {
        return (Unit) onWarmupCompleted(-789164244, new Object[]{function1, detailsButton}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 789164260, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Reason reason, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(563868115, new Object[]{reason, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -563868098, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, String str, String str2, boolean z2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1655624106, new Object[]{Boolean.valueOf(z), str, str2, Boolean.valueOf(z2), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1655624088, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardUsageReportResponse cardUsageReportResponse, Function1 function1, boolean z, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(-812536818, new Object[]{cardUsageReportResponse, function1, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 812536830, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, ScoreReportResponse scoreReportResponse) {
        return (Unit) onWarmupCompleted(-1821954943, new Object[]{function1, scoreReportResponse}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1821954954, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, u3 u3Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-967085879, new Object[]{function0, u3Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 967085894, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(1940397060, new Object[]{quirksExternalSyntheticBackport0, str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1940397027, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanUsageReportResponse loanUsageReportResponse, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1952408525, new Object[]{loanUsageReportResponse, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1952408497, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(Pair[] pairArr, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        return (removeObserverLocked) onWarmupCompleted(-1404889063, new Object[]{pairArr, sessionProcessorCaptureCallback}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1404889099, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ScoreReportResponse scoreReportResponse, Function1 function1, boolean z, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(-1493652985, new Object[]{scoreReportResponse, function1, Boolean.valueOf(z), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1493653015, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getRequestCode getrequestcode) {
        return (Unit) onWarmupCompleted(-1814928238, new Object[]{getsupportedhighspeedresolutionsfor, getrequestcode}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1814928251, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(DisclaimerV2Row disclaimerV2Row, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(896787809, new Object[]{disclaimerV2Row, arecachedadresourcesmissing, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -896787787, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        return (Unit) onWarmupCompleted(-361217727, new Object[]{str, setDetectableSize}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 361217735, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(Function1 function1, CardUsageReportResponse cardUsageReportResponse) {
        return (Unit) onWarmupCompleted(-1658937204, new Object[]{function1, cardUsageReportResponse}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1658937205, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(getTimebase gettimebase, Futures3 futures3) {
        return (Unit) onWarmupCompleted(1584316298, new Object[]{gettimebase, futures3}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1584316278, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(String str) {
        return (Unit) onWarmupCompleted(1200422679, new Object[]{str}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1200422665, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(ScoreReportResponse scoreReportResponse, Function1 function1, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-343006415, new Object[]{scoreReportResponse, function1, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 343006442, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final float onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        return ((Float) onWarmupCompleted(-1403315670, new Object[]{getsupportedhighspeedresolutions}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1403315693, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).floatValue();
    }

    private static final float onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        return ((Float) onWarmupCompleted(375634363, new Object[]{getsupportedhighspeedresolutions}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -375634326, getPreRenderJob.onNavigationEvent.IAuthTabCallback())).floatValue();
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, ExtensionsManager1 extensionsManager1) {
        return (Unit) onWarmupCompleted(-1864295594, new Object[]{getsupportedhighspeedresolutions, extensionsManager1}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1864295601, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(1656824216, new Object[]{quirksExternalSyntheticBackport0, str, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1656824187, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(ScoreStatusBoardInfo scoreStatusBoardInfo, areAllItemsEnabled areallitemsenabled, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(596269342, new Object[]{scoreStatusBoardInfo, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -596269316, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(ScoreReportResponse scoreReportResponse, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(698422269, new Object[]{scoreReportResponse, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -698422266, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Reason reason, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-1660199366, new Object[]{reason, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1660199371, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Reason reason, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1593255575, new Object[]{reason, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1593255540, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(Reason reason, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(-663568037, new Object[]{reason, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 663568043, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull List<String> list, int i, @NotNull Function1<? super getRequestCode, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        onWarmupCompleted(-409126899, new Object[]{quirksExternalSyntheticBackport0, list, Integer.valueOf(i), function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 409126901, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Integer> getsupportedhighspeedresolutionsfor, int i) throws NoWhenBranchMatchedException {
        onWarmupCompleted(-712545836, new Object[]{getsupportedhighspeedresolutionsfor, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 712545855, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(ScoreReportResponse scoreReportResponse, List list, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(-918439657, new Object[]{scoreReportResponse, list, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 918439657, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(String str, String str2, int i, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(-77291498, new Object[]{str, str2, Integer.valueOf(i), rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 77291530, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(-872198895, new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 872198904, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull String str, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onWarmupCompleted(607551902, new Object[]{quirksExternalSyntheticBackport0, str, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -607551868, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(boolean z, String str, String str2, boolean z2, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1519336303, new Object[]{Boolean.valueOf(z), str, str2, Boolean.valueOf(z2), w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1519336293, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, setByteOrder setbyteorder, String str2, String str3, boolean z, boolean z2, boolean z3, Badge badge, DetailsButton detailsButton, boolean z4, boolean z5, Function0 function0, Function1 function1, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        return (Unit) onWarmupCompleted(-1632993060, new Object[]{quirksExternalSyntheticBackport0, str, setbyteorder, str2, str3, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), badge, detailsButton, Boolean.valueOf(z4), Boolean.valueOf(z5), function0, function1, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)}, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), 1632993091, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
    }
}
