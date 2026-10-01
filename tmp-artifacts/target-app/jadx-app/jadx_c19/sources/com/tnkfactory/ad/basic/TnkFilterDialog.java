package com.tnkfactory.ad.basic;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.TnkAdConfig;
import com.tnkfactory.ad.TnkContext;
import com.tnkfactory.ad.b.j0;
import com.tnkfactory.ad.b.k0;
import com.tnkfactory.ad.basic.TnkCpsSearchResultHeader;
import com.tnkfactory.ad.basic.TnkFilterDialog;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.rwd.data.view.AdListCuration;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.ad.style.DpUtil;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.tnkfactory.ad.style.TnkViewHolder;
import com.xwray.groupie.GroupieAdapter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.clearRegisters;
import o.getCodeNameBytes;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setColorSchemeColors;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkFilterDialog extends Dialog implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final Lazy a;
    public final TextFieldSizeKtExternalSyntheticLambda2 b;
    public final FragmentActivity c;
    public final TnkContext d;
    public final ArrayList e;
    public final GroupieAdapter f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public String f36i;
    public int j;
    public final GroupieAdapter k;
    public final GroupieAdapter l;
    public final TnkCpsSearchResultHeader m;
    public final TnkAdListEmptyItem n;

    public final class CpsFilterItem extends TnkViewHolder {
        public final Filter a;
        public boolean b;
        public final Function1 c;
        public TextView tvName;

        public CpsFilterItem(@NotNull TnkFilterDialog tnkFilterDialog, Filter filter, @NotNull boolean z, Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(filter, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.a = filter;
            this.b = z;
            this.c = function1;
        }

        public static final void a(CpsFilterItem cpsFilterItem, View view) {
            try {
                TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
                HashMap<String, String> map = new HashMap<>();
                int filterId = cpsFilterItem.a.getFilterId();
                StringBuilder sb = new StringBuilder();
                sb.append(filterId);
                map.put("item_id", sb.toString());
                map.put("item_name", cpsFilterItem.a.getFilterNm());
                Unit unit = Unit.INSTANCE;
                tnkAdAnalytics.logEvent("tnk_ev_filter", map);
            } catch (Exception unused) {
            }
            cpsFilterItem.c.invoke(Integer.valueOf(cpsFilterItem.a.getFilterId()));
        }

        @Override // com.xwray.groupie.Item
        public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
            Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
            TextView textView = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.tv_menu_name);
            textView.setSelected(this.b);
            try {
                if (textView.isSelected()) {
                    VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView, R.style.tnk_header_filter_selected);
                } else {
                    VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView, R.style.tnk_header_filter);
                }
            } catch (Exception unused) {
            }
            textView.setText(this.a.getFilterNm());
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$CpsFilterItem$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkFilterDialog.CpsFilterItem.a(this.f$0, view);
                }
            });
            setTvName(textView);
        }

        public final Filter getFilter() {
            return this.a;
        }

        @Override // com.xwray.groupie.Item
        public int getLayout() {
            return R.layout.com_tnk_offerwall_header_type_item;
        }

        public final Function1<Integer, Unit> getOnItemClick() {
            return this.c;
        }

        public final boolean getSelected() {
            return this.b;
        }

        public final TextView getTvName() {
            TextView textView = this.tvName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setSelected(boolean z) {
            this.b = z;
        }

        public final void setTvName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "");
            this.tvName = textView;
        }
    }

    public static final class FilterOptionAdapter extends RecyclerView.Adapter<ViewHodler> {
        public final String[] a;
        public int b;
        public final Function2 c;

        public final class ViewHodler extends RecyclerView.ViewHolder {
            public final TextView a;
            public final View b;
            public final ImageView c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHodler(@NotNull FilterOptionAdapter filterOptionAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.a = (TextView) view.findViewById(R.id.com_tnk_offerwall_cps_search_with_filter_recycler_view_item_title);
                this.b = view.findViewById(R.id.com_tnk_offerwall_cps_search_with_filter_recycler_view_item_divider);
                this.c = (ImageView) view.findViewById(R.id.com_tnk_offerwall_cps_search_with_filter_recycler_view_item_checked_icon);
            }

            public final ImageView getIv() {
                return this.c;
            }

            public final TextView getTv() {
                return this.a;
            }

            public final View getV() {
                return this.b;
            }
        }

        public /* synthetic */ FilterOptionAdapter(String[] strArr, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, (i3 & 2) != 0 ? -1 : i2, function2);
        }

        public static final void a(int i2, FilterOptionAdapter filterOptionAdapter, View view) {
            if (i2 != filterOptionAdapter.b) {
                filterOptionAdapter.b = i2;
                filterOptionAdapter.notifyDataSetChanged();
            }
            filterOptionAdapter.c.invoke(Integer.valueOf(i2), filterOptionAdapter.a[i2]);
        }

        public int getItemCount() {
            return this.a.length;
        }

        public FilterOptionAdapter(@NotNull String[] strArr, int i2, @NotNull Function2<? super Integer, ? super String, Unit> function2) {
            Intrinsics.checkNotNullParameter(strArr, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.a = strArr;
            this.b = i2;
            this.c = function2;
        }

        public void onBindViewHolder(@NotNull ViewHodler viewHodler, final int i2) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(viewHodler, "");
            TextView tv = viewHodler.getTv();
            if (tv != null) {
                tv.setText(this.a[i2]);
            }
            Context context = ((RecyclerView.ViewHolder) viewHodler).onNavigationEvent.getContext();
            try {
                ContextCompat.getColor(context, R.color.tnk_cps_spinner_selected_color);
            } catch (Exception unused) {
                TextView tv2 = viewHodler.getTv();
                if (tv2 != null) {
                    tv2.getCurrentTextColor();
                }
            }
            try {
                numValueOf = Integer.valueOf(ContextCompat.getColor(context, R.color.tnk_cps_spinner_unselected_color));
            } catch (Exception unused2) {
                TextView tv3 = viewHodler.getTv();
                numValueOf = tv3 != null ? Integer.valueOf(tv3.getCurrentTextColor()) : null;
            }
            if (i2 != this.b && numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                TextView tv4 = viewHodler.getTv();
                if (tv4 != null) {
                    tv4.setTextColor(iIntValue);
                }
            }
            View v = viewHodler.getV();
            if (v != null) {
                v.setVisibility(i2 == this.a.length + (-1) ? 8 : 0);
            }
            ImageView iv = viewHodler.getIv();
            if (iv != null) {
                iv.setVisibility(i2 == this.b ? 0 : 8);
            }
            ((RecyclerView.ViewHolder) viewHodler).onNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$FilterOptionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkFilterDialog.FilterOptionAdapter.a(i2, this, view);
                }
            });
        }

        public ViewHodler onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_tnk_offerwall_cps_search_with_filter_recycler_view_item, viewGroup, false);
            Intrinsics.checkNotNull(viewInflate);
            return new ViewHodler(this, viewInflate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TnkFilterDialog(@NotNull Context context, int i2) {
        super(context, R.style.tnk_full_screen_dialog);
        Intrinsics.checkNotNullParameter(context, "");
        Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda1
            public final Object invoke() {
                return TnkFilterDialog.a(this.f$0);
            }
        });
        this.a = lazyOnExtraCallbackWithResult;
        this.b = (TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue();
        this.e = new ArrayList();
        this.f = new GroupieAdapter();
        this.f36i = "";
        this.k = new GroupieAdapter();
        this.l = new GroupieAdapter();
        this.m = new TnkCpsSearchResultHeader(new f(this));
        this.n = new TnkAdListEmptyItem(DpUtil.INSTANCE.dpToPx(20.0f));
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        this.c = fragmentActivity;
        this.d = new TnkContext(fragmentActivity);
        this.g = i2;
        ((TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setSoftInputMode(16);
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 a(TnkFilterDialog tnkFilterDialog) {
        return new TextFieldSizeKtExternalSyntheticLambda2(tnkFilterDialog);
    }

    public static final void b(TnkFilterDialog tnkFilterDialog, View view) {
        tnkFilterDialog.getComTnkOffRvSearchResult().scrollToPosition(0);
    }

    public final FragmentActivity getActivity() {
        return this.c;
    }

    public final GroupieAdapter getAdapter() {
        return this.k;
    }

    public final ArrayList<CpsFilterItem> getArrCpsFilterItem() {
        return this.e;
    }

    public final TnkAdListEmptyItem getBottomMargin() {
        return this.n;
    }

    public final View getComTnkOffCpsSearchClose() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_header_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        return viewFindViewById;
    }

    public final RecyclerView getComTnkOffRvSearchResult() {
        RecyclerView recyclerViewFindViewById = findViewById(R.id.com_tnk_off_rv_search_result);
        Intrinsics.checkNotNullExpressionValue(recyclerViewFindViewById, "");
        return recyclerViewFindViewById;
    }

    public final GroupieAdapter getFilterAdapter() {
        return this.f;
    }

    public final int getFilterId() {
        return this.g;
    }

    public final GroupieAdapter getKeywordAdapter() {
        return this.l;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.b;
    }

    public final String getMKeyword() {
        return this.f36i;
    }

    public final TnkContext getMTnkContext() {
        return this.d;
    }

    public final TnkCpsSearchResultHeader getResultHeader() {
        return this.m;
    }

    public final RecyclerView getRvFilter() {
        RecyclerView recyclerViewFindViewById = findViewById(R.id.com_tnk_off_rv_filter);
        if (recyclerViewFindViewById instanceof RecyclerView) {
            return recyclerViewFindViewById;
        }
        return null;
    }

    public final int getSelectedSortType() {
        return this.h;
    }

    public final Spinner getSpSort() {
        View viewFindViewById = findViewById(R.id.com_tnk_rwd_cps_sort);
        if (viewFindViewById instanceof Spinner) {
            return (Spinner) viewFindViewById;
        }
        return null;
    }

    public final TextView getTvFilter() {
        View viewFindViewById = findViewById(R.id.com_tnk_off_cps_search_filter);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    public final void initFilter() {
        Object next;
        RecyclerView rvFilter = getRvFilter();
        if (rvFilter != null) {
            rvFilter.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        RecyclerView rvFilter2 = getRvFilter();
        if (rvFilter2 != null) {
            rvFilter2.setAdapter(this.f);
        }
        Iterator<T> it = TnkCore.INSTANCE.getOffRepository().getRwdFilter().getCategorySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (!TextUtils.isEmpty(((CategorySet) next).getCatUrl())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CategorySet categorySet = (CategorySet) next;
        if (categorySet == null) {
            return;
        }
        List<Filter> filterList = categorySet.getFilterList();
        if (filterList == null) {
            filterList = CollectionsKt.emptyList();
        }
        for (Filter filter : filterList) {
            this.e.add(new CpsFilterItem(this, filter, filter.getFilterId() == this.g, new Function1() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return TnkFilterDialog.a(this.f$0, ((Integer) obj).intValue());
                }
            }));
        }
        this.f.update(this.e);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.com_tnk_offerwall_filter_dialog);
        getComTnkOffRvSearchResult().setAdapter(this.k);
        RecyclerView comTnkOffRvSearchResult = getComTnkOffRvSearchResult();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 12, 1, false);
        this.k.setSpanCount(12);
        gridLayoutManager.IAuthTabCallback(this.k.getSpanSizeLookup());
        comTnkOffRvSearchResult.setLayoutManager(gridLayoutManager);
        getComTnkOffCpsSearchClose().setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkFilterDialog.a(this.f$0, view);
            }
        });
        TnkCore.INSTANCE.getOffRepository().getDataChanged().observe(this, new j0(new Function1() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return TnkFilterDialog.a(this.f$0, (Boolean) obj);
            }
        }));
        View viewFindViewById = findViewById(R.id.com_tnk_off_ad_list_top_button);
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkFilterDialog.b(this.f$0, view);
                }
            });
        }
        final String[] strArr = {"추천순", "리워드순", "높은가격순", "낮은가격순"};
        if (TnkAdConfig.INSTANCE.getUseCpsSortDialog()) {
            TextView tvFilter = getTvFilter();
            if (tvFilter != null) {
                CharSequence charSequence = (String) ArraysKt.getOrNull(strArr, this.j);
                if (charSequence == null) {
                    charSequence = (CharSequence) ArraysKt.first(strArr);
                }
                tvFilter.setText(charSequence);
            }
            TextView tvFilter2 = getTvFilter();
            if (tvFilter2 != null) {
                tvFilter2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TnkFilterDialog.a(this.f$0, strArr, view);
                    }
                });
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), R.layout.com_tnk_offerwall_cps_search_with_filter_spinner_item, strArr);
        Spinner spSort = getSpSort();
        if (spSort != null) {
            spSort.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        Spinner spSort2 = getSpSort();
        if (spSort2 != null) {
            spSort2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog.onCreate.6
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) throws IllegalAccessException, InstantiationException {
                    TextView tvFilter3 = TnkFilterDialog.this.getTvFilter();
                    if (tvFilter3 != null) {
                        tvFilter3.setText(strArr[i2]);
                    }
                    TnkFilterDialog.this.setSelectedSortType(i2);
                    TnkFilterDialog.this.a();
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
        }
        initFilter();
    }

    public final void onFilterSelected(@NotNull TnkCpsSearchResultHeader.FilterOption filterOption) {
        Intrinsics.checkNotNullParameter(filterOption, "");
        TextView tvFilter = getTvFilter();
        if (tvFilter != null) {
            tvFilter.setText(filterOption.getFilterName());
        }
        this.h = filterOption.getFilterType();
        a();
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.a.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_START);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        ((TextFieldSizeKtExternalSyntheticLambda2) this.a.getValue()).IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_STOP);
    }

    public final void saveCpsSearchResultKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (TextUtils.isEmpty(this.f36i) || Intrinsics.areEqual(str, "147359123258")) {
            return;
        }
        Settings settings = Settings.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ArrayList<String> arrayListLoadCpsSearchResultKeyword = settings.loadCpsSearchResultKeyword(context);
        List arrayList = new ArrayList();
        for (Object obj : arrayListLoadCpsSearchResultKeyword) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 9) {
            arrayList = arrayList.subList(0, 9);
        }
        List<String> mutableList = CollectionsKt.toMutableList(arrayList);
        mutableList.add(0, str);
        Settings settings2 = Settings.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        settings2.saveCpsSearchResultKeyword(context2, mutableList);
    }

    public final void setFilterId(int i2) {
        this.g = i2;
    }

    public final void setMKeyword(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f36i = str;
    }

    public final void setSelectedSortType(int i2) {
        this.h = i2;
    }

    public static final void a(TnkFilterDialog tnkFilterDialog, View view) {
        tnkFilterDialog.dismiss();
    }

    public static final Unit a(TnkFilterDialog tnkFilterDialog, Boolean bool) {
        if (bool.booleanValue()) {
            tnkFilterDialog.k.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final void a(final TnkFilterDialog tnkFilterDialog, String[] strArr, View view) {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(tnkFilterDialog.getContext());
        View viewInflate = tnkFilterDialog.getLayoutInflater().inflate(R.layout.com_tnk_offerwall_cps_search_with_filter_bottomsheet_dialog, (ViewGroup) null);
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(R.id.recyclerView);
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(tnkFilterDialog.getContext()));
        recyclerViewFindViewById.setAdapter(new FilterOptionAdapter(strArr, tnkFilterDialog.j, new Function2() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return TnkFilterDialog.a(this.f$0, bottomSheetDialog, ((Integer) obj).intValue(), (String) obj2);
            }
        }));
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
    }

    public static final Unit a(TnkFilterDialog tnkFilterDialog, BottomSheetDialog bottomSheetDialog, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        tnkFilterDialog.j = i2;
        TextView tvFilter = tnkFilterDialog.getTvFilter();
        Intrinsics.checkNotNull(tvFilter);
        tvFilter.setText(str);
        TnkCpsSearchResultHeader.FilterOption filterOption = new TnkCpsSearchResultHeader.FilterOption(tnkFilterDialog.m);
        filterOption.setFilterType(i2);
        filterOption.setFilterName(str);
        tnkFilterDialog.onFilterSelected(filterOption);
        bottomSheetDialog.dismiss();
        return Unit.INSTANCE;
    }

    public final void a() throws IllegalAccessException, InstantiationException {
        ArrayList arrayList;
        List<Long> arrayList2;
        Object obj = null;
        if (!TextUtils.isEmpty(this.f36i)) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new k0(this, null), 2, (Object) null);
        }
        this.k.clear();
        List mutableList = CollectionsKt.toMutableList(TnkCore.INSTANCE.getOffRepository().getAdList());
        List<AdListVo> arrayList3 = new ArrayList();
        Iterator it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AdListVo adListVo = (AdListVo) next;
            if (this.g == 0) {
                if (adListVo.getAdType() == 4) {
                    arrayList3.add(next);
                }
            } else if (adListVo.getFilterId() == this.g) {
                arrayList3.add(next);
            }
        }
        if (!TextUtils.isEmpty(this.f36i)) {
            try {
                arrayList = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((AdListVo) obj2).getAppId() == Long.parseLong(this.f36i)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        AdListVo adListVo2 = (AdListVo) obj3;
                        if (StringsKt.contains$default(adListVo2.getTitle(), this.f36i, false, 2, (Object) null) || StringsKt.contains$default(adListVo2.getCorp_desc(), this.f36i, false, 2, (Object) null)) {
                            arrayList.add(obj3);
                        }
                    }
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                for (Object obj4 : arrayList3) {
                    AdListVo adListVo3 = (AdListVo) obj4;
                    if (StringsKt.contains$default(adListVo3.getTitle(), this.f36i, false, 2, (Object) null) || StringsKt.contains$default(adListVo3.getCorp_desc(), this.f36i, false, 2, (Object) null)) {
                        arrayList.add(obj4);
                    }
                }
            }
            arrayList3 = arrayList;
        }
        int i2 = this.h;
        if (i2 == 1) {
            arrayList3 = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$searchItem$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t2).getPointAmount()), Long.valueOf(((AdListVo) t).getPointAmount()));
                }
            });
        } else if (i2 == 2) {
            arrayList3 = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$searchItem$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t2).getPrd_price()), Long.valueOf(((AdListVo) t).getPrd_price()));
                }
            });
        } else if (i2 == 3) {
            arrayList3 = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.tnkfactory.ad.basic.TnkFilterDialog$searchItem$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return getCodeNameBytes.IAuthTabCallback(Long.valueOf(((AdListVo) t).getPrd_price()), Long.valueOf(((AdListVo) t2).getPrd_price()));
                }
            });
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (!TextUtils.isEmpty(this.f36i)) {
                this.m.setKeyword(this.f36i, arrayList3.size());
                this.k.add(this.m);
            }
        } else {
            this.k.add(new TnkCpsSearchNotExist(this.f36i));
            Iterator<T> it2 = TnkCore.INSTANCE.getOffRepository().getCuriation().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((AdListCuration) next2).getCrt_type() == 4) {
                    obj = next2;
                    break;
                }
            }
            AdListCuration adListCuration = (AdListCuration) obj;
            if (adListCuration == null || (arrayList2 = adListCuration.getApp_id_list()) == null) {
                arrayList2 = new ArrayList<>();
            }
            ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : adList) {
                if (arrayList2.contains(Long.valueOf(((AdListVo) obj5).getAppId()))) {
                    arrayList4.add(obj5);
                }
            }
            arrayList3 = arrayList4.subList(0, arrayList4.size() <= 3 ? arrayList4.size() : 4);
        }
        saveCpsSearchResultKeyword(this.f36i);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (AdListVo adListVo4 : arrayList3) {
            int ad_list_cps_normal = TnkLayoutType.INSTANCE.getAD_LIST_CPS_NORMAL();
            Intrinsics.checkNotNullParameter(adListVo4, "");
            Object objNewInstance = clearRegisters.onNavigationEvent(TnkAdConfig.INSTANCE.getLayoutInfo(ad_list_cps_normal).getViewClass()).newInstance();
            ITnkOffAdItem iTnkOffAdItem = (ITnkOffAdItem) objNewInstance;
            iTnkOffAdItem.onItemInit(this.d, adListVo4);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "");
            arrayList5.add(iTnkOffAdItem);
        }
        int size = arrayList5.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ITnkOffAdItem) arrayList5.get(i3)).setPosition(i3);
        }
        this.k.addAll(arrayList5);
        this.k.add(this.n);
    }

    public static final Unit a(TnkFilterDialog tnkFilterDialog, int i2) throws IllegalAccessException, InstantiationException {
        tnkFilterDialog.g = i2;
        tnkFilterDialog.a();
        for (CpsFilterItem cpsFilterItem : tnkFilterDialog.e) {
            cpsFilterItem.setSelected(cpsFilterItem.getFilter().getFilterId() == i2);
        }
        tnkFilterDialog.f.onDataSetInvalidated();
        return Unit.INSTANCE;
    }
}
