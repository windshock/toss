package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.R;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class TnkAdListCpsFavorite extends TnkAdListCpsBasic {
    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_favorite;
    }

    @Override // com.tnkfactory.ad.basic.TnkAdListCpsBasic, com.tnkfactory.ad.basic.TnkAdListBasicItem, com.xwray.groupie.Item
    public int getSpanSize(int i2, int i3) {
        return 6;
    }
}
