package im.toss.features.kyc.intro.viewmodel;

import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getBorderRadius;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class RetryFullPageViewModel$setKycStream$2$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ Throwable $e;
    int label;
    final /* synthetic */ RetryFullPageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryFullPageViewModel$setKycStream$2$1(RetryFullPageViewModel retryFullPageViewModel, Throwable th, access13800<? super RetryFullPageViewModel$setKycStream$2$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = retryFullPageViewModel;
        this.$e = th;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RetryFullPageViewModel$setKycStream$2$1 retryFullPageViewModel$setKycStream$2$1Create = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            retryFullPageViewModel$setKycStream$2$1Create.invokeSuspend(unit);
            throw null;
        }
        Object objInvokeSuspend = retryFullPageViewModel$setKycStream$2$1Create.invokeSuspend(unit);
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RetryFullPageViewModel$setKycStream$2$1 retryFullPageViewModel$setKycStream$2$1 = new RetryFullPageViewModel$setKycStream$2$1(this.this$0, this.$e, access13800Var);
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return retryFullPageViewModel$setKycStream$2$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onNavigationEvent + 79;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 95;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            getBorderRadius getborderradius = (getBorderRadius) RetryFullPageViewModel.onWarmupCompleted(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), new Object[]{this.this$0}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 812264664, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -812264664);
            Throwable th = this.$e;
            Intrinsics.checkNotNull(th);
            this.label = 1;
            if (getborderradius.emit(th, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
