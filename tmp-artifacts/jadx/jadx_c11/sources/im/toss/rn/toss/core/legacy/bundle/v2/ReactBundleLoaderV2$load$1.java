package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class ReactBundleLoaderV2$load$1 extends ContinuationImpl {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactBundleLoaderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactBundleLoaderV2$load$1(ReactBundleLoaderV2 reactBundleLoaderV2, access13800<? super ReactBundleLoaderV2$load$1> access13800Var) {
        super(access13800Var);
        this.this$0 = reactBundleLoaderV2;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object[] objArr = {this.this$0, null, null, null, this};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            return ReactBundleLoaderV2.onNavigationEvent(iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback4, objArr, iOnExtraCallback, -554203850, 554203852);
        }
        ReactBundleLoaderV2.onNavigationEvent(iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback4, objArr, iOnExtraCallback, -554203850, 554203852);
        throw null;
    }
}
