package com.tnkfactory.ad.rwd;

import com.tnkfactory.ad.a.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PubInfo {
    public static final Companion Companion = new Companion(null);
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public String e;
    public String f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f49i;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final PubInfo jsonToPubInfo(@NotNull String str) throws JSONException {
            Intrinsics.checkNotNullParameter(str, "");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("hdr_msg");
            Intrinsics.checkNotNullExpressionValue(string, "");
            long j = jSONObject.getLong("multi_pnt");
            String string2 = jSONObject.getString("pnt_unit");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i2 = jSONObject.getInt("multi_cnt");
            String string3 = jSONObject.getString("eclck_url");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = jSONObject.getString("eimg_url");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = jSONObject.getString("ctype_surl");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            String string6 = jSONObject.getString("cat_show_yn");
            Intrinsics.checkNotNullExpressionValue(string6, "");
            String string7 = jSONObject.getString("filter_show_yn");
            Intrinsics.checkNotNullExpressionValue(string7, "");
            return new PubInfo(string, j, string2, i2, string3, string4, string5, string6, string7);
        }

        public final String pubInfoToJson(@NotNull PubInfo pubInfo) {
            Intrinsics.checkNotNullParameter(pubInfo, "");
            return StringsKt.trimIndent("\n                {\n                    \"hdr_msg\": \"" + pubInfo.getHdr_msg() + "\",\n                    \"multi_pnt\": " + pubInfo.getMulti_pnt() + ",\n                    \"pnt_unit\": \"" + pubInfo.getPnt_unit() + "\",\n                    \"multi_cnt\": " + pubInfo.getMulti_cnt() + ",\n                    \"eclck_url\": \"" + pubInfo.getEclck_url() + "\",\n                    \"eimg_url\": \"" + pubInfo.getEimg_url() + "\",\n                    \"ctype_surl\": \"" + pubInfo.getCtype_surl() + "\",\n                    \"cat_show_yn\": \"" + pubInfo.getCat_show_yn() + "\",\n                    \"filter_show_yn\": \"" + pubInfo.getFilter_show_yn() + "\"\n                }\n            ");
        }
    }

    public PubInfo() {
        this(null, 0L, null, 0, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
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

    public final String component8() {
        return this.h;
    }

    public final String component9() {
        return this.f49i;
    }

    public final PubInfo copy(@NotNull String str, long j, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PubInfo(str, j, str2, i2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PubInfo)) {
            return false;
        }
        PubInfo pubInfo = (PubInfo) obj;
        return Intrinsics.areEqual(this.a, pubInfo.a) && this.b == pubInfo.b && Intrinsics.areEqual(this.c, pubInfo.c) && this.d == pubInfo.d && Intrinsics.areEqual(this.e, pubInfo.e) && Intrinsics.areEqual(this.f, pubInfo.f) && Intrinsics.areEqual(this.g, pubInfo.g) && Intrinsics.areEqual(this.h, pubInfo.h) && Intrinsics.areEqual(this.f49i, pubInfo.f49i);
    }

    public final String getCat_show_yn() {
        return this.h;
    }

    public final String getCtype_surl() {
        return this.g;
    }

    public final String getEclck_url() {
        return this.e;
    }

    public final String getEimg_url() {
        return this.f;
    }

    public final String getFilter_show_yn() {
        return this.f49i;
    }

    public final String getHdr_msg() {
        return this.a;
    }

    public final int getMulti_cnt() {
        return this.d;
    }

    public final long getMulti_pnt() {
        return this.b;
    }

    public final String getPnt_unit() {
        return this.c;
    }

    public int hashCode() {
        return this.f49i.hashCode() + b0.a(this.h, b0.a(this.g, b0.a(this.f, b0.a(this.e, com.tnkfactory.ad.a.z.a(this.d, b0.a(this.c, com.tnkfactory.ad.a.a0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setEclck_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.e = str;
    }

    public final void setEimg_url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f = str;
    }

    public String toString() {
        return "PubInfo(hdr_msg=" + this.a + ", multi_pnt=" + this.b + ", pnt_unit=" + this.c + ", multi_cnt=" + this.d + ", eclck_url=" + this.e + ", eimg_url=" + this.f + ", ctype_surl=" + this.g + ", cat_show_yn=" + this.h + ", filter_show_yn=" + this.f49i + ")";
    }

    public PubInfo(@NotNull String str, long j, @NotNull String str2, int i2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.f49i = str7;
    }

    public /* synthetic */ PubInfo(String str, long j, String str2, int i2, String str3, String str4, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) == 0 ? str5 : "", (i3 & 128) != 0 ? "Y" : str6, (i3 & 256) == 0 ? str7 : "Y");
    }
}
