package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.R;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import o.w2ExternalSyntheticLambda0;
import o.w3b;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w2ExternalSyntheticLambda0 {
    private static int ITrustedWebActivityServiceDefault = 1;
    private static int ITrustedWebActivityServiceStub = 1;
    private static int getSmallIconId;
    private static int notifyNotificationWithChannel;
    public static final w2ExternalSyntheticLambda0 onNavigationEvent = new w2ExternalSyntheticLambda0();
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(589242755, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda1
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannelWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(1002390327, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda12
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = w2ExternalSyntheticLambda0.onExtraCallback((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            int i5 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1274971526, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda23
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit unit;
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (i3 != 0) {
                unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(1984727317, -1984727286, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
                int i4 = 85 / 0;
            } else {
                unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(1984727317, -1984727286, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
            }
            int i5 = onNavigationEvent + 7;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> cancelNotification = ForwardingCameraControl.onExtraCallbackWithResult(622853934, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda34
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-1168696086, 1168696122, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onExtraCallbackWithResult + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout = ForwardingCameraControl.onExtraCallbackWithResult(-268048837, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda45
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitICustomTabsCallbackStub = w2ExternalSyntheticLambda0.ICustomTabsCallbackStub((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitICustomTabsCallbackStub;
            }
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(1629776623, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda56
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            w3b w3bVar = (w3b) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
            if (i3 == 0) {
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(833186401, -833186367, new Object[]{w3bVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getSmallIconBitmap = ForwardingCameraControl.onExtraCallbackWithResult(738873852, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda67
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnPostMessage = w2ExternalSyntheticLambda0.onPostMessage((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnPostMessage;
            }
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000 = ForwardingCameraControl.onExtraCallbackWithResult(-1658267984, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda74
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            w3b w3bVar = (w3b) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return w2ExternalSyntheticLambda0.asInterface(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            Unit unitAsInterface = w2ExternalSyntheticLambda0.asInterface(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = 98 / 0;
            return unitAsInterface;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService = ForwardingCameraControl.onExtraCallbackWithResult(1745796541, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda75
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAccess000 = w2ExternalSyntheticLambda0.access000((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 47;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitAccess000;
            }
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-651345295, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda76
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            w3b w3bVar = (w3b) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                return w2ExternalSyntheticLambda0.onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(-1542248066, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda2
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                w2ExternalSyntheticLambda0.access100(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitAccess100 = w2ExternalSyntheticLambda0.access100(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitAccess100;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(355577394, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda3
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackStubProxy = w2ExternalSyntheticLambda0.IAuthTabCallbackStubProxy((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 65 / 0;
            }
            int i5 = IAuthTabCallback + 69;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return unitIAuthTabCallbackStubProxy;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSessionWithExtras = ForwardingCameraControl.onExtraCallbackWithResult(-85453334, false, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda4
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 != 0) {
                w2ExternalSyntheticLambda0.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = w2ExternalSyntheticLambda0.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1047345151, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda5
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitICustomTabsCallback_Parcel = w2ExternalSyntheticLambda0.ICustomTabsCallback_Parcel((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitICustomTabsCallback_Parcel;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-1516314735, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda6
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = w2ExternalSyntheticLambda0.IAuthTabCallback((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 0;
            }
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1881127722, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda7
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitAsInterface = w2ExternalSyntheticLambda0.asInterface((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitAsInterface;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage = ForwardingCameraControl.onExtraCallbackWithResult(-2122043718, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda8
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable = ForwardingCameraControl.onExtraCallbackWithResult(-702561207, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda9
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitExtraCommand = w2ExternalSyntheticLambda0.extraCommand((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            int i5 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unitExtraCommand;
            }
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized = ForwardingCameraControl.onExtraCallbackWithResult(-410765351, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda10
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                w2ExternalSyntheticLambda0.writeTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitWriteTypedObject = w2ExternalSyntheticLambda0.writeTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitWriteTypedObject;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> validateRelationship = ForwardingCameraControl.onExtraCallbackWithResult(1008717160, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda11
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                return w2ExternalSyntheticLambda0.getInterfaceDescriptor(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.getInterfaceDescriptor(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access200 = ForwardingCameraControl.onExtraCallbackWithResult(1300513016, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda13
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback_Parcel = w2ExternalSyntheticLambda0.IAuthTabCallback_Parcel((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback_Parcel;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-1574971769, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda14
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return w2ExternalSyntheticLambda0.onTransact(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            w2ExternalSyntheticLambda0.onTransact(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(2025348947, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda15
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(881916944, -881916943, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onExtraCallback + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-1283175913, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda16
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (i3 == 0) {
                return (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-397661673, 397661684, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
            }
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(136306598, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda17
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackStubProxy = w2ExternalSyntheticLambda0.IAuthTabCallbackStubProxy((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallbackStubProxy;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallback = ForwardingCameraControl.onExtraCallbackWithResult(428102454, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda18
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onWarmupCompleted = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                w2ExternalSyntheticLambda0.getInterfaceDescriptor(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                throw null;
            }
            Unit interfaceDescriptor = w2ExternalSyntheticLambda0.getInterfaceDescriptor(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onNavigationEvent + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return interfaceDescriptor;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onVerticalScrollEvent = ForwardingCameraControl.onExtraCallbackWithResult(1538618625, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda19
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnRelationshipValidationResult = w2ExternalSyntheticLambda0.onRelationshipValidationResult((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 != 0) {
                int i4 = 92 / 0;
            }
            int i5 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnRelationshipValidationResult;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-1804994415, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda20
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = w2ExternalSyntheticLambda0.onExtraCallback((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onSessionEnded = ForwardingCameraControl.onExtraCallbackWithResult(1646651844, false, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda21
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
            }
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(-2094505542, false, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda22
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = w2ExternalSyntheticLambda0.onNavigationEvent((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1019016418, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda24
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitICustomTabsCallbackDefault = w2ExternalSyntheticLambda0.ICustomTabsCallbackDefault((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
            int i5 = onWarmupCompleted + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return unitICustomTabsCallbackDefault;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1883473201, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda25
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitICustomTabsCallback = w2ExternalSyntheticLambda0.ICustomTabsCallback((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitICustomTabsCallback;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-1527578027, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda26
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return w2ExternalSyntheticLambda0.asBinder(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            w2ExternalSyntheticLambda0.asBinder(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> updateVisuals = ForwardingCameraControl.onExtraCallbackWithResult(1216555529, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda27
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj4 = null;
            w3b w3bVar = (w3b) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                w2ExternalSyntheticLambda0.asBinder(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                obj4.hashCode();
                throw null;
            }
            Unit unitAsBinder = w2ExternalSyntheticLambda0.asBinder(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitAsBinder;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized = ForwardingCameraControl.onExtraCallbackWithResult(-312961851, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda28
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(887061132, -887061097, new Object[]{(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
            return unit;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> requestPostMessageChannel = ForwardingCameraControl.onExtraCallbackWithResult(-9945570, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda29
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(795963776, -795963739, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return unit;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-1402095150, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda30
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj4 = null;
            w3b w3bVar = (w3b) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                w2ExternalSyntheticLambda0.onTransact(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                obj4.hashCode();
                throw null;
            }
            Unit unitOnTransact = w2ExternalSyntheticLambda0.onTransact(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onNavigationEvent + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnTransact;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-1296842610, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda31
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return w2ExternalSyntheticLambda0.asInterface(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            Unit unitAsInterface = w2ExternalSyntheticLambda0.asInterface(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = 95 / 0;
            return unitAsInterface;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100 = ForwardingCameraControl.onExtraCallbackWithResult(-1745587563, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda32
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                return w2ExternalSyntheticLambda0.onUnminimized(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.onUnminimized(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(428462409, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda33
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = w2ExternalSyntheticLambda0.IAuthTabCallbackDefault((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallbackDefault;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact = ForwardingCameraControl.onExtraCallbackWithResult(-1503061755, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda35
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                w2ExternalSyntheticLambda0.extraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitExtraCallbackWithResult = w2ExternalSyntheticLambda0.extraCallbackWithResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onNavigationEvent + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return unitExtraCallbackWithResult;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(314334934, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda36
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return w2ExternalSyntheticLambda0.onActivityResized(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            w2ExternalSyntheticLambda0.onActivityResized(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1806582390, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda37
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 7;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ITrustedWebActivityService = ForwardingCameraControl.onExtraCallbackWithResult(556860742, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda38
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                w2ExternalSyntheticLambda0.onMinimized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnMinimized = w2ExternalSyntheticLambda0.onMinimized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 76 / 0;
            }
            return unitOnMinimized;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedList = ForwardingCameraControl.onExtraCallbackWithResult(1390189435, false, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda39
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = w2ExternalSyntheticLambda0.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady = ForwardingCameraControl.onExtraCallbackWithResult(-242515498, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda40
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                w2ExternalSyntheticLambda0.IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitIAuthTabCallback = w2ExternalSyntheticLambda0.IAuthTabCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 53;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getActiveNotifications = ForwardingCameraControl.onExtraCallbackWithResult(972100678, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda41
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            IAuthTabCallback = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                return w2ExternalSyntheticLambda0.IAuthTabCallbackStubProxy(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            w2ExternalSyntheticLambda0.IAuthTabCallbackStubProxy(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(1042547031, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda42
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
            if (i3 != 0) {
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                throw null;
            }
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(737897305, -737897289, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-2037804089, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda43
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            Object obj4 = null;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                w2ExternalSyntheticLambda0.access100(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                obj4.hashCode();
                throw null;
            }
            Unit unitAccess100 = w2ExternalSyntheticLambda0.access100(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onExtraCallbackWithResult + 69;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unitAccess100;
            }
            obj4.hashCode();
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetch = ForwardingCameraControl.onExtraCallbackWithResult(-861896251, false, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda44
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (i3 == 0) {
                return w2ExternalSyntheticLambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> prefetchWithMultipleUrls = ForwardingCameraControl.onExtraCallbackWithResult(-998010055, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda46
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                w2ExternalSyntheticLambda0.ICustomTabsCallbackStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitICustomTabsCallbackStubProxy = w2ExternalSyntheticLambda0.ICustomTabsCallbackStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitICustomTabsCallbackStubProxy;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> receiveFile = ForwardingCameraControl.onExtraCallbackWithResult(-940027782, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda47
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback_Parcel = w2ExternalSyntheticLambda0.IAuthTabCallback_Parcel((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            int i5 = onExtraCallbackWithResult + 31;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return unitIAuthTabCallback_Parcel;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newSession = ForwardingCameraControl.onExtraCallbackWithResult(-882045509, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda48
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return w2ExternalSyntheticLambda0.ICustomTabsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            w2ExternalSyntheticLambda0.ICustomTabsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(-824063236, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda49
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                return w2ExternalSyntheticLambda0.extraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.extraCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsService = ForwardingCameraControl.onExtraCallbackWithResult(-766080963, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda50
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                w2ExternalSyntheticLambda0.onActivityLayout(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnActivityLayout = w2ExternalSyntheticLambda0.onActivityLayout(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnActivityLayout;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl = ForwardingCameraControl.onExtraCallbackWithResult(-708098690, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda51
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                w2ExternalSyntheticLambda0.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = w2ExternalSyntheticLambda0.onWarmupCompleted(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnWarmupCompleted;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(-650116417, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda52
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(444793372, -444793363, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return unit;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(-592134144, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda53
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (i3 != 0) {
                return (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(291166317, -291166293, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
            }
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult = ForwardingCameraControl.onExtraCallbackWithResult(-534151871, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda54
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-309618774, 309618777, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized = ForwardingCameraControl.onExtraCallbackWithResult(-476169598, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda55
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnMinimized = w2ExternalSyntheticLambda0.onMinimized((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnMinimized;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1006224066, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda57
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                return w2ExternalSyntheticLambda0.isEngagementSignalsApiAvailable(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.isEngagementSignalsApiAvailable(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> setEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(-948241793, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda58
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = w2ExternalSyntheticLambda0.onNavigationEvent((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> newAuthTabSession = ForwardingCameraControl.onExtraCallbackWithResult(-890259520, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda59
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackStub = w2ExternalSyntheticLambda0.IAuthTabCallbackStub((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallbackStub;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> postMessage = ForwardingCameraControl.onExtraCallbackWithResult(-832277247, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda60
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            Object obj4 = null;
            w5a w5aVar = (w5a) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                obj4.hashCode();
                throw null;
            }
            Object[] objArr2 = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(1252132168, -1252132168, objArr2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i3 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCommand = ForwardingCameraControl.onExtraCallbackWithResult(-774294974, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda61
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitWriteTypedObject = w2ExternalSyntheticLambda0.writeTypedObject((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 33;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unitWriteTypedObject;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageService_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(2130691981, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda62
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnTransact = w2ExternalSyntheticLambda0.onTransact((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnTransact;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(2017081486, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda63
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return w2ExternalSyntheticLambda0.onPostMessage(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            Unit unitOnPostMessage = w2ExternalSyntheticLambda0.onPostMessage(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = 27 / 0;
            return unitOnPostMessage;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(1903470991, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda64
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj4 = null;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                w2ExternalSyntheticLambda0.onWarmupCompleted(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitOnWarmupCompleted = w2ExternalSyntheticLambda0.onWarmupCompleted(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = IAuthTabCallback + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IPostMessageServiceStub = ForwardingCameraControl.onExtraCallbackWithResult(1789860496, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda65
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackStub = w2ExternalSyntheticLambda0.IAuthTabCallbackStub((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return unitIAuthTabCallbackStub;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onGreatestScrollPercentageIncreased = ForwardingCameraControl.onExtraCallbackWithResult(1676250001, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda66
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                w2ExternalSyntheticLambda0.IAuthTabCallbackDefault(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            Unit unitIAuthTabCallbackDefault = w2ExternalSyntheticLambda0.IAuthTabCallbackDefault(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i3 = onWarmupCompleted + 7;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return unitIAuthTabCallbackDefault;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(1562639506, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda68
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = w2ExternalSyntheticLambda0.onNavigationEvent((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1449029011, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda69
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(465846647, -465846637, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
            int i4 = onExtraCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IEngagementSignalsCallback = ForwardingCameraControl.onExtraCallbackWithResult(1335418516, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda70
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 == 0) {
                return w2ExternalSyntheticLambda0.readTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            w2ExternalSyntheticLambda0.readTypedObject(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> warmup = ForwardingCameraControl.onExtraCallbackWithResult(1221808021, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda71
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnActivityResized = w2ExternalSyntheticLambda0.onActivityResized((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnActivityResized;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsServiceDefault = ForwardingCameraControl.onExtraCallbackWithResult(1108197526, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda72
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {(RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
            if (i3 == 0) {
                return (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-1563433091, 1563433096, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
            }
            int i4 = 52 / 0;
            return (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-1563433091, 1563433096, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> areNotificationsEnabled = ForwardingCameraControl.onExtraCallbackWithResult(705709952, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda73
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallbackDefault = w2ExternalSyntheticLambda0.IAuthTabCallbackDefault((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = IAuthTabCallback + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return unitIAuthTabCallbackDefault;
        }
    });

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        w3b w3bVar = (w3b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            access000(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitAccess000 = access000(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit IAuthTabCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 75;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            requestPostMessageChannelWithExtras(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 101;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 103;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        if (i4 != 0) {
            return (Unit) onNavigationEvent(-356595273, 356595288, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
        }
        int i5 = 40 / 0;
        return (Unit) onNavigationEvent(-356595273, 356595288, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 13;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsServiceStubProxy = ICustomTabsServiceStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 93;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsServiceStubProxy;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(120876085, -120876057, new Object[]{rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i3 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 71;
        ITrustedWebActivityServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ICustomTabsService(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsService = ICustomTabsService(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 39;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsService;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unitExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 53;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit engagementSignalsCallback = setEngagementSignalsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 57;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return engagementSignalsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return isEngagementSignalsApiAvailable(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        isEngagementSignalsApiAvailable(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(991072860, -991072833, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = ITrustedWebActivityServiceDefault + 123;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 79;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsService();
        }
        ICustomTabsService();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 37;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitNewAuthTabSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 39;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        if (i4 != 0) {
            return (Unit) onNavigationEvent(12650118, -12650093, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
        }
        int i5 = 49 / 0;
        return (Unit) onNavigationEvent(12650118, -12650093, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 19;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            postMessage(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitPostMessage = postMessage(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unitPostMessage;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 17;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitICustomTabsCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 95;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitITrustedWebActivityCallback = ITrustedWebActivityCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 15;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitITrustedWebActivityCallback;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 31;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            receiveFile(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitReceiveFile = receiveFile(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 101;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitReceiveFile;
    }

    public static /* synthetic */ Unit ICustomTabsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 121;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitITrustedWebActivityCallbackDefault = ITrustedWebActivityCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return unitITrustedWebActivityCallbackDefault;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 85;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            updateVisuals(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitUpdateVisuals = updateVisuals(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 23;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unitUpdateVisuals;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 69;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(-1536979100, 1536979132, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = getSmallIconId + 75;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 29;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(-1421082336, 1421082358, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = ITrustedWebActivityServiceDefault + 111;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit ICustomTabsCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsServiceDefault = ICustomTabsServiceDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 7;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsServiceDefault;
    }

    public static /* synthetic */ Unit access000(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        return unitRequestPostMessageChannelWithExtras;
    }

    public static /* synthetic */ Unit access100(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 75;
        getSmallIconId = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            prefetchWithMultipleUrls(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitPrefetchWithMultipleUrls = prefetchWithMultipleUrls(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitPrefetchWithMultipleUrls;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit access100(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 89;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess200 = access200(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 35;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess200;
    }

    public static /* synthetic */ Unit asBinder(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 37;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return access100(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        access100(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit asBinder(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 59;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return IEngagementSignalsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IEngagementSignalsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnSessionEnded = onSessionEnded(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        int i5 = getSmallIconId + 57;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnSessionEnded;
    }

    public static /* synthetic */ Unit asInterface(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 57;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(-774113226, 774113256, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = getSmallIconId + 121;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit asInterface(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 53;
        getSmallIconId = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            extraCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallback = extraCallback(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 1;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 45;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return requestPostMessageChannel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        requestPostMessageChannel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 87;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onGreatestScrollPercentageIncreased;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit extraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 63;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(30628447, -30628433, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i4 = getSmallIconId + 49;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit extraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 39;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitRequestPostMessageChannel = requestPostMessageChannel(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 60 / 0;
        }
        int i6 = getSmallIconId + 111;
        ITrustedWebActivityServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitRequestPostMessageChannel;
    }

    public static /* synthetic */ Unit extraCommand(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 33;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIPostMessageServiceStub = IPostMessageServiceStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        return unitIPostMessageServiceStub;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 83;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewSessionWithExtras = newSessionWithExtras(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 45;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitNewSessionWithExtras;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 87;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewAuthTabSession = newAuthTabSession(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 67;
        getSmallIconId = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return unitNewAuthTabSession;
    }

    public static /* synthetic */ Unit isEngagementSignalsApiAvailable(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 99;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsServiceStub = ICustomTabsServiceStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 26 / 0;
        }
        return unitICustomTabsServiceStub;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId + 41;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IEngagementSignalsCallback;
        int i4 = i3 + 41;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onActivityLayout(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 91;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return (Unit) onNavigationEvent(-890775621, 890775628, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        }
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 43 / 0;
        return (Unit) onNavigationEvent(-890775621, 890775628, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitUpdateVisuals = updateVisuals(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = getSmallIconId + 45;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitUpdateVisuals;
    }

    public static /* synthetic */ Unit onActivityResized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 7;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            onRelationshipValidationResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnRelationshipValidationResult = onRelationshipValidationResult(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 29;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnRelationshipValidationResult;
    }

    public static /* synthetic */ Unit onActivityResized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 115;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted3 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted4 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        if (i4 == 0) {
            return (Unit) onNavigationEvent(1339902313, -1339902309, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted4, iOnWarmupCompleted3);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 85;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(1349488297, -1349488274, new Object[]{rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i3 = getSmallIconId + 125;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(1959680361, -1959680343, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = getSmallIconId + 21;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 85;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        asBinder(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 89;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 113;
        getSmallIconId = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(w5aVar, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(w5aVar, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = ITrustedWebActivityServiceDefault + 45;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 91;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCommand();
        }
        extraCommand();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 95;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return ICustomTabsServiceStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ICustomTabsServiceStub(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 119;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 107;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return onMessageChannelReady(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onMessageChannelReady(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 83;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w5aVar, audioRestrictionControllerImplExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = ITrustedWebActivityServiceDefault + 25;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 119;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) onNavigationEvent(1215113976, -1215113964, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = getSmallIconId + 31;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 95;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return validateRelationship(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        validateRelationship(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 9;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IEngagementSignalsCallback_Parcel;
        int i5 = i2 + 65;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onMinimized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 35;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitPostMessage = postMessage(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 27;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return unitPostMessage;
    }

    public static /* synthetic */ Unit onMinimized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIEngagementSignalsCallbackStub = IEngagementSignalsCallbackStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 2 / 0;
        }
        return unitIEngagementSignalsCallbackStub;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 81;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = ITrustedWebActivityServiceDefault + 43;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return unitOnGreatestScrollPercentageIncreased;
    }

    public static /* synthetic */ Unit onNavigationEvent(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 101;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackDefault = ICustomTabsCallbackDefault(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 17 / 0;
        }
        int i6 = ITrustedWebActivityServiceDefault + 109;
        getSmallIconId = i6 % 128;
        if (i6 % 2 == 0) {
            return unitICustomTabsCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 17;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = asInterface(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 77;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 65;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIPostMessageServiceStubProxy = IPostMessageServiceStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 29;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitIPostMessageServiceStubProxy;
    }

    public static /* synthetic */ Unit onPostMessage(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 95;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return extraCommand(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        extraCommand(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onPostMessage(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 61;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWarmup = warmup(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        int i6 = ITrustedWebActivityServiceDefault + 61;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
        return unitWarmup;
    }

    public static /* synthetic */ Unit onRelationshipValidationResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 97;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitNewSession = newSession(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        int i6 = getSmallIconId + 47;
        ITrustedWebActivityServiceDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 46 / 0;
        }
        return unitNewSession;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 7;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = prefetchWithMultipleUrls;
        int i5 = i3 + 71;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onTransact(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 73;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return mayLaunchUrl(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        mayLaunchUrl(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(242158343, -242158322, new Object[]{w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i4 = ITrustedWebActivityServiceDefault + 99;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 17;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsService_Parcel = ICustomTabsService_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i6 % 128;
        if (i6 % 2 == 0) {
            return unitICustomTabsService_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onUnminimized(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 75;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedList = writeTypedList(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        int i6 = ITrustedWebActivityServiceDefault + 77;
        getSmallIconId = i6 % 128;
        int i7 = i6 % 2;
        return unitWriteTypedList;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 19;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unitITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        int i5 = getSmallIconId + 105;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitITrustedWebActivityCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        Unit unitICustomTabsCallback_Parcel;
        int i = 2 % 2;
        int i2 = getSmallIconId + 111;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            int i3 = 75 / 0;
        } else {
            unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        }
        int i4 = getSmallIconId + 117;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 77;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            ICustomTabsCallback_Parcel(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = getSmallIconId + 19;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitICustomTabsCallback_Parcel;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 43;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(564198524, -564198498, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        int i5 = getSmallIconId + 3;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 111;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return onMinimized(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onMinimized(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 89;
        getSmallIconId = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IEngagementSignalsCallbackStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = ITrustedWebActivityServiceDefault + 31;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIEngagementSignalsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit readTypedObject(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 83;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = getSmallIconId + 103;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = getSmallIconId + 29;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onVerticalScrollEvent(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnVerticalScrollEvent = onVerticalScrollEvent(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = getSmallIconId + 123;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnVerticalScrollEvent;
    }

    public static /* synthetic */ Unit writeTypedObject(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 39;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Unit unitValidateRelationship = validateRelationship(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return unitValidateRelationship;
    }

    public static /* synthetic */ Unit writeTypedObject(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 55;
        getSmallIconId = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onNavigationEvent(-2010404840, 2010404842, new Object[]{w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
        }
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int i4 = 49 / 0;
        return (Unit) onNavigationEvent(-2010404840, 2010404842, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 119;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        if (i2 % 2 != 0) {
            getbacktracenote = onExtraCallbackWithResult;
            int i4 = 5 / 0;
        } else {
            getbacktracenote = onExtraCallbackWithResult;
        }
        int i5 = i3 + 59;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 99;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = mayLaunchUrl;
        int i5 = i3 + 9;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 115;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallbackStubProxy;
        int i5 = i2 + 5;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 117;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = newSessionWithExtras;
        int i5 = i3 + 37;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 51;
        getSmallIconId = i2 % 128;
        if (i2 % 2 == 0) {
            return postMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 103;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = prefetch;
        int i5 = i2 + 7;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 27;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IPostMessageServiceStub;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 101;
        ITrustedWebActivityServiceDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IPostMessageServiceDefault;
        int i4 = i2 + 67;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault;
        int i3 = i2 + 95;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsService;
        int i5 = i2 + 101;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 123;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = extraCommand;
        int i5 = i3 + 53;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 19;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallbackDefault;
        int i5 = i3 + 31;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 105;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onRelationshipValidationResult;
        int i5 = i3 + 121;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault;
        int i3 = i2 + 95;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = setEngagementSignalsCallback;
        int i5 = i2 + 7;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 71;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = receiveFile;
        int i4 = i3 + 99;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = ICustomTabsCallback_Parcel;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 3;
        int i3 = i2 % 128;
        getSmallIconId = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = areNotificationsEnabled;
        int i5 = i3 + 29;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 105;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IPostMessageService_Parcel;
        int i4 = i2 + 49;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityLayout() {
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault;
        int i3 = i2 + 93;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = ICustomTabsServiceDefault;
            int i4 = 54 / 0;
        } else {
            getbacktracenote = ICustomTabsServiceDefault;
        }
        int i5 = i2 + 77;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMinimized() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 99;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsServiceStubProxy;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 23;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = readTypedObject;
        int i5 = i3 + 79;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onPostMessage() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 3;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = warmup;
        int i5 = i3 + 19;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 23;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IEngagementSignalsCallbackStub;
        int i5 = i2 + 23;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> readTypedObject() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 103;
        int i3 = i2 % 128;
        ITrustedWebActivityServiceDefault = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = newSession;
        int i5 = i3 + 25;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject() {
        int i = 2 % 2;
        int i2 = getSmallIconId;
        int i3 = i2 + 27;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = newAuthTabSession;
        int i5 = i2 + 9;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback_Parcel(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 49;
        getSmallIconId = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 104) == 0) {
                int i5 = ITrustedWebActivityServiceDefault + 109;
                getSmallIconId = i5 % 128;
                if (i5 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                    obj.hashCode();
                    throw null;
                }
                int i6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
                int i7 = getSmallIconId + 23;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                i2 = i | i6;
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i9 = getSmallIconId + 117;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityServiceDefault + 71;
                getSmallIconId = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1002390327, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1002390327.<anonymous> (TdsListRowV1.kt:1033)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1002390327, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1002390327.<anonymous> (TdsListRowV1.kt:1033)");
            }
            int i12 = R.drawable.icon_search_mono;
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
            handleNativeAdClick.onExtraCallback.IAuthTabCallback.C0035onExtraCallback c0035onExtraCallback = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion;
            w3bVar.onNavigationEvent(Integer.valueOf(i12), deprecated_eventlistenerfactory, c0035onExtraCallback.onExtraCallback(), w3bVar.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, c0035onExtraCallback.onExtraCallback()), 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 2032);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static {
        int i = ITrustedWebActivityServiceStub + 31;
        notifyNotificationWithChannel = i % 128;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        boolean z = true;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = getSmallIconId + 3;
            int i3 = i2 % 128;
            ITrustedWebActivityServiceDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 35;
            getSmallIconId = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            }
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(589242755, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$589242755.<anonymous> (TdsListRowV1.kt:1042)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 71;
                getSmallIconId = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 72 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = ITrustedWebActivityServiceDefault + 27;
            getSmallIconId = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 3 / 4;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 117;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 75) == 0) {
                int i5 = getSmallIconId + 57;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i7 = getSmallIconId + 3;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(622853934, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$622853934.<anonymous> (TdsListRowV1.kt:1050)");
            }
            w3bVar.onNavigationEvent(Integer.valueOf(R.drawable.icon_search_mono), deprecated_eventListenerFactory.Icon, handleNativeAdClick.onExtraCallback.asInterface.Companion.onNavigationEvent(), null, 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 2040);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = getSmallIconId + 9;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit validateRelationship(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = ITrustedWebActivityServiceDefault + 107;
        getSmallIconId = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i2 & 19) == 18), i2 & 1))) {
            int i7 = ITrustedWebActivityServiceDefault + 105;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 51;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1274971526, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1274971526.<anonymous> (TdsListRowV1.kt:1057)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1274971526, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1274971526.<anonymous> (TdsListRowV1.kt:1057)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 65;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = ITrustedWebActivityServiceDefault + 123;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i3 = ITrustedWebActivityServiceDefault + 39;
        getSmallIconId = i3 % 128;
        int i12 = i3 % 2;
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 59;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = getSmallIconId + 39;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 13;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1629776623, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1629776623.<anonymous> (TdsListRowV1.kt:1065)");
            }
            int i9 = R.drawable.icon_search_mono;
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
            handleNativeAdClick.onExtraCallback.IAuthTabCallback.C0035onExtraCallback c0035onExtraCallback = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion;
            w3bVar.onNavigationEvent(Integer.valueOf(i9), deprecated_eventlistenerfactory, c0035onExtraCallback.onNavigationEvent(), w3bVar.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, c0035onExtraCallback.onNavigationEvent()), 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 2032);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = ITrustedWebActivityServiceDefault + 9;
        getSmallIconId = i10 % 128;
        int i11 = i10 % 2;
        return unit;
    }

    private static final Unit extraCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i5 = ITrustedWebActivityServiceDefault + 61;
                getSmallIconId = i5 % 128;
                i3 = i5 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 63;
                getSmallIconId = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1658267984, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1658267984.<anonymous> (TdsListRowV1.kt:1081)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1658267984, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1658267984.<anonymous> (TdsListRowV1.kt:1081)");
            }
            w3bVar.onNavigationEvent(Integer.valueOf(R.drawable.icon_search_mono), deprecated_eventListenerFactory.Icon, handleNativeAdClick.onExtraCallback.asInterface.Companion.onWarmupCompleted(), null, 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 2040);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit warmup(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 115;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            int i6 = getSmallIconId + 91;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i8 = getSmallIconId + 113;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(738873852, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$738873852.<anonymous> (TdsListRowV1.kt:1088)");
                int i9 = ITrustedWebActivityServiceDefault + 17;
                getSmallIconId = i9 % 128;
                int i10 = i9 % 2;
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onMinimized(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 99;
            getSmallIconId = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i5 = getSmallIconId + 105;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-651345295, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-651345295.<anonymous> (TdsListRowV1.kt:1096)");
            }
            int i7 = R.drawable.icon_search_mono;
            deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Icon;
            handleNativeAdClick.onExtraCallback.IAuthTabCallback.C0035onExtraCallback c0035onExtraCallback = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion;
            w3bVar.onNavigationEvent(Integer.valueOf(i7), deprecated_eventlistenerfactory, c0035onExtraCallback.onExtraCallbackWithResult(), w3bVar.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, c0035onExtraCallback.onExtraCallbackWithResult()), 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i2 << 3) & 112, 2032);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit requestPostMessageChannelWithExtras(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 51;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i6 = getSmallIconId + 97;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1745796541, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1745796541.<anonymous> (TdsListRowV1.kt:1104)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = ITrustedWebActivityServiceDefault + 115;
        getSmallIconId = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 68 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        w3b w3bVar = (w3b) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 5;
        getSmallIconId = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 45) == 0) {
                int i3 = ITrustedWebActivityServiceDefault + 47;
                getSmallIconId = i3 % 128;
                int i4 = i3 % 2;
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        int i5 = iIntValue;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i5 & 19) != 18, i5 & 1)) {
            int i6 = getSmallIconId + 101;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 18 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = ITrustedWebActivityServiceDefault + 15;
                    getSmallIconId = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(355577394, i5, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$355577394.<anonymous> (TdsListRowV1.kt:1112)");
                }
                w3bVar.onNavigationEvent(Integer.valueOf(R.drawable.icon_search_mono), deprecated_eventListenerFactory.Icon, handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback(), null, 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i5 << 3) & 112, 2040);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = getSmallIconId + 21;
                    ITrustedWebActivityServiceDefault = i10 % 128;
                    int i11 = i10 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = getSmallIconId + 55;
                    ITrustedWebActivityServiceDefault = i12 % 128;
                    int i13 = i12 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3bVar.onNavigationEvent(Integer.valueOf(R.drawable.icon_search_mono), deprecated_eventListenerFactory.Icon, handleNativeAdClick.onExtraCallback.asInterface.Companion.onExtraCallback(), null, 0L, 0, 0.0f, 0L, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 432, (i5 << 3) & 112, 2040);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access200(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 65;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = getSmallIconId + 9;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1542248066, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1542248066.<anonymous> (TdsListRowV1.kt:1119)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = getSmallIconId + 79;
                ITrustedWebActivityServiceDefault = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 2;
            } else {
                int i5 = getSmallIconId + 53;
                int i6 = i5 % 128;
                ITrustedWebActivityServiceDefault = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 17;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            }
            i2 = i | i3;
            int i10 = getSmallIconId + 47;
            ITrustedWebActivityServiceDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1047345151, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1047345151.<anonymous> (TdsListRowV1.kt:1137)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = ITrustedWebActivityServiceDefault + 71;
            getSmallIconId = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCommand() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 65;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    private static final Unit requestPostMessageChannelWithExtras(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = getSmallIconId + 51;
        ITrustedWebActivityServiceDefault = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i8 = ITrustedWebActivityServiceDefault + 53;
            getSmallIconId = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                i4 = 4;
            } else {
                int i9 = getSmallIconId + 119;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i11 = ITrustedWebActivityServiceDefault + 7;
            getSmallIconId = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1516314735, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1516314735.<anonymous> (TdsListRowV1.kt:1144)");
            }
            int i13 = R.drawable.icon_check_mono;
            setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedIAuthTabCallback = setViewableMRC50Requests.onWarmupCompleted.Companion.IAuthTabCallback();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda80
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i14 = 2 % 2;
                        int i15 = onWarmupCompleted + 55;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult();
                        int i17 = onExtraCallbackWithResult + 73;
                        onWarmupCompleted = i17 % 128;
                        int i18 = i17 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            rightPreset.IAuthTabCallback(Integer.valueOf(i13), (Function0) objOnMinimized, "체크", null, onwarmupcompletedIAuthTabCallback, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 25008, 104);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                i3 = getSmallIconId + 7;
                ITrustedWebActivityServiceDefault = i3 % 128;
            }
            return Unit.INSTANCE;
        }
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        i3 = ITrustedWebActivityServiceDefault + 77;
        getSmallIconId = i3 % 128;
        int i14 = i3 % 2;
        return Unit.INSTANCE;
    }

    private static final Unit requestPostMessageChannel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 125;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = ITrustedWebActivityServiceDefault + 37;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1881127722, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1881127722.<anonymous> (TdsListRowV1.kt:1155)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsServiceStub(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 85;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
            int i5 = getSmallIconId + 69;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i7 = ITrustedWebActivityServiceDefault + 29;
            getSmallIconId = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2122043718, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-2122043718.<anonymous> (TdsListRowV1.kt:1161)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, "Right Row2A", null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 6) & 896) | 6), 2}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1798077257, 1798077258, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IPostMessageServiceStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = ITrustedWebActivityServiceDefault + 63;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-702561207, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-702561207.<anonymous> (TdsListRowV1.kt:1168)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = ITrustedWebActivityServiceDefault + 57;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit validateRelationship(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 17;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = getSmallIconId + 47;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = ITrustedWebActivityServiceDefault + 113;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 71;
                getSmallIconId = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-410765351, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-410765351.<anonymous> (TdsListRowV1.kt:1174)");
                    int i10 = 25 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-410765351, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-410765351.<anonymous> (TdsListRowV1.kt:1174)");
                }
            }
            rightPreset.IAuthTabCallback("Right Row2A", "Right Row2A", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = ITrustedWebActivityServiceDefault + 117;
                getSmallIconId = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i12 = 12 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newAuthTabSession(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 117;
        ITrustedWebActivityServiceDefault = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i7 = ITrustedWebActivityServiceDefault + 1;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i9 = ITrustedWebActivityServiceDefault + 77;
            getSmallIconId = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = getSmallIconId + 95;
                ITrustedWebActivityServiceDefault = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1008717160, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1008717160.<anonymous> (TdsListRowV1.kt:1182)");
                    int i12 = 91 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1008717160, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1008717160.<anonymous> (TdsListRowV1.kt:1182)");
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = getSmallIconId + 35;
                ITrustedWebActivityServiceDefault = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i15 = ITrustedWebActivityServiceDefault + 69;
                getSmallIconId = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getSmallIconId + 91;
        ITrustedWebActivityServiceDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 117;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallbackStub(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 65;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = ITrustedWebActivityServiceDefault + 87;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1300513016, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1300513016.<anonymous> (TdsListRowV1.kt:1188)");
            }
            int i8 = R.drawable.icon_check_mono;
            setViewableMRC50Requests.onWarmupCompleted onWarmupCompleted2 = setViewableMRC50Requests.onWarmupCompleted.Companion.onWarmupCompleted();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda78
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onNavigationEvent + 119;
                        onWarmupCompleted = i10 % 128;
                        if (i10 % 2 != 0) {
                            return w2ExternalSyntheticLambda0.onWarmupCompleted();
                        }
                        w2ExternalSyntheticLambda0.onWarmupCompleted();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            rightPreset.IAuthTabCallback(Integer.valueOf(i8), (Function0) objOnMinimized, "체크", null, onWarmupCompleted2, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 25008, 104);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 97;
                getSmallIconId = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 6 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = ITrustedWebActivityServiceDefault + 25;
            getSmallIconId = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 67;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 17) != 16) {
            int i5 = ITrustedWebActivityServiceDefault + 75;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = ITrustedWebActivityServiceDefault + 99;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 67;
                getSmallIconId = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2025348947, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$2025348947.<anonymous> (TdsListRowV1.kt:1200)");
                    int i10 = 54 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2025348947, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$2025348947.<anonymous> (TdsListRowV1.kt:1200)");
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsService_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 79;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 65) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = getSmallIconId + 71;
            ITrustedWebActivityServiceDefault = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1574971769, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1574971769.<anonymous> (TdsListRowV1.kt:1202)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsService() {
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 99;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ITrustedWebActivityServiceDefault + 85;
        getSmallIconId = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            int i2 = ITrustedWebActivityServiceDefault + 109;
            getSmallIconId = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ^ true ? 2 : 4;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = ITrustedWebActivityServiceDefault + 75;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1283175913, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1283175913.<anonymous> (TdsListRowV1.kt:1208)");
                int i6 = getSmallIconId + 27;
                ITrustedWebActivityServiceDefault = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = R.drawable.icon_check_mono;
            setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallback = setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallback();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                Object obj2 = new Function0() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 89;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                        Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(-219327811, 219327828, new Object[0], DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                        int i12 = onWarmupCompleted + 117;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(obj2);
                obj = obj2;
            }
            rightPreset.IAuthTabCallback(Integer.valueOf(i8), (Function0) obj, "체크", null, onwarmupcompletedOnExtraCallback, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 21) & 29360128) | 25008, 104);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 117;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit postMessage(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 61;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(true ^ ((i2 & 19) == 18), i2 & 1)) {
            int i6 = ITrustedWebActivityServiceDefault + 95;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = getSmallIconId + 91;
                ITrustedWebActivityServiceDefault = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(136306598, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$136306598.<anonymous> (TdsListRowV1.kt:1219)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = ITrustedWebActivityServiceDefault + 35;
            getSmallIconId = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit newSessionWithExtras(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 45;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i6 = ITrustedWebActivityServiceDefault + 13;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i8 = getSmallIconId + 117;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(428102454, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$428102454.<anonymous> (TdsListRowV1.kt:1225)");
            }
            rightPreset.onNavigationEvent("Right Row1E", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = ITrustedWebActivityServiceDefault + 99;
        getSmallIconId = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit newSession(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 111;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = getSmallIconId + 89;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = ITrustedWebActivityServiceDefault + 37;
                getSmallIconId = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1538618625, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1538618625.<anonymous> (TdsListRowV1.kt:1233)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1538618625, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1538618625.<anonymous> (TdsListRowV1.kt:1233)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Center Row2A", "Center Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        int i;
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 49;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = getSmallIconId + 67;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 19;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1804994415, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1804994415.<anonymous> (TdsListRowV1.kt:1239)");
            }
            rightPreset.IAuthTabCallback("Right Row1E", ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, "component-id-override-test"), null, null, null, null, null, false, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, (iIntValue << 3) & 112, 2044);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = getSmallIconId + 81;
        ITrustedWebActivityServiceDefault = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 74 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = ITrustedWebActivityServiceDefault;
            int i4 = i3 + 59;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 13;
            getSmallIconId = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 119;
            getSmallIconId = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 65;
                getSmallIconId = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1646651844, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1646651844.<anonymous> (TdsListRowV1.kt:1231)");
            }
            w4.onExtraCallbackWithResult(onVerticalScrollEvent, null, null, null, null, writeTypedObject, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = getSmallIconId + 31;
                ITrustedWebActivityServiceDefault = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asInterface(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = getSmallIconId + 45;
                ITrustedWebActivityServiceDefault = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094505542, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-2094505542.<anonymous> (TdsListRowV1.kt:1134)");
                int i5 = ITrustedWebActivityServiceDefault + 5;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = Camera2CameraImplExternalSyntheticLambda4.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResult, 0, 1), Camera2CameraImplExternalSyntheticLambda10.Vertical, false, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 60, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            w4.onExtraCallbackWithResult(onWarmupCompleted, null, null, null, null, asBinder, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            w4.onExtraCallbackWithResult(IEngagementSignalsCallbackStubProxy, null, null, null, null, onPostMessage, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            w4.onExtraCallbackWithResult(isEngagementSignalsApiAvailable, null, null, null, null, onActivityResized, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            w4.onExtraCallbackWithResult(validateRelationship, null, null, null, null, access200, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            w4.onExtraCallbackWithResult(IAuthTabCallbackStubProxy, null, ITrustedWebActivityCallbackDefault, null, null, IAuthTabCallbackStub, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
            w4.onExtraCallbackWithResult(ICustomTabsService_Parcel, null, null, null, null, ITrustedWebActivityCallback, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), 1.5f)), onSessionEnded, cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 55;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit updateVisuals(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 81;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 105) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = ITrustedWebActivityServiceDefault + 119;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = getSmallIconId + 93;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1019016418, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1019016418.<anonymous> (TdsListRowV1.kt:1259)");
                int i9 = getSmallIconId + 67;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
            }
            w5aVar.onExtraCallbackWithResult("해외주식", new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, 6 | ((i2 << 6) & 896), 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit receiveFile(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = ITrustedWebActivityServiceDefault + 5;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = ITrustedWebActivityServiceDefault + 89;
            getSmallIconId = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 2;
            }
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = getSmallIconId + 39;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1883473201, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1883473201.<anonymous> (TdsListRowV1.kt:1268)");
            }
            rightPreset.onWarmupCompleted("$1495.6", "+89.3%", new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), new getHumanReadableName(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().IEngagementSignalsCallbackStub(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 48, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = getSmallIconId + 71;
        ITrustedWebActivityServiceDefault = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                i3 = 4;
            } else {
                int i5 = getSmallIconId + 41;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
            int i7 = ITrustedWebActivityServiceDefault + 71;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1216555529, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1216555529.<anonymous> (TdsListRowV1.kt:1285)");
            }
            int i9 = R.drawable.icon_search_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w3bVar.onExtraCallbackWithResult(Integer.valueOf(i9), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 78);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 41;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i2 = 4;
            } else {
                int i6 = ITrustedWebActivityServiceDefault + 79;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i8 = getSmallIconId + 105;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 101;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1527578027, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1527578027.<anonymous> (TdsListRowV1.kt:1292)");
            }
            w5aVar.IAuthTabCallback("노보노디스크(ADR)", "24.367718주", null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit updateVisuals(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        boolean z = true;
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset))) {
                int i5 = getSmallIconId + 9;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = getSmallIconId + 65;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 103;
                ITrustedWebActivityServiceDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-312961851, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-312961851.<anonymous> (TdsListRowV1.kt:1298)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-312961851, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-312961851.<anonymous> (TdsListRowV1.kt:1298)");
            }
            rightPreset.onWarmupCompleted("$3,314.98", "오늘 +16.29 (0.7%)", (getHumanReadableName) null, new getHumanReadableName(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().IEngagementSignalsCallbackStub(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 12) & 57344) | 54, 4);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = ITrustedWebActivityServiceDefault + 121;
                getSmallIconId = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = 97 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        boolean z;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 105;
        ITrustedWebActivityServiceDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((iIntValue & 25) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i4 = getSmallIconId + 97;
                    ITrustedWebActivityServiceDefault = i4 % 128;
                    int i5 = i4 % 2;
                    i = 4;
                } else {
                    int i6 = ITrustedWebActivityServiceDefault + 5;
                    getSmallIconId = i6 % 128;
                    int i7 = i6 % 2;
                    i = 2;
                }
                iIntValue |= i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            int i8 = ITrustedWebActivityServiceDefault + 105;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 51;
                ITrustedWebActivityServiceDefault = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-9945570, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-9945570.<anonymous> (TdsListRowV1.kt:1320)");
                    int i11 = 86 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-9945570, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-9945570.<anonymous> (TdsListRowV1.kt:1320)");
                }
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "겹침 테스트", "right 내려가면", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = getSmallIconId + 13;
                ITrustedWebActivityServiceDefault = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) throws NoWhenBranchMatchedException {
        boolean z = false;
        RightPreset rightPreset = (RightPreset) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = ITrustedWebActivityServiceDefault + 27;
        getSmallIconId = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 33;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = ITrustedWebActivityServiceDefault + 17;
            getSmallIconId = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
            }
        } else {
            int i7 = ITrustedWebActivityServiceDefault + 67;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = ITrustedWebActivityServiceDefault + 75;
                getSmallIconId = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1296842610, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1296842610.<anonymous> (TdsListRowV1.kt:1326)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1296842610, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1296842610.<anonymous> (TdsListRowV1.kt:1326)");
            }
            rightPreset.IAuthTabCallback("왼쪽 정렬로", "200원", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 3;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(428462409, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$428462409.<anonymous> (TdsListRowV1.kt:1334)");
            }
            int i6 = R.drawable.icon_search_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w3bVar.onExtraCallbackWithResult(Integer.valueOf(i6), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 78);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 91;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = ITrustedWebActivityServiceDefault + 5;
            getSmallIconId = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit writeTypedList(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = getSmallIconId + 93;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 57;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1745587563, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1745587563.<anonymous> (TdsListRowV1.kt:1341)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1745587563, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1745587563.<anonymous> (TdsListRowV1.kt:1341)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "토스포인트 사용", "160,924P", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit requestPostMessageChannel(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 43;
        ITrustedWebActivityServiceDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i6 = getSmallIconId + 75;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            i2 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i7 = ITrustedWebActivityServiceDefault + 5;
            getSmallIconId = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 73 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1503061755, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1503061755.<anonymous> (TdsListRowV1.kt:1347)");
                }
                rightPreset.onNavigationEvent(true, (QuirksExternalSyntheticBackport0) null, (Function1<? super Boolean, Unit>) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 6, 62);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                rightPreset.onNavigationEvent(true, (QuirksExternalSyntheticBackport0) null, (Function1<? super Boolean, Unit>) null, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (AppLovinVastMediaViewb) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 6, 62);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onMessageChannelReady(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 21;
            getSmallIconId = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                int i6 = ITrustedWebActivityServiceDefault + 7;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = ITrustedWebActivityServiceDefault + 125;
            getSmallIconId = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1806582390, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1806582390.<anonymous> (TdsListRowV1.kt:1353)");
            }
            int i9 = R.drawable.icon_search_mono;
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            w3bVar.onExtraCallbackWithResult(Integer.valueOf(i9), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel(), (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, 29360128 & (i2 << 21), 78);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit postMessage(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 37;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ^ true ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 49;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(556860742, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$556860742.<anonymous> (TdsListRowV1.kt:1366)");
                int i8 = ITrustedWebActivityServiceDefault + 73;
                getSmallIconId = i8 % 128;
                int i9 = i8 % 2;
            }
            rightPreset.IAuthTabCallback("변경", null, null, null, null, null, null, false, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, (i2 << 3) & 112, 2046);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 35;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = ITrustedWebActivityServiceDefault + 15;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1390189435, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1390189435.<anonymous> (TdsListRowV1.kt:1311)");
            }
            w4.onExtraCallbackWithResult(requestPostMessageChannel, null, asInterface, null, null, IAuthTabCallbackDefault, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
            w4.onExtraCallbackWithResult(access100, null, ITrustedWebActivityCallbackStubProxy, null, null, onTransact, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
            w4.onExtraCallbackWithResult(IPostMessageServiceStubProxy, null, extraCallback, null, null, ITrustedWebActivityService, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 93;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(w5a w5aVar, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = getSmallIconId + 27;
            ITrustedWebActivityServiceDefault = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(566420793, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-242515498.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsListRowV1.kt:1375)");
            }
            w5aVar.IAuthTabCallback("alipay(오프라인결제_중국외)", "2월 18일", null, null, cameraCaptureResultEmptyCameraCaptureResult, 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = getSmallIconId + 1;
                ITrustedWebActivityServiceDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i6 = 62 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final w5a w5aVar, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        AudioRestrictionControllerImplExternalSyntheticLambda0.IAuthTabCallback(audioRestrictionControllerImplExternalSyntheticLambda0, (Object) null, (Object) null, ForwardingCameraControl.onExtraCallbackWithResult(566420793, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda77
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {w5aVar, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                Unit unit = (Unit) w2ExternalSyntheticLambda0.onNavigationEvent(2047642795, -2047642789, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                int i5 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 68 / 0;
                }
                return unit;
            }
        }), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getSmallIconId + 73;
        ITrustedWebActivityServiceDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceStubProxy(final w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = getSmallIconId + 41;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 115;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-242515498, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-242515498.<anonymous> (TdsListRowV1.kt:1373)");
            }
            boolean z = (i2 & 14) == 4;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!z) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt$$ExternalSyntheticLambda79
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallback + 57;
                            onWarmupCompleted = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnExtraCallbackWithResult = w2ExternalSyntheticLambda0.onExtraCallbackWithResult(w5aVar, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj2);
                            int i12 = onWarmupCompleted + 59;
                            onExtraCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                    obj = function1;
                }
                ResolutionCorrector.onWarmupCompleted((QuirksExternalSyntheticBackport0) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent) null, (QuirkSettingsLoader.onWarmupCompleted) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResult, 0, 511);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i9 = ITrustedWebActivityServiceDefault + 81;
                    getSmallIconId = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit newAuthTabSession(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i4 = ITrustedWebActivityServiceDefault + 111;
                getSmallIconId = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i6 = getSmallIconId + 91;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(972100678, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$972100678.<anonymous> (TdsListRowV1.kt:1383)");
            }
            rightPreset.onWarmupCompleted("10,000원", "$10", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 77;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit newSessionWithExtras(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 57;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 117) == 0) {
                int i4 = getSmallIconId + 69;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i5 = ITrustedWebActivityServiceDefault + 109;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1042547031, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1042547031.<anonymous> (TdsListRowV1.kt:1391)");
                int i7 = getSmallIconId + 11;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
            }
            w5aVar.IAuthTabCallback("alipay(오프라인결제)", "2월 18일", null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = ITrustedWebActivityServiceDefault + 33;
        getSmallIconId = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 11 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit prefetchWithMultipleUrls(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 41;
        ITrustedWebActivityServiceDefault = i3 % 128;
        boolean z = true;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 68) == 0) {
                int i4 = getSmallIconId + 99;
                ITrustedWebActivityServiceDefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 3;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i7 = getSmallIconId + 17;
                    ITrustedWebActivityServiceDefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 % 4;
                    }
                    i6 = 2;
                } else {
                    int i9 = ITrustedWebActivityServiceDefault + 65;
                    getSmallIconId = i9 % 128;
                    if (i9 % 2 == 0) {
                        i6 = 4;
                    }
                }
                i |= i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i10 = getSmallIconId + 39;
            ITrustedWebActivityServiceDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = ITrustedWebActivityServiceDefault + 119;
                getSmallIconId = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2037804089, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-2037804089.<anonymous> (TdsListRowV1.kt:1397)");
            }
            rightPreset.onWarmupCompleted("10,000원", "$10", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = getSmallIconId + 7;
                ITrustedWebActivityServiceDefault = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i16 = getSmallIconId + 9;
        ITrustedWebActivityServiceDefault = i16 % 128;
        int i17 = i16 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-861896251, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-861896251.<anonymous> (TdsListRowV1.kt:1255)");
                int i2 = getSmallIconId + 59;
                ITrustedWebActivityServiceDefault = i2 % 128;
                int i3 = i2 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i4 = getSmallIconId + 57;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
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
            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
            w4.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{IAuthTabCallback, true, null, null, onnavigationevent.onNavigationEvent(), null, ICustomTabsCallback, onnavigationevent.onNavigationEvent(), null, Float.valueOf(0.0f), null, null, null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 14180406, 3072, 253740}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1882733109, -1882733101);
            w4.onExtraCallbackWithResult(IAuthTabCallback_Parcel, null, updateVisuals, null, null, onMinimized, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196998, 0, 131034);
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), 2.0f)), writeTypedList, cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            w4.onExtraCallbackWithResult(onMessageChannelReady, null, null, null, null, getActiveNotifications, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            w4.onExtraCallbackWithResult(ICustomTabsServiceStub, null, null, null, null, extraCallbackWithResult, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 0, 131038);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        int i;
        boolean z = false;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        Object obj = null;
        if ((iIntValue & 6) == 0) {
            int i3 = ITrustedWebActivityServiceDefault + 51;
            getSmallIconId = i3 % 128;
            if (i3 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = ITrustedWebActivityServiceDefault + 123;
                getSmallIconId = i4 % 128;
                int i5 = i4 % 2;
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) != 18) {
            int i6 = getSmallIconId + 71;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i7 = ITrustedWebActivityServiceDefault + 95;
            getSmallIconId = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = getSmallIconId + 27;
                ITrustedWebActivityServiceDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-998010055, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-998010055.<anonymous> (TdsListRowV1.kt:1413)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-998010055, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-998010055.<anonymous> (TdsListRowV1.kt:1413)");
            }
            w5aVar.onExtraCallbackWithResult("Row1A", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 23;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i10 == 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ITrustedWebActivityCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 59;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 125) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    int i5 = getSmallIconId + 41;
                    ITrustedWebActivityServiceDefault = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i |= i2;
                int i7 = getSmallIconId + 85;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i9 = getSmallIconId + 9;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-940027782, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-940027782.<anonymous> (TdsListRowV1.kt:1414)");
            }
            w5aVar.onWarmupCompleted("Row1B", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = ITrustedWebActivityServiceDefault + 27;
                getSmallIconId = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 41;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i5 = ITrustedWebActivityServiceDefault + 79;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i7 = getSmallIconId + 37;
            ITrustedWebActivityServiceDefault = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-882045509, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-882045509.<anonymous> (TdsListRowV1.kt:1415)");
            }
            w5aVar.onNavigationEvent("Row1C", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = getSmallIconId + 91;
        ITrustedWebActivityServiceDefault = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i2 = ITrustedWebActivityServiceDefault + 111;
                getSmallIconId = i2 % 128;
                int i3 = i2 % 2 != 0 ? 2 : 4;
                iIntValue |= i3;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = getSmallIconId + 49;
                ITrustedWebActivityServiceDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-824063236, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-824063236.<anonymous> (TdsListRowV1.kt:1416)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-824063236, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-824063236.<anonymous> (TdsListRowV1.kt:1416)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Row2A", "Row2A", null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 12) & 57344) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = getSmallIconId + 55;
                ITrustedWebActivityServiceDefault = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            int i2 = getSmallIconId + 117;
            ITrustedWebActivityServiceDefault = i2 % 128;
            int i3 = i2 % 2;
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ^ true ? 2 : 4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(true ^ ((iIntValue & 19) == 18), iIntValue & 1)) {
            int i4 = getSmallIconId + 53;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-766080963, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-766080963.<anonymous> (TdsListRowV1.kt:1417)");
                }
                w5aVar.onWarmupCompleted("Row2B", "Row2B", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w5aVar.onWarmupCompleted("Row2B", "Row2B", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 12) & 57344) | 54, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IEngagementSignalsCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = ITrustedWebActivityServiceDefault + 81;
                getSmallIconId = i4 % 128;
                i2 = i4 % 2 != 0 ? 3 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-708098690, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-708098690.<anonymous> (TdsListRowV1.kt:1418)");
                int i5 = ITrustedWebActivityServiceDefault + 79;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
            }
            w5aVar.IAuthTabCallback("Row2C", "Row2C", null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = getSmallIconId + 83;
        ITrustedWebActivityServiceDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onSessionEnded(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 113;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 86) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i4 = ITrustedWebActivityServiceDefault + 85;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-650116417, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-650116417.<anonymous> (TdsListRowV1.kt:1419)");
            }
            w5aVar.onExtraCallback("Row2D", "Row2D", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 53;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onVerticalScrollEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = 3;
        int i4 = ITrustedWebActivityServiceDefault + 3;
        getSmallIconId = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i6 = getSmallIconId + 11;
            ITrustedWebActivityServiceDefault = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                int i7 = getSmallIconId + 45;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i |= i3;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i8 = ITrustedWebActivityServiceDefault + 43;
            getSmallIconId = i8 % 128;
            if (i8 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-592134144, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-592134144.<anonymous> (TdsListRowV1.kt:1420)");
            }
            w5aVar.onNavigationEvent("Row2E", "Row2E", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = getSmallIconId + 35;
            ITrustedWebActivityServiceDefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onGreatestScrollPercentageIncreased(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 17;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 120) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                    i2 = 4;
                } else {
                    int i5 = ITrustedWebActivityServiceDefault + 39;
                    getSmallIconId = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-534151871, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-534151871.<anonymous> (TdsListRowV1.kt:1421)");
            }
            w5aVar.IAuthTabCallbackStub("Row2F", "Row2F", null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = ITrustedWebActivityServiceDefault + 67;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IEngagementSignalsCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 17;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = ITrustedWebActivityServiceDefault + 109;
            getSmallIconId = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = ITrustedWebActivityServiceDefault + 29;
                getSmallIconId = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-476169598, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-476169598.<anonymous> (TdsListRowV1.kt:1422)");
                    int i8 = 58 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-476169598, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-476169598.<anonymous> (TdsListRowV1.kt:1422)");
                }
            }
            w5aVar.onExtraCallback("Row3A", "Row3A", "Row3A", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 438, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = getSmallIconId + 123;
                ITrustedWebActivityServiceDefault = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i10 == 0) {
                    int i11 = 81 / 0;
                }
                int i12 = getSmallIconId + 35;
                ITrustedWebActivityServiceDefault = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsServiceStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = getSmallIconId + 103;
        ITrustedWebActivityServiceDefault = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 62) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar))) {
                    int i6 = getSmallIconId + 101;
                    ITrustedWebActivityServiceDefault = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i8 = getSmallIconId + 23;
            ITrustedWebActivityServiceDefault = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 19;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1006224066, i3, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1006224066.<anonymous> (TdsListRowV1.kt:1423)");
            }
            w5aVar.IAuthTabCallback("Row3B", "Row3B", "Row3B", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i3 << 18) & 3670016) | 438, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = ITrustedWebActivityServiceDefault + 53;
                getSmallIconId = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 % 4;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IPostMessageServiceStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                i3 = 4;
            } else {
                int i5 = ITrustedWebActivityServiceDefault + 99;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-948241793, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-948241793.<anonymous> (TdsListRowV1.kt:1424)");
            }
            w5aVar.onNavigationEvent("Row3C", "Row3C", "Row3C", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 438, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 117;
                ITrustedWebActivityServiceDefault = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 == 0) {
                    int i9 = 44 / 0;
                }
                int i10 = ITrustedWebActivityServiceDefault + 5;
                getSmallIconId = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ITrustedWebActivityCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = getSmallIconId + 15;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i6 = getSmallIconId + 59;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i8 = getSmallIconId + 97;
            ITrustedWebActivityServiceDefault = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-832277247, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-832277247.<anonymous> (TdsListRowV1.kt:1426)");
            }
            w5a.onExtraCallback(new Object[]{w5aVar, "Row3E", "Row3E", "Row3E", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 18) & 3670016) | 438), 56}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 62344002, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -62343993, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit mayLaunchUrl(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = ITrustedWebActivityServiceDefault + 17;
            getSmallIconId = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2130691981, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$2130691981.<anonymous> (TdsListRowV1.kt:1437)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, "Row1A", null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 6) & 896) | 6), 2}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1798077257, 1798077258, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = getSmallIconId + 27;
            ITrustedWebActivityServiceDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit extraCommand(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ^ true ? 2 : 4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2017081486, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$2017081486.<anonymous> (TdsListRowV1.kt:1438)");
            }
            rightPreset.onExtraCallback("Row1B", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = ITrustedWebActivityServiceDefault + 119;
            getSmallIconId = i3 % 128;
            int i4 = i3 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = ITrustedWebActivityServiceDefault + 103;
        getSmallIconId = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit ICustomTabsCallback_Parcel(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = getSmallIconId + 93;
            ITrustedWebActivityServiceDefault = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = ITrustedWebActivityServiceDefault + 125;
                getSmallIconId = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1903470991, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1903470991.<anonymous> (TdsListRowV1.kt:1439)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, "Row1C", null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 6) & 896) | 6), 2}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 611630355, -611630352, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = ITrustedWebActivityServiceDefault + 15;
            getSmallIconId = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit isEngagementSignalsApiAvailable(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i5 = getSmallIconId + 19;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i7 = ITrustedWebActivityServiceDefault + 77;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = ITrustedWebActivityServiceDefault + 35;
            getSmallIconId = i9 % 128;
            z = i9 % 2 == 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = ITrustedWebActivityServiceDefault + 31;
                getSmallIconId = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1789860496, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1789860496.<anonymous> (TdsListRowV1.kt:1440)");
                    int i11 = 64 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1789860496, i2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1789860496.<anonymous> (TdsListRowV1.kt:1440)");
                }
                int i12 = getSmallIconId + 113;
                ITrustedWebActivityServiceDefault = i12 % 128;
                int i13 = i12 % 2;
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, "Row1D", null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 6) & 896) | 6), 2}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1357016266, -1357016264, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsService(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 59;
        getSmallIconId = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i5 = ITrustedWebActivityServiceDefault + 23;
            getSmallIconId = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1676250001, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1676250001.<anonymous> (TdsListRowV1.kt:1441)");
            }
            rightPreset.onNavigationEvent("Row1E", (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = ITrustedWebActivityServiceDefault + 67;
                getSmallIconId = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallbackDefault(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            int i4 = ITrustedWebActivityServiceDefault + 63;
            getSmallIconId = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i5 = ITrustedWebActivityServiceDefault + 65;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
            int i7 = ITrustedWebActivityServiceDefault + 59;
            getSmallIconId = i7 % 128;
            int i8 = i7 % 2;
        }
        boolean z = false;
        if ((i & 19) != 18) {
            int i9 = ITrustedWebActivityServiceDefault + 15;
            getSmallIconId = i9 % 128;
            if (i9 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1562639506, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1562639506.<anonymous> (TdsListRowV1.kt:1442)");
            }
            rightPreset.IAuthTabCallback("Row2A", "Row2A", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = getSmallIconId + 27;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onUnminimized(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = getSmallIconId + 27;
        ITrustedWebActivityServiceDefault = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 52) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i5 = getSmallIconId + 53;
                    ITrustedWebActivityServiceDefault = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    int i7 = ITrustedWebActivityServiceDefault + 63;
                    getSmallIconId = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 2;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i9 = ITrustedWebActivityServiceDefault + 65;
            int i10 = i9 % 128;
            getSmallIconId = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 97;
            ITrustedWebActivityServiceDefault = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = getSmallIconId + 125;
                ITrustedWebActivityServiceDefault = i14 % 128;
                int i15 = i14 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1449029011, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1449029011.<anonymous> (TdsListRowV1.kt:1443)");
            }
            rightPreset.onWarmupCompleted("Row2B", "Row2B", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackStubProxy(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityServiceDefault + 67;
        getSmallIconId = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 65) == 0) {
                int i5 = ITrustedWebActivityServiceDefault + 103;
                getSmallIconId = i5 % 128;
                int i6 = i5 % 2;
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i7 = ITrustedWebActivityServiceDefault + 77;
                    getSmallIconId = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 4;
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1335418516, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1335418516.<anonymous> (TdsListRowV1.kt:1444)");
            }
            rightPreset.onNavigationEvent("Row2C", "Row2C", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onRelationshipValidationResult(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = getSmallIconId + 103;
        ITrustedWebActivityServiceDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
        }
        if ((i & 19) != 18) {
            int i5 = getSmallIconId + 25;
            ITrustedWebActivityServiceDefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = getSmallIconId + 17;
                ITrustedWebActivityServiceDefault = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1221808021, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1221808021.<anonymous> (TdsListRowV1.kt:1445)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1221808021, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1221808021.<anonymous> (TdsListRowV1.kt:1445)");
                int i8 = getSmallIconId + 1;
                ITrustedWebActivityServiceDefault = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 3;
                }
            }
            rightPreset.onExtraCallbackWithResult("Row2D", "Row2D", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 12) & 57344) | 54, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = getSmallIconId + 27;
                ITrustedWebActivityServiceDefault = i10 % 128;
                int i11 = i10 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit setEngagementSignalsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityServiceDefault + 87;
        getSmallIconId = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            z = (i & 114) != 8;
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = getSmallIconId + 87;
            ITrustedWebActivityServiceDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(705709952, i, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$705709952.<anonymous> (TdsListRowV1.kt:1449)");
                    int i6 = ITrustedWebActivityServiceDefault + 1;
                    getSmallIconId = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 3 % 3;
                    }
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = getSmallIconId + 43;
                    ITrustedWebActivityServiceDefault = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~((~i2) | i);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i));
        int i10 = ~i;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i2);
        int i13 = (~(i8 | i2)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i2 + i + i3 + (1039959776 * i6) + ((-2046201414) * i5);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i2) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i3) + ((-201326592) * i6) + ((-406847488) * i5) + (529399808 * i16);
        int i18 = ((i2 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (868239597 * i3) + (817356128 * i6) + (406493490 * i5) + (i16 * 645267456);
        boolean z = true;
        switch (i17 + (i18 * i18 * 681705472)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                w5a w5aVar = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i19 = 2 % 2;
                Intrinsics.checkNotNullParameter(w5aVar, "");
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                        int i20 = getSmallIconId + 33;
                        ITrustedWebActivityServiceDefault = i20 % 128;
                        int i21 = i20 % 2;
                    } else {
                        i = 2;
                    }
                    iIntValue |= i;
                }
                if ((iIntValue & 19) != 18) {
                    int i22 = ITrustedWebActivityServiceDefault + 21;
                    getSmallIconId = i22 % 128;
                    if (i22 % 2 == 0) {
                        z = true;
                    }
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-774294974, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-774294974.<anonymous> (TdsListRowV1.kt:1427)");
                        int i23 = getSmallIconId + 41;
                        ITrustedWebActivityServiceDefault = i23 % 128;
                        int i24 = i23 % 2;
                    }
                    w5aVar.IAuthTabCallbackDefault("Row3F", "Row3F", "Row3F", null, null, null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 18) & 3670016) | 438, 56);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                w5a w5aVar2 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i25 = 2 % 2;
                int i26 = ITrustedWebActivityServiceDefault + 13;
                getSmallIconId = i26 % 128;
                int i27 = i26 % 2;
                Intrinsics.checkNotNullParameter(w5aVar2, "");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(w5aVar2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    int i28 = ITrustedWebActivityServiceDefault + 89;
                    getSmallIconId = i28 % 128;
                    int i29 = i28 % 2;
                    z = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(314334934, iIntValue2, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$314334934.<anonymous> (TdsListRowV1.kt:1360)");
                    }
                    w5a.onExtraCallback(new Object[]{w5aVar2, "하나은행 계좌", "하나은행 1234567890", null, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((57344 & (iIntValue2 << 12)) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return onExtraCallbackWithResult(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                RightPreset rightPreset = (RightPreset) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i30 = 2 % 2;
                int i31 = getSmallIconId + 19;
                ITrustedWebActivityServiceDefault = i31 % 128;
                int i32 = i31 % 2;
                Unit unitOnUnminimized = onUnminimized(rightPreset, cameraCaptureResultEmptyCameraCaptureResult3, iIntValue3);
                int i33 = getSmallIconId + 119;
                ITrustedWebActivityServiceDefault = i33 % 128;
                int i34 = i33 % 2;
                return unitOnUnminimized;
            case 11:
                return IAuthTabCallbackDefault(objArr);
            case 12:
                return asBinder(objArr);
            case 13:
                int i35 = 2 % 2;
                int i36 = getSmallIconId + 23;
                int i37 = i36 % 128;
                ITrustedWebActivityServiceDefault = i37;
                int i38 = i36 % 2;
                getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onUnminimized;
                int i39 = i37 + 73;
                getSmallIconId = i39 % 128;
                int i40 = i39 % 2;
                return getbacktracenote;
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return access000(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_centerText3MaxLines /* 16 */:
                w5a w5aVar3 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i41 = 2 % 2;
                int i42 = getSmallIconId + 65;
                ITrustedWebActivityServiceDefault = i42 % 128;
                int i43 = i42 % 2;
                Unit unitNewSessionWithExtras = newSessionWithExtras(w5aVar3, cameraCaptureResultEmptyCameraCaptureResult4, iIntValue4);
                int i44 = ITrustedWebActivityServiceDefault + 93;
                getSmallIconId = i44 % 128;
                int i45 = i44 % 2;
                return unitNewSessionWithExtras;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_centerType /* 17 */:
                return IAuthTabCallbackStubProxy(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_disabledType /* 18 */:
                return access100(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftDate /* 19 */:
                return IAuthTabCallback_Parcel(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImage /* 20 */:
                return extraCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageColor /* 21 */:
                w3b w3bVar = (w3b) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i46 = 2 % 2;
                Intrinsics.checkNotNullParameter(w3bVar, "");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= cameraCaptureResultEmptyCameraCaptureResult5.onNavigationEvent(w3bVar) ^ true ? 2 : 4;
                    int i47 = getSmallIconId + 83;
                    ITrustedWebActivityServiceDefault = i47 % 128;
                    if (i47 % 2 == 0) {
                        int i48 = 5 / 2;
                    }
                }
                if ((iIntValue5 & 19) != 18) {
                    int i49 = getSmallIconId + 69;
                    ITrustedWebActivityServiceDefault = i49 % 128;
                    int i50 = i49 % 2;
                    z = true;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(z, iIntValue5 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackStubProxy();
                } else {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1402095150, iIntValue5, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-1402095150.<anonymous> (TdsListRowV1.kt:1313)");
                    }
                    int i51 = R.drawable.icon_search_mono;
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    w3bVar.onExtraCallbackWithResult(Integer.valueOf(i51), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult5, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255)).longValue(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult5, 6).IPostMessageService_Parcel(), (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult5, (iIntValue5 << 21) & 29360128, 78);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageHeight /* 22 */:
                return ICustomTabsCallback(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageType /* 23 */:
                RightPreset rightPreset2 = (RightPreset) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult6 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue6 = ((Number) objArr[2]).intValue();
                int i52 = 2 % 2;
                Intrinsics.checkNotNullParameter(rightPreset2, "");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= cameraCaptureResultEmptyCameraCaptureResult6.onNavigationEvent(rightPreset2) ^ true ? 2 : 4;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult6.onWarmupCompleted((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    int i53 = getSmallIconId + 35;
                    ITrustedWebActivityServiceDefault = i53 % 128;
                    int i54 = i53 % 2;
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1108197526, iIntValue6, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$1108197526.<anonymous> (TdsListRowV1.kt:1446)");
                    }
                    rightPreset2.onExtraCallback("Row2E", "Row2E", (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult6, (57344 & (iIntValue6 << 12)) | 54, 12);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult6.ICustomTabsCallbackStubProxy();
                    int i55 = ITrustedWebActivityServiceDefault + 19;
                    getSmallIconId = i55 % 128;
                    int i56 = i55 % 2;
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageUrl /* 24 */:
                return writeTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftImageWidth /* 25 */:
                return extraCallbackWithResult(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottie /* 26 */:
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult7 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
                int iIntValue7 = ((Number) objArr[1]).intValue();
                int i57 = 2 % 2;
                int i58 = getSmallIconId;
                int i59 = i58 + 33;
                ITrustedWebActivityServiceDefault = i59 % 128;
                if (i59 % 2 != 0 ? (iIntValue7 & 3) == 2 : (iIntValue7 & 2) == 3) {
                    z = false;
                } else {
                    int i60 = i58 + 31;
                    ITrustedWebActivityServiceDefault = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = i58 + 85;
                    ITrustedWebActivityServiceDefault = i62 % 128;
                    int i63 = i62 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult7.onWarmupCompleted(z, iIntValue7 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-85453334, iIntValue7, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-85453334.<anonymous> (TdsListRowV1.kt:1030)");
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult7, 6).IPostMessageService_Parcel(), (toMetersPerSecond) null, 2, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult7, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult7, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult7.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult7, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult7.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult7.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult7.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult7.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult7.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult7);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    w4.onExtraCallbackWithResult(ITrustedWebActivityCallback_Parcel, null, requestPostMessageChannelWithExtras, getViewTypeCount.onExtraCallback.Companion.onNavigationEvent(), null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 3462, 0, 131058);
                    w4.onExtraCallbackWithResult(onExtraCallback, null, cancelNotification, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 390, 0, 131066);
                    w4.onExtraCallbackWithResult(onActivityLayout, null, IEngagementSignalsCallbackDefault, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 390, 0, 131066);
                    w4.onExtraCallbackWithResult(getSmallIconBitmap, null, access000, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 390, 0, 131066);
                    w4.onExtraCallbackWithResult(IPostMessageService, null, ICustomTabsCallbackStub, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 390, 0, 131066);
                    w4.onExtraCallbackWithResult(getInterfaceDescriptor, null, ITrustedWebActivityCallbackStub, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult7, 390, 0, 131066);
                    cameraCaptureResultEmptyCameraCaptureResult7.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult7.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieHeight /* 27 */:
                w5a w5aVar4 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult8 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue8 = ((Number) objArr[2]).intValue();
                int i64 = 2 % 2;
                int i65 = getSmallIconId + 91;
                ITrustedWebActivityServiceDefault = i65 % 128;
                int i66 = i65 % 2;
                Intrinsics.checkNotNullParameter(w5aVar4, "");
                if ((iIntValue8 & 6) == 0) {
                    int i67 = getSmallIconId + 13;
                    ITrustedWebActivityServiceDefault = i67 % 128;
                    int i68 = i67 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResult8.onNavigationEvent(w5aVar4)) {
                        int i69 = getSmallIconId + 13;
                        ITrustedWebActivityServiceDefault = i69 % 128;
                        int i70 = i69 % 2;
                    } else {
                        i = 2;
                    }
                    iIntValue8 |= i;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult8.onWarmupCompleted((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-890259520, iIntValue8, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-890259520.<anonymous> (TdsListRowV1.kt:1425)");
                    }
                    w5aVar4.onWarmupCompleted("Row3D", "Row3D", "Row3D", null, null, null, cameraCaptureResultEmptyCameraCaptureResult8, ((iIntValue8 << 18) & 3670016) | 438, 56);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult8.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieRepeatCount /* 28 */:
                return readTypedObject(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieUrl /* 29 */:
                return onActivityLayout(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftLottieWidth /* 30 */:
                return onPostMessage(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftRank /* 31 */:
                return onMessageChannelReady(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_leftType /* 32 */:
                w5a w5aVar5 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult9 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue9 = ((Number) objArr[2]).intValue();
                int i71 = 2 % 2;
                int i72 = ITrustedWebActivityServiceDefault + 105;
                getSmallIconId = i72 % 128;
                int i73 = i72 % 2;
                Intrinsics.checkNotNullParameter(w5aVar5, "");
                if ((iIntValue9 & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResult9.onNavigationEvent(w5aVar5)) {
                        int i74 = ITrustedWebActivityServiceDefault + 57;
                        getSmallIconId = i74 % 128;
                        int i75 = i74 % 2;
                    } else {
                        i = 2;
                    }
                    iIntValue9 |= i;
                    int i76 = ITrustedWebActivityServiceDefault + 35;
                    getSmallIconId = i76 % 128;
                    if (i76 % 2 != 0) {
                        int i77 = 3 / 3;
                    }
                }
                if ((iIntValue9 & 19) != 18) {
                    int i78 = ITrustedWebActivityServiceDefault + 41;
                    getSmallIconId = i78 % 128;
                    int i79 = i78 % 2;
                    z = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult9.onWarmupCompleted(z, iIntValue9 & 1)) {
                    int i80 = ITrustedWebActivityServiceDefault + 41;
                    getSmallIconId = i80 % 128;
                    int i81 = i80 % 2;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-268048837, iIntValue9, -1, "im.toss.tds.compose.component.compound.listrow.ComposableSingletons$TdsListRowV1Kt.lambda$-268048837.<anonymous> (TdsListRowV1.kt:1073)");
                    }
                    w5a.onExtraCallback(new Object[]{w5aVar5, "Title", "Subtext 1", null, null, cameraCaptureResultEmptyCameraCaptureResult9, Integer.valueOf((57344 & (iIntValue9 << 12)) | 54), 12}, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), 1395077247, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1395077228, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i82 = getSmallIconId + 23;
                        ITrustedWebActivityServiceDefault = i82 % 128;
                        int i83 = i82 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i84 = getSmallIconId + 77;
                        ITrustedWebActivityServiceDefault = i84 % 128;
                        if (i84 % 2 == 0) {
                            int i85 = 2 / 3;
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult9.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightArrow /* 33 */:
                return onMinimized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBadgeText /* 34 */:
                w3b w3bVar2 = (w3b) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult10 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue10 = ((Number) objArr[2]).intValue();
                int i86 = 2 % 2;
                int i87 = ITrustedWebActivityServiceDefault + 19;
                getSmallIconId = i87 % 128;
                int i88 = i87 % 2;
                Unit interfaceDescriptor = getInterfaceDescriptor(w3bVar2, cameraCaptureResultEmptyCameraCaptureResult10, iIntValue10);
                int i89 = getSmallIconId + 19;
                ITrustedWebActivityServiceDefault = i89 % 128;
                int i90 = i89 % 2;
                return interfaceDescriptor;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightBreakEnabled /* 35 */:
                return onActivityResized(objArr);
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonDisplay /* 36 */:
                w3b w3bVar3 = (w3b) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult11 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue11 = ((Number) objArr[2]).intValue();
                int i91 = 2 % 2;
                int i92 = getSmallIconId + 65;
                ITrustedWebActivityServiceDefault = i92 % 128;
                int i93 = i92 % 2;
                Unit unitWriteTypedObject = writeTypedObject(w3bVar3, cameraCaptureResultEmptyCameraCaptureResult11, iIntValue11);
                int i94 = ITrustedWebActivityServiceDefault + 83;
                getSmallIconId = i94 % 128;
                int i95 = i94 % 2;
                return unitWriteTypedObject;
            case im.toss.tds.view.R.styleable.TdsListRowV1View_rightButtonLabel /* 37 */:
                w5a w5aVar6 = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult12 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue12 = ((Number) objArr[2]).intValue();
                int i96 = 2 % 2;
                int i97 = getSmallIconId + 61;
                ITrustedWebActivityServiceDefault = i97 % 128;
                int i98 = i97 % 2;
                Unit unit = (Unit) onNavigationEvent(-1855607434, 1855607453, new Object[]{w5aVar6, cameraCaptureResultEmptyCameraCaptureResult12, Integer.valueOf(iIntValue12)}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                int i99 = getSmallIconId + 59;
                ITrustedWebActivityServiceDefault = i99 % 128;
                int i100 = i99 % 2;
                return unit;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(291166317, -291166293, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(833186401, -833186367, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(881916944, -881916943, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit asBinder(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(465846647, -465846637, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit readTypedObject(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(795963776, -795963739, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit extraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1984727317, -1984727286, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-1168696086, 1168696122, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onMessageChannelReady(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(444793372, -444793363, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(2047642795, -2047642789, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit access000(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(887061132, -887061097, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit extraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-1563433091, 1563433096, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-219327811, 219327828, new Object[0], DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit mayLaunchUrl(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(737897305, -737897289, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit ICustomTabsService(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-309618774, 309618777, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit onMessageChannelReady(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-397661673, 397661684, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public static /* synthetic */ Unit prefetch(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1252132168, -1252132168, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit onActivityLayout(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1349488297, -1349488274, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit prefetchWithMultipleUrls(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1339902313, -1339902309, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit readTypedObject(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(12650118, -12650093, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit receiveFile(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1215113976, -1215113964, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit prefetch(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(120876085, -120876057, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit newSession(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-774113226, 774113256, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit ICustomTabsCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(242158343, -242158322, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit setEngagementSignalsCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(1959680361, -1959680343, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IEngagementSignalsCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-1536979100, 1536979132, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IEngagementSignalsCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-890775621, 890775628, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IPostMessageServiceDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-2010404840, 2010404842, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IPostMessageService(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(30628447, -30628433, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(564198524, -564198498, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit onTransact(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-356595273, 356595288, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit IPostMessageService_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(991072860, -991072833, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit ITrustedWebActivityCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-1855607434, 1855607453, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    private static final Unit ITrustedWebActivityService(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(-1421082336, 1421082358, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getBacktraceNote) onNavigationEvent(-2035849945, 2035849958, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onMessageChannelReady() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getBacktraceNote) onNavigationEvent(-1558952517, 1558952525, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onActivityResized() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getBacktraceNote) onNavigationEvent(-951844593, 951844622, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> ICustomTabsCallbackStubProxy() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getBacktraceNote) onNavigationEvent(-956405762, 956405782, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onUnminimized() {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (getBacktraceNote) onNavigationEvent(217867271, -217867238, new Object[]{this}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
    }
}
