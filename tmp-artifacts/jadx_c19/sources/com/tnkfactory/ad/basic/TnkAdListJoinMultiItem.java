package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListJoinMultiItem extends TnkAdListBasicItem {
    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        Intrinsics.checkNotNull(view);
        View progressState = getProgressState(view);
        int i3 = 8;
        if (progressState != null) {
            progressState.setVisibility(getAdItem().getPay_cnt() == 0 ? 8 : 0);
        }
        View exclamation = getExclamation(view);
        if (exclamation != null) {
            if (getAdItem().getInst_dt() == 0 && getAdItem().getPay_cnt() == 0) {
                i3 = 0;
            }
            exclamation.setVisibility(i3);
        }
        TextView campaingCount = getCampaingCount(view);
        if (campaingCount != null) {
            campaingCount.setText(String.valueOf(getAdItem().getCmpn_cnt()));
        }
        TextView payCount = getPayCount(view);
        if (payCount != null) {
            payCount.setText(String.valueOf(getAdItem().getPay_cnt()));
        }
        ProgressBar progress = getProgress(view);
        if (progress != null) {
            progress.setMax(100);
        }
        ProgressBar progress2 = getProgress(view);
        if (progress2 != null) {
            progress2.setProgress((int) ((getAdItem().getPay_cnt() / getAdItem().getCmpn_cnt()) * 100.0f));
        }
    }

    public final TextView getCampaingCount(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_size);
    }

    public final View getExclamation(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.findViewById(R.id.com_tnk_iv_exclamation);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_join_multi_item;
    }

    public final TextView getPayCount(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (TextView) view.findViewById(R.id.com_tnk_off_multi_join_item_complete_count);
    }

    public final ProgressBar getProgress(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return (ProgressBar) view.findViewById(R.id.com_tnk_progress_circular);
    }

    public final View getProgressState(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.findViewById(R.id.com_tnk_off_multi_progress_state_layout);
    }
}
