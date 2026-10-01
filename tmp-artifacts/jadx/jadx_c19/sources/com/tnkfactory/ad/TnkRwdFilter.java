package com.tnkfactory.ad;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkRwdFilter {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public FilterModel c = new FilterModel(new CategorySet(0, 0, "", null, new ArrayList(), ""), new Filter("", 0, null), 0, 0, false);
    public final MutableLiveData d;
    public final MutableLiveData e;

    public static final class FilterModel {
        public CategorySet a;
        public Filter b;
        public int c;
        public int d;
        public boolean e;

        public FilterModel(@NotNull CategorySet categorySet, @Nullable Filter filter, int i2, int i3, boolean z) {
            Intrinsics.checkNotNullParameter(categorySet, "");
            this.a = categorySet;
            this.b = filter;
            this.c = i2;
            this.d = i3;
            this.e = z;
        }

        public final CategorySet getSelectedCategory() {
            return this.a;
        }

        public final int getSelectedCategoryId() {
            return this.c;
        }

        public final Filter getSelectedFilter() {
            return this.b;
        }

        public final int getSelectedFilterId() {
            return this.d;
        }

        public final boolean isCps() {
            return this.e;
        }

        public final void setCps(boolean z) {
            this.e = z;
        }

        public final void setSelectedCategory(@NotNull CategorySet categorySet) {
            Intrinsics.checkNotNullParameter(categorySet, "");
            this.a = categorySet;
        }

        public final void setSelectedCategoryId(int i2) {
            this.c = i2;
        }

        public final void setSelectedFilter(@Nullable Filter filter) {
            this.b = filter;
        }

        public final void setSelectedFilterId(int i2) {
            this.d = i2;
        }
    }

    public TnkRwdFilter() {
        MutableLiveData mutableLiveData = new MutableLiveData(this.c);
        this.d = mutableLiveData;
        this.e = mutableLiveData;
    }

    public final void changeCategory(int i2) {
        Object next;
        try {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CategorySet) next).getCatId() == i2) {
                        break;
                    }
                }
            }
            CategorySet categorySet = (CategorySet) next;
            if (categorySet == null && (categorySet = (CategorySet) CollectionsKt.firstOrNull(this.a)) == null) {
                return;
            }
            this.c.setSelectedCategory(categorySet);
            FilterModel filterModel = this.c;
            List<Filter> filterList = categorySet.getFilterList();
            filterModel.setSelectedFilter(filterList != null ? (Filter) CollectionsKt.firstOrNull(filterList) : null);
            this.c.setSelectedCategoryId(i2);
            FilterModel filterModel2 = this.c;
            Filter selectedFilter = filterModel2.getSelectedFilter();
            filterModel2.setSelectedFilterId(selectedFilter != null ? selectedFilter.getFilterId() : 0);
            this.c.setCps(!TextUtils.isEmpty(categorySet.getCatUrl()));
            this.d.postValue(this.c);
        } catch (Exception e) {
            Logger.e("changeCategory(" + i2 + ") failed : " + e);
        }
    }

    public final void changeFilter(int i2) {
        Object next;
        List<Filter> filterList = this.c.getSelectedCategory().getFilterList();
        if (filterList != null && !filterList.isEmpty()) {
            Iterator<T> it = filterList.iterator();
            while (it.hasNext()) {
                if (((Filter) it.next()).getFilterId() == i2) {
                    changeFilter(this.c.getSelectedCategoryId(), i2);
                    return;
                }
            }
        }
        Iterator it2 = this.a.iterator();
        loop1: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            List<Filter> filterList2 = ((CategorySet) next).getFilterList();
            if (filterList2 != null && !filterList2.isEmpty()) {
                Iterator<T> it3 = filterList2.iterator();
                while (it3.hasNext()) {
                    if (((Filter) it3.next()).getFilterId() == i2) {
                        break loop1;
                    }
                }
            }
        }
        CategorySet categorySet = (CategorySet) next;
        if (categorySet != null) {
            changeFilter(categorySet.getCatId(), i2);
        } else {
            selectFirst();
        }
    }

    public final ArrayList<Integer> getArrFilterIds() {
        List<Filter> filterList = this.c.getSelectedCategory().getFilterList();
        if (filterList == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Filter filter = (Filter) CollectionsKt.firstOrNull(filterList);
        Integer numValueOf = filter != null ? Integer.valueOf(filter.getFilterId()) : null;
        if (numValueOf == null || this.c.getSelectedFilterId() != numValueOf.intValue()) {
            arrayList.add(Integer.valueOf(this.c.getSelectedFilterId()));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterList, 10));
        Iterator<T> it = filterList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Filter) it.next()).getFilterId()));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ArrayList<CategorySet> getCategorySet() {
        return this.a;
    }

    public final HashMap<Integer, Filter> getFilter() {
        return this.b;
    }

    public final LiveData<FilterModel> getFilterUiModel() {
        return this.e;
    }

    public final void selectFirst() {
        CategorySet categorySet = (CategorySet) CollectionsKt.firstOrNull(this.a);
        if (categorySet != null) {
            changeCategory(categorySet.getCatId());
        }
    }

    public final void setFilterData(@NotNull List<CategorySet> list) {
        List<Filter> filterList;
        Intrinsics.checkNotNullParameter(list, "");
        this.a.clear();
        this.a.addAll(list);
        this.b.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Filter> filterList2 = ((CategorySet) it.next()).getFilterList();
            if (filterList2 != null) {
                for (Filter filter : filterList2) {
                    this.b.put(Integer.valueOf(filter.getFilterId()), filter);
                }
            }
        }
        CategorySet categorySet = (CategorySet) CollectionsKt.firstOrNull(list);
        Filter filter2 = (categorySet == null || (filterList = categorySet.getFilterList()) == null) ? null : (Filter) CollectionsKt.firstOrNull(filterList);
        FilterModel filterModel = new FilterModel(categorySet == null ? new CategorySet(0, 0, "", null, new ArrayList(), "") : categorySet, filter2 == null ? new Filter("", 0, null) : filter2, categorySet != null ? categorySet.getCatId() : 0, filter2 != null ? filter2.getFilterId() : 0, !TextUtils.isEmpty(categorySet != null ? categorySet.getCatUrl() : null));
        if (filterModel.getSelectedCategoryId() == this.c.getSelectedCategoryId() && filterModel.getSelectedFilterId() == this.c.getSelectedFilterId() && filterModel.isCps() == this.c.isCps()) {
            return;
        }
        this.c = filterModel;
        this.d.postValue(filterModel);
    }

    public final void changeFilter(int i2, int i3) {
        Object next;
        try {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((CategorySet) next).getCatId() == i2) {
                        break;
                    }
                }
            }
            CategorySet categorySet = (CategorySet) next;
            if (categorySet == null && (categorySet = (CategorySet) CollectionsKt.firstOrNull(this.a)) == null) {
                return;
            }
            CategorySet categorySet2 = categorySet;
            Filter filter = (Filter) this.b.get(Integer.valueOf(i3));
            if (filter == null) {
                List<Filter> filterList = categorySet2.getFilterList();
                filter = filterList != null ? (Filter) CollectionsKt.firstOrNull(filterList) : null;
            }
            FilterModel filterModel = new FilterModel(categorySet2, filter == null ? new Filter("", 0, null) : filter, categorySet2.getCatId(), filter != null ? filter.getFilterId() : 0, !TextUtils.isEmpty(categorySet2.getCatUrl()));
            if (filterModel.getSelectedCategoryId() == this.c.getSelectedCategoryId() && filterModel.getSelectedFilterId() == this.c.getSelectedFilterId() && filterModel.isCps() == this.c.isCps()) {
                return;
            }
            this.c = filterModel;
            this.d.postValue(filterModel);
        } catch (Exception unused) {
            selectFirst();
        }
    }
}
