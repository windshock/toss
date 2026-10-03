package o;

import im.toss.network.throwable.TossApiCallException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class listValue {

    static final class onNavigationEvent extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws TossApiCallException.ApiError {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = listValue.this.onWarmupCompleted(this);
            return objOnWarmupCompleted == access14300.onWarmupCompleted() ? objOnWarmupCompleted : Result.IAuthTabCallback(objOnWarmupCompleted);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<o.showShareActionSheetWithOptions>> r5) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.listValue.onNavigationEvent
            if (r0 == 0) goto L13
            r0 = r5
            o.listValue$onNavigationEvent r0 = (o.listValue.onNavigationEvent) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.listValue$onNavigationEvent r0 = new o.listValue$onNavigationEvent
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            o.access13800 r0 = (o.access13800) r0
            kotlin.ResultKt.onNavigationEvent(r5)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.onNavigationEvent(r5)
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            o.disableOldAndroidAttachmentMetricsWorkarounds r5 = o.disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            o.JsonReaderUnknownNumberParsing r5 = r5.onExtraCallback()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.Object r2 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.L$0 = r2     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r2 = 0
            r0.I$0 = r2     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.I$1 = r2     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.label = r3     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.Object r5 = o.setIndicatorY.onExtraCallbackWithResult(r5, r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            if (r5 != r1) goto L54
            return r1
        L54:
            o.ImageFormatCheckerExternalSyntheticLambda0 r5 = (o.ImageFormatCheckerExternalSyntheticLambda0) r5     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            o.showShareActionSheetWithOptions r5 = r5.onExtraCallback()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            if (r5 == 0) goto L61
            java.lang.Object r5 = kotlin.Result.constructor-impl(r5)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            return r5
        L61:
            im.toss.network.throwable.TossApiCallException$ApiError r5 = new im.toss.network.throwable.TossApiCallException$ApiError     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.String r0 = "한도 정보를 불러오지 못했어요."
            r5.<init>(r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            throw r5     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
        L69:
            r5 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
            goto L82
        L75:
            r5 = move-exception
            throw r5
        L77:
            r5 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.constructor-impl(r5)
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.listValue.onWarmupCompleted(o.access13800):java.lang.Object");
    }
}
