package viva.republica.toss.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RedirectionLogFlushScheduler {
    private final RedirectionLogFlusher onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private final AtomicBoolean onWarmupCompleted;

    @Inject
    public RedirectionLogFlushScheduler(@NotNull Context context, @NotNull RedirectionLogFlusher redirectionLogFlusher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(redirectionLogFlusher, "");
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = redirectionLogFlusher;
        this.onNavigationEvent = new AtomicBoolean(false);
        this.onWarmupCompleted = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (onExtraCallback(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #0 {all -> 0x008f, blocks: (B:15:0x0035, B:23:0x005b, B:25:0x0063, B:26:0x006a, B:21:0x004c), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: all -> 0x008f, PHI: r7
      0x005b: PHI (r7v10 java.lang.Object) = (r7v9 java.lang.Object), (r7v1 java.lang.Object) binds: [B:22:0x0059, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x008f, blocks: (B:15:0x0035, B:23:0x005b, B:25:0x0063, B:26:0x006a, B:21:0x004c), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:15:0x0035, B:23:0x005b, B:25:0x0063, B:26:0x006a, B:21:0x004c), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:23:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof viva.republica.toss.ads.RedirectionLogFlushScheduler$flushNowAndScheduleRetryIfNeeded$1
            if (r0 == 0) goto L13
            r0 = r7
            viva.republica.toss.ads.RedirectionLogFlushScheduler$flushNowAndScheduleRetryIfNeeded$1 r0 = (viva.republica.toss.ads.RedirectionLogFlushScheduler$flushNowAndScheduleRetryIfNeeded$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            viva.republica.toss.ads.RedirectionLogFlushScheduler$flushNowAndScheduleRetryIfNeeded$1 r0 = new viva.republica.toss.ads.RedirectionLogFlushScheduler$flushNowAndScheduleRetryIfNeeded$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.onNavigationEvent(r7)
            goto L88
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Throwable -> L8f
            goto L5b
        L39:
            kotlin.ResultKt.onNavigationEvent(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onNavigationEvent
            boolean r7 = r7.compareAndSet(r5, r4)
            if (r7 != 0) goto L4c
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onWarmupCompleted
            r7.set(r4)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onWarmupCompleted     // Catch: java.lang.Throwable -> L8f
            r7.set(r5)     // Catch: java.lang.Throwable -> L8f
            viva.republica.toss.ads.RedirectionLogFlusher r7 = r6.onExtraCallback     // Catch: java.lang.Throwable -> L8f
            r0.label = r4     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r7 = r7.onWarmupCompleted(r0)     // Catch: java.lang.Throwable -> L8f
            if (r7 == r1) goto L8e
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L8f
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L6a
            viva.republica.toss.ads.RedirectionLogFlushWorker$Companion r7 = viva.republica.toss.ads.RedirectionLogFlushWorker.Companion     // Catch: java.lang.Throwable -> L8f
            android.content.Context r2 = r6.onExtraCallbackWithResult     // Catch: java.lang.Throwable -> L8f
            r7.onNavigationEvent(r2)     // Catch: java.lang.Throwable -> L8f
        L6a:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onWarmupCompleted     // Catch: java.lang.Throwable -> L8f
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L8f
            if (r7 != 0) goto L4c
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onNavigationEvent
            r7.set(r5)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.onWarmupCompleted
            boolean r7 = r7.getAndSet(r5)
            if (r7 == 0) goto L8b
            r0.label = r3
            java.lang.Object r7 = r6.onExtraCallback(r0)
            if (r7 != r1) goto L88
            goto L8e
        L88:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L8b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L8e:
            return r1
        L8f:
            r7 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.onNavigationEvent
            r0.set(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.RedirectionLogFlushScheduler.onExtraCallback(o.access13800):java.lang.Object");
    }
}
