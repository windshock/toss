package com.tnkfactory.ad.basic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.rwd.data.MultiCampaignJoinListItem;
import com.tnkfactory.ad.rwd.data.view.CategorySet;
import com.tnkfactory.ad.rwd.data.view.Filter;
import com.tnkfactory.ad.style.ITnkRwdToolbar;
import com.tnkfactory.ad.style.TnkViewHolder;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListToolbar implements ITnkRwdToolbar, ITnkHeader {
    public final /* synthetic */ ITnkHeaderImpl a = new ITnkHeaderImpl();
    public View b;

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getIvMy() {
        return this.a.getIvMy();
    }

    public final View getRoot() {
        return this.b;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public RecyclerView getRvCategory() {
        return this.a.getRvCategory();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public RecyclerView getRvFilter() {
        return this.a.getRvFilter();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getTvClose() {
        return this.a.getTvClose();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvEarnPoint() {
        return this.a.getTvEarnPoint();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvEarnPointUnit() {
        return this.a.getTvEarnPointUnit();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TextView getTvTitle() {
        return this.a.getTvTitle();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public View getViewRoot() {
        return this.a.getViewRoot();
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TnkViewHolder initCategory(@NotNull CategorySet categorySet, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(categorySet, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return this.a.initCategory(categorySet, z, function1);
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public TnkViewHolder initFilter(@NotNull Filter filter, boolean z, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(filter, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return this.a.initFilter(filter, z, function1);
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public void initHeaderMenu(@NotNull View view, @NotNull TnkAdListModel tnkAdListModel) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        this.a.initHeaderMenu(view, tnkAdListModel);
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdToolbar
    public void onChangeFilter(@NotNull TnkRwdFilter tnkRwdFilter) {
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
        updateFilter(tnkRwdFilter);
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdToolbar
    public View onCreateView(@NotNull Activity activity, @NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup, @NotNull TnkAdListModel tnkAdListModel) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        View viewInflate = layoutInflater.inflate(R.layout.com_tnk_offerwall_header, viewGroup, true);
        this.b = viewInflate;
        Intrinsics.checkNotNull(viewInflate);
        initHeaderMenu(viewInflate, tnkAdListModel);
        return this.b;
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdToolbar
    public void onReceiveMessage() {
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public void setJoinItem(@Nullable ArrayList<MultiCampaignJoinListItem> arrayList, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a.setJoinItem(arrayList, str);
    }

    public final void setRoot(@Nullable View view) {
        this.b = view;
    }

    @Override // com.tnkfactory.ad.basic.ITnkHeader
    public void updateFilter(@NotNull TnkRwdFilter tnkRwdFilter) {
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
        this.a.updateFilter(tnkRwdFilter);
    }
}
