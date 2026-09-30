package im.toss.feature.credit.terms.data.source.impl;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access13800;
import o.access14300;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RemoteCreditTermDataSource$getCreditTerms$1 extends ContinuationImpl {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteCreditTermDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteCreditTermDataSource$getCreditTerms$1(RemoteCreditTermDataSource remoteCreditTermDataSource, access13800<? super RemoteCreditTermDataSource$getCreditTerms$1> access13800Var) {
        super(access13800Var);
        this.this$0 = remoteCreditTermDataSource;
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RemoteCreditTermDataSource remoteCreditTermDataSource = this.this$0;
        if (i3 == 0) {
            remoteCreditTermDataSource.onWarmupCompleted(null, this);
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = remoteCreditTermDataSource.onWarmupCompleted(null, this);
        if (objOnWarmupCompleted == access14300.onWarmupCompleted()) {
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return objOnWarmupCompleted;
        }
        Result resultIAuthTabCallback = Result.IAuthTabCallback(objOnWarmupCompleted);
        int i6 = onExtraCallback + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return resultIAuthTabCallback;
    }
}
