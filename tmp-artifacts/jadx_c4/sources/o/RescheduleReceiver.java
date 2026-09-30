package o;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.ParcelUuid;
import im.toss.ble.worker.BleScanStopWorker;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.DelayMetCommandHandlerExternalSyntheticLambda0;
import o.IABLandingPageActivity5;
import o.RescheduleReceiver;
import o.TTAppOpenAdActivity;
import o.TTAppOpenAdActivity5;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RescheduleReceiver {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsService = 1;
    private static int extraCommand = 0;
    private static int mayLaunchUrl = 1;
    private final IAnimation<WorkerUpdaterExternalSyntheticLambda2> IAuthTabCallback;
    private final Context IAuthTabCallbackDefault;
    private final getTileModeX<Throwable> IAuthTabCallbackStub;
    private getPackageType IAuthTabCallbackStubProxy;
    private final IAnimation<WorkerUpdaterExternalSyntheticLambda2> IAuthTabCallback_Parcel;
    private final IAnimation<WorkerUpdaterExternalSyntheticLambda2> ICustomTabsCallback;
    private long ICustomTabsCallbackDefault;
    private volatile WorkerParameters ICustomTabsCallbackStubProxy;
    private long access000;
    private long access100;
    private final BluetoothAdapter asBinder;
    private final getTileModeX<WorkerUpdaterExternalSyntheticLambda2> asInterface;
    private final Object extraCallback;
    private final getTileModeX<Unit> extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private WorkDatabase onActivityLayout;
    private final CoroutineExceptionHandler onActivityResized;
    private final getBorderRadius<Unit> onExtraCallback;
    private final getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> onExtraCallbackWithResult;
    private final TTAppOpenAdActivity5 onMessageChannelReady;
    private final GeckoHubImp onMinimized;
    private final getBorderRadius<Throwable> onNavigationEvent;
    private getPackageType onPostMessage;
    private final Lazy onRelationshipValidationResult;
    private getPackageType onTransact;
    private final Lazy onUnminimized;
    private final getBorderRadius<Unit> onWarmupCompleted;
    private final getBorderRadius<Unit> readTypedObject;
    private final Lazy writeTypedObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallbackDefault extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = RescheduleReceiver.onNavigationEvent(RescheduleReceiver.this, 0L, this);
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = mayLaunchUrl + 77;
        extraCommand = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda0 IAuthTabCallback(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 103;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(rescheduleReceiver);
        int i4 = ICustomTabsService + 85;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ TextFieldPressGestureFilterKtExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 63;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = (TextFieldPressGestureFilterKtExternalSyntheticLambda0) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1494214509, new Object[0], QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1494214507);
        int i4 = ICustomTabsCallbackStub + 77;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return textFieldPressGestureFilterKtExternalSyntheticLambda0;
    }

    public static /* synthetic */ IABLandingPageActivity5 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 33;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        IABLandingPageActivity5 typedObject = readTypedObject();
        int i4 = ICustomTabsService + 3;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return typedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0171, code lost:
    
        if (r0.onWarmupCompleted((o.access13800<? super kotlin.Unit>) r6) != r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0289, code lost:
    
        if (onNavigationEvent(im.toss.features.home.core.ui.widget.sprint5.QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), im.toss.features.home.core.ui.widget.sprint5.QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1301379802, new java.lang.Object[]{r0, r6}, im.toss.features.home.core.ui.widget.sprint5.QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), im.toss.features.home.core.ui.widget.sprint5.QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1301379801) != r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a A[PHI: r1 r3 r4
      0x024a: PHI (r1v26 long) = (r1v25 long), (r1v33 long) binds: [B:45:0x0248, B:23:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r3v16 o.Tooltip_androidKtExternalSyntheticLambda0) = (r3v15 o.Tooltip_androidKtExternalSyntheticLambda0), (r3v26 o.Tooltip_androidKtExternalSyntheticLambda0) binds: [B:45:0x0248, B:23:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r4v29 o.TopAppBarStateExternalSyntheticLambda1) = (r4v28 o.TopAppBarStateExternalSyntheticLambda1), (r4v36 o.TopAppBarStateExternalSyntheticLambda1) binds: [B:45:0x0248, B:23:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        TopAppBarStateExternalSyntheticLambda1 topAppBarStateExternalSyntheticLambda1OnNavigationEvent;
        getBorderRadius<Unit> getborderradius;
        Unit unit;
        long j;
        TopAppBarStateExternalSyntheticLambda1 topAppBarStateExternalSyntheticLambda1;
        TopAppBarStateExternalSyntheticLambda1 topAppBarStateExternalSyntheticLambda12;
        Tooltip_androidKtExternalSyntheticLambda0 tooltip_androidKtExternalSyntheticLambda0;
        Long lAccess000;
        getBorderRadius<Unit> getborderradius2;
        Unit unit2;
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i6 | i2);
        int i12 = (~(i2 | i6)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i6 + i + (62936680 * i5) + ((-2032430997) * i4);
        int i14 = i13 * i13;
        int i15 = ((i3 * 1175661207) - 43826732) + (i6 * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (1175660433 * i) + (1188219112 * i5) + ((-816965221) * i4) + (i14 * 1798373376);
        switch (((-476632153) * i3) + 797966336 + (1756943451 * i6) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i) + ((-264241152) * i5) + ((-222822400) * i4) + (2040594432 * i14) + (i15 * i15 * 914292736)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (access13800) objArr[2];
                int i16 = 2 % 2;
                if (iAuthTabCallbackDefault2 instanceof IAuthTabCallbackDefault) {
                    int i17 = ICustomTabsService + 29;
                    ICustomTabsCallbackStub = i17 % 128;
                    int i18 = i17 % 2;
                    iAuthTabCallbackDefault = iAuthTabCallbackDefault2;
                    int i19 = iAuthTabCallbackDefault.label;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        iAuthTabCallbackDefault.label = i19 - 2147483648;
                    } else {
                        iAuthTabCallbackDefault = rescheduleReceiver.new IAuthTabCallbackDefault(iAuthTabCallbackDefault2);
                    }
                }
                Object obj = iAuthTabCallbackDefault.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i20 = iAuthTabCallbackDefault.label;
                if (i20 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    topAppBarStateExternalSyntheticLambda1OnNavigationEvent = TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(rescheduleReceiver.IAuthTabCallbackDefault);
                    Intrinsics.checkNotNullExpressionValue(topAppBarStateExternalSyntheticLambda1OnNavigationEvent, "");
                    topAppBarStateExternalSyntheticLambda1OnNavigationEvent.onExtraCallback("SCAN_STOP_WORKER");
                    rescheduleReceiver.IAuthTabCallbackStubProxy().onExtraCallbackWithResult(jLongValue);
                    if (!WorkerWrapperExternalSyntheticLambda0.onNavigationEvent(rescheduleReceiver.ICustomTabsCallbackStubProxy)) {
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Radio scan skipped", access8100.onNavigationEvent(getWrite.IAuthTabCallback("trigger", rescheduleReceiver.ICustomTabsCallbackStubProxy.getValue())), (String) null, false, (String) null, 56, (Object) null);
                        rescheduleReceiver.access000 = System.currentTimeMillis() + jLongValue;
                        getborderradius = rescheduleReceiver.onWarmupCompleted;
                        unit = Unit.INSTANCE;
                        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda1OnNavigationEvent);
                        iAuthTabCallbackDefault.J$0 = jLongValue;
                        iAuthTabCallbackDefault.label = 2;
                        if (getborderradius.emit(unit, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                            j = jLongValue;
                            topAppBarStateExternalSyntheticLambda1 = topAppBarStateExternalSyntheticLambda1OnNavigationEvent;
                            Tooltip_androidKtExternalSyntheticLambda0 tooltip_androidKtExternalSyntheticLambda0AsBinder = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(BleScanStopWorker.class).onExtraCallbackWithResult(j, TimeUnit.MILLISECONDS).asBinder();
                            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(rescheduleReceiver.IAuthTabCallbackDefault).IAuthTabCallback("SCAN_STOP_WORKER", TooltipKtExternalSyntheticLambda3.REPLACE, tooltip_androidKtExternalSyntheticLambda0AsBinder);
                            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda1);
                            iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0AsBinder);
                            iAuthTabCallbackDefault.J$0 = j;
                            iAuthTabCallbackDefault.label = 3;
                            if (formatMsgs.onWarmupCompleted(j, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                            }
                        }
                        return objOnWarmupCompleted;
                    }
                    iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda1OnNavigationEvent);
                    iAuthTabCallbackDefault.J$0 = jLongValue;
                    iAuthTabCallbackDefault.label = 1;
                    break;
                } else if (i20 == 1) {
                    long j2 = iAuthTabCallbackDefault.J$0;
                    TopAppBarStateExternalSyntheticLambda1 topAppBarStateExternalSyntheticLambda13 = (TopAppBarStateExternalSyntheticLambda1) iAuthTabCallbackDefault.L$0;
                    ResultKt.onNavigationEvent(obj);
                    topAppBarStateExternalSyntheticLambda1OnNavigationEvent = topAppBarStateExternalSyntheticLambda13;
                    jLongValue = j2;
                } else {
                    if (i20 == 2) {
                        j = iAuthTabCallbackDefault.J$0;
                        topAppBarStateExternalSyntheticLambda1 = (TopAppBarStateExternalSyntheticLambda1) iAuthTabCallbackDefault.L$0;
                        ResultKt.onNavigationEvent(obj);
                        int i21 = ICustomTabsService + 95;
                        ICustomTabsCallbackStub = i21 % 128;
                        if (i21 % 2 != 0) {
                            int i22 = 4 / 4;
                        }
                        Tooltip_androidKtExternalSyntheticLambda0 tooltip_androidKtExternalSyntheticLambda0AsBinder2 = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(BleScanStopWorker.class).onExtraCallbackWithResult(j, TimeUnit.MILLISECONDS).asBinder();
                        TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(rescheduleReceiver.IAuthTabCallbackDefault).IAuthTabCallback("SCAN_STOP_WORKER", TooltipKtExternalSyntheticLambda3.REPLACE, tooltip_androidKtExternalSyntheticLambda0AsBinder2);
                        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda1);
                        iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0AsBinder2);
                        iAuthTabCallbackDefault.J$0 = j;
                        iAuthTabCallbackDefault.label = 3;
                        if (formatMsgs.onWarmupCompleted(j, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                            topAppBarStateExternalSyntheticLambda12 = topAppBarStateExternalSyntheticLambda1;
                            tooltip_androidKtExternalSyntheticLambda0 = tooltip_androidKtExternalSyntheticLambda0AsBinder2;
                            lAccess000 = rescheduleReceiver.access000();
                            if (lAccess000 != null) {
                            }
                            getborderradius2 = rescheduleReceiver.onExtraCallback;
                            unit2 = Unit.INSTANCE;
                            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda12);
                            iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0);
                            iAuthTabCallbackDefault.J$0 = j;
                            iAuthTabCallbackDefault.label = 4;
                            if (getborderradius2.emit(unit2, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                            }
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i20 == 3) {
                        j = iAuthTabCallbackDefault.J$0;
                        tooltip_androidKtExternalSyntheticLambda0 = (Tooltip_androidKtExternalSyntheticLambda0) iAuthTabCallbackDefault.L$1;
                        topAppBarStateExternalSyntheticLambda12 = (TopAppBarStateExternalSyntheticLambda1) iAuthTabCallbackDefault.L$0;
                        ResultKt.onNavigationEvent(obj);
                        lAccess000 = rescheduleReceiver.access000();
                        if (lAccess000 != null) {
                            long jLongValue2 = lAccess000.longValue();
                            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Scan finished after " + jLongValue2 + "ms", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                        }
                        getborderradius2 = rescheduleReceiver.onExtraCallback;
                        unit2 = Unit.INSTANCE;
                        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda12);
                        iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0);
                        iAuthTabCallbackDefault.J$0 = j;
                        iAuthTabCallbackDefault.label = 4;
                        if (getborderradius2.emit(unit2, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                            iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda12);
                            iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0);
                            iAuthTabCallbackDefault.J$0 = j;
                            iAuthTabCallbackDefault.label = 5;
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i20 == 4) {
                        j = iAuthTabCallbackDefault.J$0;
                        tooltip_androidKtExternalSyntheticLambda0 = (Tooltip_androidKtExternalSyntheticLambda0) iAuthTabCallbackDefault.L$1;
                        topAppBarStateExternalSyntheticLambda12 = (TopAppBarStateExternalSyntheticLambda1) iAuthTabCallbackDefault.L$0;
                        ResultKt.onNavigationEvent(obj);
                        iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda12);
                        iAuthTabCallbackDefault.L$1 = access15400.onNavigationEvent(tooltip_androidKtExternalSyntheticLambda0);
                        iAuthTabCallbackDefault.J$0 = j;
                        iAuthTabCallbackDefault.label = 5;
                        break;
                    } else {
                        int i23 = ICustomTabsService + 105;
                        ICustomTabsCallbackStub = i23 % 128;
                        int i24 = i23 % 2;
                        if (i20 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return Unit.INSTANCE;
                    }
                }
                rescheduleReceiver.ICustomTabsCallbackDefault = System.currentTimeMillis();
                int i25 = ICustomTabsCallbackStub + 3;
                ICustomTabsService = i25 % 128;
                int i26 = i25 % 2;
                rescheduleReceiver.access000 = System.currentTimeMillis() + jLongValue;
                getborderradius = rescheduleReceiver.onWarmupCompleted;
                unit = Unit.INSTANCE;
                iAuthTabCallbackDefault.L$0 = access15400.onNavigationEvent(topAppBarStateExternalSyntheticLambda1OnNavigationEvent);
                iAuthTabCallbackDefault.J$0 = jLongValue;
                iAuthTabCallbackDefault.label = 2;
                if (getborderradius.emit(unit, iAuthTabCallbackDefault) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public RescheduleReceiver(@NotNull Context context, @Nullable BluetoothAdapter bluetoothAdapter) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackDefault = context;
        this.asBinder = bluetoothAdapter;
        this.getInterfaceDescriptor = 5000L;
        this.onUnminimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.scanner.TossBleScanner$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallback = RescheduleReceiver.IAuthTabCallback();
                int i4 = onNavigationEvent + 19;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return textFieldPressGestureFilterKtExternalSyntheticLambda0IAuthTabCallback;
                }
                throw null;
            }
        });
        this.access000 = Long.MAX_VALUE;
        this.access100 = -1L;
        this.onRelationshipValidationResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.scanner.TossBleScanner$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                IABLandingPageActivity5 iABLandingPageActivity5OnExtraCallbackWithResult = RescheduleReceiver.onExtraCallbackWithResult();
                if (i3 == 0) {
                    int i4 = 40 / 0;
                }
                return iABLandingPageActivity5OnExtraCallbackWithResult;
            }
        });
        TTAppOpenAdActivity5 tTAppOpenAdActivity5OnExtraCallback = new TTAppOpenAdActivity5.onNavigationEvent().onWarmupCompleted(false).onExtraCallback(700L).IAuthTabCallback(OverwritingInputMerger.onExtraCallbackWithResult.onExtraCallbackWithResult().getScanMode()).onExtraCallback(false).onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(tTAppOpenAdActivity5OnExtraCallback, "");
        this.onMessageChannelReady = tTAppOpenAdActivity5OnExtraCallback;
        getBorderRadius<WorkerUpdaterExternalSyntheticLambda2> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallbackWithResult = getborderradiusOnWarmupCompleted;
        getBorderRadius<Throwable> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted2;
        this.onWarmupCompleted = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        getBorderRadius<Unit> getborderradiusOnWarmupCompleted3 = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onExtraCallback = getborderradiusOnWarmupCompleted3;
        this.asInterface = getborderradiusOnWarmupCompleted;
        this.IAuthTabCallback_Parcel = new onNavigationEvent(getborderradiusOnWarmupCompleted);
        this.IAuthTabCallback = new onExtraCallbackWithResult(getborderradiusOnWarmupCompleted);
        this.ICustomTabsCallback = new onWarmupCompleted(getborderradiusOnWarmupCompleted);
        this.extraCallbackWithResult = getborderradiusOnWarmupCompleted3;
        this.IAuthTabCallbackStub = getborderradiusOnWarmupCompleted2;
        this.readTypedObject = getShine.onWarmupCompleted(0, 0, (CloseableUtils) null, 7, (Object) null);
        this.onActivityResized = new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult);
        this.onMinimized = GeckoHubImp.onNavigationEvent(putChannelInfo.IAuthTabCallback(), 1, (String) null, 2, (Object) null);
        this.extraCallback = new Object();
        this.writeTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ble.scanner.TossBleScanner$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    RescheduleReceiver.IAuthTabCallback(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallback = RescheduleReceiver.IAuthTabCallback(this.f$0);
                int i3 = IAuthTabCallback + 81;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallback;
            }
        });
        this.ICustomTabsCallbackStubProxy = WorkerParameters.APP_STATE_CHANGE;
    }

    public static final /* synthetic */ long IAuthTabCallbackStub(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 23;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        long j = rescheduleReceiver.access100;
        int i5 = i2 + 31;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallback_Parcel(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 5;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return rescheduleReceiver.getInterfaceDescriptor();
        }
        rescheduleReceiver.getInterfaceDescriptor();
        throw null;
    }

    public static final /* synthetic */ DelayMetCommandHandlerExternalSyntheticLambda0 asBinder(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallbackStubProxy = rescheduleReceiver.IAuthTabCallbackStubProxy();
        int i4 = ICustomTabsService + 61;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return delayMetCommandHandlerExternalSyntheticLambda0IAuthTabCallbackStubProxy;
    }

    public static final /* synthetic */ TTAppOpenAdActivity5 asInterface(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 85;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        TTAppOpenAdActivity5 tTAppOpenAdActivity5 = rescheduleReceiver.onMessageChannelReady;
        int i5 = i2 + 59;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return tTAppOpenAdActivity5;
    }

    public static final /* synthetic */ IABLandingPageActivity5 getInterfaceDescriptor(RescheduleReceiver rescheduleReceiver) {
        IABLandingPageActivity5 iABLandingPageActivity5;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 5;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {rescheduleReceiver};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        if (i3 == 0) {
            iABLandingPageActivity5 = (IABLandingPageActivity5) onNavigationEvent(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -469696573, objArr, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 469696580);
            int i4 = 24 / 0;
        } else {
            iABLandingPageActivity5 = (IABLandingPageActivity5) onNavigationEvent(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, -469696573, objArr, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 469696580);
        }
        int i5 = ICustomTabsCallbackStub + 59;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return iABLandingPageActivity5;
    }

    public static final /* synthetic */ getPackageType onExtraCallback(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 123;
        int i3 = i2 % 128;
        ICustomTabsCallbackStub = i3;
        int i4 = i2 % 2;
        getPackageType getpackagetype = rescheduleReceiver.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 21;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return getpackagetype;
    }

    public static final /* synthetic */ long onExtraCallbackWithResult(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 83;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j = rescheduleReceiver.access000;
        int i5 = i2 + 37;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 7;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return Long.valueOf(rescheduleReceiver.getInterfaceDescriptor);
        }
        long j = rescheduleReceiver.getInterfaceDescriptor;
        throw null;
    }

    public static final /* synthetic */ BluetoothAdapter onNavigationEvent(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub;
        int i3 = i2 + 87;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        BluetoothAdapter bluetoothAdapter = rescheduleReceiver.asBinder;
        int i5 = i2 + 101;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return bluetoothAdapter;
    }

    public static final /* synthetic */ Object onNavigationEvent(RescheduleReceiver rescheduleReceiver, long j, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 119;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {rescheduleReceiver, Long.valueOf(j), access13800Var};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        Object objOnNavigationEvent = onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1243904074, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1243904080);
        int i4 = ICustomTabsCallbackStub + 91;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 113;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Long lAccess000 = rescheduleReceiver.access000();
        int i4 = ICustomTabsCallbackStub + 1;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return lAccess000;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(RescheduleReceiver rescheduleReceiver, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 57;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        rescheduleReceiver.access100 = j;
        int i5 = i3 + 79;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
    }

    public static final /* synthetic */ getPackageType onTransact(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 65;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = rescheduleReceiver.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            return getpackagetype;
        }
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(RescheduleReceiver rescheduleReceiver, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 47;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        rescheduleReceiver.IAuthTabCallback(str);
        int i4 = ICustomTabsCallbackStub + 47;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    private final findResAndMsg IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 83;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.onUnminimized.getValue();
        int i4 = ICustomTabsCallbackStub + 47;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            return findresandmsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(TextLinkScopeExternalSyntheticLambda3.Companion.onExtraCallbackWithResult());
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }
    }

    public static final class onExtraCallbackWithResult implements IAnimation<WorkerUpdaterExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: o.RescheduleReceiver$onExtraCallbackWithResult$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements setRipple {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ setRipple onWarmupCompleted;

            /* renamed from: o.RescheduleReceiver$onExtraCallbackWithResult$3$5, reason: invalid class name */
            public static final class AnonymousClass5 extends ContinuationImpl {
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass5(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 99;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass3.this.emit(null, this);
                    int i4 = onExtraCallback + 109;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass3(setRipple setripple) {
                this.onWarmupCompleted = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass5 anonymousClass5;
                int i = 2 % 2;
                if (access13800Var instanceof AnonymousClass5) {
                    int i2 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = ((AnonymousClass5) access13800Var).label;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    anonymousClass5 = (AnonymousClass5) access13800Var;
                    int i4 = anonymousClass5.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        int i5 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            anonymousClass5.label = i4 % Integer.MIN_VALUE;
                        } else {
                            anonymousClass5.label = i4 - 2147483648;
                        }
                    } else {
                        anonymousClass5 = new AnonymousClass5(access13800Var);
                        int i6 = onExtraCallbackWithResult + 25;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
                Object obj3 = anonymousClass5.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i8 = anonymousClass5.label;
                if (i8 == 0) {
                    ResultKt.onNavigationEvent(obj3);
                    setRipple setripple = this.onWarmupCompleted;
                    WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = (WorkerUpdaterExternalSyntheticLambda2) obj;
                    if (!workerUpdaterExternalSyntheticLambda2.onTransact() && workerUpdaterExternalSyntheticLambda2.onNavigationEvent() == RescheduleMigration.BACKGROUND) {
                        anonymousClass5.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$1 = access15400.onNavigationEvent(anonymousClass5);
                        anonymousClass5.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass5.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass5.I$0 = 0;
                        anonymousClass5.label = 1;
                        if (setripple.emit(obj, anonymousClass5) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    ResultKt.onNavigationEvent(obj3);
                }
                Unit unit = Unit.INSTANCE;
                int i11 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 55 / 0;
                }
                return unit;
            }
        }

        public onExtraCallbackWithResult(IAnimation iAnimation) {
            this.onNavigationEvent = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass3(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = IAuthTabCallback + 17;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 47 / 0;
            }
            int i5 = i3 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objCollect;
        }
    }

    public static final class onNavigationEvent implements IAnimation<WorkerUpdaterExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ IAnimation onExtraCallback;

        /* renamed from: o.RescheduleReceiver$onNavigationEvent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements setRipple {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: o.RescheduleReceiver$onNavigationEvent$4$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl {
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass3(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 13;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass4.this.emit(null, this);
                    int i4 = onExtraCallback + 105;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass4(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass3 anonymousClass3;
                int i = 2 % 2;
                if (access13800Var instanceof AnonymousClass3) {
                    int i2 = onNavigationEvent + 41;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = ((AnonymousClass3) access13800Var).label;
                        throw null;
                    }
                    anonymousClass3 = (AnonymousClass3) access13800Var;
                    int i4 = anonymousClass3.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        anonymousClass3.label = i4 - 2147483648;
                    } else {
                        anonymousClass3 = new AnonymousClass3(access13800Var);
                    }
                }
                Object obj2 = anonymousClass3.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i5 = anonymousClass3.label;
                if (i5 != 0) {
                    int i6 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                } else {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    WorkerUpdaterExternalSyntheticLambda2 workerUpdaterExternalSyntheticLambda2 = (WorkerUpdaterExternalSyntheticLambda2) obj;
                    if (!workerUpdaterExternalSyntheticLambda2.onTransact()) {
                        int i7 = onExtraCallbackWithResult + 111;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        if (workerUpdaterExternalSyntheticLambda2.onNavigationEvent() == RescheduleMigration.FOREGROUND) {
                            int i9 = onNavigationEvent + 33;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            anonymousClass3.L$0 = access15400.onNavigationEvent(obj);
                            anonymousClass3.L$1 = access15400.onNavigationEvent(anonymousClass3);
                            anonymousClass3.L$2 = access15400.onNavigationEvent(obj);
                            anonymousClass3.L$3 = access15400.onNavigationEvent(setripple);
                            anonymousClass3.I$0 = 0;
                            anonymousClass3.label = 1;
                            if (setripple.emit(obj, anonymousClass3) == objOnWarmupCompleted) {
                                int i11 = onExtraCallbackWithResult + 25;
                                onNavigationEvent = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i12 = 78 / 0;
                                }
                                return objOnWarmupCompleted;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public onNavigationEvent(IAnimation iAnimation) {
            this.onExtraCallback = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onExtraCallback.collect(new AnonymousClass4(setripple), access13800Var);
            if (objCollect != access14300.onWarmupCompleted()) {
                Unit unit = Unit.INSTANCE;
                int i2 = onNavigationEvent + 15;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objCollect;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements IAnimation<WorkerUpdaterExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ IAnimation onNavigationEvent;

        /* renamed from: o.RescheduleReceiver$onWarmupCompleted$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements setRipple {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ setRipple IAuthTabCallback;

            /* renamed from: o.RescheduleReceiver$onWarmupCompleted$3$4, reason: invalid class name */
            public static final class AnonymousClass4 extends ContinuationImpl {
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;
                int I$0;
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                /* synthetic */ Object result;

                public AnonymousClass4(access13800 access13800Var) {
                    super(access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 3;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    Object objEmit = AnonymousClass3.this.emit(null, this);
                    int i4 = IAuthTabCallback + 73;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objEmit;
                }
            }

            public AnonymousClass3(setRipple setripple) {
                this.IAuthTabCallback = setripple;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, access13800 access13800Var) {
                AnonymousClass4 anonymousClass4;
                int i = 2 % 2;
                if (access13800Var instanceof AnonymousClass4) {
                    anonymousClass4 = (AnonymousClass4) access13800Var;
                    int i2 = anonymousClass4.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        int i3 = onExtraCallback + 43;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            anonymousClass4.label = i2 >>> Integer.MIN_VALUE;
                        } else {
                            anonymousClass4.label = i2 - 2147483648;
                        }
                    } else {
                        anonymousClass4 = new AnonymousClass4(access13800Var);
                        int i4 = onExtraCallback + 31;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
                Object obj2 = anonymousClass4.result;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i6 = anonymousClass4.label;
                if (i6 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    setRipple setripple = this.IAuthTabCallback;
                    if (!(!((WorkerUpdaterExternalSyntheticLambda2) obj).onTransact())) {
                        int i7 = onNavigationEvent + 75;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        anonymousClass4.L$0 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$1 = access15400.onNavigationEvent(anonymousClass4);
                        anonymousClass4.L$2 = access15400.onNavigationEvent(obj);
                        anonymousClass4.L$3 = access15400.onNavigationEvent(setripple);
                        anonymousClass4.I$0 = 0;
                        anonymousClass4.label = 1;
                        if (setripple.emit(obj, anonymousClass4) == objOnWarmupCompleted) {
                            int i9 = onNavigationEvent + 71;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                            return objOnWarmupCompleted;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public onWarmupCompleted(IAnimation iAnimation) {
            this.onNavigationEvent = iAnimation;
        }

        public Object collect(setRipple setripple, access13800 access13800Var) {
            int i = 2 % 2;
            Object objCollect = this.onNavigationEvent.collect(new AnonymousClass3(setripple), access13800Var);
            Object obj = null;
            if (objCollect == access14300.onWarmupCompleted()) {
                int i2 = IAuthTabCallback + 99;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return objCollect;
                }
                obj.hashCode();
                throw null;
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(RescheduleReceiver rescheduleReceiver, WorkDatabase workDatabase, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsService + 125;
        int i4 = i3 % 128;
        ICustomTabsCallbackStub = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 85;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            j = 5000;
        }
        rescheduleReceiver.onExtraCallbackWithResult(workDatabase, j);
    }

    public final void onExtraCallbackWithResult(@NotNull WorkDatabase workDatabase, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 49;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(workDatabase, "");
        this.onActivityLayout = workDatabase;
        this.getInterfaceDescriptor = j;
        int i4 = ICustomTabsCallbackStub + 101;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final findResAndMsg IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = ICustomTabsService + 17;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return findresandmsgIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 123;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IABLandingPageActivity5 iABLandingPageActivity5 = (IABLandingPageActivity5) rescheduleReceiver.onRelationshipValidationResult.getValue();
        if (i3 == 0) {
            return iABLandingPageActivity5;
        }
        throw null;
    }

    private static final IABLandingPageActivity5 readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 41;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        IABLandingPageActivity5 iABLandingPageActivity5OnNavigationEvent = IABLandingPageActivity5.onNavigationEvent();
        int i4 = ICustomTabsCallbackStub + 75;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return iABLandingPageActivity5OnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 97;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getTileModeX<WorkerUpdaterExternalSyntheticLambda2> gettilemodex = rescheduleReceiver.asInterface;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 13;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return gettilemodex;
        }
        obj.hashCode();
        throw null;
    }

    public final IAnimation<WorkerUpdaterExternalSyntheticLambda2> asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 77;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IAnimation<WorkerUpdaterExternalSyntheticLambda2> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final IAnimation<WorkerUpdaterExternalSyntheticLambda2> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 111;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    public final getTileModeX<Unit> asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        getTileModeX<Unit> gettilemodex = this.extraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return gettilemodex;
    }

    public final getTileModeX<Throwable> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 115;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    private final DelayMetCommandHandlerExternalSyntheticLambda0 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 111;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = (DelayMetCommandHandlerExternalSyntheticLambda0) this.writeTypedObject.getValue();
        int i3 = ICustomTabsCallbackStub + 25;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        return delayMetCommandHandlerExternalSyntheticLambda0;
    }

    private static final DelayMetCommandHandlerExternalSyntheticLambda0 IAuthTabCallbackStubProxy(RescheduleReceiver rescheduleReceiver) {
        int i = 2 % 2;
        DelayMetCommandHandlerExternalSyntheticLambda0 delayMetCommandHandlerExternalSyntheticLambda0 = new DelayMetCommandHandlerExternalSyntheticLambda0(rescheduleReceiver.IAuthTabCallbackDefault, rescheduleReceiver.IAuthTabCallback_Parcel(), rescheduleReceiver.onExtraCallbackWithResult, rescheduleReceiver.onNavigationEvent, rescheduleReceiver.readTypedObject);
        WorkDatabase workDatabase = rescheduleReceiver.onActivityLayout;
        Object obj = null;
        if (workDatabase != null) {
            int i2 = ICustomTabsService + 21;
            ICustomTabsCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (workDatabase == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                workDatabase = null;
            }
            delayMetCommandHandlerExternalSyntheticLambda0.IAuthTabCallback(workDatabase);
        }
        int i3 = ICustomTabsService + 35;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return delayMetCommandHandlerExternalSyntheticLambda0;
        }
        throw null;
    }

    private final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 83;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = InstallReferrerClientImplClientState.IAuthTabCallback.onExtraCallbackWithResult();
        int i4 = ICustomTabsService + 99;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@NotNull WorkerParameters workerParameters) throws Throwable {
        Intrinsics.checkNotNullParameter(workerParameters, "");
        if (!getInterfaceDescriptor()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "ForegroundScan not Start, app is Background", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return;
        }
        synchronized (this.extraCallback) {
            this.ICustomTabsCallbackStubProxy = workerParameters;
            IAuthTabCallback("Foreground scan started");
            this.IAuthTabCallbackStubProxy = maybeUpdateAnimatable.onNavigationEvent(IAuthTabCallback_Parcel(), this.onMinimized.plus(this.onActivityResized), (setRandomHost) null, new asBinder(null), 2, (Object) null);
            Unit unit = Unit.INSTANCE;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = RescheduleReceiver.this.new asBinder(access13800Var);
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 45 / 0;
            }
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0 ? i4 == 1 : i4 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    int i6 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = {RescheduleReceiver.this};
                    int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                    long jLongValue = ((Long) RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 63044735, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -63044735)).longValue();
                    this.label = 2;
                    if (formatMsgs.onWarmupCompleted(jLongValue, this) != objOnWarmupCompleted) {
                        if (RescheduleReceiver.IAuthTabCallback_Parcel(RescheduleReceiver.this)) {
                            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "ForegroundScan canceled, app is Background", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                            Unit unit = Unit.INSTANCE;
                            int i8 = onWarmupCompleted + 31;
                            onExtraCallbackWithResult = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Foreground scan started", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                        RescheduleReceiver rescheduleReceiver = RescheduleReceiver.this;
                        this.label = 1;
                        if (RescheduleReceiver.onNavigationEvent(rescheduleReceiver, 30000L, this) != objOnWarmupCompleted) {
                            Object[] objArr2 = {RescheduleReceiver.this};
                            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                            long jLongValue2 = ((Long) RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 63044735, objArr2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -63044735)).longValue();
                            this.label = 2;
                            if (formatMsgs.onWarmupCompleted(jLongValue2, this) != objOnWarmupCompleted) {
                            }
                        }
                    }
                    return objOnWarmupCompleted;
                }
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.onNavigationEvent(obj);
            if (RescheduleReceiver.IAuthTabCallback_Parcel(RescheduleReceiver.this)) {
            }
        }
    }

    public final void IAuthTabCallback(@NotNull List<Integer> list, @NotNull WorkerParameters workerParameters) throws Throwable {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        if (getInterfaceDescriptor()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Background scan not Start, app is Foreground", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return;
        }
        synchronized (this.extraCallback) {
            this.ICustomTabsCallbackStubProxy = workerParameters;
            IAuthTabCallback("Background scan started");
            this.onTransact = ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(ycxycx.onExtraCallback(CollectionsKt.asSequence(list)), new IAuthTabCallbackStub(null)), findRes.IAuthTabCallback(IAuthTabCallback_Parcel(), this.onMinimized));
            this.onPostMessage = ycxycx.onWarmupCompleted(ycxycx.IAuthTabCallback(ycxycx.onExtraCallback(this.readTypedObject, 5000L), new asInterface(null)), findRes.IAuthTabCallback(IAuthTabCallback_Parcel(), this.onMinimized));
            Unit unit = Unit.INSTANCE;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<Integer, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        /* synthetic */ int I$0;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = RescheduleReceiver.this.new IAuthTabCallbackStub(access13800Var);
            iAuthTabCallbackStub.I$0 = ((Number) obj).intValue();
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(((Number) obj).intValue(), (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(int i, access13800<? super Unit> access13800Var) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(Integer.valueOf(i), access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r1 * 60000, r14) == r2) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
            String str;
            String str2;
            Map map;
            String str3;
            boolean z;
            String str4;
            int i;
            int i2 = 2 % 2;
            int i3 = this.I$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!RescheduleReceiver.IAuthTabCallback_Parcel(RescheduleReceiver.this)) {
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Background scan started", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    RescheduleReceiver rescheduleReceiver = RescheduleReceiver.this;
                    this.I$0 = i3;
                    this.label = 1;
                    if (RescheduleReceiver.onNavigationEvent(rescheduleReceiver, 240000L, this) != objOnWarmupCompleted) {
                    }
                    return objOnWarmupCompleted;
                }
                int i5 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "TossBleScanner";
                    str2 = "Background scan canceled, app is Foreground";
                    map = null;
                    str3 = null;
                    z = true;
                    str4 = null;
                    i = 21;
                } else {
                    convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    str = "TossBleScanner";
                    str2 = "Background scan canceled, app is Foreground";
                    map = null;
                    str3 = null;
                    z = false;
                    str4 = null;
                    i = 60;
                }
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, str, str2, map, str3, z, str4, i, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i6 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }
            int i8 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0 ? i4 != 1 : i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            int i9 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 / 3;
            }
            this.I$0 = i3;
            this.label = 2;
        }
    }

    static final class asInterface extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = RescheduleReceiver.this.new asInterface(access13800Var);
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return asinterface;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((Unit) obj, (access13800) obj2);
            int i4 = onExtraCallback + 55;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 44 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(Unit unit, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(unit, access13800Var);
            if (i3 != 0) {
                return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 19 / 0;
            return asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[PHI: r5
          0x003f: PHI (r5v1 long) = (r5v0 long), (r5v3 long) binds: [B:10:0x003d, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jCurrentTimeMillis;
            Boolean boolOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 79;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i2 + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > RescheduleReceiver.onExtraCallbackWithResult(RescheduleReceiver.this) * 20000) {
                    int i7 = onWarmupCompleted + 91;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    if (RescheduleReceiver.IAuthTabCallbackStub(RescheduleReceiver.this) > 600000 + jCurrentTimeMillis) {
                        int i9 = onWarmupCompleted + 87;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        RescheduleReceiver.onNavigationEvent(RescheduleReceiver.this, jCurrentTimeMillis);
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        long jOnExtraCallbackWithResult = RescheduleReceiver.onExtraCallbackWithResult(RescheduleReceiver.this);
                        getPackageType getpackagetypeOnTransact = RescheduleReceiver.onTransact(RescheduleReceiver.this);
                        Boolean boolOnNavigationEvent2 = null;
                        if (getpackagetypeOnTransact != null) {
                            boolOnNavigationEvent = access14000.onNavigationEvent(getpackagetypeOnTransact.onExtraCallback());
                        } else {
                            int i11 = onExtraCallback + 47;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            boolOnNavigationEvent = null;
                        }
                        getPackageType getpackagetypeOnExtraCallback = RescheduleReceiver.onExtraCallback(RescheduleReceiver.this);
                        if (getpackagetypeOnExtraCallback != null) {
                            int i13 = onWarmupCompleted + 11;
                            onExtraCallback = i13 % 128;
                            int i14 = i13 % 2;
                            boolOnNavigationEvent2 = access14000.onNavigationEvent(getpackagetypeOnExtraCallback.onExtraCallback());
                        }
                        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossBleScanner", "Background scan not Stopped, 종료 예정 시간 " + jOnExtraCallbackWithResult + ", 현재 시간 " + jCurrentTimeMillis + " foreground " + boolOnNavigationEvent + ", background " + boolOnNavigationEvent2, (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    }
                    Object[] objArr = {RescheduleReceiver.this};
                    RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -469798919, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 469798923);
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > RescheduleReceiver.onExtraCallbackWithResult(RescheduleReceiver.this) + 20000) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(rescheduleReceiver.IAuthTabCallback_Parcel(), rescheduleReceiver.onMinimized, (setRandomHost) null, rescheduleReceiver.new IAuthTabCallbackStubProxy(null), 2, (Object) null);
        int i2 = ICustomTabsCallbackStub + 97;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = RescheduleReceiver.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return iAuthTabCallbackStubProxy;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {RescheduleReceiver.this};
                Long l = (Long) RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -825854032, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 825854035);
                if (l != null) {
                    long jLongValue = l.longValue();
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "Scan stopped after " + jLongValue + "ms", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                }
                RescheduleReceiver.onWarmupCompleted(RescheduleReceiver.this, "Scan stopped");
                RescheduleReceiver rescheduleReceiver = RescheduleReceiver.this;
                this.label = 1;
                if (RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1301379802, new Object[]{rescheduleReceiver, this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1301379801) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 83;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = IAuthTabCallback + 91;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final Long access000() {
        int i = 2 % 2;
        long j = this.ICustomTabsCallbackDefault;
        if (j != 0) {
            this.ICustomTabsCallbackDefault = 0L;
            return Long.valueOf(System.currentTimeMillis() - j);
        }
        int i2 = ICustomTabsCallbackStub + 59;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 71;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 121;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = this.IAuthTabCallbackStubProxy;
        if (getpackagetype != null && getpackagetype.onExtraCallback()) {
            int i4 = ICustomTabsService + 29;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            getPackageType getpackagetype2 = this.IAuthTabCallbackStubProxy;
            if (getpackagetype2 != null) {
                getpackagetype2.onNavigationEvent(new CancellationException(str));
            }
        }
        getPackageType getpackagetype3 = this.onTransact;
        Object obj = null;
        if (getpackagetype3 != null) {
            int i6 = ICustomTabsCallbackStub + 29;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            if (getpackagetype3.onExtraCallback()) {
                int i8 = ICustomTabsService + 125;
                ICustomTabsCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                getPackageType getpackagetype4 = this.onTransact;
                if (getpackagetype4 != null) {
                    getpackagetype4.onNavigationEvent(new CancellationException(str));
                }
            }
        }
        this.access000 = Long.MAX_VALUE;
        getPackageType getpackagetype5 = this.onPostMessage;
        if (getpackagetype5 != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype5, (CancellationException) null, 1, (Object) null);
        }
    }

    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        TTAppOpenAdActivity.onExtraCallbackWithResult onextracallbackwithresult = new TTAppOpenAdActivity.onExtraCallbackWithResult();
        ParcelUuid parcelUuidFromString = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
        OverwritingInputMerger overwritingInputMerger = OverwritingInputMerger.onExtraCallbackWithResult;
        byte[] bytes = overwritingInputMerger.asInterface().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        List listListOf = CollectionsKt.listOf(new TTAppOpenAdActivity[]{onextracallbackwithresult.onWarmupCompleted(parcelUuidFromString, bytes).onNavigationEvent(), new TTAppOpenAdActivity.onExtraCallbackWithResult().IAuthTabCallback(overwritingInputMerger.onWarmupCompleted()).onNavigationEvent(), new TTAppOpenAdActivity.onExtraCallbackWithResult().IAuthTabCallback(ParcelUuid.fromString(overwritingInputMerger.IAuthTabCallbackDefault())).onNavigationEvent(), new TTAppOpenAdActivity.onExtraCallbackWithResult().IAuthTabCallback(ParcelUuid.fromString("0000705f-0000-1000-8000-00805f9b34fb")).onNavigationEvent()});
        WorkDatabase workDatabase = this.onActivityLayout;
        if (workDatabase == null) {
            int i2 = ICustomTabsCallbackStub + 97;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            workDatabase = null;
        }
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(this.onMinimized, new onTransact(CollectionsKt.plus(listListOf, workDatabase == WorkDatabase.PLACE ? CollectionsKt.listOf(new TTAppOpenAdActivity.onExtraCallbackWithResult().onExtraCallbackWithResult(76, (byte[]) null).onNavigationEvent()) : CollectionsKt.emptyList()), null), access13800Var);
        if (objOnExtraCallback != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i3 = ICustomTabsService + 23;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ List<TTAppOpenAdActivity> $filters;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(List<TTAppOpenAdActivity> list, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$filters = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = RescheduleReceiver.this.new onTransact(this.$filters, access13800Var);
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[PHI: r1
          0x0043: PHI (r1v14 java.lang.Object) = (r1v4 java.lang.Object), (r1v15 java.lang.Object) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r3
          0x0023: PHI (r3v1 int) = (r3v0 int), (r3v7 int) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            BluetoothAdapter bluetoothAdapterOnNavigationEvent;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 1 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    RescheduleReceiver rescheduleReceiver = RescheduleReceiver.this;
                    this.label = 1;
                    int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                    if (RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1301379802, new Object[]{rescheduleReceiver, this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1301379801) == objOnWarmupCompleted) {
                        int i5 = onNavigationEvent + 61;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 35 / 0;
                        }
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = onNavigationEvent + 79;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                    int i9 = onNavigationEvent + 43;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            try {
                bluetoothAdapterOnNavigationEvent = RescheduleReceiver.onNavigationEvent(RescheduleReceiver.this);
            } catch (Exception unused) {
            }
            if (bluetoothAdapterOnNavigationEvent != null) {
                int i11 = IAuthTabCallback + 85;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                if (bluetoothAdapterOnNavigationEvent.isEnabled()) {
                    RescheduleReceiver.getInterfaceDescriptor(RescheduleReceiver.this).onNavigationEvent(this.$filters, RescheduleReceiver.asInterface(RescheduleReceiver.this), RescheduleReceiver.asBinder(RescheduleReceiver.this));
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            getInterfaceDescriptor getinterfacedescriptor = RescheduleReceiver.this.new getInterfaceDescriptor(access13800Var);
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return getinterfacedescriptor;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getInterfaceDescriptor getinterfacedescriptorCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                getinterfacedescriptorCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = getinterfacedescriptorCreate.invokeSuspend(unit);
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                RescheduleReceiver.getInterfaceDescriptor(RescheduleReceiver.this).onWarmupCompleted(RescheduleReceiver.asBinder(RescheduleReceiver.this));
                RescheduleReceiver.asBinder(RescheduleReceiver.this).IAuthTabCallback();
                int i3 = onWarmupCompleted + 93;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TossBleScanner", "fail stop scan " + e, (Map) null, (String) null, false, (String) null, 60, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = onExtraCallback + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 19 / 0;
            }
            return unit;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RescheduleReceiver rescheduleReceiver = (RescheduleReceiver) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(rescheduleReceiver.onMinimized, rescheduleReceiver.new getInterfaceDescriptor(null), (access13800) objArr[1]);
        if (objOnExtraCallback == access14300.onWarmupCompleted()) {
            int i2 = ICustomTabsCallbackStub + 37;
            ICustomTabsService = i2 % 128;
            if (i2 % 2 != 0) {
                return objOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsService + 25;
        ICustomTabsCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static final /* synthetic */ Long onWarmupCompleted(RescheduleReceiver rescheduleReceiver) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (Long) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -825854032, new Object[]{rescheduleReceiver}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 825854035);
    }

    public static final /* synthetic */ long IAuthTabCallbackDefault(RescheduleReceiver rescheduleReceiver) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 63044735, new Object[]{rescheduleReceiver}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -63044735)).longValue();
    }

    private final IABLandingPageActivity5 access100() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (IABLandingPageActivity5) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -469696573, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 469696580);
    }

    private static final TextFieldPressGestureFilterKtExternalSyntheticLambda0 writeTypedObject() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (TextFieldPressGestureFilterKtExternalSyntheticLambda0) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1494214509, new Object[0], QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1494214507);
    }

    private final Object onNavigationEvent(long j, access13800<? super Unit> access13800Var) {
        Object[] objArr = {this, Long.valueOf(j), access13800Var};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1243904074, objArr, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1243904080);
    }

    public final getTileModeX<WorkerUpdaterExternalSyntheticLambda2> onExtraCallback() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (getTileModeX) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -425808505, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 425808510);
    }

    public final void onTransact() throws Throwable {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -469798919, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 469798923);
    }

    public final Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1301379802, new Object[]{this, access13800Var}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1301379801);
    }
}
