package com.tnkfactory.ad.tnkassert;

import com.tnkfactory.ad.a.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OfferwallViewClose extends AssertData {
    public final String c;
    public final long d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallViewClose(@NotNull String str, long j, @NotNull String str2) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.c = str;
        this.d = j;
        this.e = str2;
    }

    public static /* synthetic */ OfferwallViewClose copy$default(OfferwallViewClose offerwallViewClose, String str, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offerwallViewClose.c;
        }
        if ((i2 & 2) != 0) {
            j = offerwallViewClose.d;
        }
        if ((i2 & 4) != 0) {
            str2 = offerwallViewClose.e;
        }
        return offerwallViewClose.copy(str, j, str2);
    }

    public final String component1() {
        return this.c;
    }

    public final long component2() {
        return this.d;
    }

    public final String component3() {
        return this.e;
    }

    public final OfferwallViewClose copy(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OfferwallViewClose(str, j, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferwallViewClose)) {
            return false;
        }
        OfferwallViewClose offerwallViewClose = (OfferwallViewClose) obj;
        return Intrinsics.areEqual(this.c, offerwallViewClose.c) && this.d == offerwallViewClose.d && Intrinsics.areEqual(this.e, offerwallViewClose.e);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        return "offerwallviewclose";
    }

    public final long getOfferwallRuntime() {
        return this.d;
    }

    public final String getUnitId() {
        return this.e;
    }

    public final String getUserId() {
        return this.c;
    }

    public int hashCode() {
        return this.e.hashCode() + a0.a(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() {
        return StringsKt.trimIndent("\n            {\n                \"userId\": \"" + this.c + "\",\n                \"offerwallRuntime\": " + this.d + ",\n                \"unitId\": \"" + this.e + "\"\n            }\n        ");
    }

    public String toString() {
        return "OfferwallViewClose(userId=" + this.c + ", offerwallRuntime=" + this.d + ", unitId=" + this.e + ")";
    }
}
