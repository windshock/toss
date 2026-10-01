package im.toss;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class TossApplication$onActivityResized extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    int label;
    final /* synthetic */ TossApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TossApplication$onActivityResized(TossApplication tossApplication, access13800<? super TossApplication$onActivityResized> access13800Var) {
        super(1, access13800Var);
        this.this$0 = tossApplication;
    }

    public final access13800<Unit> create(access13800<?> access13800Var) {
        int i = 2 % 2;
        TossApplication$onActivityResized tossApplication$onActivityResized = new TossApplication$onActivityResized(this.this$0, access13800Var);
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return tossApplication$onActivityResized;
    }

    public /* synthetic */ Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        access13800<? super Unit> access13800Var = (access13800) obj;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(access13800Var);
        }
        onExtraCallbackWithResult(access13800Var);
        throw null;
    }

    public final Object onExtraCallbackWithResult(access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r3.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        kotlin.ResultKt.onNavigationEvent(r4);
        o.UST_CERT_GetPublicKeyInfo.onWarmupCompleted.requestPostMessageChannel();
        r4 = r3.this$0;
        r4.registerComponentCallbacks(new im.toss.TossApplication$onActivityResized.AnonymousClass1());
        r4 = kotlin.Unit.INSTANCE;
        r1 = im.toss.TossApplication$onActivityResized.onExtraCallbackWithResult + 93;
        im.toss.TossApplication$onActivityResized.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }
}
