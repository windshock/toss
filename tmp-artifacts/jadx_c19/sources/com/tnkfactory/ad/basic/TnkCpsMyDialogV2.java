package com.tnkfactory.ad.basic;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.x;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.GroupieAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import o.clearRegisters;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCpsMyDialogV2 extends CpsDetailWebDialog implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final Lazy f;
    public final TextFieldSizeKtExternalSyntheticLambda2 g;
    public final FragmentActivity h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableLiveData f34i;
    public final MediatorLiveData j;
    public final GroupieAdapter k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnkCpsMyDialogV2(@NotNull Context context, @NotNull String str) {
        super(context, str);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda3
            public final Object invoke() {
                return TnkCpsMyDialogV2.a(this.f$0);
            }
        });
        this.f = lazyOnExtraCallbackWithResult;
        this.g = (TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue();
        MutableLiveData mutableLiveData = new MutableLiveData(0);
        this.f34i = mutableLiveData;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Function1 function1 = new Function1() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return TnkCpsMyDialogV2.a(mediatorLiveData, this, obj);
            }
        };
        mediatorLiveData.addSource(mutableLiveData, new x(function1));
        mediatorLiveData.addSource(getMyRecent(), new x(function1));
        this.j = mediatorLiveData;
        this.k = new GroupieAdapter();
        this.h = (FragmentActivity) context;
        ((TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 a(TnkCpsMyDialogV2 tnkCpsMyDialogV2) {
        return new TextFieldSizeKtExternalSyntheticLambda2(tnkCpsMyDialogV2);
    }

    public final FragmentActivity getActivity() {
        return this.h;
    }

    public final List<ITnkOffAdItem> getAdList() throws IllegalAccessException, InstantiationException {
        ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : adList) {
            if (Intrinsics.areEqual(((AdListVo) obj).getLike_yn(), "Y")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AdListVo adListVo = (AdListVo) it.next();
            int ad_list_cps_normal = TnkLayoutType.INSTANCE.getAD_LIST_CPS_NORMAL();
            Intrinsics.checkNotNullParameter(adListVo, "");
            Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_normal).getViewClass()).newInstance();
            ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
            iTnkOffAdItem.onItemInit(new TnkContext(this.h), adListVo);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
            arrayList2.add(iTnkOffAdItem);
        }
        return arrayList2;
    }

    public final GroupieAdapter getAdapter() {
        return this.k;
    }

    public final View getComTnkOffCpsMyDeleteAll() {
        return findViewById(R.id.com_tnk_off_cps_my_delete_all);
    }

    public final View getComTnkOffCpsMyLike() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_my_like);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View getComTnkOffCpsMyLikeUnderline() {
        return findViewById(R.id.com_tnk_off_cps_my_like_underline);
    }

    public final View getComTnkOffCpsMyRecent() {
        return findViewById(R.id.com_tnk_off_cps_my_recent);
    }

    public final View getComTnkOffCpsMyRecentUnderline() {
        return findViewById(R.id.com_tnk_off_cps_my_recent_under_line);
    }

    public final View getComTnkOffCpsOrder() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_my_order);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final View getComTnkOffMyMenuFaqUnderline() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_my_order_under_line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    @Override // com.tnkfactory.ad.basic.CpsDetailWebDialog
    public int getLayoutId() {
        return R.layout.com_tnk_offerwall_cps_webview_my;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.g;
    }

    public final View getLlCpsMyLike() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_my_like_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final LiveData<ArrayList<Long>> getMyRecent() {
        return TnkCore.INSTANCE.getOffRepository().getCpsRecentItem();
    }

    public final LiveData<List<ITnkOffAdItem>> getPrintItem() {
        return this.j;
    }

    public final ArrayList<ITnkOffAdItem> getRecentItems(@NotNull List<Long> list) throws IllegalAccessException, InstantiationException {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<ITnkOffAdItem> arrayList = new ArrayList<>();
        int iMin = Math.min(list.size(), 50);
        for (int i2 = 0; i2 < iMin; i2++) {
            long jLongValue = list.get(i2).longValue();
            Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getAdList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AdListVo adListVo = (AdListVo) next;
                if (adListVo.getAppId() == jLongValue && adListVo.getAdType() == 4) {
                    break;
                }
            }
            AdListVo adListVo2 = (AdListVo) next;
            if (adListVo2 != null) {
                int ad_list_cps_my_recent = TnkLayoutType.INSTANCE.getAD_LIST_CPS_MY_RECENT();
                Intrinsics.checkNotNullParameter(adListVo2, "");
                Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_my_recent).getViewClass()).newInstance();
                ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
                iTnkOffAdItem.onItemInit(new TnkContext(this.h), adListVo2);
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
                arrayList.add(iTnkOffAdItem);
            }
        }
        return arrayList;
    }

    public final RecyclerView getRvCpsMyLike() {
        RecyclerView recyclerViewFindViewById = findViewById(R.id.com_tnk_off_cps_my_rv_like);
        Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
        return recyclerViewFindViewById;
    }

    public final MutableLiveData<Integer> getSelectedTab() {
        return this.f34i;
    }

    @Override // com.tnkfactory.ad.basic.CpsDetailWebDialog
    public void initView() {
        TnkCore.INSTANCE.getOffRepository().loadAdItemClickHistory();
        getRvCpsMyLike().setAdapter(this.k);
        RecyclerView rvCpsMyLike = getRvCpsMyLike();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 12, 1, false);
        this.k.setSpanCount(12);
        gridLayoutManager.IAuthTabCallback(this.k.getSpanSizeLookup());
        rvCpsMyLike.setLayoutManager(gridLayoutManager);
        this.j.observe(this, new x(new Function1() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TnkCpsMyDialogV2.a(this.f$0, (List) obj);
            }
        }));
        getComTnkOffCpsOrder().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.onTabSelected(view);
            }
        });
        getComTnkOffCpsMyLike().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.onTabSelected(view);
            }
        });
        View comTnkOffCpsMyRecent = getComTnkOffCpsMyRecent();
        if (comTnkOffCpsMyRecent != null) {
            comTnkOffCpsMyRecent.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.onTabSelected(view);
                }
            });
        }
        getComTnkOffCpsOrder().performClick();
        View comTnkOffCpsMyDeleteAll = getComTnkOffCpsMyDeleteAll();
        if (comTnkOffCpsMyDeleteAll != null) {
            comTnkOffCpsMyDeleteAll.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCpsMyDialogV2$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkCpsMyDialogV2.a(view);
                }
            });
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.f.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.f.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP);
    }

    public final void onTabSelected(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        View comTnkOffCpsMyDeleteAll = getComTnkOffCpsMyDeleteAll();
        if (comTnkOffCpsMyDeleteAll != null) {
            comTnkOffCpsMyDeleteAll.setVisibility(8);
        }
        if (!Intrinsics.areEqual(view, getComTnkOffCpsOrder())) {
            if (Intrinsics.areEqual(view, getComTnkOffCpsMyLike())) {
                RecyclerView rvCpsMyLike = getRvCpsMyLike();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 12, 1, false);
                this.k.setSpanCount(12);
                gridLayoutManager.IAuthTabCallback(this.k.getSpanSizeLookup());
                rvCpsMyLike.setLayoutManager(gridLayoutManager);
                this.f34i.postValue(1);
            } else if (Intrinsics.areEqual(view, getComTnkOffCpsMyRecent())) {
                getRvCpsMyLike().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                this.f34i.postValue(2);
                View comTnkOffCpsMyDeleteAll2 = getComTnkOffCpsMyDeleteAll();
                if (comTnkOffCpsMyDeleteAll2 != null) {
                    comTnkOffCpsMyDeleteAll2.setVisibility(0);
                }
            }
        }
        getComTnkOffCpsOrder().setSelected(Intrinsics.areEqual(view, getComTnkOffCpsOrder()));
        getComTnkOffMyMenuFaqUnderline().setVisibility(Intrinsics.areEqual(view, getComTnkOffCpsOrder()) ? 0 : 8);
        getComTnkOffCpsMyLike().setSelected(Intrinsics.areEqual(view, getComTnkOffCpsMyLike()));
        View comTnkOffCpsMyLikeUnderline = getComTnkOffCpsMyLikeUnderline();
        if (comTnkOffCpsMyLikeUnderline != null) {
            comTnkOffCpsMyLikeUnderline.setVisibility(Intrinsics.areEqual(view, getComTnkOffCpsMyLike()) ? 0 : 8);
        }
        View comTnkOffCpsMyRecent = getComTnkOffCpsMyRecent();
        if (comTnkOffCpsMyRecent != null) {
            comTnkOffCpsMyRecent.setSelected(Intrinsics.areEqual(view, getComTnkOffCpsMyRecent()));
        }
        View comTnkOffCpsMyRecentUnderline = getComTnkOffCpsMyRecentUnderline();
        if (comTnkOffCpsMyRecentUnderline != null) {
            comTnkOffCpsMyRecentUnderline.setVisibility(Intrinsics.areEqual(view, getComTnkOffCpsMyRecent()) ? 0 : 8);
        }
        getLlCpsMyLike().setVisibility(getComTnkOffCpsOrder().isSelected() ? 8 : 0);
    }

    public static final Unit a(MediatorLiveData mediatorLiveData, TnkCpsMyDialogV2 tnkCpsMyDialogV2, Object obj) throws IllegalAccessException, InstantiationException {
        List<ITnkOffAdItem> arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(obj, "");
        Integer num = (Integer) tnkCpsMyDialogV2.f34i.getValue();
        if (num != null && num.intValue() == 1) {
            arrayList = tnkCpsMyDialogV2.getAdList();
        } else if (num == null || num.intValue() != 2 || (arrayList2 = (ArrayList) tnkCpsMyDialogV2.getMyRecent().getValue()) == null || (arrayList = tnkCpsMyDialogV2.getRecentItems(arrayList2)) == null) {
            arrayList = new ArrayList<>();
        }
        mediatorLiveData.setValue(arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkCpsMyDialogV2 tnkCpsMyDialogV2, List list) {
        tnkCpsMyDialogV2.k.update(list);
        return Unit.INSTANCE;
    }

    public static final void a(View view) {
        TnkCore.INSTANCE.getOffRepository().clearAdItemClickHistory();
    }
}
