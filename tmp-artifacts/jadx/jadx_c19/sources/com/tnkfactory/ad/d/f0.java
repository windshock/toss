package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.framework.vo.ValueObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class f0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkOffRepository a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(TnkOffRepository tnkOffRepository, long j, boolean z, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkOffRepository;
        this.b = j;
        this.c = z;
    }

    public static final ResultState a(TnkOffRepository tnkOffRepository, long j, boolean z) {
        ResultState<ValueObject> resultStateLikeProduct = tnkOffRepository.getServiceTask().likeProduct(j, z);
        if (!(resultStateLikeProduct instanceof ResultState.Success)) {
            return resultStateLikeProduct instanceof ResultState.Error ? new ResultState.Error(((ResultState.Error) resultStateLikeProduct).getE()) : resultStateLikeProduct instanceof ResultState.Pass ? new ResultState.Error(new TnkError(0, "pass", null, 4, null)) : new ResultState.Error(new TnkError(99, "unknown error", null, 4, null));
        }
        ResultState.Success success = (ResultState.Success) resultStateLikeProduct;
        int i2 = ((ValueObject) success.getValue()).getInt("ret_cd", 500);
        String string = ((ValueObject) success.getValue()).getString("ret_msg");
        if (i2 == 0) {
            return new ResultState.Success(Boolean.TRUE);
        }
        if (string == null) {
            string = ErrorCodes.INSTANCE.getErrorMessage(i2);
        }
        return new ResultState.Error(new TnkError(i2, string, null, 4, null));
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new f0(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        final TnkOffRepository tnkOffRepository = this.a;
        final long j = this.b;
        final boolean z = this.c;
        return new TnkResultTask(new Function0() { // from class: com.tnkfactory.ad.d.f0$$ExternalSyntheticLambda0
            public final Object invoke() {
                return f0.a(tnkOffRepository, j, z);
            }
        });
    }
}
