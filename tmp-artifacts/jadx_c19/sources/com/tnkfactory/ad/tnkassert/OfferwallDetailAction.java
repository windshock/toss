package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.a0;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OfferwallDetailAction extends AssertData {
    public final String c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final int f58i;
    public final String j;
    public final int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallDetailAction(@NotNull String str, @NotNull String str2, long j, int i2, @NotNull String str3, @NotNull String str4, int i3, @NotNull String str5, int i4) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = i2;
        this.g = str3;
        this.h = str4;
        this.f58i = i3;
        this.j = str5;
        this.k = i4;
    }

    public final String component1() {
        return this.c;
    }

    public final String component2() {
        return this.d;
    }

    public final long component3() {
        return this.e;
    }

    public final int component4() {
        return this.f;
    }

    public final String component5() {
        return this.g;
    }

    public final String component6() {
        return this.h;
    }

    public final int component7() {
        return this.f58i;
    }

    public final String component8() {
        return this.j;
    }

    public final int component9() {
        return this.k;
    }

    public final OfferwallDetailAction copy(@NotNull String str, @NotNull String str2, long j, int i2, @NotNull String str3, @NotNull String str4, int i3, @NotNull String str5, int i4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OfferwallDetailAction(str, str2, j, i2, str3, str4, i3, str5, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallDetailAction)) {
            return false;
        }
        OfferwallDetailAction offerwallDetailAction = (OfferwallDetailAction) obj;
        return Intrinsics.areEqual(this.c, offerwallDetailAction.c) && Intrinsics.areEqual(this.d, offerwallDetailAction.d) && this.e == offerwallDetailAction.e && this.f == offerwallDetailAction.f && Intrinsics.areEqual(this.g, offerwallDetailAction.g) && Intrinsics.areEqual(this.h, offerwallDetailAction.h) && this.f58i == offerwallDetailAction.f58i && Intrinsics.areEqual(this.j, offerwallDetailAction.j) && this.k == offerwallDetailAction.k;
    }

    public final long getAppId() {
        return this.e;
    }

    public final String getArea() {
        return this.j;
    }

    public final int getCmpnType() {
        return this.k;
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        return "offerwalldetailaction";
    }

    public final String getItemAdType() {
        return this.h;
    }

    public final String getItemTitleKey() {
        return this.g;
    }

    public final int getRank() {
        return this.f58i;
    }

    public final int getRefererTab() {
        return this.f;
    }

    public final String getUnitId() {
        return this.d;
    }

    public final String getUserId() {
        return this.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.k) + b0.a(this.j, z.a(this.f58i, b0.a(this.h, b0.a(this.g, z.a(this.f, a0.a(this.e, b0.a(this.d, this.c.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() {
        return StringsKt.trimIndent("\n            {\n                \"userId\": \"" + this.c + "\",\n                \"unitId\": \"" + this.d + "\",\n                \"refererTab\": \"" + this.f + "\",\n                \"itemTitleKey\": \"" + this.g + "\",\n                \"itemAdType\": \"" + this.h + "\",\n                \"rank\": " + this.f58i + ",\n                \"area\": \"" + this.j + "\",\n                \"cmpnType\": \"" + this.k + "\",\n                \"appId\": " + this.e + "\n            }\n        ");
    }

    public String toString() {
        return "OfferwallDetailAction(userId=" + this.c + ", unitId=" + this.d + ", appId=" + this.e + ", refererTab=" + this.f + ", itemTitleKey=" + this.g + ", itemAdType=" + this.h + ", rank=" + this.f58i + ", area=" + this.j + ", cmpnType=" + this.k + ")";
    }
}
