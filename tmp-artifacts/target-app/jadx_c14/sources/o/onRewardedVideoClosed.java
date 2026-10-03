package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.notification.block.BlockNotificationPage;
import viva.republica.toss.network.model.notification.block.UnblockNotificationRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onRewardedVideoClosed {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallbackWithResult = 8;
    private final InterstitialAdInterstitialLoadAdConfig onExtraCallback;

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = onRewardedVideoClosed.this.onNavigationEvent(null, this);
            return objOnNavigationEvent == access14300.onWarmupCompleted() ? objOnNavigationEvent : Result.IAuthTabCallback(objOnNavigationEvent);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
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
            Object objOnExtraCallbackWithResult = onRewardedVideoClosed.this.onExtraCallbackWithResult(0, null, this);
            return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Result.IAuthTabCallback(objOnExtraCallbackWithResult);
        }
    }

    @Inject
    public onRewardedVideoClosed(@NotNull InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig) {
        Intrinsics.checkNotNullParameter(interstitialAdInterstitialLoadAdConfig, "");
        this.onExtraCallback = interstitialAdInterstitialLoadAdConfig;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(onRewardedVideoClosed onrewardedvideoclosed, int i, String str, access13800 access13800Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 20;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return onrewardedvideoclosed.onExtraCallbackWithResult(i, str, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallbackWithResult(int r8, @org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<viva.republica.toss.network.model.notification.block.BlockNotificationPage>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof o.onRewardedVideoClosed.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r10
            o.onRewardedVideoClosed$onWarmupCompleted r0 = (o.onRewardedVideoClosed.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.onRewardedVideoClosed$onWarmupCompleted r0 = new o.onRewardedVideoClosed$onWarmupCompleted
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$1
            o.access13800 r8 = (o.access13800) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.onNavigationEvent(r10)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            goto L66
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.onNavigationEvent(r10)
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            o.GeckoHubImp r10 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            o.onRewardedVideoClosed$onExtraCallback r2 = new o.onRewardedVideoClosed$onExtraCallback     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r4 = 0
            r2.<init>(r4, r7, r8, r9)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            java.lang.Object r9 = o.access15400.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.L$0 = r9     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            java.lang.Object r9 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.L$1 = r9     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.I$0 = r8     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r8 = 0
            r0.I$1 = r8     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.I$2 = r8     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.I$3 = r8     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            r0.label = r3     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            java.lang.Object r10 = o.maybeUpdateAnimatable.onExtraCallback(r10, r2, r0)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            if (r10 != r1) goto L66
            return r1
        L66:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r10)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L77 o.WebResourceResponseModel -> L79
            goto L84
        L6b:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto L84
        L77:
            r8 = move-exception
            throw r8
        L79:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        L84:
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r3 == 0) goto L97
            o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r1 = "BlockNotifcationRepository"
            java.lang.String r2 = "getBlockNotifications"
            r4 = 0
            r5 = 8
            r6 = 0
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRewardedVideoClosed.onExtraCallbackWithResult(int, java.lang.String, o.access13800):java.lang.Object");
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super BlockNotificationPage>, Object> {
        final /* synthetic */ String $nextCursor$inlined;
        final /* synthetic */ int $size$inlined;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ onRewardedVideoClosed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(access13800 access13800Var, onRewardedVideoClosed onrewardedvideoclosed, int i, String str) {
            super(2, access13800Var);
            this.this$0 = onrewardedvideoclosed;
            this.$size$inlined = i;
            this.$nextCursor$inlined = str;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super BlockNotificationPage> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallback(access13800Var, this.this$0, this.$size$inlined, this.$nextCursor$inlined);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig = this.this$0.onExtraCallback;
                Integer numOnNavigationEvent = access14000.onNavigationEvent(this.$size$inlined);
                String str = this.$nextCursor$inlined;
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.label = 1;
                obj = interstitialAdInterstitialLoadAdConfig.onExtraCallbackWithResult(numOnNavigationEvent, str, (access13800<? super BaseApiResponse<BlockNotificationPage>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (BlockNotificationPage) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.notification.block.BlockNotificationPage");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(BlockNotificationPage.class, Object.class) || Intrinsics.areEqual(BlockNotificationPage.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
        final /* synthetic */ String $id$inlined;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ onRewardedVideoClosed this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, String str, onRewardedVideoClosed onrewardedvideoclosed) {
            super(2, access13800Var);
            this.$id$inlined = str;
            this.this$0 = onrewardedvideoclosed;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(access13800Var, this.$id$inlined, this.this$0);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<? extends String>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                UnblockNotificationRequest unblockNotificationRequest = new UnblockNotificationRequest(this.$id$inlined);
                InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfig = this.this$0.onExtraCallback;
                this.L$0 = access15400.onNavigationEvent(this);
                this.L$1 = access15400.onNavigationEvent(unblockNotificationRequest);
                this.I$0 = 0;
                this.label = 1;
                obj = interstitialAdInterstitialLoadAdConfig.IAuthTabCallback(unblockNotificationRequest, (access13800<? super BaseApiResponse<List<String>>>) this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (List) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(List.class, Object.class) || Intrinsics.areEqual(List.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<? extends java.util.List<java.lang.String>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.onRewardedVideoClosed.IAuthTabCallback
            if (r0 == 0) goto L13
            r0 = r9
            o.onRewardedVideoClosed$IAuthTabCallback r0 = (o.onRewardedVideoClosed.IAuthTabCallback) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.onRewardedVideoClosed$IAuthTabCallback r0 = new o.onRewardedVideoClosed$IAuthTabCallback
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$1
            o.access13800 r8 = (o.access13800) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            goto L64
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.onNavigationEvent(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            o.GeckoHubImp r9 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            o.onRewardedVideoClosed$onExtraCallbackWithResult r2 = new o.onRewardedVideoClosed$onExtraCallbackWithResult     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r4 = 0
            r2.<init>(r4, r8, r7)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.Object r8 = o.access15400.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.L$0 = r8     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.Object r8 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.L$1 = r8     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r8 = 0
            r0.I$0 = r8     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.I$1 = r8     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.I$2 = r8     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            r0.label = r3     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            java.lang.Object r9 = o.maybeUpdateAnimatable.onExtraCallback(r9, r2, r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            if (r9 != r1) goto L64
            return r1
        L64:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r9)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L75 o.WebResourceResponseModel -> L77
            goto L82
        L69:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto L82
        L75:
            r8 = move-exception
            throw r8
        L77:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        L82:
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r3 == 0) goto L95
            o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r1 = "BlockNotifcationRepository"
            java.lang.String r2 = "unblockNotification"
            r4 = 0
            r5 = 8
            r6 = 0
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRewardedVideoClosed.onNavigationEvent(java.lang.String, o.access13800):java.lang.Object");
    }
}
