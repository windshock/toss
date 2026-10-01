package com.tnkfactory.ad.basic;

import android.content.res.Resources;
import android.view.View;
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
public final class TnkCurationPageControl extends Item<setColorSchemeColors> {
    public int a;
    public final int b;
    public final Function1 c;
    public int d;
    public int e;

    public TnkCurationPageControl(int i2, int i3, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.e = i2 / 6;
    }

    public static final void a(TnkCurationPageControl tnkCurationPageControl, TextView textView, View view) {
        int i2 = tnkCurationPageControl.e;
        if (i2 <= 0) {
            return;
        }
        int i3 = tnkCurationPageControl.d + 1;
        tnkCurationPageControl.d = i3;
        int i4 = i2 + 1;
        int i5 = i3 % i4;
        tnkCurationPageControl.d = i5;
        if (textView != null) {
            textView.setText("새로보기  " + (i5 + 1) + " / " + i4);
        }
        tnkCurationPageControl.c.invoke(0);
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewFindViewById = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.btn_reload);
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        View viewFindViewById2 = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.findViewById(R.id.tnk_tv_page_position);
        final TextView textView = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
        if (textView != null) {
            textView.setText("새로보기  " + (this.d + 1) + " / " + (this.e + 1));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCurationPageControl$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkCurationPageControl.a(this.f$0, textView, view);
                }
            });
        }
        Resources resources = setcolorschemecolors.onNavigationEvent().getContext().getResources();
        if (this.b == 0) {
            ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.setBackgroundColor(resources.getColor(R.color.tnk_color_background));
        } else {
            ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.setBackgroundColor(resources.getColor(R.color.tnk_color_background_secondary));
        }
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_curation_control_primary;
    }

    public final int getMaxCount() {
        return this.a;
    }

    public final int getMaxPageNum() {
        return this.e;
    }

    public final int getNowPageNum() {
        return this.d;
    }

    public final Function1<Integer, Unit> getOnClickView() {
        return this.c;
    }

    public final int getType() {
        return this.b;
    }

    public final void setMaxCount(int i2) {
        this.a = i2;
    }

    public final void setMaxPageNum(int i2) {
        this.e = i2;
    }

    public final void setNowPageNum(int i2) {
        this.d = i2;
    }
}
