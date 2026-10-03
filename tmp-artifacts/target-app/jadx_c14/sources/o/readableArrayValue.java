package o;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class readableArrayValue {

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = readableArrayValue.this.onExtraCallback(0L, this);
            return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Result.IAuthTabCallback(objOnExtraCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(long r20, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<o.NativeAnimatedModulequeueAndExecuteBatchedOperations1ExternalSyntheticLambda0>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readableArrayValue.onExtraCallback(long, o.access13800):java.lang.Object");
    }
}
