package im.toss.rn.toss.core.bundle.source;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14000;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class RemoteBundleSourceImpl$isMetroServerConnected$2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    final /* synthetic */ String $host;
    final /* synthetic */ int $port;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RemoteBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteBundleSourceImpl$isMetroServerConnected$2(String str, int i, RemoteBundleSourceImpl remoteBundleSourceImpl, access13800<? super RemoteBundleSourceImpl$isMetroServerConnected$2> access13800Var) {
        super(2, access13800Var);
        this.$host = str;
        this.$port = i;
        this.this$0 = remoteBundleSourceImpl;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = IAuthTabCallback + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RemoteBundleSourceImpl$isMetroServerConnected$2 remoteBundleSourceImpl$isMetroServerConnected$2 = new RemoteBundleSourceImpl$isMetroServerConnected$2(this.$host, this.$port, this.this$0, access13800Var);
        remoteBundleSourceImpl$isMetroServerConnected$2.L$0 = obj;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return remoteBundleSourceImpl$isMetroServerConnected$2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r5 = kotlin.Result.Companion;
        r8 = im.toss.rn.toss.core.bundle.source.RemoteBundleSourceImpl.onNavigationEvent(r3).newCall(new okhttp3.Request.Builder().url("http://" + r8 + ":" + r1 + "/status").build()).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r1 = r8.isSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r8, (java.lang.Throwable) null);
        r8 = kotlin.Result.constructor-impl(o.access14000.onNavigationEvent(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r1 = kotlin.Result.Companion;
        r8 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r7.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        kotlin.ResultKt.onNavigationEvent(r8);
        r8 = r7.$host;
        r1 = r7.$port;
        r3 = r7.this$0;
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
        if (!Result.onExtraCallback(obj3)) {
            return obj3;
        }
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return boolOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
