package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class logicDecryptData implements logicDecCMSEnvelopedData {
    private final access6900<logicIssueCertMakePOPOSigningInputMsg<?>> IAuthTabCallback;
    private final logicDisuseCertRr onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicDecryptData.this.onExtraCallback(null, this);
        }
    }

    public logicDecryptData(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        this.onNavigationEvent = logicdisusecertrr;
        this.IAuthTabCallback = new access6900<>();
    }

    @Override // o.logicDecCMSEnvelopedData
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        if (this.IAuthTabCallback.isEmpty()) {
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Event queue is not empty, internal error (should never happen). Double check that you don't break multi-threading usage rules, if you see this error. Usually it is related to concurrent collection modification.");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.logicDisuseCertRr.asInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            logicDisuseCertRr logicdisusecertrr = this.onNavigationEvent;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(logicissuecertmakepoposigninginputmsg);
            iAuthTabCallback.L$0 = logicissuecertmakepoposigninginputmsg;
            iAuthTabCallback.label = 1;
            if (cryptSeed.onExtraCallback(logicdisusecertrr, onextracallbackwithresult, iAuthTabCallback) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logicissuecertmakepoposigninginputmsg = (logicIssueCertMakePOPOSigningInputMsg) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        this.IAuthTabCallback.add(logicissuecertmakepoposigninginputmsg);
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<String> {
        final /* synthetic */ logicIssueCertMakePOPOSigningInputMsg<?> $eventAndArgument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(logicIssueCertMakePOPOSigningInputMsg<?> logicissuecertmakepoposigninginputmsg) {
            super(0);
            this.$eventAndArgument = logicissuecertmakepoposigninginputmsg;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return logicDecryptData.this.onNavigationEvent + " queued event " + Reflection.getOrCreateKotlinClass(this.$eventAndArgument.onWarmupCompleted().getClass()).getSimpleName() + " with argument " + this.$eventAndArgument.onNavigationEvent();
        }
    }

    @Override // o.logicDecCMSEnvelopedData
    public Object IAuthTabCallback(@NotNull access13800<? super logicIssueCertMakePOPOSigningInputMsg<?>> access13800Var) {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.logicDecCMSEnvelopedData
    public Object onWarmupCompleted(@NotNull access13800<? super Unit> access13800Var) {
        this.IAuthTabCallback.clear();
        return Unit.INSTANCE;
    }
}
