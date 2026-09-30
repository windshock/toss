package im.toss.ads_sdk.log;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ToggleableAppBarItemExternalSyntheticLambda2;
import o.TooltipKtExternalSyntheticLambda3;
import o.TooltipKtExternalSyntheticLambda4;
import o.TooltipKtTooltipBoxwrappedContent1ExternalSyntheticLambda0;
import o.Tooltip_androidKtExternalSyntheticLambda0;
import o.TopAppBarStateExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.pageScrolled;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsTrackingFlushWorker extends CoroutineWorker {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private final pageScrolled onExtraCallbackWithResult;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objDoWork = NativeAdsTrackingFlushWorker.this.doWork(this);
            int i4 = IAuthTabCallback + 107;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objDoWork;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 47;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdsTrackingFlushWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull pageScrolled pagescrolled) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(pagescrolled, "");
        this.onExtraCallbackWithResult = pagescrolled;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull access13800<? super ListenableWorker.onExtraCallbackWithResult> access13800Var) throws NoWhenBranchMatchedException {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback.label;
        if (i3 != 0) {
            int i4 = onNavigationEvent + 119;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i5 + 117;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        } else {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            pageScrolled pagescrolled = this.onExtraCallbackWithResult;
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = pagescrolled.IAuthTabCallback((access13800<? super pageScrolled.IAuthTabCallback>) iAuthTabCallback);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i9 = onTransact + 105;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return objOnWarmupCompleted;
            }
        }
        pageScrolled.IAuthTabCallback iAuthTabCallback2 = (pageScrolled.IAuthTabCallback) objIAuthTabCallback;
        if (Intrinsics.areEqual(iAuthTabCallback2, pageScrolled.IAuthTabCallback.onNavigationEvent.IAuthTabCallback)) {
            int i11 = onNavigationEvent + 1;
            onTransact = i11 % 128;
            if (i11 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted(), "");
                throw null;
            }
            ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnWarmupCompleted, "");
            return onextracallbackwithresultOnWarmupCompleted;
        }
        if (!(iAuthTabCallback2 instanceof pageScrolled.IAuthTabCallback.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        ListenableWorker.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted2 = ((pageScrolled.IAuthTabCallback.onWarmupCompleted) iAuthTabCallback2).onWarmupCompleted() ? ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted() : ListenableWorker.onExtraCallbackWithResult.onExtraCallback();
        Intrinsics.checkNotNull(onextracallbackwithresultOnWarmupCompleted2);
        int i12 = onNavigationEvent + 51;
        onTransact = i12 % 128;
        int i13 = i12 % 2;
        return onextracallbackwithresultOnWarmupCompleted2;
    }

    public static final class onExtraCallbackWithResult {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onextracallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(NativeAdsTrackingFlushWorker.class);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback("NativeAdsTrackingFlushWork", TooltipKtExternalSyntheticLambda3.KEEP, onextracallback.onExtraCallbackWithResult(5L, timeUnit).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 15L, timeUnit).onExtraCallback(new TooltipKtExternalSyntheticLambda4.onExtraCallback().onWarmupCompleted(TooltipKtTooltipBoxwrappedContent1ExternalSyntheticLambda0.CONNECTED).onExtraCallbackWithResult()).asBinder());
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }
}
