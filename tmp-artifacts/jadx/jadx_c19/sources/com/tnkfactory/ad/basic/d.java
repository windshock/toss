package com.tnkfactory.ad.basic;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
import com.xwray.groupie.GroupieAdapter;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkCpsSearchWithFilterDialog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkCpsSearchWithFilterDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new d(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new d(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        RecyclerView comTnkOffRvSearchRecommendKeyword = this.a.getComTnkOffRvSearchRecommendKeyword();
        if (comTnkOffRvSearchRecommendKeyword != null) {
            TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog = this.a;
            comTnkOffRvSearchRecommendKeyword.setLayoutManager(new GridLayoutManager(tnkCpsSearchWithFilterDialog.getContext(), 2));
            GroupieAdapter groupieAdapter = new GroupieAdapter();
            CpsFavoriteKeywardVo[] cpsFavoriteKeywardVoArr = {new CpsFavoriteKeywardVo(1, "1등", 0), new CpsFavoriteKeywardVo(2, "2등", 1), new CpsFavoriteKeywardVo(3, "3등", 2), new CpsFavoriteKeywardVo(4, "4등", 3)};
            ArrayList arrayList = new ArrayList(4);
            for (int i2 = 0; i2 < 4; i2++) {
                groupieAdapter.add(new TnkCpsSearchWithFilterDialog.FavoriteKeywordHolder(tnkCpsSearchWithFilterDialog, cpsFavoriteKeywardVoArr[i2]));
                arrayList.add(Unit.INSTANCE);
            }
            comTnkOffRvSearchRecommendKeyword.setAdapter(groupieAdapter);
        }
        return Unit.INSTANCE;
    }
}
