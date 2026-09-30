package com.tnkfactory.ad.off.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CampaignTypeNameVo {
    private final int cmpn_type;
    private final String cmpn_type_nm;

    public CampaignTypeNameVo(int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cmpn_type = i2;
        this.cmpn_type_nm = str;
    }

    public static /* synthetic */ CampaignTypeNameVo copy$default(CampaignTypeNameVo campaignTypeNameVo, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = campaignTypeNameVo.cmpn_type;
        }
        if ((i3 & 2) != 0) {
            str = campaignTypeNameVo.cmpn_type_nm;
        }
        return campaignTypeNameVo.copy(i2, str);
    }

    public final int component1() {
        return this.cmpn_type;
    }

    public final String component2() {
        return this.cmpn_type_nm;
    }

    public final CampaignTypeNameVo copy(int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CampaignTypeNameVo(i2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignTypeNameVo)) {
            return false;
        }
        CampaignTypeNameVo campaignTypeNameVo = (CampaignTypeNameVo) obj;
        return this.cmpn_type == campaignTypeNameVo.cmpn_type && Intrinsics.areEqual(this.cmpn_type_nm, campaignTypeNameVo.cmpn_type_nm);
    }

    public final int getCmpn_type() {
        return this.cmpn_type;
    }

    public final String getCmpn_type_nm() {
        return this.cmpn_type_nm;
    }

    public int hashCode() {
        return this.cmpn_type_nm.hashCode() + (Integer.hashCode(this.cmpn_type) * 31);
    }

    public String toString() {
        return "CampaignTypeNameVo(cmpn_type=" + this.cmpn_type + ", cmpn_type_nm=" + this.cmpn_type_nm + ")";
    }
}
