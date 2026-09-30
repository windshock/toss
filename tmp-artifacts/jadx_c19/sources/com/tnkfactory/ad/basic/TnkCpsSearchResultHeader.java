package com.tnkfactory.ad.basic;

import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCpsSearchResultHeader extends Item<setColorSchemeColors> {
    public final Function1 a;
    public Spanned b;

    public final class FilterOption {
        public int a;
        public String b = "";

        public FilterOption(TnkCpsSearchResultHeader tnkCpsSearchResultHeader) {
        }

        public final String getFilterName() {
            return this.b;
        }

        public final int getFilterType() {
            return this.a;
        }

        public final void setFilterName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
        }

        public final void setFilterType(int i2) {
            this.a = i2;
        }
    }

    public TnkCpsSearchResultHeader(@NotNull Function1<? super FilterOption, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = function1;
        this.b = SpannedString.valueOf("");
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewFindViewById = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_off_cps_search_result_header_keyword);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView != null) {
            textView.setText(this.b);
        }
        View viewFindViewById2 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_off_cps_search_filter);
        final TextView textView2 = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
        View viewFindViewById3 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_rwd_cps_sort);
        Spinner spinner = viewFindViewById3 instanceof Spinner ? (Spinner) viewFindViewById3 : null;
        if ((spinner != null ? spinner.getAdapter() : null) == null) {
            final String[] strArr = {"추천순", "리워드순", "높은가격순", "낮은가격순"};
            ArrayAdapter arrayAdapter = new ArrayAdapter(setcolorschemecolors.onNavigationEvent().getContext(), R.layout.com_tnk_offerwall_cps_search_with_filter_spinner_item, strArr);
            if (spinner != null) {
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            }
            if (spinner != null) {
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.tnkfactory.ad.basic.TnkCpsSearchResultHeader.bind.1
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i3, long j) {
                        Function1<FilterOption, Unit> onFilterSelected = TnkCpsSearchResultHeader.this.getOnFilterSelected();
                        FilterOption filterOption = new FilterOption(TnkCpsSearchResultHeader.this);
                        TextView textView3 = textView2;
                        String[] strArr2 = strArr;
                        filterOption.setFilterType(i3);
                        if (textView3 != null) {
                            textView3.setText(strArr2[i3]);
                        }
                        onFilterSelected.invoke(filterOption);
                    }

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
            }
        }
    }

    public final Spanned getKeyword() {
        return this.b;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_cps_search_result_header2;
    }

    public final Function1<FilterOption, Unit> getOnFilterSelected() {
        return this.a;
    }

    public final void setKeyword(@NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(spanned, "");
        this.b = spanned;
    }

    public final void setKeyword(@NotNull String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b = Html.fromHtml("<b><font color='#505050'>" + str + "</font></b><font color='#808080'>에 대한 검색 결과 </font><b><font color='#505050'>" + i2 + "</font></b><font color='#505050'>건</font>", 0);
    }
}
