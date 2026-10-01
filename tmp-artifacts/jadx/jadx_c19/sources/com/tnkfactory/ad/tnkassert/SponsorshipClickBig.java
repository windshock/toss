package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SponsorshipClickBig extends AssertData {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final int f62i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorshipClickBig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.f62i = i2;
    }

    public static /* synthetic */ SponsorshipClickBig copy$default(SponsorshipClickBig sponsorshipClickBig, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sponsorshipClickBig.c;
        }
        if ((i3 & 2) != 0) {
            str2 = sponsorshipClickBig.d;
        }
        String str7 = str2;
        if ((i3 & 4) != 0) {
            str3 = sponsorshipClickBig.e;
        }
        String str8 = str3;
        if ((i3 & 8) != 0) {
            str4 = sponsorshipClickBig.f;
        }
        String str9 = str4;
        if ((i3 & 16) != 0) {
            str5 = sponsorshipClickBig.g;
        }
        String str10 = str5;
        if ((i3 & 32) != 0) {
            str6 = sponsorshipClickBig.h;
        }
        String str11 = str6;
        if ((i3 & 64) != 0) {
            i2 = sponsorshipClickBig.f62i;
        }
        return sponsorshipClickBig.copy(str, str7, str8, str9, str10, str11, i2);
    }

    public final String component1() {
        return this.c;
    }

    public final String component2() {
        return this.d;
    }

    public final String component3() {
        return this.e;
    }

    public final String component4() {
        return this.f;
    }

    public final String component5() {
        return this.g;
    }

    public final String component6() {
        return this.h;
    }

    public final int component7() {
        return this.f62i;
    }

    public final SponsorshipClickBig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SponsorshipClickBig(str, str2, str3, str4, str5, str6, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorshipClickBig)) {
            return false;
        }
        SponsorshipClickBig sponsorshipClickBig = (SponsorshipClickBig) obj;
        return Intrinsics.areEqual(this.c, sponsorshipClickBig.c) && Intrinsics.areEqual(this.d, sponsorshipClickBig.d) && Intrinsics.areEqual(this.e, sponsorshipClickBig.e) && Intrinsics.areEqual(this.f, sponsorshipClickBig.f) && Intrinsics.areEqual(this.g, sponsorshipClickBig.g) && Intrinsics.areEqual(this.h, sponsorshipClickBig.h) && this.f62i == sponsorshipClickBig.f62i;
    }

    public final String getArea() {
        return this.h;
    }

    public final String getCreativesId() {
        return this.f;
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        return "sponsorshipclickbig";
    }

    public final String getItemId() {
        return this.e;
    }

    public final int getRank() {
        return this.f62i;
    }

    public final String getRefererTab() {
        return this.g;
    }

    public final String getUnitId() {
        return this.d;
    }

    public final String getUserId() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62i) + b0.a(this.h, b0.a(this.g, b0.a(this.f, b0.a(this.e, b0.a(this.d, this.c.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() {
        return StringsKt.trimIndent("\n            {\n                \"userId\": \"" + this.c + "\",\n                \"unitId\": \"" + this.d + "\",\n                \"itemId\": \"" + this.e + "\",\n                \"creativesId\": \"" + this.f + "\",\n                \"refererTab\": \"" + this.g + "\",\n                \"area\": \"" + this.h + "\",\n                \"rank\": " + this.f62i + "\n            }\n        ");
    }

    public String toString() {
        return "SponsorshipClickBig(userId=" + this.c + ", unitId=" + this.d + ", itemId=" + this.e + ", creativesId=" + this.f + ", refererTab=" + this.g + ", area=" + this.h + ", rank=" + this.f62i + ")";
    }
}
