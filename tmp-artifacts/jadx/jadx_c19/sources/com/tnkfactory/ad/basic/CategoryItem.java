package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.TextView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
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
public final class CategoryItem extends TnkViewHolder {
    public final CategorySet a;
    public final boolean b;
    public final Function1 c;
    public TextView tvName;

    public CategoryItem(@NotNull CategorySet categorySet, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(categorySet, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = categorySet;
        this.b = z;
        this.c = function1;
    }

    public static final void a(CategoryItem categoryItem, View view) {
        try {
            TnkAssert tnkAssert = TnkAssert.INSTANCE;
            HashMap<Integer, Integer> freeChargingStation1 = tnkAssert.getMOfferwallTabClick().getFreeChargingStation1();
            int catId = categoryItem.a.getCatId();
            Integer num = tnkAssert.getMOfferwallTabClick().getFreeChargingStation1().get(Integer.valueOf(categoryItem.a.getCatId()));
            freeChargingStation1.put(Integer.valueOf(catId), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
            HashMap<String, String> map = new HashMap<>();
            int catId2 = categoryItem.a.getCatId();
            StringBuilder sb = new StringBuilder();
            sb.append(catId2);
            map.put("item_id", sb.toString());
            map.put("item_name", categoryItem.a.getCatNm());
            Unit unit = Unit.INSTANCE;
            tnkAdAnalytics.logEvent("tnk_ev_category", map);
        } catch (Exception unused) {
        }
        categoryItem.c.invoke(Integer.valueOf(categoryItem.a.getCatId()));
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        TextView textView = (TextView) setcolorschemecolors.onNavigationEvent().findViewById(R.id.tv_menu_name);
        textView.setSelected(this.b);
        try {
            if (textView.isSelected()) {
                VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView, R.style.tnk_header_category_selected);
            } else {
                VectorConvertersKtExternalSyntheticLambda8.IAuthTabCallback(textView, R.style.tnk_header_category);
            }
        } catch (Exception unused) {
        }
        textView.setText(this.a.getCatNm());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.CategoryItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CategoryItem.a(this.f$0, view);
            }
        });
        setTvName(textView);
    }

    public final CategorySet getCategorySet() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_header_category_item;
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
