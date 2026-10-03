package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkAdsAdFormat implements findResAndMsg {
    public static final int IAuthTabCallback;
    public static final AudienceNetworkAdsAdFormat onExtraCallbackWithResult;
    private static final CoroutineContext onNavigationEvent;
    private static GeckoHubImp1<Unit> onWarmupCompleted;

    private AudienceNetworkAdsAdFormat() {
    }

    static {
        AudienceNetworkAdsAdFormat audienceNetworkAdsAdFormat = new AudienceNetworkAdsAdFormat();
        onExtraCallbackWithResult = audienceNetworkAdsAdFormat;
        onNavigationEvent = isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback());
        onWarmupCompleted = audienceNetworkAdsAdFormat.IAuthTabCallback();
        IAuthTabCallback = 8;
    }

    public CoroutineContext getCoroutineContext() {
        return onNavigationEvent;
    }

    public final Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        GeckoHubImp1<Unit> geckoHubImp1;
        if (RemoteWorkManager.onWarmupCompleted.IAuthTabCallback_Parcel()) {
            return Unit.INSTANCE;
        }
        synchronized (onWarmupCompleted) {
            if (onWarmupCompleted.IAuthTabCallbackStubProxy()) {
                onWarmupCompleted = onExtraCallbackWithResult.IAuthTabCallback();
            }
            geckoHubImp1 = onWarmupCompleted;
        }
        Object objIAuthTabCallback = geckoHubImp1.IAuthTabCallback(access13800Var);
        return objIAuthTabCallback == access14300.onWarmupCompleted() ? objIAuthTabCallback : Unit.INSTANCE;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onWarmupCompleted(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Exception {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    AudienceNetworkAdsAdFormat audienceNetworkAdsAdFormat = AudienceNetworkAdsAdFormat.onExtraCallbackWithResult;
                    this.label = 1;
                    if (audienceNetworkAdsAdFormat.onNavigationEvent(this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("WebKeyIssuer", e);
                throw e;
            }
        }
    }

    private final GeckoHubImp1<Unit> IAuthTabCallback() {
        return maybeUpdateAnimatable.onExtraCallback(this, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (r0 != r2) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
        
            if (r0 == r2) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws im.toss.network.throwable.TossApiCallException.ApiError {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkAdsAdFormat.IAuthTabCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new IAuthTabCallback(null), access13800Var);
        return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
