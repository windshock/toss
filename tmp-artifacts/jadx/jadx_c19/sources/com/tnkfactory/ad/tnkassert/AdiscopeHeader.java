package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdiscopeHeader {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public String f56i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public String f57o;

    public AdiscopeHeader() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final String component1() {
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

    public final String component15() {
        return this.f57o;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final String component4() {
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
        return this.f56i;
    }

    public final AdiscopeHeader copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        return new AdiscopeHeader(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdiscopeHeader)) {
            return false;
        }
        AdiscopeHeader adiscopeHeader = (AdiscopeHeader) obj;
        return Intrinsics.areEqual(this.a, adiscopeHeader.a) && Intrinsics.areEqual(this.b, adiscopeHeader.b) && Intrinsics.areEqual(this.c, adiscopeHeader.c) && Intrinsics.areEqual(this.d, adiscopeHeader.d) && Intrinsics.areEqual(this.e, adiscopeHeader.e) && Intrinsics.areEqual(this.f, adiscopeHeader.f) && Intrinsics.areEqual(this.g, adiscopeHeader.g) && Intrinsics.areEqual(this.h, adiscopeHeader.h) && Intrinsics.areEqual(this.f56i, adiscopeHeader.f56i) && Intrinsics.areEqual(this.j, adiscopeHeader.j) && Intrinsics.areEqual(this.k, adiscopeHeader.k) && Intrinsics.areEqual(this.l, adiscopeHeader.l) && Intrinsics.areEqual(this.m, adiscopeHeader.m) && Intrinsics.areEqual(this.n, adiscopeHeader.n) && Intrinsics.areEqual(this.f57o, adiscopeHeader.f57o);
    }

    public final String getInstallerName() {
        return this.a;
    }

    public final String getLocale() {
        return this.b;
    }

    public final String getLocation() {
        return this.c;
    }

    public final String getMinSdkVersion() {
        return this.d;
    }

    public final String getModel() {
        return this.e;
    }

    public final String getOs() {
        return this.f;
    }

    public final String getOsVersion() {
        return this.g;
    }

    public final String getPackageName() {
        return this.h;
    }

    public final String getSdkVersion() {
        return this.f56i;
    }

    public final String getTargetSdkVersion() {
        return this.j;
    }

    public final String getUnityRuntimeVersion() {
        return this.k;
    }

    public final String getUnityVersion() {
        return this.l;
    }

    public final String getVersionCode() {
        return this.m;
    }

    public final String getVersionName() {
        return this.n;
    }

    public final String getWidevineId() {
        return this.f57o;
    }

    public int hashCode() {
        return this.f57o.hashCode() + b0.a(this.n, b0.a(this.m, b0.a(this.l, b0.a(this.k, b0.a(this.j, b0.a(this.f56i, b0.a(this.h, b0.a(this.g, b0.a(this.f, b0.a(this.e, b0.a(this.d, b0.a(this.c, b0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setInstallerName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.a = str;
    }

    public final void setLocale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.b = str;
    }

    public final void setLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.c = str;
    }

    public final void setMinSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.d = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.e = str;
    }

    public final void setOs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f = str;
    }

    public final void setOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.g = str;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.h = str;
    }

    public final void setSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f56i = str;
    }

    public final void setTargetSdkVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.j = str;
    }

    public final void setUnityRuntimeVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.k = str;
    }

    public final void setUnityVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.l = str;
    }

    public final void setVersionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.m = str;
    }

    public final void setVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.n = str;
    }

    public final void setWidevineId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f57o = str;
    }

    public String toString() {
        return "AdiscopeHeader(installerName=" + this.a + ", locale=" + this.b + ", location=" + this.c + ", minSdkVersion=" + this.d + ", model=" + this.e + ", os=" + this.f + ", osVersion=" + this.g + ", packageName=" + this.h + ", sdkVersion=" + this.f56i + ", targetSdkVersion=" + this.j + ", unityRuntimeVersion=" + this.k + ", unityVersion=" + this.l + ", versionCode=" + this.m + ", versionName=" + this.n + ", widevineId=" + this.f57o + ")";
    }

    public AdiscopeHeader(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15) {
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
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.f56i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.f57o = str15;
    }

    public /* synthetic */ AdiscopeHeader(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & 2048) != 0 ? "" : str12, (i2 & 4096) != 0 ? "" : str13, (i2 & 8192) != 0 ? "" : str14, (i2 & 16384) == 0 ? str15 : "");
    }
}
