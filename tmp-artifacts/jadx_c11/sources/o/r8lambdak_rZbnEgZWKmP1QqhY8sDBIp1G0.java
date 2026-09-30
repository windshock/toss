package o;

import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdak_rZbnEgZWKmP1QqhY8sDBIp1G0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = r8lambdak_rZbnEgZWKmP1QqhY8sDBIp1G0.this.onWarmupCompleted(this);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return Result.IAuthTabCallback(objOnWarmupCompleted);
            }
            int i4 = onExtraCallback + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    @Inject
    public r8lambdak_rZbnEgZWKmP1QqhY8sDBIp1G0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull access13800<? super Result<Boolean>> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onNavigationEvent + 123;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        if (i7 != 0) {
            int i8 = onNavigationEvent + 75;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return ((Result) obj).onNavigationEvent();
        }
        ResultKt.onNavigationEvent(obj);
        playerPlayCompletion playerplaycompletionOnNavigationEvent = playerPlayCompletion.Companion.onNavigationEvent(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        onextracallbackwithresult.label = 1;
        Object objOnExtraCallbackWithResult = playerplaycompletionOnNavigationEvent.onExtraCallbackWithResult(onextracallbackwithresult);
        if (objOnExtraCallbackWithResult != objOnWarmupCompleted) {
            return objOnExtraCallbackWithResult;
        }
        int i9 = IAuthTabCallback + 23;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return objOnWarmupCompleted;
    }
}
