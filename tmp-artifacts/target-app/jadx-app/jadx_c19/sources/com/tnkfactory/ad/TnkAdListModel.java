package com.tnkfactory.ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.tnkfactory.ad.AdListViewImpl;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkAdListModel$;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.a.j;
import com.tnkfactory.ad.a.k;
import com.tnkfactory.ad.a.l;
import com.tnkfactory.ad.a.m;
import com.tnkfactory.ad.basic.AdDetailEventWebView;
import com.tnkfactory.ad.ext.LiveDatasKt$sam$i$androidx_lifecycle_Observer$0;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.off.data.AdListVoKt;
import com.tnkfactory.ad.off.data.EventListVo;
import com.tnkfactory.ad.off.data.RecommendList;
import com.tnkfactory.ad.rwd.BannerItem;
import com.tnkfactory.ad.rwd.PubInfo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ProcessTextApi23ImplExternalSyntheticLambda1;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.clearRevision;
import o.getBacktraceNote;
import o.getCodeNameBytes;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListModel implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final TnkContext a;
    public final TextFieldKeyInputExternalSyntheticLambda9 b;
    public final TnkOffRepository c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final FragmentActivity f;
    public final long g;
    public final MediatorLiveData h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableLiveData f26i;
    public TnkRwdFilter j;
    public ArrayList k;
    public MutableLiveData l;
    public final ArrayList m;
    public final ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f27o;
    public final ArrayList p;
    public final PubInfo q;
    public boolean r;
    public boolean s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MediatorLiveData v;
    public final LiveData w;
    public boolean x;

    public static final class ListUiModel {
        public final TnkRwdFilter.FilterModel a;
        public final List b;
        public final Map c;
        public final List d;
        public final List e;
        public final List f;
        public RecommendList g;
        public final String h;

        public ListUiModel(@Nullable TnkRwdFilter.FilterModel filterModel, @Nullable List<BannerItem> list, @Nullable Map<Integer, ? extends List<BannerItem>> map, @Nullable List<AdListViewImpl.UiCurationItem> list2, @Nullable List<AdListViewImpl.UiCurationItem> list3, @NotNull List<? extends AdListVo> list4, @Nullable RecommendList recommendList, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.a = filterModel;
            this.b = list;
            this.c = map;
            this.d = list2;
            this.e = list3;
            this.f = list4;
            this.g = recommendList;
            this.h = str;
        }

        public final TnkRwdFilter.FilterModel component1() {
            return this.a;
        }

        public final List<BannerItem> component2() {
            return this.b;
        }

        public final Map<Integer, List<BannerItem>> component3() {
            return this.c;
        }

        public final List<AdListViewImpl.UiCurationItem> component4() {
            return this.d;
        }

        public final List<AdListViewImpl.UiCurationItem> component5() {
            return this.e;
        }

        public final List<AdListVo> component6() {
            return this.f;
        }

        public final RecommendList component7() {
            return this.g;
        }

        public final String component8() {
            return this.h;
        }

        public final ListUiModel copy(@Nullable TnkRwdFilter.FilterModel filterModel, @Nullable List<BannerItem> list, @Nullable Map<Integer, ? extends List<BannerItem>> map, @Nullable List<AdListViewImpl.UiCurationItem> list2, @Nullable List<AdListViewImpl.UiCurationItem> list3, @NotNull List<? extends AdListVo> list4, @Nullable RecommendList recommendList, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ListUiModel(filterModel, list, map, list2, list3, list4, recommendList, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListUiModel)) {
                return false;
            }
            ListUiModel listUiModel = (ListUiModel) obj;
            return Intrinsics.areEqual(this.a, listUiModel.a) && Intrinsics.areEqual(this.b, listUiModel.b) && Intrinsics.areEqual(this.c, listUiModel.c) && Intrinsics.areEqual(this.d, listUiModel.d) && Intrinsics.areEqual(this.e, listUiModel.e) && Intrinsics.areEqual(this.f, listUiModel.f) && Intrinsics.areEqual(this.g, listUiModel.g) && Intrinsics.areEqual(this.h, listUiModel.h);
        }

        public final List<AdListVo> getAdList() {
            return this.f;
        }

        public final Map<Integer, List<BannerItem>> getBannerList() {
            return this.c;
        }

        public final List<BannerItem> getBannerTop() {
            return this.b;
        }

        public final List<AdListViewImpl.UiCurationItem> getCuration() {
            return this.d;
        }

        public final List<AdListViewImpl.UiCurationItem> getCurationList() {
            return this.e;
        }

        public final TnkRwdFilter.FilterModel getFilter() {
            return this.a;
        }

        public final RecommendList getRecommendList() {
            return this.g;
        }

        public final String getUrl() {
            return this.h;
        }

        public int hashCode() {
            TnkRwdFilter.FilterModel filterModel = this.a;
            int iHashCode = filterModel == null ? 0 : filterModel.hashCode();
            List list = this.b;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            Map map = this.c;
            int iHashCode3 = map == null ? 0 : map.hashCode();
            List list2 = this.d;
            int iHashCode4 = list2 == null ? 0 : list2.hashCode();
            List list3 = this.e;
            int iHashCode5 = list3 == null ? 0 : list3.hashCode();
            int iHashCode6 = this.f.hashCode();
            RecommendList recommendList = this.g;
            return this.h.hashCode() + ((((iHashCode6 + (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31) + (recommendList != null ? recommendList.hashCode() : 0)) * 31);
        }

        public final void setRecommendList(@Nullable RecommendList recommendList) {
            this.g = recommendList;
        }

        public String toString() {
            return "ListUiModel(filter=" + this.a + ", bannerTop=" + this.b + ", bannerList=" + this.c + ", curation=" + this.d + ", curationList=" + this.e + ", adList=" + this.f + ", recommendList=" + this.g + ", url=" + this.h + ")";
        }
    }

    public TnkAdListModel(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = tnkContext;
        this.b = tnkContext.getLifecycle();
        TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
        this.c = offRepository;
        this.d = offRepository.getDataChanged();
        MutableLiveData<ArrayList<MultiCampaignJoinListItem>> joinMultiList = offRepository.getJoinMultiList();
        this.e = joinMultiList;
        this.f = tnkContext.getActivity();
        this.g = offRepository.getEarnPoint();
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(joinMultiList, new m(new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return TnkAdListModel.a(this.f$0, mediatorLiveData, (ArrayList) obj);
            }
        }));
        this.h = mediatorLiveData;
        this.f26i = new MutableLiveData("");
        this.j = new TnkRwdFilter();
        this.k = new ArrayList();
        this.l = offRepository.getRecommendList();
        this.m = offRepository.getBannerList();
        this.n = offRepository.getCpsBannerList();
        ArrayList arrayList = new ArrayList();
        this.f27o = arrayList;
        this.p = new ArrayList();
        this.q = offRepository.getPubInfo();
        this.j = offRepository.getRwdFilter();
        this.k.addAll(offRepository.getCuriation());
        arrayList.addAll(offRepository.getAdList());
        offRepository.getRecommendList().setValue((Object) null);
        this.l = offRepository.getRecommendList();
        this.t = new MutableLiveData(Boolean.FALSE);
        this.u = new MutableLiveData(Boolean.TRUE);
        final LiveData mediatorLiveData2 = new MediatorLiveData();
        TnkRwdFilter.FilterModel filterModel = (TnkRwdFilter.FilterModel) this.j.getFilterUiModel().getValue();
        if (filterModel != null) {
            filterModel.setSelectedCategory(new CategorySet(0, 0, "", null, new ArrayList(), ""));
            filterModel.setSelectedFilter(new Filter("", 0, null));
            filterModel.setSelectedCategoryId(0);
            filterModel.setSelectedFilterId(0);
            filterModel.setCps(false);
        }
        mediatorLiveData2.addSource(this.j.getFilterUiModel(), new m(new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return TnkAdListModel.a(this.f$0, mediatorLiveData2, (TnkRwdFilter.FilterModel) obj);
            }
        }));
        this.v = mediatorLiveData2;
        ListUiModel listUiModel = new ListUiModel(null, null, null, null, null, new ArrayList(), null, "");
        final LiveData liveData = this.l;
        final MediatorLiveData mediatorLiveData3 = new MediatorLiveData();
        mediatorLiveData3.setValue(listUiModel);
        Iterator it = CollectionsKt.listOf(new LiveData[]{mediatorLiveData2, liveData}).iterator();
        while (it.hasNext()) {
            mediatorLiveData3.addSource((LiveData) it.next(), new LiveDatasKt$sam$i$androidx_lifecycle_Observer$0(new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$special$$inlined$combine$1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m133invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m133invoke(Object obj) {
                    Object value = mediatorLiveData3.getValue();
                    Object value2 = mediatorLiveData2.getValue();
                    Object value3 = liveData.getValue();
                    if (value == null || value2 == null || value3 == null) {
                        return;
                    }
                    MediatorLiveData mediatorLiveData4 = mediatorLiveData3;
                    TnkAdListModel.ListUiModel listUiModel2 = (TnkAdListModel.ListUiModel) value2;
                    listUiModel2.setRecommendList((RecommendList) value3);
                    mediatorLiveData4.setValue(listUiModel2);
                }
            }));
        }
        this.w = ProcessTextApi23ImplExternalSyntheticLambda1.IAuthTabCallback(mediatorLiveData3);
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, MediatorLiveData mediatorLiveData, ArrayList arrayList) {
        int i2 = Calendar.getInstance().get(6);
        if (arrayList.size() <= 0 || Settings.INSTANCE.isMultiJoinMessage(tnkAdListModel.f) == i2) {
            mediatorLiveData.postValue(Boolean.FALSE);
        } else {
            mediatorLiveData.postValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public final void fetchRecommendList() {
        TnkSession.INSTANCE.runOnIoThread(new Runnable() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TnkAdListModel.a(this.f$0);
            }
        });
    }

    public final AdListVo findItem(long j) {
        Object next;
        Iterator it = this.f27o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AdListVo adListVo = (AdListVo) next;
            if (adListVo.getAppId() == j && !AdListVoKt.payYn(adListVo)) {
                break;
            }
        }
        return (AdListVo) next;
    }

    public final ArrayList<BannerItem> getBannerList() {
        return this.m;
    }

    public final ArrayList<BannerItem> getCpsBannerList() {
        return this.n;
    }

    public final ArrayList<AdListCuration> getCuriation() {
        return this.k;
    }

    public final long getEarnPoint() {
        return this.g;
    }

    public final String getHeaderTitle() {
        return this.q.getHdr_msg();
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.b;
    }

    public final boolean getLoadedCps() {
        return this.r;
    }

    public final boolean getLoadedNews() {
        return this.s;
    }

    public final FragmentActivity getMContext() {
        return this.f;
    }

    public final MutableLiveData<String> getMessage() {
        return this.f26i;
    }

    public final MutableLiveData<ArrayList<MultiCampaignJoinListItem>> getMultiJoinItems() {
        return this.e;
    }

    public final ArrayList<AdListVo> getNewsList() {
        return this.p;
    }

    public final List<AdListVo> getPopular() {
        List listEmptyList;
        CategorySet selectedCategory;
        List<Filter> filterList;
        try {
            TnkRwdFilter.FilterModel filterModel = (TnkRwdFilter.FilterModel) this.j.getFilterUiModel().getValue();
            if (filterModel == null || (selectedCategory = filterModel.getSelectedCategory()) == null || (filterList = selectedCategory.getFilterList()) == null) {
                listEmptyList = null;
            } else {
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterList, 10));
                Iterator<T> it = filterList.iterator();
                while (it.hasNext()) {
                    listEmptyList.add(Integer.valueOf(((Filter) it.next()).getFilterId()));
                }
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            final ArrayList arrayList = new ArrayList(listEmptyList);
            List listIAuthTabCallbackStubProxy = clearRevision.IAuthTabCallbackStubProxy(clearRevision.onExtraCallbackWithResult(clearRevision.onWarmupCompleted(CollectionsKt.asSequence(this.f27o), new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TnkAdListModel.a(arrayList, this, (AdListVo) obj));
                }
            }), new Comparator() { // from class: com.tnkfactory.ad.TnkAdListModel$getPopular$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(AdListVoKt.isInstallComplete((AdListVo) t2, this.a.getTnkContext().getActivity())), Boolean.valueOf(AdListVoKt.isInstallComplete((AdListVo) t, this.a.getTnkContext().getActivity())));
                }
            }));
            return listIAuthTabCallbackStubProxy.subList(0, listIAuthTabCallbackStubProxy.size() <= 5 ? listIAuthTabCallbackStubProxy.size() : 5);
        } catch (Exception e) {
            Logger.e("getPopular failed : " + e);
            return new ArrayList();
        }
    }

    public final PubInfo getPubInfo() {
        return this.q;
    }

    public final MutableLiveData<RecommendList> getRecommendList() {
        return this.l;
    }

    public final TnkOffRepository getRepository() {
        return this.c;
    }

    public final TnkRwdFilter getRwdFilter() {
        return this.j;
    }

    public final MutableLiveData<ListUiModel> getSelectedAdData() {
        return this.v;
    }

    public final MediatorLiveData<Boolean> getShowJoinListItem() {
        return this.h;
    }

    public final TnkContext getTnkContext() {
        return this.a;
    }

    public final LiveData<ListUiModel> getUiModel() {
        return this.w;
    }

    public final MutableLiveData<Boolean> getUpdateSelf() {
        return this.d;
    }

    public final ArrayList<AdListVo> get_adList() {
        return this.f27o;
    }

    public final MutableLiveData<Boolean> get_isLoading() {
        return this.u;
    }

    public final MutableLiveData<Boolean> get_isNeedAdidSetting() {
        return this.t;
    }

    public final boolean isClickProcessing() {
        return this.x;
    }

    public final boolean isExistSelectMenuScheme(@NotNull BannerItem bannerItem) {
        Filter filter;
        Object next;
        List<Filter> filterList;
        Object next2;
        Intrinsics.checkNotNullParameter(bannerItem, "");
        Uri uri = Uri.parse(bannerItem.getClck_url());
        String host = uri.getHost();
        if (host == null || host.hashCode() != 215242434 || !host.equals("select_menu")) {
            return true;
        }
        String queryParameter = uri.getQueryParameter("cat_id");
        int i2 = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("filter_id");
        int i3 = queryParameter2 != null ? Integer.parseInt(queryParameter2) : 0;
        Iterator<T> it = this.j.getCategorySet().iterator();
        while (true) {
            filter = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CategorySet) next).getCatId() == i2) {
                break;
            }
        }
        CategorySet categorySet = (CategorySet) next;
        if (categorySet != null && (filterList = categorySet.getFilterList()) != null) {
            Iterator<T> it2 = filterList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((Filter) next2).getFilterId() == i3) {
                    break;
                }
            }
            Filter filter2 = (Filter) next2;
            if (filter2 != null) {
                filter = filter2;
            }
        }
        return filter != null;
    }

    public final void onClickClose() {
        this.a.getNavi().closeOfferwall();
    }

    public final void onClickEvent(@NotNull final EventListVo eventListVo) {
        Intrinsics.checkNotNullParameter(eventListVo, "");
        if (this.x) {
            return;
        }
        this.x = true;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new j(this, null), 2, (Object) null);
        this.c.requestJoinForEvent(eventListVo, new getBacktraceNote() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda8
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TnkAdListModel.a(eventListVo, this, (EventListVo) obj, ((Boolean) obj2).booleanValue(), (String) obj3);
            }
        });
    }

    public final void onClickMy(int i2) {
        this.a.getNavi().moveToMyMenu(i2);
    }

    public final Object onItemClick(long j, @NotNull access13800<? super Unit> access13800Var) {
        Object next;
        Iterator it = this.f27o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdListVo) next).getAppId() == j) {
                break;
            }
        }
        AdListVo adListVo = (AdListVo) next;
        if (adListVo != null) {
            Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new k(adListVo, this, j, (access13800) null), access13800Var);
            return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Unit.INSTANCE;
        }
        this.a.getNavi().showDialog(this.f, "광고 정보를 찾을 수 없습니다.\n 광고 ID : " + j, new TnkAdListModel$.ExternalSyntheticLambda0());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reload(@NotNull access13800<? super Unit> access13800Var) {
        l lVar;
        final int selectedCategoryId;
        final int i2;
        final TnkAdListModel tnkAdListModel;
        if (access13800Var instanceof l) {
            lVar = (l) access13800Var;
            int i3 = lVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.f = i3 - 2147483648;
            } else {
                lVar = new l(this, access13800Var);
            }
        }
        Object obj = lVar.d;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = lVar.f;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            this.u.postValue(access14000.onNavigationEvent(true));
            this.f27o.clear();
            this.k.clear();
            Object value = this.j.getFilterUiModel().getValue();
            Intrinsics.checkNotNull(value);
            selectedCategoryId = ((TnkRwdFilter.FilterModel) value).getSelectedCategoryId();
            Object value2 = this.j.getFilterUiModel().getValue();
            Intrinsics.checkNotNull(value2);
            int selectedFilterId = ((TnkRwdFilter.FilterModel) value2).getSelectedFilterId();
            TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
            lVar.a = this;
            lVar.b = selectedCategoryId;
            lVar.c = selectedFilterId;
            lVar.f = 1;
            Object objLoadAdData = offRepository.loadAdData(lVar);
            if (objLoadAdData == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            i2 = selectedFilterId;
            obj = objLoadAdData;
            tnkAdListModel = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = lVar.c;
            selectedCategoryId = lVar.b;
            tnkAdListModel = lVar.a;
            ResultKt.onNavigationEvent(obj);
        }
        ((TnkResultTask) obj).execute();
        TnkCore tnkCore = TnkCore.INSTANCE;
        tnkCore.getOffRepository().loadNewsAdData().execute();
        tnkCore.getOffRepository().loadCPSAdData().setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda6
            public final Object invoke(Object obj2) {
                return TnkAdListModel.a(this.f$0, selectedCategoryId, i2, (ArrayList) obj2);
            }
        }).setOnError(new Function1() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda7
            public final Object invoke(Object obj2) {
                return TnkAdListModel.a(this.f$0, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public final void setClickProcessing(boolean z) {
        this.x = z;
    }

    public final void setCuriation(@NotNull ArrayList<AdListCuration> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.k = arrayList;
    }

    public final void setLoadedCps(boolean z) {
        this.r = z;
    }

    public final void setLoadedNews(boolean z) {
        this.s = z;
    }

    public final void setRecommendList(@NotNull MutableLiveData<RecommendList> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.l = mutableLiveData;
    }

    public final void setRwdFilter(@NotNull TnkRwdFilter tnkRwdFilter) {
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
        this.j = tnkRwdFilter;
    }

    public final void setScrollEventListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a.setOnAdListScroll(function1);
    }

    public final void update() {
    }

    public final ListUiModel getUiModel(@NotNull TnkRwdFilter.FilterModel filterModel) {
        ArrayList arrayList;
        Object next;
        ArrayList arrayList2;
        Map linkedHashMap;
        ArrayList arrayList3;
        AdListViewImpl.UiCurationItem uiCurationItem;
        AdListViewImpl.UiCurationItem uiCurationItem2;
        Object next2;
        ArrayList arrayList4;
        Object next3;
        Intrinsics.checkNotNullParameter(filterModel, "");
        try {
            String placementId = Settings.INSTANCE.getPlacementId(this.f);
            if (filterModel.getSelectedFilterId() == 101 && TextUtils.isEmpty(placementId)) {
                return new ListUiModel(filterModel, null, null, null, null, this.p, null, "");
            }
            ArrayList<Integer> arrFilterIds = this.j.getArrFilterIds();
            ArrayList arrayList5 = this.f27o;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : arrayList5) {
                AdListVo adListVo = (AdListVo) obj;
                if (arrFilterIds.contains(Integer.valueOf(adListVo.getFilterId())) && AdListVoKt.isCorrectItem(adListVo, this.f)) {
                    arrayList6.add(obj);
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(arrayList6, new Comparator() { // from class: com.tnkfactory.ad.TnkAdListModel$getUiModel$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Boolean.valueOf(AdListVoKt.isInstallComplete((AdListVo) t2, this.a.getTnkContext().getActivity())), Boolean.valueOf(AdListVoKt.isInstallComplete((AdListVo) t, this.a.getTnkContext().getActivity())));
                }
            });
            if (this.m.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList7 = filterModel.isCps() ? this.n : this.m;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : arrayList7) {
                    BannerItem bannerItem = (BannerItem) obj2;
                    if (bannerItem.getApp_id() != 0) {
                        Iterator it = this.f27o.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((AdListVo) next).getAppId() == bannerItem.getApp_id()) {
                                break;
                            }
                        }
                        if (next != null) {
                        }
                    }
                    arrayList8.add(obj2);
                }
                arrayList = new ArrayList();
                for (Object obj3 : arrayList8) {
                    if (isExistSelectMenuScheme((BannerItem) obj3)) {
                        arrayList.add(obj3);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((BannerItem) obj4).getPos_type() == 0) {
                        arrayList2.add(obj4);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                linkedHashMap = new HashMap();
            } else {
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : arrayList) {
                    if (((BannerItem) obj5).getPos_type() == 1) {
                        arrayList9.add(obj5);
                    }
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj6 : arrayList9) {
                    Integer numValueOf = Integer.valueOf(((BannerItem) obj6).getOrd_no());
                    Object arrayList10 = linkedHashMap.get(numValueOf);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList10);
                    }
                    ((List) arrayList10).add((BannerItem) obj6);
                }
            }
            Map map = linkedHashMap;
            ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it2 = listSortedWith.iterator();
            while (it2.hasNext()) {
                arrayList11.add(Long.valueOf(((AdListVo) it2.next()).getAppId()));
            }
            if (TnkAdConfig.INSTANCE.getUseCuration()) {
                ArrayList arrayList12 = this.k;
                HashSet hashSet = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj7 : arrayList12) {
                    if (hashSet.add(Integer.valueOf(((AdListCuration) obj7).getCrt_id()))) {
                        arrayList13.add(obj7);
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                for (Object obj8 : arrayList13) {
                    AdListCuration adListCuration = (AdListCuration) obj8;
                    if (adListCuration.getAccpt_filter_list() == null || adListCuration.getAccpt_filter_list().contains(Integer.valueOf(filterModel.getSelectedFilterId()))) {
                        arrayList14.add(obj8);
                    }
                }
                List<AdListCuration> listSortedWith2 = CollectionsKt.sortedWith(arrayList14, new Comparator() { // from class: com.tnkfactory.ad.TnkAdListModel$getUiModel$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((AdListCuration) t).getOrd_no()), Integer.valueOf(((AdListCuration) t2).getOrd_no()));
                    }
                });
                ArrayList arrayList15 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
                for (AdListCuration adListCuration2 : listSortedWith2) {
                    int crt_type = adListCuration2.getCrt_type();
                    if (crt_type == 8) {
                        if (adListCuration2.getApp_id_list() != null) {
                            List<Long> app_id_list = adListCuration2.getApp_id_list();
                            Intrinsics.checkNotNull(app_id_list);
                            if (app_id_list.isEmpty()) {
                                List<Long> app_id_list2 = adListCuration2.getApp_id_list();
                                Intrinsics.checkNotNull(app_id_list2);
                                ArrayList arrayList16 = new ArrayList();
                                Iterator<T> it3 = app_id_list2.iterator();
                                while (it3.hasNext()) {
                                    long jLongValue = ((Number) it3.next()).longValue();
                                    Iterator it4 = listSortedWith.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it4.next();
                                        if (((AdListVo) next2).getAppId() == jLongValue) {
                                            break;
                                        }
                                    }
                                    AdListVo adListVo2 = (AdListVo) next2;
                                    if (adListVo2 != null) {
                                        arrayList16.add(adListVo2);
                                    }
                                }
                                uiCurationItem2 = new AdListViewImpl.UiCurationItem(adListCuration2, arrayList16);
                            }
                        }
                        ArrayList arrayList17 = new ArrayList();
                        for (Object obj9 : listSortedWith) {
                            if (Intrinsics.areEqual(((AdListVo) obj9).getLike_yn(), "Y")) {
                                arrayList17.add(obj9);
                            }
                        }
                        uiCurationItem = new AdListViewImpl.UiCurationItem(adListCuration2, arrayList17);
                        uiCurationItem2 = uiCurationItem;
                    } else if (crt_type != 9) {
                        List<Long> app_id_list3 = adListCuration2.getApp_id_list();
                        if (app_id_list3 != null) {
                            arrayList4 = new ArrayList();
                            Iterator<T> it5 = app_id_list3.iterator();
                            while (it5.hasNext()) {
                                long jLongValue2 = ((Number) it5.next()).longValue();
                                Iterator it6 = listSortedWith.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it6.next();
                                    if (((AdListVo) next3).getAppId() == jLongValue2) {
                                        break;
                                    }
                                }
                                AdListVo adListVo3 = (AdListVo) next3;
                                if (adListVo3 != null) {
                                    arrayList4.add(adListVo3);
                                }
                            }
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        uiCurationItem2 = new AdListViewImpl.UiCurationItem(adListCuration2, arrayList4);
                    } else {
                        uiCurationItem = new AdListViewImpl.UiCurationItem(adListCuration2, new ArrayList());
                        uiCurationItem2 = uiCurationItem;
                    }
                    arrayList15.add(uiCurationItem2);
                }
                arrayList3 = arrayList15;
            } else {
                arrayList3 = new ArrayList();
            }
            ArrayList arrayList18 = new ArrayList();
            for (Object obj10 : arrayList3) {
                if (((AdListViewImpl.UiCurationItem) obj10).getCuration().getPos_type() == 0) {
                    arrayList18.add(obj10);
                }
            }
            ArrayList arrayList19 = new ArrayList();
            for (Object obj11 : arrayList3) {
                if (((AdListViewImpl.UiCurationItem) obj11).getCuration().getPos_type() == 1) {
                    arrayList19.add(obj11);
                }
            }
            return new ListUiModel(filterModel, arrayList2, map, arrayList18, CollectionsKt.sortedWith(arrayList19, new Comparator() { // from class: com.tnkfactory.ad.TnkAdListModel$getUiModel$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((AdListViewImpl.UiCurationItem) t2).getCuration().getLayoutInfo().getLayoutId()), Integer.valueOf(((AdListViewImpl.UiCurationItem) t).getCuration().getLayoutInfo().getLayoutId()));
                }
            }), listSortedWith, (RecommendList) this.c.getRecommendList().getValue(), "");
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void a(TnkAdListModel tnkAdListModel) {
        tnkAdListModel.c.fetchRecommendList();
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, int i2, int i3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        tnkAdListModel.u.postValue(Boolean.FALSE);
        tnkAdListModel.r = true;
        tnkAdListModel.f27o.addAll(arrayList);
        tnkAdListModel.k.addAll(tnkAdListModel.c.getCuriation());
        tnkAdListModel.j.changeFilter(i2, i3);
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        tnkAdListModel.a.getNavi().showDialog(tnkAdListModel.a.getActivity(), "서버 요청 시 오류가 발생하였습니다", new Function0() { // from class: com.tnkfactory.ad.TnkAdListModel$$ExternalSyntheticLambda5
            public final Object invoke() {
                return TnkAdListModel.b();
            }
        });
        tnkAdListModel.u.postValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final boolean a(ArrayList arrayList, TnkAdListModel tnkAdListModel, AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return arrayList.contains(Integer.valueOf(adListVo.getFilterId())) && AdListVoKt.isCorrectItem(adListVo, tnkAdListModel.f);
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkAdListModel tnkAdListModel, MediatorLiveData mediatorLiveData, TnkRwdFilter.FilterModel filterModel) {
        if (filterModel.getSelectedCategoryId() == 0) {
            return Unit.INSTANCE;
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkAdListModel), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new a(filterModel, tnkAdListModel, mediatorLiveData, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit a(EventListVo eventListVo, TnkAdListModel tnkAdListModel, EventListVo eventListVo2, boolean z, String str) {
        String string;
        String app_nm;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        if (eventListVo2 == null || (string = Long.valueOf(eventListVo2.getApp_id()).toString()) == null) {
            string = "";
        }
        map.put("item_id", string);
        if (eventListVo2 != null && (app_nm = eventListVo2.getApp_nm()) != null) {
            str2 = app_nm;
        }
        map.put("item_name", str2);
        map.put("item_location", "header_recommend");
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("tnk_ev_event_click", map);
        AdDetailEventWebView.Companion.newInstance(eventListVo.getClck_url(), String.valueOf(eventListVo.getApp_id()), eventListVo.getApp_nm()).show(tnkAdListModel.f.getSupportFragmentManager(), "AdDetailWebView");
        return unit;
    }
}
