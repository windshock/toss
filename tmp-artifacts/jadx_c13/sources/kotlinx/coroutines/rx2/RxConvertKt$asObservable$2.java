package kotlinx.coroutines.rx2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ReceiveChannel;
import o.access13800;
import o.access14100;
import o.nUnlockFile;
import o.ok;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxConvertKt$asObservable$2 extends SuspendLambda implements Function2<ok<Object>, access13800<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<Object> $this_asObservable;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxConvertKt$asObservable$2(ReceiveChannel<Object> receiveChannel, access13800<? super RxConvertKt$asObservable$2> access13800Var) {
        super(2, access13800Var);
        this.$this_asObservable = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        RxConvertKt$asObservable$2 rxConvertKt$asObservable$2 = new RxConvertKt$asObservable$2(this.$this_asObservable, access13800Var);
        rxConvertKt$asObservable$2.L$0 = obj;
        return rxConvertKt$asObservable$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ok<Object> okVar, access13800<? super Unit> access13800Var) {
        return ((RxConvertKt$asObservable$2) create(okVar, access13800Var)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4.onExtraCallback(r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ok okVar;
        nUnlockFile<Object> nunlockfileWriteTypedObject;
        ok okVar2;
        Object objOnWarmupCompleted;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i = this.label;
        if (i == 0) {
            ResultKt.onNavigationEvent(obj);
            okVar = (ok) this.L$0;
            nunlockfileWriteTypedObject = this.$this_asObservable.writeTypedObject();
            this.L$0 = okVar;
            this.L$1 = nunlockfileWriteTypedObject;
            this.label = 1;
            objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
            if (objOnWarmupCompleted != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nunlockfileWriteTypedObject = (nUnlockFile) this.L$1;
            okVar2 = (ok) this.L$0;
            ResultKt.onNavigationEvent(obj);
            okVar = okVar2;
            this.L$0 = okVar;
            this.L$1 = nunlockfileWriteTypedObject;
            this.label = 1;
            objOnWarmupCompleted = nunlockfileWriteTypedObject.onWarmupCompleted(this);
            if (objOnWarmupCompleted != objOnExtraCallback) {
                okVar2 = okVar;
                obj = objOnWarmupCompleted;
                if (!((Boolean) obj).booleanValue()) {
                    Object objOnNavigationEvent = nunlockfileWriteTypedObject.onNavigationEvent();
                    this.L$0 = okVar2;
                    this.L$1 = nunlockfileWriteTypedObject;
                    this.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
            return objOnExtraCallback;
        }
        nunlockfileWriteTypedObject = (nUnlockFile) this.L$1;
        okVar2 = (ok) this.L$0;
        ResultKt.onNavigationEvent(obj);
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
