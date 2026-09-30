package com.tnkfactory.ad.off.data;

import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdJoinInfoVo {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f41i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final String f42o;
    public final String p;
    public final int q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final int v;

    public AdJoinInfoVo(@NotNull String str, @NotNull String str2, int i2, int i3, int i4, int i5, int i6, @NotNull String str3, @NotNull String str4, int i7, @NotNull String str5, @NotNull String str6, int i8, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i10) {
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
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = str3;
        this.f41i = str4;
        this.j = i7;
        this.k = str5;
        this.l = str6;
        this.m = i8;
        this.n = str7;
        this.f42o = str8;
        this.p = str9;
        this.q = i9;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = i10;
    }

    public final String component1() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    public final String component11() {
        return this.k;
    }

    public final String component12() {
        return this.l;
    }

    public final int component13() {
        return this.m;
    }

    public final String component14() {
        return this.n;
    }

    public final String component15() {
        return this.f42o;
    }

    public final String component16() {
        return this.p;
    }

    public final int component17() {
        return this.q;
    }

    public final String component18() {
        return this.r;
    }

    public final String component19() {
        return this.s;
    }

    public final String component2() {
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

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final String component8() {
        return this.h;
    }

    public final String component9() {
        return this.f41i;
    }

    public final AdJoinInfoVo copy(@NotNull String str, @NotNull String str2, int i2, int i3, int i4, int i5, int i6, @NotNull String str3, @NotNull String str4, int i7, @NotNull String str5, @NotNull String str6, int i8, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i10) {
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
        return new AdJoinInfoVo(str, str2, i2, i3, i4, i5, i6, str3, str4, i7, str5, str6, i8, str7, str8, str9, i9, str10, str11, str12, str13, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdJoinInfoVo)) {
            return false;
        }
        AdJoinInfoVo adJoinInfoVo = (AdJoinInfoVo) obj;
        return Intrinsics.areEqual(this.a, adJoinInfoVo.a) && Intrinsics.areEqual(this.b, adJoinInfoVo.b) && this.c == adJoinInfoVo.c && this.d == adJoinInfoVo.d && this.e == adJoinInfoVo.e && this.f == adJoinInfoVo.f && this.g == adJoinInfoVo.g && Intrinsics.areEqual(this.h, adJoinInfoVo.h) && Intrinsics.areEqual(this.f41i, adJoinInfoVo.f41i) && this.j == adJoinInfoVo.j && Intrinsics.areEqual(this.k, adJoinInfoVo.k) && Intrinsics.areEqual(this.l, adJoinInfoVo.l) && this.m == adJoinInfoVo.m && Intrinsics.areEqual(this.n, adJoinInfoVo.n) && Intrinsics.areEqual(this.f42o, adJoinInfoVo.f42o) && Intrinsics.areEqual(this.p, adJoinInfoVo.p) && this.q == adJoinInfoVo.q && Intrinsics.areEqual(this.r, adJoinInfoVo.r) && Intrinsics.areEqual(this.s, adJoinInfoVo.s) && Intrinsics.areEqual(this.t, adJoinInfoVo.t) && Intrinsics.areEqual(this.u, adJoinInfoVo.u) && this.v == adJoinInfoVo.v;
    }

    public final int getActn_id() {
        return this.q;
    }

    public final String getAdid_yn() {
        return this.a;
    }

    public final String getAll_yn() {
        return this.p;
    }

    public final String getApk_key() {
        return this.f42o;
    }

    public final String getCheck_url() {
        return this.u;
    }

    public final int getCnt() {
        return this.d;
    }

    public final int getCnts_skip() {
        return this.f;
    }

    public final int getCnts_type() {
        return this.m;
    }

    public final String getFad_yn() {
        return this.t;
    }

    public final String getInhs_yn() {
        return this.l;
    }

    public final int getIp_max() {
        return this.g;
    }

    public final String getMkt_app_id() {
        return this.s;
    }

    public final String getMkt_id() {
        return this.r;
    }

    public final String getOs_type() {
        return this.n;
    }

    public final int getOwnr_id() {
        return this.e;
    }

    public final String getPub_advurl() {
        return this.k;
    }

    public final int getRet_cd() {
        return this.j;
    }

    public final String getStat_cd() {
        return this.b;
    }

    public final int getUi_option() {
        return this.v;
    }

    public final int getUp_cust_id() {
        return this.c;
    }

    public final String getWebview_type() {
        return this.f41i;
    }

    public final String getWebview_yn() {
        return this.h;
    }

    public int hashCode() {
        return Integer.hashCode(this.v) + b0.a(this.u, b0.a(this.t, b0.a(this.s, b0.a(this.r, z.a(this.q, b0.a(this.p, b0.a(this.f42o, b0.a(this.n, z.a(this.m, b0.a(this.l, b0.a(this.k, z.a(this.j, b0.a(this.f41i, b0.a(this.h, z.a(this.g, z.a(this.f, z.a(this.e, z.a(this.d, z.a(this.c, b0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "AdJoinInfoVo(adid_yn=" + this.a + ", stat_cd=" + this.b + ", up_cust_id=" + this.c + ", cnt=" + this.d + ", ownr_id=" + this.e + ", cnts_skip=" + this.f + ", ip_max=" + this.g + ", webview_yn=" + this.h + ", webview_type=" + this.f41i + ", ret_cd=" + this.j + ", pub_advurl=" + this.k + ", inhs_yn=" + this.l + ", cnts_type=" + this.m + ", os_type=" + this.n + ", apk_key=" + this.f42o + ", all_yn=" + this.p + ", actn_id=" + this.q + ", mkt_id=" + this.r + ", mkt_app_id=" + this.s + ", fad_yn=" + this.t + ", check_url=" + this.u + ", ui_option=" + this.v + ")";
    }
}
