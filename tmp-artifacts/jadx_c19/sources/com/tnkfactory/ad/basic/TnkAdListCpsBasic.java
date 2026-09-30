package com.tnkfactory.ad.basic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkSession;
import com.tnkfactory.ad.basic.TnkAdListCpsBasic;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TnkAdListCpsBasic extends TnkAdListBasicItem {
    public static final void a(TnkAdListCpsBasic tnkAdListCpsBasic, View view) {
        Intrinsics.checkNotNull(view);
        tnkAdListCpsBasic.onClickFavors(view, tnkAdListCpsBasic.getAdItem());
    }

    public static final void b(TnkAdListCpsBasic tnkAdListCpsBasic, View view) {
        tnkAdListCpsBasic.onItemClick();
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.bind(setcolorschemecolors, i2);
        if (getAdItem().getDayLimited()) {
            View itemDisable = getItemDisable();
            if (itemDisable != null) {
                itemDisable.setVisibility(0);
            }
            TextView receiptView = getReceiptView();
            if (receiptView != null) {
                receiptView.setText("내일 구매 가능");
            }
        } else {
            View itemDisable2 = getItemDisable();
            if (itemDisable2 != null) {
                itemDisable2.setVisibility(8);
            }
        }
        View view = ((RecyclerView.ViewHolder) setcolorschemecolors).onNavigationEvent;
        TextView cpsPrdPrice = getCpsPrdPrice();
        if (cpsPrdPrice != null) {
            cpsPrdPrice.setText(StringsKt.trim(new DecimalFormat("###,###").format(getAdItem().getPrd_price()) + "원").toString());
        }
        TextView cpsprdDc = getCpsprdDc();
        if (cpsprdDc != null) {
            int org_price = (int) (100.0f - ((100.0f / getAdItem().getOrg_price()) * getAdItem().getPrd_price()));
            if (org_price > 0) {
                cpsprdDc.setVisibility(0);
                cpsprdDc.setText(org_price + "%");
            } else {
                cpsprdDc.setVisibility(8);
                cpsprdDc.setText("");
            }
        }
        ImageView cpsHeart = getCpsHeart();
        if (cpsHeart != null) {
            cpsHeart.setSelected(Intrinsics.areEqual(getAdItem().getLike_yn(), "Y"));
        }
        ImageView cpsHeart2 = getCpsHeart();
        if (cpsHeart2 != null) {
            cpsHeart2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsBasic$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TnkAdListCpsBasic.a(this.f$0, view2);
                }
            });
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsBasic$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TnkAdListCpsBasic.b(this.f$0, view2);
            }
        });
    }

    public ImageView getCpsHeart() {
        return (ImageView) getRoot().findViewById(R.id.com_tnk_off_cps_heart);
    }

    public TextView getCpsPrdPrice() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_cps_prd_price);
    }

    public TextView getCpsprdDc() {
        return (TextView) getRoot().findViewById(R.id.com_tnk_off_item_cps_prd_dc);
    }

    public View getDivider() {
        return getRoot().findViewById(R.id.com_tnk_off_item_divider);
    }

    public View getItemDisable() {
        return getRoot().findViewById(R.id.com_tnk_off_item_disable);
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_basic;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }

    public final void onClickFavors(@NotNull View view, @NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        ArrayList<AdListVo> adList = TnkCore.INSTANCE.getOffRepository().getAdList();
        if (adList == null || !adList.isEmpty()) {
            Iterator<T> it = adList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((AdListVo) it.next()).getLike_yn(), "Y") && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            if (i2 > 49 && Intrinsics.areEqual(adListVo.getLike_yn(), "N")) {
                getTnkContext().getNavi().showDialog(getTnkContext().getActivity(), "즐겨찾기는 50개 까지 등록 가능합니다.", new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsBasic$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return TnkAdListCpsBasic.a();
                    }
                });
                return;
            }
        }
        getAdEventHandler().onClickFavor(adListVo, new AnonymousClass2(view, this));
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    /* renamed from: com.tnkfactory.ad.basic.TnkAdListCpsBasic$onClickFavors$2, reason: invalid class name */
    public static final class AnonymousClass2 implements AdEventListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ TnkAdListCpsBasic b;

        public AnonymousClass2(View view, TnkAdListCpsBasic tnkAdListCpsBasic) {
            this.a = view;
            this.b = tnkAdListCpsBasic;
        }

        public static final void a(AdListVo adListVo) {
            Toast.makeText(TnkCore.INSTANCE.getServiceTask().getApplicationContext(), Intrinsics.areEqual(adListVo.getLike_yn(), "Y") ? "등록된 관심상품은 MY에서 확인 할 수 있어요." : "관심상품에서 삭제되었어요.", 0).show();
        }

        @Override // com.tnkfactory.ad.off.AdEventListener
        public void onComplete(final AdListVo adListVo, boolean z) {
            Intrinsics.checkNotNullParameter(adListVo, "");
            if (z) {
                adListVo.setLike_yn(!Intrinsics.areEqual(adListVo.getLike_yn(), "Y") ? "Y" : "N");
                this.a.setSelected(Intrinsics.areEqual(adListVo.getLike_yn(), "Y"));
                TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
                TnkSession.INSTANCE.runOnMainThread(new Runnable() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsBasic$onClickFavors$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TnkAdListCpsBasic.AnonymousClass2.a(adListVo);
                    }
                });
            }
        }

        @Override // com.tnkfactory.ad.off.AdEventListener
        public void onError(TnkError tnkError) {
            Intrinsics.checkNotNullParameter(tnkError, "");
            this.b.getTnkContext().getNavi().showDialog(this.b.getTnkContext().getActivity(), tnkError.getMessage(), new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsBasic$onClickFavors$2$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return TnkAdListCpsBasic.AnonymousClass2.a();
                }
            });
            TnkCore.INSTANCE.getOffRepository().getDataChanged().postValue(Boolean.TRUE);
        }

        public static final Unit a() {
            return Unit.INSTANCE;
        }
    }
}
