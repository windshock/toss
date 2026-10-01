package com.tnkfactory.ad.basic;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
import com.xwray.groupie.GroupieAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkCpsSearchWithFilterDialog a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, ArrayList arrayList, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkCpsSearchWithFilterDialog;
        this.b = arrayList;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new c(this.a, this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new c(this.a, this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        RecyclerView comTnkOffRvSearchRecommendKeyword = this.a.getComTnkOffRvSearchRecommendKeyword();
        if (comTnkOffRvSearchRecommendKeyword != null) {
            TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog = this.a;
            ArrayList arrayList = this.b;
            comTnkOffRvSearchRecommendKeyword.setLayoutManager(new GridLayoutManager(tnkCpsSearchWithFilterDialog.getContext(), 5, 0, false));
            GroupieAdapter groupieAdapter = new GroupieAdapter();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                groupieAdapter.add(new TnkCpsSearchWithFilterDialog.FavoriteKeywordHolder(tnkCpsSearchWithFilterDialog, (CpsFavoriteKeywardVo) it.next()));
                arrayList2.add(Unit.INSTANCE);
            }
            comTnkOffRvSearchRecommendKeyword.setAdapter(groupieAdapter);
        }
        return Unit.INSTANCE;
    }
}
