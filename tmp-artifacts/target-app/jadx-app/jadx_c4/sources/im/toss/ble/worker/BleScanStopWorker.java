package im.toss.ble.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.RescheduleReceiver;
import o.access13800;
import o.access14300;
import o.findRes;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BleScanStopWorker extends CoroutineWorker {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final RescheduleReceiver onExtraCallback;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = BleScanStopWorker.this.doWork(this);
            int i4 = onWarmupCompleted + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return objDoWork;
        }
    }

    static {
        int i = onWarmupCompleted + 65;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleScanStopWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull RescheduleReceiver rescheduleReceiver) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(rescheduleReceiver, "");
        this.onExtraCallback = rescheduleReceiver;
    }

    public static final /* synthetic */ RescheduleReceiver onExtraCallback(BleScanStopWorker bleScanStopWorker) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        RescheduleReceiver rescheduleReceiver = bleScanStopWorker.onExtraCallback;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return rescheduleReceiver;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            throw null;
        }
        if (!(access13800Var instanceof onExtraCallbackWithResult)) {
            onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
        } else {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    onextracallbackwithresult.label = i3 - Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i3 - 2147483648;
                }
            }
        }
        Object objOnExtraCallbackWithResult = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            onNavigationEvent onnavigationevent = new onNavigationEvent(null);
            onextracallbackwithresult.label = 1;
            objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(onnavigationevent, onextracallbackwithresult);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                int i6 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                int i9 = 36 / 0;
            } else {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            }
        }
        Intrinsics.checkNotNullExpressionValue(objOnExtraCallbackWithResult, "");
        return objOnExtraCallbackWithResult;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ListenableWorker.onExtraCallbackWithResult>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = BleScanStopWorker.this.new onNavigationEvent(access13800Var);
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[PHI: r1
          0x0051: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r4
          0x0025: PHI (r4v1 int) = (r4v0 int), (r4v5 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 58 / 0;
                if (i != 0) {
                    int i5 = IAuthTabCallback;
                    int i6 = i5 + 65;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0 ? i != 1 : i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i5 + 89;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SCAN_STOP_WORKER", "stop Scan", (Map) null, (String) null, false, (String) null, 60, (Object) null);
                    RescheduleReceiver rescheduleReceiverOnExtraCallback = BleScanStopWorker.onExtraCallback(BleScanStopWorker.this);
                    this.label = 1;
                    int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
                    if (RescheduleReceiver.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1301379802, new Object[]{rescheduleReceiverOnExtraCallback, this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1301379801) == objOnWarmupCompleted) {
                        int i8 = onExtraCallbackWithResult;
                        int i9 = i8 + 1;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = i8 + 59;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return ListenableWorker.onExtraCallbackWithResult.onExtraCallback();
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
