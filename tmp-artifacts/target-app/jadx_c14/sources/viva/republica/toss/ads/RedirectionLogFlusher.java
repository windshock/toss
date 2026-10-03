package viva.republica.toss.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionLogFlusher {
    public static final Companion Companion = new Companion(null);
    public static final int onExtraCallback = 8;
    private final RedirectionLogStore onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private final RedirectionEventApi onWarmupCompleted;

    @Inject
    public RedirectionLogFlusher(@NotNull RedirectionLogStore redirectionLogStore, @NotNull RedirectionEventApi redirectionEventApi) {
        Intrinsics.checkNotNullParameter(redirectionLogStore, "");
        Intrinsics.checkNotNullParameter(redirectionEventApi, "");
        this.onExtraCallbackWithResult = redirectionLogStore;
        this.onWarmupCompleted = redirectionEventApi;
        this.onNavigationEvent = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Integer> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof viva.republica.toss.ads.RedirectionLogFlusher$maxRetryCount$1
            if (r0 == 0) goto L13
            r0 = r12
            viva.republica.toss.ads.RedirectionLogFlusher$maxRetryCount$1 r0 = (viva.republica.toss.ads.RedirectionLogFlusher$maxRetryCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.ads.RedirectionLogFlusher$maxRetryCount$1 r0 = new viva.republica.toss.ads.RedirectionLogFlusher$maxRetryCount$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.onNavigationEvent(r12)
            goto L64
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.ResultKt.onNavigationEvent(r12)
            o.LifecyclesKtawaitStarted21 r12 = o.LifecyclesKtawaitStarted21.IAuthTabCallback
            r2 = 20
            java.lang.Integer r2 = o.access14000.onNavigationEvent(r2)
            r0.label = r3
            java.lang.String r3 = "ads.log.retryCount"
            java.lang.Object[] r4 = new java.lang.Object[]{r12, r3, r2, r0}
            int r10 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r7 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r8 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            int r6 = o.GeckoHubImp.IAuthTabCallback.IAuthTabCallback()
            r5 = 324853779(0x135ce013, float:2.7878381E-27)
            r9 = -324853779(0xffffffffeca31fed, float:-1.5776454E27)
            java.lang.Object r12 = o.LifecyclesKtawaitStarted21.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            java.lang.Object r0 = (java.lang.Object) r0
            if (r12 != r1) goto L64
            return r1
        L64:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r0 = 0
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast(r12, r0)
            java.lang.Integer r12 = o.access14000.onNavigationEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogFlusher.onExtraCallback(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0041, B:42:0x0129, B:46:0x0137, B:18:0x0068, B:33:0x00e4, B:35:0x00ec, B:28:0x00aa, B:30:0x00b0, B:38:0x0100, B:36:0x00f4, B:24:0x0082, B:26:0x008e, B:27:0x0094), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0041, B:42:0x0129, B:46:0x0137, B:18:0x0068, B:33:0x00e4, B:35:0x00ec, B:28:0x00aa, B:30:0x00b0, B:38:0x0100, B:36:0x00f4, B:24:0x0082, B:26:0x008e, B:27:0x0094), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0041, B:42:0x0129, B:46:0x0137, B:18:0x0068, B:33:0x00e4, B:35:0x00ec, B:28:0x00aa, B:30:0x00b0, B:38:0x0100, B:36:0x00f4, B:24:0x0082, B:26:0x008e, B:27:0x0094), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0041, B:42:0x0129, B:46:0x0137, B:18:0x0068, B:33:0x00e4, B:35:0x00ec, B:28:0x00aa, B:30:0x00b0, B:38:0x0100, B:36:0x00f4, B:24:0x0082, B:26:0x008e, B:27:0x0094), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:33:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogFlusher.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(viva.republica.toss.ads.RedirectionLogRecord r9, o.access13800<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof viva.republica.toss.ads.RedirectionLogFlusher$trySend$1
            if (r0 == 0) goto L13
            r0 = r10
            viva.republica.toss.ads.RedirectionLogFlusher$trySend$1 r0 = (viva.republica.toss.ads.RedirectionLogFlusher$trySend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.ads.RedirectionLogFlusher$trySend$1 r0 = new viva.republica.toss.ads.RedirectionLogFlusher$trySend$1
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = o.access14300.onWarmupCompleted()
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L3a
            if (r1 != r7) goto L32
            java.lang.Object r9 = r6.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.L$0
            viva.republica.toss.ads.RedirectionLogRecord r9 = (viva.republica.toss.ads.RedirectionLogRecord) r9
            kotlin.ResultKt.onNavigationEvent(r10)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            goto L6f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.ResultKt.onNavigationEvent(r10)
            o.CommonModule_closeView r10 = o.CommonModule_closeView.onWarmupCompleted
            o.IdGeneratorExternalSyntheticLambda1 r10 = r10.getInterfaceDescriptor()
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r4 = r10.format(r1)
            viva.republica.toss.ads.RedirectionEventApi r1 = r8.onWarmupCompleted     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            long r2 = r9.IAuthTabCallbackDefault()     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            java.util.Map r5 = r9.IAuthTabCallback()     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            java.lang.Object r9 = o.access15400.onNavigationEvent(r9)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            r6.L$0 = r9     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            java.lang.Object r9 = o.access15400.onNavigationEvent(r4)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            r6.L$1 = r9     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            r6.label = r7     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            java.lang.Object r9 = r1.onExtraCallback(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L74
            if (r9 != r0) goto L6f
            return r0
        L6e:
            r7 = 0
        L6f:
            java.lang.Boolean r9 = o.access14000.onNavigationEvent(r7)
            return r9
        L74:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogFlusher.onWarmupCompleted(viva.republica.toss.ads.RedirectionLogRecord, o.access13800):java.lang.Object");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
