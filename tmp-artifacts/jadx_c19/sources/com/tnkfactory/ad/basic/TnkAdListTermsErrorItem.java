package com.tnkfactory.ad.basic;

import android.view.View;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkContext;
import com.xwray.groupie.Item;
import kotlin.jvm.internal.Intrinsics;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListTermsErrorItem extends Item<setColorSchemeColors> {
    public final TnkContext a;

    public TnkAdListTermsErrorItem(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = tnkContext;
    }

    public static final void a(TnkAdListTermsErrorItem tnkAdListTermsErrorItem, View view) {
        tnkAdListTermsErrorItem.a.getNavi().closeOfferwall();
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        setcolorschemecolors.onNavigationEvent().findViewById(R.id.con_tnk_off_ad_list_terms_close).setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListTermsErrorItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TnkAdListTermsErrorItem.a(this.f$0, view);
            }
        });
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_terms_error;
    }

    @Override // com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 12;
    }

    public final TnkContext getTnkContext() {
        return this.a;
    }
}
