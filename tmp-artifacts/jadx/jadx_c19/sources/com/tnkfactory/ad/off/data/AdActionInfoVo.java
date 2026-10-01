package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdActionInfoVo {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public int F;
    public long a;
    public long b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public String f39i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public long f40o;
    public long p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public String y;
    public String z;

    public AdActionInfoVo() {
        this(0L, 0L, null, null, 0, 0, null, 0, null, null, null, null, null, null, 0L, 0L, false, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 0, -1, null);
    }

    public final long component1() {
        return this.a;
    }

    public final String component10() {
        return this.j;
    }

    public final String component11() {
        return this.k;
    }

    public final String component12() {
        return this.l;
    }

    public final String component13() {
        return this.m;
    }

    public final String component14() {
        return this.n;
    }

    public final long component15() {
        return this.f40o;
    }

    public final long component16() {
        return this.p;
    }

    public final boolean component17() {
        return this.q;
    }

    public final String component18() {
        return this.r;
    }

    public final String component19() {
        return this.s;
    }

    public final long component2() {
        return this.b;
    }

    public final String component20() {
        return this.t;
    }

    public final String component21() {
        return this.u;
    }

    public final int component22() {
        return this.v;
    }

    public final int component23() {
        return this.w;
    }

    public final int component24() {
        return this.x;
    }

    public final String component25() {
        return this.y;
    }

    public final String component26() {
        return this.z;
    }

    public final String component27() {
        return this.A;
    }

    public final String component28() {
        return this.B;
    }

    public final String component29() {
        return this.C;
    }

    public final String component3() {
        return this.c;
    }

    public final String component30() {
        return this.D;
    }

    public final String component31() {
        return this.E;
    }

    public final int component32() {
        return this.F;
    }

    public final String component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    public final String component9() {
        return this.f39i;
    }

    public final AdActionInfoVo copy(long j, long j2, @NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, int i4, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, long j3, long j4, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, int i7, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, int i8) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        return new AdActionInfoVo(j, j2, str, str2, i2, i3, str3, i4, str4, str5, str6, str7, str8, str9, j3, j4, z, str10, str11, str12, str13, i5, i6, i7, str14, str15, str16, str17, str18, str19, str20, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdActionInfoVo)) {
            return false;
        }
        AdActionInfoVo adActionInfoVo = (AdActionInfoVo) obj;
        return this.a == adActionInfoVo.a && this.b == adActionInfoVo.b && Intrinsics.areEqual(this.c, adActionInfoVo.c) && Intrinsics.areEqual(this.d, adActionInfoVo.d) && this.e == adActionInfoVo.e && this.f == adActionInfoVo.f && Intrinsics.areEqual(this.g, adActionInfoVo.g) && this.h == adActionInfoVo.h && Intrinsics.areEqual(this.f39i, adActionInfoVo.f39i) && Intrinsics.areEqual(this.j, adActionInfoVo.j) && Intrinsics.areEqual(this.k, adActionInfoVo.k) && Intrinsics.areEqual(this.l, adActionInfoVo.l) && Intrinsics.areEqual(this.m, adActionInfoVo.m) && Intrinsics.areEqual(this.n, adActionInfoVo.n) && this.f40o == adActionInfoVo.f40o && this.p == adActionInfoVo.p && this.q == adActionInfoVo.q && Intrinsics.areEqual(this.r, adActionInfoVo.r) && Intrinsics.areEqual(this.s, adActionInfoVo.s) && Intrinsics.areEqual(this.t, adActionInfoVo.t) && Intrinsics.areEqual(this.u, adActionInfoVo.u) && this.v == adActionInfoVo.v && this.w == adActionInfoVo.w && this.x == adActionInfoVo.x && Intrinsics.areEqual(this.y, adActionInfoVo.y) && Intrinsics.areEqual(this.z, adActionInfoVo.z) && Intrinsics.areEqual(this.A, adActionInfoVo.A) && Intrinsics.areEqual(this.B, adActionInfoVo.B) && Intrinsics.areEqual(this.C, adActionInfoVo.C) && Intrinsics.areEqual(this.D, adActionInfoVo.D) && Intrinsics.areEqual(this.E, adActionInfoVo.E) && this.F == adActionInfoVo.F;
    }

    public final String getActionDesc() {
        return this.g;
    }

    public final int getActionId() {
        return this.e;
    }

    public final String getAdid_yn() {
        return this.r;
    }

    public final String getApp_desc() {
        return this.m;
    }

    public final long getApp_id() {
        return this.a;
    }

    public final String getApp_nm() {
        return this.c;
    }

    public final String getApp_pkg() {
        return this.d;
    }

    public final String getBtn_lbl() {
        return this.s;
    }

    public final long getCampaignId() {
        return this.b;
    }

    public final int getCampaignType() {
        return this.f;
    }

    public final String getCorp_desc() {
        return this.k;
    }

    public final String getDetailFeaturedImageUrl() {
        return this.f39i;
    }

    public final String getGoods_no() {
        return this.D;
    }

    public final String getIcon_url() {
        return this.j;
    }

    public final int getImg_id() {
        return this.h;
    }

    public final String getJoinDesc() {
        return this.A;
    }

    public final String getLike_yn() {
        return this.E;
    }

    public final String getMulti_desc() {
        return this.l;
    }

    public final long getOrgPointAmount() {
        return this.f40o;
    }

    public final String getOrg_price() {
        return this.C;
    }

    public final boolean getPayYn() {
        return this.q;
    }

    public final String getPnt_unit() {
        return this.n;
    }

    public final long getPointAmount() {
        return this.p;
    }

    public final String getPrd_price() {
        return this.B;
    }

    public final int getRet_cd() {
        return this.F;
    }

    public final String getSns_stat_cd() {
        return this.z;
    }

    public final int getVdo_id() {
        return this.x;
    }

    public final String getVdo_skip() {
        return this.y;
    }

    public final int getVideoMute() {
        return this.w;
    }

    public final int getVideoStart() {
        return this.v;
    }

    public final String getVideoUrl() {
        return this.t;
    }

    public final String getYoutubeId() {
        return this.u;
    }

    public int hashCode() {
        int iA = a0.a(this.p, a0.a(this.f40o, b0.a(this.n, b0.a(this.m, b0.a(this.l, b0.a(this.k, b0.a(this.j, b0.a(this.f39i, z.a(this.h, b0.a(this.g, z.a(this.f, z.a(this.e, b0.a(this.d, b0.a(this.c, a0.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        return Integer.hashCode(this.F) + b0.a(this.E, b0.a(this.D, b0.a(this.C, b0.a(this.B, b0.a(this.A, b0.a(this.z, b0.a(this.y, z.a(this.x, z.a(this.w, z.a(this.v, b0.a(this.u, b0.a(this.t, b0.a(this.s, b0.a(this.r, (Boolean.hashCode(this.q) + iA) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setActionDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.g = str;
    }

    public final void setActionId(int i2) {
        this.e = i2;
    }

    public final void setAdid_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.r = str;
    }

    public final void setApp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.m = str;
    }

    public final void setApp_id(long j) {
        this.a = j;
    }

    public final void setApp_nm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.c = str;
    }

    public final void setApp_pkg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d = str;
    }

    public final void setBtn_lbl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.s = str;
    }

    public final void setCampaignId(long j) {
        this.b = j;
    }

    public final void setCampaignType(int i2) {
        this.f = i2;
    }

    public final void setCorp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.k = str;
    }

    public final void setDetailFeaturedImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f39i = str;
    }

    public final void setGoods_no(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.D = str;
    }

    public final void setIcon_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.j = str;
    }

    public final void setImg_id(int i2) {
        this.h = i2;
    }

    public final void setJoinDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.A = str;
    }

    public final void setLike_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E = str;
    }

    public final void setMulti_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.l = str;
    }

    public final void setOrgPointAmount(long j) {
        this.f40o = j;
    }

    public final void setOrg_price(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.C = str;
    }

    public final void setPayYn(boolean z) {
        this.q = z;
    }

    public final void setPnt_unit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.n = str;
    }

    public final void setPointAmount(long j) {
        this.p = j;
    }

    public final void setPrd_price(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B = str;
    }

    public final void setRet_cd(int i2) {
        this.F = i2;
    }

    public final void setSns_stat_cd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.z = str;
    }

    public final void setVdo_id(int i2) {
        this.x = i2;
    }

    public final void setVdo_skip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.y = str;
    }

    public final void setVideoMute(int i2) {
        this.w = i2;
    }

    public final void setVideoStart(int i2) {
        this.v = i2;
    }

    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.t = str;
    }

    public final void setYoutubeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.u = str;
    }

    public String toString() {
        return "AdActionInfoVo(app_id=" + this.a + ", campaignId=" + this.b + ", app_nm=" + this.c + ", app_pkg=" + this.d + ", actionId=" + this.e + ", campaignType=" + this.f + ", actionDesc=" + this.g + ", img_id=" + this.h + ", detailFeaturedImageUrl=" + this.f39i + ", icon_url=" + this.j + ", corp_desc=" + this.k + ", multi_desc=" + this.l + ", app_desc=" + this.m + ", pnt_unit=" + this.n + ", orgPointAmount=" + this.f40o + ", pointAmount=" + this.p + ", payYn=" + this.q + ", adid_yn=" + this.r + ", btn_lbl=" + this.s + ", videoUrl=" + this.t + ", youtubeId=" + this.u + ", videoStart=" + this.v + ", videoMute=" + this.w + ", vdo_id=" + this.x + ", vdo_skip=" + this.y + ", sns_stat_cd=" + this.z + ", joinDesc=" + this.A + ", prd_price=" + this.B + ", org_price=" + this.C + ", goods_no=" + this.D + ", like_yn=" + this.E + ", ret_cd=" + this.F + ")";
    }

    public AdActionInfoVo(long j, long j2, @NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, int i4, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, long j3, long j4, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, int i7, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, int i8) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = i4;
        this.f39i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.f40o = j3;
        this.p = j4;
        this.q = z;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = i5;
        this.w = i6;
        this.x = i7;
        this.y = str14;
        this.z = str15;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = str19;
        this.E = str20;
        this.F = i8;
    }

    public /* synthetic */ AdActionInfoVo(long j, long j2, String str, String str2, int i2, int i3, String str3, int i4, String str4, String str5, String str6, String str7, String str8, String str9, long j3, long j4, boolean z, String str10, String str11, String str12, String str13, int i5, int i6, int i7, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j, (i9 & 2) != 0 ? 0L : j2, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? "" : str2, (i9 & 16) != 0 ? -1 : i2, (i9 & 32) == 0 ? i3 : -1, (i9 & 64) != 0 ? "" : str3, (i9 & 128) != 0 ? 0 : i4, (i9 & 256) != 0 ? "" : str4, (i9 & 512) != 0 ? "" : str5, (i9 & 1024) != 0 ? "" : str6, (i9 & 2048) != 0 ? "" : str7, (i9 & 4096) != 0 ? "" : str8, (i9 & 8192) != 0 ? "" : str9, (i9 & 16384) != 0 ? 0L : j3, (32768 & i9) != 0 ? 0L : j4, (65536 & i9) != 0 ? false : z, (i9 & 131072) != 0 ? "" : str10, (i9 & 262144) != 0 ? "" : str11, (i9 & 524288) != 0 ? "" : str12, (i9 & 1048576) != 0 ? "" : str13, (i9 & 2097152) != 0 ? 0 : i5, (i9 & 4194304) != 0 ? 0 : i6, (i9 & 8388608) != 0 ? 0 : i7, (i9 & 16777216) != 0 ? "" : str14, (i9 & 33554432) != 0 ? "" : str15, (i9 & 67108864) != 0 ? "" : str16, (i9 & 134217728) != 0 ? "" : str17, (i9 & 268435456) != 0 ? "" : str18, (i9 & 536870912) != 0 ? "" : str19, (i9 & 1073741824) != 0 ? "" : str20, (i9 & Integer.MIN_VALUE) != 0 ? 0 : i8);
    }
}
