package o;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetCertCPS {

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return certGetCertCPS.onWarmupCompleted(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull Iterable<? extends cryptVerifySignatureValue> iterable, @NotNull Function2<? super cryptVerifySignatureValue, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Iterator<? extends cryptVerifySignatureValue> it;
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
            it = iterable.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) onwarmupcompleted.L$1;
            function2 = (Function2) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        while (it.hasNext()) {
            cryptVerifySignatureValue next = it.next();
            if (!(next instanceof logicDisuseCertRr)) {
                onwarmupcompleted.L$0 = function2;
                onwarmupcompleted.L$1 = it;
                onwarmupcompleted.label = 1;
                if (function2.invoke(next, onwarmupcompleted) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final boolean onExtraCallback(@NotNull generateAesIV generateaesiv, @NotNull generateAesIV generateaesiv2) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        Intrinsics.checkNotNullParameter(generateaesiv2, "");
        for (generateAesIV generateaesiv3 : generateaesiv2.getInterfaceDescriptor()) {
            if (generateaesiv3 == generateaesiv) {
                return true;
            }
            if (!(generateaesiv3 instanceof logicDisuseCertRr) && onExtraCallback(generateaesiv, generateaesiv3)) {
                return true;
            }
        }
        return false;
    }
}
