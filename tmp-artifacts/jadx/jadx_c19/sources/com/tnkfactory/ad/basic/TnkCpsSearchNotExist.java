package com.tnkfactory.ad.basic;

import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkCpsSearchNotExist extends Item<setColorSchemeColors> {
    public final String a;

    public TnkCpsSearchNotExist(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = str;
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewFindViewById = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.com_tnk_search_not_exist_tv_title);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView != null) {
            textView.setText(Html.fromHtml("<font color='#505050'>" + this.a + "</font><font color='#808080'>에 대한 검색결과는 없지만</font>", 0));
        }
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_search_not_exist_header;
    }

    public final String getTitle() {
        return this.a;
    }
}
