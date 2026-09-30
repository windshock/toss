package com.tnkfactory.ad.repository.db.entity;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdItemDto {
    public long A;
    public String B;
    public long C;
    public String D;
    public String E;
    public long F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public long R;
    public String S;
    public boolean T;
    public boolean U;
    public int V;
    public long a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public String f47i;
    public String j;
    public int k;
    public String l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public String f48o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public int u;
    public String v;
    public boolean w;
    public boolean x;
    public String y;
    public long z;

    public AdItemDto(long j, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i4, @NotNull String str5, @NotNull String str6, int i5, @NotNull String str7, int i6, int i7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i8, @NotNull String str14, boolean z, boolean z2, @NotNull String str15, long j2, long j3, @NotNull String str16, long j4, @NotNull String str17, @NotNull String str18, long j5, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i9, int i10, @NotNull String str25, int i11, int i12, long j6, @NotNull String str26, boolean z3, boolean z4, int i13) {
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
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        this.a = j;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i4;
        this.f47i = str5;
        this.j = str6;
        this.k = i5;
        this.l = str7;
        this.m = i6;
        this.n = i7;
        this.f48o = str8;
        this.p = str9;
        this.q = str10;
        this.r = str11;
        this.s = str12;
        this.t = str13;
        this.u = i8;
        this.v = str14;
        this.w = z;
        this.x = z2;
        this.y = str15;
        this.z = j2;
        this.A = j3;
        this.B = str16;
        this.C = j4;
        this.D = str17;
        this.E = str18;
        this.F = j5;
        this.G = str19;
        this.H = str20;
        this.I = str21;
        this.J = str22;
        this.K = str23;
        this.L = str24;
        this.M = i9;
        this.N = i10;
        this.O = str25;
        this.P = i11;
        this.Q = i12;
        this.R = j6;
        this.S = str26;
        this.T = z3;
        this.U = z4;
        this.V = i13;
    }

    public static /* synthetic */ AdItemDto copy$default(AdItemDto adItemDto, long j, int i2, int i3, String str, String str2, String str3, String str4, int i4, String str5, String str6, int i5, String str7, int i6, int i7, String str8, String str9, String str10, String str11, String str12, String str13, int i8, String str14, boolean z, boolean z2, String str15, long j2, long j3, String str16, long j4, String str17, String str18, long j5, String str19, String str20, String str21, String str22, String str23, String str24, int i9, int i10, String str25, int i11, int i12, long j6, String str26, boolean z3, boolean z4, int i13, int i14, int i15, Object obj) {
        long j7 = (i14 & 1) != 0 ? adItemDto.a : j;
        int i16 = (i14 & 2) != 0 ? adItemDto.b : i2;
        int i17 = (i14 & 4) != 0 ? adItemDto.c : i3;
        String str27 = (i14 & 8) != 0 ? adItemDto.d : str;
        String str28 = (i14 & 16) != 0 ? adItemDto.e : str2;
        String str29 = (i14 & 32) != 0 ? adItemDto.f : str3;
        String str30 = (i14 & 64) != 0 ? adItemDto.g : str4;
        int i18 = (i14 & 128) != 0 ? adItemDto.h : i4;
        String str31 = (i14 & 256) != 0 ? adItemDto.f47i : str5;
        String str32 = (i14 & 512) != 0 ? adItemDto.j : str6;
        int i19 = (i14 & 1024) != 0 ? adItemDto.k : i5;
        return adItemDto.copy(j7, i16, i17, str27, str28, str29, str30, i18, str31, str32, i19, (i14 & 2048) != 0 ? adItemDto.l : str7, (i14 & 4096) != 0 ? adItemDto.m : i6, (i14 & 8192) != 0 ? adItemDto.n : i7, (i14 & 16384) != 0 ? adItemDto.f48o : str8, (i14 & 32768) != 0 ? adItemDto.p : str9, (i14 & 65536) != 0 ? adItemDto.q : str10, (i14 & 131072) != 0 ? adItemDto.r : str11, (i14 & 262144) != 0 ? adItemDto.s : str12, (i14 & 524288) != 0 ? adItemDto.t : str13, (i14 & 1048576) != 0 ? adItemDto.u : i8, (i14 & 2097152) != 0 ? adItemDto.v : str14, (i14 & 4194304) != 0 ? adItemDto.w : z, (i14 & 8388608) != 0 ? adItemDto.x : z2, (i14 & 16777216) != 0 ? adItemDto.y : str15, (i14 & 33554432) != 0 ? adItemDto.z : j2, (i14 & 67108864) != 0 ? adItemDto.A : j3, (i14 & 134217728) != 0 ? adItemDto.B : str16, (268435456 & i14) != 0 ? adItemDto.C : j4, (i14 & 536870912) != 0 ? adItemDto.D : str17, (1073741824 & i14) != 0 ? adItemDto.E : str18, (i14 & Integer.MIN_VALUE) != 0 ? adItemDto.F : j5, (i15 & 1) != 0 ? adItemDto.G : str19, (i15 & 2) != 0 ? adItemDto.H : str20, (i15 & 4) != 0 ? adItemDto.I : str21, (i15 & 8) != 0 ? adItemDto.J : str22, (i15 & 16) != 0 ? adItemDto.K : str23, (i15 & 32) != 0 ? adItemDto.L : str24, (i15 & 64) != 0 ? adItemDto.M : i9, (i15 & 128) != 0 ? adItemDto.N : i10, (i15 & 256) != 0 ? adItemDto.O : str25, (i15 & 512) != 0 ? adItemDto.P : i11, (i15 & 1024) != 0 ? adItemDto.Q : i12, (i15 & 2048) != 0 ? adItemDto.R : j6, (i15 & 4096) != 0 ? adItemDto.S : str26, (i15 & 8192) != 0 ? adItemDto.T : z3, (i15 & 16384) != 0 ? adItemDto.U : z4, (i15 & 32768) != 0 ? adItemDto.V : i13);
    }

    public final long component1() {
        return this.a;
    }

    public final String component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    public final String component12() {
        return this.l;
    }

    public final int component13() {
        return this.m;
    }

    public final int component14() {
        return this.n;
    }

    public final String component15() {
        return this.f48o;
    }

    public final String component16() {
        return this.p;
    }

    public final String component17() {
        return this.q;
    }

    public final String component18() {
        return this.r;
    }

    public final String component19() {
        return this.s;
    }

    public final int component2() {
        return this.b;
    }

    public final String component20() {
        return this.t;
    }

    public final int component21() {
        return this.u;
    }

    public final String component22() {
        return this.v;
    }

    public final boolean component23() {
        return this.w;
    }

    public final boolean component24() {
        return this.x;
    }

    public final String component25() {
        return this.y;
    }

    public final long component26() {
        return this.z;
    }

    public final long component27() {
        return this.A;
    }

    public final String component28() {
        return this.B;
    }

    public final long component29() {
        return this.C;
    }

    public final int component3() {
        return this.c;
    }

    public final String component30() {
        return this.D;
    }

    public final String component31() {
        return this.E;
    }

    public final long component32() {
        return this.F;
    }

    public final String component33() {
        return this.G;
    }

    public final String component34() {
        return this.H;
    }

    public final String component35() {
        return this.I;
    }

    public final String component36() {
        return this.J;
    }

    public final String component37() {
        return this.K;
    }

    public final String component38() {
        return this.L;
    }

    public final int component39() {
        return this.M;
    }

    public final String component4() {
        return this.d;
    }

    public final int component40() {
        return this.N;
    }

    public final String component41() {
        return this.O;
    }

    public final int component42() {
        return this.P;
    }

    public final int component43() {
        return this.Q;
    }

    public final long component44() {
        return this.R;
    }

    public final String component45() {
        return this.S;
    }

    public final boolean component46() {
        return this.T;
    }

    public final boolean component47() {
        return this.U;
    }

    public final int component48() {
        return this.V;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final String component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    public final String component9() {
        return this.f47i;
    }

    public final AdItemDto copy(long j, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i4, @NotNull String str5, @NotNull String str6, int i5, @NotNull String str7, int i6, int i7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i8, @NotNull String str14, boolean z, boolean z2, @NotNull String str15, long j2, long j3, @NotNull String str16, long j4, @NotNull String str17, @NotNull String str18, long j5, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i9, int i10, @NotNull String str25, int i11, int i12, long j6, @NotNull String str26, boolean z3, boolean z4, int i13) {
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
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new AdItemDto(j, i2, i3, str, str2, str3, str4, i4, str5, str6, i5, str7, i6, i7, str8, str9, str10, str11, str12, str13, i8, str14, z, z2, str15, j2, j3, str16, j4, str17, str18, j5, str19, str20, str21, str22, str23, str24, i9, i10, str25, i11, i12, j6, str26, z3, z4, i13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdItemDto)) {
            return false;
        }
        AdItemDto adItemDto = (AdItemDto) obj;
        return this.a == adItemDto.a && this.b == adItemDto.b && this.c == adItemDto.c && Intrinsics.areEqual(this.d, adItemDto.d) && Intrinsics.areEqual(this.e, adItemDto.e) && Intrinsics.areEqual(this.f, adItemDto.f) && Intrinsics.areEqual(this.g, adItemDto.g) && this.h == adItemDto.h && Intrinsics.areEqual(this.f47i, adItemDto.f47i) && Intrinsics.areEqual(this.j, adItemDto.j) && this.k == adItemDto.k && Intrinsics.areEqual(this.l, adItemDto.l) && this.m == adItemDto.m && this.n == adItemDto.n && Intrinsics.areEqual(this.f48o, adItemDto.f48o) && Intrinsics.areEqual(this.p, adItemDto.p) && Intrinsics.areEqual(this.q, adItemDto.q) && Intrinsics.areEqual(this.r, adItemDto.r) && Intrinsics.areEqual(this.s, adItemDto.s) && Intrinsics.areEqual(this.t, adItemDto.t) && this.u == adItemDto.u && Intrinsics.areEqual(this.v, adItemDto.v) && this.w == adItemDto.w && this.x == adItemDto.x && Intrinsics.areEqual(this.y, adItemDto.y) && this.z == adItemDto.z && this.A == adItemDto.A && Intrinsics.areEqual(this.B, adItemDto.B) && this.C == adItemDto.C && Intrinsics.areEqual(this.D, adItemDto.D) && Intrinsics.areEqual(this.E, adItemDto.E) && this.F == adItemDto.F && Intrinsics.areEqual(this.G, adItemDto.G) && Intrinsics.areEqual(this.H, adItemDto.H) && Intrinsics.areEqual(this.I, adItemDto.I) && Intrinsics.areEqual(this.J, adItemDto.J) && Intrinsics.areEqual(this.K, adItemDto.K) && Intrinsics.areEqual(this.L, adItemDto.L) && this.M == adItemDto.M && this.N == adItemDto.N && Intrinsics.areEqual(this.O, adItemDto.O) && this.P == adItemDto.P && this.Q == adItemDto.Q && this.R == adItemDto.R && Intrinsics.areEqual(this.S, adItemDto.S) && this.T == adItemDto.T && this.U == adItemDto.U && this.V == adItemDto.V;
    }

    public final int getActionId() {
        return this.b;
    }

    public final String getActn_desc() {
        return this.J;
    }

    public final int getAdType() {
        return this.c;
    }

    public final String getAdid_yn() {
        return this.d;
    }

    public final long getAppId() {
        return this.a;
    }

    public final String getApp_desc() {
        return this.I;
    }

    public final String getApp_nm() {
        return this.K;
    }

    public final String getApp_pkg() {
        return this.f;
    }

    public final int getCampaignType() {
        return this.h;
    }

    public final String getCheckUrl() {
        return this.O;
    }

    public final String getClickUrl() {
        return this.H;
    }

    public final long getCmpn_cnt() {
        return this.R;
    }

    public final String getCmpn_desc() {
        return this.g;
    }

    public final int getCnts_skip() {
        return this.M;
    }

    public final int getCnts_type() {
        return this.N;
    }

    public final String getCorp_desc() {
        return this.f47i;
    }

    public final boolean getDayLimited() {
        return this.U;
    }

    public final String getDetailYn() {
        return this.j;
    }

    public final int getFilterId() {
        return this.k;
    }

    public final String getGoods_no() {
        return this.l;
    }

    public final String getHideInstalled() {
        return this.y;
    }

    public final int getIa_or1_cnt() {
        return this.m;
    }

    public final int getIa_or2_cnt() {
        return this.n;
    }

    public final String getIconUrl() {
        return this.f48o;
    }

    public final String getImgUrl() {
        return this.p;
    }

    public final String getInst_apps_and() {
        return this.q;
    }

    public final String getInst_apps_not() {
        return this.r;
    }

    public final String getInst_apps_or1() {
        return this.s;
    }

    public final String getInst_apps_or2() {
        return this.t;
    }

    public final int getLayout_id() {
        return this.u;
    }

    public final String getLike_yn() {
        return this.v;
    }

    public final boolean getMultiYn() {
        return this.w;
    }

    public final boolean getMulti_join_yn() {
        return this.x;
    }

    public final boolean getOnError() {
        return this.T;
    }

    public final int getOrderNumber() {
        return this.V;
    }

    public final long getOrg_pnt_amt() {
        return this.z;
    }

    public final long getOrg_price() {
        return this.A;
    }

    public final String getOsType() {
        return this.B;
    }

    public final String getPayYn() {
        return this.L;
    }

    public final int getPay_cnt() {
        return this.Q;
    }

    public final int getPay_dt() {
        return this.P;
    }

    public final String getPnt_txt() {
        return this.E;
    }

    public final long getPointAmount() {
        return this.C;
    }

    public final String getPointUnit() {
        return this.D;
    }

    public final long getPrd_price() {
        return this.F;
    }

    public final String getTitle() {
        return this.e;
    }

    public final String getValid_lbl() {
        return this.S;
    }

    public final String getWebview_yn() {
        return this.G;
    }

    public int hashCode() {
        int iA = b0.a(this.v, z.a(this.u, b0.a(this.t, b0.a(this.s, b0.a(this.r, b0.a(this.q, b0.a(this.p, b0.a(this.f48o, z.a(this.n, z.a(this.m, b0.a(this.l, z.a(this.k, b0.a(this.j, b0.a(this.f47i, z.a(this.h, b0.a(this.g, b0.a(this.f, b0.a(this.e, b0.a(this.d, z.a(this.c, z.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int iHashCode = Boolean.hashCode(this.w);
        int iA2 = b0.a(this.S, a0.a(this.R, z.a(this.Q, z.a(this.P, b0.a(this.O, z.a(this.N, z.a(this.M, b0.a(this.L, b0.a(this.K, b0.a(this.J, b0.a(this.I, b0.a(this.H, b0.a(this.G, a0.a(this.F, b0.a(this.E, b0.a(this.D, a0.a(this.C, b0.a(this.B, a0.a(this.A, a0.a(this.z, b0.a(this.y, (Boolean.hashCode(this.x) + ((iHashCode + iA) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int iHashCode2 = Boolean.hashCode(this.T);
        return Integer.hashCode(this.V) + ((Boolean.hashCode(this.U) + ((iHashCode2 + iA2) * 31)) * 31);
    }

    public final void setActionId(int i2) {
        this.b = i2;
    }

    public final void setActn_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.J = str;
    }

    public final void setAdType(int i2) {
        this.c = i2;
    }

    public final void setAdid_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d = str;
    }

    public final void setAppId(long j) {
        this.a = j;
    }

    public final void setApp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.I = str;
    }

    public final void setApp_nm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.K = str;
    }

    public final void setApp_pkg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f = str;
    }

    public final void setCampaignType(int i2) {
        this.h = i2;
    }

    public final void setCheckUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.O = str;
    }

    public final void setClickUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.H = str;
    }

    public final void setCmpn_cnt(long j) {
        this.R = j;
    }

    public final void setCmpn_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.g = str;
    }

    public final void setCnts_skip(int i2) {
        this.M = i2;
    }

    public final void setCnts_type(int i2) {
        this.N = i2;
    }

    public final void setCorp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f47i = str;
    }

    public final void setDayLimited(boolean z) {
        this.U = z;
    }

    public final void setDetailYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.j = str;
    }

    public final void setFilterId(int i2) {
        this.k = i2;
    }

    public final void setGoods_no(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.l = str;
    }

    public final void setHideInstalled(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.y = str;
    }

    public final void setIa_or1_cnt(int i2) {
        this.m = i2;
    }

    public final void setIa_or2_cnt(int i2) {
        this.n = i2;
    }

    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f48o = str;
    }

    public final void setImgUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p = str;
    }

    public final void setInst_apps_and(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.q = str;
    }

    public final void setInst_apps_not(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.r = str;
    }

    public final void setInst_apps_or1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.s = str;
    }

    public final void setInst_apps_or2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.t = str;
    }

    public final void setLayout_id(int i2) {
        this.u = i2;
    }

    public final void setLike_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.v = str;
    }

    public final void setMultiYn(boolean z) {
        this.w = z;
    }

    public final void setMulti_join_yn(boolean z) {
        this.x = z;
    }

    public final void setOnError(boolean z) {
        this.T = z;
    }

    public final void setOrderNumber(int i2) {
        this.V = i2;
    }

    public final void setOrg_pnt_amt(long j) {
        this.z = j;
    }

    public final void setOrg_price(long j) {
        this.A = j;
    }

    public final void setOsType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.B = str;
    }

    public final void setPayYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.L = str;
    }

    public final void setPay_cnt(int i2) {
        this.Q = i2;
    }

    public final void setPay_dt(int i2) {
        this.P = i2;
    }

    public final void setPnt_txt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.E = str;
    }

    public final void setPointAmount(long j) {
        this.C = j;
    }

    public final void setPointUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.D = str;
    }

    public final void setPrd_price(long j) {
        this.F = j;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.e = str;
    }

    public final void setValid_lbl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.S = str;
    }

    public final void setWebview_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.G = str;
    }

    public String toString() {
        return "AdItemDto(appId=" + this.a + ", actionId=" + this.b + ", adType=" + this.c + ", adid_yn=" + this.d + ", title=" + this.e + ", app_pkg=" + this.f + ", cmpn_desc=" + this.g + ", campaignType=" + this.h + ", corp_desc=" + this.f47i + ", detailYn=" + this.j + ", filterId=" + this.k + ", goods_no=" + this.l + ", ia_or1_cnt=" + this.m + ", ia_or2_cnt=" + this.n + ", iconUrl=" + this.f48o + ", imgUrl=" + this.p + ", inst_apps_and=" + this.q + ", inst_apps_not=" + this.r + ", inst_apps_or1=" + this.s + ", inst_apps_or2=" + this.t + ", layout_id=" + this.u + ", like_yn=" + this.v + ", multiYn=" + this.w + ", multi_join_yn=" + this.x + ", hideInstalled=" + this.y + ", org_pnt_amt=" + this.z + ", org_price=" + this.A + ", osType=" + this.B + ", pointAmount=" + this.C + ", pointUnit=" + this.D + ", pnt_txt=" + this.E + ", prd_price=" + this.F + ", webview_yn=" + this.G + ", clickUrl=" + this.H + ", app_desc=" + this.I + ", actn_desc=" + this.J + ", app_nm=" + this.K + ", payYn=" + this.L + ", cnts_skip=" + this.M + ", cnts_type=" + this.N + ", checkUrl=" + this.O + ", pay_dt=" + this.P + ", pay_cnt=" + this.Q + ", cmpn_cnt=" + this.R + ", valid_lbl=" + this.S + ", onError=" + this.T + ", dayLimited=" + this.U + ", orderNumber=" + this.V + ")";
    }

    public /* synthetic */ AdItemDto(long j, int i2, int i3, String str, String str2, String str3, String str4, int i4, String str5, String str6, int i5, String str7, int i6, int i7, String str8, String str9, String str10, String str11, String str12, String str13, int i8, String str14, boolean z, boolean z2, String str15, long j2, long j3, String str16, long j4, String str17, String str18, long j5, String str19, String str20, String str21, String str22, String str23, String str24, int i9, int i10, String str25, int i11, int i12, long j6, String str26, boolean z3, boolean z4, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j, (i14 & 2) != 0 ? -1 : i2, (i14 & 4) == 0 ? i3 : -1, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? "" : str2, (i14 & 32) != 0 ? "" : str3, (i14 & 64) != 0 ? "" : str4, (i14 & 128) != 0 ? 0 : i4, (i14 & 256) != 0 ? "" : str5, (i14 & 512) != 0 ? "" : str6, (i14 & 1024) != 0 ? 0 : i5, (i14 & 2048) != 0 ? "" : str7, (i14 & 4096) != 0 ? 0 : i6, (i14 & 8192) != 0 ? 0 : i7, (i14 & 16384) != 0 ? "" : str8, (i14 & 32768) != 0 ? "" : str9, (i14 & 65536) != 0 ? "" : str10, (i14 & 131072) != 0 ? "" : str11, (i14 & 262144) != 0 ? "" : str12, (i14 & 524288) != 0 ? "" : str13, (i14 & 1048576) != 0 ? 0 : i8, (i14 & 2097152) != 0 ? "" : str14, (i14 & 4194304) != 0 ? false : z, (i14 & 8388608) != 0 ? false : z2, (i14 & 16777216) != 0 ? "" : str15, (i14 & 33554432) != 0 ? 0L : j2, (i14 & 67108864) != 0 ? 0L : j3, (i14 & 134217728) != 0 ? "" : str16, (i14 & 268435456) != 0 ? 0L : j4, (i14 & 536870912) != 0 ? "" : str17, (i14 & 1073741824) != 0 ? "" : str18, (i14 & Integer.MIN_VALUE) != 0 ? 0L : j5, (i15 & 1) != 0 ? "N" : str19, (i15 & 2) != 0 ? "" : str20, (i15 & 4) != 0 ? "" : str21, (i15 & 8) != 0 ? "" : str22, (i15 & 16) != 0 ? "" : str23, (i15 & 32) != 0 ? "" : str24, (i15 & 64) != 0 ? 0 : i9, (i15 & 128) != 0 ? 0 : i10, (i15 & 256) != 0 ? "" : str25, (i15 & 512) != 0 ? 0 : i11, (i15 & 1024) != 0 ? 0 : i12, (i15 & 2048) != 0 ? 0L : j6, (i15 & 4096) != 0 ? "" : str26, (i15 & 8192) != 0 ? false : z3, (i15 & 16384) != 0 ? false : z4, (i15 & 32768) != 0 ? 0 : i13);
    }

    public AdItemDto() {
        this(0L, -1, -1, "", "", "", "", 0, "", "", 0, "", 0, 0, "", "", "", "", "", "", 0, "", false, false, "", 0L, 0L, "", 0L, "", "", 0L, "N", "", "", "", "", "", 0, 0, "", 0, 0, 0L, "", false, false, 0);
    }
}
