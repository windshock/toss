package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.tds.view.R;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.accessgetTlsVersionsAsStringp;
import o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY;
import o.toPreviewOnlyRange;
import o.w5a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w5a {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final w5a onNavigationEvent = new w5a();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = onWarmupCompleted + 105;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        int i6 = onWarmupCompleted + 117;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIEngagementSignalsCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPostMessage = postMessage(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return unitPostMessage;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ICustomTabsServiceStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onExtraCallback + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsServiceStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1239946899, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1239946879, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i5 = onExtraCallback + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1377311576, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1377311583, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        Object[] objArr = {str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 50 / 0;
        return (Unit) onExtraCallback(objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1377311576, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1377311583, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            writeTypedList(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitWriteTypedList = writeTypedList(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitWriteTypedList;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIPostMessageServiceDefault = IPostMessageServiceDefault(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIPostMessageServiceDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return IPostMessageServiceStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IPostMessageServiceStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWarmup = warmup(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitWarmup;
    }

    public static /* synthetic */ Unit ICustomTabsService(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return ICustomTabsCallback_Parcel(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ICustomTabsCallback_Parcel(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IEngagementSignalsCallback(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitIEngagementSignalsCallback = IEngagementSignalsCallback(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onWarmupCompleted + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 91 / 0;
        }
        return unitIEngagementSignalsCallback;
    }

    public static /* synthetic */ Unit access000(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnGreatestScrollPercentageIncreased;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnVerticalScrollEvent;
    }

    public static /* synthetic */ Unit asBinder(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsServiceStubProxy;
    }

    public static /* synthetic */ Unit asInterface(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 != 0) {
            return (Unit) onExtraCallback(objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1563347587, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1563347571, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int i5 = 29 / 0;
        return (Unit) onExtraCallback(objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1563347587, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1563347571, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit extraCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onSessionEnded(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onSessionEnded(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess200 = access200(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAccess200;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit extraCommand(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPrefetch = prefetch(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = onExtraCallback + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitPrefetch;
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ICustomTabsService_Parcel(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsService_Parcel;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityLayout(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -969811919, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 969811936, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i5 = onWarmupCompleted + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onActivityResized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return validateRelationship(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        validateRelationship(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onWarmupCompleted + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7;
        int i8 = ~i2;
        int i9 = ~i;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = i10 | (~(i11 | i));
        int i13 = (~(i | i8)) | (~(i9 | i11));
        int i14 = ~(i2 | i4);
        int i15 = i13 | i14;
        int i16 = i14 | i12;
        int i17 = i2 + i4 + i6 + ((-1585779005) * i3) + (640148872 * i5);
        int i18 = i17 * i17;
        int i19 = (i2 * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i12) + ((-224423437) * i15) + (224423437 * i16) + (84410368 * i6) + (1159200768 * i3) + ((-734003200) * i5) + (2089549824 * i18);
        int i20 = (i2 * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i12 * (-1802)) + (i15 * (-901)) + (i16 * 901) + ((-1291221671) * i6) + ((-1079815989) * i3) + (669414472 * i5) + (i18 * 145489920);
        boolean z = false;
        switch (i19 + (i20 * i20 * (-1699479552))) {
            case 1:
                w5a w5aVar = (w5a) objArr[0];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i21 = 2 % 2;
                int i22 = onExtraCallback + 61;
                onWarmupCompleted = i22 % 128;
                int i23 = i22 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-401716232, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A (CenterPreset.kt:176)");
                    int i24 = onExtraCallback + 13;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 4 % 3;
                    }
                }
                int i26 = iIntValue << 18;
                onExtraCallback(new Object[]{w5aVar, accessgetTlsVersionsAsStringp.Typography5, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography6, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((29360128 & i26) | ((iIntValue << 9) & 7168) | 24582 | (i26 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                return null;
            case 2:
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[2];
                getBacktraceNote getbacktracenote3 = (getBacktraceNote) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue2 = ((Number) objArr[5]).intValue();
                int i27 = 2 % 2;
                int i28 = onWarmupCompleted + 73;
                onExtraCallback = i28 % 128;
                int i29 = i28 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accessgettlsversionsasstringp, jLongValue, graphicDeviceInfo, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue2);
                int i30 = onExtraCallback + 43;
                onWarmupCompleted = i30 % 128;
                int i31 = i30 % 2;
                return unitOnExtraCallbackWithResult;
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                w5a w5aVar2 = (w5a) objArr[0];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4 = (getBacktraceNote) objArr[1];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = (getBacktraceNote) objArr[2];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = (getBacktraceNote) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue3 = ((Number) objArr[5]).intValue();
                int i32 = 2 % 2;
                int i33 = onWarmupCompleted + 5;
                onExtraCallback = i33 % 128;
                int i34 = i33 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-224186247, iIntValue3, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A (CenterPreset.kt:585)");
                }
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography5;
                long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3 = accessgetTlsVersionsAsStringp.Typography7;
                authParams authparams = authParams.TextTertiary;
                w5aVar2.onExtraCallbackWithResult(accessgettlsversionsasstringp2, jOnExtraCallback, null, getbacktracenote4, accessgettlsversionsasstringp3, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult3, 6), null, getbacktracenote5, accessgettlsversionsasstringp3, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult3, 6), null, getbacktracenote6, cameraCaptureResultEmptyCameraCaptureResult3, 100687878 | ((iIntValue3 << 9) & 7168) | (29360128 & (iIntValue3 << 18)), (iIntValue3 >> 3) & 1008, 1092);
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i35 = onExtraCallback + 13;
                onWarmupCompleted = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onNavigationEvent(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            case 12:
                return onTransact(objArr);
            case 13:
                return access000(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                return IAuthTabCallbackStubProxy(objArr);
            case R.styleable.TdsListRowV1View_centerType /* 17 */:
                String str = (String) objArr[0];
                getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
                RowScope rowScope = (RowScope) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue4 = ((Number) objArr[4]).intValue();
                int i37 = 2 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((iIntValue4 & 17) != 16) {
                    int i38 = onExtraCallback + 75;
                    int i39 = i38 % 128;
                    onWarmupCompleted = i39;
                    int i40 = i38 % 2;
                    int i41 = i39 + 17;
                    onExtraCallback = i41 % 128;
                    int i42 = i41 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(z, iIntValue4 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1131755468, iIntValue4, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D.<anonymous> (CenterPreset.kt:429)");
                    }
                    w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult4, 3072, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i43 = onWarmupCompleted + 9;
                        onExtraCallback = i43 % 128;
                        int i44 = i43 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        i7 = onWarmupCompleted + 91;
                    }
                    return Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
                i7 = onWarmupCompleted + 3;
                onExtraCallback = i7 % 128;
                int i45 = i7 % 2;
                return Unit.INSTANCE;
            case R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return access100(objArr);
            case R.styleable.TdsListRowV1View_leftDate /* 19 */:
                w5a w5aVar3 = (w5a) objArr[0];
                final String str2 = (String) objArr[1];
                final String str3 = (String) objArr[2];
                final getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[3];
                final getHumanReadableName gethumanreadablename3 = (getHumanReadableName) objArr[4];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
                int iIntValue5 = ((Number) objArr[6]).intValue();
                int iIntValue6 = ((Number) objArr[7]).intValue();
                int i46 = 2 % 2;
                int i47 = onExtraCallback + 81;
                onWarmupCompleted = i47 % 128;
                int i48 = i47 % 2;
                if ((iIntValue6 & 4) != 0) {
                    gethumanreadablename2 = null;
                }
                if ((iIntValue6 & 8) != 0) {
                    gethumanreadablename3 = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1711014424, iIntValue5, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A (CenterPreset.kt:222)");
                }
                onExtraCallback(new Object[]{w5aVar3, ForwardingCameraControl.onExtraCallback(903001170, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda11
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i49 = 2 % 2;
                        int i50 = onExtraCallback + 61;
                        onExtraCallbackWithResult = i50 % 128;
                        int i51 = i50 % 2;
                        Unit unitIAuthTabCallbackDefault = w5a.IAuthTabCallbackDefault(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i52 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i52 % 128;
                        int i53 = i52 % 2;
                        return unitIAuthTabCallbackDefault;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult5, 54), ForwardingCameraControl.onExtraCallback(18265363, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda12
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i49 = 2 % 2;
                        int i50 = onNavigationEvent + 41;
                        onExtraCallbackWithResult = i50 % 128;
                        int i51 = i50 % 2;
                        Unit unitOnWarmupCompleted = w5a.onWarmupCompleted(str3, gethumanreadablename3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i52 = onExtraCallbackWithResult + 107;
                        onNavigationEvent = i52 % 128;
                        if (i52 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult5, 54), cameraCaptureResultEmptyCameraCaptureResult5, Integer.valueOf(((iIntValue5 >> 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i49 = onExtraCallback + 107;
                onWarmupCompleted = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return extraCallback(objArr);
            case R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                w5a w5aVar4 = (w5a) objArr[0];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = (getBacktraceNote) objArr[1];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = (getBacktraceNote) objArr[2];
                getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = (getBacktraceNote) objArr[3];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
                int iIntValue7 = ((Number) objArr[5]).intValue();
                int i51 = 2 % 2;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i52 = onWarmupCompleted + 77;
                    onExtraCallback = i52 % 128;
                    int i53 = i52 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1403183082, iIntValue7, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3D (CenterPreset.kt:853)");
                }
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp4 = accessgetTlsVersionsAsStringp.Typography6;
                authParams authparams2 = authParams.TextTertiary;
                w5aVar4.onExtraCallbackWithResult(accessgettlsversionsasstringp4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams2, cameraCaptureResultEmptyCameraCaptureResult6, 6), null, getbacktracenote7, accessgetTlsVersionsAsStringp.Typography4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult6, 6), null, getbacktracenote8, accessgettlsversionsasstringp4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams2, cameraCaptureResultEmptyCameraCaptureResult6, 6), null, getbacktracenote9, cameraCaptureResultEmptyCameraCaptureResult6, 100687878 | ((iIntValue7 << 9) & 7168) | (29360128 & (iIntValue7 << 18)), (iIntValue7 >> 3) & 1008, 1092);
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return null;
                }
                int i54 = onWarmupCompleted + 107;
                onExtraCallback = i54 % 128;
                int i55 = i54 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                return null;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitRequestPostMessageChannel;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitNewAuthTabSession;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 27;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(accessgettlsversionsasstringp, j, graphicDeviceInfo, getbacktracenote, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(accessgettlsversionsasstringp, j, graphicDeviceInfo, getbacktracenote, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onMessageChannelReady(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit onMinimized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIEngagementSignalsCallbackStubProxy;
    }

    public static /* synthetic */ Unit onNavigationEvent(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote2, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, long j3, GraphicDeviceInfo graphicDeviceInfo3, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(accessgettlsversionsasstringp, j, graphicDeviceInfo, getbacktracenote, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getbacktracenote2, accessgettlsversionsasstringp3, j3, graphicDeviceInfo3, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(accessgettlsversionsasstringp, j, graphicDeviceInfo, getbacktracenote, accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, getbacktracenote2, accessgettlsversionsasstringp3, j3, graphicDeviceInfo3, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onPostMessage(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitUpdateVisuals = updateVisuals(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return unitUpdateVisuals;
        }
        throw null;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            ITrustedWebActivityCallbackStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitITrustedWebActivityCallbackStub;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -758984969, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 758984983, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onTransact(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitReceiveFile = receiveFile(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 57 / 0;
        }
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return newSession(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        newSession(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return prefetchWithMultipleUrls(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        prefetchWithMultipleUrls(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private w5a() {
    }

    public final void IAuthTabCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1255363191, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1A (CenterPreset.kt:34)");
        }
        int i5 = i << 9;
        onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6), isRepeatingEnabled.onExtraCallback.onTransact(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i5 & 7168) | 390 | (i5 & 57344), 0);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onWarmupCompleted + 3;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i8 = onWarmupCompleted + 59;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GraphicDeviceInfo graphicDeviceInfo;
        w5a w5aVar = (w5a) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue2 & 2) != 0 : (iIntValue2 & 5) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j = jLongValue;
        if ((iIntValue2 & 4) != 0) {
            int i3 = onWarmupCompleted + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        if ((iIntValue2 & 8) != 0) {
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            graphicDeviceInfo = null;
        } else {
            graphicDeviceInfo = graphicDeviceInfo2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-371402483, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1A (CenterPreset.kt:50)");
        }
        w5aVar.onExtraCallbackWithResult(str, new getHumanReadableName(j, j2, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 6) & 896) | (iIntValue & 14), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onWarmupCompleted + 27;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable final String str, @Nullable final getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 103;
        onWarmupCompleted = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 4) != 0) {
            int i6 = i4 + 59;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 21;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1901995326, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1A (CenterPreset.kt:66)");
            if (i8 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1059753785, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 1;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                String str2 = str;
                if (i11 == 0) {
                    return w5a.ICustomTabsService(str2, gethumanreadablename, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                w5a.ICustomTabsService(str2, gethumanreadablename, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = onWarmupCompleted + 1;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    private static final Unit ICustomTabsCallback_Parcel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onExtraCallback + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 2;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1059753785, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1A.<anonymous> (CenterPreset.kt:69)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 47;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1438438058, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1B (CenterPreset.kt:81)");
        }
        int i5 = i << 9;
        onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i5 & 7168) | 390 | (i5 & 57344), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onWarmupCompleted + 19;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
    }

    public final void onWarmupCompleted(@NotNull String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long jOnNavigationEvent;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        long jOnTransact = (i2 & 2) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i2 & 4) != 0) {
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 8) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 95;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-189669234, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1B (CenterPreset.kt:97)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-189669234, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1B (CenterPreset.kt:97)");
        }
        onWarmupCompleted(str, new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i >> 6) & 896), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 7;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onWarmupCompleted + 15;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public final void onWarmupCompleted(@NotNull final String str, @Nullable final getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-615513021, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1B (CenterPreset.kt:113)");
        }
        onExtraCallback(ForwardingCameraControl.onExtraCallback(-18500357, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    w5a.IAuthTabCallbackStubProxy(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitIAuthTabCallbackStubProxy = w5a.IAuthTabCallbackStubProxy(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i8 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 38 / 0;
                }
                return unitIAuthTabCallbackStubProxy;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onExtraCallback + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z = false;
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-18500357, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1B.<anonymous> (CenterPreset.kt:116)");
                int i6 = onWarmupCompleted + 83;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 97;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
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

    public final void onWarmupCompleted(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(162727989, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C (CenterPreset.kt:128)");
        }
        int i5 = i << 9;
        onNavigationEvent(accessgetTlsVersionsAsStringp.Typography5, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i5 & 7168) | 390 | (i5 & 57344), 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        int i6 = onWarmupCompleted + 49;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        int i8 = onWarmupCompleted + 81;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue2 & 2) != 0) {
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j = jLongValue;
        if ((iIntValue2 & 4) != 0) {
            int i4 = onWarmupCompleted + 107;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue2 & 8) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-7935985, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C (CenterPreset.kt:144)");
        }
        w5aVar.onNavigationEvent(str, new getHumanReadableName(j, j2, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 6) & 896) | (iIntValue & 14), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onNavigationEvent(@NotNull final String str, @Nullable final getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 55;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(670969284, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C (CenterPreset.kt:160)");
                int i7 = 50 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(670969284, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C (CenterPreset.kt:160)");
            }
        }
        onWarmupCompleted(ForwardingCameraControl.onExtraCallback(-1096754499, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda35
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 53;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                String str2 = str;
                if (i10 != 0) {
                    return w5a.onExtraCallbackWithResult(str2, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                Unit unitOnExtraCallbackWithResult = w5a.onExtraCallbackWithResult(str2, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = 95 / 0;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 19;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = 6 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        int i10 = onWarmupCompleted + 9;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newAuthTabSession(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 10) != 4;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallback + 85;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1096754499, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C.<anonymous> (CenterPreset.kt:163)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1096754499, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1C.<anonymous> (CenterPreset.kt:163)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = onWarmupCompleted + 3;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onWarmupCompleted + 59;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long j5;
        long jOnTransact;
        int i3 = 2 % 2;
        long jOnTransact2 = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i2 & 8) != 0) {
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            j5 = jOnNavigationEvent;
        } else {
            j5 = j2;
        }
        GraphicDeviceInfo graphicDeviceInfo3 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        if ((i2 & 32) != 0) {
            int i6 = onExtraCallback + 55;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j3;
        }
        long jOnNavigationEvent2 = (i2 & 64) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        GraphicDeviceInfo graphicDeviceInfo4 = (i2 & 128) == 0 ? graphicDeviceInfo2 : null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(516840126, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A (CenterPreset.kt:198)");
        }
        onExtraCallback(new Object[]{this, str, str2, new getHumanReadableName(jOnTransact2, j5, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact, jOnNavigationEvent2, graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 126) | ((i >> 12) & 57344)), 0}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 3;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = onExtraCallback + 119;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
    }

    private static final Unit postMessage(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        boolean z = false;
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 89;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallback + 125;
            onWarmupCompleted = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 43;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(903001170, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A.<anonymous> (CenterPreset.kt:225)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(903001170, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A.<anonymous> (CenterPreset.kt:225)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallback + 53;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 123;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit newSession(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onWarmupCompleted + 113;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 73;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(18265363, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A.<anonymous> (CenterPreset.kt:231)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(18265363, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2A.<anonymous> (CenterPreset.kt:231)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallback + 93;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 37;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1951072599, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2B (CenterPreset.kt:244)");
            int i7 = onExtraCallback + 5;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography4;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i9 = i << 18;
        onExtraCallback(new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography6, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 9) & 7168) | 24582 | (29360128 & i9) | (i9 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    public final void onWarmupCompleted(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-372251001, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2B (CenterPreset.kt:290)");
        }
        onExtraCallback(ForwardingCameraControl.onExtraCallback(-1884058928, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda33
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i7 = 2 % 2;
                int i8 = onNavigationEvent + 11;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                Unit unit = (Unit) w5a.onExtraCallback(new Object[]{str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 860486083, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -860486083, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i10 = onWarmupCompleted + 11;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1526172561, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda34
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                String str3 = str2;
                if (i9 == 0) {
                    return w5a.extraCommand(str3, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                Unit unitExtraCommand = w5a.extraCommand(str3, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i10 = 24 / 0;
                return unitExtraCommand;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallback + 117;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                int i9 = 79 / 0;
            }
        }
    }

    private static final Unit newSessionWithExtras(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        boolean z = false;
        if ((i & 17) != 16) {
            int i5 = onWarmupCompleted + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1884058928, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2B.<anonymous> (CenterPreset.kt:293)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 89;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 55;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit prefetch(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 76) != 109;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 1;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1526172561, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2B.<anonymous> (CenterPreset.kt:299)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1526172561, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2B.<anonymous> (CenterPreset.kt:299)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 107;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
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

    public final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(8894134, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C (CenterPreset.kt:312)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(8894134, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C (CenterPreset.kt:312)");
                int i4 = 90 / 0;
            }
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i5 = i << 18;
        onExtraCallback(new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography7, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 9) & 7168) | 24582 | (29360128 & i5) | (i5 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = onWarmupCompleted + 39;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void onNavigationEvent(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long jOnTransact;
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 8) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        GraphicDeviceInfo graphicDeviceInfo3 = null;
        GraphicDeviceInfo graphicDeviceInfo4 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        long jOnTransact2 = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j3;
        long jOnNavigationEvent2 = (i2 & 64) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        if ((i2 & 128) != 0) {
            int i6 = onWarmupCompleted + 7;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 18 / 0;
            }
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallback + 19;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1025618940, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C (CenterPreset.kt:334)");
        }
        IAuthTabCallback(str, str2, new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact2, jOnNavigationEvent2, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | ((i >> 12) & 57344), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallback(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 1;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            int i7 = i4 + 3;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 10 / 0;
            }
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(966512422, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C (CenterPreset.kt:358)");
        }
        onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-376151730, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnExtraCallback = w5a.onExtraCallback(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i12 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return unitOnExtraCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1260887537, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda21
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 47;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnMessageChannelReady = w5a.onMessageChannelReady(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i12 = IAuthTabCallback + 111;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                return unitOnMessageChannelReady;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit requestPostMessageChannel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-376151730, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C.<anonymous> (CenterPreset.kt:361)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i3 = onExtraCallback + 13;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return unit;
    }

    private static final Unit requestPostMessageChannelWithExtras(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1260887537, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C.<anonymous> (CenterPreset.kt:367)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1260887537, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2C.<anonymous> (CenterPreset.kt:367)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1933284331, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D (CenterPreset.kt:380)");
            }
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
            long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            int i5 = iIntValue << 18;
            onExtraCallback(new Object[]{w5aVar, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography5, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 9) & 7168) | 24582 | (29360128 & i5) | (i5 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return null;
        }
        CameraConfigExternalSyntheticLambda0.asBinder();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long j5;
        GraphicDeviceInfo graphicDeviceInfo3;
        long jOnTransact;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        int i3 = 2 % 2;
        long jOnTransact2 = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallback + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                jOnNavigationEvent2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i5 = 64 / 0;
            } else {
                jOnNavigationEvent2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            }
            j5 = jOnNavigationEvent2;
        } else {
            j5 = j2;
        }
        if ((i2 & 16) != 0) {
            int i6 = onWarmupCompleted + 63;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            if (i6 % 2 != 0) {
                graphicDeviceInfo.hashCode();
                throw null;
            }
            int i8 = i7 + 39;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 2;
            }
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo;
        }
        if ((i2 & 32) != 0) {
            int i10 = onExtraCallback + 89;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j3;
        }
        if ((i2 & 64) != 0) {
            int i12 = onExtraCallback + 63;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j4;
        }
        graphicDeviceInfo = (i2 & 128) == 0 ? graphicDeviceInfo2 : null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1280008347, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D (CenterPreset.kt:402)");
        }
        onExtraCallback(str, str2, new getHumanReadableName(jOnTransact2, j5, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | ((i >> 12) & 57344), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i14 = onWarmupCompleted + 63;
        onExtraCallback = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 43 / 0;
        }
    }

    public final void onExtraCallback(@Nullable final String str, @Nullable final String str2, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final getHumanReadableName gethumanreadablename3;
        final getHumanReadableName gethumanreadablename4;
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 33;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename3 = null;
        } else {
            gethumanreadablename3 = gethumanreadablename;
        }
        if ((i2 & 8) != 0) {
            int i6 = onWarmupCompleted + 105;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename4 = null;
        } else {
            gethumanreadablename4 = gethumanreadablename2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1989691451, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D (CenterPreset.kt:426)");
        }
        onExtraCallback(new Object[]{this, ForwardingCameraControl.onExtraCallback(1131755468, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit unitOnActivityLayout;
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 19;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    unitOnActivityLayout = w5a.onActivityLayout(str, gethumanreadablename3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = 65 / 0;
                } else {
                    unitOnActivityLayout = w5a.onActivityLayout(str, gethumanreadablename3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i11 = IAuthTabCallback + 53;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitOnActivityLayout;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(247019661, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                Unit typedObject;
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 19;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    typedObject = w5a.readTypedObject(str2, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i10 = 4 / 0;
                } else {
                    typedObject = w5a.readTypedObject(str2, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i11 = onNavigationEvent + 11;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return typedObject;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 6) & 896) | 54)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1732372494, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1732372479, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 83;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i10 = onExtraCallback + 41;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit prefetchWithMultipleUrls(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 7;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i4 = onExtraCallback + 121;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(247019661, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D.<anonymous> (CenterPreset.kt:435)");
                        int i5 = 85 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(247019661, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2D.<anonymous> (CenterPreset.kt:435)");
                    }
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onWarmupCompleted + 107;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i8 = onWarmupCompleted + 71;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(419504500, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2E (CenterPreset.kt:448)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(419504500, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2E (CenterPreset.kt:448)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i5 = i << 18;
        onExtraCallback(new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography4, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 9) & 7168) | 24582 | (29360128 & i5) | (i5 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = onWarmupCompleted + 9;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void onNavigationEvent(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 17;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i5 + 11;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 9;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-650928028, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2E (CenterPreset.kt:494)");
            int i11 = onExtraCallback + 37;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }
        onWarmupCompleted(ForwardingCameraControl.onExtraCallback(-1655304630, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda9
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i13 = 2 % 2;
                int i14 = onExtraCallback + 25;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                String str3 = str;
                if (i15 != 0) {
                    return w5a.onTransact(str3, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                w5a.onTransact(str3, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1754926859, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i13 = 2 % 2;
                int i14 = IAuthTabCallback + 61;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                Unit unitICustomTabsCallbackStubProxy = w5a.ICustomTabsCallbackStubProxy(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i16 = IAuthTabCallback + 125;
                onExtraCallback = i16 % 128;
                if (i16 % 2 != 0) {
                    return unitICustomTabsCallbackStubProxy;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i13 = onExtraCallback + 5;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    private static final Unit receiveFile(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 95;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1655304630, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2E.<anonymous> (CenterPreset.kt:497)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 55;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit warmup(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i5 = onWarmupCompleted + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 13;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1754926859, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2E.<anonymous> (CenterPreset.kt:503)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 113;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
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

    public final void IAuthTabCallbackStub(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1522673965, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F (CenterPreset.kt:516)");
        }
        int i3 = i << 18;
        onExtraCallback(new Object[]{this, accessgetTlsVersionsAsStringp.Typography7, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography5, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6)), null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i << 9) & 7168) | 24582 | (29360128 & i3) | (i3 & 234881024)), 68}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i6 = onWarmupCompleted + 101;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallback(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo3;
        int i3 = 2 % 2;
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent2 = (i2 & 8) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo4 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        long jOnTransact2 = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j3;
        if ((i2 & 64) != 0) {
            int i4 = onWarmupCompleted + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j4;
        }
        if ((i2 & 128) != 0) {
            int i6 = onExtraCallback + 63;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo3 = null;
        } else {
            graphicDeviceInfo3 = graphicDeviceInfo2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1788787161, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F (CenterPreset.kt:538)");
        }
        IAuthTabCallbackStub(str, str2, new getHumanReadableName(jOnTransact, jOnNavigationEvent2, graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact2, jOnNavigationEvent, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | ((i >> 12) & 57344), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onWarmupCompleted + 97;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = onExtraCallback + 23;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallbackStub(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(687835395, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F (CenterPreset.kt:562)");
        }
        IAuthTabCallbackStub(ForwardingCameraControl.onExtraCallback(-147397432, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 3;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return (Unit) w5a.onExtraCallback(new Object[]{str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1936393819, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1936393808, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1032133239, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda32
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 109;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                String str3 = str2;
                if (i8 != 0) {
                    return w5a.onPostMessage(str3, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                w5a.onPostMessage(str3, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onExtraCallback + 71;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = onWarmupCompleted + 119;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    private static final Unit ICustomTabsServiceStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 65;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-147397432, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F.<anonymous> (CenterPreset.kt:565)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-147397432, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F.<anonymous> (CenterPreset.kt:565)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i4 = onWarmupCompleted + 11;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit updateVisuals(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1032133239, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2F.<anonymous> (CenterPreset.kt:571)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 97;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 11;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable final String str, @Nullable final String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final getHumanReadableName gethumanreadablename4;
        int i3 = 2 % 2;
        Object obj = null;
        final String str4 = (i2 & 4) != 0 ? null : str3;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename4 = null;
        } else {
            gethumanreadablename4 = gethumanreadablename;
        }
        final getHumanReadableName gethumanreadablename5 = (i2 & 16) != 0 ? null : gethumanreadablename2;
        final getHumanReadableName gethumanreadablename6 = (i2 & 32) != 0 ? null : gethumanreadablename3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1423187696, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A (CenterPreset.kt:646)");
        }
        onExtraCallback(new Object[]{this, ForwardingCameraControl.onExtraCallback(988716517, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i6 = 2 % 2;
                int i7 = onExtraCallbackWithResult + 93;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                String str5 = str;
                if (i8 == 0) {
                    return (Unit) w5a.onExtraCallback(new Object[]{str5, gethumanreadablename4, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1320605436, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1320605432, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                }
                Object[] objArr = {str5, gethumanreadablename4, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                int i9 = 73 / 0;
                return (Unit) w5a.onExtraCallback(objArr, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1320605436, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1320605432, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(304486212, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                Unit unitOnActivityResized;
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 27;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    unitOnActivityResized = w5a.onActivityResized(str2, gethumanreadablename5, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i8 = 35 / 0;
                } else {
                    unitOnActivityResized = w5a.onActivityResized(str2, gethumanreadablename5, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                int i9 = IAuthTabCallback + 19;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    return unitOnActivityResized;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-379744093, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onNavigationEvent + 45;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                String str5 = str4;
                if (i8 == 0) {
                    return w5a.extraCallbackWithResult(str5, gethumanreadablename6, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                }
                w5a.extraCallbackWithResult(str5, gethumanreadablename6, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 9) & 7168) | 438)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1819881793, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1819881798, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 113;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i8 = onWarmupCompleted + 27;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 88) != 52) {
                z = true;
            } else {
                int i4 = onExtraCallback + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(988716517, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A.<anonymous> (CenterPreset.kt:649)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 89;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 38 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onWarmupCompleted + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit validateRelationship(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 103) != 98) {
                int i4 = onWarmupCompleted + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onWarmupCompleted + 109;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(304486212, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A.<anonymous> (CenterPreset.kt:655)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onWarmupCompleted + 91;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit access200(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onExtraCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-379744093, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A.<anonymous> (CenterPreset.kt:661)");
                    int i6 = 80 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-379744093, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3A.<anonymous> (CenterPreset.kt:661)");
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 13;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public final void onNavigationEvent(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-617185192, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B (CenterPreset.kt:675)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography4;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography6;
        authParams authparams = authParams.TextTertiary;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, null, getbacktracenote, accessgettlsversionsasstringp2, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote2, accessgettlsversionsasstringp2, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 100687878 | ((i << 18) & 29360128), (i >> 3) & 1008, 1092);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onWarmupCompleted + 55;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable final String str, @Nullable final String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final String str4;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        final getHumanReadableName gethumanreadablename4 = null;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 83;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 18 / 0;
            }
            str4 = null;
        } else {
            str4 = str3;
        }
        final getHumanReadableName gethumanreadablename5 = (i2 & 8) != 0 ? null : gethumanreadablename;
        final getHumanReadableName gethumanreadablename6 = (i2 & 16) != 0 ? null : gethumanreadablename2;
        if ((i2 & 32) != 0) {
            int i9 = i4 + 79;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            gethumanreadablename4 = gethumanreadablename3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2146478129, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B (CenterPreset.kt:736)");
        }
        onNavigationEvent((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1881025753, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda25
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i11 = 2 % 2;
                int i12 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                Unit unit = (Unit) w5a.onExtraCallback(new Object[]{str, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1170911203, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1170911216, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i14 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1729711238, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 27;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                String str5 = str2;
                if (i13 == 0) {
                    return w5a.asBinder(str5, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                Unit unitAsBinder = w5a.asBinder(str5, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i14 = 16 / 0;
                return unitAsBinder;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1045480933, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda27
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                Unit unitIsEngagementSignalsApiAvailable;
                int i11 = 2 % 2;
                int i12 = onWarmupCompleted + 117;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    unitIsEngagementSignalsApiAvailable = w5a.isEngagementSignalsApiAvailable(str4, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i13 = 60 / 0;
                } else {
                    unitIsEngagementSignalsApiAvailable = w5a.isEngagementSignalsApiAvailable(str4, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i14 = onWarmupCompleted + 63;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                return unitIsEngagementSignalsApiAvailable;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 9) & 7168) | 438);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IEngagementSignalsCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 43) != 108;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallback + 43;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1881025753, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B.<anonymous> (CenterPreset.kt:739)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 15) != 32;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 89;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1729711238, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B.<anonymous> (CenterPreset.kt:745)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onExtraCallback + 3;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 6 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsService_Parcel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 92) != 49;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 123;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1045480933, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B.<anonymous> (CenterPreset.kt:751)");
                    int i5 = 94 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1045480933, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3B.<anonymous> (CenterPreset.kt:751)");
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onWarmupCompleted + 69;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1010184137, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C (CenterPreset.kt:765)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography7;
        authParams authparams = authParams.TextTertiary;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote, accessgetTlsVersionsAsStringp.Typography5, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote2, accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 100687878 | ((i << 18) & 29360128), (i >> 3) & 1008, 1092);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
    }

    public final void onNavigationEvent(@Nullable final String str, @Nullable final String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final getHumanReadableName gethumanreadablename4;
        int i3 = 2 % 2;
        final String str4 = (i2 & 4) != 0 ? null : str3;
        final getHumanReadableName gethumanreadablename5 = (i2 & 8) != 0 ? null : gethumanreadablename;
        if ((i2 & 16) != 0) {
            int i4 = onExtraCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename4 = null;
        } else {
            gethumanreadablename4 = gethumanreadablename2;
        }
        final getHumanReadableName gethumanreadablename6 = (i2 & 32) != 0 ? null : gethumanreadablename3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 79;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1425198734, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C (CenterPreset.kt:824)");
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1425198734, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C (CenterPreset.kt:824)");
                int i7 = 78 / 0;
            }
        }
        onWarmupCompleted((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-455800727, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda28
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 5;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                String str5 = str;
                if (i10 == 0) {
                    return w5a.IAuthTabCallback_Parcel(str5, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                Unit unitIAuthTabCallback_Parcel = w5a.IAuthTabCallback_Parcel(str5, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = 93 / 0;
                return unitIAuthTabCallback_Parcel;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1140031032, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda29
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 83;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitIAuthTabCallback = w5a.IAuthTabCallback(str2, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1824261337, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda30
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                String str5 = str4;
                if (i10 == 0) {
                    return w5a.extraCallback(str5, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                w5a.extraCallback(str5, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 9) & 7168) | 438);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onWarmupCompleted + 5;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                throw null;
            }
        }
    }

    private static final Unit writeTypedList(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 43;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-455800727, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C.<anonymous> (CenterPreset.kt:827)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 119;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 61;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallback + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1140031032, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C.<anonymous> (CenterPreset.kt:833)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 63;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 7;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onSessionEnded(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 90) != 63) {
                int i4 = onExtraCallback + 61;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i6 = onWarmupCompleted + 103;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1824261337, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3C.<anonymous> (CenterPreset.kt:839)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 21;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@Nullable final String str, @Nullable final String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final getHumanReadableName gethumanreadablename4;
        final getHumanReadableName gethumanreadablename5;
        int i3 = 2 % 2;
        final String str4 = (i2 & 4) != 0 ? null : str3;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            gethumanreadablename4 = null;
        } else {
            gethumanreadablename4 = gethumanreadablename;
        }
        final getHumanReadableName gethumanreadablename6 = (i2 & 16) != 0 ? null : gethumanreadablename2;
        if ((i2 & 32) != 0) {
            int i6 = onWarmupCompleted + 25;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename5 = null;
        } else {
            gethumanreadablename5 = gethumanreadablename3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-701908301, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3D (CenterPreset.kt:914)");
            int i8 = onWarmupCompleted + 89;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        onExtraCallback(new Object[]{this, ForwardingCameraControl.onExtraCallback(969424299, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 21;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unit = (Unit) w5a.onExtraCallback(new Object[]{str, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1261754993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1261755011, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i13 = onExtraCallbackWithResult + 65;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 31 / 0;
                }
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(285193994, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = IAuthTabCallback + 15;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                Unit unitAccess000 = w5a.access000(str2, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i13 = IAuthTabCallback + 97;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 != 0) {
                    return unitAccess000;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-399036311, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda19
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i10 = 2 % 2;
                int i11 = onExtraCallback + 117;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                Unit unit = (Unit) w5a.onExtraCallback(new Object[]{str4, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -469937253, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 469937265, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i13 = onWarmupCompleted + 23;
                onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 9) & 7168) | 438)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1546244693, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1546244714, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onWarmupCompleted + 95;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i11 != 0) {
                throw null;
            }
        }
    }

    private static final Unit onVerticalScrollEvent(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onExtraCallback + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 119;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(969424299, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3D.<anonymous> (CenterPreset.kt:917)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 13;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onGreatestScrollPercentageIncreased(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(285193994, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3D.<anonymous> (CenterPreset.kt:923)");
                int i7 = onExtraCallback + 55;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 4;
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z;
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onExtraCallback + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
            int i4 = onExtraCallback + 35;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 18 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-399036311, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3D.<anonymous> (CenterPreset.kt:929)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i6 = onExtraCallback + 87;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = onExtraCallback + 81;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1796182027, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E (CenterPreset.kt:943)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography7;
        authParams authparams = authParams.TextTertiary;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote, accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote2, accessgetTlsVersionsAsStringp.Typography5, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 100687878 | ((i << 18) & 29360128), (i >> 3) & 1008, 1092);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onExtraCallback + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = onExtraCallback + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        final String str = (String) objArr[1];
        final String str2 = (String) objArr[2];
        final String str3 = (String) objArr[3];
        final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[4];
        final getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[5];
        final getHumanReadableName gethumanreadablename3 = (getHumanReadableName) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0 ? (iIntValue2 & 4) != 0 : (iIntValue2 & 5) != 0) {
            str3 = null;
        }
        if ((iIntValue2 & 8) != 0) {
            int i4 = i2 + 27;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            gethumanreadablename = null;
        }
        if ((iIntValue2 & 16) != 0) {
            gethumanreadablename2 = null;
        }
        if ((iIntValue2 & 32) != 0) {
            gethumanreadablename3 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 43;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(21382132, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E (CenterPreset.kt:1002)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(21382132, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E (CenterPreset.kt:1002)");
        }
        w5aVar.onExtraCallbackWithResult((getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-1900317971, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 67;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallbackStub = w5a.IAuthTabCallbackStub(str, gethumanreadablename, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i9 = onExtraCallback + 21;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitIAuthTabCallbackStub;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1710419020, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = IAuthTabCallback + 81;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitOnMinimized = w5a.onMinimized(str2, gethumanreadablename2, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i9 = onExtraCallback + 33;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                return unitOnMinimized;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(1026188715, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Unit unitICustomTabsCallbackStub = w5a.ICustomTabsCallbackStub(str3, gethumanreadablename3, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i9 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    return unitICustomTabsCallbackStub;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 9) & 7168) | 438);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 77;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z = false;
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 23) != 67) {
                z = true;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 125;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1900317971, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E.<anonymous> (CenterPreset.kt:1005)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1900317971, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E.<anonymous> (CenterPreset.kt:1005)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IEngagementSignalsCallbackStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1710419020, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E.<anonymous> (CenterPreset.kt:1011)");
                int i3 = onExtraCallback + 49;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 / 2;
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 113;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
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

    private static final Unit IPostMessageServiceStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = onExtraCallback + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onWarmupCompleted + 93;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1026188715, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3E.<anonymous> (CenterPreset.kt:1017)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 47;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
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

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote = (getBacktraceNote) objArr[1];
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2 = (getBacktraceNote) objArr[2];
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3 = (getBacktraceNote) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2105786324, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F (CenterPreset.kt:1031)");
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
        authParams authparams = authParams.TextTertiary;
        w5aVar.onExtraCallbackWithResult(accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote, accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote2, accessgetTlsVersionsAsStringp.Typography4, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6), null, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 9) & 7168) | 100687878 | ((iIntValue << 18) & 29360128), (iIntValue >> 3) & 1008, 1092);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                throw null;
            }
        }
        return null;
    }

    public final void IAuthTabCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, long j5, long j6, @Nullable GraphicDeviceInfo graphicDeviceInfo3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        long jOnTransact;
        long jOnNavigationEvent;
        int i4 = 2 % 2;
        if ((i3 & 8) != 0) {
            int i5 = onExtraCallback + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        GraphicDeviceInfo graphicDeviceInfo4 = null;
        if ((i3 & 16) != 0) {
            int i7 = onExtraCallback + 45;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                graphicDeviceInfo4.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        GraphicDeviceInfo graphicDeviceInfo5 = (i3 & 32) != 0 ? null : graphicDeviceInfo;
        long jOnTransact2 = (i3 & 64) != 0 ? setByteOrder.Companion.onTransact() : j3;
        long jOnNavigationEvent2 = (i3 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        GraphicDeviceInfo graphicDeviceInfo6 = (i3 & 256) != 0 ? null : graphicDeviceInfo2;
        long jOnTransact3 = (i3 & 512) != 0 ? setByteOrder.Companion.onTransact() : j5;
        long jOnNavigationEvent3 = (i3 & 1024) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j6;
        if ((i3 & 2048) != 0) {
            int i8 = onWarmupCompleted + 87;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            graphicDeviceInfo4 = graphicDeviceInfo3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = onWarmupCompleted + 83;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1724223190, i, i2, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F (CenterPreset.kt:1060)");
            int i12 = onExtraCallback + 107;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 % 3;
            }
        }
        IAuthTabCallbackDefault(str, str2, str3, new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo5, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact2, jOnNavigationEvent2, graphicDeviceInfo6, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jOnTransact3, jOnNavigationEvent3, graphicDeviceInfo4, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i & 1022) | ((i2 << 12) & 3670016), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = onExtraCallback + 41;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallbackDefault(@Nullable final String str, @Nullable final String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final getHumanReadableName gethumanreadablename4;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 87;
        onExtraCallback = i5 % 128;
        final getHumanReadableName gethumanreadablename5 = null;
        final String str4 = (i5 % 2 == 0 ? (i2 & 4) == 0 : (i2 & 4) == 0) ? str3 : null;
        if ((i2 & 8) != 0) {
            int i6 = i4 + 87;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                gethumanreadablename5.hashCode();
                throw null;
            }
            gethumanreadablename4 = null;
        } else {
            gethumanreadablename4 = gethumanreadablename;
        }
        final getHumanReadableName gethumanreadablename6 = (i2 & 16) != 0 ? null : gethumanreadablename2;
        if ((i2 & 32) != 0) {
            int i7 = onExtraCallback + 9;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        } else {
            gethumanreadablename5 = gethumanreadablename3;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onWarmupCompleted + 111;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(744672565, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F (CenterPreset.kt:1092)");
            int i11 = onWarmupCompleted + 19;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        onExtraCallback(new Object[]{this, ForwardingCameraControl.onExtraCallback(-475092945, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i13 = 2 % 2;
                int i14 = IAuthTabCallback + 45;
                onExtraCallbackWithResult = i14 % 128;
                if (i14 % 2 != 0) {
                    w5a.ICustomTabsCallbackDefault(str, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    throw null;
                }
                Unit unitICustomTabsCallbackDefault = w5a.ICustomTabsCallbackDefault(str, gethumanreadablename4, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i15 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                return unitICustomTabsCallbackDefault;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1159323250, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i13 = 2 % 2;
                int i14 = IAuthTabCallback + 125;
                onNavigationEvent = i14 % 128;
                Object obj4 = null;
                if (i14 % 2 == 0) {
                    w5a.asInterface(str2, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    obj4.hashCode();
                    throw null;
                }
                Unit unitAsInterface = w5a.asInterface(str2, gethumanreadablename6, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i15 = IAuthTabCallback + 93;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    return unitAsInterface;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1843553555, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda16
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                Unit unitOnRelationshipValidationResult;
                int i13 = 2 % 2;
                int i14 = IAuthTabCallback + 11;
                onNavigationEvent = i14 % 128;
                if (i14 % 2 == 0) {
                    unitOnRelationshipValidationResult = w5a.onRelationshipValidationResult(str4, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i15 = 94 / 0;
                } else {
                    unitOnRelationshipValidationResult = w5a.onRelationshipValidationResult(str4, gethumanreadablename5, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i16 = IAuthTabCallback + 47;
                onNavigationEvent = i16 % 128;
                if (i16 % 2 != 0) {
                    return unitOnRelationshipValidationResult;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 9) & 7168) | 438)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 734096600, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -734096592, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onExtraCallback + 51;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit IPostMessageServiceDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 101;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-475092945, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1095)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-475092945, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1095)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onWarmupCompleted + 67;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((iIntValue & 17) != 16) {
            int i4 = onWarmupCompleted + 55;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            z = i4 % 2 == 0;
            int i6 = i5 + 13;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 51;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1159323250, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1101)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1159323250, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1101)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 65;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 67;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1843553555, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1107)");
                    int i4 = 59 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1843553555, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3F.<anonymous> (CenterPreset.kt:1107)");
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onWarmupCompleted + 121;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallback + 83;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void onNavigationEvent(final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, final long j, GraphicDeviceInfo graphicDeviceInfo, final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent;
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            graphicDeviceInfoOnNavigationEvent = w5.onNavigationEvent(accessgettlsversionsasstringp);
        } else {
            graphicDeviceInfoOnNavigationEvent = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-790518907, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1 (CenterPreset.kt:1122)");
        }
        putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted((Pair<? extends r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<?>, ? extends Object>[]) new Pair[]{getWrite.IAuthTabCallback(putBooleanArray.onExtraCallback(), accessgettlsversionsasstringp)}), null, ForwardingCameraControl.onExtraCallback(1080177698, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj, Object obj2) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 55;
                onExtraCallback = i9 % 128;
                Object obj3 = null;
                if (i9 % 2 != 0) {
                    accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgettlsversionsasstringp;
                    long j2 = j;
                    int iIntValue = ((Integer) obj2).intValue();
                    obj3.hashCode();
                    throw null;
                }
                accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3 = accessgettlsversionsasstringp;
                long j3 = j;
                int iIntValue2 = ((Integer) obj2).intValue();
                Unit unit = (Unit) w5a.onExtraCallback(new Object[]{accessgettlsversionsasstringp3, Long.valueOf(j3), graphicDeviceInfoOnNavigationEvent, getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 323468816, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -323468814, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                int i10 = onExtraCallback + 123;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 4);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onExtraCallback + 65;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = onWarmupCompleted + 91;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1080177698, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row1.<anonymous> (CenterPreset.kt:1127)");
                }
                w3a.onWarmupCompleted.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallback + 87;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 3;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 125;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) objArr[1];
        final long jLongValue = ((Number) objArr[2]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[3];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = (accessgetTlsVersionsAsStringp) objArr[5];
        final long jLongValue2 = ((Number) objArr[6]).longValue();
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = (GraphicDeviceInfo) objArr[7];
        final getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int iIntValue2 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent2 = (iIntValue2 & 4) != 0 ? w5.onNavigationEvent(accessgettlsversionsasstringp) : graphicDeviceInfo;
        if ((iIntValue2 & 64) != 0) {
            int i4 = onWarmupCompleted + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                w5.onNavigationEvent(accessgettlsversionsasstringp2);
                throw null;
            }
            graphicDeviceInfoOnNavigationEvent = w5.onNavigationEvent(accessgettlsversionsasstringp2);
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1403891515, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2 (CenterPreset.kt:1147)");
            int i7 = onExtraCallback + 87;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 5;
            }
        }
        putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted((Pair<? extends r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<?>, ? extends Object>[]) new Pair[]{getWrite.IAuthTabCallback(putBooleanArray.onExtraCallback(), accessgettlsversionsasstringp)}), null, ForwardingCameraControl.onExtraCallback(-1811430184, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 97;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                Unit unitOnExtraCallbackWithResult = w5a.onExtraCallbackWithResult(accessgettlsversionsasstringp, jLongValue, graphicDeviceInfoOnNavigationEvent2, getbacktracenote, accessgettlsversionsasstringp2, jLongValue2, graphicDeviceInfoOnNavigationEvent, getbacktracenote2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                if (i11 == 0) {
                    int i12 = 84 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 4);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 103;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final Unit IAuthTabCallback(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 5) {
            z = false;
        } else {
            int i5 = i3 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = onExtraCallback + 105;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1811430184, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row2.<anonymous> (CenterPreset.kt:1152)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onWarmupCompleted + 21;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            w3a w3aVar = w3a.onWarmupCompleted;
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallbackWithResult(final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, final long j, GraphicDeviceInfo graphicDeviceInfo, final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, final long j2, GraphicDeviceInfo graphicDeviceInfo2, final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, final accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, final long j3, GraphicDeviceInfo graphicDeviceInfo3, final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent;
        int i4 = 2 % 2;
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent2 = (i3 & 4) != 0 ? w5.onNavigationEvent(accessgettlsversionsasstringp) : graphicDeviceInfo;
        if ((i3 & 64) != 0) {
            int i5 = onExtraCallback + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                w5.onNavigationEvent(accessgettlsversionsasstringp2);
                throw null;
            }
            graphicDeviceInfoOnNavigationEvent = w5.onNavigationEvent(accessgettlsversionsasstringp2);
        } else {
            graphicDeviceInfoOnNavigationEvent = graphicDeviceInfo2;
        }
        final GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent3 = (i3 & 1024) != 0 ? w5.onNavigationEvent(accessgettlsversionsasstringp3) : graphicDeviceInfo3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 33;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1843951601, i, i2, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3 (CenterPreset.kt:1185)");
        }
        putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.onMinimized(), new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onWarmupCompleted((Pair<? extends r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onExtraCallback<?>, ? extends Object>[]) new Pair[]{getWrite.IAuthTabCallback(putBooleanArray.onExtraCallback(), accessgettlsversionsasstringp)}), null, ForwardingCameraControl.onExtraCallback(147395214, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.v1.CenterPreset$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i8 = 2 % 2;
                int i9 = onExtraCallback + 21;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = w5a.onNavigationEvent(accessgettlsversionsasstringp, j, graphicDeviceInfoOnNavigationEvent2, getbacktracenote, accessgettlsversionsasstringp2, j2, graphicDeviceInfoOnNavigationEvent, getbacktracenote2, accessgettlsversionsasstringp3, j3, graphicDeviceInfoOnNavigationEvent3, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                int i11 = onExtraCallback + 41;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 4);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        int i8 = onExtraCallback + 17;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 5 / 2;
        }
    }

    private static final Unit onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote2, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp3, long j3, GraphicDeviceInfo graphicDeviceInfo3, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback;
            int i4 = i3 + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 45;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(147395214, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.CenterPreset.Row3.<anonymous> (CenterPreset.kt:1190)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onWarmupCompleted + 91;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            w3a w3aVar = w3a.onWarmupCompleted;
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, null, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp3, j3, graphicDeviceInfo3, null, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, 196608, 8);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1170911203, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1170911216, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{accessgettlsversionsasstringp, Long.valueOf(j), graphicDeviceInfo, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 323468816, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -323468814, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1261754993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1261755011, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit access100(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -469937253, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 469937265, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit writeTypedObject(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1320605436, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1320605432, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit ICustomTabsCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 860486083, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -860486083, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onUnminimized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1936393819, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1936393808, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit mayLaunchUrl(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1377311576, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1377311583, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(j), graphicDeviceInfo, getbacktracenote, accessgettlsversionsasstringp2, Long.valueOf(j2), graphicDeviceInfo2, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 660312003, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -660311993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit setEngagementSignalsCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -969811919, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 969811936, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit IEngagementSignalsCallbackDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -758984969, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 758984983, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit IEngagementSignalsCallback_Parcel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1239946899, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1239946879, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static final Unit IPostMessageService(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1563347587, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1563347571, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 789392640, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -789392637, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallback(@NotNull String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 312579794, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -312579788, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, str, str2, gethumanreadablename, gethumanreadablename2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1616849278, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1616849279, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onNavigationEvent(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1732372494, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1732372479, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void IAuthTabCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1819881793, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1819881798, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1546244693, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1546244714, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable getHumanReadableName gethumanreadablename, @Nullable getHumanReadableName gethumanreadablename2, @Nullable getHumanReadableName gethumanreadablename3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, str, str2, str3, gethumanreadablename, gethumanreadablename2, gethumanreadablename3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 62344002, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -62343993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void IAuthTabCallbackStub(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(new Object[]{this, getbacktracenote, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 734096600, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -734096592, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
