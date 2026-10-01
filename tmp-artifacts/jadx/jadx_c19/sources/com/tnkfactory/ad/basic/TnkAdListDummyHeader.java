package com.tnkfactory.ad.basic;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
import com.tnkfactory.ad.style.ITnkRwdHeader;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListDummyHeader extends ITnkRwdHeader {
    public View a;
    public TnkAdListModel adListModel;

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNull(view, "");
        this.a = (ViewGroup) view;
    }

    public final TnkAdListModel getAdListModel() {
        TnkAdListModel tnkAdListModel = this.adListModel;
        if (tnkAdListModel != null) {
            return tnkAdListModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_header_dummy;
    }

    public final View getRoot() {
        return this.a;
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdHeader
    public void onChangeFilter(@NotNull TnkRwdFilter tnkRwdFilter) {
        Intrinsics.checkNotNullParameter(tnkRwdFilter, "");
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdHeader
    public void onCreateViewHolder(@NotNull TnkAdListModel tnkAdListModel) {
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        setAdListModel(tnkAdListModel);
    }

    @Override // com.tnkfactory.ad.style.ITnkRwdHeader
    public void onReceiveMessage() {
    }

    public final void setAdListModel(@NotNull TnkAdListModel tnkAdListModel) {
        Intrinsics.checkNotNullParameter(tnkAdListModel, "");
        this.adListModel = tnkAdListModel;
    }

    public final void setDummyHeight(int i2) {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        View view = this.a;
        if (view == null || (viewFindViewById = view.findViewById(R.id.ll_com_tnk_offerwall_header_dummy_root)) == null || (layoutParams = viewFindViewById.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = i2;
    }

    public final void setRoot(@Nullable View view) {
        this.a = view;
    }
}
