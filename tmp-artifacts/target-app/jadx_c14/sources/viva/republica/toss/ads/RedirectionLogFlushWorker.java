package viva.republica.toss.ads;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.TimeUnit;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionLogFlushWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    public static final int onWarmupCompleted = 8;
    private final RedirectionLogFlusher onExtraCallback;

    /* renamed from: viva.republica.toss.ads.RedirectionLogFlushWorker$doWork$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(access13800<? super AnonymousClass1> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RedirectionLogFlushWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectionLogFlushWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull RedirectionLogFlusher redirectionLogFlusher) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(redirectionLogFlusher, "");
        this.onExtraCallback = redirectionLogFlusher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull o.access13800<? super androidx.work.ListenableWorker.onExtraCallbackWithResult> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof viva.republica.toss.ads.RedirectionLogFlushWorker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            viva.republica.toss.ads.RedirectionLogFlushWorker$doWork$1 r0 = (viva.republica.toss.ads.RedirectionLogFlushWorker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.ads.RedirectionLogFlushWorker$doWork$1 r0 = new viva.republica.toss.ads.RedirectionLogFlushWorker$doWork$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.onNavigationEvent(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.onNavigationEvent(r5)
            viva.republica.toss.ads.RedirectionLogFlusher r5 = r4.onExtraCallback
            r0.label = r3
            java.lang.Object r5 = r5.onWarmupCompleted(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            androidx.work.ListenableWorker$onExtraCallbackWithResult r5 = androidx.work.ListenableWorker.onExtraCallbackWithResult.onWarmupCompleted()
            java.lang.String r0 = "retry(...)"
            goto L54
        L4e:
            androidx.work.ListenableWorker$onExtraCallbackWithResult r5 = androidx.work.ListenableWorker.onExtraCallbackWithResult.onExtraCallback()
            java.lang.String r0 = "success(...)"
        L54:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogFlushWorker.doWork(o.access13800):java.lang.Object");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void onNavigationEvent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback onextracallback = new Tooltip_androidKtExternalSyntheticLambda0.onExtraCallback(RedirectionLogFlushWorker.class);
            TimeUnit timeUnit = TimeUnit.MINUTES;
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).IAuthTabCallback("RedirectionLogFlushWork", TooltipKtExternalSyntheticLambda3.KEEP, onextracallback.onExtraCallbackWithResult(5L, timeUnit).onExtraCallback(ToggleableAppBarItemExternalSyntheticLambda2.EXPONENTIAL, 15L, timeUnit).onExtraCallback(new TooltipKtExternalSyntheticLambda4.onExtraCallback().onWarmupCompleted(TooltipKtTooltipBoxwrappedContent1ExternalSyntheticLambda0.CONNECTED).onExtraCallbackWithResult()).asBinder());
        }
    }
}
