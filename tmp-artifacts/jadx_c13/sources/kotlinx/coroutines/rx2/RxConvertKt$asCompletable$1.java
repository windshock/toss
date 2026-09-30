package kotlinx.coroutines.rx2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14100;
import o.findResAndMsg;
import o.getPackageType;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxConvertKt$asCompletable$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ getPackageType $this_asCompletable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxConvertKt$asCompletable$1(getPackageType getpackagetype, access13800<? super RxConvertKt$asCompletable$1> access13800Var) {
        super(2, access13800Var);
        this.$this_asCompletable = getpackagetype;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new RxConvertKt$asCompletable$1(this.$this_asCompletable, access13800Var);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        return ((RxConvertKt$asCompletable$1) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            getPackageType getpackagetype = this.$this_asCompletable;
            this.label = 1;
            if (getpackagetype.onNavigationEvent(this) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
