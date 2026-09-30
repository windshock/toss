package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.TextView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.ad.style.TnkViewHolder;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.VectorConvertersKtExternalSyntheticLambda8;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FilterItem extends TnkViewHolder {
    public final Filter a;
    public final boolean b;
    public final Function1 c;
    public TextView tvName;

    public FilterItem(@NotNull Filter filter, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(filter, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = filter;
        this.b = z;
        this.c = function1;
    }

    public static final void a(FilterItem filterItem, View view) {
        try {
            TnkAssert tnkAssert = TnkAssert.INSTANCE;
            HashMap<Integer, Integer> freeChargingStation2 = tnkAssert.getMOfferwallTabClick().getFreeChargingStation2();
            int filterId = filterItem.a.getFilterId();
            Integer num = tnkAssert.getMOfferwallTabClick().getFreeChargingStation2().get(Integer.valueOf(filterItem.a.getFilterId()));
            freeChargingStation2.put(Integer.valueOf(filterId), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            tnkAssert.getMOfferwallTabClick().setRefererTab(filterItem.a.getFilterId());
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            int filterId2 = filterItem.a.getFilterId();
            StringBuilder sb = new StringBuilder();
            sb.append(filterId2);
            map.put("item_id", sb.toString());
            map.put("item_name", filterItem.a.getFilterNm());
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("tnk_ev_filter", map);
        } catch (Exception unused) {
        }
        filterItem.c.invoke(Integer.valueOf(filterItem.a.getFilterId()));
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.FilterItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterItem.a(this.f$0, view);
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

    public final void setTvName(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.tvName = textView;
    }
}
