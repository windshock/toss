package im.toss.core.tracker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GetFeatureExtension;
import o.InstallReferrerClientImplClientState;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda3;
import o.TooltipKtExternalSyntheticLambda4;
import o.TooltipKtTooltipBoxwrappedContent1ExternalSyntheticLambda0;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogFlushWorker extends CoroutineWorker {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = LogFlushWorker.this.doWork(this);
            int i4 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objDoWork;
        }
    }

    static {
        int i = onWarmupCompleted + 115;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogFlushWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (!(access13800Var instanceof onWarmupCompleted)) {
            onwarmupcompleted = new onWarmupCompleted(access13800Var);
        } else {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
                int i3 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (InstallReferrerClientImplClientState.IAuthTabCallback.onExtraCallbackWithResult()) {
                int i6 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i6 % 128;
                Object obj2 = null;
                if (i6 % 2 == 0) {
                    Intrinsics.checkNotNullExpressionValue(ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted(), "");
                    obj2.hashCode();
                    throw null;
                }
                ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted();
                Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnWarmupCompleted, "");
                int i7 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    return onextracallbackwithresultOnWarmupCompleted;
                }
                obj2.hashCode();
                throw null;
            }
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            onwarmupcompleted.label = 1;
            if (getFeatureExtension.onExtraCallbackWithResult((access13800<? super Unit>) onwarmupcompleted) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i8 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
        }
        ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = ListenableWorker.onExtraCallbackWithResult.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnExtraCallback, "");
        return onextracallbackwithresultOnExtraCallback;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onextracallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(LogFlushWorker.class);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback("TossTracker-Flush-Work", TooltipKtExternalSyntheticLambda3.REPLACE, onextracallback.onExtraCallbackWithResult(5L, timeUnit).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 15L, timeUnit).onExtraCallback(new TooltipKtExternalSyntheticLambda4.onExtraCallback().onWarmupCompleted(TooltipKtTooltipBoxwrappedContent1ExternalSyntheticLambda0.CONNECTED).onExtraCallbackWithResult()).asBinder());
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }
}
