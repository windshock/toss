package com.tnkfactory.ad.basic;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListCpsReward extends TnkAdListCpsBasic {
    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        TextView textView = (TextView) ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_off_list_cps_reward_number);
        if (textView != null) {
            int mPosition = getMPosition();
            StringBuilder sb = new StringBuilder();
            sb.append(mPosition + 1);
            textView.setText(sb.toString());
        }
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_reward;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }
}
