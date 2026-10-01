package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OfferwallDetailShow extends AssertData {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final int f59i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallDetailShow(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, int i3, int i4) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = str5;
        this.f59i = i3;
        this.j = i4;
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

    public final int component5() {
        return this.g;
    }

    public final String component6() {
        return this.h;
    }

    public final int component7() {
        return this.f59i;
    }

    public final int component8() {
        return this.j;
    }

    public final OfferwallDetailShow copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, int i3, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OfferwallDetailShow(str, str2, str3, str4, i2, str5, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallDetailShow)) {
            return false;
        }
        OfferwallDetailShow offerwallDetailShow = (OfferwallDetailShow) obj;
        return Intrinsics.areEqual(this.c, offerwallDetailShow.c) && Intrinsics.areEqual(this.d, offerwallDetailShow.d) && Intrinsics.areEqual(this.e, offerwallDetailShow.e) && Intrinsics.areEqual(this.f, offerwallDetailShow.f) && this.g == offerwallDetailShow.g && Intrinsics.areEqual(this.h, offerwallDetailShow.h) && this.f59i == offerwallDetailShow.f59i && this.j == offerwallDetailShow.j;
    }

    public final int getAdType() {
        return this.j;
    }

    public final String getAppId() {
        return this.e;
    }

    public final String getArea() {
        return this.h;
    }

    public final int getCmpnType() {
        return this.f59i;
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        return "offerwalldetailshow";
    }

    public final int getRank() {
        return this.g;
    }

    public final String getRefererTab() {
        return this.f;
    }

    public final String getUnitId() {
        return this.d;
    }

    public final String getUserId() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.j) + z.a(this.f59i, b0.a(this.h, z.a(this.g, b0.a(this.f, b0.a(this.e, b0.a(this.d, this.c.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() {
        return StringsKt.trimIndent("\n            {\n                \"userId\": \"" + this.c + "\",\n                \"unitId\": \"" + this.d + "\",\n                \"appId\": \"" + this.e + "\",\n                \"refererTab\": \"" + this.f + "\",\n                \"rank\": " + this.g + ",\n                \"area\": \"" + this.h + "\",\n                \"cmpnType\": " + this.f59i + ",\n                \"adType\": \"" + this.j + "\"\n            }\n        ");
    }

    public String toString() {
        return "OfferwallDetailShow(userId=" + this.c + ", unitId=" + this.d + ", appId=" + this.e + ", refererTab=" + this.f + ", rank=" + this.g + ", area=" + this.h + ", cmpnType=" + this.f59i + ", adType=" + this.j + ")";
    }
}
