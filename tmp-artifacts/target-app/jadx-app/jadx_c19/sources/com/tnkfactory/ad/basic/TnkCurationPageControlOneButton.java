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
public final class TnkCurationPageControlOneButton extends Item<setColorSchemeColors> {
    public int a;
    public int b;
    public final int c;
    public final Function1 d;

    public TnkCurationPageControlOneButton(int i2, int i3, int i4, @NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = function1;
    }

    public static final void a(TnkCurationPageControlOneButton tnkCurationPageControlOneButton, TextView textView, View view) {
        tnkCurationPageControlOneButton.d.invoke(0);
        if (textView != null) {
            textView.setText("새로보기  " + tnkCurationPageControlOneButton.a + " / " + tnkCurationPageControlOneButton.b);
        }
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
            textView.setText("새로보기  " + this.a + " / " + this.b);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkCurationPageControlOneButton$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkCurationPageControlOneButton.a(this.f$0, textView, view);
                }
            });
        }
        Resources resources = setcolorschemecolors.onNavigationEvent().getContext().getResources();
        if (this.c == 0) {
            ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.setBackgroundColor(resources.getColor(R.color.tnk_color_background));
        } else {
            ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.setBackgroundColor(resources.getColor(R.color.tnk_color_background_secondary));
        }
    }

    public final int getCurrent() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_curation_control_primary;
    }

    public final int getMax() {
        return this.b;
    }

    public final Function1<Integer, Unit> getOnClickView() {
        return this.d;
    }

    public final int getType() {
        return this.c;
    }

    public final void setCurrent(int i2) {
        this.a = i2;
    }

    public final void setMax(int i2) {
        this.b = i2;
    }
}
