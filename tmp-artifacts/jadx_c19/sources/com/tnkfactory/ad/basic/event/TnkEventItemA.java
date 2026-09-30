package com.tnkfactory.ad.basic.event;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkAdAnalytics;
import com.tnkfactory.ad.off.data.EventListVo;
import com.xwray.groupie.Item;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkEventItemA extends Item<setColorSchemeColors> {
    public final EventListVo a;
    public final Function1 b;

    public TnkEventItemA(@NotNull EventListVo eventListVo, @NotNull Function1<? super EventListVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(eventListVo, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.a = eventListVo;
        this.b = function1;
    }

    public static final void a(TnkEventItemA tnkEventItemA, TextView textView, View view) {
        if (tnkEventItemA.a.getJoin_cnt() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        TnkAdAnalytics.INSTANCE.logEvent("tnk_ev_recommend_evnet", access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("item_id", String.valueOf(tnkEventItemA.a.getApp_id())), getWrite.IAuthTabCallback("item_name", tnkEventItemA.a.getApp_nm())}));
        tnkEventItemA.b.invoke(tnkEventItemA.a);
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
        final TextView textView = (TextView) viewOnNavigationEvent.findViewById(R.id.tv_ad_status_icon);
        Glide.IAuthTabCallback(((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent.getContext()).onExtraCallbackWithResult(this.a.getIcon_url()).onExtraCallback((ImageView) viewOnNavigationEvent.findViewById(R.id.v_ad_item_icon));
        ((TextView) viewOnNavigationEvent.findViewById(R.id.tv_ad_item_desc)).setText(this.a.getApp_desc());
        viewOnNavigationEvent.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.event.TnkEventItemA$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkEventItemA.a(this.f$0, textView, view);
            }
        });
        if (this.a.getJoin_cnt() == this.a.getEvt_cnt()) {
            textView.setBackgroundResource(R.drawable.com_tnk_event_a_complete_icon);
            textView.setText("");
        } else if (this.a.getJoin_cnt() > 0) {
            textView.setBackgroundResource(R.drawable.com_tnk_event_a_ing_icon);
            textView.setText(String.valueOf(this.a.getEvt_cnt() - this.a.getJoin_cnt()));
        } else {
            textView.setBackgroundResource(R.drawable.com_tnk_event_a_dot_icon);
            textView.setText("");
        }
    }

    public final EventListVo getEventVo() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_event_item_a;
    }

    public final Function1<EventListVo, Unit> getOnItemClick() {
        return this.b;
    }
}
