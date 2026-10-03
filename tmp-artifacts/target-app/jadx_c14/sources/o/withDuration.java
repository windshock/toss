package o;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.ktx.AppUpdateResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.withOnAnimationEventListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class withDuration extends access4502 {
    private final AppUpdateManager onExtraCallback;

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return withDuration.this.onExtraCallbackWithResult(this);
        }
    }

    public withDuration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(context);
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "");
        this.onExtraCallback = appUpdateManagerCreate;
    }

    @Override // o.access4502
    protected AppUpdateManager onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // o.withOrigin
    public void onNavigationEvent(@NotNull Activity activity, @NotNull IntentSenderForResultStarter intentSenderForResultStarter) {
        AppUpdateResult.Available availableOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(intentSenderForResultStarter, "");
        Object objIAuthTabCallback = onWarmupCompleted().IAuthTabCallback();
        withOnAnimationEventListener.IAuthTabCallbackStub iAuthTabCallbackStub = objIAuthTabCallback instanceof withOnAnimationEventListener.IAuthTabCallbackStub ? (withOnAnimationEventListener.IAuthTabCallbackStub) objIAuthTabCallback : null;
        if (iAuthTabCallbackStub == null || (availableOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult()) == null) {
            return;
        }
        onExtraCallback().startUpdateFlowForResult(availableOnExtraCallbackWithResult.getUpdateInfo(), 0, intentSenderForResultStarter, 10234);
    }

    @Override // o.withOrigin
    public void onExtraCallbackWithResult(@NotNull Activity activity, @NotNull IntentSenderForResultStarter intentSenderForResultStarter) {
        AppUpdateResult.Available availableOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(intentSenderForResultStarter, "");
        Object objIAuthTabCallback = onWarmupCompleted().IAuthTabCallback();
        withOnAnimationEventListener.IAuthTabCallbackStub iAuthTabCallbackStub = objIAuthTabCallback instanceof withOnAnimationEventListener.IAuthTabCallbackStub ? (withOnAnimationEventListener.IAuthTabCallbackStub) objIAuthTabCallback : null;
        if (iAuthTabCallbackStub == null || (availableOnExtraCallbackWithResult = iAuthTabCallbackStub.onExtraCallbackWithResult()) == null) {
            return;
        }
        onExtraCallback().startUpdateFlowForResult(availableOnExtraCallbackWithResult.getUpdateInfo(), 1, intentSenderForResultStarter, 10234);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (onNavigationEvent(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.withOrigin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.withDuration.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r8
            o.withDuration$onWarmupCompleted r0 = (o.withDuration.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.withDuration$onWarmupCompleted r0 = new o.withDuration$onWarmupCompleted
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.L$1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.onNavigationEvent(r8)
            goto Laa
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.L$0
            o.access13800 r2 = (o.access13800) r2
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            goto L6a
        L42:
            kotlin.ResultKt.onNavigationEvent(r8)
            o.setRubIn r8 = r7.onWarmupCompleted()
            java.lang.Object r8 = r8.IAuthTabCallback()
            boolean r8 = r8 instanceof o.withOnAnimationEventListener.onWarmupCompleted
            if (r8 == 0) goto Laa
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            com.google.android.play.core.appupdate.AppUpdateManager r8 = r7.onExtraCallback()     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            java.lang.Object r2 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            r0.L$0 = r2     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            r0.I$0 = r5     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            r0.I$1 = r5     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            r0.label = r4     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            java.lang.Object r8 = com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestCompleteUpdate(r8, r0)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            if (r8 != r1) goto L6a
            goto La9
        L6a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> L7d o.WebResourceResponseModel -> L7f
            goto L8a
        L71:
            r8 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto L8a
        L7d:
            r8 = move-exception
            throw r8
        L7f:
            r8 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        L8a:
            java.lang.Throwable r2 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r2 == 0) goto Laa
            o.ConvertFloatArrayToByteArray r4 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r6 = "AbsInAppUpdateManager::requestCompleteUpdate"
            r4.IAuthTabCallback(r6, r2)
            r0.L$0 = r8
            java.lang.Object r8 = o.access15400.onNavigationEvent(r2)
            r0.L$1 = r8
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r8 = r7.onNavigationEvent(r0)
            if (r8 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.withDuration.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }
}
