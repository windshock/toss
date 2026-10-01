package com.tnkfactory.ad.off.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class EventListVo {
    public long a;
    public String b;
    public String c;
    public String d;
    public long e;
    public int f;
    public int g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public String f45i;
    public int j;
    public long k;
    public int l;
    public String m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public String f46o;
    public String p;
    public int q;
    public String r;

    public EventListVo() {
        this(0L, null, null, null, 0L, 0, 0, null, null, 0, 0L, 0, null, null, null, null, 0, null, 262143, null);
    }

    public final int getActn_id() {
        return this.l;
    }

    public final String getAdid_yn() {
        return this.f46o;
    }

    public final String getApp_desc() {
        return this.c;
    }

    public final long getApp_id() {
        return this.a;
    }

    public final String getApp_nm() {
        return this.b;
    }

    public final String getCat_id() {
        return this.n;
    }

    public final String getClck_url() {
        return this.h;
    }

    public final int getCnts_skip() {
        return this.j;
    }

    public final String getCnts_url() {
        return this.f45i;
    }

    public final int getEvt_cnt() {
        return this.f;
    }

    public final String getIcon_url() {
        return this.r;
    }

    public final int getJoin_cnt() {
        return this.g;
    }

    public final int getLayout_id() {
        return this.q;
    }

    public final long getPaid_pnt() {
        return this.e;
    }

    public final String getPayYn() {
        return this.d;
    }

    public final long getPnt_amt() {
        return this.k;
    }

    public final String getPnt_unit() {
        return this.p;
    }

    public final String getWebview_yn() {
        return this.m;
    }

    public final void setActn_id(int i2) {
        this.l = i2;
    }

    public final void setAdid_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f46o = str;
    }

    public final void setApp_desc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.c = str;
    }

    public final void setApp_id(long j) {
        this.a = j;
    }

    public final void setApp_nm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b = str;
    }

    public final void setCat_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.n = str;
    }

    public final void setClck_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.h = str;
    }

    public final void setCnts_skip(int i2) {
        this.j = i2;
    }

    public final void setCnts_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f45i = str;
    }

    public final void setEvt_cnt(int i2) {
        this.f = i2;
    }

    public final void setIcon_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.r = str;
    }

    public final void setJoin_cnt(int i2) {
        this.g = i2;
    }

    public final void setLayout_id(int i2) {
        this.q = i2;
    }

    public final void setPaid_pnt(long j) {
        this.e = j;
    }

    public final void setPayYn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d = str;
    }

    public final void setPnt_amt(long j) {
        this.k = j;
    }

    public final void setPnt_unit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.p = str;
    }

    public final void setWebview_yn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.m = str;
    }

    public EventListVo(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, int i2, int i3, @NotNull String str4, @NotNull String str5, int i4, long j3, int i5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i6, @NotNull String str10) {
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
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = i2;
        this.g = i3;
        this.h = str4;
        this.f45i = str5;
        this.j = i4;
        this.k = j3;
        this.l = i5;
        this.m = str6;
        this.n = str7;
        this.f46o = str8;
        this.p = str9;
        this.q = i6;
        this.r = str10;
    }

    public /* synthetic */ EventListVo(long j, String str, String str2, String str3, long j2, int i2, int i3, String str4, String str5, int i4, long j3, int i5, String str6, String str7, String str8, String str9, int i6, String str10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? 0L : j2, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? "" : str4, (i7 & 256) != 0 ? "" : str5, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? 0L : j3, (i7 & 2048) != 0 ? -1 : i5, (i7 & 4096) != 0 ? "N" : str6, (i7 & 8192) != 0 ? "" : str7, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? "" : str9, (i7 & 65536) != 0 ? 0 : i6, (i7 & 131072) != 0 ? "" : str10);
    }
}
