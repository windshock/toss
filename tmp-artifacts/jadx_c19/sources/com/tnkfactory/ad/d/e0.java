package com.tnkfactory.ad.d;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.repository.rpc.parser.AdListParser;
import com.tnkfactory.ad.rwd.api.ServiceTask;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItemKt;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.framework.vo.ValueObject;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class e0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkOffRepository a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(TnkOffRepository tnkOffRepository, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkOffRepository;
    }

    public static final ResultState a(TnkOffRepository tnkOffRepository) {
        ResultState multiCampaignJoinList$default = ServiceTask.getMultiCampaignJoinList$default(tnkOffRepository.getServiceTask(), 0, 1, null);
        if (!(multiCampaignJoinList$default instanceof ResultState.Success)) {
            return multiCampaignJoinList$default instanceof ResultState.Error ? new ResultState.Error(((ResultState.Error) multiCampaignJoinList$default).getE()) : multiCampaignJoinList$default instanceof ResultState.Pass ? new ResultState.Error(new TnkError(0, "pass", null, 4, null)) : new ResultState.Error(new TnkError(0, "pass", null, 4, null));
        }
        ResultState.Success success = (ResultState.Success) multiCampaignJoinList$default;
        if (((ValueObject) success.getValue()).size() <= 0) {
            return new ResultState.Success(new ArrayList());
        }
        int i2 = ((ValueObject) success.getValue()).getInt("ret_cd");
        String string = ((ValueObject) success.getValue()).getString("ret_msg");
        if (i2 != 0) {
            return new ResultState.Error(new TnkError(i2, string == null ? ErrorCodes.INSTANCE.getErrorMessage(i2) : string, null, 4, null));
        }
        ArrayList<MultiCampaignJoinListItem> multiCampaignJoinListItem = AdListParser.INSTANCE.parseMultiCampaignJoinListItem((ValueObject) success.getValue());
        ArrayList arrayList = new ArrayList();
        for (Object obj : multiCampaignJoinListItem) {
            if (MultiCampaignJoinListItemKt.isCorrectItem((MultiCampaignJoinListItem) obj, tnkOffRepository.getServiceTask().getApplicationContext())) {
                arrayList.add(obj);
            }
        }
        return new ResultState.Success(new ArrayList(arrayList));
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new e0(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new e0(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        final TnkOffRepository tnkOffRepository = this.a;
        return new TnkResultTask(new Function0() { // from class: com.tnkfactory.ad.d.e0$$ExternalSyntheticLambda0
            public final Object invoke() {
                return e0.a(tnkOffRepository);
            }
        });
    }
}
