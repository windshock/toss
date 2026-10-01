package im.toss.feature.credit.terms.domain.usecase;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.CrashOptimizeSwitch;
import o.ResourceCallback;
import o.access13800;
import o.access14300;
import o.access15400;
import o.enableSensorServiceContextOpt;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setConfig;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RefreshCreditTermGroupCacheUseCase$invoke$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Result<? extends enableSensorServiceContextOpt>>>, Object> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ CrashOptimizeSwitch[] $termsType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RefreshCreditTermGroupCacheUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshCreditTermGroupCacheUseCase$invoke$2(RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase, CrashOptimizeSwitch[] crashOptimizeSwitchArr, access13800<? super RefreshCreditTermGroupCacheUseCase$invoke$2> access13800Var) {
        super(2, access13800Var);
        this.this$0 = refreshCreditTermGroupCacheUseCase;
        this.$termsType = crashOptimizeSwitchArr;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RefreshCreditTermGroupCacheUseCase$invoke$2 refreshCreditTermGroupCacheUseCase$invoke$2 = new RefreshCreditTermGroupCacheUseCase$invoke$2(this.this$0, this.$termsType, access13800Var);
        refreshCreditTermGroupCacheUseCase$invoke$2.L$0 = obj;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
        return refreshCreditTermGroupCacheUseCase$invoke$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        int i4 = onExtraCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<Result<enableSensorServiceContextOpt>>> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            setConfig setconfigIAuthTabCallback = RefreshCreditTermGroupCacheUseCase.IAuthTabCallback(this.this$0);
            this.L$0 = findresandmsg;
            this.label = 1;
            if (setconfigIAuthTabCallback.onNavigationEvent(this) != objOnWarmupCompleted) {
            }
        }
        if (i3 != 1) {
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0 ? i3 != 2 : i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        CrashOptimizeSwitch[] crashOptimizeSwitchArr = this.$termsType;
        RefreshCreditTermGroupCacheUseCase refreshCreditTermGroupCacheUseCase = this.this$0;
        ArrayList arrayList = new ArrayList(crashOptimizeSwitchArr.length);
        int i5 = onNavigationEvent + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        for (CrashOptimizeSwitch crashOptimizeSwitch : crashOptimizeSwitchArr) {
            arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new RefreshCreditTermGroupCacheUseCase$invoke$2$1$1(refreshCreditTermGroupCacheUseCase, crashOptimizeSwitch, null), 3, (Object) null));
        }
        this.L$0 = access15400.onNavigationEvent(findresandmsg);
        this.label = 2;
        Object objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList, this);
        return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
    }
}
