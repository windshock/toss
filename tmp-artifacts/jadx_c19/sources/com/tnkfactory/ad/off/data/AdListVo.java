package com.tnkfactory.ad.off.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class AdListVo {
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
    public long T;
    public boolean U;
    public boolean V;
    public int W;
    public ArrayList X;
    public long a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public String f43i;
    public String j;
    public int k;
    public String l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public String f44o;
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

    public AdListVo() {
        this(0L, 0, 0, null, null, null, null, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, 0, null, false, false, null, 0L, 0L, null, 0L, null, null, 0L, null, null, null, null, null, null, 0, 0, null, 0, 0, 0L, null, 0L, false, false, 0, null, -1, 262143, null);
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

    public final ArrayList<AdActionInfoVo> getCampaignItems() {
        return this.X;
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
        return this.f43i;
    }

    public final boolean getDayLimited() {
        return this.V;
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
        return this.f44o;
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

    public final long getInst_dt() {
        return this.T;
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
        return this.U;
    }

    public final int getOrderNumber() {
        return this.W;
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

    public final void setCampaignItems(@NotNull ArrayList<AdActionInfoVo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.X = arrayList;
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
        this.f43i = str;
    }

    public final void setDayLimited(boolean z) {
        this.V = z;
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
        this.f44o = str;
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

    public final void setInst_dt(long j) {
        this.T = j;
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
        this.U = z;
    }

    public final void setOrderNumber(int i2) {
        this.W = i2;
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

    public AdListVo(long j, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i4, @NotNull String str5, @NotNull String str6, int i5, @NotNull String str7, int i6, int i7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i8, @NotNull String str14, boolean z, boolean z2, @NotNull String str15, long j2, long j3, @NotNull String str16, long j4, @NotNull String str17, @NotNull String str18, long j5, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i9, int i10, @NotNull String str25, int i11, int i12, long j6, @NotNull String str26, long j7, boolean z3, boolean z4, int i13, @NotNull ArrayList<AdActionInfoVo> arrayList) {
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
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.a = j;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i4;
        this.f43i = str5;
        this.j = str6;
        this.k = i5;
        this.l = str7;
        this.m = i6;
        this.n = i7;
        this.f44o = str8;
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
        this.T = j7;
        this.U = z3;
        this.V = z4;
        this.W = i13;
        this.X = arrayList;
    }

    public /* synthetic */ AdListVo(long j, int i2, int i3, String str, String str2, String str3, String str4, int i4, String str5, String str6, int i5, String str7, int i6, int i7, String str8, String str9, String str10, String str11, String str12, String str13, int i8, String str14, boolean z, boolean z2, String str15, long j2, long j3, String str16, long j4, String str17, String str18, long j5, String str19, String str20, String str21, String str22, String str23, String str24, int i9, int i10, String str25, int i11, int i12, long j6, String str26, long j7, boolean z3, boolean z4, int i13, ArrayList arrayList, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j, (i14 & 2) != 0 ? -1 : i2, (i14 & 4) == 0 ? i3 : -1, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? "" : str2, (i14 & 32) != 0 ? "" : str3, (i14 & 64) != 0 ? "" : str4, (i14 & 128) != 0 ? 0 : i4, (i14 & 256) != 0 ? "" : str5, (i14 & 512) != 0 ? "" : str6, (i14 & 1024) != 0 ? 0 : i5, (i14 & 2048) != 0 ? "" : str7, (i14 & 4096) != 0 ? 0 : i6, (i14 & 8192) != 0 ? 0 : i7, (i14 & 16384) != 0 ? "" : str8, (i14 & 32768) != 0 ? "" : str9, (i14 & 65536) != 0 ? "" : str10, (i14 & 131072) != 0 ? "" : str11, (i14 & 262144) != 0 ? "" : str12, (i14 & 524288) != 0 ? "" : str13, (i14 & 1048576) != 0 ? 0 : i8, (i14 & 2097152) != 0 ? "" : str14, (i14 & 4194304) != 0 ? false : z, (i14 & 8388608) != 0 ? false : z2, (i14 & 16777216) != 0 ? "" : str15, (i14 & 33554432) != 0 ? 0L : j2, (i14 & 67108864) != 0 ? 0L : j3, (i14 & 134217728) != 0 ? "" : str16, (i14 & 268435456) != 0 ? 0L : j4, (i14 & 536870912) != 0 ? "" : str17, (i14 & 1073741824) != 0 ? "" : str18, (i14 & Integer.MIN_VALUE) != 0 ? 0L : j5, (i15 & 1) != 0 ? "N" : str19, (i15 & 2) != 0 ? "" : str20, (i15 & 4) != 0 ? "" : str21, (i15 & 8) != 0 ? "" : str22, (i15 & 16) != 0 ? "" : str23, (i15 & 32) != 0 ? "" : str24, (i15 & 64) != 0 ? 0 : i9, (i15 & 128) != 0 ? 0 : i10, (i15 & 256) != 0 ? "" : str25, (i15 & 512) != 0 ? 0 : i11, (i15 & 1024) != 0 ? 0 : i12, (i15 & 2048) != 0 ? 0L : j6, (i15 & 4096) != 0 ? "" : str26, (i15 & 8192) != 0 ? 0L : j7, (i15 & 16384) != 0 ? false : z3, (i15 & 32768) != 0 ? false : z4, (i15 & 65536) != 0 ? 0 : i13, (i15 & 131072) != 0 ? new ArrayList() : arrayList);
    }
}
