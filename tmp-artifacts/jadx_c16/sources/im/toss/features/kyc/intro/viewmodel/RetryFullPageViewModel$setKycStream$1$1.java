package im.toss.features.kyc.intro.viewmodel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getBorderRadius;
import o.setExtraJsT2MapStr;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RetryFullPageViewModel$setKycStream$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ setExtraJsT2MapStr $result;
    int label;
    final /* synthetic */ RetryFullPageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryFullPageViewModel$setKycStream$1$1(RetryFullPageViewModel retryFullPageViewModel, setExtraJsT2MapStr setextrajst2mapstr, access13800<? super RetryFullPageViewModel$setKycStream$1$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = retryFullPageViewModel;
        this.$result = setextrajst2mapstr;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RetryFullPageViewModel$setKycStream$1$1 retryFullPageViewModel$setKycStream$1$1Create = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            objInvokeSuspend = retryFullPageViewModel$setKycStream$1$1Create.invokeSuspend(Unit.INSTANCE);
            int i4 = 11 / 0;
        } else {
            objInvokeSuspend = retryFullPageViewModel$setKycStream$1$1Create.invokeSuspend(Unit.INSTANCE);
        }
        int i5 = IAuthTabCallback + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RetryFullPageViewModel$setKycStream$1$1 retryFullPageViewModel$setKycStream$1$1 = new RetryFullPageViewModel$setKycStream$1$1(this.this$0, this.$result, access13800Var);
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return retryFullPageViewModel$setKycStream$1$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
        int i3 = 94 / 0;
        return objIAuthTabCallback;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onWarmupCompleted + 107;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            getBorderRadius getborderradiusIAuthTabCallback = RetryFullPageViewModel.IAuthTabCallback(this.this$0);
            setExtraJsT2MapStr setextrajst2mapstr = this.$result;
            Intrinsics.checkNotNull(setextrajst2mapstr);
            this.label = 1;
            if (getborderradiusIAuthTabCallback.emit(setextrajst2mapstr, this) == objOnWarmupCompleted) {
                int i4 = onWarmupCompleted + 27;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 115;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }
}
