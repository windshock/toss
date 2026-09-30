package com.tnkfactory.ad;

import android.text.TextUtils;
import androidx.lifecycle.MediatorLiveData;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.a.n;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.view.Filter;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkRwdFilter.FilterModel a;
    public final /* synthetic */ TnkAdListModel b;
    public final /* synthetic */ MediatorLiveData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TnkRwdFilter.FilterModel filterModel, TnkAdListModel tnkAdListModel, MediatorLiveData mediatorLiveData, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = filterModel;
        this.b = tnkAdListModel;
        this.c = mediatorLiveData;
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, TnkRwdFilter.FilterModel filterModel, MediatorLiveData mediatorLiveData, ArrayList arrayList) {
        tnkAdListModel.get_adList().clear();
        ArrayList<AdListVo> arrayList2 = tnkAdListModel.get_adList();
        ArrayList arrayList3 = new ArrayList(tnkAdListModel.getRepository().getAdList());
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (hashSet.add(Long.valueOf(((AdListVo) obj).getAppId()))) {
                arrayList4.add(obj);
            }
        }
        arrayList2.addAll(arrayList4);
        tnkAdListModel.getCuriation().clear();
        tnkAdListModel.getCuriation().addAll(tnkAdListModel.getRepository().getCuriation());
        Intrinsics.checkNotNull(filterModel);
        TnkAdListModel.ListUiModel uiModel = tnkAdListModel.getUiModel(filterModel);
        if (uiModel != null) {
            mediatorLiveData.postValue(uiModel);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(TnkAdListModel tnkAdListModel, TnkRwdFilter.FilterModel filterModel, MediatorLiveData mediatorLiveData, ArrayList arrayList) {
        tnkAdListModel.getNewsList().addAll(tnkAdListModel.getRepository().getNewsList());
        Intrinsics.checkNotNull(filterModel);
        TnkAdListModel.ListUiModel uiModel = tnkAdListModel.getUiModel(filterModel);
        if (uiModel != null) {
            mediatorLiveData.postValue(uiModel);
        }
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new a(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        Filter selectedFilter = this.a.getSelectedFilter();
        if (selectedFilter != null) {
            selectedFilter.getFilterUrl();
        }
        String placementId = Settings.INSTANCE.getPlacementId(this.b.getMContext());
        if (!this.b.getLoadedCps() && this.a.isCps()) {
            this.b.get_isLoading().postValue(access14000.onNavigationEvent(true));
            this.b.setLoadedCps(true);
            TnkResultTask<ArrayList<AdListVo>> tnkResultTaskLoadCPSAdData = this.b.getRepository().loadCPSAdData();
            final TnkAdListModel tnkAdListModel = this.b;
            final TnkRwdFilter.FilterModel filterModel = this.a;
            final MediatorLiveData mediatorLiveData = this.c;
            TnkResultTask<ArrayList<AdListVo>> onSuccess = tnkResultTaskLoadCPSAdData.setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.a$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return a.a(tnkAdListModel, filterModel, mediatorLiveData, (ArrayList) obj2);
                }
            });
            final TnkAdListModel tnkAdListModel2 = this.b;
            onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.a$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2) {
                    return a.a(tnkAdListModel2, (TnkError) obj2);
                }
            }).execute();
        } else if (!this.b.getLoadedNews() && this.a.getSelectedFilterId() == 101 && TextUtils.isEmpty(placementId)) {
            this.b.getTnkContext().getNavi().showLoading(true);
            this.b.get_isLoading().postValue(access14000.onNavigationEvent(true));
            this.b.setLoadedNews(true);
            TnkResultTask<ArrayList<AdListVo>> tnkResultTaskLoadNewsAdData = TnkCore.INSTANCE.getOffRepository().loadNewsAdData();
            final TnkAdListModel tnkAdListModel3 = this.b;
            final TnkRwdFilter.FilterModel filterModel2 = this.a;
            final MediatorLiveData mediatorLiveData2 = this.c;
            TnkResultTask<ArrayList<AdListVo>> onSuccess2 = tnkResultTaskLoadNewsAdData.setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.a$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2) {
                    return a.b(tnkAdListModel3, filterModel2, mediatorLiveData2, (ArrayList) obj2);
                }
            });
            final TnkAdListModel tnkAdListModel4 = this.b;
            onSuccess2.setOnError(new Function1() { // from class: com.tnkfactory.ad.a$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2) {
                    return a.b(tnkAdListModel4, (TnkError) obj2);
                }
            }).execute();
        } else {
            TnkAdListModel tnkAdListModel5 = this.b;
            TnkRwdFilter.FilterModel filterModel3 = this.a;
            Intrinsics.checkNotNull(filterModel3);
            TnkAdListModel.ListUiModel uiModel = tnkAdListModel5.getUiModel(filterModel3);
            if (uiModel != null) {
                this.c.postValue(uiModel);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(TnkAdListModel tnkAdListModel, TnkError tnkError) {
        tnkAdListModel.getTnkContext().getNavi().showDialog(tnkAdListModel.getMContext(), "서버 요청 시 오류가 발생하였습니다", new Function0() { // from class: com.tnkfactory.ad.a$$ExternalSyntheticLambda4
            public final Object invoke() {
                return a.a();
            }
        });
        tnkAdListModel.get_isLoading().postValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, TnkError tnkError) {
        tnkAdListModel.setLoadedCps(false);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkAdListModel), putChannelInfo.onExtraCallback(), (setRandomHost) null, new n(tnkError, tnkAdListModel, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
