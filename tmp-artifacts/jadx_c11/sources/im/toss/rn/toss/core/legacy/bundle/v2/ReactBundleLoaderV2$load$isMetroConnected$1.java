package im.toss.rn.toss.core.legacy.bundle.v2;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleLoaderV2$load$isMetroConnected$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Response>, Object> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ Request $request;
    int label;
    final /* synthetic */ ReactBundleLoaderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleLoaderV2$load$isMetroConnected$1(ReactBundleLoaderV2 reactBundleLoaderV2, Request request, access13800<? super ReactBundleLoaderV2$load$isMetroConnected$1> access13800Var) {
        super(2, access13800Var);
        this.this$0 = reactBundleLoaderV2;
        this.$request = request;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        ReactBundleLoaderV2$load$isMetroConnected$1 reactBundleLoaderV2$load$isMetroConnected$1 = new ReactBundleLoaderV2$load$isMetroConnected$1(this.this$0, this.$request, access13800Var);
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return reactBundleLoaderV2$load$isMetroConnected$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Response> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2.onExtraCallbackWithResult(r4.this$0).newCall(r4.$request).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2.onExtraCallbackWithResult(r4.this$0).newCall(r4.$request).execute();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4.label == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r2 = r2 + 63;
        im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$load$isMetroConnected$1.onWarmupCompleted = r2 % 128;
        r2 = r2 % 2;
        kotlin.ResultKt.onNavigationEvent(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            int i4 = 4 / 0;
        }
    }
}
