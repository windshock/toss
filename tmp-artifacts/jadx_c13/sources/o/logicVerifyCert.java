package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.nsk.kstatemachine.visitors.RecursiveCoVisitor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicVerifyCert implements RecursiveCoVisitor {

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
            return logicVerifyCert.this.onWarmupCompleted(null, this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return logicVerifyCert.this.onNavigationEvent(null, this);
        }
    }

    public Object onExtraCallback(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super Unit> access13800Var) {
        return RecursiveCoVisitor.DefaultImpls.onExtraCallbackWithResult(this, generateaesiv, access13800Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (((o.getVIDRandom) r6).onExtraCallback(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.logicVerifyCMSSignedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull logicDisuseCertRr logicdisusecertrr, @NotNull access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            onextracallback.L$0 = logicdisusecertrr;
            onextracallback.label = 1;
            if (onExtraCallback(logicdisusecertrr, onextracallback) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        logicdisusecertrr = (logicDisuseCertRr) onextracallback.L$0;
        ResultKt.onNavigationEvent(obj);
        Intrinsics.checkNotNull(logicdisusecertrr, "");
        onextracallback.L$0 = null;
        onextracallback.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (((o.cryptVerifySignatureValue) r6).onExtraCallback(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.logicVerifyCMSSignedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onWarmupCompleted(@NotNull generateAesIV generateaesiv, @NotNull access13800<? super Unit> access13800Var) {
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
            if (generateaesiv instanceof logicDisuseCertRr) {
                return Unit.INSTANCE;
            }
            iAuthTabCallback.L$0 = generateaesiv;
            iAuthTabCallback.label = 1;
            if (onExtraCallback(generateaesiv, iAuthTabCallback) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        generateaesiv = (generateAesIV) iAuthTabCallback.L$0;
        ResultKt.onNavigationEvent(obj);
        Intrinsics.checkNotNull(generateaesiv, "");
        iAuthTabCallback.L$0 = null;
        iAuthTabCallback.label = 2;
    }

    @Override // o.logicVerifyCMSSignedData
    public <E extends certGetOCSPAddress> Object onExtraCallback(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf, @NotNull access13800<? super Unit> access13800Var) {
        return Unit.INSTANCE;
    }
}
