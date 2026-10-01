package o;

import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.AffiliateTermsAgreedResponse;
import im.toss.standardtermsv2.model.GetAffiliateTermsAgreed;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.playerPrepared;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public interface IAuthTabCallback {
        r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A LocalFullyDrawnReporterOwnerExternalSyntheticLambda0();
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A.this.onWarmupCompleted(this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A.this.IAuthTabCallback(this);
            if (objIAuthTabCallback != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objIAuthTabCallback);
            }
            int i2 = onExtraCallback + 59;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return objIAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Inject
    public r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A() {
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            playerPrepared.Companion.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).onNavigationEvent();
            throw null;
        }
        boolean zOnNavigationEvent = playerPrepared.Companion.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).onNavigationEvent();
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return zOnNavigationEvent;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        playerPrepared.onExtraCallback onextracallback = playerPrepared.Companion;
        if (i3 == 0) {
            return onextracallback.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).onExtraCallbackWithResult();
        }
        onextracallback.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback()).onExtraCallbackWithResult();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull access13800<? super Result<GetAffiliateTermsAgreed>> access13800Var) {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 51;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    onextracallback.label = i2 - 2147483648;
                } else {
                    onextracallback.label = i2 - 2147483648;
                }
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onextracallback.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            onextracallback.label = 1;
            Object objIAuthTabCallback = IAuthTabCallback(onextracallback);
            return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.onNavigationEvent(obj);
        Object objOnNavigationEvent = ((Result) obj).onNavigationEvent();
        int i5 = onNavigationEvent + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnNavigationEvent;
    }

    public final boolean onNavigationEvent(@NotNull Set<Long> set) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(set, "");
        boolean zOnNavigationEvent = zzbf.onNavigationEvent(set, new Long[]{528L, 1260L});
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Response response = Response.onNavigationEvent;
            r8lambdar_KD5J2KtjKq2TqCOKmlHfUqU6A r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6aLocalFullyDrawnReporterOwnerExternalSyntheticLambda0 = ((IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), IAuthTabCallback.class)).LocalFullyDrawnReporterOwnerExternalSyntheticLambda0();
            int i4 = onNavigationEvent + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdar_kd5j2ktjkq2tqcokmlhfuqu6aLocalFullyDrawnReporterOwnerExternalSyntheticLambda0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull access13800<? super Result<GetAffiliateTermsAgreed>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = ((onWarmupCompleted) access13800Var).label;
                throw null;
            }
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i4 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onwarmupcompleted.label;
        try {
            if (i5 != 0) {
                int i6 = onNavigationEvent + 53;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                Result.Companion companion = Result.Companion;
                playerPrepared playerpreparedIAuthTabCallback = playerPrepared.Companion.IAuthTabCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                onwarmupcompleted.L$0 = access15400.onNavigationEvent(onwarmupcompleted);
                onwarmupcompleted.I$0 = 0;
                onwarmupcompleted.I$1 = 0;
                onwarmupcompleted.label = 1;
                objOnExtraCallbackWithResult = playerpreparedIAuthTabCallback.onExtraCallbackWithResult(onwarmupcompleted);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i7 = onNavigationEvent + 19;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
            }
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            AffiliateTermsAgreedResponse affiliateTermsAgreedResponse = (AffiliateTermsAgreedResponse) objOnExtraCallbackWithResult;
            return Result.constructor-impl(new GetAffiliateTermsAgreed(affiliateTermsAgreedResponse.onExtraCallbackWithResult().onNavigationEvent(), affiliateTermsAgreedResponse.onExtraCallbackWithResult().onExtraCallback(), affiliateTermsAgreedResponse.onWarmupCompleted().onNavigationEvent()));
        } catch (Exception e) {
            Result.Companion companion2 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e));
        } catch (WebResourceResponseModel e2) {
            Result.Companion companion3 = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(e2));
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
