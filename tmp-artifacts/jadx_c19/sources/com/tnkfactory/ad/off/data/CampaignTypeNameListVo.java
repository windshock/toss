package com.tnkfactory.ad.off.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CampaignTypeNameListVo {
    private final List<CampaignTypeNameVo> list;
    private final int list_count;

    public CampaignTypeNameListVo(@NotNull List<CampaignTypeNameVo> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
        this.list_count = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignTypeNameListVo copy$default(CampaignTypeNameListVo campaignTypeNameListVo, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = campaignTypeNameListVo.list;
        }
        if ((i3 & 2) != 0) {
            i2 = campaignTypeNameListVo.list_count;
        }
        return campaignTypeNameListVo.copy(list, i2);
    }

    public final List<CampaignTypeNameVo> component1() {
        return this.list;
    }

    public final int component2() {
        return this.list_count;
    }

    public final CampaignTypeNameListVo copy(@NotNull List<CampaignTypeNameVo> list, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CampaignTypeNameListVo(list, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTypeNameListVo)) {
            return false;
        }
        CampaignTypeNameListVo campaignTypeNameListVo = (CampaignTypeNameListVo) obj;
        return Intrinsics.areEqual(this.list, campaignTypeNameListVo.list) && this.list_count == campaignTypeNameListVo.list_count;
    }

    public final List<CampaignTypeNameVo> getList() {
        return this.list;
    }

    public final int getList_count() {
        return this.list_count;
    }

    public int hashCode() {
        return Integer.hashCode(this.list_count) + (this.list.hashCode() * 31);
    }

    public String toString() {
        return "CampaignTypeNameListVo(list=" + this.list + ", list_count=" + this.list_count + ")";
    }
}
