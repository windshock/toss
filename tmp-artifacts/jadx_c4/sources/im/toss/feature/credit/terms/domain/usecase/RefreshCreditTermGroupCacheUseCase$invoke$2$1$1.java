package im.toss.feature.credit.terms.domain.usecase;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.CrashOptimizeSwitch;
import o.access13800;
import o.access14300;
import o.enableSensorServiceContextOpt;
import o.findResAndMsg;
import o.setConfig;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RefreshCreditTermGroupCacheUseCase$invoke$2$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends enableSensorServiceContextOpt>>, Object> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ CrashOptimizeSwitch $termsType;
    int label;
    final /* synthetic */ RefreshCreditTermGroupCacheUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshCreditTermGroupCacheUseCase$invoke$2$1$1(RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase, CrashOptimizeSwitch crashOptimizeSwitch, access13800<? super RefreshCreditTermGroupCacheUseCase$invoke$2$1$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = refreshCreditTermGroupCacheUseCase;
        this.$termsType = crashOptimizeSwitch;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RefreshCreditTermGroupCacheUseCase$invoke$2$1$1 refreshCreditTermGroupCacheUseCase$invoke$2$1$1 = new RefreshCreditTermGroupCacheUseCase$invoke$2$1$1(this.this$0, this.$termsType, access13800Var);
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return refreshCreditTermGroupCacheUseCase$invoke$2$1$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        int i5 = onExtraCallback + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Result<enableSensorServiceContextOpt>> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            setConfig setconfigIAuthTabCallback = RefreshCreditTermGroupCacheUseCase.IAuthTabCallback(this.this$0);
            CrashOptimizeSwitch crashOptimizeSwitch = this.$termsType;
            this.label = 1;
            objIAuthTabCallback = setconfigIAuthTabCallback.IAuthTabCallback(false, crashOptimizeSwitch, this);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i3 = onNavigationEvent + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            objIAuthTabCallback = ((Result) obj).onNavigationEvent();
            int i5 = onNavigationEvent + 39;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
            }
        }
        return Result.IAuthTabCallback(objIAuthTabCallback);
    }
}
