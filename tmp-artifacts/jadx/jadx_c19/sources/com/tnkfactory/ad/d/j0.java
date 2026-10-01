package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.repository.rpc.parser.AdListParser;
import com.tnkfactory.ad.rwd.Resources;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.framework.vo.ValueObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class j0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkOffRepository a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(TnkOffRepository tnkOffRepository, long j, long j2, int i2, long j3, long j4, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkOffRepository;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.f = j4;
    }

    public static final ResultState a(TnkOffRepository tnkOffRepository, long j, long j2, int i2, long j3, long j4) {
        ResultState<ValueObject> resultStateRequestPayForAttend = tnkOffRepository.getServiceTask().requestPayForAttend(j, j2, i2, j3, j4);
        if (!(resultStateRequestPayForAttend instanceof ResultState.Success)) {
            return resultStateRequestPayForAttend instanceof ResultState.Error ? new ResultState.Error(((ResultState.Error) resultStateRequestPayForAttend).getE()) : resultStateRequestPayForAttend instanceof ResultState.Pass ? new ResultState.Error(new TnkError(0, "pass", null, 4, null)) : new ResultState.Error(new TnkError(0, "pass", null, 4, null));
        }
        ResultState.Success success = (ResultState.Success) resultStateRequestPayForAttend;
        int i3 = ((ValueObject) success.getValue()).getInt("ret_cd");
        String string = ((ValueObject) success.getValue()).getString("ret_msg");
        if (i3 == 0) {
            return new ResultState.Success(AdListParser.INSTANCE.parsePayForAttend((ValueObject) success.getValue()));
        }
        if (i3 == 11) {
            try {
                int i4 = ((ValueObject) ((ResultState.Success) resultStateRequestPayForAttend).getValue()).getInt("left_hour");
                String str = Resources.getResources().error_not_yet_attend_time;
                Intrinsics.checkNotNullExpressionValue(str, "");
                StringBuilder sb = new StringBuilder();
                sb.append(i4);
                string = StringsKt.replace$default(str, "{left_hour}", sb.toString(), false, 4, (Object) null);
            } catch (Exception unused) {
            }
        }
        return new ResultState.Error(new TnkError(i3, string == null ? ErrorCodes.INSTANCE.getErrorMessage(i3) : string, null, 4, null));
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new j0(this.a, this.b, this.c, this.d, this.e, this.f, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        final TnkOffRepository tnkOffRepository = this.a;
        final long j = this.b;
        final long j2 = this.c;
        final int i2 = this.d;
        final long j3 = this.e;
        final long j4 = this.f;
        return new TnkResultTask(new Function0() { // from class: com.tnkfactory.ad.d.j0$$ExternalSyntheticLambda0
            public final Object invoke() {
                return j0.a(tnkOffRepository, j, j2, i2, j3, j4);
            }
        });
    }
}
