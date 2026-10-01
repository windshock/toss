package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSignCert extends generateAesKey {
    private final List<getToolkit> onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return getSignCert.this.IAuthTabCallback((logicRenewCertGenmGenp<?>) null, this);
        }
    }

    public getSignCert() {
        super("undoState");
        this.onWarmupCompleted = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.cryptECDHKeyAgreement, o.cryptVerifySignatureValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.L$0 = logicrenewcertgenmgenp;
            onwarmupcompleted.label = 1;
            if (super.IAuthTabCallback(logicrenewcertgenmgenp, onwarmupcompleted) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        if (!(logicrenewcertgenmgenp.onWarmupCompleted() instanceof certGetSignAlgType)) {
            Set<generateAesIV> setIAuthTabCallback = logicrenewcertgenmgenp.onExtraCallback().IAuthTabCallback();
            if (setIAuthTabCallback.isEmpty()) {
                setIAuthTabCallback = null;
            }
            if (setIAuthTabCallback == null) {
                setIAuthTabCallback = clearFaultAddress.onNavigationEvent(logicrenewcertgenmgenp.onNavigationEvent().onExtraCallbackWithResult());
            }
            this.onWarmupCompleted.add(new getToolkit(setIAuthTabCallback, new logicIssueCertMakePOPOSigningInputMsg(logicrenewcertgenmgenp.onWarmupCompleted(), logicrenewcertgenmgenp.onExtraCallbackWithResult())));
        }
        return Unit.INSTANCE;
    }

    public final certGetSignAlgType extraCallbackWithResult() {
        getToolkit gettoolkit = (getToolkit) CollectionsKt___CollectionsKt.getOrNull(this.onWarmupCompleted, r0.size() - 2);
        if (gettoolkit != null) {
            return new certGetSignAlgType(gettoolkit.IAuthTabCallback().onWarmupCompleted(), gettoolkit.IAuthTabCallback().onNavigationEvent());
        }
        return new certGetSignAlgType(certGetSubjectDN.onExtraCallback, null);
    }

    public final Set<generateAesIV> extraCallback() {
        if (this.onWarmupCompleted.size() >= 2) {
            CollectionsKt__MutableCollectionsKt.removeLast(this.onWarmupCompleted);
            return ((getToolkit) CollectionsKt___CollectionsKt.last((List) this.onWarmupCompleted)).onNavigationEvent();
        }
        return clearNumber.onNavigationEvent();
    }

    @Override // o.cryptVerifySignatureValue
    public Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        this.onWarmupCompleted.clear();
        return Unit.INSTANCE;
    }

    @Override // o.cryptVerifySignatureValue
    public Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
        this.onWarmupCompleted.clear();
        return Unit.INSTANCE;
    }
}
