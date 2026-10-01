package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OfferwallView extends AssertData {
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f61i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallView(@NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = str4;
        this.f61i = str5;
    }

    public static /* synthetic */ OfferwallView copy$default(OfferwallView offerwallView, String str, String str2, int i2, int i3, String str3, String str4, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = offerwallView.c;
        }
        if ((i4 & 2) != 0) {
            str2 = offerwallView.d;
        }
        String str6 = str2;
        if ((i4 & 4) != 0) {
            i2 = offerwallView.e;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = offerwallView.f;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str3 = offerwallView.g;
        }
        String str7 = str3;
        if ((i4 & 32) != 0) {
            str4 = offerwallView.h;
        }
        String str8 = str4;
        if ((i4 & 64) != 0) {
            str5 = offerwallView.f61i;
        }
        return offerwallView.copy(str, str6, i5, i6, str7, str8, str5);
    }

    public final String component1() {
        return this.c;
    }

    public final String component2() {
        return this.d;
    }

    public final int component3() {
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

    public final String component7() {
        return this.f61i;
    }

    public final OfferwallView copy(@NotNull String str, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OfferwallView(str, str2, i2, i3, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallView)) {
            return false;
        }
        OfferwallView offerwallView = (OfferwallView) obj;
        return Intrinsics.areEqual(this.c, offerwallView.c) && Intrinsics.areEqual(this.d, offerwallView.d) && this.e == offerwallView.e && this.f == offerwallView.f && Intrinsics.areEqual(this.g, offerwallView.g) && Intrinsics.areEqual(this.h, offerwallView.h) && Intrinsics.areEqual(this.f61i, offerwallView.f61i);
    }

    public final String getClientMessage() {
        return this.f61i;
    }

    public final String getClientTitle() {
        return this.h;
    }

    public final int getCode() {
        return this.f;
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        return "offerwallview";
    }

    public final String getMessage() {
        return this.g;
    }

    public final int getResult() {
        return this.e;
    }

    public final String getUnitId() {
        return this.c;
    }

    public final String getUserId() {
        return this.d;
    }

    public int hashCode() {
        return this.f61i.hashCode() + b0.a(this.h, b0.a(this.g, z.a(this.f, z.a(this.e, b0.a(this.d, this.c.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() {
        return StringsKt.trimIndent("\n            {\n                \"unitId\": \"" + this.c + "\",\n                \"userId\": \"" + this.d + "\",\n                \"result\": " + this.e + ",\n                \"code\": " + this.f + ",\n                \"message\": \"" + this.g + "\",\n                \"clientTitle\": \"" + this.h + "\",\n                \"clientMessage\": \"" + this.f61i + "\"\n            }\n        ");
    }

    public String toString() {
        return "OfferwallView(unitId=" + this.c + ", userId=" + this.d + ", result=" + this.e + ", code=" + this.f + ", message=" + this.g + ", clientTitle=" + this.h + ", clientMessage=" + this.f61i + ")";
    }
}
