package com.tnkfactory.ad;

import com.tnkfactory.ad.TnkAdLayoutConfig;
import com.tnkfactory.ad.basic.PlacementFeedViewLayout;
import com.tnkfactory.ad.basic.TnkAdListItemNormal;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkPlacementAdConfig {
    public HashMap a;

    public TnkPlacementAdConfig() {
        HashMap map = new HashMap();
        map.put("test", new TnkAdLayoutConfig.TnkPlacementAdListLayout("test", Reflection.getOrCreateKotlinClass(TnkAdListItemNormal.class), Reflection.getOrCreateKotlinClass(PlacementFeedViewLayout.class)));
        this.a = map;
    }

    public final HashMap<String, TnkAdLayoutConfig.TnkPlacementAdListLayout> getPlacementLayout() {
        return this.a;
    }

    public final void setPlacementLayout(@NotNull HashMap<String, TnkAdLayoutConfig.TnkPlacementAdListLayout> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.a = map;
    }
}
