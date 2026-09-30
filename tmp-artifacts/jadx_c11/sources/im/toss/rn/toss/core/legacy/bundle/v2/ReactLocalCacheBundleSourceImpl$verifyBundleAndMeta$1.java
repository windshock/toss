package im.toss.rn.toss.core.legacy.bundle.v2;

import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.setWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1 extends ContinuationImpl {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactLocalCacheBundleSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1(ReactLocalCacheBundleSourceImpl reactLocalCacheBundleSourceImpl, access13800<? super ReactLocalCacheBundleSourceImpl$verifyBundleAndMeta$1> access13800Var) {
        super(access13800Var);
        this.this$0 = reactLocalCacheBundleSourceImpl;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws IOException, setWrite {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOnWarmupCompleted = ReactLocalCacheBundleSourceImpl.onWarmupCompleted(this.this$0, null, null, null, null, null, this);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }
}
