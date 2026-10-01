package com.tnkfactory.ad.rwd.data;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MultiCampaignJoinListItem {
    private String actn_desc;
    private int actn_id;
    private int ad_type;
    private String adid_yn;
    private long app_id;
    private String app_nm;
    private String app_pkg;
    private int cmpn_cnt;
    private int cmpn_type;
    private String corp_desc;
    private String detail_yn;
    private int filter_id;
    private String icon_url;
    private String img_url;
    private long inst_dt;
    private int layout_id;
    private String multi_join_yn;
    private String multi_yn;
    private long org_pnt_amt;
    private String os_type;
    private int pay_cnt;
    private long pay_dt;
    private long pnt_amt;
    private String pnt_txt;
    private String pnt_unit;
    private String valid_lbl;

    public MultiCampaignJoinListItem(long j, @NotNull String str, @NotNull String str2, int i2, int i3, int i4, int i5, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j2, long j3, @NotNull String str7, @NotNull String str8, int i6, int i7, int i8, long j4, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j5, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.app_id = j;
        this.app_nm = str;
        this.app_pkg = str2;
        this.ad_type = i2;
        this.actn_id = i3;
        this.cmpn_type = i4;
        this.filter_id = i5;
        this.img_url = str3;
        this.detail_yn = str4;
        this.adid_yn = str5;
        this.pnt_unit = str6;
        this.pnt_amt = j2;
        this.inst_dt = j3;
        this.pnt_txt = str7;
        this.icon_url = str8;
        this.layout_id = i6;
        this.cmpn_cnt = i7;
        this.pay_cnt = i8;
        this.org_pnt_amt = j4;
        this.multi_join_yn = str9;
        this.actn_desc = str10;
        this.multi_yn = str11;
        this.pay_dt = j5;
        this.valid_lbl = str12;
        this.corp_desc = str13;
        this.os_type = str14;
    }

    public static /* synthetic */ MultiCampaignJoinListItem copy$default(MultiCampaignJoinListItem multiCampaignJoinListItem, long j, String str, String str2, int i2, int i3, int i4, int i5, String str3, String str4, String str5, String str6, long j2, long j3, String str7, String str8, int i6, int i7, int i8, long j4, String str9, String str10, String str11, long j5, String str12, String str13, String str14, int i9, Object obj) {
        long j6 = (i9 & 1) != 0 ? multiCampaignJoinListItem.app_id : j;
        String str15 = (i9 & 2) != 0 ? multiCampaignJoinListItem.app_nm : str;
        String str16 = (i9 & 4) != 0 ? multiCampaignJoinListItem.app_pkg : str2;
        int i10 = (i9 & 8) != 0 ? multiCampaignJoinListItem.ad_type : i2;
        int i11 = (i9 & 16) != 0 ? multiCampaignJoinListItem.actn_id : i3;
        int i12 = (i9 & 32) != 0 ? multiCampaignJoinListItem.cmpn_type : i4;
        int i13 = (i9 & 64) != 0 ? multiCampaignJoinListItem.filter_id : i5;
        String str17 = (i9 & 128) != 0 ? multiCampaignJoinListItem.img_url : str3;
        String str18 = (i9 & 256) != 0 ? multiCampaignJoinListItem.detail_yn : str4;
        String str19 = (i9 & 512) != 0 ? multiCampaignJoinListItem.adid_yn : str5;
        String str20 = (i9 & 1024) != 0 ? multiCampaignJoinListItem.pnt_unit : str6;
        long j7 = (i9 & 2048) != 0 ? multiCampaignJoinListItem.pnt_amt : j2;
        long j8 = (i9 & 4096) != 0 ? multiCampaignJoinListItem.inst_dt : j3;
        String str21 = (i9 & 8192) != 0 ? multiCampaignJoinListItem.pnt_txt : str7;
        return multiCampaignJoinListItem.copy(j6, str15, str16, i10, i11, i12, i13, str17, str18, str19, str20, j7, j8, str21, (i9 & 16384) != 0 ? multiCampaignJoinListItem.icon_url : str8, (i9 & 32768) != 0 ? multiCampaignJoinListItem.layout_id : i6, (i9 & 65536) != 0 ? multiCampaignJoinListItem.cmpn_cnt : i7, (i9 & 131072) != 0 ? multiCampaignJoinListItem.pay_cnt : i8, (i9 & 262144) != 0 ? multiCampaignJoinListItem.org_pnt_amt : j4, (i9 & 524288) != 0 ? multiCampaignJoinListItem.multi_join_yn : str9, (1048576 & i9) != 0 ? multiCampaignJoinListItem.actn_desc : str10, (i9 & 2097152) != 0 ? multiCampaignJoinListItem.multi_yn : str11, (i9 & 4194304) != 0 ? multiCampaignJoinListItem.pay_dt : j5, (i9 & 8388608) != 0 ? multiCampaignJoinListItem.valid_lbl : str12, (16777216 & i9) != 0 ? multiCampaignJoinListItem.corp_desc : str13, (i9 & 33554432) != 0 ? multiCampaignJoinListItem.os_type : str14);
    }

    public final long component1() {
        return this.app_id;
    }

    public final String component10() {
        return this.adid_yn;
    }

    public final String component11() {
        return this.pnt_unit;
    }

    public final long component12() {
        return this.pnt_amt;
    }

    public final long component13() {
        return this.inst_dt;
    }

    public final String component14() {
        return this.pnt_txt;
    }

    public final String component15() {
        return this.icon_url;
    }

    public final int component16() {
        return this.layout_id;
    }

    public final int component17() {
        return this.cmpn_cnt;
    }

    public final int component18() {
        return this.pay_cnt;
    }

    public final long component19() {
        return this.org_pnt_amt;
    }

    public final String component2() {
        return this.app_nm;
    }

    public final String component20() {
        return this.multi_join_yn;
    }

    public final String component21() {
        return this.actn_desc;
    }

    public final String component22() {
        return this.multi_yn;
    }

    public final long component23() {
        return this.pay_dt;
    }

    public final String component24() {
        return this.valid_lbl;
    }

    public final String component25() {
        return this.corp_desc;
    }

    public final String component26() {
        return this.os_type;
    }

    public final String component3() {
        return this.app_pkg;
    }

    public final int component4() {
        return this.ad_type;
    }

    public final int component5() {
        return this.actn_id;
    }

    public final int component6() {
        return this.cmpn_type;
    }

    public final int component7() {
        return this.filter_id;
    }

    public final String component8() {
        return this.img_url;
    }

    public final String component9() {
        return this.detail_yn;
    }

    public final MultiCampaignJoinListItem copy(long j, @NotNull String str, @NotNull String str2, int i2, int i3, int i4, int i5, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j2, long j3, @NotNull String str7, @NotNull String str8, int i6, int i7, int i8, long j4, @NotNull String str9, @NotNull String str10, @NotNull String str11, long j5, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new MultiCampaignJoinListItem(j, str, str2, i2, i3, i4, i5, str3, str4, str5, str6, j2, j3, str7, str8, i6, i7, i8, j4, str9, str10, str11, j5, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiCampaignJoinListItem)) {
            return false;
        }
        MultiCampaignJoinListItem multiCampaignJoinListItem = (MultiCampaignJoinListItem) obj;
        return this.app_id == multiCampaignJoinListItem.app_id && Intrinsics.areEqual(this.app_nm, multiCampaignJoinListItem.app_nm) && Intrinsics.areEqual(this.app_pkg, multiCampaignJoinListItem.app_pkg) && this.ad_type == multiCampaignJoinListItem.ad_type && this.actn_id == multiCampaignJoinListItem.actn_id && this.cmpn_type == multiCampaignJoinListItem.cmpn_type && this.filter_id == multiCampaignJoinListItem.filter_id && Intrinsics.areEqual(this.img_url, multiCampaignJoinListItem.img_url) && Intrinsics.areEqual(this.detail_yn, multiCampaignJoinListItem.detail_yn) && Intrinsics.areEqual(this.adid_yn, multiCampaignJoinListItem.adid_yn) && Intrinsics.areEqual(this.pnt_unit, multiCampaignJoinListItem.pnt_unit) && this.pnt_amt == multiCampaignJoinListItem.pnt_amt && this.inst_dt == multiCampaignJoinListItem.inst_dt && Intrinsics.areEqual(this.pnt_txt, multiCampaignJoinListItem.pnt_txt) && Intrinsics.areEqual(this.icon_url, multiCampaignJoinListItem.icon_url) && this.layout_id == multiCampaignJoinListItem.layout_id && this.cmpn_cnt == multiCampaignJoinListItem.cmpn_cnt && this.pay_cnt == multiCampaignJoinListItem.pay_cnt && this.org_pnt_amt == multiCampaignJoinListItem.org_pnt_amt && Intrinsics.areEqual(this.multi_join_yn, multiCampaignJoinListItem.multi_join_yn) && Intrinsics.areEqual(this.actn_desc, multiCampaignJoinListItem.actn_desc) && Intrinsics.areEqual(this.multi_yn, multiCampaignJoinListItem.multi_yn) && this.pay_dt == multiCampaignJoinListItem.pay_dt && Intrinsics.areEqual(this.valid_lbl, multiCampaignJoinListItem.valid_lbl) && Intrinsics.areEqual(this.corp_desc, multiCampaignJoinListItem.corp_desc) && Intrinsics.areEqual(this.os_type, multiCampaignJoinListItem.os_type);
    }

    public final String getActn_desc() {
        return this.actn_desc;
    }

    public final int getActn_id() {
        return this.actn_id;
    }

    public final int getAd_type() {
        return this.ad_type;
    }

    public final String getAdid_yn() {
        return this.adid_yn;
    }

    public final long getApp_id() {
        return this.app_id;
    }

    public final String getApp_nm() {
        return this.app_nm;
    }

    public final String getApp_pkg() {
        return this.app_pkg;
    }

    public final int getCmpn_cnt() {
        return this.cmpn_cnt;
    }

    public final int getCmpn_type() {
        return this.cmpn_type;
    }

    public final String getCorp_desc() {
        return this.corp_desc;
    }

    public final String getDetail_yn() {
        return this.detail_yn;
    }

    public final int getFilter_id() {
        return this.filter_id;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getImg_url() {
        return this.img_url;
    }

    public final long getInst_dt() {
        return this.inst_dt;
    }

    public final int getLayout_id() {
        return this.layout_id;
    }

    public final String getMulti_join_yn() {
        return this.multi_join_yn;
    }

    public final String getMulti_yn() {
        return this.multi_yn;
    }

    public final long getOrg_pnt_amt() {
        return this.org_pnt_amt;
    }

    public final String getOs_type() {
        return this.os_type;
    }

    public final int getPay_cnt() {
        return this.pay_cnt;
    }

    public final long getPay_dt() {
        return this.pay_dt;
    }

    public final long getPnt_amt() {
        return this.pnt_amt;
    }

    public final String getPnt_txt() {
        return this.pnt_txt;
    }

    public final String getPnt_unit() {
        return this.pnt_unit;
    }

    public final String getValid_lbl() {
        return this.valid_lbl;
    }

    public int hashCode() {
        return this.os_type.hashCode() + b0.a(this.corp_desc, b0.a(this.valid_lbl, a0.a(this.pay_dt, b0.a(this.multi_yn, b0.a(this.actn_desc, b0.a(this.multi_join_yn, a0.a(this.org_pnt_amt, z.a(this.pay_cnt, z.a(this.cmpn_cnt, z.a(this.layout_id, b0.a(this.icon_url, b0.a(this.pnt_txt, a0.a(this.inst_dt, a0.a(this.pnt_amt, b0.a(this.pnt_unit, b0.a(this.adid_yn, b0.a(this.detail_yn, b0.a(this.img_url, z.a(this.filter_id, z.a(this.cmpn_type, z.a(this.actn_id, z.a(this.ad_type, b0.a(this.app_pkg, b0.a(this.app_nm, Long.hashCode(this.app_id) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setActn_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actn_desc = str;
    }

    public final void setActn_id(int i2) {
        this.actn_id = i2;
    }

    public final void setAd_type(int i2) {
        this.ad_type = i2;
    }

    public final void setAdid_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.adid_yn = str;
    }

    public final void setApp_id(long j) {
        this.app_id = j;
    }

    public final void setApp_nm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.app_nm = str;
    }

    public final void setApp_pkg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.app_pkg = str;
    }

    public final void setCmpn_cnt(int i2) {
        this.cmpn_cnt = i2;
    }

    public final void setCmpn_type(int i2) {
        this.cmpn_type = i2;
    }

    public final void setCorp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.corp_desc = str;
    }

    public final void setDetail_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.detail_yn = str;
    }

    public final void setFilter_id(int i2) {
        this.filter_id = i2;
    }

    public final void setIcon_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon_url = str;
    }

    public final void setImg_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.img_url = str;
    }

    public final void setInst_dt(long j) {
        this.inst_dt = j;
    }

    public final void setLayout_id(int i2) {
        this.layout_id = i2;
    }

    public final void setMulti_join_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.multi_join_yn = str;
    }

    public final void setMulti_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.multi_yn = str;
    }

    public final void setOrg_pnt_amt(long j) {
        this.org_pnt_amt = j;
    }

    public final void setOs_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.os_type = str;
    }

    public final void setPay_cnt(int i2) {
        this.pay_cnt = i2;
    }

    public final void setPay_dt(long j) {
        this.pay_dt = j;
    }

    public final void setPnt_amt(long j) {
        this.pnt_amt = j;
    }

    public final void setPnt_txt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnt_txt = str;
    }

    public final void setPnt_unit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnt_unit = str;
    }

    public final void setValid_lbl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valid_lbl = str;
    }

    public String toString() {
        return "MultiCampaignJoinListItem(app_id=" + this.app_id + ", app_nm=" + this.app_nm + ", app_pkg=" + this.app_pkg + ", ad_type=" + this.ad_type + ", actn_id=" + this.actn_id + ", cmpn_type=" + this.cmpn_type + ", filter_id=" + this.filter_id + ", img_url=" + this.img_url + ", detail_yn=" + this.detail_yn + ", adid_yn=" + this.adid_yn + ", pnt_unit=" + this.pnt_unit + ", pnt_amt=" + this.pnt_amt + ", inst_dt=" + this.inst_dt + ", pnt_txt=" + this.pnt_txt + ", icon_url=" + this.icon_url + ", layout_id=" + this.layout_id + ", cmpn_cnt=" + this.cmpn_cnt + ", pay_cnt=" + this.pay_cnt + ", org_pnt_amt=" + this.org_pnt_amt + ", multi_join_yn=" + this.multi_join_yn + ", actn_desc=" + this.actn_desc + ", multi_yn=" + this.multi_yn + ", pay_dt=" + this.pay_dt + ", valid_lbl=" + this.valid_lbl + ", corp_desc=" + this.corp_desc + ", os_type=" + this.os_type + ")";
    }
}
