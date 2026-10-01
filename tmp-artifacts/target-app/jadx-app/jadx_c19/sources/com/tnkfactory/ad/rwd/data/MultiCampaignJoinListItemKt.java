package com.tnkfactory.ad.rwd.data;

import android.content.Context;
import com.tnkfactory.ad.rwd.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MultiCampaignJoinListItemKt {
    public static final boolean isCorrectItem(@NotNull MultiCampaignJoinListItem multiCampaignJoinListItem, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(multiCampaignJoinListItem, "");
        Intrinsics.checkNotNullParameter(context, "");
        return !isRemoveFromUser(multiCampaignJoinListItem, context);
    }

    public static final boolean isRemoveFromUser(@NotNull MultiCampaignJoinListItem multiCampaignJoinListItem, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(multiCampaignJoinListItem, "");
        Intrinsics.checkNotNullParameter(context, "");
        return Settings.INSTANCE.getHiddenApps(context).contains(Long.valueOf(multiCampaignJoinListItem.getApp_id())) && multiCampaignJoinListItem.getInst_dt() == 0 && multiCampaignJoinListItem.getPay_cnt() == 0;
    }
}
