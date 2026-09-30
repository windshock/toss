package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetCRLDP {

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return certGetCRLDP.onWarmupCompleted(null, null, null, false, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull certGetCertPolicy certgetcertpolicy, @Nullable String str, @NotNull certVerifyCertificate certverifycertificate, boolean z, @NotNull InterfaceC0051getSignPrikey interfaceC0051getSignPrikey, @NotNull Function2<? super getLastDebugError, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull access13800<? super logicDisuseCertRr> access13800Var) {
        onNavigationEvent onnavigationevent;
        logicDecryptPriKey logicdecryptprikey;
        logicDecryptPriKey logicdecryptprikey2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            logicDecryptPriKey logicdecryptprikey3 = new logicDecryptPriKey(str, certverifycertificate, interfaceC0051getSignPrikey, certgetcertpolicy);
            onnavigationevent.L$0 = logicdecryptprikey3;
            onnavigationevent.L$1 = logicdecryptprikey3;
            onnavigationevent.Z$0 = z;
            onnavigationevent.label = 1;
            if (function2.invoke(logicdecryptprikey3, onnavigationevent) != objOnExtraCallback) {
                logicdecryptprikey = logicdecryptprikey3;
                logicdecryptprikey2 = logicdecryptprikey;
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logicDecryptPriKey logicdecryptprikey4 = (logicDecryptPriKey) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            return logicdecryptprikey4;
        }
        z = onnavigationevent.Z$0;
        logicdecryptprikey = (logicDecryptPriKey) onnavigationevent.L$1;
        logicdecryptprikey2 = (logicDecryptPriKey) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(obj);
        if (z) {
            onnavigationevent.L$0 = logicdecryptprikey2;
            onnavigationevent.L$1 = null;
            onnavigationevent.label = 2;
            if (logicDisuseCertRr.onWarmupCompleted.onWarmupCompleted(logicdecryptprikey, null, onnavigationevent, 1, null) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        return logicdecryptprikey2;
    }
}
