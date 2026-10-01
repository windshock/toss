package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItemKt;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkAdMyMenu a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TnkAdMyMenu tnkAdMyMenu, ArrayList arrayList, View view, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkAdMyMenu;
        this.b = arrayList;
        this.c = view;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new a(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        TnkOffNavi tnkNavi = this.a.getTnkNavi();
        Intrinsics.checkNotNull(tnkNavi);
        tnkNavi.showLoading(false);
        ArrayList arrayList = this.b;
        View view = this.c;
        ArrayList<MultiCampaignJoinListItem> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (MultiCampaignJoinListItemKt.isCorrectItem((MultiCampaignJoinListItem) obj2, context)) {
                arrayList2.add(obj2);
            }
        }
        TnkAdMyMenu tnkAdMyMenu = this.a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (MultiCampaignJoinListItem multiCampaignJoinListItem : arrayList2) {
            FragmentActivity appCompatActivity = tnkAdMyMenu.getAppCompatActivity();
            Intrinsics.checkNotNull(appCompatActivity);
            arrayList3.add(new TnkAdMultiJoinListItem2(multiCampaignJoinListItem, new TnkContext(appCompatActivity), tnkAdMyMenu.getOnEventItemClick()));
        }
        this.a.getMMultiJoinItems().addAll(arrayList3);
        this.a.updateMultiJoinItems();
        return Unit.INSTANCE;
    }
}
